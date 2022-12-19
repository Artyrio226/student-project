package edu.javacourse.studentorder.validator.register;

import edu.javacourse.studentorder.register.CityRegisterCheckerResponse;
import edu.javacourse.studentorder.domain.Person;
import edu.javacourse.studentorder.exception.CityRegisterException;
import edu.javacourse.studentorder.validator.register.CityRegisterChecker;

public class RealCityRegisterChecker implements CityRegisterChecker {

    public CityRegisterCheckerResponse checkPerson(Person person) throws CityRegisterException {
        return null;
    }
}
