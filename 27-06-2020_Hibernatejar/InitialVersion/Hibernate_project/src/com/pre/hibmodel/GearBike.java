package com.pre.hibmodel;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;



@Entity
@DiscriminatorValue("Gear Bike")
public class GearBike extends Bike {

	boolean selfstart, kicker;
	int no_of_gears;
	
	public GearBike() {
		
	}
	
	public GearBike(@NotNull(message = "please enter bike name") String bikename,
			@NotNull(message = "please enter manufacturer") String manufacturer,
			@NotNull(message = "please enter engine capacity") String enginecapacity,
			@NotNull(message = "please enter Front break type") String breaktypeFront,
			@NotNull(message = "please enter Rear break type") String breaktypeRear,
			@NotNull(message = "please enter availability status") boolean availabilityStatus, boolean selfstart,
			boolean kicker, int no_of_gears) {
		super(bikename, manufacturer, enginecapacity, breaktypeFront, breaktypeRear, availabilityStatus);
		this.selfstart = selfstart;
		this.kicker = kicker;
		this.no_of_gears = no_of_gears;
	}

	

}
