/**
 * <strong> Factory Method </strong>
 * 
 * <p>
 * Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method lets
 * a class defer instantiation to subclasses.
 * 
 * <p>
 * <strong> Participants </strong>
 * <p>
 * <ul>
 * <li>Product (Vehicle) :- Defines the interface of objects the factory method creates.</li>
 * <li>ConcreteProduct (MotorCycle, Car) :- Implements the product interface.</li>
 * <li>Creator (VehicleFactory) :- Declares the factory method, which returns an object of type Product. Creator may
 * also define a default implementation of the factory method that returns a default ConcreteProduct object.</li>
 * <li>ConcreteCreator (CarFactory, MotorCycleFactory) :- Overrides the factory method to return an instance of a
 * ConcreteProduct</li>
 * </ul>
 * 
 * <p>
 * <strong> Collaborations </strong>
 * <ul>
 * <li>Creator relies on its subclasses to define the factory method so that it returns an instance of the appropriate
 * ConcreteProduct.</li>
 * </ul>
 * 
 * <p>
 * 
 * @author pankiba
 * 
 */
package com.pankiba.designpatterns.creational.factorymethod;