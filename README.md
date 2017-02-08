#English Calculator Test#

The purpose of this feature is to test an interview candidate. 

**NOTE:** The project contains three classes of interest that **MUST** be used, or else the candidate 
**WILL FAIL** the test.

##Functional requirements##

The requirements of this feature are:

1. The API takes an **english** description of a calculation e.g. *seven multiplied by eight* and returns the 
results of that calculation in english, e.g. *fifty six*
1. The four operations that must be supported, are:
    1. **plus** - e.g. *one plus two* == *1+2* 
    1. **minus** - e.g. *one minus two* == *1-2* 
    1. **multiplied by** - e.g. *one multiplied by two* == *1x2* 
    1. **divided by** - e.g. *one divided by two* == *1 /2* 
1. For **divided by** the arguments have an upper limit of *ten thousand*
1. For all other operators, the arguments have an upper limit of *one hundred*
1. **minus** must allow for negative results (e.g. *six minus seven* must return *minus one*)
1. **divided by** must allow for remainders (e.g. *twelve divided by 5* must return *two with a remainder of two*)

###Some examples####

*fifty six plus forty nine* must return *one hundred and five*

*ten minus twelve* must return *minus two*

*ninety nine multiplied by seventy six* must return *seven thousand five hundred and twenty four*

*six hundred and twenty five divided by thirteen* must return *forty eight with a remainder of one*
    
    

##Test requirements##

The test includes the following classes that **MUST** be used, they are:

1. *MAIN*
    1. **com.sonalake.calculator.Calculator** - the interface that defines the API
    1. **com.sonalake.calculator.CalculatorImpl** -- the implementation of the above interface. You may create any other 
classes as are required to implement this feature, but they **MUST** be called from within this class, because it is
operations on *this* class that the unit tests are invoking.
1. *TEST*
    1. **com.sonalake.calculator.CalculatorTest** - in many respects this is the most important class. This contains a 
    large number of tests that will check the above implementation. The test is not complete until ***ALL** of these
    tests pass.

#Building and running tests#

##Maven is required##

You'll need to download and install maven for this (see https://maven.apache.org/)

##Build and run the tests##
To build the project and run the tests, the command is a simple:

    mvn clean install
    
**NOTE:** initially, until you implement the feature, all tests will fail.