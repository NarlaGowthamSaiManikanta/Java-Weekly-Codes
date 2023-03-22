# Week1_Day3_Question1.java

During the code-based test of Java, Peter has been assigned a task to implement a class which reads the Account Number(Long), Account Holder Name(String), Gender (M/F) (Character) and Amount (Integer) to be withdrawn at runtime.

Given that the Current Account Balance is 20000, it is expected to perform the withdrawl if amount to be withdrawn is less than or equal to 20000 and message to be displayed is:

Hi Mr./Ms. XXX! Your Account Balance after withdrawl is YYYYY.

If the amount to be withdrawn is greater than the Current Account Balance, then the message displayed is:

Hi Mr./Ms. XXX! Insufficient Funds! You can not withdraw AAAAA.

Input Format

First line reads Account Number

Second line reads Account Holder Name

Third line reads Gender

Fourth line reads Amount to be withdrawn

Constraints

Account Number is a 10 digit number

Output Format

**Hi Mr./Ms. XXX!

Your Account Balance after withdrawl is YYYYY.**

Sample Input 0

1234567891

Aman Aggrawal

M

5000

Sample Output 0

Hi Mr. Aman Aggrawal!

Your Account Balance after withdrawl is 15000.

Sample Input 1

1234567899

Chandani

F

25000

Sample Output 1

Hi Ms. Chandani!

Insufficient Funds! You can not withdraw 25000.

# Week1_Day3_Question2.java

Alex has got a Mathematical assignment where he has to find whether a given integer N is a Perfect Cube or not.Write a Java program solution to help Alex

Input Format

First line will contain an integer N

Constraints

N>1 & N<1000

Output Format

return "Perfect Cube" If given integer is a perfect Cube or "Not Perfect Cube" incase it is not

Sample Input 0

125

Sample Output 0

Perfect Cube

Sample Input 1

515

Sample Output 1

Not Perfect Cube
