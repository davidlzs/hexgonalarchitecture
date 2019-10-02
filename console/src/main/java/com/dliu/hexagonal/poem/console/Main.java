package com.dliu.hexagonal.poem.console;

import com.dliu.hexagonal.poem.PoemReader;
import com.dliu.hexagonal.poem.ports.ObtainPoems;
import com.dliu.hexagonal.poem.ports.RequestVerses;
import com.dliu.hexgonal.poem.adapters.ConsoleAdapter;
import com.dliu.hexgonal.poem.adapters.PoetryLibraryFileAdapter;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ObtainPoems poetryLibrary = new PoetryLibraryFileAdapter("/poem.txt");

        RequestVerses poemReader = new PoemReader(poetryLibrary);

        ConsoleAdapter consoleAdapter = new ConsoleAdapter(poemReader);

        System.out.println("Here is some poetry:\n");

        System.out.println(consoleAdapter.ask());

        System.out.println("\nPress any key to finish");

        System.in.read();


    }
}
