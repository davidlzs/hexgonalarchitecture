package com.dliu.hexgonal.poem.adapters;

import com.dliu.hexagonal.poem.ports.ObtainPoems;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class PoetryLibraryFileAdapter implements ObtainPoems {
    private String poem;

    public PoetryLibraryFileAdapter(String filePath) {

        try {
            URI uri = this.getClass().getResource(filePath).toURI();
            List<String> lines = Files.readAllLines(Paths.get(uri));
            poem = String.join("\n", lines);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getAPoem() {
        return poem;
    }
}
