package org.bouncycastle.pqc.legacy.crypto.rainbow;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.legacy.crypto.rainbow.util.ComputeInField;
import org.bouncycastle.pqc.legacy.crypto.rainbow.util.GF2Field;

/* JADX INFO: loaded from: classes10.dex */
public class RainbowKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private short[][] A1;
    private short[][] A1inv;
    private short[][] A2;
    private short[][] A2inv;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private short[] f99253b1;

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    private short[] f99254b2;
    private boolean initialized = false;
    private Layer[] layers;
    private int numOfLayers;
    private short[][] pub_quadratic;
    private short[] pub_scalar;
    private short[][] pub_singular;
    private RainbowKeyGenerationParameters rainbowParams;

    /* JADX INFO: renamed from: sr, reason: collision with root package name */
    private SecureRandom f99255sr;

    /* JADX INFO: renamed from: vi, reason: collision with root package name */
    private int[] f99256vi;

    private void compactPublicKey(short[][][] sArr) {
        int length = sArr.length;
        int length2 = sArr[0].length;
        this.pub_quadratic = (short[][]) Array.newInstance((Class<?>) Short.TYPE, length, ((length2 + 1) * length2) / 2);
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = 0;
            for (int i13 = 0; i13 < length2; i13++) {
                for (int i14 = i13; i14 < length2; i14++) {
                    short[][] sArr2 = this.pub_quadratic;
                    if (i14 == i13) {
                        sArr2[i11][i12] = sArr[i11][i13][i14];
                    } else {
                        short[] sArr3 = sArr2[i11];
                        short[][] sArr4 = sArr[i11];
                        sArr3[i12] = GF2Field.addElem(sArr4[i13][i14], sArr4[i14][i13]);
                    }
                    i12++;
                }
            }
        }
    }

    private void computePublicKey() {
        int i11;
        ComputeInField computeInField = new ComputeInField();
        int[] iArr = this.f99256vi;
        boolean z11 = true;
        int i12 = 0;
        int i13 = iArr[iArr.length - 1] - iArr[0];
        int i14 = iArr[iArr.length - 1];
        int i15 = 3;
        int i16 = 2;
        Class cls = Short.TYPE;
        short[][][] sArr = (short[][][]) Array.newInstance((Class<?>) cls, i13, i14, i14);
        this.pub_singular = (short[][]) Array.newInstance((Class<?>) cls, i13, i14);
        this.pub_scalar = new short[i13];
        short[] sArr2 = new short[i14];
        int i17 = 0;
        int i18 = 0;
        while (true) {
            Layer[] layerArr = this.layers;
            if (i17 >= layerArr.length) {
                break;
            }
            short[][][] coeffAlpha = layerArr[i17].getCoeffAlpha();
            short[][][] coeffBeta = this.layers[i17].getCoeffBeta();
            short[][] coeffGamma = this.layers[i17].getCoeffGamma();
            short[] coeffEta = this.layers[i17].getCoeffEta();
            boolean z12 = z11;
            int length = coeffAlpha[i12].length;
            int i19 = i12;
            int length2 = coeffBeta[i19].length;
            int i21 = i16;
            int i22 = i19;
            while (i22 < length) {
                int i23 = i19;
                while (true) {
                    i11 = i14;
                    if (i23 >= length) {
                        break;
                    }
                    int i24 = i19;
                    while (i24 < length2) {
                        int i25 = i24;
                        int i26 = length;
                        int i27 = i23 + length2;
                        short[] sArrMultVect = computeInField.multVect(coeffAlpha[i22][i23][i25], this.A2[i27]);
                        int i28 = i18 + i22;
                        int i29 = i23;
                        sArr[i28] = computeInField.addSquareMatrix(sArr[i28], computeInField.multVects(sArrMultVect, this.A2[i25]));
                        short[] sArrMultVect2 = computeInField.multVect(this.f99254b2[i25], sArrMultVect);
                        short[][] sArr3 = this.pub_singular;
                        sArr3[i28] = computeInField.addVect(sArrMultVect2, sArr3[i28]);
                        short[] sArrMultVect3 = computeInField.multVect(this.f99254b2[i27], computeInField.multVect(coeffAlpha[i22][i29][i25], this.A2[i25]));
                        short[][] sArr4 = this.pub_singular;
                        sArr4[i28] = computeInField.addVect(sArrMultVect3, sArr4[i28]);
                        short sMultElem = GF2Field.multElem(coeffAlpha[i22][i29][i25], this.f99254b2[i27]);
                        short[] sArr5 = this.pub_scalar;
                        sArr5[i28] = GF2Field.addElem(sArr5[i28], GF2Field.multElem(sMultElem, this.f99254b2[i25]));
                        i24 = i25 + 1;
                        length = i26;
                        i23 = i29;
                    }
                    i23++;
                    i14 = i11;
                }
                int i31 = length;
                int i32 = i19;
                while (i32 < length2) {
                    int i33 = i19;
                    while (i33 < length2) {
                        int i34 = i32;
                        short[] sArrMultVect4 = computeInField.multVect(coeffBeta[i22][i32][i33], this.A2[i34]);
                        int i35 = i18 + i22;
                        int i36 = i33;
                        sArr[i35] = computeInField.addSquareMatrix(sArr[i35], computeInField.multVects(sArrMultVect4, this.A2[i36]));
                        short[] sArrMultVect5 = computeInField.multVect(this.f99254b2[i36], sArrMultVect4);
                        short[][] sArr6 = this.pub_singular;
                        sArr6[i35] = computeInField.addVect(sArrMultVect5, sArr6[i35]);
                        short[] sArrMultVect6 = computeInField.multVect(this.f99254b2[i34], computeInField.multVect(coeffBeta[i22][i34][i36], this.A2[i36]));
                        short[][] sArr7 = this.pub_singular;
                        sArr7[i35] = computeInField.addVect(sArrMultVect6, sArr7[i35]);
                        short sMultElem2 = GF2Field.multElem(coeffBeta[i22][i34][i36], this.f99254b2[i34]);
                        short[] sArr8 = this.pub_scalar;
                        sArr8[i35] = GF2Field.addElem(sArr8[i35], GF2Field.multElem(sMultElem2, this.f99254b2[i36]));
                        i33 = i36 + 1;
                        i32 = i34;
                        length2 = length2;
                    }
                    i32++;
                }
                int i37 = length2;
                int i38 = i19;
                while (i38 < i37 + i31) {
                    short[] sArrMultVect7 = computeInField.multVect(coeffGamma[i22][i38], this.A2[i38]);
                    short[][] sArr9 = this.pub_singular;
                    int i39 = i18 + i22;
                    int i41 = i38;
                    sArr9[i39] = computeInField.addVect(sArrMultVect7, sArr9[i39]);
                    short[] sArr10 = this.pub_scalar;
                    sArr10[i39] = GF2Field.addElem(sArr10[i39], GF2Field.multElem(coeffGamma[i22][i41], this.f99254b2[i41]));
                    i38 = i41 + 1;
                }
                short[] sArr11 = this.pub_scalar;
                int i42 = i18 + i22;
                sArr11[i42] = GF2Field.addElem(sArr11[i42], coeffEta[i22]);
                i22++;
                i14 = i11;
                length = i31;
                length2 = i37;
            }
            i18 += length;
            i17++;
            z11 = z12;
            i12 = i19;
            i16 = i21;
            i15 = 3;
        }
        int i43 = i14;
        boolean z13 = z11;
        int i44 = i12;
        int i45 = i16;
        int[] iArr2 = new int[i15];
        iArr2[i45] = i43;
        iArr2[z13 ? 1 : 0] = i43;
        iArr2[i44] = i13;
        short[][][] sArr12 = (short[][][]) Array.newInstance((Class<?>) cls, iArr2);
        int[] iArr3 = new int[i45];
        iArr3[z13 ? 1 : 0] = i43;
        iArr3[i44] = i13;
        short[][] sArr13 = (short[][]) Array.newInstance((Class<?>) cls, iArr3);
        short[] sArr14 = new short[i13];
        for (int i46 = i44; i46 < i13; i46++) {
            int i47 = i44;
            while (true) {
                short[][] sArr15 = this.A1;
                if (i47 < sArr15.length) {
                    sArr12[i46] = computeInField.addSquareMatrix(sArr12[i46], computeInField.multMatrix(sArr15[i46][i47], sArr[i47]));
                    sArr13[i46] = computeInField.addVect(sArr13[i46], computeInField.multVect(this.A1[i46][i47], this.pub_singular[i47]));
                    sArr14[i46] = GF2Field.addElem(sArr14[i46], GF2Field.multElem(this.A1[i46][i47], this.pub_scalar[i47]));
                    i47++;
                }
            }
            sArr14[i46] = GF2Field.addElem(sArr14[i46], this.f99253b1[i46]);
        }
        this.pub_singular = sArr13;
        this.pub_scalar = sArr14;
        compactPublicKey(sArr12);
    }

    private void generateF() {
        this.layers = new Layer[this.numOfLayers];
        int i11 = 0;
        while (i11 < this.numOfLayers) {
            Layer[] layerArr = this.layers;
            int[] iArr = this.f99256vi;
            int i12 = i11 + 1;
            layerArr[i11] = new Layer(iArr[i11], iArr[i12], this.f99255sr);
            i11 = i12;
        }
    }

    private void generateL1() {
        int[] iArr = this.f99256vi;
        int i11 = iArr[iArr.length - 1] - iArr[0];
        this.A1 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i11, i11);
        this.A1inv = null;
        ComputeInField computeInField = new ComputeInField();
        while (this.A1inv == null) {
            for (int i12 = 0; i12 < i11; i12++) {
                for (int i13 = 0; i13 < i11; i13++) {
                    this.A1[i12][i13] = (short) (this.f99255sr.nextInt() & 255);
                }
            }
            this.A1inv = computeInField.inverse(this.A1);
        }
        this.f99253b1 = new short[i11];
        for (int i14 = 0; i14 < i11; i14++) {
            this.f99253b1[i14] = (short) (this.f99255sr.nextInt() & 255);
        }
    }

    private void generateL2() {
        int[] iArr = this.f99256vi;
        int i11 = iArr[iArr.length - 1];
        this.A2 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i11, i11);
        this.A2inv = null;
        ComputeInField computeInField = new ComputeInField();
        while (this.A2inv == null) {
            for (int i12 = 0; i12 < i11; i12++) {
                for (int i13 = 0; i13 < i11; i13++) {
                    this.A2[i12][i13] = (short) (this.f99255sr.nextInt() & 255);
                }
            }
            this.A2inv = computeInField.inverse(this.A2);
        }
        this.f99254b2 = new short[i11];
        for (int i14 = 0; i14 < i11; i14++) {
            this.f99254b2[i14] = (short) (this.f99255sr.nextInt() & 255);
        }
    }

    private void initializeDefault() {
        initialize(new RainbowKeyGenerationParameters(CryptoServicesRegistrar.getSecureRandom(), new RainbowParameters()));
    }

    private void keygen() {
        generateL1();
        generateL2();
        generateF();
        computePublicKey();
    }

    public AsymmetricCipherKeyPair genKeyPair() {
        if (!this.initialized) {
            initializeDefault();
        }
        keygen();
        RainbowPrivateKeyParameters rainbowPrivateKeyParameters = new RainbowPrivateKeyParameters(this.A1inv, this.f99253b1, this.A2inv, this.f99254b2, this.f99256vi, this.layers);
        int[] iArr = this.f99256vi;
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new RainbowPublicKeyParameters(iArr[iArr.length - 1] - iArr[0], this.pub_quadratic, this.pub_singular, this.pub_scalar), (AsymmetricKeyParameter) rainbowPrivateKeyParameters);
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        return genKeyPair();
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        initialize(keyGenerationParameters);
    }

    public void initialize(KeyGenerationParameters keyGenerationParameters) {
        RainbowKeyGenerationParameters rainbowKeyGenerationParameters = (RainbowKeyGenerationParameters) keyGenerationParameters;
        this.rainbowParams = rainbowKeyGenerationParameters;
        this.f99255sr = rainbowKeyGenerationParameters.getRandom();
        this.f99256vi = this.rainbowParams.getParameters().getVi();
        this.numOfLayers = this.rainbowParams.getParameters().getNumOfLayers();
        this.initialized = true;
    }
}
