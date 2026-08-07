package com.google.android.gms.internal.mlkit_vision_face;

import java.util.AbstractMap;

/* JADX INFO: loaded from: classes5.dex */
final class zzcd extends zzbn {
    final /* synthetic */ zzce zza;

    zzcd(zzce zzceVar) {
        this.zza = zzceVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i11) {
        zzab.zza(i11, this.zza.zzc, "index");
        zzce zzceVar = this.zza;
        int i12 = i11 + i11;
        Object obj = zzceVar.zzb[i12];
        obj.getClass();
        Object obj2 = zzceVar.zzb[i12 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzc;
    }
}
