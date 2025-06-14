package com.byexpert.javafx.mvvmapp;

public class EmploymentRequestConverter {

    public EmploymentRequest toEmploymentRequest(EmploymentRequestViewModel viewModel) {
        return new EmploymentRequest(
                viewModel.getName(),
                viewModel.getPosition(),
                viewModel.getAnnualSalary()
        );
    }
}
