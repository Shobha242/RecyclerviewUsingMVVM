package com.example.recyclerviewusingmvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewusingmvvm.viewmodel.StudentViewModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv_student;
    private List<StudentViewModel> list = new ArrayList<>();
    StudentListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        rv_student = findViewById(R.id.rv_student);
        studentListData(list);
        adapter = new StudentListAdapter(list, getApplicationContext());
        rv_student.setAdapter(adapter);

    }

    public void studentListData(List<StudentViewModel> list) {
        list.clear();
        for (int i = 0; i < 5; i++) {
            StudentViewModel studentViewModel = new StudentViewModel();
            studentViewModel.email = "xyz@gmail.com";
            studentViewModel.name = "xyz";
            list.add(studentViewModel);

        }
    }
}