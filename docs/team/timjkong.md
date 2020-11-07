---
layout: page
title: Timothy Ong Jing Kai's Project Portfolio Page
---

## Project: Wanderlust

WanderLust is a desktop travel planner application. It allows users to plan their trips in a structured and efficient manner.
The user interacts with it using a CLI, and it has a GUI created with JavaFX.
It is written in Java, and has about 16 kLOC.

## Summary of Contributions

- Code contributed: [RepoSense](https://nus-cs2103-ay2021s1.github.io/tp-dashboard/#breakdown=true&search=timjkong)

- **Major Enhancement**: 
    - Implemented **copy and move features**
        - What it does: The copy feature allows users to copy an `activity` from the wish list to a travel plan. The move feature essentially does the same thing but removes the `activity` from the
        wish list after copying it to the travel plan.
        - Justifications: As our target users are travel goers, they would likely want to make a wish list of activities to do in various countries. Then, once they have finalised the details
        of their trips, such as the date, time and cost of the activities, they can copy or move the activities over to a travel plan.
        This enhancement improved the product significantly as users will be able to easily copy or move activities that they have planned for their trips
        from the wish list to a travel plan once they have confirmed the details of the activity.

        - Highlights: 
            - This feature modifies all 4 components of Wanderlust: `Ui`, `Logic`, `Model` and `Storage`.
            - The copy and move commands differ from other commands in that they are the only commands that modify the list of activities of a travel plan not in the current directory.

        - Relevant pull requests: [\#135](https://github.com/AY2021S1-CS2103-T14-3/tp/pull/135)

    - Modified **add feature** from AB3 to fit Wanderlust
        - What it does: Allows user to add a `travelplan` or a `travelplanobject` in the application.
        - Justifications: Since Wanderlust is a travel planner, it is necessary to allow users to add new travel plans to the travel planner and new activities, accommodations and friends to their travel plans.

        - Highlights:
            - This feature modifies all 4 components of Wanderlust: `Ui`, `Logic`, `Model` and `Storage`.
            - This feature relies on abstraction. The `AddTravelPlanCommand`, `AddActivityCommand`, `AddAccommodationCommand` and `AddFriendCommand` classes extend the `AddCommand` class which extends the `Command` class.

        - Relevant pull requests: [\#89](https://github.com/AY2021S1-CS2103-T14-3/tp/pull/89)

    - Implemented **navigation feature**
        - What it does: Allows users to navigate to different `travelplan` or `wishlist` using the Command Line input. The Graphics User Interface will then update to the desired directory that the user navigated to.
        - Justifications: Users will like to navigate to their desired `travelplan` or `wishlist` so that they are able to view the content in the directory on the application and plan their travel visually.
        This enhancement improved the product significantly as it provides user a convenient and fast way to go to their desired `travelplan/wishlist`, improving users' experience.

        - Highlights:
            - This enhancement transcends across 3 components of Wanderlust: `Ui`, `Logic`, `Model`
            - Furthermore, this enhancement required the creation of a high level component `directory` that is linked to the 4 components so that users are able to navigate between `travelplan/wishlist`.
            This enhancement required an in-depth analysis of design alternatives. The implementation too was challenging as it required changes to architecture design of the code.
            - This enhancement was contributed together as a team, with @lyeyixian and @jeannetoh building on the `Model` and `Ui` aspect respectively.
        - Relevant pull requests: [\#108](), [\#100]()

    - Implemented **time logic**
        - What it does: Prevent users from entering invalid dates that does not make sense. For example, if a user have a `travelplan` from 1 December 2020 to 31 December 2020, it will be irrational for him to add an `activity` or `accommodation`
        that is not within the range of the `travelplan`.
        - Justifications: I decided to implement this logic to ensure the coherence of the application, so that users can have a proper `travelplan` depicting accurate dates and prevent any irrational timeline from happening in the `travelplan`.
        This is aimed at our target users, who are travelgoers planning for trips and hence, a comprehensive and well-structured time logic is needed in the applicaiton.

        - Relevant pull requests: [\#242]()

- **Minor Enhancement**:
    - Implemented **Command Line Tab Management**
        - What it does: Allows users to switch tabs between `activity`, `accommodation` and `friend` within a `travelplan` using the Command Line input. The Graphics User Interface will then update to show the desired tab that the user wished to show.
        - Justifications: Users will like to view their desired `travelplanobject` on the application so that they can plan any `activity`/`accommodation`/`friend` or make any changes to it.
        While a GUI would make sense for tedious actions like editing, the command line is arguably faster for simpler actions like switching tabs. Furthermore, our target users are tech-savvy travellers who are used to command line window. Hence, I decided to implement a command line version for tab management to optimize for these users, which will help improve their user experience.

        - Relevant pull requests: [\#132]()

    - Implemented **feature for the Graphical User Interface**:
        - What it does: GUI shows the total cost of each `travelplan`. This is done by adding the cost of activities and accommodation in the `travelplan`.
        - Justifications: Users with a budget for their `travelplan` will be able to keep track of their total cost incurred thus far easily and hence, optimising users' experience.

        - Relevant pull requests: [\#157](), [\#158]()

* **Project management**:
  * Provide direction during weekly meetings.
  * Delegate tasks weekly to team members.
  * Schedule weekly meetings.
  * Create the template for the implementation aspect of developer guide.

* **Enhancements to existing features**:
  * Updated the delete feature ([\#84]())
  * Wrote additional tests for existing features to increase coverage from 66% to 70% (Pull requests [\#84](), [\#99](), [\#100]())

* **Documentation**:
  * User Guide:
    * Added documentation for the features `add`, `delete` and `edit` ([\#107](https://github.com/AY2021S1-CS2103-T14-3/tp/pull/107)) 
    * Added documentation for the features `copy` and `move` ([\#188](https://github.com/AY2021S1-CS2103-T14-3/tp/pull/188/files))
  * Developer Guide:
    * Added non-functional requirements. ([#46](https://github.com/AY2021S1-CS2103-T14-3/tp/pull/46))
    * Added implementation details of the `add` feature. ([#142](https://github.com/AY2021S1-CS2103-T14-3/tp/pull/142))

* **Community**:
  * Total PRs reviewed: 4
  * PRs reviewed with non-trivial review comments: ([\#59](https://github.com/AY2021S1-CS2103-T14-3/tp/pull/59)) 
  * Contributed to forum discussions: [1](), [2](), [3](), [4]()
  * Reported bugs and suggestions for other teams in the class: [Reported 15 Bugs in PED](https://github.com/jiaweiteo/ped/issues)