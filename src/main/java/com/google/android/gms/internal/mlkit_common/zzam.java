package com.google.android.gms.internal.mlkit_common;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
final class zzam extends zzaf {
    final /* synthetic */ zzan zza;

    zzam(zzan zzanVar) {
        this.zza = zzanVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i11) {
        zzt.zza(i11, this.zza.zzc, "index");
        int i12 = i11 + i11;
        Object obj = this.zza.zzb[i12];
        Objects.requireNonNull(obj);
        Object obj2 = this.zza.zzb[i12 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzc;
    }
}
