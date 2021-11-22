# SalesChampTask

--configuration.properties & ConfigurationReader
In this framework I used configuration.properties file to use and access some common and repeated datas.
ConfigurationSeter class to convert this datas into Java.


--feature file
Increase the readebility of the test scripts and connect the execution order.
Both technical and non technical people can understand what is going on the test scripts.


--step_definitions package
Takes the corresponding feature file and convert to Java Code.
All the corresponding test script of feature files locates in this package

Hooks.class -> Works with Cucumber annotations.
                  Assigned before and after classes so it will work before or after every method.

--Runner package
CBrunner -> It is our fire starter. We will provide some tags of test suites ex:(@regression, @smoke)
          and it will execute only test scripts with given tags. You can also set dry run (true, false)
          so it will create automaticaly step definitions where there is needed.
          You also can add plugins I added "json:target/cucumber.json" so it will handle reporting.

--utilities package
ShortCuts -> I created my own codes to make it easy and dynamic.
Driver -> It is my driver class that takes the browser type from configuration.properties and create group of drivers.

--pom.xml
I take those dependencies from mvnrepo. I used maven sure fire plugin to make parallel testing
and cucumber report for reporting. You can set the number of tabs that will execute or run order etc.
Parallel testing is not works with Runner class. You can write to terminal or command prompt "mvnverify".
