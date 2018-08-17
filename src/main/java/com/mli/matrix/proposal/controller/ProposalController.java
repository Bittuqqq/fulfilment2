package com.mli.matrix.proposal.controller;

import java.util.ArrayList;
import java.util.List;

import org.jboss.logging.MDC;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mli.matrix.proposal.models.Response;
import com.mli.matrix.proposal.models.ResponseData;
import com.mli.matrix.proposal.models.ResponsePayload;
import com.mli.matrix.proposal.exception.UserHandledException;
import com.mli.matrix.proposal.exception.ErrorMessageConfig;
import com.mli.matrix.proposal.models.InputRequest;
import com.mli.matrix.proposal.models.OutputResponse;
import com.mli.matrix.proposal.models.ProposalDetails;
import com.mli.matrix.proposal.service.ProposalService;

@RestController
@RequestMapping(path = "/fulfillment/api/proposalservices")
public class ProposalController {

	@Autowired
	private ProposalService proposalService;

	@Autowired
	private ErrorMessageConfig errorMessageConfig;
	
	private Logger logger = LoggerFactory.getLogger(ProposalController.class);
	private List<String> errorMessages;
	private List<Object> message;

	@PostMapping(path = "/saveproposaldata")
	public OutputResponse saveProposalForm(@RequestBody InputRequest inputRequest) throws UserHandledException {

		OutputResponse outputResponse = new OutputResponse();
		Response response = new Response();
		ResponseData responseData = new ResponseData();
		ResponsePayload responsePayload = new ResponsePayload();

		long requestedTime = System.currentTimeMillis();

		logger.info("Request with requestId {} is being processed", MDC.get("requestId"));
		logger.debug("Request Object {}", inputRequest);

		try {
			ProposalDetails proposalDetails = inputRequest.getRequest().getRequestData().getRequestPayload()
					.getProposalDetails();
			message = proposalService.saveProposalDetail(proposalDetails);
		}

		catch (Exception e) {
			logger.error("Error occurred for request object {}", inputRequest);
			errorMessages = new ArrayList<String>();
			errorMessages.add(errorMessageConfig.getErrorMessages().get("badRequest"));
			throw new UserHandledException(response, errorMessages, HttpStatus.BAD_REQUEST);
		}

		response.setMetadata(inputRequest.getRequest().getMetadata());
		responsePayload.setMessage(message);
		responseData.setResponsePayload(responsePayload);
		response.setResponseData(responseData);
		outputResponse.setResponse(response);

		long processingTime = System.currentTimeMillis();
		long processedTime = (processingTime - requestedTime) / 1000;
		logger.info("Time {} took to process the request {}", processedTime, MDC.get("requestId"));
		logger.debug("Response object {} of requestId {}", outputResponse, MDC.get("requestId"));

		return outputResponse;
	}
	
	@GetMapping(path = "")
	public Object healthCheck() {
		String healthMessage = "Server is running";
		message = new ArrayList<>();
		message.add(healthMessage);
		return message;
	}
}