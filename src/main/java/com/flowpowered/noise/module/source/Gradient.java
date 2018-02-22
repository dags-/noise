package com.flowpowered.noise.module.source;

/**
 * @author dags <dags@dags.me>
 */
public interface Gradient extends Source {

    int getSeed();

    int getOctaveCount();

    double getFrequency();

    double getLacunarity();

    void setSeed(int seed);

    void setOctaveCount(int octaves);

    void setFrequency(double frequency);

    void setLacunarity(double lacunarity);
}
