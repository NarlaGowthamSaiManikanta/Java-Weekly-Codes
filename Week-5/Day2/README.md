# Week5_Day2_Question1.java

My son Priyanshu got an assignment from his teacher to perform multiplication of complex number. Help him to complete his assignment. 
Write a java code with following features:

class Name: Complex

Instance Variable: real, imaginary (int type)

Constructor:  1. Complex() 2. Complex(int, int)

Instance Method: 1. Mul_Complex(Complex, Complex) 2. Display() 

Read the real and imaginary from user and pass to the constructor as parameter Write a separate class Test_Complex with a main() method and test the Complex class methods

Input Format

First line Read the complex number 1 for real and imaginary First line Read the complex number 2 for real and imaginary

Constraints

real, imaginary > 1

Output Format

Print the Result in form of complex number : a+bi

Sample Input 0

2 3

4 5

Sample Output 0

-7+22i

Sample Input 1

0 1

2 3

Sample Output 1

-3+2i

Sample Input 2

2

4 2

Sample Output 2

8+4i


# Week5_Day2_Question2.java

Write a program to make "Circle" class consisting of following: -- radius --> of double datatype -- parameterized constructor to initialize radius variable -- getArea() --> returns area of Circle of double datatype (formula: 3.14 * radius * radius)
Create array of "n" Circle objects (where "n" is no. of objects specified by user at run-time) and display the area of those Circle-objects whose area is greater than 30.0.

Input Format

Program should take the inputs in following sequence: 1) In First input line, no. of circle objects to create. i.e. value of "n". 2) In remaining input lines, enter radius value of "n" Circle objects. For example, if no. of Circle-objects to be created are 2, then user-inputs should be as follows: 2 3.2 2.5

Constraints

1) No. of Circle objects range between 1 to 10, i.e. 1 <= n <= 10 2) All radius value should be positive, i.e. 0.1 <= radius <= 50.0

Output Format

If no. of Circle-objects "n" is less than 1, then "Invalid input" should be displayed and no other input should be taken. Treat any negative value of radius as 0.0 and then display area of all those circle objects with value greater than 30.0, such as follows: 32.1536

Sample Input 0

2

3.2

2.5

Sample Output 0

32.1536
