# Overview

This repository is a part of the Java language training plan. Please read the following guidelines before start.

# Getting Start

## Basic Principals

Each repository contains a gradle java project with a number of unit tests. The initial state of all unit tests are *FAILED*. So the aim is to correct the failed test. Please follow the following steps to get the best experience:

* Read the test code and try to understand what it says.
* Trying to fix the test **WITHOUT RUNNING**. This is very important. Because once you run the test, you may find the failure message of the test telling you the expected result. That means you may lose the chance to figure it out by yourself. Note that you should **ONLY** be able to modify code within the **TODO AREA**. The code outside the **TODO AREA** is **NOT** changable.
* Run the test to examine if the fix is correct.
* Answer the following 4 questions after the test is passed.

The 4 questions are:

1. What is the knowledge point of the test? Where is the offical document to the knowledge point?
1. Why the test failed at first?
1. Why you corrected the test that way?
1. Do you have further questions on this knowledge point?

## Example

Let's take a look at an example:

```java
@Test
void should_pass_by_value() {
  int value = 5;

  tryingToUpdateValue(value);

  // TODO: please modify the following code to pass the test
  // <--start
  final int expected = 0;
  // --end-->

  assertEquals(expected, value);
}
```

First, read the test. From the title and code we can know that the test what to examine the behavior when passing an argument. We are not sure what `tryingToUpdateValue` does, so we can jump into its implementation:

```java
private static void tryingToUpdateValue(int value) {
  value += 2;
}
```

Now we have got the full context of the test. The argument is passed by value so the integer will be copied when passing into `tryingToUpdateValue`. Thus the value from the caller site will not change.

Notice that the todo area is in the test method. So we can modify codes within the todo area to pass the test:

```java
  // TODO: please modify the following code to pass the test
  // <--start
  final int expected = 5;
  // --end-->
```

Please note that not all todo areas are located in test method. And some todo area may have further restrictions, for example:

```java
  // TODO: You should not write concrete number here. Please find a property or constant instead.
  // <!--start
  final int maximumSymbol = 0;
  final int minimumSymbol = 0;
  // --end-->
```

The hint indicates that we should not write concrete number here. So I should not write `3` or `0xffffffff`, but write symbol (e.g. `Integer.MAX_VALUE`).

## Running Test

You could run unit tests with the help of IntelliJ. But it is also possible to run unit test via command line: `./gradlew build`.

If you just want to build your code without running test. Please use `./gradlew build -x test
`
****Answer****
1. BooleanOperatorsTest.java
*should_perform_logical_boolean_operations
  What is the knowledge point of the test? Where is the official document to the knowledge point?
  - The knowledge point of the test logical operator. https://www.learnjavaonline.org/en/Arrays
  Why the test failed at first?
  - The test failed at first due to the array is not created and there's no set result that is equal in the actualResult array. 
  Why you corrected the test that way?
  - I corrected it that way because array is not created properly and to equal the result in the expectedResult.
  Do you have further questions on this knowledge point?
  - I don’t have further questions. 

*should_do_bitwise_and_boolean_operation
  What is the knowledge point of the test? Where is the official document to the knowledge point?
  - The knowledge point of the test is about bitwise and "and" boolean operation. 
  Why the test failed at first? http://www.java2s.com/Tutorials/Java/Data_Type_How_to/index.htm
  - The test failed at first due to the wrong value in the expected variable. 
  Why you corrected the test that way?
  - I corrected it to pass the expected output. 
  Do you have further questions on this knowledge point?
  - I don’t have further questions. 

*should_do_bitwise_or_boolean_operation
  What is the knowledge point of the test? Where is the official document to the knowledge point?
  - The knowledge point of the test is about bitwise and "or" boolean operation. 
  Why the test failed at first? http://www.java2s.com/Tutorials/Java/Data_Type_How_to/index.htm
  - The test failed at first due to the wrong value in the expected variable. 
  Why you corrected the test that way?
  - I corrected it to pass the expected output. 
  Do you have further questions on this knowledge point?
  - I don’t have further questions. 

*should_do_bitwise_not_operation
  What is the knowledge point of the test? Where is the official document to the knowledge point?
  - The knowledge point of the test is about bitwise and "not" boolean operation. 
  Why the test failed at first? http://www.java2s.com/Tutorials/Java/Data_Type_How_to/index.htm
  - The test failed at first due to the wrong value in the expected variable. 
  Why you corrected the test that way?
  - I corrected it to pass the expected output. 
  Do you have further questions on this knowledge point?
  - I don’t have further questions. 


2. CharTypeTest.java
*should_describe_escaped_chars
  What is the knowledge point of the test? Where is the official document to the knowledge point? 
  - The knowledge point of the test is to be familiarized with characters and string literals. 
https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
  Why the test failed at first?
  - The test failed at first because variable doesn't contained the expected ouput. 
  Why you corrected the test that way?
  - I put the equivalent value of characters and string literals. 
  Do you have further questions on this knowledge point?
  - I don’t have further questions. 


3. FloatingTypeTest.java
*should_not_get_rounded_result_if_convert_floating_number_to_integer
  What is the knowledge point of the test? Where is the official document to the knowledge point?
  - The knowledge point of the test is to be familiarized in the behavior of converting float to integer. http://www.java2s.com/Tutorials/Java/Data_Type_How_to/index.htm
  Why the test failed at first?
  - The test failed at first because variable doesn't contained the expected ouput. 
  Why you corrected the test that way?
  - I put the equivalent value of when float convert to integer without rounding off the desired result.  
  Do you have further questions on this knowledge point?
  - I don’t have further questions. 

*should_judge_special_double_cases
  What is the knowledge point of the test? Where is the official document to the knowledge point? http://www.java2s.com/Tutorials/Java/Data_Type_How_to/index.htm
  - The knowledge point of the test is to be familiarized in calling function method.
  Why the test failed at first?
  - The test failed at first because the function it calling is throwing exception.
  Why you corrected the test that way?
  - I corrected the function it calling through means of returning of value. 
  Do you have further questions on this knowledge point?
  - I don’t have further questions. 

*should_not_round_number_when_convert_to_integer
  What is the knowledge point of the test? Where is the official document to the knowledge point? http://www.java2s.com/Tutorials/Java/Data_Type_How_to/index.htm
  - The knowledge point of the test is to be familiarized in the behavior of converting float to integer. 
  Why the test failed at first?
  - The test failed at first because variable doesn't contained the expected ouput. 
  Why you corrected the test that way?
  - I put the equivalent value of when float convert to integer without rounding off the desired result.  
  Do you have further questions on this knowledge point?
  - I don’t have further questions. 

*should_round_number
  What is the knowledge point of the test? Where is the official document to the knowledge point? http://www.java2s.com/Tutorials/Java/Data_Type_How_to/index.htm
  - The knowledge point of the test is to be on how to round the number. 
  Why the test failed at first?
  - The test failed at first because variable doesn't contained the expected ouput. 
  Why you corrected the test that way?
  - I put method to round the floating point number
  Do you have further questions on this knowledge point?
  - I don’t have further questions. 

*isNan
  What is the knowledge point of the test? Where is the official document to the knowledge point? http://www.java2s.com/Tutorials/Java/Data_Type_How_to/index.htm
  - The knowledge point of the test is to be familiarized in using method.
  Why the test failed at first?
  - The test failed at first because  it's throwing exception. 
  Why you corrected the test that way?
  - Through findig the method that perform the operation and i have a checking if the number is "isNaN" then return it. 
  Do you have further questions on this knowledge point?
  - I don’t have further questions. 

*isInfinity
  What is the knowledge point of the test? Where is the official document to the knowledge point? http://www.java2s.com/Tutorials/Java/Data_Type_How_to/index.htm
  - The knowledge point of the test is to be familiarized in using method.
  Why the test failed at first?
  - The test failed at first because  it's throwing exception. 
  Why you corrected the test that way?
  - Through findig the method that perform the operation and i have a checking if the number is "isInfinite" then return it. 
  Do you have further questions on this knowledge point?
  - I don’t have further questions. 


4. IntegerTypeTest
*should_get_range_of_primitive_int_type
  What is the knowledge point of the test? Where is the official document to the knowledge point? 
  - The knowledge point of the test is to get to know the range of Primitive type "INT"
  Why the test failed at first?
   - The test failed at first because variable doesn't contained the expected ouput. 
  Why you corrected the test that way?
  - I used Interger.MAX_VALUE / Interger.MIN_VALUE to get the range of primitive type INT. 
  Do you have further questions on this knowledge point?
  - I don’t have further questions. 

*should_get_range_of_primitive_short_type
  What is the knowledge point of the test? Where is the official document to the knowledge point?
  - The knowledge point of the test is to get to know the range of Primitive type "SHORT"
  Why the test failed at first?
   - The test failed at first because variable doesn't contained the expected ouput. 
  Why you corrected the test that way?
  - I used Short.MAX_VALUE / Short.MIN_VALUE to get the range of primitive type SHORT. 
  Do you have further questions on this knowledge point?
  - I don’t have further questions. 

*should_get_range_of_primitive_long_type
  What is the knowledge point of the test? Where is the official document to the knowledge point?
  - The knowledge point of the test is to get to know the range of Primitive type "LONG"
  Why the test failed at first?
   - The test failed at first because variable doesn't contained the expected ouput. 
  Why you corrected the test that way?
  - I used Long.MAX_VALUE / Long.MIN_VALUE to get the range of primitive type Long. 
  Do you have further questions on this knowledge point?
  - I don’t have further questions. 

*should_get_range_of_primitive_byte_type
  What is the knowledge point of the test? Where is the official document to the knowledge point?
  - The knowledge point of the test is to get to know the range of Primitive type "BYTE"
  Why the test failed at first?
   - The test failed at first because variable doesn't contained the expected ouput. 
  Why you corrected the test that way?
  - I used Byte.MAX_VALUE / Byte.MIN_VALUE to get the range of primitive type BYTE. 
  Do you have further questions on this knowledge point?
  - I don’t have further questions. 

*should_overflow_silently
  What is the knowledge point of the test? Where is the official document to the knowledge point?
  - The knowledge point of the test is to understand "overflow".
  Why the test failed at first?
   - The test failed at first because variable doesn't contained the expected ouput. 
  Why you corrected the test that way?
  - I input the corrected value of the integer when it is overflow it means we're adding +1 in the max value of the integer thats why its returning value is in negative. 
  Do you have further questions on this knowledge point?
  - I don’t have further questions. 

*should_underflow_silently
  What is the knowledge point of the test? Where is the official document to the knowledge point?
  - The knowledge point of the test is to understand "underflow".
  Why the test failed at first?
   - The test failed at first because variable doesn't contained the expected ouput. 
  Why you corrected the test that way?
  - I input the corrected value of the integer when it is underflow it means we're adding -1 in the min value of the integer thats why its returning value is in +
  Do you have further questions on this knowledge point?
  - I don’t have further questions. 

*should_throw_exception_when_overflow
  What is the knowledge point of the test? Where is the official document to the knowledge point?
  - The knowledge point of the test is to know how to know how to throw exception when overflow.
  Why the test failed at first?
   - The test failed at first because add method returning incorrect value. 
  Why you corrected the test that way?
  - I corrected the returning value of add method. 
  Do you have further questions on this knowledge point?
  - I don’t have further questions. 

*just_prevent_lazy_implementation
  What is the knowledge point of the test? Where is the official document to the knowledge point?
  - The knowledge point of the test is to know get the returning value of the call method. 
  Why the test failed at first?
   - The test failed at first because add method returning incorrect value. 
  Why you corrected the test that way?
  - I corrected the returning value of add method. 
  Do you have further questions on this knowledge point?
  - I don’t have further questions. 

*should_take_care_of_number_type_when_doing_calculation
  What is the knowledge point of the test? Where is the official document to the knowledge point?
  - The knowledge point of the test is to know how to be careful in calculation. 
  Why the test failed at first?
   - The test failed at first because variable doesn't contained the expected ouput. 
  Why you corrected the test that way?
  - I input the corrected value to meet the expected result. 
  Do you have further questions on this knowledge point?
  - I don’t have further questions. 

*should_truncate_number_when_casting
  What is the knowledge point of the test? Where is the official document to the knowledge point?
  - The knowledge point of the test is to truncate number when casting this is the part when the integer converted into short. 
  Why the test failed at first?
   - The test failed at first because variable doesn't contained the expected ouput. 
  Why you corrected the test that way?
  - I input the corrected value to meet the expected result. 
  Do you have further questions on this knowledge point?
  - I don’t have further questions. 

*should_increment
  What is the knowledge point of the test? Where is the official document to the knowledge point?
  - The knowledge point of the test is to know the behavior when incrementing. this is the positioning of the "++". When "++" sign is after the variable the current integer will have a plus 1 but in the variable holding the "++" sign will remain as is. 
  Why the test failed at first?
   - The test failed at first because variable doesn't contained the expected ouput. 
  Why you corrected the test that way?
  - I input the corrected value to meet the expected result. 
  Do you have further questions on this knowledge point?
  - I don’t have further questions. 

*should_increment_2
  What is the knowledge point of the test? Where is the official document to the knowledge point?
  - The knowledge point of the test is to know the behavior when incrementing. this is the positioning of the "++". When "++" sign is before the variable the current integer will have a plus 1 and the variable holding the "++" sign will also increment 
  Why the test failed at first?
   - The test failed at first because variable doesn't contained the expected ouput. 
  Why you corrected the test that way?
  - I input the corrected value to meet the expected result. 
  Do you have further questions on this knowledge point?
  - I don’t have further questions. 
  
*add
  What is the knowledge point of the test? Where is the official document to the knowledge point?
  - The knowledge point of the test is to know the behavior of calling two method. This is the one calling by other method it have the behavior that check if it is Overflowing, Underflow or just returning variable. 
  Why the test failed at first?
   - The test failed at first because it doesn't contain the desired logic that is intead to be in this method. 
  Why you corrected the test that way?
  - I add the logic need in here such as checking if the pameter is overflow, underflow or just resturning the value 
  Do you have further questions on this knowledge point?
  - I don’t have further questions. 




