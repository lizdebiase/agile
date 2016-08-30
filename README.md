# 1.Challenge Overview
The challenge is for the Offeror to develop a responsive web app that will be used to report and track staff performance recognition of individuals by their coworkers, including providing “kudos” to peers. This application may include entry of recognition by users, administration activities of users, and reporting.
# 2.Our Solution: **Recognize**
Our prototype works on multiple devices and is a responsive design. We implemented our front-end with the Bootstrap framework to provide a completely responsive experience. We conducted usability tests to observe users on these platforms and used Google’s chrome mobile display test tool to emulate the experience of different platforms.

** add screenshots of the app 
** add a link that will take to the responsive screenshots

# 3.Environments
We used the following three environments that were provisioned using AWS.

+ Developer Integration Environment : is the test and integration environment for all of the developers. This is the environment where all developers validate the integration their code to others', by manual and automated testing.   [https://dhsdev.spinsys.com](https://dhsdev.spinsys.com/dhsweb "Dev Environment")

+ UAT Environment : We used this environment to review the Sprint deliverables
 completed by the team and to collect feedback from the user. We also used this environment to conduct functional test, responsive test and section 508 tests
 [https://dhsuat.spinsys.com](https://dhsuat.spinsys.com/dhsweb "UAT Environment")

+ Prod Environment : We used this environment to release the final MVP after the end of two sprints.[https://dhsprod.spinsys.com](https://dhsprod.spinsys.com/dhsweb "Dev Environment")

# 4.Application Architecture
One of the goals of the architecture is to surface the data in a simple way so that we can add new ways to get to the data or even add data quickly. We stored the data in SQL Server and we choose Entity Framework (EF)  to rapidly create data models. We used ASP.NET Web API to serve JSON data.

+ **Front End Layer:** We used Angular JS, one of the most powerful and adaptive Javascript framework and Bootstrap, popular CSS responsive front-end framework to build our dynamic and responsive UI.s our responsive screens.These two framework enabled our development team to build a modular and easily testable application.

+ **ASP.NET RESTFUL Web API Backend Layer:** We used The **ASP.NET Web API** , one of the Microsoft _open source technology_ to build the powerful ****. It exposed CRUD operations on the data. We used The Repository Pattern to create abstract layer by isolating business objects from Data Access Layer. With this we maximize the amount of code for automated unit testing and isolated data access from data store. This pattern allowed us  to centralize data access, code readability and maintainability and have flexible architecture. We built the API using REST architecture principles.

+ **Entity Framework Layer:** Entity framework is an object-relational mapping framework(ORM) that enabled our team to work with relational data using domain-specific objects and provided a conceptual model of the domain entities. It allowed to translate the C# models used by Web API into database entities.

At a high level, here is the architecture of the application:
<img src="https://github.com/spinsys/agile/blob/master/images/AppArchitecture.png" alt="architecture" >

# 5.Tool Stack
We developed the prototype with **14** modern, open source technologies most appropriate to implement the prototype.

![stack] (https://github.com/spinsys/dhs/blob/master/images/ApplicationStack.png "stack")

# 6.Coding Practices & Automated Testing

In order to maintain healthy code among the team, any team shared code was subjected to rigorous automated tests on various perspectives of quality, including code, security, performance, and functionality. Tests were executed automatically as developers submitted code to the repository. Feedback was made available to developers within minutes of the submission on a variety of criteria explained below. If all tests were successful a deployment was automatically initiated and available for review on the appropriate environment

We used three sources of feedback on our work code before it gets integrated into the codebase: unit tests, code reviews and static code analysis.
 
 _Diagram comes here.
 
 1.**Unit Tests**
 
 2.**Code Coverage**
 
In order to determine what proportion of our project's code is actually being tested by our unit tests, we used code coverage tool provided by the our CI/CD tool Teamcity. Teamcity provides code coverage tool built in which is called JetBrains DotCover running on .NET Framework 3.5 or higher. Once code is checked into the VCS(GIT), Teamcity triggers a new build. Then coded unit tests will be run by the Teamcity. Then at the end of the unit test, Teamcity provided us with a detailed report of test results and code coverage. 
 
![Code Coverage] (https://github.com/spinsys/agile/blob/master/images/CodeCoverageAPI.PNG)

 
 3.**Code Reviews**
 
 We implemented code reviews in our development process to give more eyes on the code to sport potential vulnerabilities and fix them before it is checked into the master branch. Also it provided the members of the team to learn from each other by reviewing each other’s code. 
 
 Here’s the workflow:
 
 - Once the feature branch is reading for testing, developers requested code reviews in the BeanStalk App using the Request a Review feature.
 -  As a team, the reviewers reviewed the code in Beanstalk app and logged issues.Developers committed additional changes to the branches to fix the discovered issues in code review.
 -  Once the branch is error free, the branch was approved and it was merged into the master branch.
 
Here is a snap shot of our code review stats:

<img src="https://github.com/spinsys/agile/blob/master/images/CodeReviewStat.png?raw=true">

 3.**Static Code Analysis**

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

Static analyzers look at code and find problems before you run it. They do simple checks, like enforcing syntax (for example, tabs instead of spaces), and more holistic checks, like making sure your functions aren’t too complex. We used *JSHint* as the static code analyzer to analyze the front end code.


*JSHint* is a program that flags suspicious usage in programs written in JavaScript. 

karma- javascript functional tests, checkout out our front end tests

These tests validate the user facing functionality of the site.
_PhantomJS_ is used to execute the tests in a headless browser environment to increase speed. 
_Jasmine_ is also used to provide a full featured testing harness and clean readability. 
Execution is orchestrated through a Grunt task.

## Section 508 Testing
  
  We used the Google Chrome Add-on "Wave" to perform the Section 508 Testing.This tool identified **16 Web standards** that were outlined by DHS Office of Accessible Systems & Technology (OAST) as standard for Web.  Here is a snap shot of the report: 
  
  <img src="https://github.com/spinsys/agile/blob/master/images/508TestReport.png">
  
#7.Development Workflow & DEVOPS

We used **BeanStalkApp** as our source code repository**(GIT*. The developers created new feature branch to develop the functionality for the feature. We made sure each new feature would reside in its own branch Here’s how the workflow looked like:

1. Developers cloned the feature branch from the master branch to work on the feature he/she was developing.
2. Developers used the static code analyzer embedded in their local development environment to produce quality code.
3. Developers validated the working code with unit tests and manual tests.
4. Developers committed the changes to the feature branch and requested code reviews in the BeanStalkApp. Issues were logged for the developer to fix the problems in the code.
5. Developer’s feature branch code was reviewed and merged into the master branch.

We used **TeamCity** to enable **Continuous Integration/Continuous Ceployment(CI/CD)**. As soon as the feature branch is merged into the master branch, **TeamCity** initiated automated  build and deployed the code to our integration environment. As part of automated build process, we executed unit tests and ran code coverage analysis and we adjusted the unit tests for  more coverage. Once all the automated tests ran successfully after continuous integration , our architect deployed the same tested code to the staging environment. The team was always notified in **Slack** channel **#dhs-build** about the automated builds and the results.

We performed manual testing ( Functional testing, Responsive Testing, Section 508 testing ) on the staging environment.

#8.Design: Wireframes/Personas/Mockups

We developed a design style guide to provide the team with a general reference point for our core design specifications. This includes:

- Screen Samples
- Header, Footer and Navigation Patterns
- Logo Treatment
- Colors and Hex Values
- Typography
- Buttons and Controls
- Graphs
- Imagery
- Iconography

In addition to the design style guide, wireframes and a set of High Fidelity mockups were created as part of the design:

You can see style guide here:
https://github.com/spinsys/agile/blob/master/style-guide.md

You can see our wireframes here:
https://github.com/spinsys/agile/blob/master/wireframes.md

You can see our mockups here:
https://github.com/spinsys/agile/blob/master/mockups.md

You can see our Personas here:
https://github.com/spinsys/agile/blob/master/Personas.md

#9.Agile Process & Artifacts
We developed our prototype using an iterative approach where feedback informed subsequent versions of the prototype. We had a Sprint ‘0’ followed by 2 Sprints.  We conducted sprint planning at the beginning of each sprint and conducted a prototype demonstration and retrospective at the end of each sprint.We executed this challenge with an agile approach, delivering working software every 1.5 hours, and building in an ability to respond to change.

**Sprint Zero: 9:30 am - 10:00 am**
7ps: Prior Planning and Preparation Prevents Pretty Poor Performance

Before we began core development  we spent time in our Sprint 0: Create Story Map. We captured the  product backlog user stories in our tool Trello and in StoriesOnboard story mapping tool to replace the traditional one dimensional list of features ordered according to business value with a two dimensional map which focuses on user activities and the overall vision of the product. It allowed the team the see the big picture in the backlog and promoted silent brainstorming. We executed the following steps :

+ **Step 1:** Capture the primary goal of the MVP:  We understood what our product does or more importantly what kind of problems it solves. We defined the main goal, which must be fulfilled to satisfy the customer.
  ..* Primary Goal: Allow users to administer kudos, give kudos to user
+ **Step 2:** Define the process/stages in the product : We defined what the main user flow in our product looks like. We also defined what the particular stages on this flow are.
+ **Step 3**: Create list of features for each stage:  We looked at each stage of the process and we defined the list of features which should be part of this stage. In this step we try to boost our own creativity and defined as many features as we can but at the same time we made sure we focused on creating  an unprioritized bucket of ideas to help the customer solve her/his problem. As  a result we generated the features and placed it under the stage names.
+ **Step 4:**  Prioritize the features : We prioritize each feature in each stage according to a few factors:

    - Question 1: How important is this feature for finishing the process?
    - Question 2: How often will the feature be used?
    - Question 3: How many users will use this feature?
    - Question 4: How much value will the feature bring to the customer?
    - Question 5: How risky is this feature?

    Based on these questions we rearranged the features on our map by moving the ones with the high value/priority to the top, and the ones with lowervalue/priority to the bottom. The big story cards on the top of the map are the essential capabilities the system needs to have and it is the backbone of the system. We considered all the story cards hanging down from the backbone as **Ribs**. We placed the story cards high to indicate they’re absolutely necessary, lower to indicate they’re less necessary. All the stories placed high on the story map describe the smallest possible system you could build that would give you end to end functionality which is the **Walking Skeleton.
 + **Step 5:** Define the MVP and Sprints
  The story map showed us the big picture of our product and helped us to focus on the overall vision and purpose behind the product and not solely on particular features we need to deliver. When we selected the user stories for the releases/sprints, we always try to go right on the story map and not down and address the most basic needs of our users first so we can deliver our MVP quicker as well as learn more from them.

  When we build the product story by story, we chose them from the story map left to right, and top to bottom. We slowly moved across the backbone, and down through the priorities of each rib. We were slowly building up the system not a feature at a time, but rather by building up all major features a little at a time.
  
  + **Step 6**: Rapid Prototyping/Sketching
  +In order to validate the product and the user stories we created quick wireframes that shows the placement of elements in a user interface and demonstrate the intended layout and functionality of a solution. We try to  answer the following questions :

                - What elements will be displayed in the UI?
                - How will the elements be organized?
                - How will the interface work?
                - How does the user interact with the application / website?

 Our  designer used industry best practices and recommended enhancements to the navigation, presentation, content and interaction represented in the wireframe. Through rounds of usability testing and user interviews, we continually updated the wireframe. We shared it with developers and used the Trello board. While the developers coded core functionality, team members focused on user design continued to talk with the product user and updated wireframes to match recommendations on look, layout and textual elements.
 
 ##StoryMap
 
 ![Story Map] (https://github.com/spinsys/agile/blob/master/images/Dhs_challenge.png "Story Map")
 
 **Sprint 1**

**Goal* : Deliver this

|User Stories Planned:    |
| ------------- |
| Story 1 (estimate points)| 
| Story 2 (estimate points) | 

 **Total Points Planned**:
 
   **Velocity Achieved**
   

**Burndown Chart**


|Feedback    |
| ------------- |
| Feedback 1| 
| Feedback 2  | 

** Retrospectives

| Postives      | Delta       |
| ------------- |-------------| 
| positive 1      | change 1 | 
| positive 2     | change 2   | 


  

**Sprint 2**

**Goal* : Deliver this

|User Stories Planned:    |
| ------------- |
| Story 1 (estimate points)| 
| Story 2 (estimate points) | 

 **Total Points Planned**:
 
   **Velocity Achieved**
   

**Burndown Chart**


|Feedback    |
| ------------- |
| Feedback 1| 
| Feedback 2  | 

** Retrospectives

| Postives      | Delta       |
| ------------- |-------------| 
| positive 1      | change 1 | 
| positive 2     | change 2   | 


  
#10.Digital Services Playbook

We closely followed the Digital Services playbook guidelines as detailed in the link below:U.S. Digital Services Playbook (https://playbook.cio.gov)






