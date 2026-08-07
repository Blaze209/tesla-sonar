package org.bouncycastle.pqc.crypto.picnic;

/* JADX INFO: loaded from: classes10.dex */
class KMatrices {
    private int columns;
    private int[] data;
    private int nmatrices;
    private int rows;

    public KMatrices(int i11, int i12, int i13, int[] iArr) {
        this.nmatrices = i11;
        this.rows = i12;
        this.columns = i13;
        this.data = iArr;
    }

    public int getColumns() {
        return this.columns;
    }

    public int[] getData() {
        return this.data;
    }

    public int getNmatrices() {
        return this.nmatrices;
    }

    public int getRows() {
        return this.rows;
    }

    public int getSize() {
        return this.rows * this.columns;
    }
}
