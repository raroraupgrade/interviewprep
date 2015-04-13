1. To run the tests against latest Firefox browser, include the following JARs on the Build Path:
gson-2.3.jar
selenium-java-2.44.0.jar
selenium-java-2.44.0-srcs.jar

Otherwise, latest Firefox (32/33) isn't able to connect with the running instance once it starts (as seen on OS X 10)

2. The supplied test() method has updated locators and has been renamed to editProfileFromHomePage()

3. The tweetFromHomePage() test method sends a Tweet with a random string and then verifies it 