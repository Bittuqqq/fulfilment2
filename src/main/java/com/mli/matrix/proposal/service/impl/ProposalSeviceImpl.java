package com.mli.matrix.proposal.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jboss.logging.MDC;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mli.matrix.proposal.controller.ProposalController;
import com.mli.matrix.proposal.exception.UserHandledException;
import com.mli.matrix.proposal.models.ProposalDetails;
import com.mli.matrix.proposal.repository.ProposalRepository;
import com.mli.matrix.proposal.service.ProposalService;
import com.mli.matrix.proposal.service.SequenceService;

@Service
public class ProposalSeviceImpl implements ProposalService {

	private static final String SEQUENCE_KEY = "transactionId";

	private Logger logger = LoggerFactory.getLogger(ProposalController.class);

	@Autowired
	private SequenceService sequenceService;

	@Autowired
	private ProposalRepository proposalRepository;

	public List<Object> saveProposalDetail(ProposalDetails proposalDetails) throws UserHandledException {

		List<Object> message = new ArrayList<>();
		Map<String, Object> saveMessage = new HashMap<>();
		logger.info("Saving the proposal data of request {} with proposalNumber {}", MDC.get("requestId"),
				proposalDetails.getId());
		if (proposalDetails.getId() == null) {
			saveMessage.put("msgDetail", "Saved Successfully");
		} else {
			saveMessage.put("msgDetail", "Updated Successfully");
		}
		try {
			if (proposalDetails.getTransactionId() == 0L) {
				proposalDetails.setTransactionId(sequenceService.getNextSequenceId(SEQUENCE_KEY));
			}
			proposalRepository.save(proposalDetails);
		} catch (Exception e) {
			throw new UserHandledException();
		}
		saveMessage.put("id", proposalDetails.getId());
		saveMessage.put("transactionId", proposalDetails.getTransactionId());
		message.add(saveMessage);
		return message;
	}
}