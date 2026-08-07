package org.spongycastle.pqc.crypto.gmss;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import java.util.Vector;
import org.spongycastle.crypto.AsymmetricCipherKeyPair;
import org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.KeyGenerationParameters;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.pqc.crypto.gmss.util.GMSSRandom;
import org.spongycastle.pqc.crypto.gmss.util.WinternitzOTSVerify;
import org.spongycastle.pqc.crypto.gmss.util.WinternitzOTSignature;

/* JADX INFO: loaded from: classes10.dex */
public class GMSSKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    public static final String OID = "1.3.6.1.4.1.8301.3.1.3.3";
    private int[] K;
    private byte[][] currentRootSigs;
    private byte[][] currentSeeds;
    private GMSSDigestProvider digestProvider;
    private GMSSParameters gmssPS;
    private GMSSKeyGenerationParameters gmssParams;
    private GMSSRandom gmssRandom;
    private int[] heightOfTrees;
    private boolean initialized = false;
    private int mdLength;
    private Digest messDigestTree;
    private byte[][] nextNextSeeds;
    private int numLayer;
    private int[] otsIndex;

    public GMSSKeyPairGenerator(GMSSDigestProvider gMSSDigestProvider) {
        this.digestProvider = gMSSDigestProvider;
        Digest digest = gMSSDigestProvider.get();
        this.messDigestTree = digest;
        this.mdLength = digest.getDigestSize();
        this.gmssRandom = new GMSSRandom(this.messDigestTree);
    }

    private AsymmetricCipherKeyPair genKeyPair() {
        int i11;
        Class cls;
        int i12;
        if (!this.initialized) {
            initializeDefault();
        }
        int i13 = this.numLayer;
        byte[][][] bArr = new byte[i13][][];
        byte[][][] bArr2 = new byte[i13 - 1][][];
        Treehash[][] treehashArr = new Treehash[i13][];
        Treehash[][] treehashArr2 = new Treehash[i13 - 1][];
        Vector[] vectorArr = new Vector[i13];
        Vector[] vectorArr2 = new Vector[i13 - 1];
        Vector[][] vectorArr3 = new Vector[i13][];
        char c11 = 1;
        Vector[][] vectorArr4 = new Vector[i13 - 1][];
        int i14 = 0;
        while (true) {
            i11 = this.numLayer;
            cls = Byte.TYPE;
            if (i14 >= i11) {
                break;
            }
            int i15 = this.heightOfTrees[i14];
            char c12 = c11;
            int[] iArr = new int[2];
            iArr[c12] = this.mdLength;
            iArr[0] = i15;
            bArr[i14] = (byte[][]) Array.newInstance((Class<?>) cls, iArr);
            int i16 = this.heightOfTrees[i14];
            treehashArr[i14] = new Treehash[i16 - this.K[i14]];
            if (i14 > 0) {
                int i17 = i14 - 1;
                int[] iArr2 = new int[2];
                iArr2[c12] = this.mdLength;
                iArr2[0] = i16;
                bArr2[i17] = (byte[][]) Array.newInstance((Class<?>) cls, iArr2);
                treehashArr2[i17] = new Treehash[this.heightOfTrees[i14] - this.K[i14]];
            }
            vectorArr[i14] = new Vector();
            if (i14 > 0) {
                vectorArr2[i14 - 1] = new Vector();
            }
            i14++;
            c11 = c12;
        }
        char c13 = c11;
        int[] iArr3 = new int[2];
        iArr3[c13] = this.mdLength;
        iArr3[0] = i11;
        byte[][] bArr3 = (byte[][]) Array.newInstance((Class<?>) cls, iArr3);
        int i18 = this.numLayer - 1;
        int[] iArr4 = new int[2];
        iArr4[c13] = this.mdLength;
        iArr4[0] = i18;
        byte[][] bArr4 = (byte[][]) Array.newInstance((Class<?>) cls, iArr4);
        int i19 = this.numLayer;
        int[] iArr5 = new int[2];
        iArr5[c13] = this.mdLength;
        iArr5[0] = i19;
        byte[][] bArr5 = (byte[][]) Array.newInstance((Class<?>) cls, iArr5);
        int i21 = 0;
        while (true) {
            i12 = this.numLayer;
            if (i21 >= i12) {
                break;
            }
            System.arraycopy(this.currentSeeds[i21], 0, bArr5[i21], 0, this.mdLength);
            i21++;
            bArr3 = bArr3;
        }
        byte[][] bArr6 = bArr3;
        int[] iArr6 = new int[2];
        iArr6[c13] = this.mdLength;
        iArr6[0] = i12 - 1;
        this.currentRootSigs = (byte[][]) Array.newInstance((Class<?>) cls, iArr6);
        int i22 = this.numLayer - 1;
        while (i22 >= 0) {
            GMSSRootCalc gMSSRootCalc = new GMSSRootCalc(this.heightOfTrees[i22], this.K[i22], this.digestProvider);
            try {
                gMSSRootCalc = i22 == this.numLayer + (-1) ? generateCurrentAuthpathAndRoot(null, vectorArr[i22], bArr5[i22], i22) : generateCurrentAuthpathAndRoot(bArr6[i22 + 1], vectorArr[i22], bArr5[i22], i22);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            int i23 = 0;
            while (i23 < this.heightOfTrees[i22]) {
                System.arraycopy(gMSSRootCalc.getAuthPath()[i23], 0, bArr[i22][i23], 0, this.mdLength);
                i23++;
                i22 = i22;
            }
            int i24 = i22;
            vectorArr3[i24] = gMSSRootCalc.getRetain();
            treehashArr[i24] = gMSSRootCalc.getTreehash();
            System.arraycopy(gMSSRootCalc.getRoot(), 0, bArr6[i24], 0, this.mdLength);
            i22 = i24 - 1;
        }
        int i25 = this.numLayer - 2;
        while (i25 >= 0) {
            int i26 = i25 + 1;
            GMSSRootCalc gMSSRootCalcGenerateNextAuthpathAndRoot = generateNextAuthpathAndRoot(vectorArr2[i25], bArr5[i26], i26);
            int i27 = 0;
            while (i27 < this.heightOfTrees[i26]) {
                System.arraycopy(gMSSRootCalcGenerateNextAuthpathAndRoot.getAuthPath()[i27], 0, bArr2[i25][i27], 0, this.mdLength);
                i27++;
                gMSSRootCalcGenerateNextAuthpathAndRoot = gMSSRootCalcGenerateNextAuthpathAndRoot;
                i25 = i25;
                bArr5 = bArr5;
            }
            int i28 = i25;
            GMSSRootCalc gMSSRootCalc2 = gMSSRootCalcGenerateNextAuthpathAndRoot;
            byte[][] bArr7 = bArr5;
            vectorArr4[i28] = gMSSRootCalc2.getRetain();
            treehashArr2[i28] = gMSSRootCalc2.getTreehash();
            System.arraycopy(gMSSRootCalc2.getRoot(), 0, bArr4[i28], 0, this.mdLength);
            System.arraycopy(bArr7[i26], 0, this.nextNextSeeds[i28], 0, this.mdLength);
            i25 = i28 - 1;
            bArr5 = bArr7;
        }
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new GMSSPublicKeyParameters(bArr6[0], this.gmssPS), (AsymmetricKeyParameter) new GMSSPrivateKeyParameters(this.currentSeeds, this.nextNextSeeds, bArr, bArr2, treehashArr, treehashArr2, vectorArr, vectorArr2, vectorArr3, vectorArr4, bArr4, this.currentRootSigs, this.gmssPS, this.digestProvider));
    }

    private GMSSRootCalc generateCurrentAuthpathAndRoot(byte[] bArr, Vector vector, byte[] bArr2, int i11) {
        byte[] bArrVerify;
        int i12 = this.mdLength;
        byte[] bArr3 = new byte[i12];
        byte[] bArr4 = new byte[i12];
        byte[] bArrNextSeed = this.gmssRandom.nextSeed(bArr2);
        GMSSRootCalc gMSSRootCalc = new GMSSRootCalc(this.heightOfTrees[i11], this.K[i11], this.digestProvider);
        gMSSRootCalc.initialize(vector);
        if (i11 == this.numLayer - 1) {
            bArrVerify = new WinternitzOTSignature(bArrNextSeed, this.digestProvider.get(), this.otsIndex[i11]).getPublicKey();
        } else {
            this.currentRootSigs[i11] = new WinternitzOTSignature(bArrNextSeed, this.digestProvider.get(), this.otsIndex[i11]).getSignature(bArr);
            bArrVerify = new WinternitzOTSVerify(this.digestProvider.get(), this.otsIndex[i11]).Verify(bArr, this.currentRootSigs[i11]);
        }
        gMSSRootCalc.update(bArrVerify);
        int i13 = 3;
        int i14 = 0;
        int i15 = 1;
        while (true) {
            int i16 = this.heightOfTrees[i11];
            if (i15 >= (1 << i16)) {
                break;
            }
            if (i15 == i13 && i14 < i16 - this.K[i11]) {
                gMSSRootCalc.initializeTreehashSeed(bArr2, i14);
                i13 *= 2;
                i14++;
            }
            gMSSRootCalc.update(new WinternitzOTSignature(this.gmssRandom.nextSeed(bArr2), this.digestProvider.get(), this.otsIndex[i11]).getPublicKey());
            i15++;
        }
        if (gMSSRootCalc.wasFinished()) {
            return gMSSRootCalc;
        }
        System.err.println("Baum noch nicht fertig konstruiert!!!");
        return null;
    }

    private GMSSRootCalc generateNextAuthpathAndRoot(Vector vector, byte[] bArr, int i11) {
        byte[] bArr2 = new byte[this.numLayer];
        GMSSRootCalc gMSSRootCalc = new GMSSRootCalc(this.heightOfTrees[i11], this.K[i11], this.digestProvider);
        gMSSRootCalc.initialize(vector);
        int i12 = 3;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int i15 = this.heightOfTrees[i11];
            if (i13 >= (1 << i15)) {
                break;
            }
            if (i13 == i12 && i14 < i15 - this.K[i11]) {
                gMSSRootCalc.initializeTreehashSeed(bArr, i14);
                i12 *= 2;
                i14++;
            }
            gMSSRootCalc.update(new WinternitzOTSignature(this.gmssRandom.nextSeed(bArr), this.digestProvider.get(), this.otsIndex[i11]).getPublicKey());
            i13++;
        }
        if (gMSSRootCalc.wasFinished()) {
            return gMSSRootCalc;
        }
        System.err.println("N�chster Baum noch nicht fertig konstruiert!!!");
        return null;
    }

    private void initializeDefault() {
        initialize(new GMSSKeyGenerationParameters(new SecureRandom(), new GMSSParameters(4, new int[]{10, 10, 10, 10}, new int[]{3, 3, 3, 3}, new int[]{2, 2, 2, 2})));
    }

    @Override // org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        return genKeyPair();
    }

    @Override // org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        initialize(keyGenerationParameters);
    }

    public void initialize(int i11, SecureRandom secureRandom) {
        GMSSKeyGenerationParameters gMSSKeyGenerationParameters;
        if (i11 <= 10) {
            gMSSKeyGenerationParameters = new GMSSKeyGenerationParameters(secureRandom, new GMSSParameters(1, new int[]{10}, new int[]{3}, new int[]{2}));
        } else {
            gMSSKeyGenerationParameters = i11 <= 20 ? new GMSSKeyGenerationParameters(secureRandom, new GMSSParameters(2, new int[]{10, 10}, new int[]{5, 4}, new int[]{2, 2})) : new GMSSKeyGenerationParameters(secureRandom, new GMSSParameters(4, new int[]{10, 10, 10, 10}, new int[]{9, 9, 9, 3}, new int[]{2, 2, 2, 2}));
        }
        initialize(gMSSKeyGenerationParameters);
    }

    public void initialize(KeyGenerationParameters keyGenerationParameters) {
        GMSSKeyGenerationParameters gMSSKeyGenerationParameters = (GMSSKeyGenerationParameters) keyGenerationParameters;
        this.gmssParams = gMSSKeyGenerationParameters;
        GMSSParameters gMSSParameters = new GMSSParameters(gMSSKeyGenerationParameters.getParameters().getNumOfLayers(), this.gmssParams.getParameters().getHeightOfTrees(), this.gmssParams.getParameters().getWinternitzParameter(), this.gmssParams.getParameters().getK());
        this.gmssPS = gMSSParameters;
        this.numLayer = gMSSParameters.getNumOfLayers();
        this.heightOfTrees = this.gmssPS.getHeightOfTrees();
        this.otsIndex = this.gmssPS.getWinternitzParameter();
        this.K = this.gmssPS.getK();
        int[] iArr = {this.numLayer, this.mdLength};
        Class cls = Byte.TYPE;
        this.currentSeeds = (byte[][]) Array.newInstance((Class<?>) cls, iArr);
        this.nextNextSeeds = (byte[][]) Array.newInstance((Class<?>) cls, this.numLayer - 1, this.mdLength);
        SecureRandom secureRandom = new SecureRandom();
        for (int i11 = 0; i11 < this.numLayer; i11++) {
            secureRandom.nextBytes(this.currentSeeds[i11]);
            this.gmssRandom.nextSeed(this.currentSeeds[i11]);
        }
        this.initialized = true;
    }
}
