package com.example.recyclerviewusingmvvm.viewmodel;

import androidx.lifecycle.ViewModel;

import com.example.recyclerviewusingmvvm.model.StudentModel;

public class StudentViewModel extends ViewModel {
    public String name, email;

    public StudentViewModel() {
    }

    public StudentViewModel(StudentModel studentModel) {
        this.name = name;
        this.email = email;
    }
}
