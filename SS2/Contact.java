package Java2.SS2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contact {
    private static String name,telNumber;

    public Contact(String name, String telNumber) {
        this.name = name;
        this.telNumber = telNumber;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }
}

