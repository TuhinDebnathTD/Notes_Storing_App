package com.example.notesstoringapplication;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dH\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001f"}, d2 = {"Lcom/example/notesstoringapplication/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/example/notesstoringapplication/NoteClickInterface;", "Lcom/example/notesstoringapplication/NoteClickDeleteInterface;", "()V", "addFAB", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "getAddFAB", "()Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "setAddFAB", "(Lcom/google/android/material/floatingactionbutton/FloatingActionButton;)V", "notesRV", "Landroidx/recyclerview/widget/RecyclerView;", "getNotesRV", "()Landroidx/recyclerview/widget/RecyclerView;", "setNotesRV", "(Landroidx/recyclerview/widget/RecyclerView;)V", "viewModal", "Lcom/example/notesstoringapplication/NoteViewModal;", "getViewModal", "()Lcom/example/notesstoringapplication/NoteViewModal;", "setViewModal", "(Lcom/example/notesstoringapplication/NoteViewModal;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDeleteIconClick", "note", "Lcom/example/notesstoringapplication/Note;", "onNoteClick", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements com.example.notesstoringapplication.NoteClickInterface, com.example.notesstoringapplication.NoteClickDeleteInterface {
    public com.example.notesstoringapplication.NoteViewModal viewModal;
    public androidx.recyclerview.widget.RecyclerView notesRV;
    public com.google.android.material.floatingactionbutton.FloatingActionButton addFAB;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.notesstoringapplication.NoteViewModal getViewModal() {
        return null;
    }
    
    public final void setViewModal(@org.jetbrains.annotations.NotNull()
    com.example.notesstoringapplication.NoteViewModal p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView getNotesRV() {
        return null;
    }
    
    public final void setNotesRV(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.floatingactionbutton.FloatingActionButton getAddFAB() {
        return null;
    }
    
    public final void setAddFAB(@org.jetbrains.annotations.NotNull()
    com.google.android.material.floatingactionbutton.FloatingActionButton p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onNoteClick(@org.jetbrains.annotations.NotNull()
    com.example.notesstoringapplication.Note note) {
    }
    
    @java.lang.Override()
    public void onDeleteIconClick(@org.jetbrains.annotations.NotNull()
    com.example.notesstoringapplication.Note note) {
    }
}