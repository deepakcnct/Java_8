package com.java.design.patterns.builder;

import java.util.Set;

/**
 * This is a perfect example of builder pattern.
 * */
public class BuilderLombokImpl {
	private long created;
	private String name;
	private int age;
	private Set<String> occupations;

	BuilderLombokImpl(long created, String name, int age, Set<String> occupations) {
		this.created = created;
		this.name = name;
		this.age = age;
		this.occupations = occupations;
	}

	public static BuilderExampleBuilder builder() {
		return new BuilderExampleBuilder();
	}
	
	
	@Override
	public String toString() {
		return "BuilderLombokImpl [created=" + created + ", name=" + name + ", age=" + age + ", occupations="
				+ occupations + "]";
	}


	public static class BuilderExampleBuilder {
		private long created;
		private String name;
		private int age;
		private Set<String> occupations;

		
		//This is Lombok setter without set to look more fancier or may be to follow builder naming convention.
//		public BuilderExampleBuilder created(long created) {
//			this.created = created;
//			return this;
//		}
//
//		public BuilderExampleBuilder name(String name) {
//			this.name = name;
//			return this;
//		}
//
//		public BuilderExampleBuilder age(int age) {
//			this.age = age;
//			return this;
//		}
//
//		public BuilderExampleBuilder occupations(Set<String> occupations) {
//			this.occupations = occupations;
//			return this;
//		}
//		public String toString() {
//			return "BuilderExample.BuilderExampleBuilder(created=" + this.created + ", name=" + this.name + ", age="
//					+ this.age + ", occupations=" + this.occupations + ")";
//		}
		
		/**These are all noraml setters with minor difference. Changed return type to static class type and return this.
		 * This is normal setter
		 * */
		public BuilderExampleBuilder setCreated(long created) {
			this.created = created;
			return this;
		}

		public BuilderExampleBuilder setName(String name) {
			this.name = name;
			return this;
		}

		public BuilderExampleBuilder setAge(int age) {
			this.age = age;
			return this;
		}

		public BuilderExampleBuilder setOccupations(Set<String> occupations) {
			this.occupations = occupations;
			return this;
		}

		public BuilderLombokImpl build() {
			return new BuilderLombokImpl(this.created, this.name, this.age, this.occupations);
		}
	
	}

	public static void main(String[] args) {
		//This is Lombok setter without set to look more fancier or may be to follow builder naming convention.
//		BuilderLombokImpl build = BuilderLombokImpl.builder().name("Hello").age(30).build();
		//This is normal setter
		BuilderLombokImpl build = BuilderLombokImpl.builder().setName("Hello").setAge(30).build();

		System.out.println(build);
	}
}
