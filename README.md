# Sainsbury Technical Test
Sainsbury Technical Test Repository

##Installation
Please follow these steps to set up this project locally

1. Download the chrome driver from: https://sites.google.com/a/chromium.org/chromedriver/downloads
2. Import the project source code from the git repository: https://github.com/assedali/SainsburyTest.git
3. This project is developed usin spring tool suite(sts), which can also be open in eclipse
4. Import the project as the Maven project into spring tool suite
5. Set the variable chromeDriverPath and grocerySiteUrl in the SpringBeanConfiguration.xml file in resources directory
6. Execute the App class to run the application

##Program Structure
* This is a Maven project, so all the dependencies used can be viewed in the pom.xml
* Coding is done via Behaviour deriven development (BDD) using JBehave, so if we run the pom.xml as a mvn-test, the integration/acceptance test will be executed and a Jbehave html test report is viewable in the target directory
* JUnit is used for unit testing
* Application architecture is based on the Object orinted design(OOD)
