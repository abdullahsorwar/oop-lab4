package edu.lab.text;
import edu.lab.api.Analyzer;

public class SimpleAnalyzer implements Analyzer {
    public SimpleAnalyzer(){}

    @Override
    public int countWords(String text){
        // TODO: count words splitting on whitespace; handle null/empty as 0
        if (text == null || text.trim().isEmpty()) return 0;
        String[] words = text.trim().split("\\s+");
        return words.length;
        // throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int countCharacters(String text){
        // TODO: return text length; null => 0
        return text.length();
        // throw new UnsupportedOperationException("TODO");
    }

    @Override
    public boolean containsSubstring(String text, String sub){
        // TODO: true if sub occurs within text (case-sensitive)
        if (text == null || sub == null) return false;
        return text.contains(sub);
        // throw new UnsupportedOperationException("TODO");
    }
}
