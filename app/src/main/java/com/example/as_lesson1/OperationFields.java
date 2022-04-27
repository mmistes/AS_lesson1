package com.example.as_lesson1;

public class OperationFields {
    private String resultField;      //Поле результата
    private String operationField;   //Поле операции
    private String entryField;  //Поле ввода

    /*Хранить результат вычислений, а так же число, которое попадает в поле результата после
    нажатия кнопки операции будем в переменной типа double
     */
    private double resultNumber;

    //Переводим из String переменной entryField в переменную типа double entryNumber
    private double entryNumber;

    public OperationFields(String result, String operation, String entryField) {
        this.resultField = result;
        this.operationField = operation;
        this.entryField = entryField;
    }

    public String getResult() {
        return resultField;
    }

    public void setResult(String result) {
        this.resultField = result;
    }

    public String getOperation() {
        return operationField;
    }

    public void setOperation(String operation) {
        this.operationField = operation;
    }

    public String getEntryField() {
        return entryField;
    }

    public void setEntryField(String entryField) {
        this.entryField = entryField;
    }
}
