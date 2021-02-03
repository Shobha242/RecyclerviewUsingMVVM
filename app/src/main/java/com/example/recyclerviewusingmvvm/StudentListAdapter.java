package com.example.recyclerviewusingmvvm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewusingmvvm.databinding.StudentBinding;
import com.example.recyclerviewusingmvvm.viewmodel.StudentViewModel;

import java.util.List;

public class StudentListAdapter extends RecyclerView.Adapter<StudentListAdapter.MyViewHodler> {
    List<StudentViewModel> list;
    Context context;
    private LayoutInflater inflater;

    public StudentListAdapter(List<StudentViewModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHodler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (inflater == null) {
            inflater = LayoutInflater.from(parent.getContext());
        }
        StudentBinding studentBinding = StudentBinding.inflate(inflater, parent, false);
        return new MyViewHodler(studentBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentListAdapter.MyViewHodler holder, int position) {

        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHodler extends RecyclerView.ViewHolder {
        private StudentBinding studentBinding;

        public MyViewHodler(StudentBinding studentBinding) {
            super(studentBinding.getRoot());
            this.studentBinding = studentBinding;
        }

        public void bind(StudentViewModel studentViewModel) {
            this.studentBinding.setViewModel(studentViewModel);
        }

        public StudentBinding getStudentBinding() {
            return studentBinding;
        }
    }
}
