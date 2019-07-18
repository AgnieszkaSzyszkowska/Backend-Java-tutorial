package com.javatutorial.backend.beginner.exercise2;

import java.util.Map;

public interface Phone {

    void call(final String number);
    MyPhone.PhoneState launch();
    MyPhone.PhoneState turnOff();
    Map<String, String> getContactList();

}
