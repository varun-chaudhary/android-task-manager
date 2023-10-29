package com.varun.TaskManager.viewmodel

import com.varun.TaskManager.database.Task

data class TaskUiState(
    val tasks: List<Task>? = null,
    val errorMessage: String? = null,
    val taskToBeDeleted: Task? = null,
)
