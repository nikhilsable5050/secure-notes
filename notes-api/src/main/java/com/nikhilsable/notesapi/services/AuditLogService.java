package com.nikhilsable.notesapi.services;

import com.nikhilsable.notesapi.models.AuditLog;
import com.nikhilsable.notesapi.models.Note;

import java.util.List;

public interface AuditLogService {
    void logNoteCreation(String username, Note note);

    void logNoteUpdate(String username, Note note);

    void logNoteDeletion(String username, Long noteId);

    List<AuditLog> getAllAuditLogs();

    List<AuditLog> getAuditLogsForNoteId(Long id);
}