package edu.sandbox.samples.ml;

import ai.djl.basicdataset.cv.classification.ImageFolder;
import ai.djl.modality.cv.transform.Resize;
import ai.djl.modality.cv.transform.ToTensor;
import ai.djl.repository.Repository;
import ai.djl.translate.TranslateException;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class Runner {



    public static void main(String... args) throws TranslateException, IOException {
        int batchSize = 64;

        Repository repository = Repository.newInstance("starfolder", Path.of("stellar_classification"));
        ImageFolder dataset = ImageFolder.builder()
                .setRepository(repository)
                .addTransform(new Resize(100, 100))
                .addTransform(new ToTensor())
                .setSampling(batchSize, true)
                .build();
        // call prepare before using
        dataset.prepare();

        // to get the synset
        List<String> synset = dataset.getSynset();

        //https://docs.djl.ai/jupyter/tutorial/01_create_your_first_network.html
    }
}
