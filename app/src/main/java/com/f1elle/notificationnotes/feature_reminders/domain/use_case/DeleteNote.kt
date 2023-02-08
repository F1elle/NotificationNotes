package com.f1elle.notificationnotes.feature_reminders.domain.use_case

import com.f1elle.notificationnotes.feature_reminders.domain.model.Note
import com.f1elle.notificationnotes.feature_reminders.domain.repository.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(note: Note){
        repository.deleteNote(note)
    }
}