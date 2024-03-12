package org.license.upload;

import java.util.ArrayList;
import java.util.Random;

public  class Constants {

    private final String[] violationType = new String[] {"no_stop", "no_full_stop_on_right", "no_right_on_red"};
    private final String[] addresses = new String[] { "4451 146th Ave SE, Bellevue WA 98006", "1111 Cool str, Seattle WA 111458" };


//    ints(1, 0, addresses.length).iterator().nextInt();

    public  String getRandomAddress() {
        int index = new Random().nextInt(addresses.length);
        return addresses[index];
    }
    public  String getRandomViolation() {
        int index = new Random().nextInt(violationType.length);
        return violationType[index];
    }

}
