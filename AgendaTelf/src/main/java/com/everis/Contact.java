package com.everis;

import java.util.List;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Contact {
	
	
	
	private String name;
	private String surname;
	private Set<String> telephonesSet;
	private List<String> telephoneList;
	

}
