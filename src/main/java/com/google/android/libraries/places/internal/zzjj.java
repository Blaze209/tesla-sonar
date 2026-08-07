package com.google.android.libraries.places.internal;

import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzjj implements Comparator {
    protected zzjj() {
    }

    public static zzjj zza(Comparator comparator) {
        return new zzio(comparator);
    }
}
