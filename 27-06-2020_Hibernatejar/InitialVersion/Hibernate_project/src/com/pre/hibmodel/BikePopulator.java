package com.pre.hibmodel;

import java.util.ArrayList;
import java.util.List;

public class BikePopulator {
	
	public static List<Bike> produceBike(){
		List<Bike> listBike = new ArrayList<>();
		listBike.add(new MopedBike("Activa","Honda","80CC","Drum break","Drum break",true));
		listBike.add(new MopedBike("Ray","Yamaha","75CC","Disc break","Drum break",true));
		listBike.add(new GearBike("FZS V2.0","Yamaha","149CC","Disc break","Drum break",true,true,true, 5));
		listBike.add(new GearBike("R15 3.0","Yamaha","155CC","Disc break","Disc break",true,true,true, 6));
		listBike.add(new GearBike("Pulsar","Bajaj","150CC","Disc break","Disc break",true,true,true, 5));
		return listBike;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	}

}
