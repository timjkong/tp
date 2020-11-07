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

- **Minor Enhancement**:
    - Formatted and organised exception messages for invalid inputs
            - What it does: When a user enters an incorrect format for the command, the application responds with an exception message, providing the user with the correct format
            for the command as well as an example.
            - Justification: Wanderlust contains quite a few different commands and it is possible that a user may forget the correct format for certain commands. Providing them with the correct format and an example
            will allow them to quickly correct their invalid inputs. 
            - Relevant pull request: [\#248](https://github.com/AY2021S1-CS2103-T14-3/tp/pull/248)

    - Implemented **feature for the Graphical User Interface**:
        - What it does: GUI shows the total cost of each `travelplan`. This is done by adding the cost of activities and accommodation in the `travelplan`.
        - Justifications: Users with a budget for their `travelplan` will be able to keep track of their total cost incurred thus far easily and hence, optimising users' experience.

        - Relevant pull requests: [\#157](), [\#158]()

* **Project management**:
  * Provide suggestions during weekly meetings.
  * Delegate tasks weekly to team members.
  * Schedule weekly meetings.
  * Create the template for the implementation aspect of developer guide.

* **Enhancements to existing features**:
  * Updated the add feature. ([\#89](https://github.com/AY2021S1-CS2103-T14-3/tp/pull/89))
  * Wrote additional tests for the `add` feature.

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
  * Reported bugs and suggestions for other teams in the class: [Reported 6 Bugs in PED](https://github.com/timjkong/ped/issues)