package edu.sandbox.samples.ml.stellar;

import com.opencsv.bean.CsvToBeanBuilder;
import edu.sandbox.samples.ml.MetaProperties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public record StellarPresets
        (List<StellarObject> csvObjects)
        implements MetaProperties.Csv {

    private static final Logger LOG = LogManager.getLogger(StellarPresets.class);

    public static StellarPresets setup() {
        return new StellarPresets(newCsvObjects());
    }

    private static List<StellarObject> newCsvObjects() {
        try(var reader = Files.newBufferedReader(PATH_TO_TRAINING_DATA)) {
            LOG.info("Reading data from CSV...");
            return new CsvToBeanBuilder<StellarObject>(reader)
                    .withType(StellarObject.class)
                    .withSeparator(SEPARATOR)
                    .withSkipLines(SKIP_LINES)
                    .withIgnoreQuotations(IGNORE_QUOTATIONS)
                    .build()
                    .parse();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
