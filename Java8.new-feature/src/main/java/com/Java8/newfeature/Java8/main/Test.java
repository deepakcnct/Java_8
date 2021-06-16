package com.Java8.newfeature.Java8.main;

import com.Java8.newfeature.Java8.dblayer.DbLayer;
import com.Java8.newfeature.Java8.streams.ParalellStreamDemo;
import com.Java8.newfeature.Java8.streams.StreamApis;

public class Test {

	public static void main(String[] args) {

		
		DbLayer dbLayer = new DbLayer();
		StreamApis test = new StreamApis(dbLayer);
				
//		test.testMap();		
//		test.testFlatMap();	
//		test.testPureOptionalWithoutStream();
		
//		test.testOptionalwithStream();
		
//		test.testMapReduce();
		
		
		ParalellStreamDemo paralellStreamDemo = new ParalellStreamDemo();
//		paralellStreamDemo.testParallelStream();
		
//		Comparator<Customer> compare = new Comparator<Customer> () {
//
//			@Override
//			public int compare(Customer o1, Customer o2) {
//				
//				return o1.getName().compareTo(o2.getName());
//			}
//			
//		};
		

//		List<Customer> allCustomer = dbLayer.getAllCustomer();
////		allCustomer.stream().forEach(System.out::println);
//		Collections.sort(allCustomer,(o1,o2) -> o1.getId() - o2.getId());
//		
//		allCustomer.stream().forEach(System.out::println);
		
//			CompareObjects compareObjects = new CompareObjects();
//			compareObjects.sortUsingTreeMap();
//			compareObjects.sortUsingTreeMapButWithObjectsAsKey();
		
//		test.sortMapUsingTraditionalApproach();
		test.sortMapUsingStreamApi();
		
		
	}

}
