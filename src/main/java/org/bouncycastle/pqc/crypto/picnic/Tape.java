package org.bouncycastle.pqc.crypto.picnic;

import java.lang.reflect.Array;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes10.dex */
class Tape {
    private PicnicEngine engine;
    int nTapes;
    int pos = 0;
    byte[][] tapes;

    public Tape(PicnicEngine picnicEngine) {
        this.engine = picnicEngine;
        this.tapes = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, picnicEngine.numMPCParties, picnicEngine.andSizeBytes * 2);
        this.nTapes = picnicEngine.numMPCParties;
    }

    private void tapesToParityBits(int[] iArr, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            Utils.setBitInWordArray(iArr, i12, Utils.parity16(tapesToWord()));
        }
    }

    protected void computeAuxTape(byte[] bArr) {
        int[] iArr = new int[16];
        int[] iArr2 = new int[16];
        int[] iArr3 = new int[16];
        int[] iArr4 = new int[16];
        int[] iArr5 = new int[16];
        PicnicEngine picnicEngine = this.engine;
        iArr5[picnicEngine.stateSizeWords - 1] = 0;
        tapesToParityBits(iArr5, picnicEngine.stateSizeBits);
        PicnicEngine picnicEngine2 = this.engine;
        KMatricesWithPointer kMatricesWithPointerKMatrixInv = picnicEngine2.lowmcConstants.KMatrixInv(picnicEngine2);
        this.engine.matrix_mul(iArr4, iArr5, kMatricesWithPointerKMatrixInv.getData(), kMatricesWithPointerKMatrixInv.getMatrixPointer());
        if (bArr != null) {
            Pack.intToLittleEndian(iArr4, 0, this.engine.stateSizeWords, bArr, 0);
        }
        for (int i11 = this.engine.numRounds; i11 > 0; i11--) {
            PicnicEngine picnicEngine3 = this.engine;
            KMatricesWithPointer kMatricesWithPointerKMatrix = picnicEngine3.lowmcConstants.KMatrix(picnicEngine3, i11);
            this.engine.matrix_mul(iArr, iArr4, kMatricesWithPointerKMatrix.getData(), kMatricesWithPointerKMatrix.getMatrixPointer());
            this.engine.xor_array(iArr2, iArr2, iArr, 0);
            PicnicEngine picnicEngine4 = this.engine;
            int i12 = i11 - 1;
            KMatricesWithPointer kMatricesWithPointerLMatrixInv = picnicEngine4.lowmcConstants.LMatrixInv(picnicEngine4, i12);
            this.engine.matrix_mul(iArr3, iArr2, kMatricesWithPointerLMatrixInv.getData(), kMatricesWithPointerLMatrixInv.getMatrixPointer());
            if (i11 == 1) {
                System.arraycopy(iArr5, 0, iArr2, 0, 16);
            } else {
                int i13 = this.engine.stateSizeBits;
                this.pos = i13 * 2 * i12;
                tapesToParityBits(iArr2, i13);
            }
            PicnicEngine picnicEngine5 = this.engine;
            int i14 = picnicEngine5.stateSizeBits;
            this.pos = (i14 * 2 * i12) + i14;
            picnicEngine5.aux_mpc_sbox(iArr2, iArr3, this);
        }
        this.pos = 0;
    }

    protected void setAuxBits(byte[] bArr) {
        PicnicEngine picnicEngine = this.engine;
        int i11 = picnicEngine.numMPCParties - 1;
        int i12 = picnicEngine.stateSizeBits;
        int i13 = 0;
        for (int i14 = 0; i14 < this.engine.numRounds; i14++) {
            int i15 = 0;
            while (i15 < i12) {
                Utils.setBit(this.tapes[i11], (i12 * 2 * i14) + i12 + i15, Utils.getBit(bArr, i13));
                i15++;
                i13++;
            }
        }
    }

    protected int tapesToWord() {
        int i11 = this.pos;
        int i12 = i11 >>> 3;
        int i13 = (i11 & 7) ^ 7;
        int i14 = 1 << i13;
        byte[][] bArr = this.tapes;
        int i15 = ((bArr[15][i12] & i14) << 8) | (bArr[7][i12] & i14) | ((bArr[0][i12] & i14) << 7) | ((bArr[1][i12] & i14) << 6) | ((bArr[2][i12] & i14) << 5) | ((bArr[3][i12] & i14) << 4) | ((bArr[4][i12] & i14) << 3) | ((bArr[5][i12] & i14) << 2) | ((bArr[6][i12] & i14) << 1) | ((bArr[8][i12] & i14) << 15) | ((bArr[9][i12] & i14) << 14) | ((bArr[10][i12] & i14) << 13) | ((bArr[11][i12] & i14) << 12) | ((bArr[12][i12] & i14) << 11) | ((bArr[13][i12] & i14) << 10) | ((bArr[14][i12] & i14) << 9);
        this.pos = i11 + 1;
        return i15 >>> i13;
    }
}
