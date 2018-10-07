package com.se.state;

public class Document {
	private String keys_generated;
	private boolean reports;
	private String history ;
	private State state = State.IDLE;

	public Document(string history) {
		super();
		this.history = history;
	}

	public void apply_for_keys() {
		if (this.getState().equals(State.IDLE) {
			System.out.println("You have applied for keys");
			setkeys_generated("yes");
			setState(State.GENERATING_KEYS);
		}
	}
	
		public void generated() {
		if (this.getState().equals(State.GENERATING_KEYS) {
			System.out.println("SENDING_KEYS");
			setState(State.SENDING_KEYS);
		}
		
	}

		public void received() {
		if (this.getState().equals(State.SENDING_KEYS) {
			System.out.println("KEYS_RECEIVED");
			setState(State.KEYS_RECEIVED);
			setState(State.IDLE);
			setkeys_generated("yes");
			
		}
	}
	public void arrives_hospital() {
		if (this.getState().equals(State.IDLE) {
			if(history =="no"){
				setState(State.MEDICAL_CHECKUP);
				System.out.println(MEDICAL_CHECKUP);
			}
			else
			{
				setState(State.UPLOADING_RECORDS);
				System.out.println("UPLOADING_RECORDS");
			}
		
		}
		
		public void checkup_over() {
		if (this.getState().equals(State.MEDICAL_CHECKUP) {
			System.out.println("UNDERTAKING_TESTS");
			setState(State.UNDERTAKING_TESTS);
		}
		
		public void tests_done() {
		if (this.getState().equals(State.UNDERTAKING_TESTS) {
			System.out.println("GENERATING_REPORTS");
			setState(State.GENERATING_REPORTS);
			reports =true;
		}
		public void reports_generated() {
		if (this.getState().equals(State.GENERATING_REPORTS) {
			System.out.println("UPLOADING_RECORDS");
			setState(State.UPLOADING_RECORDS);
		}
		public void upload_finished() {
		if (this.getState().equals(State.UPLOADING_RECORDS) {
			System.out.println("You can now apply for policy");
			setState(State.IDLE);
		}
		
		public void apply() {
		if (this.getState().equals(State.IDLE) {
			if( reports &&  keys_generated =="yes")
			setState(State.APPLYING_FOR_POLICY);
			System.out.println("APPLYING_FOR_POLICY");
			
			
		}
	}
	
			public void application_received() {
		if (this.getState().equals(State.APPLYING_FOR_POLICY) {
			System.out.println("ACCESSING_RECORDS_AND_GIVING_QUOTES");
			setState(State.ACCESSING_RECORDS_AND_GIVING_QUOTES);
			
			
		}
	}
	
			public void quotation_received() {
		if (this.getState().equals(State.ACCESSING_RECORDS_AND_GIVING_QUOTES) {
			System.out.println("CHOOSE_TO_ACCEPT");
			setState(State.CHOOSE_TO_ACCEPT);
			
		}
	}
			public void reject() {
		if (this.getState().equals(State.CHOOSE_TO_ACCEPT) {
			setState(State.REJECT);
			System.out.println("You have REJECTED");
						
		}
	}
	
	public void confirm() {
		if (this.getState().equals(State.CHOOSE_TO_ACCEPT) {
			System.out.println("PAYING_PREMIUM");
			setState(State.PAYING_PREMIUM);
					
		}
	
	public void claim() {
		if (this.getState().equals(State.PAYING_PREMIUM) {
			System.out.println("executing smart contract");
			System.out.println(CLAIM_PROCESSED);
			setState(State.CLAIM_PROCESSED);
					
		}

	public String getkeys_generated() {
		return keys_generated;
	}

	public void setkeys_generated(String keys_generated) {
		this.keys_generated = keys_generated;
	}
	
	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

}
