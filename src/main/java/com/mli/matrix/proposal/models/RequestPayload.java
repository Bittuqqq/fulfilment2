package com.mli.matrix.proposal.models;

public class RequestPayload {
	private ProposalDetails proposalDetails;

	public RequestPayload() {

	}

	public RequestPayload(ProposalDetails proposalDetails) {
		super();
		this.proposalDetails = proposalDetails;
	}

	public ProposalDetails getProposalDetails() {
		return proposalDetails;
	}

	public void setProposalDetails(ProposalDetails proposalDetails) {
		this.proposalDetails = proposalDetails;
	}

	@Override
	public String toString() {
		return "RequestPayload [proposalDetails=" + proposalDetails + "]";
	}
}