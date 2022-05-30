/**
 * <p>
 * <strong> Prototype Pattern </strong>
 * 
 * <p>
 * Prototype design pattern is used when very similar objects frequently are required. Prototype pattern clones objects
 * and set the changed feature. This way less resources are consumed.
 * 
 * <p>
 * It allows an object to create customized objects without knowing their class or any details of how to create them. Up
 * to this point it sounds a lot like the Factory Method pattern, the difference being the fact that for the Factory the
 * palette of prototypical objects never contains more than one object.
 * 
 * <p>
 * Cloning can be done in two ways Shallow Cloning or Deep Cloning.
 * 
 * <p>
 * Shallow cloning is a bit-wise copy of an object. A new object is created that has an exact copy of the values in the
 * original object. If any of the fields of the object are references to other objects, just the reference addresses are
 * copied i.e., only the memory address is copied.
 * 
 * <p>
 * A deep cloning copies all fields, and makes copies of dynamically allocated memory pointed to by the fields. A deep
 * copy occurs when an object is copied along with the objects to which it refers.
 * 
 * <p>
 * Ways to implement Deep Cloning.
 * 
 * <p>
 * 1. Create object of cloned class with contained objects and set the dependencies.
 * 
 * <p>
 * 2. Implement Cloneable interface in all reference objects and override clone method. We implemented this way in
 * example.
 * 
 * <p>
 * 3. Using Serialization. It writes out the whole object graph into a persistent store and read it back
 * when needed, which means you will get a copy of the whole object graph when you read it back. This is exactly what
 * you want when you deep copy an object. Note, when you deep copy through serialization, you should make sure that all
 * classes in the object's graph are serializable.
 * 
 * @author pankiba
 * 
 */
package com.pankiba.designpatterns.creational.prototype;