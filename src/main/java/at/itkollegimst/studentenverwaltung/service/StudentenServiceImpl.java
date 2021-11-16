package at.itkollegimst.studentenverwaltung.service;

import at.itkollegimst.studentenverwaltung.domain.Student;
import at.itkollegimst.studentenverwaltung.exceptions.StudentNichtGefunden;
import at.itkollegimst.studentenverwaltung.repositories.DbZugriffStudenten;

import java.util.List;

public class StudentenServiceImpl implements StudentenService {


    private DbZugriffStudenten dbZugriffStudenten;

    //Technologieneutraler Zugriff
    //Normal mit Geschäftslogik
    public StudentenServiceImpl(DbZugriffStudenten dbZugriffStudenten) {
        this.dbZugriffStudenten = dbZugriffStudenten;
    }

    @Override
    public List<Student> alleStudent() {

        return this.dbZugriffStudenten.alleStudenten();
    }

    @Override
    public Student studentEinfuegen(Student student) {

        return this.dbZugriffStudenten.studentSpeichern(student);
    }

    @Override
    public Student studentMitId(Long id) throws StudentNichtGefunden {

        return this.dbZugriffStudenten.studentMitId(id);
    }

    @Override
    public List<Student> alleStudentenMitPlz(String plz) {
        return this.dbZugriffStudenten.alleStudentenAusDemOrt(plz);

    }

    @Override
    public void studentLoeschenMitId(Long id) {
        this.dbZugriffStudenten.studentLoeschenMitId(id);
    }
}
