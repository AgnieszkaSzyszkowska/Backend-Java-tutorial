package com.javatutorial.backend.beginner;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class ExerciseNr2InterfacePractiseTest {

    @Test
    @Disabled("Remove this line when you implement the MyPhone class and run the test, currently the test is disabled to not break the build")
    void shouldRunAndLogOutput() {
        //given
        final ExerciseNr2InterfacePractise exerciseNr2InterfacePractise = new ExerciseNr2InterfacePractise();

        //when
        exerciseNr2InterfacePractise.callToMom();

        //then
        // this is an always-true statement since there is not much to test in this test, just see the output
        assert 1 == 1;
    }

}