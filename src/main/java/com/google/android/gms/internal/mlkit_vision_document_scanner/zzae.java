package com.google.android.gms.internal.mlkit_vision_document_scanner;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class zzae extends zzaa {
    private final transient zzz zza;
    private final transient zzx zzb;

    zzae(zzz zzzVar, zzx zzxVar) {
        this.zza = zzzVar;
        this.zzb = zzxVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzt, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.zza.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzaa, com.google.android.gms.internal.mlkit_vision_document_scanner.zzt, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzaa, com.google.android.gms.internal.mlkit_vision_document_scanner.zzt
    /* JADX INFO: renamed from: zza */
    public final zzai iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzt
    final int zze(Object[] objArr, int i11) {
        return this.zzb.zze(objArr, 0);
    }
}
