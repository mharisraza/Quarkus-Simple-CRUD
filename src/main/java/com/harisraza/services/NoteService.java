package com.harisraza.services;

import com.harisraza.models.Note;

public interface NoteService {

    Note createNote(Note note);
    Note updateNote(int noteId, Note noteToUpdate);
    Note getNote(int noteId);
    void deleteNote(int noteId);
    
}
