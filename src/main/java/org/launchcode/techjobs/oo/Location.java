package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Location extends JobField {

    public Location(String value) {
        super(value);
    } // What this does is call the constructor of the parent class, JobField, and pass the value
}
//    // Custom toString, equals, and hashCode methods:
//
//    @Override
//    public String toString() {
//        return value;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Location)) return false;
//        Location location = (Location) o;
//        return getId() == location.getId();
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getId());
//    }
//
//    // Getters and Setters:
//
//    public int getId() {
//        return id;
//    }
//
//    public String getValue() {
//        return value;
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }
//
//}


