package com.google.android.gms.internal.mlkit_vision_barcode;

import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: loaded from: classes5.dex */
public final class zzdw extends zzdx {
    public static int zza(int i11, int i12, int i13) {
        return Math.min(Math.max(i11, i12), LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
    }
}
