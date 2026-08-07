package com.google.android.gms.internal.nearby;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class zzps extends zzpt {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzpt zzc;

    zzps(zzpt zzptVar, int i11, int i12) {
        this.zzc = zzptVar;
        this.zza = i11;
        this.zzb = i12;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        zzpm.zza(i11, this.zzb, "index");
        return this.zzc.get(i11 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.nearby.zzpt, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i11, int i12) {
        return subList(i11, i12);
    }

    @Override // com.google.android.gms.internal.nearby.zzpq
    final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.nearby.zzpq
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.nearby.zzpq
    final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.nearby.zzpq
    final Object[] zzg() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.gms.internal.nearby.zzpt
    /* JADX INFO: renamed from: zzh */
    public final zzpt subList(int i11, int i12) {
        zzpm.zzh(i11, i12, this.zzb);
        int i13 = this.zza;
        return this.zzc.subList(i11 + i13, i12 + i13);
    }
}
