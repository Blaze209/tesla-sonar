package org.bouncycastle.pqc.crypto.ntru;

import org.bouncycastle.pqc.math.ntru.HPSPolynomial;
import org.bouncycastle.pqc.math.ntru.Polynomial;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUHPSParameterSet;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUHRSSParameterSet;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUParameterSet;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
class NTRUOWCPA {
    private final NTRUParameterSet params;
    private final NTRUSampling sampling;

    public NTRUOWCPA(NTRUParameterSet nTRUParameterSet) {
        this.params = nTRUParameterSet;
        this.sampling = new NTRUSampling(nTRUParameterSet);
    }

    private int checkCiphertext(byte[] bArr) {
        return (((~((short) (bArr[this.params.ntruCiphertextBytes() - 1] & (255 << (8 - ((this.params.logQ() * this.params.packDegree()) & 7)))))) + 1) >>> 15) & 1;
    }

    private int checkM(HPSPolynomial hPSPolynomial) {
        short s11 = 0;
        short s12 = 0;
        for (int i11 = 0; i11 < this.params.n() - 1; i11++) {
            short s13 = hPSPolynomial.coeffs[i11];
            s11 = (short) (s11 + (s13 & 1));
            s12 = (short) (s12 + (s13 & 2));
        }
        return (((~(((s12 >>> 1) ^ s11) | (((NTRUHPSParameterSet) this.params).weight() ^ s12))) + 1) >>> 31) & 1;
    }

    private int checkR(Polynomial polynomial) {
        int iQ = 0;
        for (int i11 = 0; i11 < this.params.n() - 1; i11++) {
            short s11 = polynomial.coeffs[i11];
            iQ = iQ | ((s11 + 1) & (this.params.q() - 4)) | ((s11 + 2) & 4);
        }
        return (((~(polynomial.coeffs[this.params.n() - 1] | iQ)) + 1) >>> 31) & 1;
    }

    public OWCPADecryptResult decrypt(byte[] bArr, byte[] bArr2) {
        int iOwcpaMsgBytes = this.params.owcpaMsgBytes();
        byte[] bArr3 = new byte[iOwcpaMsgBytes];
        Polynomial polynomialCreatePolynomial = this.params.createPolynomial();
        Polynomial polynomialCreatePolynomial2 = this.params.createPolynomial();
        Polynomial polynomialCreatePolynomial3 = this.params.createPolynomial();
        Polynomial polynomialCreatePolynomial4 = this.params.createPolynomial();
        polynomialCreatePolynomial.rqSumZeroFromBytes(bArr);
        polynomialCreatePolynomial2.s3FromBytes(bArr2);
        polynomialCreatePolynomial2.z3ToZq();
        polynomialCreatePolynomial3.rqMul(polynomialCreatePolynomial, polynomialCreatePolynomial2);
        polynomialCreatePolynomial2.rqToS3(polynomialCreatePolynomial3);
        polynomialCreatePolynomial3.s3FromBytes(Arrays.copyOfRange(bArr2, this.params.packTrinaryBytes(), bArr2.length));
        polynomialCreatePolynomial4.s3Mul(polynomialCreatePolynomial2, polynomialCreatePolynomial3);
        byte[] bArrS3ToBytes = polynomialCreatePolynomial4.s3ToBytes(iOwcpaMsgBytes - this.params.packTrinaryBytes());
        int iCheckCiphertext = checkCiphertext(bArr);
        if (this.params instanceof NTRUHPSParameterSet) {
            iCheckCiphertext |= checkM((HPSPolynomial) polynomialCreatePolynomial4);
        }
        polynomialCreatePolynomial2.lift(polynomialCreatePolynomial4);
        for (int i11 = 0; i11 < this.params.n(); i11++) {
            short[] sArr = polynomialCreatePolynomial.coeffs;
            sArr[i11] = (short) (sArr[i11] - polynomialCreatePolynomial2.coeffs[i11]);
        }
        polynomialCreatePolynomial3.sqFromBytes(Arrays.copyOfRange(bArr2, this.params.packTrinaryBytes() * 2, bArr2.length));
        polynomialCreatePolynomial4.sqMul(polynomialCreatePolynomial, polynomialCreatePolynomial3);
        int iCheckR = iCheckCiphertext | checkR(polynomialCreatePolynomial4);
        polynomialCreatePolynomial4.trinaryZqToZ3();
        byte[] bArrS3ToBytes2 = polynomialCreatePolynomial4.s3ToBytes(this.params.owcpaMsgBytes());
        System.arraycopy(bArrS3ToBytes2, 0, bArr3, 0, bArrS3ToBytes2.length);
        System.arraycopy(bArrS3ToBytes, 0, bArr3, this.params.packTrinaryBytes(), bArrS3ToBytes.length);
        return new OWCPADecryptResult(bArr3, iCheckR);
    }

    public byte[] encrypt(Polynomial polynomial, Polynomial polynomial2, byte[] bArr) {
        Polynomial polynomialCreatePolynomial = this.params.createPolynomial();
        Polynomial polynomialCreatePolynomial2 = this.params.createPolynomial();
        polynomialCreatePolynomial.rqSumZeroFromBytes(bArr);
        polynomialCreatePolynomial2.rqMul(polynomial, polynomialCreatePolynomial);
        polynomialCreatePolynomial.lift(polynomial2);
        for (int i11 = 0; i11 < this.params.n(); i11++) {
            short[] sArr = polynomialCreatePolynomial2.coeffs;
            sArr[i11] = (short) (sArr[i11] + polynomialCreatePolynomial.coeffs[i11]);
        }
        return polynomialCreatePolynomial2.rqSumZeroToBytes(this.params.ntruCiphertextBytes());
    }

    public OWCPAKeyPair keypair(byte[] bArr) {
        int iOwcpaSecretKeyBytes = this.params.owcpaSecretKeyBytes();
        byte[] bArr2 = new byte[iOwcpaSecretKeyBytes];
        int iN = this.params.n();
        this.params.q();
        Polynomial polynomialCreatePolynomial = this.params.createPolynomial();
        Polynomial polynomialCreatePolynomial2 = this.params.createPolynomial();
        Polynomial polynomialCreatePolynomial3 = this.params.createPolynomial();
        PolynomialPair polynomialPairSampleFg = this.sampling.sampleFg(bArr);
        Polynomial polynomialF = polynomialPairSampleFg.f();
        Polynomial polynomialG = polynomialPairSampleFg.g();
        polynomialCreatePolynomial.s3Inv(polynomialF);
        byte[] bArrS3ToBytes = polynomialF.s3ToBytes(this.params.owcpaMsgBytes());
        System.arraycopy(bArrS3ToBytes, 0, bArr2, 0, bArrS3ToBytes.length);
        byte[] bArrS3ToBytes2 = polynomialCreatePolynomial.s3ToBytes(iOwcpaSecretKeyBytes - this.params.packTrinaryBytes());
        System.arraycopy(bArrS3ToBytes2, 0, bArr2, this.params.packTrinaryBytes(), bArrS3ToBytes2.length);
        polynomialF.z3ToZq();
        polynomialG.z3ToZq();
        if (this.params instanceof NTRUHRSSParameterSet) {
            for (int i11 = iN - 1; i11 > 0; i11--) {
                short[] sArr = polynomialG.coeffs;
                sArr[i11] = (short) ((sArr[i11 - 1] - sArr[i11]) * 3);
            }
            short[] sArr2 = polynomialG.coeffs;
            sArr2[0] = (short) (-(sArr2[0] * 3));
        } else {
            for (int i12 = 0; i12 < iN; i12++) {
                short[] sArr3 = polynomialG.coeffs;
                sArr3[i12] = (short) (sArr3[i12] * 3);
            }
        }
        polynomialCreatePolynomial.rqMul(polynomialG, polynomialF);
        polynomialCreatePolynomial2.rqInv(polynomialCreatePolynomial);
        polynomialCreatePolynomial3.rqMul(polynomialCreatePolynomial2, polynomialF);
        polynomialCreatePolynomial.sqMul(polynomialCreatePolynomial3, polynomialF);
        byte[] bArrSqToBytes = polynomialCreatePolynomial.sqToBytes(iOwcpaSecretKeyBytes - (this.params.packTrinaryBytes() * 2));
        System.arraycopy(bArrSqToBytes, 0, bArr2, this.params.packTrinaryBytes() * 2, bArrSqToBytes.length);
        polynomialCreatePolynomial3.rqMul(polynomialCreatePolynomial2, polynomialG);
        polynomialCreatePolynomial.rqMul(polynomialCreatePolynomial3, polynomialG);
        return new OWCPAKeyPair(polynomialCreatePolynomial.rqSumZeroToBytes(this.params.owcpaPublicKeyBytes()), bArr2);
    }
}
