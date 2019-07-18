package com.javatutorial.backend.beginner;

import com.javatutorial.backend.beginner.exercise2.Phone;

/**
 * Refactor class MyPhone to implement interface Phone in exercise2 package (use "implements" keyword).
 * Use System.out.println() to print behaviour like "calling", "phone launched", "phone turned off" in MyPhone class
 * Add getters and setters to fields in MyPhoneClass (use Intellij ALT + INSERT shortcut)
 * Add constructor with one parameter: model, set state to OFF and add explicitly default constructor too
 * Override toString method printing all fields of MyPhone class (use Intellij ALT + INSERT shortcut)
 * Run the test and check if it's working and printing output as expected.
 */
class ExerciseNr2InterfacePractise {

    /**
     * Instantiate the phone object with state OFF and model number, set contact list: mom - 123-123-123, owner: your name,
     * owner number: any number,
     */
    private Phone phone;

    /**
     * Notice that a logic of this method is written even without having actual implementation of MyPhone class!
     * And it's compiling.
     */
    void callToMom() {
        System.out.println("Phone is about to be launched " + phone.toString());
        phone.launch();
        System.out.println("Calling mum with phone " + phone.toString());
        phone.call(phone.getContactList().get("mom"));
        System.out.println("Phone is about to be turned off " + phone.toString());
        phone.turnOff();

    }
}
