# Utility-Aware SHOP (UASHOP)

**This is a fork of the JSHOP2 library which can be downloaded from: https://sourceforge.net/projects/shop**

The UASHOP program can be packaged into an executable JAR file, which can then be used to trigger the generation of both the domain and problem Java source files based on given input files.

In order to package the program into an executable JAR file, run the following command from, e.g., cmd, while being in the root directory of the application:  
`mvn clean package`

This command assumes the existence of the Maven tool1, which can be downloaded from [here](https://maven.apache.org/) (Visited on: November 3, 2019)  
This would create a folder named target that contains the desired JAR file, which is called, Utilities-JSHOP2-1.0-SNAPSHOT-jar-with-dependencies.jar. Using this JAR file, we can trigger the generation of a domain Java source file from a given domain input file with the following command:  
`java -jar .\Utilities-JSHOP2-1.0-SNAPSHOT-jar-with-dependencies.jar <domain-input-file>`  
  
Furthermore, we can generate the Java source file that corresponds to a specific problem instance from the previous domain using a given problem input file. The command that generates this file differs based on whether we want to execute the classical, or the utility-aware HTN planning algorithm.
For the first case, the command is:  
`java -jar .\Utilities-JSHOP2-1.0-SNAPSHOT-jar-with-dependencies.jar <num-of-plans> <problem-input-file> <output-format>`  
Whereas, for the second case, the command is:  
`java -jar .\Utilities-JSHOP2-1.0-SNAPSHOT-jar-with-dependencies.jar <num-of-plans> <problem-input-file> <resource-value> <risk-attitude> <output-format>`  
  
The semantics of the arguments of these two commands are as follows:
* The num-of-plans argument can take one of the following three values: -r, -rSomeInteger, -ra. -r indicates that only the first plan found by the planner should be returned, whereas, -rSomeInteger means that the planner should return at most SomeInteger plans. Finally, -ra indicates that all the valid plans should be returned. Hence, the user must use the last option only if the number of valid plans is traceable.
  
* The output-format arguments can take one of these two values: csv and txt. csv means that the final output of the planner will be in the form of a Comma-Separated File (CSV) that indicates things like the duration of the planning process, the length of the produced plans, as well as the cost incurred by their operators. txt on the other hand, would result in a verbose output listing the detailed steps of each resulting plan, as well as the planning duration and incurred cost.

* The resource-value argument takes any floating-point number that represents the total available resource.

* The risk-attitude argument can have one of the following four integer values, each of which specifies a different risk-attitude: 0, 1, 2 and 3. These values refer to the risk-averse, risk-seeking, risk-neutral and consumption-aware attitudes, respectively.  

After generating the source files, they should be compiled using the following command:  
`javac *.java`  

Finally, the planning algorithm can be executed using the following command:  
`java <problem-input-file>`  
  
Notice the usage of problem-input-file, since the generated Java class has the same name as the problem input file. The final output file, with the selected format, is placed in the same folder  
Also notice that the program is tested under the following version of Java: Java SE Development Kit 8u231, which can be downloaded from [here](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) (visited on November 3, 2019).
