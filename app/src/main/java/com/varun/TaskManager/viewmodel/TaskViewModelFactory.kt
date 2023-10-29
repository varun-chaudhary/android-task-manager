package com.varun.TaskManager.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.varun.TaskManager.repository.TaskRepository

class TaskViewModelFactory(private val taskRepository: TaskRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(TaskViewModel::class.java)) {
            return TaskViewModel(taskRepository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}