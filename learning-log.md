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
