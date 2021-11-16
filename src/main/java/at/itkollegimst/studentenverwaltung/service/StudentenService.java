package at.itkollegimst.studentenverwaltung.service;

import at.itkollegimst.studentenverwaltung.domain.Student;
import at.itkollegimst.studentenverwaltung.exceptions.StudentNichtGefunden;

import java.util.List;

public interface StudentenService {

    //CRUD simpeln
    List<Student> alleStudent();
    Student studentEinfuegen(Student student);
    Student studentMitId(Long id) throws StudentNichtGefunden;
    List<Student> alleStudentenMitPlz(String plt);
    void studentLoeschenMitId(Long id);

}
