1. Did you get an error executing the getArea() method? Yes/No why? If yes, fix it and explain why your solution will work.
Yes because there is no method getArea() in the abstract class Shape. You must implement the abstract method getArea() in Shape.
2. Try instantiating an object as an instance of the abstract class Shape. Did you get an error? Yes/No why?
Yes because constructors of abstract classes cannot be used to instantiate objects.
3. Now with the abstract implementing the interface, try to comment the methods getArea() in the class Shape and Rectangle: What happened?
There is an error because the method getArea() is in the interface and must be implemented.
4. If you uncomment the getArea on Rectangle and leave it commented on Shape. Does it work? Yes/No? Explain.
Yes because getArea() is already in the interface.