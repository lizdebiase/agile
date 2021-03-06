# 1.Challenge Overview
**[to do]**
The challenge is for the Offeror to develop a responsive web app that will be used to report and track staff performance recognition of individuals by their coworkers, including providing “kudos” to peers. This application may include entry of recognition by users, administration activities of users, and reporting.
# 2.Our Solution: 

We named our product **Recognize**.
Our team utilized an “outside-in” product development approach to create our prototype. “Outside-in” focuses on the end user’s needs and experience to drive features, along with supporting application program interfaces (API). Focusing on the end user means that their needs are implemented pervasively throughout the application. This practice promotes user satisfaction and adoption through continuous interaction/feedback. Our team utilized the following approach for this prototype:

- Conducted user research to understand needs. Our User Researcher conducted user interviews with the product owner, along with the identified personas to create the initial application concept.
- Created initial UI ,documented as wireframes representing the personas associated with the system. Feedback was incorporated into an updated UI design
- Identified user stories to form initial product backlog.
- Developed fully interactive prototype application. The findings from the users interacting with the application, such as usability improvements, were incorporated into the final design.
- Developed fully functioning prototype including back end API for data persistence as a series of “vertical slices” allowing testing throughout the effort.


We brought a highly-skilled, cross-functional team for this effort who have experience in creating modern digital applications.We created our MVP following responsive design principles. We implemented our front-end with the Bootstrap framework to provide a completely responsive experience. We conducted usability tests to observe users on these platforms and used Google’s chrome mobile display test tool to emulate the experience of different platforms.

Here's a snap shot of our application: **REPLACE** 
<img src="https://github.com/spinsys/agile/blob/master/images/mockups/dhs-login-v1.png">


We closely followed the Digital Services playbook guidelines as detailed in the link below: **U.S. Digital Services Playbook** (https://playbook.cio.gov)

The “outside-in” product development approach incorporates the application development aspects of the U.S. Digital Services Playbook and you can read about it here:

https://github.com/spinsys/agile/blob/master/documentation/DigitalServicePlays.md

You can see the responsive web design screenshots here:
https://github.com/spinsys/agile/blob/master/documentation/ResponsiveDesign.md

https://github.com/spinsys/agile/blob/master/documentation/Responsive-Design.md

# 3.Environments
The following three environments were used, and provisioned using **FedRAMP certified AWS**.

+ **Developer Integration Environment:** This environment was used for testing and integration by all the developers. In this environment, all the code is validated using automated unit test cases and then integrated. [https://dhsdev.spinsys.com](https://dhsdev.spinsys.com/dhsweb "Dev Environment")

+ **Test/UAT/Staging Environment:** This environment was used to review the Sprint deliverables
 completed by the team, and to collect feedback from users. This environment was also used to conduct functional tests, responsive tests and _Section 508 tests_.
 [https://dhstest.spinsys.com](https://dhstest.spinsys.com/dhsweb "UAT Environment")

+ **Prod Environment:** This environment was used to release the final MVP after the end of the final sprint.[https://dhsprod.spinsys.com](https://dhsprod.spinsys.com/dhsweb "Prod Environment")

# 4.Application Architecture
The goal of the architecture was to present the data in a simple manner, which will allow us to easily manipulate and add data. The data was stored using **SQL Server**, and **Entity Framework (EF)** was used to rapidly create data models. ASP.NET Web API was also used to serve the JSON data.

+ **Front End Layer:** **Angular JS**, one of the most powerful and adaptive Javascript framework was used along with **Bootstrap**, a popular CSS responsive front-end framework to build dynamic and responsive UIs. These two frameworks enabled the development team to build a modular and easily testable application.

+ **ASP.NET RESTFUL Web API Backend Layer:** We used the **ASP.NET Web API** , one of Microsoft's _open source technology_ to build a powerful application by exposing the CRUD operations on the data. We used The Repository Pattern to create an abstract layer by isolating business objects from Data Access Layer. With this, we maximize the amount of code for automated unit testing and isolated data access from data store. This pattern allowed us to centralize data access, code readability and maintainability and have flexible architecture. We built the API using REST architecture principles.

+ **Entity Framework Layer:** This is an object-relational mapping framework(ORM) that enabled our team to work with relational data using domain-specific objects, and provided a conceptual model of the domain entities. It allowed to translate the C# models used by Web API into database entities.

A high level architecture of the application is shown below:
<img src="https://github.com/spinsys/agile/blob/master/images/AppArchitecture.png" alt="architecture" >

# 5.Tool Stack
We developed the prototype with **15** modern, open source technologies to implement the prototype.

![stack] (https://github.com/spinsys/agile/blob/master/images/application-stack-v2.png "stack")

# 6.Coding Practices & Automated Testing

In order to maintain healthy code among the team, any team shared code was subjected to rigorous automated tests on various perspectives of quality, including code, security, performance, and functionality. Tests were executed automatically as developers submitted code to the repository. Feedback was made available to developers within minutes of the submission on a variety of criteria explained below. If all tests were successful a deployment was automatically initiated and available for review on the appropriate environment

We obtained feedback on our work code before it gets integrated into the codebase using: unit tests, code reviews and static code analysis.

 1.**Unit Tests** and **Code Coverage**
 
In order to determine what proportion of our project's code is actually being tested by our unit tests. JetBrains DotCover running on .NET Framework 3.5 or higher, is a code coverage tool provided by the our **CI/CD tool Teamcity** was used. Once code is checked into the GIT, Teamcity triggered a new build. Unit tests created by code were run by the Teamcity before completing the code build. Once it was completed, **Teamcity** provided us with a detailed report of test results and code coverage. 
 
![Code Coverage] (https://github.com/spinsys/agile/blob/master/images/CodeCoverageAPI.PNG)

 
 2.**Code Reviews**
 
 Code reviews were implemented in our development process, to provide more eyes on the code to identify potential vulnerabilities and fix them beforet they are merged into the master branch.
 
 Here’s the workflow:
 
 - Once the feature branch was ready for testing, developers requested code reviews using BeanStalk App by choosing the Request a Review feature.
 -  As a team, the reviewers reviewed the code in Beanstalk app and logged issues. Developers committed additional changes to the branches to fix the discovered issues in code review.
 -  Once the branch is error free, the branch was approved and it was merged into the master branch.
 
Here is a snapshot of our code review stats:

<img src="https://github.com/spinsys/agile/blob/master/images/CodeReviewStat.png?raw=true">

 3.**Static Code Analysis**

Our goal was to allow developers to push their code in quickly and safely. We want to give feedback on code commits before they go through the integration pipeline. We wanted to give a richer feedback to developers using static code analysis tools. 

The *Static Code Analysis feature of Visual Studio* was used to help developers identify potential design, 
globalization, interoperability, performance, security, and a lot of other categories of 
potential problems. This is based on Microsoft’s rules of coding that mainly targets best practices in 
code writing. A large set of those rules are included in Visual Studio, grouped into different 
categories targeting specific coding issues such as security, design, Interoperability, globalizations and others.

We used *JSHint* , a program that flags suspicious usage in programs to validate the frontend code. We wrote Karma- javascript functional tests for our frontend layer.

These tests validate the user facing functionality of the site.
_PhantomJS_ is used to execute the tests in a headless browser environment to increase speed. 
_Jasmine_ is also used to provide a full featured testing harness and clean readability. 

Execution was orchestrated through a Grunt task.

#7.Section 508 Testing
  
  Google Chrome Add-on "Wave" was used to perform the Section 508 Testing.This tool identified **16 Web standards** that were outlined by DHS Office of Accessible Systems & Technology (OAST) as standard for the Web.  Here is a snap shot of the report: 
  
  We have documented the results for 508 testing here: https://github.com/spinsys/agile/tree/master/508Tests
  
  <img src="https://github.com/spinsys/agile/blob/master/images/508TestReport.png">
  
#8.Continuous Integration(CI) and Continuous Deployment (CD) 

Continuous integration is a critical supporting tool for agile development. Rapid build and deploy is foundational to sprint velocity and efficiency.

We used **BeanStalkApp** as our source code repository**(GIT)**. The developers created a new feature branch to develop the functionality for the feature. We've ensured that each new feature would reside in its own branch 

Here’s how the development workflow looked like:

1. Developers cloned the feature branch from the master branch to work on the feature he/she was developing.
2. Developers used the static code analyzer embedded in their local development environment to produce quality code.
3. Developers validated the working code with unit tests and manual tests.
4. Developers committed the changes to the feature branch and requested code reviews in the BeanStalkApp. Issues were logged for the developer to fix the problems in the code.
5. Developer’s feature branch code was reviewed and merged into the master branch.

**TeamCity** was used to enable **Continuous Integration/Continuous Ceployment(CI/CD)**. As soon as the feature branch is merged into the master branch, **TeamCity** initiated automated build and deployed the code to our integration environment. As part of automated build process, we executed unit tests, and ran code coverage analysis. Unit tests were adjusted for  more code coverage if needed. Once all the automated tests ran successfully, our architect deployed the same tested code to the staging environment. The team was always notified in the **Slack** channel **#dhs-build** about the automated builds and their results.

You can read about our Teamcity builds here: https://github.com/spinsys/agile/blob/master/documentation/CICD.md


#9.Human Centered Design

A design style guide was developed to provide the team with a general reference point for our core design specifications. 

This included:

- Screen Samples
- Header, Footer and Navigation Patterns
- Logo Treatment
- Colors and Hex Values
- Typography
- Buttons and Controls
- Graphs
- Imagery
- Iconography

In addition to the design style guide, wireframes and a set of High Fidelity mockups were created as part of the design. 

You can read about our **human centered design process** here:
https://github.com/spinsys/agile/blob/master/documentation/HumanCenterDesignProcess.md

You can see our **Style guide** here:

https://github.com/spinsys/agile/blob/master/documentation/style-guide.md

You can see our **Wireframes** here:
https://github.com/spinsys/agile/blob/master/documentation/HumanCenteredDesign/wireframes.md

You can see our **Mockups** here:
https://github.com/spinsys/agile/blob/master/documentation/HumanCenteredDesign/mockups.md

You can see our **Personas** here:
https://github.com/spinsys/agile/blob/master/documentation/HumanCenteredDesign/Personas.md

#10.Agile Process & Artifacts

**Definition of Done** is crucial to a highly functioning team. 
As a team we defined our **Definition of Done** here:
https://github.com/spinsys/agile/blob/master/documentation/DefinitionOfDone.md

Our prototype was developed using an iterative approach, where feedback was done on subsequent versions of the prototype. We had a Sprint ‘0’ followed by 2 Sprints. 
We conducted sprint planning at the beginning of every sprint and conducted a prototype demonstration and retrospective at the end of each sprint. We executed this challenge with an agile approach, delivering a working software every 1.5 hours, and building it with the ability to respond to change.

**Sprint Zero: 9:30 am - 10:00 am**

We strongly believed in 7ps: **Prior Planning and Preparation Prevents Pretty Poor Performance**

Before we began core development, we spent some of our time in Sprint 0 by creating Story Maps. We captured the product backlog user stories using a tool called **Trello** and story mapping tool called **StoriesOnboard**. This replaces the traditional one dimensional list of features ordered according to business value, with a two dimensional map which focuses on user activities and the overall vision of the product. It allowed the team to see the big picture in the backlog and promoted silent brainstorming. 

The following steps were executed:

+ **Step 1:** Capture the primary goal of the MVP:  We understood what our product does, or more importantly what kind of problems it solves. We defined the main goal that must be fulfilled to satisfy the customer.
  
Primary Goal: Allow users to administer kudos, and give kudos to other user

+ **Step 2:** Define the process/stages in the product: We defined what the main user flow in our product looks like, and defined particular stages on this flow are.

+ **Step 3**: Create list of features for each stage: We looked at each stage of the process and we defined the list of features which should be part of this stage. In this step we try to boost our own creativity and defined as many features as we can but at the same time we made sure we focused on creating  an unprioritized bucket of ideas to help the customer solve her/his problem. As a result we generated the features and placed it under the stage names.

+ **Step 4:**  Prioritize the features : We prioritized each feature in each stage according to a few factors:

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
  In order to validate the product and the user stories we created quick wireframes that shows the placement of elements in a user interface and demonstrate the intended layout and functionality of a solution. We try to  answer the following questions :

                - What elements will be displayed in the UI?
                - How will the elements be organized?
                - How will the interface work?
                - How does the user interact with the application / website?

 Our  designer used industry best practices and recommended enhancements to the navigation, presentation, content and interaction represented in the wireframe. Through rounds of usability testing and user interviews, we continually updated the wireframe. We shared it with developers and used the Trello board. While the developers coded core functionality, team members focused on user design continued to talk with the product user and updated wireframes to match recommendations on look, layout and textual elements.
 
 ##Our StoryMap
 ![Story Map] (https://github.com/spinsys/agile/blob/master/images/Dhs_challenge.png "Story Map")
 
 ##Our Sprint 1

<img src="https://github.com/spinsys/agile/blob/master/images/Sprint1.png" alt="Sprint1" >

 ##Our Sprint 2

<img src="https://github.com/spinsys/agile/blob/master/images/Sprint2.png" alt="Sprint2" >










