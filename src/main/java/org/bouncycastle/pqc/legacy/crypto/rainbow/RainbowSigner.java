package org.bouncycastle.pqc.legacy.crypto.rainbow;

import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.MessageSigner;
import org.bouncycastle.pqc.legacy.crypto.rainbow.util.ComputeInField;
import org.bouncycastle.pqc.legacy.crypto.rainbow.util.GF2Field;

/* JADX INFO: loaded from: classes10.dex */
public class RainbowSigner implements MessageSigner {
    private static final int MAXITS = 65536;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private ComputeInField f99261cf = new ComputeInField();
    RainbowKeyParameters key;
    private SecureRandom random;
    int signableDocumentLength;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private short[] f99262x;

    private short[] initSign(Layer[] layerArr, short[] sArr) {
        short[] sArr2 = new short[sArr.length];
        short[] sArrMultiplyMatrix = this.f99261cf.multiplyMatrix(((RainbowPrivateKeyParameters) this.key).getInvA1(), this.f99261cf.addVect(((RainbowPrivateKeyParameters) this.key).getB1(), sArr));
        for (int i11 = 0; i11 < layerArr[0].getVi(); i11++) {
            this.f99262x[i11] = (short) this.random.nextInt();
            short[] sArr3 = this.f99262x;
            sArr3[i11] = (short) (sArr3[i11] & 255);
        }
        return sArrMultiplyMatrix;
    }

    private short[] makeMessageRepresentative(byte[] bArr) {
        int i11 = this.signableDocumentLength;
        short[] sArr = new short[i11];
        int i12 = 0;
        int i13 = 0;
        while (i12 < bArr.length) {
            short s11 = bArr[i13];
            sArr[i12] = s11;
            sArr[i12] = (short) (s11 & 255);
            i13++;
            i12++;
            if (i12 >= i11) {
                break;
            }
        }
        return sArr;
    }

    private short[] verifySignatureIntern(short[] sArr) {
        short[][] coeffQuadratic = ((RainbowPublicKeyParameters) this.key).getCoeffQuadratic();
        short[][] coeffSingular = ((RainbowPublicKeyParameters) this.key).getCoeffSingular();
        short[] coeffScalar = ((RainbowPublicKeyParameters) this.key).getCoeffScalar();
        short[] sArr2 = new short[coeffQuadratic.length];
        int length = coeffSingular[0].length;
        for (int i11 = 0; i11 < coeffQuadratic.length; i11++) {
            int i12 = 0;
            for (int i13 = 0; i13 < length; i13++) {
                for (int i14 = i13; i14 < length; i14++) {
                    sArr2[i11] = GF2Field.addElem(sArr2[i11], GF2Field.multElem(coeffQuadratic[i11][i12], GF2Field.multElem(sArr[i13], sArr[i14])));
                    i12++;
                }
                sArr2[i11] = GF2Field.addElem(sArr2[i11], GF2Field.multElem(coeffSingular[i11][i13], sArr[i13]));
            }
            sArr2[i11] = GF2Field.addElem(sArr2[i11], coeffScalar[i11]);
        }
        return sArr2;
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        Layer[] layers = ((RainbowPrivateKeyParameters) this.key).getLayers();
        int length = layers.length;
        this.f99262x = new short[((RainbowPrivateKeyParameters) this.key).getInvA2().length];
        int viNext = layers[length - 1].getViNext();
        byte[] bArr2 = new byte[viNext];
        short[] sArrMakeMessageRepresentative = makeMessageRepresentative(bArr);
        int i11 = 0;
        do {
            try {
                short[] sArrInitSign = initSign(layers, sArrMakeMessageRepresentative);
                int i12 = 0;
                for (int i13 = 0; i13 < length; i13++) {
                    short[] sArr = new short[layers[i13].getOi()];
                    short[] sArr2 = new short[layers[i13].getOi()];
                    for (int i14 = 0; i14 < layers[i13].getOi(); i14++) {
                        sArr[i14] = sArrInitSign[i12];
                        i12++;
                    }
                    short[] sArrSolveEquation = this.f99261cf.solveEquation(layers[i13].plugInVinegars(this.f99262x), sArr);
                    if (sArrSolveEquation == null) {
                        throw new Exception("LES is not solveable!");
                    }
                    for (int i15 = 0; i15 < sArrSolveEquation.length; i15++) {
                        this.f99262x[layers[i13].getVi() + i15] = sArrSolveEquation[i15];
                    }
                }
                short[] sArrMultiplyMatrix = this.f99261cf.multiplyMatrix(((RainbowPrivateKeyParameters) this.key).getInvA2(), this.f99261cf.addVect(((RainbowPrivateKeyParameters) this.key).getB2(), this.f99262x));
                for (int i16 = 0; i16 < viNext; i16++) {
                    bArr2[i16] = (byte) sArrMultiplyMatrix[i16];
                }
                break;
            } catch (Exception unused) {
                i11++;
            }
        } while (i11 < 65536);
        if (i11 != 65536) {
            return bArr2;
        }
        throw new IllegalStateException("unable to generate signature - LES not solvable");
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z11, CipherParameters cipherParameters) {
        RainbowKeyParameters rainbowKeyParameters;
        if (z11) {
            if (cipherParameters instanceof ParametersWithRandom) {
                ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
                this.random = parametersWithRandom.getRandom();
                this.key = (RainbowPrivateKeyParameters) parametersWithRandom.getParameters();
            } else {
                this.random = CryptoServicesRegistrar.getSecureRandom();
                rainbowKeyParameters = (RainbowPrivateKeyParameters) cipherParameters;
            }
            this.signableDocumentLength = this.key.getDocLength();
        }
        rainbowKeyParameters = (RainbowPublicKeyParameters) cipherParameters;
        this.key = rainbowKeyParameters;
        this.signableDocumentLength = this.key.getDocLength();
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        short[] sArr = new short[bArr2.length];
        for (int i11 = 0; i11 < bArr2.length; i11++) {
            sArr[i11] = (short) (bArr2[i11] & 255);
        }
        short[] sArrMakeMessageRepresentative = makeMessageRepresentative(bArr);
        short[] sArrVerifySignatureIntern = verifySignatureIntern(sArr);
        if (sArrMakeMessageRepresentative.length != sArrVerifySignatureIntern.length) {
            return false;
        }
        boolean z11 = true;
        for (int i12 = 0; i12 < sArrMakeMessageRepresentative.length; i12++) {
            z11 = z11 && sArrMakeMessageRepresentative[i12] == sArrVerifySignatureIntern[i12];
        }
        return z11;
    }
}
