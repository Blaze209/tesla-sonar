package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
final class zzci extends zzbk {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc = 1;

    zzci(Object[] objArr, int i11, int i12) {
        this.zza = objArr;
        this.zzb = i11;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        zzx.zza(i11, this.zzc, "index");
        Object obj = this.zza[i11 + i11 + this.zzb];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }
}
