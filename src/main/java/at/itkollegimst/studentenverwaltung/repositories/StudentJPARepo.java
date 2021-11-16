package at.itkollegimst.studentenverwaltung.repositories;

import at.itkollegimst.studentenverwaltung.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//Typ und Schlüsseltyp
@Repository
public interface StudentJPARepo extends JpaRepository<Student, Long> {

    List<Student> findAllByPlz(String plz);




}
