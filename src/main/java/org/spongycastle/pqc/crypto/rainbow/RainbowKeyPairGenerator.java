package org.spongycastle.pqc.crypto.rainbow;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import org.spongycastle.crypto.AsymmetricCipherKeyPair;
import org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.spongycastle.crypto.KeyGenerationParameters;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.pqc.crypto.rainbow.util.ComputeInField;
import org.spongycastle.pqc.crypto.rainbow.util.GF2Field;

/* JADX INFO: loaded from: classes10.dex */
public class RainbowKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private short[][] A1;
    private short[][] A1inv;
    private short[][] A2;
    private short[][] A2inv;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private short[] f99832b1;

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    private short[] f99833b2;
    private boolean initialized = false;
    private Layer[] layers;
    private int numOfLayers;
    private short[][] pub_quadratic;
    private short[] pub_scalar;
    private short[][] pub_singular;
    private RainbowKeyGenerationParameters rainbowParams;

    /* JADX INFO: renamed from: sr, reason: collision with root package name */
    private SecureRandom f99834sr;

    /* JADX INFO: renamed from: vi, reason: collision with root package name */
    private int[] f99835vi;

    private void compactPublicKey(short[][][] sArr) {
        int length = sArr.length;
        int length2 = sArr[0].length;
        this.pub_quadratic = (short[][]) Array.newInstance((Class<?>) Short.TYPE, length, ((length2 + 1) * length2) / 2);
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = 0;
            for (int i13 = 0; i13 < length2; i13++) {
                for (int i14 = i13; i14 < length2; i14++) {
                    if (i14 == i13) {
                        this.pub_quadratic[i11][i12] = sArr[i11][i13][i14];
                    } else {
                        short[] sArr2 = this.pub_quadratic[i11];
                        short[][] sArr3 = sArr[i11];
                        sArr2[i12] = GF2Field.addElem(sArr3[i13][i14], sArr3[i14][i13]);
                    }
                    i12++;
                }
            }
        }
    }

    private void computePublicKey() {
        ComputeInField computeInField = new ComputeInField();
        int[] iArr = this.f99835vi;
        boolean z11 = true;
        int i11 = 0;
        int i12 = iArr[iArr.length - 1] - iArr[0];
        int i13 = iArr[iArr.length - 1];
        int i14 = 3;
        int i15 = 2;
        Class cls = Short.TYPE;
        short[][][] sArr = (short[][][]) Array.newInstance((Class<?>) cls, i12, i13, i13);
        this.pub_singular = (short[][]) Array.newInstance((Class<?>) cls, i12, i13);
        this.pub_scalar = new short[i12];
        short[] sArr2 = new short[i13];
        int i16 = 0;
        int i17 = 0;
        while (true) {
            Layer[] layerArr = this.layers;
            if (i16 >= layerArr.length) {
                break;
            }
            short[][][] coeffAlpha = layerArr[i16].getCoeffAlpha();
            short[][][] coeffBeta = this.layers[i16].getCoeffBeta();
            short[][] coeffGamma = this.layers[i16].getCoeffGamma();
            short[] coeffEta = this.layers[i16].getCoeffEta();
            boolean z12 = z11;
            int length = coeffAlpha[i11].length;
            int i18 = i11;
            int length2 = coeffBeta[i18].length;
            int i19 = i15;
            int i21 = i18;
            while (i21 < length) {
                int i22 = i18;
                while (i22 < length) {
                    int i23 = i13;
                    int i24 = i18;
                    while (i24 < length2) {
                        int i25 = i24;
                        int i26 = length;
                        int i27 = i22 + length2;
                        short[] sArrMultVect = computeInField.multVect(coeffAlpha[i21][i22][i25], this.A2[i27]);
                        int i28 = i17 + i21;
                        int i29 = i22;
                        sArr[i28] = computeInField.addSquareMatrix(sArr[i28], computeInField.multVects(sArrMultVect, this.A2[i25]));
                        short[] sArrMultVect2 = computeInField.multVect(this.f99833b2[i25], sArrMultVect);
                        short[][] sArr3 = this.pub_singular;
                        sArr3[i28] = computeInField.addVect(sArrMultVect2, sArr3[i28]);
                        short[] sArrMultVect3 = computeInField.multVect(this.f99833b2[i27], computeInField.multVect(coeffAlpha[i21][i29][i25], this.A2[i25]));
                        short[][] sArr4 = this.pub_singular;
                        sArr4[i28] = computeInField.addVect(sArrMultVect3, sArr4[i28]);
                        short sMultElem = GF2Field.multElem(coeffAlpha[i21][i29][i25], this.f99833b2[i27]);
                        short[] sArr5 = this.pub_scalar;
                        sArr5[i28] = GF2Field.addElem(sArr5[i28], GF2Field.multElem(sMultElem, this.f99833b2[i25]));
                        i24 = i25 + 1;
                        length = i26;
                        i22 = i29;
                    }
                    i22++;
                    i13 = i23;
                }
                int i31 = i13;
                int i32 = length;
                int i33 = i18;
                while (i33 < length2) {
                    int i34 = i18;
                    while (i34 < length2) {
                        int i35 = i33;
                        short[] sArrMultVect4 = computeInField.multVect(coeffBeta[i21][i33][i34], this.A2[i35]);
                        int i36 = i17 + i21;
                        int i37 = i34;
                        sArr[i36] = computeInField.addSquareMatrix(sArr[i36], computeInField.multVects(sArrMultVect4, this.A2[i37]));
                        short[] sArrMultVect5 = computeInField.multVect(this.f99833b2[i37], sArrMultVect4);
                        short[][] sArr6 = this.pub_singular;
                        sArr6[i36] = computeInField.addVect(sArrMultVect5, sArr6[i36]);
                        short[] sArrMultVect6 = computeInField.multVect(this.f99833b2[i35], computeInField.multVect(coeffBeta[i21][i35][i37], this.A2[i37]));
                        short[][] sArr7 = this.pub_singular;
                        sArr7[i36] = computeInField.addVect(sArrMultVect6, sArr7[i36]);
                        short sMultElem2 = GF2Field.multElem(coeffBeta[i21][i35][i37], this.f99833b2[i35]);
                        short[] sArr8 = this.pub_scalar;
                        sArr8[i36] = GF2Field.addElem(sArr8[i36], GF2Field.multElem(sMultElem2, this.f99833b2[i37]));
                        i34 = i37 + 1;
                        i33 = i35;
                        length2 = length2;
                    }
                    i33++;
                }
                int i38 = length2;
                int i39 = i18;
                while (i39 < i38 + i32) {
                    short[] sArrMultVect7 = computeInField.multVect(coeffGamma[i21][i39], this.A2[i39]);
                    short[][] sArr9 = this.pub_singular;
                    int i41 = i17 + i21;
                    int i42 = i39;
                    sArr9[i41] = computeInField.addVect(sArrMultVect7, sArr9[i41]);
                    short[] sArr10 = this.pub_scalar;
                    sArr10[i41] = GF2Field.addElem(sArr10[i41], GF2Field.multElem(coeffGamma[i21][i42], this.f99833b2[i42]));
                    i39 = i42 + 1;
                }
                short[] sArr11 = this.pub_scalar;
                int i43 = i17 + i21;
                sArr11[i43] = GF2Field.addElem(sArr11[i43], coeffEta[i21]);
                i21++;
                i13 = i31;
                length = i32;
                length2 = i38;
            }
            i17 += length;
            i16++;
            z11 = z12;
            i11 = i18;
            i15 = i19;
            i14 = 3;
        }
        int i44 = i13;
        boolean z13 = z11;
        int i45 = i11;
        int i46 = i15;
        int[] iArr2 = new int[i14];
        iArr2[i46] = i44;
        iArr2[z13 ? 1 : 0] = i44;
        iArr2[i45] = i12;
        short[][][] sArr12 = (short[][][]) Array.newInstance((Class<?>) cls, iArr2);
        int[] iArr3 = new int[i46];
        iArr3[z13 ? 1 : 0] = i44;
        iArr3[i45] = i12;
        short[][] sArr13 = (short[][]) Array.newInstance((Class<?>) cls, iArr3);
        short[] sArr14 = new short[i12];
        for (int i47 = i45; i47 < i12; i47++) {
            int i48 = i45;
            while (true) {
                short[][] sArr15 = this.A1;
                if (i48 < sArr15.length) {
                    sArr12[i47] = computeInField.addSquareMatrix(sArr12[i47], computeInField.multMatrix(sArr15[i47][i48], sArr[i48]));
                    sArr13[i47] = computeInField.addVect(sArr13[i47], computeInField.multVect(this.A1[i47][i48], this.pub_singular[i48]));
                    sArr14[i47] = GF2Field.addElem(sArr14[i47], GF2Field.multElem(this.A1[i47][i48], this.pub_scalar[i48]));
                    i48++;
                }
            }
            sArr14[i47] = GF2Field.addElem(sArr14[i47], this.f99832b1[i47]);
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
            int[] iArr = this.f99835vi;
            int i12 = i11 + 1;
            layerArr[i11] = new Layer(iArr[i11], iArr[i12], this.f99834sr);
            i11 = i12;
        }
    }

    private void generateL1() {
        int[] iArr = this.f99835vi;
        int i11 = iArr[iArr.length - 1] - iArr[0];
        this.A1 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i11, i11);
        this.A1inv = null;
        ComputeInField computeInField = new ComputeInField();
        while (this.A1inv == null) {
            for (int i12 = 0; i12 < i11; i12++) {
                for (int i13 = 0; i13 < i11; i13++) {
                    this.A1[i12][i13] = (short) (this.f99834sr.nextInt() & 255);
                }
            }
            this.A1inv = computeInField.inverse(this.A1);
        }
        this.f99832b1 = new short[i11];
        for (int i14 = 0; i14 < i11; i14++) {
            this.f99832b1[i14] = (short) (this.f99834sr.nextInt() & 255);
        }
    }

    private void generateL2() {
        int[] iArr = this.f99835vi;
        int i11 = iArr[iArr.length - 1];
        this.A2 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i11, i11);
        this.A2inv = null;
        ComputeInField computeInField = new ComputeInField();
        while (this.A2inv == null) {
            for (int i12 = 0; i12 < i11; i12++) {
                for (int i13 = 0; i13 < i11; i13++) {
                    this.A2[i12][i13] = (short) (this.f99834sr.nextInt() & 255);
                }
            }
            this.A2inv = computeInField.inverse(this.A2);
        }
        this.f99833b2 = new short[i11];
        for (int i14 = 0; i14 < i11; i14++) {
            this.f99833b2[i14] = (short) (this.f99834sr.nextInt() & 255);
        }
    }

    private void initializeDefault() {
        initialize(new RainbowKeyGenerationParameters(new SecureRandom(), new RainbowParameters()));
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
        RainbowPrivateKeyParameters rainbowPrivateKeyParameters = new RainbowPrivateKeyParameters(this.A1inv, this.f99832b1, this.A2inv, this.f99833b2, this.f99835vi, this.layers);
        int[] iArr = this.f99835vi;
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new RainbowPublicKeyParameters(iArr[iArr.length - 1] - iArr[0], this.pub_quadratic, this.pub_singular, this.pub_scalar), (AsymmetricKeyParameter) rainbowPrivateKeyParameters);
    }

    @Override // org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        return genKeyPair();
    }

    @Override // org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        initialize(keyGenerationParameters);
    }

    public void initialize(KeyGenerationParameters keyGenerationParameters) {
        this.rainbowParams = (RainbowKeyGenerationParameters) keyGenerationParameters;
        this.f99834sr = new SecureRandom();
        this.f99835vi = this.rainbowParams.getParameters().getVi();
        this.numOfLayers = this.rainbowParams.getParameters().getNumOfLayers();
        this.initialized = true;
    }
}
