package org.bouncycastle.pqc.crypto.rainbow;

import java.lang.reflect.Array;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
class RainbowPublicMap {
    private RainbowParameters params;
    private final int num_gf_elements = 256;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private ComputeInField f99161cf = new ComputeInField();

    public RainbowPublicMap(RainbowParameters rainbowParameters) {
        this.params = rainbowParameters;
    }

    private short[] add_and_reduce(short[][] sArr) {
        int m11 = this.params.getM();
        short[] sArrAddVect = new short[m11];
        for (int i11 = 0; i11 < 8; i11++) {
            int iPow = (int) Math.pow(2.0d, i11);
            short[] sArrAddVect2 = new short[m11];
            for (int i12 = iPow; i12 < 256; i12 += iPow * 2) {
                for (int i13 = 0; i13 < iPow; i13++) {
                    sArrAddVect2 = this.f99161cf.addVect(sArrAddVect2, sArr[i12 + i13]);
                }
            }
            ComputeInField computeInField = this.f99161cf;
            sArrAddVect = computeInField.addVect(sArrAddVect, computeInField.multVect((short) iPow, sArrAddVect2));
        }
        return sArrAddVect;
    }

    private short[][] compute_accumulator(short[] sArr, short[] sArr2, short[][][] sArr3, int i11) {
        short[][] sArr4 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, 256, i11);
        int length = sArr2.length;
        short[][] sArr5 = sArr3[0];
        if (length != sArr5.length || sArr.length != sArr5[0].length || sArr3.length != i11) {
            throw new RuntimeException("Accumulator calculation not possible!");
        }
        for (int i12 = 0; i12 < sArr2.length; i12++) {
            short[] sArrMultVect = this.f99161cf.multVect(sArr2[i12], sArr);
            for (int i13 = 0; i13 < sArr.length; i13++) {
                for (int i14 = 0; i14 < sArr3.length; i14++) {
                    short s11 = sArrMultVect[i13];
                    if (s11 != 0) {
                        short[] sArr6 = sArr4[s11];
                        sArr6[i14] = GF2Field.addElem(sArr6[i14], sArr3[i14][i12][i13]);
                    }
                }
            }
        }
        return sArr4;
    }

    public short[] publicMap(RainbowPublicKeyParameters rainbowPublicKeyParameters, short[] sArr) {
        return add_and_reduce(compute_accumulator(sArr, sArr, rainbowPublicKeyParameters.f99160pk, this.params.getM()));
    }

    public short[] publicMap_cyclic(RainbowPublicKeyParameters rainbowPublicKeyParameters, short[] sArr) {
        int v11 = this.params.getV1();
        int o11 = this.params.getO1();
        int o12 = this.params.getO2();
        short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, 256, o11 + o12);
        short[] sArrCopyOfRange = Arrays.copyOfRange(sArr, 0, v11);
        int i11 = v11 + o11;
        short[] sArrCopyOfRange2 = Arrays.copyOfRange(sArr, v11, i11);
        short[] sArrCopyOfRange3 = Arrays.copyOfRange(sArr, i11, sArr.length);
        RainbowDRBG rainbowDRBG = new RainbowDRBG(rainbowPublicKeyParameters.pk_seed, rainbowPublicKeyParameters.getParameters().getHash_algo());
        short[][] sArrAddMatrix = this.f99161cf.addMatrix(this.f99161cf.addMatrix(this.f99161cf.addMatrix(this.f99161cf.addMatrix(this.f99161cf.addMatrix(compute_accumulator(sArrCopyOfRange, sArrCopyOfRange, RainbowUtil.generate_random(rainbowDRBG, o11, v11, v11, true), o11), compute_accumulator(sArrCopyOfRange2, sArrCopyOfRange, RainbowUtil.generate_random(rainbowDRBG, o11, v11, o11, false), o11)), compute_accumulator(sArrCopyOfRange3, sArrCopyOfRange, rainbowPublicKeyParameters.l1_Q3, o11)), compute_accumulator(sArrCopyOfRange2, sArrCopyOfRange2, rainbowPublicKeyParameters.l1_Q5, o11)), compute_accumulator(sArrCopyOfRange3, sArrCopyOfRange2, rainbowPublicKeyParameters.l1_Q6, o11)), compute_accumulator(sArrCopyOfRange3, sArrCopyOfRange3, rainbowPublicKeyParameters.l1_Q9, o11));
        short[][] sArrAddMatrix2 = this.f99161cf.addMatrix(this.f99161cf.addMatrix(this.f99161cf.addMatrix(this.f99161cf.addMatrix(this.f99161cf.addMatrix(compute_accumulator(sArrCopyOfRange, sArrCopyOfRange, RainbowUtil.generate_random(rainbowDRBG, o12, v11, v11, true), o12), compute_accumulator(sArrCopyOfRange2, sArrCopyOfRange, RainbowUtil.generate_random(rainbowDRBG, o12, v11, o11, false), o12)), compute_accumulator(sArrCopyOfRange3, sArrCopyOfRange, RainbowUtil.generate_random(rainbowDRBG, o12, v11, o12, false), o12)), compute_accumulator(sArrCopyOfRange2, sArrCopyOfRange2, RainbowUtil.generate_random(rainbowDRBG, o12, o11, o11, true), o12)), compute_accumulator(sArrCopyOfRange3, sArrCopyOfRange2, RainbowUtil.generate_random(rainbowDRBG, o12, o11, o12, false), o12)), compute_accumulator(sArrCopyOfRange3, sArrCopyOfRange3, rainbowPublicKeyParameters.l2_Q9, o12));
        for (int i12 = 0; i12 < 256; i12++) {
            sArr2[i12] = Arrays.concatenate(sArrAddMatrix[i12], sArrAddMatrix2[i12]);
        }
        return add_and_reduce(sArr2);
    }
}
