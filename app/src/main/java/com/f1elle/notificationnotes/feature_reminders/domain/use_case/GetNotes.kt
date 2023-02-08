package com.f1elle.notificationnotes.feature_reminders.domain.use_case

import com.f1elle.notificationnotes.feature_reminders.domain.model.Note
import com.f1elle.notificationnotes.feature_reminders.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class GetNotes(
    private val repository: NoteRepository
) {
    operator fun invoke(): Flow<List<Note>>{
        return repository.getNotes()
    }
}