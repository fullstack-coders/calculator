package com.app.calculator.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class RequestDto {

    @NotNull(message = "Please enter the operation")
    @Pattern(regexp = "^(?:sum|minus|multiply|divide)$", message = "Choose the correct operation")
    private String operationType;

    @NotNull(message = "Please enter elementOne")
    private Double elementOne;

    @NotNull(message = "Please enter elementTwo")
    private Double elementTwo;

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public Double getElementOne() {
        return elementOne;
    }

    public void setElementOne(Double elementOne) {
        this.elementOne = elementOne;
    }

    public Double getElementTwo() {
        return elementTwo;
    }

    public void setElementTwo(Double elementTwo) {
        this.elementTwo = elementTwo;
    }
}
