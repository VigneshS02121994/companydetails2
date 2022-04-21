package org.company;

import org.client.Client;

public class Company extends Client {
	public void companyName() {
		System.out.println("Company name is Eastman");
		}
	public static void main(String[] args) {
		Company l = new Company();
		l.companyName();
		l.clientName();
	}

}
