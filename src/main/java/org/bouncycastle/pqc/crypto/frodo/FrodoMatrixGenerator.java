package org.bouncycastle.pqc.crypto.frodo;

import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes10.dex */
abstract class FrodoMatrixGenerator {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f99070n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f99071q;

    static class Aes128MatrixGenerator extends FrodoMatrixGenerator {
        public Aes128MatrixGenerator(int i11, int i12) {
            super(i11, i12);
        }

        @Override // org.bouncycastle.pqc.crypto.frodo.FrodoMatrixGenerator
        short[] genMatrix(byte[] bArr) {
            int i11 = this.f99070n;
            short[] sArr = new short[i11 * i11];
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[16];
            AESEngine aESEngine = new AESEngine();
            aESEngine.init(true, new KeyParameter(bArr));
            for (int i12 = 0; i12 < this.f99070n; i12++) {
                Pack.shortToLittleEndian((short) i12, bArr2, 0);
                for (int i13 = 0; i13 < this.f99070n; i13 += 8) {
                    Pack.shortToLittleEndian((short) i13, bArr2, 2);
                    aESEngine.processBlock(bArr2, 0, bArr3, 0);
                    for (int i14 = 0; i14 < 8; i14++) {
                        sArr[(this.f99070n * i12) + i13 + i14] = (short) (Pack.littleEndianToShort(bArr3, i14 * 2) & (this.f99071q - 1));
                    }
                }
            }
            return sArr;
        }
    }

    static class Shake128MatrixGenerator extends FrodoMatrixGenerator {
        public Shake128MatrixGenerator(int i11, int i12) {
            super(i11, i12);
        }

        @Override // org.bouncycastle.pqc.crypto.frodo.FrodoMatrixGenerator
        short[] genMatrix(byte[] bArr) {
            int i11 = this.f99070n;
            short[] sArr = new short[i11 * i11];
            int i12 = (i11 * 16) / 8;
            byte[] bArr2 = new byte[i12];
            int length = bArr.length + 2;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, 0, bArr3, 2, bArr.length);
            SHAKEDigest sHAKEDigest = new SHAKEDigest(128);
            for (short s11 = 0; s11 < this.f99070n; s11 = (short) (s11 + 1)) {
                Pack.shortToLittleEndian(s11, bArr3, 0);
                sHAKEDigest.update(bArr3, 0, length);
                sHAKEDigest.doFinal(bArr2, 0, i12);
                short s12 = 0;
                while (true) {
                    int i13 = this.f99070n;
                    if (s12 < i13) {
                        sArr[(i13 * s11) + s12] = (short) (Pack.littleEndianToShort(bArr2, s12 * 2) & (this.f99071q - 1));
                        s12 = (short) (s12 + 1);
                    }
                }
            }
            return sArr;
        }
    }

    public FrodoMatrixGenerator(int i11, int i12) {
        this.f99070n = i11;
        this.f99071q = i12;
    }

    abstract short[] genMatrix(byte[] bArr);
}
