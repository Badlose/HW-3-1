package ru.hogwarts.school.Service;

import ru.hogwarts.school.Model.Faculty;

import java.util.Collection;

public interface FacultyService {

    Faculty addFaculty(Faculty faculty);


    void removeFaculty(long id);


    Faculty editFaculty(Faculty faculty);

    Faculty getFaculty(long id);

    Collection<Faculty> getAllFaculties();

}