package com.mli.matrix.proposal.service;

import com.mli.matrix.proposal.exception.UserHandledException;

public interface SequenceService {
	
	long getNextSequenceId(String key) throws UserHandledException;
	
}