#Automated Testing

We used three sources of feedback on our work code before it gets integrated into the codebase: unit tests, code reviews and static code analysis.
 
 _Diagram_
#Unit Tests

#Code Reviews

##Static Code Analysis
Our goal is to allow developers to push their code in quickly and safely. 
We think that one way to achieve this is to provide early feedback to developers, during the development process, 
so that they feel confident that they are not going to break something. 
As adventurous as we are, we don’t feel production is an appropriate place to find out we might have goofed. 
We want to give feedback on code commits before they go through the integration pipeline. 
We wanted to give a richer feedback to developers using static code analysis tools. 

We used the the *Static Code Analysis feature of Visual Studio* to help developers identify potential design, 
globalization, interoperability, performance, security, and a lot of other categories of 
potential problems according to Microsoft’s rules that mainly targets best practices in 
writing code, and there is a large set of those rules included with Visual Studio grouped into different 
categorized targeting specific coding issues like security, design, Interoperability, globalizations and others.

The standard way to achieve this is to periodically run a tool on the codebase 
and publish the results on nice dashboards in which we can track our projects’ quality. 
This is useful, but the feedback is provided on code that has been merged possibly hours ago. 
So we decided to run the static code analysis on the local build process so that any violations will be treated as errors.
This way, the static analysis report is displayed at the local developer box so that the developer can fix the code 
before it is committed.

Static analyzers look at code and find problems before you run it. They do simple checks, like enforcing syntax (for example, tabs instead of spaces), and more holistic checks, 
like making sure your functions aren’t too complex. We used *JSHint* as the static code analyzer to analyze the front end code.
*JSHint* is a program that flags suspicious usage in programs written in JavaScript. 

#Create automated tests that verify all user-facing functionality

karma- javascript functional tests, checkout out our front end tests

These tests validate the user facing functionality of the site.
_PhantomJS_ is used to execute the tests in a headless browser environment to increase speed. 
_Jasmine_ is also used to provide a full featured testing harness and clean readability. 
Execution is orchestrated through a Grunt task.
