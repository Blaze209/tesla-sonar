package org.bouncycastle.pqc.legacy.crypto.qtesla;

/* JADX INFO: loaded from: classes10.dex */
final class IntSlicer {
    private int base;
    private final int[] values;

    IntSlicer(int[] iArr, int i11) {
        this.values = iArr;
        this.base = i11;
    }

    final int at(int i11) {
        return this.values[this.base + i11];
    }

    final IntSlicer copy() {
        return new IntSlicer(this.values, this.base);
    }

    final IntSlicer from(int i11) {
        return new IntSlicer(this.values, this.base + i11);
    }

    final void incBase(int i11) {
        this.base += i11;
    }

    final int at(int i11, int i12) {
        this.values[this.base + i11] = i12;
        return i12;
    }

    final int at(int i11, long j11) {
        int[] iArr = this.values;
        int i12 = this.base + i11;
        int i13 = (int) j11;
        iArr[i12] = i13;
        return i13;
    }
}
