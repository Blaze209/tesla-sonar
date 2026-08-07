package org.bouncycastle.pqc.crypto.rainbow;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.MessageSigner;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class RainbowSigner implements MessageSigner {
    private static final int MAXITS = 65536;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private ComputeInField f99162cf = new ComputeInField();
    private Digest hashAlgo;
    private RainbowKeyParameters key;
    private SecureRandom random;
    int signableDocumentLength;
    private Version version;

    /* JADX INFO: renamed from: org.bouncycastle.pqc.crypto.rainbow.RainbowSigner$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$pqc$crypto$rainbow$Version;

        static {
            int[] iArr = new int[Version.values().length];
            $SwitchMap$org$bouncycastle$pqc$crypto$rainbow$Version = iArr;
            try {
                iArr[Version.CLASSIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$bouncycastle$pqc$crypto$rainbow$Version[Version.CIRCUMZENITHAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$bouncycastle$pqc$crypto$rainbow$Version[Version.COMPRESSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private byte[] genSignature(byte[] bArr) {
        short[] sArr;
        int i11;
        int i12;
        int i13;
        int i14;
        byte[] bArr2 = new byte[this.hashAlgo.getDigestSize()];
        this.hashAlgo.update(bArr, 0, bArr.length);
        this.hashAlgo.doFinal(bArr2, 0);
        int v11 = this.key.getParameters().getV1();
        int o11 = this.key.getParameters().getO1();
        int o12 = this.key.getParameters().getO2();
        int m11 = this.key.getParameters().getM();
        int n11 = this.key.getParameters().getN();
        RainbowPrivateKeyParameters rainbowPrivateKeyParameters = (RainbowPrivateKeyParameters) this.key;
        Digest digest = this.hashAlgo;
        this.random = new RainbowDRBG(RainbowUtil.hash(digest, rainbowPrivateKeyParameters.sk_seed, bArr2, new byte[digest.getDigestSize()]), rainbowPrivateKeyParameters.getParameters().getHash_algo());
        short[] sArr2 = new short[v11];
        short[] sArr3 = new short[o11];
        short[] sArr4 = new short[o12];
        Class cls = Short.TYPE;
        short[][] sArr5 = (short[][]) Array.newInstance((Class<?>) cls, o12, o11);
        int i15 = 0;
        short[][] sArr6 = (short[][]) Array.newInstance((Class<?>) cls, o12, o12);
        byte[] bArr3 = new byte[rainbowPrivateKeyParameters.getParameters().getLen_salt()];
        short[] sArr7 = new short[m11];
        short[] sArr8 = new short[o11];
        short[] sArr9 = new short[o12];
        int i16 = 0;
        short[][] sArrInverse = null;
        while (sArrInverse == null && i16 < 65536) {
            byte[] bArr4 = new byte[v11];
            this.random.nextBytes(bArr4);
            int i17 = 0;
            while (true) {
                i13 = i16;
                if (i17 >= v11) {
                    break;
                }
                sArr2[i17] = (short) (bArr4[i17] & 255);
                i17++;
                i16 = i13;
            }
            short[][] sArr10 = (short[][]) Array.newInstance((Class<?>) cls, o11, o11);
            int i18 = 0;
            while (i18 < v11) {
                int i19 = 0;
                while (true) {
                    i14 = i18;
                    if (i19 < o11) {
                        int i21 = 0;
                        while (i21 < o11) {
                            int i22 = i21;
                            int i23 = i19;
                            short sMultElem = GF2Field.multElem(rainbowPrivateKeyParameters.l1_F2[i19][i14][i22], sArr2[i14]);
                            short[] sArr11 = sArr10[i23];
                            sArr11[i22] = GF2Field.addElem(sArr11[i22], sMultElem);
                            i21 = i22 + 1;
                            i19 = i23;
                        }
                        i19++;
                        i18 = i14;
                    }
                }
                i18 = i14 + 1;
            }
            sArrInverse = this.f99162cf.inverse(sArr10);
            i16 = i13 + 1;
        }
        int i24 = i16;
        int i25 = 0;
        while (i25 < o11) {
            int i26 = i25;
            sArr3[i26] = this.f99162cf.multiplyMatrix_quad(rainbowPrivateKeyParameters.l1_F1[i26], sArr2);
            i25 = i26 + 1;
        }
        int i27 = 0;
        while (i27 < v11) {
            int i28 = 0;
            while (true) {
                i12 = i27;
                if (i28 < o12) {
                    int i29 = i28;
                    sArr4[i29] = this.f99162cf.multiplyMatrix_quad(rainbowPrivateKeyParameters.l2_F1[i29], sArr2);
                    int i31 = 0;
                    while (i31 < o11) {
                        int i32 = i31;
                        short sMultElem2 = GF2Field.multElem(rainbowPrivateKeyParameters.l2_F2[i29][i12][i31], sArr2[i12]);
                        short[] sArr12 = sArr5[i29];
                        sArr12[i32] = GF2Field.addElem(sArr12[i32], sMultElem2);
                        i31 = i32 + 1;
                    }
                    int i33 = 0;
                    while (i33 < o12) {
                        int i34 = i33;
                        short sMultElem3 = GF2Field.multElem(rainbowPrivateKeyParameters.l2_F3[i29][i12][i33], sArr2[i12]);
                        short[] sArr13 = sArr6[i29];
                        sArr13[i34] = GF2Field.addElem(sArr13[i34], sMultElem3);
                        i33 = i34 + 1;
                    }
                    i28 = i29 + 1;
                    i27 = i12;
                }
            }
            i27 = i12 + 1;
        }
        byte[] bArr5 = new byte[m11];
        short[] sArr14 = sArr8;
        short[] sArrSolveEquation = null;
        int i35 = i24;
        while (true) {
            sArr = sArr2;
            if (sArrSolveEquation != null || i35 >= 65536) {
                break;
            }
            int[] iArr = new int[2];
            iArr[1] = o12;
            iArr[i15] = o12;
            short[][] sArr15 = (short[][]) Array.newInstance((Class<?>) cls, iArr);
            this.random.nextBytes(bArr3);
            short[] sArrMakeMessageRepresentative = makeMessageRepresentative(RainbowUtil.hash(this.hashAlgo, bArr2, bArr3, bArr5));
            byte[] bArr6 = bArr2;
            byte[] bArr7 = bArr5;
            Class cls2 = cls;
            int i36 = i15;
            System.arraycopy(this.f99162cf.addVect(Arrays.copyOf(sArrMakeMessageRepresentative, o11), this.f99162cf.multiplyMatrix(rainbowPrivateKeyParameters.f99156s1, Arrays.copyOfRange(sArrMakeMessageRepresentative, o11, m11))), i36, sArr7, i36, o11);
            System.arraycopy(sArrMakeMessageRepresentative, o11, sArr7, o11, o12);
            short[] sArrMultiplyMatrix = this.f99162cf.multiplyMatrix(sArrInverse, this.f99162cf.addVect(sArr3, Arrays.copyOf(sArr7, o11)));
            short[] sArrMultiplyMatrix2 = this.f99162cf.multiplyMatrix(sArr5, sArrMultiplyMatrix);
            int i37 = 0;
            while (i37 < o12) {
                int i38 = i37;
                sArr9[i38] = this.f99162cf.multiplyMatrix_quad(rainbowPrivateKeyParameters.l2_F5[i38], sArrMultiplyMatrix);
                i37 = i38 + 1;
            }
            short[] sArr16 = sArr9;
            short[] sArrAddVect = this.f99162cf.addVect(this.f99162cf.addVect(this.f99162cf.addVect(sArrMultiplyMatrix2, sArr16), sArr4), Arrays.copyOfRange(sArr7, o11, m11));
            int i39 = 0;
            while (i39 < o11) {
                int i41 = 0;
                while (true) {
                    i11 = i39;
                    if (i41 < o12) {
                        int i42 = 0;
                        while (i42 < o12) {
                            int i43 = i42;
                            int i44 = m11;
                            short sMultElem4 = GF2Field.multElem(rainbowPrivateKeyParameters.l2_F6[i41][i11][i43], sArrMultiplyMatrix[i11]);
                            short[] sArr17 = sArr15[i41];
                            sArr17[i43] = GF2Field.addElem(sArr17[i43], sMultElem4);
                            i42 = i43 + 1;
                            m11 = i44;
                        }
                        i41++;
                        i39 = i11;
                    }
                }
                i39 = i11 + 1;
            }
            i35++;
            sArrSolveEquation = this.f99162cf.solveEquation(this.f99162cf.addMatrix(sArr15, sArr6), sArrAddVect);
            sArr14 = sArrMultiplyMatrix;
            sArr9 = sArr16;
            sArr2 = sArr;
            bArr2 = bArr6;
            bArr5 = bArr7;
            cls = cls2;
            m11 = m11;
            i15 = 0;
        }
        short[] sArr18 = sArrSolveEquation == null ? new short[o12] : sArrSolveEquation;
        short[] sArrAddVect2 = this.f99162cf.addVect(this.f99162cf.addVect(sArr, this.f99162cf.multiplyMatrix(rainbowPrivateKeyParameters.f99157t1, sArr14)), this.f99162cf.multiplyMatrix(rainbowPrivateKeyParameters.f99159t4, sArr18));
        short[] sArrAddVect3 = this.f99162cf.addVect(sArr14, this.f99162cf.multiplyMatrix(rainbowPrivateKeyParameters.f99158t3, sArr18));
        short[] sArrCopyOf = Arrays.copyOf(sArrAddVect2, n11);
        System.arraycopy(sArrAddVect3, 0, sArrCopyOf, v11, o11);
        System.arraycopy(sArr18, 0, sArrCopyOf, o11 + v11, o12);
        if (i35 != 65536) {
            return Arrays.concatenate(RainbowUtil.convertArray(sArrCopyOf), bArr3);
        }
        throw new IllegalStateException("unable to generate signature - LES not solvable");
    }

    private short[] makeMessageRepresentative(byte[] bArr) {
        int i11 = this.signableDocumentLength;
        short[] sArr = new short[i11];
        int i12 = 0;
        int i13 = 0;
        while (i12 < bArr.length) {
            sArr[i12] = (short) (bArr[i13] & 255);
            i13++;
            i12++;
            if (i12 >= i11) {
                break;
            }
        }
        return sArr;
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        return genSignature(bArr);
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z11, CipherParameters cipherParameters) {
        RainbowKeyParameters rainbowKeyParameters;
        if (z11) {
            if (cipherParameters instanceof ParametersWithRandom) {
                ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
                this.random = parametersWithRandom.getRandom();
                rainbowKeyParameters = (RainbowKeyParameters) parametersWithRandom.getParameters();
            } else {
                rainbowKeyParameters = (RainbowKeyParameters) cipherParameters;
                SecureRandom secureRandom = CryptoServicesRegistrar.getSecureRandom();
                byte[] bArr = new byte[rainbowKeyParameters.getParameters().getLen_skseed()];
                secureRandom.nextBytes(bArr);
                this.random = new RainbowDRBG(bArr, rainbowKeyParameters.getParameters().getHash_algo());
            }
            this.version = rainbowKeyParameters.getParameters().getVersion();
            this.key = rainbowKeyParameters;
        } else {
            RainbowKeyParameters rainbowKeyParameters2 = (RainbowKeyParameters) cipherParameters;
            this.key = rainbowKeyParameters2;
            this.version = rainbowKeyParameters2.getParameters().getVersion();
        }
        this.signableDocumentLength = this.key.getDocLength();
        this.hashAlgo = this.key.getParameters().getHash_algo();
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        short[] sArrPublicMap;
        byte[] bArr3 = new byte[this.hashAlgo.getDigestSize()];
        this.hashAlgo.update(bArr, 0, bArr.length);
        this.hashAlgo.doFinal(bArr3, 0);
        int m11 = this.key.getParameters().getM();
        int n11 = this.key.getParameters().getN();
        RainbowPublicMap rainbowPublicMap = new RainbowPublicMap(this.key.getParameters());
        short[] sArrMakeMessageRepresentative = makeMessageRepresentative(RainbowUtil.hash(this.hashAlgo, bArr3, Arrays.copyOfRange(bArr2, n11, bArr2.length), new byte[m11]));
        short[] sArrConvertArray = RainbowUtil.convertArray(Arrays.copyOfRange(bArr2, 0, n11));
        int i11 = AnonymousClass1.$SwitchMap$org$bouncycastle$pqc$crypto$rainbow$Version[this.version.ordinal()];
        if (i11 == 1) {
            sArrPublicMap = rainbowPublicMap.publicMap((RainbowPublicKeyParameters) this.key, sArrConvertArray);
        } else {
            if (i11 != 2 && i11 != 3) {
                throw new IllegalArgumentException("No valid version. Please choose one of the following: classic, circumzenithal, compressed");
            }
            sArrPublicMap = rainbowPublicMap.publicMap_cyclic((RainbowPublicKeyParameters) this.key, sArrConvertArray);
        }
        return RainbowUtil.equals(sArrMakeMessageRepresentative, sArrPublicMap);
    }
}
