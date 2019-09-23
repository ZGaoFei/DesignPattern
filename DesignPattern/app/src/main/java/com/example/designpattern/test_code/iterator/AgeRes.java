package com.example.designpattern.test_code.iterator;

public class AgeRes implements Container<Integer> {
    private int[] ages = {20, 21, 22, 23, 24, 25};

    @Override
    public Iterator<Integer> getIterator() {
        return new NextIterator();
    }

    private class NextIterator implements Iterator<Integer> {
        private int index;

        @Override
        public boolean hasNext() {
            return index < ages.length;
        }

        @Override
        public Integer next() {
            if (this.hasNext()) {
                return ages[index++];
            }
            return -1;
        }
    }
}
