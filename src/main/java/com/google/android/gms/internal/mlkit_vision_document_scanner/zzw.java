package com.google.android.gms.internal.mlkit_vision_document_scanner;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
final class zzw extends zzx {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzx zzc;

    zzw(zzx zzxVar, int i11, int i12) {
        Objects.requireNonNull(zzxVar);
        this.zzc = zzxVar;
        this.zza = i11;
        this.zzb = i12;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        zzn.zzd(i11, this.zzb, "index");
        return this.zzc.get(i11 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzx, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i11, int i12) {
        return subList(i11, i12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzt
    final Object[] zzb() {
        return this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzt
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzt
    final int zzd() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzx
    /* JADX INFO: renamed from: zzf */
    public final zzx subList(int i11, int i12) {
        zzn.zzf(i11, i12, this.zzb);
        int i13 = this.zza;
        return this.zzc.subList(i11 + i13, i12 + i13);
    }
}
