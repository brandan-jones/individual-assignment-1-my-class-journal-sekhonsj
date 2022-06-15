package edu.uc.cech.soit.myclassjournal.service;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class IJournalServiceStub implements IJournalService{

    List journalEntries = new ArrayList<JournalEntry>();

    @Override
    public void save(JournalEntry journalEntry) {
        JournalEntry entry = new JournalEntry();
        entry.setNotes("My first entry!");
        entry.setDate("October 2021");
        journalEntries.add(entry);
    }

    @Override
    public List<JournalEntry> fetchAll() {
        return journalEntries;
    }
}
