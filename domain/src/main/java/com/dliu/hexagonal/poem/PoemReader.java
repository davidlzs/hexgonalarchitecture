package com.dliu.hexagonal.poem;

import com.dliu.hexagonal.poem.ports.ObtainPoems;
import com.dliu.hexagonal.poem.ports.RequestVerses;

public class PoemReader implements RequestVerses {
    private final ObtainPoems poemLibrary;

    public PoemReader(ObtainPoems poemLibrary) {
        this.poemLibrary = poemLibrary;
    }

    @Override
    public String giveMeSomePoetry() {
        return poemLibrary.getAPoem();
    }
}
