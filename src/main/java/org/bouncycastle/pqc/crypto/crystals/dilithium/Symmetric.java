package org.bouncycastle.pqc.crypto.crystals.dilithium;

import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.modes.SICBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: classes10.dex */
abstract class Symmetric {
    final int stream128BlockBytes;
    final int stream256BlockBytes;

    @Deprecated
    static class AesSymmetric extends Symmetric {
        private final StreamCipher cipher;

        AesSymmetric() {
            super(64, 64);
            this.cipher = SICBlockCipher.newInstance(AESEngine.newInstance());
        }

        private void aes128(byte[] bArr, int i11, int i12) {
            this.cipher.processBytes(new byte[i12], 0, i12, bArr, i11);
        }

        private void streamInit(byte[] bArr, short s11) {
            byte[] bArr2 = new byte[12];
            bArr2[0] = (byte) s11;
            bArr2[1] = (byte) (s11 >> 8);
            this.cipher.init(true, new ParametersWithIV(new KeyParameter(bArr, 0, 32), bArr2));
        }

        @Override // org.bouncycastle.pqc.crypto.crystals.dilithium.Symmetric
        void stream128init(byte[] bArr, short s11) {
            streamInit(bArr, s11);
        }

        @Override // org.bouncycastle.pqc.crypto.crystals.dilithium.Symmetric
        void stream128squeezeBlocks(byte[] bArr, int i11, int i12) {
            aes128(bArr, i11, i12);
        }

        @Override // org.bouncycastle.pqc.crypto.crystals.dilithium.Symmetric
        void stream256init(byte[] bArr, short s11) {
            streamInit(bArr, s11);
        }

        @Override // org.bouncycastle.pqc.crypto.crystals.dilithium.Symmetric
        void stream256squeezeBlocks(byte[] bArr, int i11, int i12) {
            aes128(bArr, i11, i12);
        }
    }

    static class ShakeSymmetric extends Symmetric {
        private final SHAKEDigest digest128;
        private final SHAKEDigest digest256;

        ShakeSymmetric() {
            super(168, 136);
            this.digest128 = new SHAKEDigest(128);
            this.digest256 = new SHAKEDigest(256);
        }

        private void streamInit(SHAKEDigest sHAKEDigest, byte[] bArr, short s11) {
            sHAKEDigest.reset();
            sHAKEDigest.update(bArr, 0, bArr.length);
            sHAKEDigest.update(new byte[]{(byte) s11, (byte) (s11 >> 8)}, 0, 2);
        }

        @Override // org.bouncycastle.pqc.crypto.crystals.dilithium.Symmetric
        void stream128init(byte[] bArr, short s11) {
            streamInit(this.digest128, bArr, s11);
        }

        @Override // org.bouncycastle.pqc.crypto.crystals.dilithium.Symmetric
        void stream128squeezeBlocks(byte[] bArr, int i11, int i12) {
            this.digest128.doOutput(bArr, i11, i12);
        }

        @Override // org.bouncycastle.pqc.crypto.crystals.dilithium.Symmetric
        void stream256init(byte[] bArr, short s11) {
            streamInit(this.digest256, bArr, s11);
        }

        @Override // org.bouncycastle.pqc.crypto.crystals.dilithium.Symmetric
        void stream256squeezeBlocks(byte[] bArr, int i11, int i12) {
            this.digest256.doOutput(bArr, i11, i12);
        }
    }

    Symmetric(int i11, int i12) {
        this.stream128BlockBytes = i11;
        this.stream256BlockBytes = i12;
    }

    abstract void stream128init(byte[] bArr, short s11);

    abstract void stream128squeezeBlocks(byte[] bArr, int i11, int i12);

    abstract void stream256init(byte[] bArr, short s11);

    abstract void stream256squeezeBlocks(byte[] bArr, int i11, int i12);
}
