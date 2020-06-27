package com.pre.hibmodel;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;



@Entity
@DiscriminatorValue("Moped")
public class MopedBike extends Bike {

	public MopedBike() {
		
	}
	
	public MopedBike(@NotNull(message = "please enter bike name") String bikename,
			@NotNull(message = "please enter manufacturer") String manufacturer,
			@NotNull(message = "please enter engine capacity") String enginecapacity,
			@NotNull(message = "please enter Front break type") String breaktypeFront,
			@NotNull(message = "please enter Rear break type") String breaktypeRear,
			@NotNull(message = "please enter availability status") boolean availabilityStatus) {
		super(bikename, manufacturer, enginecapacity, breaktypeFront, breaktypeRear, availabilityStatus);
		// TODO Auto-generated constructor stub
	}
	
}
