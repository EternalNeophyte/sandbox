package edu.sandbox.samples.ml;

import java.nio.file.Path;

public interface MetaProperties {

    interface Csv {

        Path PATH_TO_TRAINING_DATA = Path.of("src\\main\\resources\\training\\star_classification.csv");
        char SEPARATOR = ',';
        int SKIP_LINES = 0;
        boolean IGNORE_QUOTATIONS = true;
    }

    interface Trainig {

        int BATCH_SIZE = 64, FINAL_IMG_SIDE = 100;
    }

    interface Testing {

    }
}
