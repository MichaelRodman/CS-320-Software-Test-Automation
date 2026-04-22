# CS 320 Software Test, Automation, and Quality Assurance

This repository contains artifacts from my work in CS 320. These files demonstrate my understanding of software testing, validation, and quality assurance through the design and testing of service-based Java classes. The artifacts included here show how I used unit testing to verify requirements, catch invalid input, and improve confidence in software behavior.

## Included Artifacts

### Project One
- `Contact.java`
- `ContactService.java`
- `ContactTest.java`
- `ContactServiceTest.java`

### Project Two
- `Summary and Reflections Report.docx`
- `Summary and Reflections Report.pdf`

## Reflection

### How can I ensure that my code, program, or software is functional and secure?

I can help ensure that my code is functional and secure by building it around clear requirements and testing it thoroughly. In this course, I used JUnit tests to confirm that my contact service behaved correctly and enforced the required rules. For example, I tested that contact IDs, names, phone numbers, and addresses followed the required constraints, and I verified that invalid inputs threw exceptions instead of being accepted. I also tested service behaviors such as adding contacts, rejecting duplicate IDs, deleting contacts, and updating fields. These kinds of tests help confirm that the software works correctly and protects against bad data entering the system.

### How do I interpret user needs and incorporate them into a program?

I interpret user needs by starting with the requirements and translating them into specific behaviors in the code. In this project, the user needs were represented by rules such as maximum field lengths, required values, unique IDs, and update operations. I incorporated those needs by writing validation logic directly into the `Contact` class and then supporting those requirements in the `ContactService` class. I also wrote tests that matched those requirements so I could verify that the program behaved the way the user or stakeholder would expect. This approach helps me stay focused on what the program is supposed to do rather than making assumptions.

### How do I approach designing software?

I approach designing software by first identifying the responsibilities of each part of the program and then keeping those responsibilities separate. In this project, I separated the contact data model from the contact service logic. The `Contact` class handled the rules for valid data, while the `ContactService` class handled storing, retrieving, deleting, and updating contacts. This made the code easier to understand and easier to test. I also try to design software with testing in mind, because when classes have clear responsibilities, it is much easier to write focused tests for them. This course reinforced for me that good design and good testing go together.
