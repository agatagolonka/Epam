package com.epam.test.automation.java.practice13.part1;


public class Word implements Comparable<Word> {

    private String content = "";
    private int frequency = 0;

    public Word(String content) {
        if (content == null) {
            throw new UnsupportedOperationException();
        }
        this.content = content;
        frequency = 1;

    }

    public String getContent() {
        if (content != null) {
            return content;
        } else
            throw new UnsupportedOperationException();
    }

    public int getFrequency() {
        if (frequency > 0) {
            return frequency;
        } else
            throw new UnsupportedOperationException();
    }

    public void setFrequency(int frequency) {
        if (frequency > 0) {
            this.frequency = this.frequency + 1;
        } else
            throw new UnsupportedOperationException();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null)
            return false;
        if (getClass() != o.getClass())
            return false;
        Word other = (Word) o;
        if (content == null) {
            if (other.content != null)
                return false;
        } else if (!content.equals(other.content))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        return this.hashCode();
    }

    @Override
    public int compareTo(Word o) {
        if (o.getContent() == null) {
            throw new UnsupportedOperationException();
        }
        return content.compareTo(o.getContent());
    }

    @Override
    public String toString() {
        return content + " : " + frequency;
    }

}
