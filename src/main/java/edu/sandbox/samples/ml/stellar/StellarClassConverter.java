package edu.sandbox.samples.ml.stellar;

import com.opencsv.bean.AbstractBeanField;

import static edu.sandbox.samples.ml.stellar.StellarClass.*;

public class StellarClassConverter extends AbstractBeanField<String, StellarClass> {

    @Override
    protected Object convert(String value) {
        return switch (value) {
            case "GALAXY" -> GALAXY;
            case "STAR" -> STAR;
            case "QSO" -> QSO;
            default -> throw new IllegalArgumentException("Invalid definition of stellar class: " + value);
        };
    }
}
