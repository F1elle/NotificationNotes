package com.f1elle.notificationnotes.feature_reminders.presentation.notes

import com.f1elle.notificationnotes.feature_reminders.domain.model.Note

data class NotesState(
    val notes: List<Note> = emptyList()
)
