package edu.sandbox.samples.csv;

import edu.sandbox.samples.ml.stellar.StellarPresets;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCsvParsing {

    private final StellarPresets presets = StellarPresets.setup();

    @Test
    public void testParsingTrainingData() {
        var csvObjects = presets.csvObjects();
        assertEquals(100_000, csvObjects.size());
    }
}
