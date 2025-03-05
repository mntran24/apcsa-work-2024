Naomi Steinmetz and Mai Tran

We have to implement a class Point, which fields represent a 2D coordinate (x, y). Let's think about the class design.

   How many instance variable are needed? Private or Public?

   Two instance variables, x and y, are needed. They should be private.

   What constructors should be needed?

   Three constructors should be needed. There would be Point(int xcor, int ycor), the default (Point(), where the default for the instance variables would be 0 for both x and y), and a third constructor (Point(int cor), where both x and y would be set to cor).

   What methods do you think should be needed?

   point1.distanceTo(point2)
   Point.distance(point1, point2)

   Would it be possible to make the Point class immutable? If so, how?

   The Point class can be made immutable by making the class final, all instance variables should be final and private, and there should be no setter methods.
