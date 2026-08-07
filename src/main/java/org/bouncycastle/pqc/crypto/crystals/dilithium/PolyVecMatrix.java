package org.bouncycastle.pqc.crypto.crystals.dilithium;

/* JADX INFO: loaded from: classes10.dex */
class PolyVecMatrix {
    private final int dilithiumK;
    private final int dilithiumL;
    private final PolyVecL[] mat;

    public PolyVecMatrix(DilithiumEngine dilithiumEngine) {
        int dilithiumK = dilithiumEngine.getDilithiumK();
        this.dilithiumK = dilithiumK;
        this.dilithiumL = dilithiumEngine.getDilithiumL();
        this.mat = new PolyVecL[dilithiumK];
        for (int i11 = 0; i11 < this.dilithiumK; i11++) {
            this.mat[i11] = new PolyVecL(dilithiumEngine);
        }
    }

    private String addString() {
        StringBuilder sb2;
        String string = "[";
        for (int i11 = 0; i11 < this.dilithiumK; i11++) {
            String str = (string + "Outer Matrix " + i11 + " [") + this.mat[i11].toString();
            if (i11 == this.dilithiumK - 1) {
                sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append("]\n");
            } else {
                sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append("],\n");
            }
            string = sb2.toString();
        }
        return string + "]\n";
    }

    public void expandMatrix(byte[] bArr) {
        for (int i11 = 0; i11 < this.dilithiumK; i11++) {
            for (int i12 = 0; i12 < this.dilithiumL; i12++) {
                this.mat[i11].getVectorIndex(i12).uniformBlocks(bArr, (short) ((i11 << 8) + i12));
            }
        }
    }

    public void pointwiseMontgomery(PolyVecK polyVecK, PolyVecL polyVecL) {
        for (int i11 = 0; i11 < this.dilithiumK; i11++) {
            polyVecK.getVectorIndex(i11).pointwiseAccountMontgomery(this.mat[i11], polyVecL);
        }
    }

    public String toString(String str) {
        return str.concat(": \n" + addString());
    }
}
