package it.unical.inf.asd.dao;

import it.unical.inf.asd.dto.StudentDTO;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAOImpl implements StudentDAO
{
    public StudentDTO createNewStudent()
    {
        StudentDTO e = new StudentDTO();
        e.setId(1);
        e.setFirstName("Lokesh");
        e.setLastName("Gupta");
        return e;
    }
}