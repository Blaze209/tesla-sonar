package org.bouncycastle.jcajce.provider.drbg;

import java.security.SecureRandom;
import org.bouncycastle.crypto.prng.EntropySource;
import org.bouncycastle.crypto.prng.EntropySourceProvider;

/* JADX INFO: loaded from: classes9.dex */
class IncrementalEntropySourceProvider implements EntropySourceProvider {
    private final boolean predictionResistant;
    private final SecureRandom random;

    public IncrementalEntropySourceProvider(SecureRandom secureRandom, boolean z11) {
        this.random = secureRandom;
        this.predictionResistant = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void sleep(long j11) throws InterruptedException {
        if (j11 != 0) {
            Thread.sleep(j11);
        }
    }

    @Override // org.bouncycastle.crypto.prng.EntropySourceProvider
    public EntropySource get(int i11) {
        return new IncrementalEntropySource(i11) { // from class: org.bouncycastle.jcajce.provider.drbg.IncrementalEntropySourceProvider.1
            final int numBytes;
            final /* synthetic */ int val$bitsRequired;

            {
                this.val$bitsRequired = i11;
                this.numBytes = (i11 + 7) / 8;
            }

            @Override // org.bouncycastle.crypto.prng.EntropySource
            public int entropySize() {
                return this.val$bitsRequired;
            }

            @Override // org.bouncycastle.crypto.prng.EntropySource
            public byte[] getEntropy() {
                try {
                    return getEntropy(0L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new IllegalStateException("initial entropy fetch interrupted");
                }
            }

            @Override // org.bouncycastle.crypto.prng.EntropySource
            public boolean isPredictionResistant() {
                return IncrementalEntropySourceProvider.this.predictionResistant;
            }

            @Override // org.bouncycastle.jcajce.provider.drbg.IncrementalEntropySource
            public byte[] getEntropy(long j11) throws InterruptedException {
                int i12;
                int i13 = this.numBytes;
                byte[] bArr = new byte[i13];
                int i14 = 0;
                while (true) {
                    i12 = this.numBytes;
                    if (i14 >= i12 / 8) {
                        break;
                    }
                    IncrementalEntropySourceProvider.sleep(j11);
                    byte[] bArrGenerateSeed = IncrementalEntropySourceProvider.this.random.generateSeed(8);
                    System.arraycopy(bArrGenerateSeed, 0, bArr, i14 * 8, bArrGenerateSeed.length);
                    i14++;
                }
                int i15 = i12 - ((i12 / 8) * 8);
                if (i15 != 0) {
                    IncrementalEntropySourceProvider.sleep(j11);
                    byte[] bArrGenerateSeed2 = IncrementalEntropySourceProvider.this.random.generateSeed(i15);
                    System.arraycopy(bArrGenerateSeed2, 0, bArr, i13 - bArrGenerateSeed2.length, bArrGenerateSeed2.length);
                }
                return bArr;
            }
        };
    }
}
