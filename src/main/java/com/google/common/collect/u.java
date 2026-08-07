package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
final class u {
    static int a(int i11, double d11) {
        int iMax = Math.max(i11, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        if (iMax <= ((int) (d11 * ((double) iHighestOneBit)))) {
            return iHighestOneBit;
        }
        int i12 = iHighestOneBit << 1;
        if (i12 > 0) {
            return i12;
        }
        return 1073741824;
    }

    static int b(int i11) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i11) * (-862048943)), 15)) * 461845907);
    }

    static int c(Object obj) {
        return b(obj == null ? 0 : obj.hashCode());
    }
}
