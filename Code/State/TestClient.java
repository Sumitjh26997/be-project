package com.se.state;

public class TestClient {

	public static void main(String[] args) {
		Document doc1 = new Document("no"); //status of medical history is passed
		
		doc1.apply_for_keys();
		doc1.generated();
		doc1.received();
		doc1.arrives_hospital();
		doc1.checkup_over();
		doc1.tests_done();
		doc1.reports_generated();
		doc1.upload_finished();
		doc1.apply();
		doc1.application_received();
		doc1.quotation_received(); 
		doc1.confirm();
		claim(); 

	}

}
