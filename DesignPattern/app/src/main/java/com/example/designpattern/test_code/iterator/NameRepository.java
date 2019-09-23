package com.example.designpattern.test_code.iterator;

public class NameRepository implements Container<String> {
    private String[] names = {"Robert" , "John" ,"Julie" , "Lora"};

    @Override
    public Iterator<String> getIterator() {
        return new NewIterator();
    }

    private class NewIterator implements Iterator<String> {
        private int index;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public String next() {
            if (this.hasNext()) {
                return names[index ++];
            }
            return null;
        }
    }

}
