package com.mli.matrix.proposal.exception;

import java.util.Date;

import org.jboss.logging.MDC;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.mli.matrix.proposal.models.ErrorResponse;
import com.mli.matrix.proposal.models.OutputResponse;
import com.mli.matrix.proposal.models.Response;

/**
 * The global exception handler class which handles the exceptions arising in
 * application and gives the response containing relevant error message to the
 * client request
 */

@ControllerAdvice
public class CentralizedExceptionHandler extends ResponseEntityExceptionHandler {

	Logger logger = LoggerFactory.getLogger(CentralizedExceptionHandler.class);

	// this method handles the BaseException thrown in application
	@ExceptionHandler(UserHandledException.class)
	public ResponseEntity<OutputResponse> handleBaseExceptions(UserHandledException exception) {

		logger.debug("Exception object {} for request {}", exception, MDC.get("requestId"));
		logger.error("error occurred in serving request {}", MDC.get("requestId"));

		ErrorResponse errorResponse = new ErrorResponse(new Date(), exception.getHttpstatus().value(),
				exception.getErrorMessages());

		exception.getResponse().setErrorResponse(errorResponse);
		Response response = exception.getResponse();
		OutputResponse outputResponse = new OutputResponse();
		outputResponse.setResponse(response);
		logger.error("Response object {} for request {}", outputResponse, MDC.get("requestId"));
		return new ResponseEntity<>(outputResponse, exception.getHttpstatus());
	}
}