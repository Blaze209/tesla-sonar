package com.google.android.libraries.places.internal;

import java.util.AbstractMap;

/* JADX INFO: loaded from: classes5.dex */
final class zzjn extends zziy {
    final /* synthetic */ zzjo zza;

    zzjn(zzjo zzjoVar) {
        this.zza = zzjoVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i11) {
        zzig.zza(i11, this.zza.zzc, "index");
        zzjo zzjoVar = this.zza;
        int i12 = i11 + i11;
        Object obj = zzjoVar.zzb[i12];
        obj.getClass();
        Object obj2 = zzjoVar.zzb[i12 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzc;
    }

    @Override // com.google.android.libraries.places.internal.zziv
    public final boolean zzf() {
        return true;
    }
}
