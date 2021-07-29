package com.java.design.patterns.template;
/**
 * It's the most simple pattern. It's same as Abstract class.
 * 
 * In many frameworks, a significant portion of the code is boilerplate code.

For example, when executing a query on a database, the same series of steps must be completed:

Establish a connection
Execute query
Perform cleanup
Close the connection
These steps are an ideal scenario for the template method pattern.

The template method pattern is a technique that defines the steps required for some action, implementing the boilerplate steps, 
and leaving the customizable steps as abstract. Subclasses can then implement this abstract class and provide a concrete implementation 
for the missing steps.

Simply - The overall concept of using Abstract classed in java is to provide the known functionality before hand. Or for keeping
the common functionality implementation into the abstract class, so that it could not be different in different implementing concrete
implementations.
 * */
public class TempalatePatern {

}
