package com.mli.matrix.proposal.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mli.matrix.proposal.models.ProposalDetails;

public interface ProposalRepository extends MongoRepository<ProposalDetails, String> {
	
	List<ProposalDetails> findBySourcingDetailsAgentId(String agentId);
	
}