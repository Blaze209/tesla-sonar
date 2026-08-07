package org.spongycastle.pqc.crypto.rainbow;

import java.security.SecureRandom;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.pqc.crypto.MessageSigner;
import org.spongycastle.pqc.crypto.rainbow.util.ComputeInField;
import org.spongycastle.pqc.crypto.rainbow.util.GF2Field;

/* JADX INFO: loaded from: classes10.dex */
public class RainbowSigner implements MessageSigner {

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private ComputeInField f99840cf = new ComputeInField();
    RainbowKeyParameters key;
    private SecureRandom random;
    int signableDocumentLength;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private short[] f99841x;

    private short[] initSign(Layer[] layerArr, short[] sArr) {
        short[] sArr2 = new short[sArr.length];
        short[] sArrMultiplyMatrix = this.f99840cf.multiplyMatrix(((RainbowPrivateKeyParameters) this.key).getInvA1(), this.f99840cf.addVect(((RainbowPrivateKeyParameters) this.key).getB1(), sArr));
        for (int i11 = 0; i11 < layerArr[0].getVi(); i11++) {
            this.f99841x[i11] = (short) this.random.nextInt();
            short[] sArr3 = this.f99841x;
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

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0024, code lost:
    
        r4 = initSign(r0, makeMessageRepresentative(r14));
        r5 = 0;
        r6 = 0;
        r7 = 0;
     */
    @Override // org.spongycastle.pqc.crypto.MessageSigner
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] generateSignature(byte[] r14) {
        /*
            r13 = this;
            org.spongycastle.pqc.crypto.rainbow.RainbowKeyParameters r0 = r13.key
            org.spongycastle.pqc.crypto.rainbow.RainbowPrivateKeyParameters r0 = (org.spongycastle.pqc.crypto.rainbow.RainbowPrivateKeyParameters) r0
            org.spongycastle.pqc.crypto.rainbow.Layer[] r0 = r0.getLayers()
            int r1 = r0.length
            org.spongycastle.pqc.crypto.rainbow.RainbowKeyParameters r2 = r13.key
            org.spongycastle.pqc.crypto.rainbow.RainbowPrivateKeyParameters r2 = (org.spongycastle.pqc.crypto.rainbow.RainbowPrivateKeyParameters) r2
            short[][] r2 = r2.getInvA2()
            int r2 = r2.length
            short[] r2 = new short[r2]
            r13.f99841x = r2
            int r2 = r1 + (-1)
            r2 = r0[r2]
            int r2 = r2.getViNext()
            byte[] r3 = new byte[r2]
            short[] r14 = r13.makeMessageRepresentative(r14)
        L24:
            short[] r4 = r13.initSign(r0, r14)     // Catch: java.lang.Exception -> L24
            r5 = 0
            r6 = r5
            r7 = r6
        L2b:
            if (r6 >= r1) goto L7e
            r8 = r0[r6]     // Catch: java.lang.Exception -> L24
            int r8 = r8.getOi()     // Catch: java.lang.Exception -> L24
            short[] r8 = new short[r8]     // Catch: java.lang.Exception -> L24
            r9 = r0[r6]     // Catch: java.lang.Exception -> L24
            int r9 = r9.getOi()     // Catch: java.lang.Exception -> L24
            short[] r9 = new short[r9]     // Catch: java.lang.Exception -> L24
            r9 = r5
        L3e:
            r10 = r0[r6]     // Catch: java.lang.Exception -> L24
            int r10 = r10.getOi()     // Catch: java.lang.Exception -> L24
            if (r9 >= r10) goto L4f
            short r10 = r4[r7]     // Catch: java.lang.Exception -> L24
            r8[r9] = r10     // Catch: java.lang.Exception -> L24
            int r7 = r7 + 1
            int r9 = r9 + 1
            goto L3e
        L4f:
            org.spongycastle.pqc.crypto.rainbow.util.ComputeInField r9 = r13.f99840cf     // Catch: java.lang.Exception -> L24
            r10 = r0[r6]     // Catch: java.lang.Exception -> L24
            short[] r11 = r13.f99841x     // Catch: java.lang.Exception -> L24
            short[][] r10 = r10.plugInVinegars(r11)     // Catch: java.lang.Exception -> L24
            short[] r8 = r9.solveEquation(r10, r8)     // Catch: java.lang.Exception -> L24
            if (r8 == 0) goto L76
            r9 = r5
        L60:
            int r10 = r8.length     // Catch: java.lang.Exception -> L24
            if (r9 >= r10) goto L73
            short[] r10 = r13.f99841x     // Catch: java.lang.Exception -> L24
            r11 = r0[r6]     // Catch: java.lang.Exception -> L24
            int r11 = r11.getVi()     // Catch: java.lang.Exception -> L24
            int r11 = r11 + r9
            short r12 = r8[r9]     // Catch: java.lang.Exception -> L24
            r10[r11] = r12     // Catch: java.lang.Exception -> L24
            int r9 = r9 + 1
            goto L60
        L73:
            int r6 = r6 + 1
            goto L2b
        L76:
            java.lang.Exception r4 = new java.lang.Exception     // Catch: java.lang.Exception -> L24
            java.lang.String r5 = "LES is not solveable!"
            r4.<init>(r5)     // Catch: java.lang.Exception -> L24
            throw r4     // Catch: java.lang.Exception -> L24
        L7e:
            org.spongycastle.pqc.crypto.rainbow.util.ComputeInField r4 = r13.f99840cf     // Catch: java.lang.Exception -> L24
            org.spongycastle.pqc.crypto.rainbow.RainbowKeyParameters r6 = r13.key     // Catch: java.lang.Exception -> L24
            org.spongycastle.pqc.crypto.rainbow.RainbowPrivateKeyParameters r6 = (org.spongycastle.pqc.crypto.rainbow.RainbowPrivateKeyParameters) r6     // Catch: java.lang.Exception -> L24
            short[] r6 = r6.getB2()     // Catch: java.lang.Exception -> L24
            short[] r7 = r13.f99841x     // Catch: java.lang.Exception -> L24
            short[] r4 = r4.addVect(r6, r7)     // Catch: java.lang.Exception -> L24
            org.spongycastle.pqc.crypto.rainbow.util.ComputeInField r6 = r13.f99840cf     // Catch: java.lang.Exception -> L24
            org.spongycastle.pqc.crypto.rainbow.RainbowKeyParameters r7 = r13.key     // Catch: java.lang.Exception -> L24
            org.spongycastle.pqc.crypto.rainbow.RainbowPrivateKeyParameters r7 = (org.spongycastle.pqc.crypto.rainbow.RainbowPrivateKeyParameters) r7     // Catch: java.lang.Exception -> L24
            short[][] r7 = r7.getInvA2()     // Catch: java.lang.Exception -> L24
            short[] r4 = r6.multiplyMatrix(r7, r4)     // Catch: java.lang.Exception -> L24
        L9c:
            if (r5 >= r2) goto La6
            short r6 = r4[r5]     // Catch: java.lang.Exception -> L24
            byte r6 = (byte) r6     // Catch: java.lang.Exception -> L24
            r3[r5] = r6     // Catch: java.lang.Exception -> L24
            int r5 = r5 + 1
            goto L9c
        La6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.pqc.crypto.rainbow.RainbowSigner.generateSignature(byte[]):byte[]");
    }

    @Override // org.spongycastle.pqc.crypto.MessageSigner
    public void init(boolean z11, CipherParameters cipherParameters) {
        if (!z11) {
            this.key = (RainbowPublicKeyParameters) cipherParameters;
        } else if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.random = parametersWithRandom.getRandom();
            this.key = (RainbowPrivateKeyParameters) parametersWithRandom.getParameters();
        } else {
            this.random = new SecureRandom();
            this.key = (RainbowPrivateKeyParameters) cipherParameters;
        }
        this.signableDocumentLength = this.key.getDocLength();
    }

    @Override // org.spongycastle.pqc.crypto.MessageSigner
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
