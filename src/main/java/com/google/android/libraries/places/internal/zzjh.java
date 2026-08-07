package com.google.android.libraries.places.internal;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes5.dex */
public final class zzjh {
    public static List zza(List list, zzce zzceVar) {
        return list instanceof RandomAccess ? new zzje(list, zzceVar, null) : new zzjg(list, zzceVar, null);
    }
}
