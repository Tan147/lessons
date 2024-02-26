package com.tatiana.project.lesson6.task06;

public class GroupForClimbingMountain {

    private boolean groupEnrollmentIsOpen;
    private Climber[] climbers;
    private String mountain;


    public GroupForClimbingMountain(boolean groupEnrollmentIsOpen, String mountain) {
        if (!groupEnrollmentIsOpen)
            throw new IllegalArgumentException("Набор в группу закрыт");

        this.groupEnrollmentIsOpen = groupEnrollmentIsOpen;
        this.mountain = mountain;
    }
}
