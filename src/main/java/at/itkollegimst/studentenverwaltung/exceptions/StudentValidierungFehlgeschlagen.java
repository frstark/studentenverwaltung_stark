package at.itkollegimst.studentenverwaltung.exceptions;

import at.itkollegimst.studentenverwaltung.domain.Student;

public class StudentValidierungFehlgeschlagen  extends Exception {
    public StudentValidierungFehlgeschlagen(String message) {
        super(message);
    }
}
