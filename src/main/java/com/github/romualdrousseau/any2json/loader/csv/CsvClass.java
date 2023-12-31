package com.github.romualdrousseau.any2json.loader.csv;

import com.github.romualdrousseau.any2json.Document;
import com.github.romualdrousseau.any2json.DocumentClass;

public class CsvClass implements DocumentClass
{
    public Priority getPriority() {
        return Priority.HIGH;
    }

    public Document newInstance() {
        return new CsvDocument();
    }
}
