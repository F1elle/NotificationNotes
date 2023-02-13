package com.f1elle.notificationnotes.di

import android.app.Application
import androidx.room.Room
import com.f1elle.notificationnotes.feature_reminders.data.data_source.NoteDataBase
import com.f1elle.notificationnotes.feature_reminders.data.repository.NoteRepositoryImpl
import com.f1elle.notificationnotes.feature_reminders.domain.repository.NoteRepository
import com.f1elle.notificationnotes.feature_reminders.domain.use_case.DeleteNote
import com.f1elle.notificationnotes.feature_reminders.domain.use_case.GetNotes
import com.f1elle.notificationnotes.feature_reminders.domain.use_case.NoteUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideNoteDatabase(app: Application) : NoteDataBase {
        return Room.databaseBuilder(
            app,
            NoteDataBase::class.java,
            NoteDataBase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(db: NoteDataBase): NoteRepository{
        return NoteRepositoryImpl(db.noteDao)
    }

    @Provides
    @Singleton
    fun provideNoteUseCases(repository: NoteRepository): NoteUseCases{
        return NoteUseCases(getNotes = GetNotes(repository),
        deleteNote = DeleteNote(repository)
        )
    }
}