package org.spongycastle.crypto.prng;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes10.dex */
public class X931SecureRandom extends SecureRandom {
    private final X931RNG drbg;
    private final boolean predictionResistant;
    private final SecureRandom randomSource;

    X931SecureRandom(SecureRandom secureRandom, X931RNG x931rng, boolean z11) {
        this.randomSource = secureRandom;
        this.drbg = x931rng;
        this.predictionResistant = z11;
    }

    @Override // java.security.SecureRandom
    public byte[] generateSeed(int i11) {
        return EntropyUtil.generateSeed(this.drbg.getEntropySource(), i11);
    }

    @Override // java.security.SecureRandom, java.util.Random
    public void nextBytes(byte[] bArr) {
        synchronized (this) {
            try {
                if (this.drbg.generate(bArr, this.predictionResistant) < 0) {
                    this.drbg.reseed();
                    this.drbg.generate(bArr, this.predictionResistant);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.security.SecureRandom
    public void setSeed(byte[] bArr) {
        synchronized (this) {
            try {
                SecureRandom secureRandom = this.randomSource;
                if (secureRandom != null) {
                    secureRandom.setSeed(bArr);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.security.SecureRandom, java.util.Random
    public void setSeed(long j11) {
        synchronized (this) {
            try {
                SecureRandom secureRandom = this.randomSource;
                if (secureRandom != null) {
                    secureRandom.setSeed(j11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
