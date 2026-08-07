package com.google.android.gms.internal.mlkit_vision_document_scanner;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
final class zzac extends zzx {
    final /* synthetic */ zzad zza;

    zzac(zzad zzadVar) {
        Objects.requireNonNull(zzadVar);
        this.zza = zzadVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i11) {
        zzad zzadVar = this.zza;
        zzn.zzd(i11, zzadVar.zzi(), "index");
        int i12 = i11 + i11;
        Object obj = zzadVar.zzh()[i12];
        Objects.requireNonNull(obj);
        Object obj2 = zzadVar.zzh()[i12 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzi();
    }
}
