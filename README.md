# cucumber-guice-selenium
This framework is implemented with Guice DI and Cucumber

#####Report path
`Two types of reports are available at folowwing paths:
 `
 
``target/cucumber-html-reports``
and 
``cucumber/cucumber-reports.html``

#####Pre-run setup

``Required:``
`openjdk 15.0.2 2021-01-19
 OpenJDK Runtime Environment AdoptOpenJDK (build 15.0.2+7)`
 ` and maven pre-installed. `

######Then do: 
`mvn clean install -DskipTests`

#####Run tests

`mvn test`

#####Dependency injector class
``main.java.core.modules.CukeInjectorSource``

#####References and more about Guice and DI

######Loose coupling and why we need Interfaces
* https://stackoverflow.com/questions/2832017/what-is-the-difference-between-loose-coupling-and-tight-coupling-in-the-object-o
######DI and 'programming to interface'
* https://medium.com/groupon-eng/dependency-injection-in-java-9e9438aa55ae
######DI implemented with Guice and Cucumber
* https://cucumber.io/docs/cucumber/state/ ``and`` http://www.thinkcode.se/blog/2017/08/16/sharing-state-between-steps-in-cucumberjvm-using-guice
* https://javadoc.io/doc/info.cukes/cucumber-guice/1.2.5/index.html
* https://stackoverflow.com/questions/12404434/configuring-cucumber-guice
