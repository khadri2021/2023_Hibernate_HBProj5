package com.khadri.hibernate.uuid;

import java.util.UUID;

public class Adhaar {

	private UUID adharNumber;
	private String citizenName;

	public UUID getAdharNumber() {
		return adharNumber;
	}

	public void setAdharNumber(UUID adharNumber) {
		this.adharNumber = adharNumber;
	}

	public String getCitizenName() {
		return citizenName;
	}

	public void setCitizenName(String citizenName) {
		this.citizenName = citizenName;
	}

}
