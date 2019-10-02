package com.dliu.hexagonal.poem.adapters;

import com.dliu.hexagonal.poem.ports.RequestVerses;

public class ConsoleAdapter {
    private final RequestVerses poetryReader;

    public ConsoleAdapter(RequestVerses poetryReader) {
        this.poetryReader = poetryReader;
    }

    public String ask() {
        return poetryReader.giveMeSomePoetry();
    }
}
