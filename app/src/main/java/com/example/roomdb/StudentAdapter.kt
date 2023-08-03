package com.example.roomdb

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StudentAdapter(private val students: List<Student>) :
    RecyclerView.Adapter<StudentAdapter.StudentViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_student, parent, false)
        return StudentViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        val currentStudent = students[position]
        holder.bind(currentStudent)
    }

    override fun getItemCount(): Int {
        return students.size
    }

    inner class StudentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // Customize these views based on your item_student.xml layout
        private val tvStudentName: TextView = itemView.findViewById(R.id.tvStudentName)
        private val tvStudentRollNo: TextView = itemView.findViewById(R.id.tvStudentRollNo)

        fun bind(student: Student) {
            // Bind data to views
            tvStudentName.text = "Name: ${student.firstName} ${student.lastName}"
            tvStudentRollNo.text = "Roll No: ${student.rollNo}"
            // Add bindings for other views if needed
        }
    }
}
