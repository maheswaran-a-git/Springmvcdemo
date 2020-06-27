package com.pre.hibmodel;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.validation.constraints.NotNull;



@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "biketype")
public class Bike {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long bikeid;
	@NotNull(message = "please enter bike name")
	private String bikename;
	@NotNull(message = "please enter manufacturer")
	private String manufacturer;
	@NotNull(message = "please enter engine capacity")
	private String enginecapacity;
	@NotNull(message = "please enter Front break type")
	private String breaktypeFront;
	@NotNull(message = "please enter Rear break type")
	private String breaktypeRear;
	@NotNull(message = "please enter availability status")
	private boolean availabilityStatus;
	
	public Bike() {
		
	}

	public Bike(@NotNull(message = "please enter bike name") String bikename,
			@NotNull(message = "please enter manufacturer") String manufacturer,
			@NotNull(message = "please enter engine capacity") String enginecapacity,
			@NotNull(message = "please enter Front break type") String breaktypeFront,
			@NotNull(message = "please enter Rear break type") String breaktypeRear,
			@NotNull(message = "please enter availability status") boolean availabilityStatus) {

		this.bikename = bikename;
		this.manufacturer = manufacturer;
		this.enginecapacity = enginecapacity;
		this.breaktypeFront = breaktypeFront;
		this.breaktypeRear = breaktypeRear;
		this.availabilityStatus = availabilityStatus;
	}

}
