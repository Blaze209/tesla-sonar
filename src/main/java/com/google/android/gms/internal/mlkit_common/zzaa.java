package com.google.android.gms.internal.mlkit_common;

/* JADX INFO: loaded from: classes5.dex */
public class zzaa {
    zzaa() {
    }

    static int zza(int i11, int i12) {
        if (i12 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int i13 = i11 + (i11 >> 1) + 1;
        if (i13 < i12) {
            int iHighestOneBit = Integer.highestOneBit(i12 - 1);
            i13 = iHighestOneBit + iHighestOneBit;
        }
        if (i13 < 0) {
            return Integer.MAX_VALUE;
        }
        return i13;
    }
}
