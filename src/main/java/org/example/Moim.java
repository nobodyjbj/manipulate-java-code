package org.example;

public class Moim {

    int maxNumberOfAttendees;

    int numberOfCurrentEnrolled;

    public boolean isEnrollmentFull() {
        if (maxNumberOfAttendees == 0) {
            return false;
        }

        if (numberOfCurrentEnrolled < maxNumberOfAttendees) {
            return false;
        }

        return true;
    }
}
