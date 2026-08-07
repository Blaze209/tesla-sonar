package org.bouncycastle.pqc.crypto.crystals.dilithium;

/* JADX INFO: loaded from: classes10.dex */
class PolyVecK {
    private int dilithiumK;
    private int dilithiumL;
    private DilithiumEngine engine;
    private int mode;
    private int polyVecBytes;
    Poly[] vec;

    public PolyVecK() throws Exception {
        throw new Exception("Requires Parameter");
    }

    public void addPolyVecK(PolyVecK polyVecK) {
        for (int i11 = 0; i11 < this.dilithiumK; i11++) {
            getVectorIndex(i11).addPoly(polyVecK.getVectorIndex(i11));
        }
    }

    public boolean checkNorm(int i11) {
        for (int i12 = 0; i12 < this.dilithiumK; i12++) {
            if (getVectorIndex(i12).checkNorm(i11)) {
                return true;
            }
        }
        return false;
    }

    public void conditionalAddQ() {
        for (int i11 = 0; i11 < this.dilithiumK; i11++) {
            getVectorIndex(i11).conditionalAddQ();
        }
    }

    public void decompose(PolyVecK polyVecK) {
        for (int i11 = 0; i11 < this.dilithiumK; i11++) {
            getVectorIndex(i11).decompose(polyVecK.getVectorIndex(i11));
        }
    }

    public Poly getVectorIndex(int i11) {
        return this.vec[i11];
    }

    public void invNttToMont() {
        for (int i11 = 0; i11 < this.dilithiumK; i11++) {
            getVectorIndex(i11).invNttToMont();
        }
    }

    public int makeHint(PolyVecK polyVecK, PolyVecK polyVecK2) {
        int iPolyMakeHint = 0;
        for (int i11 = 0; i11 < this.dilithiumK; i11++) {
            iPolyMakeHint += getVectorIndex(i11).polyMakeHint(polyVecK.getVectorIndex(i11), polyVecK2.getVectorIndex(i11));
        }
        return iPolyMakeHint;
    }

    public byte[] packW1() {
        byte[] bArr = new byte[this.dilithiumK * this.engine.getDilithiumPolyW1PackedBytes()];
        for (int i11 = 0; i11 < this.dilithiumK; i11++) {
            System.arraycopy(getVectorIndex(i11).w1Pack(), 0, bArr, this.engine.getDilithiumPolyW1PackedBytes() * i11, this.engine.getDilithiumPolyW1PackedBytes());
        }
        return bArr;
    }

    public void pointwisePolyMontgomery(Poly poly, PolyVecK polyVecK) {
        for (int i11 = 0; i11 < this.dilithiumK; i11++) {
            getVectorIndex(i11).pointwiseMontgomery(poly, polyVecK.getVectorIndex(i11));
        }
    }

    public void polyVecNtt() {
        for (int i11 = 0; i11 < this.dilithiumK; i11++) {
            this.vec[i11].polyNtt();
        }
    }

    public void power2Round(PolyVecK polyVecK) {
        for (int i11 = 0; i11 < this.dilithiumK; i11++) {
            getVectorIndex(i11).power2Round(polyVecK.getVectorIndex(i11));
        }
    }

    public void reduce() {
        for (int i11 = 0; i11 < this.dilithiumK; i11++) {
            getVectorIndex(i11).reduce();
        }
    }

    public void setVectorIndex(int i11, Poly poly) {
        this.vec[i11] = poly;
    }

    public void shiftLeft() {
        for (int i11 = 0; i11 < this.dilithiumK; i11++) {
            getVectorIndex(i11).shiftLeft();
        }
    }

    public void subtract(PolyVecK polyVecK) {
        for (int i11 = 0; i11 < this.dilithiumK; i11++) {
            getVectorIndex(i11).subtract(polyVecK.getVectorIndex(i11));
        }
    }

    public String toString() {
        String str = "[";
        for (int i11 = 0; i11 < this.dilithiumK; i11++) {
            str = str + i11 + " " + getVectorIndex(i11).toString();
            if (i11 != this.dilithiumK - 1) {
                str = str + ",\n";
            }
        }
        return str + "]";
    }

    public void uniformEta(byte[] bArr, short s11) {
        int i11 = 0;
        while (i11 < this.dilithiumK) {
            getVectorIndex(i11).uniformEta(bArr, s11);
            i11++;
            s11 = (short) (s11 + 1);
        }
    }

    public void useHint(PolyVecK polyVecK, PolyVecK polyVecK2) {
        for (int i11 = 0; i11 < this.dilithiumK; i11++) {
            getVectorIndex(i11).polyUseHint(polyVecK.getVectorIndex(i11), polyVecK2.getVectorIndex(i11));
        }
    }

    public PolyVecK(DilithiumEngine dilithiumEngine) {
        this.engine = dilithiumEngine;
        this.mode = dilithiumEngine.getDilithiumMode();
        this.dilithiumK = dilithiumEngine.getDilithiumK();
        this.dilithiumL = dilithiumEngine.getDilithiumL();
        this.vec = new Poly[this.dilithiumK];
        for (int i11 = 0; i11 < this.dilithiumK; i11++) {
            this.vec[i11] = new Poly(dilithiumEngine);
        }
    }

    public String toString(String str) {
        return str + ": " + toString();
    }
}
