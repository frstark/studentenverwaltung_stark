package at.itkollegimst.studentenverwaltung;

import at.itkollegimst.studentenverwaltung.domain.Student;
import at.itkollegimst.studentenverwaltung.repositories.DbZugriffStudenten;
import at.itkollegimst.studentenverwaltung.repositories.StudentJPARepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentenverwaltungApplication implements ApplicationRunner {



    @Autowired
    DbZugriffStudenten dbZugriffStudenten;
    // StudentJPARepo studentJPARepo; <- Alt

    public static void main(String[] args) {
        SpringApplication.run(StudentenverwaltungApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        this.dbZugriffStudenten.studentSpeichern(new Student("Frank Stark", "6555"));
        this.dbZugriffStudenten.studentSpeichern(new Student("Thomas Müller", "6500"));
        this.dbZugriffStudenten.studentSpeichern(new Student("Franz Gruber", "6460"));

        /*this.studentJPARepo.save(new Student("Frank Stark", "6555")); <- Alt
        this.studentJPARepo.save(new Student("Thomas Müller", "6500"));
        this.studentJPARepo.save(new Student("Franz Gruber", "6460"));*/


    }
}
