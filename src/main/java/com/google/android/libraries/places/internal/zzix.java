package com.google.android.libraries.places.internal;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class zzix extends zziy {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zziy zzc;

    zzix(zziy zziyVar, int i11, int i12) {
        this.zzc = zziyVar;
        this.zza = i11;
        this.zzb = i12;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        zzig.zza(i11, this.zzb, "index");
        return this.zzc.get(i11 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.internal.zziy, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i11, int i12) {
        return subList(i11, i12);
    }

    @Override // com.google.android.libraries.places.internal.zziv
    final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.libraries.places.internal.zziv
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zziv
    final boolean zzf() {
        return true;
    }

    @Override // com.google.android.libraries.places.internal.zziv
    final Object[] zzg() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.libraries.places.internal.zziy
    /* JADX INFO: renamed from: zzh */
    public final zziy subList(int i11, int i12) {
        zzig.zzg(i11, i12, this.zzb);
        zziy zziyVar = this.zzc;
        int i13 = this.zza;
        return zziyVar.subList(i11 + i13, i12 + i13);
    }
}
