package com.codersongs.designpatterns.iterator;

public class NameRepository implements Container{
    public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

    public Iterator iterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator{
        int cursor;

        public boolean hasNext() {
            if (cursor >= names.length) return false;
            return true;
        }

        public Object next() {
            if (hasNext()) return names[cursor++];
            return null;
        }
    }
}
