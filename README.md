# Getting-Started-With-Selenium-Grid

### Introduction:-
This repository contains a plug and play template for selenium grid where you can configure a hub and multiple node servers on which you can run your tests.

### Why do we need Selenium Grid?

Selenium grid allows us to execute our tests on multiple machines on different platform. By create a hub or a
server you can easily execute your tests on the node machines which can be on different platforms.

### Technologies used:-
**Programming language** - Java

**Build tool** - Maven

**Automation tool** - Selenium

**IDE** - Intellij

###Dependencies used :
**selenium-remote-driver**

`<dependency>
<groupId>org.seleniumhq.selenium</groupId>
<artifactId>selenium-remote-driver</artifactId>
<version>4.0.0-alpha-1</version>
<scope>test</scope>
</dependency>`

**TestNG**

`<dependency>
            <groupId>org.testng</groupId>
            <artifactId>testng</artifactId>
            <version>RELEASE</version>
            <scope>test</scope>
        </dependency>`


**Selenium chrome driver**

`<dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-chrome-driver</artifactId>
            <version>4.0.0-alpha-7</version>
            <scope>test</scope>
        </dependency>`


### Steps for execution:-
Clone the repository on your local system.

Let intellij resolve all the required dependencies.

To configure your syste as a hub, download the latest Selenium server .jar file from https://www.selenium.dev/downloads/.

Go to the folder which contains the .jar file, open the terminal and hit the following command.
java -jar selenium-server-standalone-3.141.59.jar -role hub

Extract the link to register the nodes from the terminal.

Now download the same file in your node machine as well and go the folder which contains the .jar file and hit the following command.
java -Dwebdriver.chrome.driver="\Users\ank11\Downloads\chromedriver" -jar selenium-server-standalone-3.141.59.jar -role webdriver -hub http://192.168.0.105:4444/grid/register -port 5566

USe the link from the hub and add it after -hub.

Go to the terminal the and execute the command **mvn test** to execute all the tests. Now the tests will now execute on the node machine.
