package org.spongycastle.pqc.crypto.ntru;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.spongycastle.crypto.AsymmetricCipherKeyPair;
import org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.spongycastle.crypto.KeyGenerationParameters;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.pqc.math.ntru.euclid.BigIntEuclidean;
import org.spongycastle.pqc.math.ntru.polynomial.BigDecimalPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.BigIntPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.DenseTernaryPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.IntegerPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.Polynomial;
import org.spongycastle.pqc.math.ntru.polynomial.ProductFormPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.Resultant;

/* JADX INFO: loaded from: classes10.dex */
public class NTRUSigningKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private NTRUSigningKeyGenerationParameters params;

    private class BasisGenerationTask implements Callable<NTRUSigningPrivateKeyParameters.Basis> {
        private BasisGenerationTask() {
        }

        @Override // java.util.concurrent.Callable
        public NTRUSigningPrivateKeyParameters.Basis call() {
            return NTRUSigningKeyPairGenerator.this.generateBoundedBasis();
        }
    }

    public class FGBasis extends NTRUSigningPrivateKeyParameters.Basis {
        public IntegerPolynomial F;
        public IntegerPolynomial G;

        FGBasis(Polynomial polynomial, Polynomial polynomial2, IntegerPolynomial integerPolynomial, IntegerPolynomial integerPolynomial2, IntegerPolynomial integerPolynomial3, NTRUSigningKeyGenerationParameters nTRUSigningKeyGenerationParameters) {
            super(polynomial, polynomial2, integerPolynomial, nTRUSigningKeyGenerationParameters);
            this.F = integerPolynomial2;
            this.G = integerPolynomial3;
        }

        boolean isNormOk() {
            NTRUSigningKeyGenerationParameters nTRUSigningKeyGenerationParameters = this.params;
            double d11 = nTRUSigningKeyGenerationParameters.keyNormBoundSq;
            int i11 = nTRUSigningKeyGenerationParameters.f99821q;
            return ((double) this.F.centeredNormSq(i11)) < d11 && ((double) this.G.centeredNormSq(i11)) < d11;
        }
    }

    private FGBasis generateBasis() {
        boolean z11;
        Polynomial polynomialGenerateRandom;
        IntegerPolynomial integerPolynomial;
        IntegerPolynomial integerPolynomialInvertFq;
        Polynomial polynomialGenerateRandom2;
        IntegerPolynomial integerPolynomial2;
        int i11;
        Resultant resultant;
        BigIntEuclidean bigIntEuclideanCalculate;
        BigIntPolynomial bigIntPolynomialRound;
        IntegerPolynomial integerPolynomialMult;
        int i12;
        NTRUSigningKeyPairGenerator nTRUSigningKeyPairGenerator = this;
        NTRUSigningKeyGenerationParameters nTRUSigningKeyGenerationParameters = nTRUSigningKeyPairGenerator.params;
        int i13 = nTRUSigningKeyGenerationParameters.N;
        int i14 = nTRUSigningKeyGenerationParameters.f99821q;
        int i15 = nTRUSigningKeyGenerationParameters.f99817d;
        int i16 = nTRUSigningKeyGenerationParameters.f99818d1;
        int i17 = nTRUSigningKeyGenerationParameters.f99819d2;
        int i18 = nTRUSigningKeyGenerationParameters.f99820d3;
        int i19 = nTRUSigningKeyGenerationParameters.basisType;
        int i21 = 1;
        int i22 = (i13 * 2) + 1;
        boolean z12 = nTRUSigningKeyGenerationParameters.primeCheck;
        while (true) {
            z11 = z12;
            polynomialGenerateRandom = nTRUSigningKeyPairGenerator.params.polyType == 0 ? DenseTernaryPolynomial.generateRandom(i13, i15 + 1, i15, new SecureRandom()) : ProductFormPolynomial.generateRandom(i13, i16, i17, i18 + 1, i18, new SecureRandom());
            integerPolynomial = polynomialGenerateRandom.toIntegerPolynomial();
            if (!z11 || !integerPolynomial.resultant(i22).res.equals(BigInteger.ZERO)) {
                integerPolynomialInvertFq = integerPolynomial.invertFq(i14);
                if (integerPolynomialInvertFq != null) {
                    break;
                }
                nTRUSigningKeyPairGenerator = this;
            }
            z12 = z11;
        }
        Resultant resultant2 = integerPolynomial.resultant();
        while (true) {
            if (nTRUSigningKeyPairGenerator.params.polyType == 0) {
                polynomialGenerateRandom2 = DenseTernaryPolynomial.generateRandom(i13, i15 + 1, i15, new SecureRandom());
                resultant2 = resultant2;
            } else {
                resultant2 = resultant2;
                polynomialGenerateRandom2 = ProductFormPolynomial.generateRandom(i13, i16, i17, i18 + 1, i18, new SecureRandom());
            }
            integerPolynomial2 = polynomialGenerateRandom2.toIntegerPolynomial();
            i16 = i16;
            if (z11) {
                i11 = i17;
                if (!integerPolynomial2.resultant(i22).res.equals(BigInteger.ZERO)) {
                }
                i17 = i11;
            } else {
                i11 = i17;
            }
            if (integerPolynomial2.invertFq(i14) != null) {
                resultant = integerPolynomial2.resultant();
                int i23 = i18;
                bigIntEuclideanCalculate = BigIntEuclidean.calculate(resultant2.res, resultant.res);
                int i24 = i15;
                if (bigIntEuclideanCalculate.gcd.equals(BigInteger.ONE)) {
                    break;
                }
                nTRUSigningKeyPairGenerator = this;
                i17 = i11;
                i18 = i23;
                i15 = i24;
            } else {
                nTRUSigningKeyPairGenerator = this;
                i17 = i11;
            }
        }
        BigIntPolynomial bigIntPolynomial = (BigIntPolynomial) resultant2.rho.clone();
        bigIntPolynomial.mult(bigIntEuclideanCalculate.f99865x.multiply(BigInteger.valueOf(i14)));
        BigIntPolynomial bigIntPolynomial2 = (BigIntPolynomial) resultant.rho.clone();
        bigIntPolynomial2.mult(bigIntEuclideanCalculate.f99866y.multiply(BigInteger.valueOf(-i14)));
        int i25 = 0;
        if (nTRUSigningKeyPairGenerator.params.keyGenAlg == 0) {
            int[] iArr = new int[i13];
            int[] iArr2 = new int[i13];
            iArr[0] = integerPolynomial.coeffs[0];
            iArr2[0] = integerPolynomial2.coeffs[0];
            while (i12 < i13) {
                i12 = i21;
                int i26 = i13 - i12;
                iArr[i12] = integerPolynomial.coeffs[i26];
                iArr2[i12] = integerPolynomial2.coeffs[i26];
                i12++;
            }
            i12 = i21;
            IntegerPolynomial integerPolynomial3 = new IntegerPolynomial(iArr);
            IntegerPolynomial integerPolynomial4 = new IntegerPolynomial(iArr2);
            IntegerPolynomial integerPolynomialMult2 = polynomialGenerateRandom.mult(integerPolynomial3);
            integerPolynomialMult2.add(polynomialGenerateRandom2.mult(integerPolynomial4));
            Resultant resultant3 = integerPolynomialMult2.resultant();
            BigIntPolynomial bigIntPolynomialMult = integerPolynomial3.mult(bigIntPolynomial2);
            bigIntPolynomialMult.add(integerPolynomial4.mult(bigIntPolynomial));
            bigIntPolynomialRound = bigIntPolynomialMult.mult(resultant3.rho);
            bigIntPolynomialRound.div(resultant3.res);
        } else {
            for (int i27 = i21; i27 < i13; i27 *= 10) {
                i25++;
            }
            BigDecimalPolynomial bigDecimalPolynomialDiv = resultant2.rho.div(new BigDecimal(resultant2.res), bigIntPolynomial2.getMaxCoeffLength() + 1 + i25);
            BigDecimalPolynomial bigDecimalPolynomialDiv2 = resultant.rho.div(new BigDecimal(resultant.res), bigIntPolynomial.getMaxCoeffLength() + 1 + i25);
            BigDecimalPolynomial bigDecimalPolynomialMult = bigDecimalPolynomialDiv.mult(bigIntPolynomial2);
            bigDecimalPolynomialMult.add(bigDecimalPolynomialDiv2.mult(bigIntPolynomial));
            bigDecimalPolynomialMult.halve();
            bigIntPolynomialRound = bigDecimalPolynomialMult.round();
        }
        BigIntPolynomial bigIntPolynomial3 = (BigIntPolynomial) bigIntPolynomial2.clone();
        bigIntPolynomial3.sub(polynomialGenerateRandom.mult(bigIntPolynomialRound));
        BigIntPolynomial bigIntPolynomial4 = (BigIntPolynomial) bigIntPolynomial.clone();
        bigIntPolynomial4.sub(polynomialGenerateRandom2.mult(bigIntPolynomialRound));
        IntegerPolynomial integerPolynomial5 = new IntegerPolynomial(bigIntPolynomial3);
        IntegerPolynomial integerPolynomial6 = new IntegerPolynomial(bigIntPolynomial4);
        nTRUSigningKeyPairGenerator.minimizeFG(integerPolynomial, integerPolynomial2, integerPolynomial5, integerPolynomial6, i13);
        if (i19 == 0) {
            integerPolynomialMult = polynomialGenerateRandom2.mult(integerPolynomialInvertFq, i14);
            polynomialGenerateRandom2 = integerPolynomial5;
        } else {
            integerPolynomialMult = integerPolynomial5.mult(integerPolynomialInvertFq, i14);
        }
        integerPolynomialMult.modPositive(i14);
        return nTRUSigningKeyPairGenerator.new FGBasis(polynomialGenerateRandom, polynomialGenerateRandom2, integerPolynomialMult, integerPolynomial5, integerPolynomial6, nTRUSigningKeyPairGenerator.params);
    }

    private void minimizeFG(IntegerPolynomial integerPolynomial, IntegerPolynomial integerPolynomial2, IntegerPolynomial integerPolynomial3, IntegerPolynomial integerPolynomial4, int i11) {
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = integerPolynomial.coeffs[i13];
            int i15 = integerPolynomial2.coeffs[i13];
            i12 += i11 * 2 * ((i14 * i14) + (i15 * i15));
        }
        int i16 = i12 - 4;
        IntegerPolynomial integerPolynomial5 = (IntegerPolynomial) integerPolynomial.clone();
        IntegerPolynomial integerPolynomial6 = (IntegerPolynomial) integerPolynomial2.clone();
        int i17 = 0;
        int i18 = 0;
        while (i17 < i11 && i18 < i11) {
            int i19 = 0;
            for (int i21 = 0; i21 < i11; i21++) {
                i19 += i11 * 4 * ((integerPolynomial3.coeffs[i21] * integerPolynomial.coeffs[i21]) + (integerPolynomial4.coeffs[i21] * integerPolynomial2.coeffs[i21]));
            }
            int iSumCoeffs = i19 - ((integerPolynomial3.sumCoeffs() + integerPolynomial4.sumCoeffs()) * 4);
            if (iSumCoeffs > i16) {
                integerPolynomial3.sub(integerPolynomial5);
                integerPolynomial4.sub(integerPolynomial6);
            } else {
                if (iSumCoeffs < (-i16)) {
                    integerPolynomial3.add(integerPolynomial5);
                    integerPolynomial4.add(integerPolynomial6);
                }
                i18++;
                integerPolynomial5.rotate1();
                integerPolynomial6.rotate1();
            }
            i17++;
            i18 = 0;
            i18++;
            integerPolynomial5.rotate1();
            integerPolynomial6.rotate1();
        }
    }

    public NTRUSigningPrivateKeyParameters.Basis generateBoundedBasis() {
        FGBasis fGBasisGenerateBasis;
        do {
            fGBasisGenerateBasis = generateBasis();
        } while (!fGBasisGenerateBasis.isNormOk());
        return fGBasisGenerateBasis;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        NTRUSigningPublicKeyParameters nTRUSigningPublicKeyParameters;
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        ArrayList arrayList = new ArrayList();
        int i11 = this.params.B;
        while (true) {
            nTRUSigningPublicKeyParameters = null;
            Object[] objArr = 0;
            if (i11 < 0) {
                break;
            }
            arrayList.add(executorServiceNewCachedThreadPool.submit(new BasisGenerationTask()));
            i11--;
        }
        executorServiceNewCachedThreadPool.shutdown();
        ArrayList arrayList2 = new ArrayList();
        for (int i12 = this.params.B; i12 >= 0; i12--) {
            Future future = (Future) arrayList.get(i12);
            try {
                arrayList2.add(future.get());
                if (i12 == this.params.B) {
                    nTRUSigningPublicKeyParameters = new NTRUSigningPublicKeyParameters(((NTRUSigningPrivateKeyParameters.Basis) future.get()).f99828h, this.params.getSigningParameters());
                }
            } catch (Exception e11) {
                throw new IllegalStateException(e11);
            }
        }
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) nTRUSigningPublicKeyParameters, (AsymmetricKeyParameter) new NTRUSigningPrivateKeyParameters(arrayList2, nTRUSigningPublicKeyParameters));
    }

    public AsymmetricCipherKeyPair generateKeyPairSingleThread() {
        ArrayList arrayList = new ArrayList();
        NTRUSigningPublicKeyParameters nTRUSigningPublicKeyParameters = null;
        for (int i11 = this.params.B; i11 >= 0; i11--) {
            NTRUSigningPrivateKeyParameters.Basis basisGenerateBoundedBasis = generateBoundedBasis();
            arrayList.add(basisGenerateBoundedBasis);
            if (i11 == 0) {
                nTRUSigningPublicKeyParameters = new NTRUSigningPublicKeyParameters(basisGenerateBoundedBasis.f99828h, this.params.getSigningParameters());
            }
        }
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) nTRUSigningPublicKeyParameters, (AsymmetricKeyParameter) new NTRUSigningPrivateKeyParameters(arrayList, nTRUSigningPublicKeyParameters));
    }

    @Override // org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.params = (NTRUSigningKeyGenerationParameters) keyGenerationParameters;
    }
}
