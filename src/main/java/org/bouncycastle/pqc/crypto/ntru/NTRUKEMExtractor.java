package org.bouncycastle.pqc.crypto.ntru;

import org.bouncycastle.crypto.EncapsulatedSecretExtractor;
import org.bouncycastle.crypto.digests.SHA3Digest;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUParameterSet;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class NTRUKEMExtractor implements EncapsulatedSecretExtractor {
    private final NTRUPrivateKeyParameters ntruPrivateKey;
    private final NTRUParameters params;

    public NTRUKEMExtractor(NTRUPrivateKeyParameters nTRUPrivateKeyParameters) {
        this.params = nTRUPrivateKeyParameters.getParameters();
        this.ntruPrivateKey = nTRUPrivateKeyParameters;
    }

    private void cmov(byte[] bArr, byte[] bArr2, byte b11) {
        byte b12 = (byte) ((~b11) + 1);
        for (int i11 = 0; i11 < bArr.length; i11++) {
            byte b13 = bArr[i11];
            bArr[i11] = (byte) (b13 ^ ((bArr2[i11] ^ b13) & b12));
        }
    }

    @Override // org.bouncycastle.crypto.EncapsulatedSecretExtractor
    public byte[] extractSecret(byte[] bArr) {
        NTRUParameterSet nTRUParameterSet = this.params.parameterSet;
        byte[] bArr2 = this.ntruPrivateKey.privateKey;
        int iPrfKeyBytes = nTRUParameterSet.prfKeyBytes() + nTRUParameterSet.ntruCiphertextBytes();
        byte[] bArr3 = new byte[iPrfKeyBytes];
        OWCPADecryptResult oWCPADecryptResultDecrypt = new NTRUOWCPA(nTRUParameterSet).decrypt(bArr, this.ntruPrivateKey.privateKey);
        byte[] bArr4 = oWCPADecryptResultDecrypt.f99128rm;
        int i11 = oWCPADecryptResultDecrypt.fail;
        SHA3Digest sHA3Digest = new SHA3Digest(256);
        byte[] bArr5 = new byte[sHA3Digest.getDigestSize()];
        sHA3Digest.update(bArr4, 0, bArr4.length);
        sHA3Digest.doFinal(bArr5, 0);
        for (int i12 = 0; i12 < nTRUParameterSet.prfKeyBytes(); i12++) {
            bArr3[i12] = bArr2[nTRUParameterSet.owcpaSecretKeyBytes() + i12];
        }
        for (int i13 = 0; i13 < nTRUParameterSet.ntruCiphertextBytes(); i13++) {
            bArr3[nTRUParameterSet.prfKeyBytes() + i13] = bArr[i13];
        }
        sHA3Digest.reset();
        sHA3Digest.update(bArr3, 0, iPrfKeyBytes);
        sHA3Digest.doFinal(bArr4, 0);
        cmov(bArr5, bArr4, (byte) i11);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr5, 0, nTRUParameterSet.sharedKeyBytes());
        Arrays.clear(bArr5);
        return bArrCopyOfRange;
    }

    @Override // org.bouncycastle.crypto.EncapsulatedSecretExtractor
    public int getEncapsulationLength() {
        return this.params.parameterSet.ntruCiphertextBytes();
    }
}
