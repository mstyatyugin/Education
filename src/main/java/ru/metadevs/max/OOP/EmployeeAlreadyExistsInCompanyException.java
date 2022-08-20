package ru.metadevs.max.OOP;

public class EmployeeAlreadyExistsInCompanyException extends IllegalArgumentException {
    public EmployeeAlreadyExistsInCompanyException(String message){
        super(message);
    }
}
