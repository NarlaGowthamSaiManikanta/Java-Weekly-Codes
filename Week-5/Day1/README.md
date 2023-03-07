# week5_day1_ques1.java

Write a program to make "Employee" class consisting of following: -- instance variables --> id & age -- a parameterized constructor to initialize both instance variables.

Create array of "n" Employee objects (where "n" is no. of objects specified by user at run-time) and display the id and age of those employees whose age is less than 30.

Input Format

Program should take the inputs in following sequence: 1) In First input line, no. of Employee objects to create. i.e. value of "n". 2) In remaining input lines, enter id and age values of "n" Employee objects. For example, if no. of Employee-objects to be created are 2, then user-inputs should be as follows: 2 202 31 100 20

Constraints

1) No. of Employee objects range between 1 to 10, i.e. 1 <= n <= 10

2) All id & age values should be positive and range between: 10 <= id <= 1000 ; 18 <= age <= 50

Output Format

If no. of Employee-objects "n" is less than 1, then "Invalid input" should be displayed and no other input should be taken.

If any input value for id & age goes out-of-range (specified in constraints), then display "Invalid data" as overall output. Otherwise, display the id and age of those employees whose age is less than 30, such as follows: 100 20

Sample Input 0

2

202 31

100 20

Sample Output 0

100 20


# week5_day1_ques2.java 

Mehar's teacher taught her ascending and descending order. In order to test the clarity of the same concept she gave her an array of elements that contained N numbers. Help Mehar by developing the program for the same. The program ask for two choices, i.e to print ascending order or descending order. The program should print ascending order on entering 1 and descending order on entering 2. If duplicate elements exist in an array then it should only print once in the output.

Input Format

Number of elements in an array,N

Elements of an array

Enter one choice out of two(1 or 2)

Constraints

N should not be less than 5 and greater than 15.

Output Format

Sorted array depending on the choice

Sample Input 0

7

12 3 4 5 7 8 3

1

Sample Output 0

3 4 5 7 8 12

Sample Input 1

4

Sample Output 1

Invalid
