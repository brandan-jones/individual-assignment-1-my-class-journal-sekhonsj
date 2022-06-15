package edu.uc.cech.soit.myclassjournal.service;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class IJournalServiceStub implements IJournalService{

    @Override
    public void save(JournalEntry journalEntry) {

    }

    @Override
    public List<JournalEntry> fetchAll() {
        JournalEntry entry = new JournalEntry();
        entry.setNotes("My first entry!");
        entry.setDate("October 2021");
        List journalEntries = new ArrayList<JournalEntry>();
        journalEntries.add(entry);
        return journalEntries;
    }
}
