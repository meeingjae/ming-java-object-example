package mingtoy.domain.util;

import mingtoy.impldomain.Person;

import java.util.function.Function;

public interface PersonValidator extends Function<Person, PersonValidator.PersonValidType> {

    static PersonValidator nameValidation() {

        return value -> value.getName().startsWith("kim") ? PersonValidType.SUCCESS : PersonValidType.INVALID_NAME;
    }

    static PersonValidator emailValidation() {

        return value -> value.getEmail().contains("@") ? PersonValidType.SUCCESS : PersonValidType.INVALID_EMAIL;
    }

    static PersonValidator mobileValidation() {

        return value -> value.getMobileNumber().startsWith("10") ?
                PersonValidType.SUCCESS :
                PersonValidType.INVALID_MOBILE_NUMBER;
    }

    default PersonValidator and(PersonValidator personValidator) {

        return person -> {
            PersonValidType result = this.apply(person);
            return result.equals(PersonValidType.SUCCESS) ? personValidator.apply(person) : result;
        };

    }

    enum PersonValidType {
        SUCCESS,
        INVALID_NAME,
        INVALID_EMAIL,
        INVALID_MOBILE_NUMBER;
    }
}


