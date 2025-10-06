package edu.lab.search;

public class CaseInsensitiveSearch implements Searchable {
    public CaseInsensitiveSearch(){}
    @Override
    public boolean search(String text, String key){
        // TODO: convert both to lower-case and use indexOf
        if (text == null || key == null) return false;
        return text.toLowerCase().indexOf(key.toLowerCase()) != -1;
        // throw new UnsupportedOperationException("TODO");
    }
    @Override
    public String replace(String text, String oldWord, String newWord){
        // TODO: implement a case-insensitive replace of all occurrences
        if (text == null || oldWord == null || newWord == null) return text;
        return text.replaceAll("(?i)" + oldWord, newWord);
        // throw new UnsupportedOperationException("TODO");
    }
}
