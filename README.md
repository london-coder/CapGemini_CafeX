## Abstract:
This is a coding exercise for a role with Cap Gemini. The instructions are provided in a Microsoft Powerpoint slide pack.
The instructions were taken literally, in particular in the highlighted block on slide number 3. It does not ask for an 
application, nor a deployable archive, it asks only for TDD, that was adhered to. The content presented in the slides is 
repeated below: 

---

# Developer Exercise
## DDC Recruitment

## Basic exercise
Use TDD
Use Scala or Java
Take 30 - 45 minutes
Use Git and tag commits (e.g. after step 1)
```
Complete the steps in order.  Don’t read ahead. At each step build the simplest possible 
solution which meets our requirement.  Tag a git commit after each step so that your approach 
is clear.
```

## Scenario
Cafe X menu consists of the following items:

Cola - Cold - 50p
Coffee - Hot - £1.00
Cheese Sandwich - Cold - £2.00
Steak Sandwich - Hot - £4.50

Customers don’t know how much to tip and staff need tips to survive!

## Step 1 : Standard Bill 
Pass in a list of purchased items that produces a total bill.

e.g. [“Cola”, “Coffee”, “Cheese Sandwich”] returns 3.5

## Step 2: Service Charge
Add support for a service charge :
When all purchased items are drinks no service charge is applied
When purchased items include any food apply a service charge of 10% to the total bill (rounded to 2 decimal places)
When purchased items include any hot food apply a service charge of 20% to the total bill with a maximum £20 service charge

### Notes
This was approached in the manner described in the slides, i.e. as an exercise to satisfy certain requirements. It is not a production 
application, in that it does not perform logging, nor does it perform authentication or authorisation, and is not packaged as an applicaiton. 
Double has been used for brevity and simplicity, to make the code "production" worthy, the type should be BigDecimal with the scale set 
to 2 and an appropriate rounding mode. Nor does the exercise consider the case of the string menu items. 

The implementation language is Scala version 2.12.8, and the build tool is sbt. The project was created with an sbt giter8 template. 
To run the code, ensure you have sbt on your computer, and clone the Git project locally. Please use the HTTPS URL as the git account makes use 
of certificates. 
From the project directory, in a terminal, type sbt test to see the results of the tests. 
