package com.mli.matrix.proposal.service;

import java.util.List;

import com.mli.matrix.proposal.exception.UserHandledException;
import com.mli.matrix.proposal.models.ProposalDetails;

public interface ProposalService {
	List<Object> saveProposalDetail(ProposalDetails proposalDetails) throws UserHandledException;
}