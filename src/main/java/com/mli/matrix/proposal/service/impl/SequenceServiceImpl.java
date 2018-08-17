package com.mli.matrix.proposal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.mli.matrix.proposal.exception.UserHandledException;
import com.mli.matrix.proposal.models.SequenceId;
import com.mli.matrix.proposal.service.SequenceService;

@Service
public class SequenceServiceImpl implements SequenceService {

	@Autowired
	MongoOperations mongoOperation;

	@Override
	public long getNextSequenceId(String key) throws UserHandledException {
		
		Query query = new Query(Criteria.where("_id").is(key));

		Update update = new Update();
		update.inc("sequence", 1);

		FindAndModifyOptions options = new FindAndModifyOptions();
		options.returnNew(true);

		SequenceId sequenceId = mongoOperation.findAndModify(query, update, SequenceId.class);
		if (sequenceId == null) {
			throw new UserHandledException();
		}
		return sequenceId.getSequence();
	}
}