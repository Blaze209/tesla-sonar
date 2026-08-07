package org.spongycastle.crypto.prng;

import java.security.SecureRandom;
import org.spongycastle.crypto.prng.drbg.SP80090DRBG;

/* JADX INFO: loaded from: classes10.dex */
public class SP800SecureRandom extends SecureRandom {
    private SP80090DRBG drbg;
    private final DRBGProvider drbgProvider;
    private final EntropySource entropySource;
    private final boolean predictionResistant;
    private final SecureRandom randomSource;

    SP800SecureRandom(SecureRandom secureRandom, EntropySource entropySource, DRBGProvider dRBGProvider, boolean z11) {
        this.randomSource = secureRandom;
        this.entropySource = entropySource;
        this.drbgProvider = dRBGProvider;
        this.predictionResistant = z11;
    }

    @Override // java.security.SecureRandom
    public byte[] generateSeed(int i11) {
        return EntropyUtil.generateSeed(this.entropySource, i11);
    }

    @Override // java.security.SecureRandom, java.util.Random
    public void nextBytes(byte[] bArr) {
        synchronized (this) {
            try {
                if (this.drbg == null) {
                    this.drbg = this.drbgProvider.get(this.entropySource);
                }
                if (this.drbg.generate(bArr, null, this.predictionResistant) < 0) {
                    this.drbg.reseed(null);
                    this.drbg.generate(bArr, null, this.predictionResistant);
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
