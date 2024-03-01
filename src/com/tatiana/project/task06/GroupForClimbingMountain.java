package com.tatiana.project.task06;

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
    public boolean getGroupEnrollmentIsOpen() {
        return groupEnrollmentIsOpen;
    }

}
