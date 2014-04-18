package common;

import java.util.*;

public class Employee {

    private String lastName;
    private String firstName;
    private String ssn;

    public Employee(final String lastName, final String firstName, final String ssn) throws IllegalArgumentException {
        setLastName(lastName);
        setFirstName(firstName);
        setSsn(ssn);
    }

    public final String getSsn() {
        return ssn;
    }

    @Override
    public String toString() {
        return "Employee{" + "lastName=" + lastName + ", firstName=" + firstName + ", ssn=" + ssn + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + (this.ssn != null ? this.ssn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if ((this.ssn == null) ? (other.ssn != null) : !this.ssn.equals(other.ssn)) {
            return false;
        }
        return true;
    }

    public final void setSsn(final String ssn) throws IllegalArgumentException {
        if (ssn == null || ssn.isEmpty()) {
            throw new IllegalArgumentException("SSN Cannot Be Empty or Null");
        }
        this.ssn = ssn;
    }

    public final String getFirstName() {
        return firstName;
    }

    public final void setFirstName(final String firstName) throws IllegalArgumentException {

        if (firstName == null || firstName.isEmpty()) {
            throw new IllegalArgumentException("First name cannot be Empty or Null");
        }
        this.firstName = firstName;
    }

    public final String getLastName() {
        return lastName;
    }

    public final void setLastName(final String lastName) throws IllegalArgumentException {

        if (lastName == null || lastName.isEmpty()) {
            throw new IllegalArgumentException("Last Name cannot be empty or Null");
        }
        this.lastName = lastName;
    }

}
