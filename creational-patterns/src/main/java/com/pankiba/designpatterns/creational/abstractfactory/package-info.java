/**
 * <strong> Abstract Factory </strong>
 * 
 * <p>
 * Abstract Factory pattern adds another layer of abstraction for Factory pattern. If we compare Abstract Factory with
 * Factory, it is pretty obvious that a new layer of abstraction is added. Abstract Factory is a super-factory which
 * creates other factories. We can call it "Factory of factories".
 * 
 * <p>
 * Abstract Factory offers the interface for creating a family of related objects, without explicitly specifying their
 * classes
 * 
 * <p>
 * <strong> Participants </strong>
 * <p>
 * <ul>
 * <li>AbstractFactory (VehicleFactory) :- declares an interface for operations that create abstract product objects.</li>
 * <li>ConcreteFactory (HondaFactory, ToyotaFactory) :- implements the operations to create concrete product objects.</li>
 * <li>AbstractProduct (Car, MotorCycle) :- declares an interface for a type of product object.</li>
 * <li>ConcreteProduct (HondaCar, HondaMotorCycle, ToyotaCar, ToyotaMotorCycle) :- defines a product object to be
 * created by the corresponding concrete factory. Implements the AbstractProduct interface</li>
 * </ul>
 * 
 * <strong> Collaborations </strong>
 * <ul>
 * <li>Normally a single instance of a ConcreteFactory class is created at run-time. This concrete factory creates
 * product objects having a particular implementation. To create different product objects, clients should use a
 * different concrete factory.</li>
 * <li>AbstractFactory defers creation of product objects to its ConcreteFactory subclass.</li>
 * </ul>
 * 
 * <p>
 * 
 * @author pankiba
 * 
 */
package com.pankiba.designpatterns.creational.abstractfactory;