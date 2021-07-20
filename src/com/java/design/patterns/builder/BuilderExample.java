package com.java.design.patterns.builder;

import java.util.Set;

import lombok.Builder;

/**
 * Please check BuilderLombokImpl class for actual implementation for this.
 * Also to get an example for builder pattern.
 * 
 * */
@Builder
public class BuilderExample {
	private long created;
	private String name;
	private int age;
	private Set<String> occupations;
}