package com.nikhilsable.notesapi.services;

import com.nikhilsable.notesapi.models.Note;

public interface AuditLogService {
    void logNoteCreation(String username, Note note);

    void logNoteUpdate(String username, Note note);

    void logNoteDeletion(String username, Long noteId);
}