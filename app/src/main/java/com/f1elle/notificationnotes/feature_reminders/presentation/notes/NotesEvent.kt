package com.f1elle.notificationnotes.feature_reminders.presentation.notes

import com.f1elle.notificationnotes.feature_reminders.domain.model.Note

sealed class NotesEvent{
    data class DeleteNote(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
}
