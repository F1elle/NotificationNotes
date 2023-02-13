package com.f1elle.notificationnotes.feature_reminders.presentation.notes

import androidx.lifecycle.ViewModel
import com.f1elle.notificationnotes.feature_reminders.domain.use_case.NoteUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NotesViewModel @Inject constructor(
    private val noteUseCases: NoteUseCases
): ViewModel(){
    fun onEvent(event: NotesEvent){
        when (event){
            is NotesEvent.DeleteNote ->{

            }
            is NotesEvent.RestoreNote ->{

            }
        }
    }
}