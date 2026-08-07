package com.google.android.gms.internal.mlkit_vision_document_scanner;

import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
final class zzab extends zzx {
    static final zzx zza = new zzab(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    zzab(Object[] objArr, int i11) {
        this.zzb = objArr;
        this.zzc = i11;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        zzn.zzd(i11, this.zzc, "index");
        Object obj = this.zzb[i11];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzt
    final Object[] zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzt
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzt
    final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzx, com.google.android.gms.internal.mlkit_vision_document_scanner.zzt
    final int zze(Object[] objArr, int i11) {
        Object[] objArr2 = this.zzb;
        int i12 = this.zzc;
        System.arraycopy(objArr2, 0, objArr, 0, i12);
        return i12;
    }
}
