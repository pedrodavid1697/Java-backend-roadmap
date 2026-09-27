# Day 1

## What did I learn?
-> Today, I learned Java and it's type and functioning. JRE, JVM, Java Compiler. We write code in (.java) file. 

## What is JVM?
-> JVM is an Java virtual machine. Java's compiler converts code into bytes and JVM executes that byte code. 

## What is JDK?
-> JDK is stands for Java development kit which uses to build application using java codes, libraries, jvm, etc. 

## What is JRE?
-> Java Runtime Environment, it uses to run application strictly including JVM + Java libraries. 

## What does javac do?
-> Javac uses to compile the program. 

## What does java do?
-> Runs byte code using JVM. Java command starts the JVM and tells it to run your compiled Java program.
Java = Run
JavaC = build/compile

## What is main()?
-> main() is where our basic Java application starts executing. 

## What does System.out.println() do?
-> It Prints text to the console. 

## What confused me?
-> Git repo, Git commit, Git Push. 

## What error did I encounter?
-> Git pushing error due to multiple local commits waiting to be pushed. 

## How did I solve it?
-> git push origin main  : ) it helps pusing commit to main directory or branch. 
One more, issue was there when I created file in GitHub and tried to commit through local machine. During that time, I had an error of it asking data should be merged between local and GitHub. So, I did using IDE option bar under Git option while pushing it asked for merging containing multiple option as:- 
1. Your data
2. Their data 

- I opted for your data as their data uses for application versioning. 


# Day 2

## Before we consider Day 2 complete, I want you to be able to answer these without looking back:

## What is a variable?
-> declaring data types. 

## What is the difference between declaration and initialization?
-> declaration: Where we declare data types of variable. 
-> intialization: Where we assign values to variable.

## Name the 8 primitive data types.
-> 1.Byte, 2.Short, 3.Integer, 4.Long, 5.Float, 6.Double, 7.Boolean, 8.Char

## Is String primitive or reference type?
-> String is reference type because it calls object references. 

## What's the difference between = and ==?
-> = means assigns, == comparison. 

## What does % do?
-> % module use to provide remainder after division. 

## Why does 10 / 3 produce 3 when both are int?
-> 10/3 gives 3 because quotient will be 3.1 after complete division and both data types are int. Integer only stores real numbers. for that we would need to declare float/double data type.

## What is widening conversion?
-> Whenever we convert a data type to another data type as :- 
int age = 25; // age = 25
double price = age; // price 25.0

## What is narrowing conversion?
-> for converting data type from one another as :- 
double percentage = 25.0; // percentage = 25.0
int age = int(percentage); // age = 25

## Why do we write (int) in (int) 99.99?
-> int use to indicate data type and (int) 99.99 gives 99 decimal values goes away because of narrowing conversion. 

# Day 3

## What did I learn?
-> Condtitions:- if, if else, else, nested conditions, Multiple conditions. 

## Mulitple conditions includes ?
-> Conditions with operator to check validations as per condition. 

## Nested Condition means?
-> If condition within if . 

# Day 4

##  Why do we need loops?
-> We can't possibly write code for huge lines so we use loops to reduce that manualy writing. 
ex :- System.out.println("1");
System.out.println("2");
System.out.println("3");
System.out.println("4");
System.out.println("5");
better to use loops here. 

## for loop?
-> For Loop uses for Looping within it has 3 functioning which makes it loop . 
1. initialization of i 2. condition check 3. Update i to keep value till requirement.
   int i =1; i<=5; i++
   
## Counting backwards?
-> Counting Backwards so update part can be modified as per requirement. 
int i =1; i > =5; i--

## while loop
-> While Loop is useful when you want to keep repeating when condition is true. 
like :- i<= 5 
int i =5;
while(i<=5){
System.out.println(i);
i++;
}

## do-while loop
-> Do while is always executes atleast once even though condition matched or not. 
ex:- 
int i =1;
do {
System.out.println(i);
i++;
} while (i<=5);

## Loop + condition
-> Using Loop with conditions, Basically uses for cases of Even or Odd numbers code and Complex codes. 

## Sum using a loop
-> We can use loop for summing Numbers. 

## Mini Challenge
-> Did a challenge where I wrote code of Even, Odd numbers with Total sum of all numbers. 

# Day 5

## What is Method?
-> Think of method as reusable block of code that performs a task.  

## Why do we need Methods?
-> To not use multiple time writing code for printing same pattern, instead can use method with diff. variables. Instead of writing 30 lines of calculation code inside one place better to use diff methodes. 

## Method with Parameter?
-> Method using parameter for accepting argument. means it can accept values from main method. 
public void add(int a) {
}
      main() {
      add(25);
}

## Method with Multiple Parameters?
-> Method using Multiple parameters for accepting arguments. 
ex :- public void studentInfo(String name, int age) {
      
}
      main() {
      studentInfo("David", 25);
}

## Method with Return values?
-> Method returning values not like void. void :- doesn't return value. 
Return :- Returns a values. 
public static int calculation(int a, int b) {
         return a+b;
         }
         main () {
         calculation(25, 25);
         }

## Method with Condition?
-> Method with conditions like if-else and returns values accordingly. 

## Static in method?
-> Static doesn't require object creation it can call method without object. 

## public in method?
-> public is an access modifier, means anyone can access that method without any problem. there are two more access modifiers like privite, protected. 

## () means in method?
-> parameter of method.

