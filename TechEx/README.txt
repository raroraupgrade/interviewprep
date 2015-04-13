This tech ex uses the java bindings for Selenium webdriver with JUnit as a testing framework.

Useful documentation for Selenium Webdriver can be found here:
http://docs.seleniumhq.org/docs/03_webdriver.jsp


The folder should have all the necessary jars in the lib folder.  
A TechEx.java file under src with one example test is included.  The setup and teardown functions log in and log out respectively.
Before running you will want to update the username and password used in the setup function to a test user you've created.


** Running from Eclipse **
Import workspace into Eclipse
	File > Import > General > Existing Projects into Workspace
	Verify that the jars in the lib directory are in the build path
Run as JUnit Test
	Right click TechEx in Project Explorer and select Run as JUnit Test


** Running from command line **
cd to bin folder and run the following commands
javac -classpath "../lib/*" -d ./ ../src/TechEx.java
java -cp ".:../lib/*" org.junit.runner.JUnitCore TechEx