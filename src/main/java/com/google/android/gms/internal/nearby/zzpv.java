package com.google.android.gms.internal.nearby;

import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
final class zzpv extends zzpt {
    static final zzpt zza = new zzpv(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    zzpv(Object[] objArr, int i11) {
        this.zzb = objArr;
        this.zzc = i11;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        zzpm.zza(i11, this.zzc, "index");
        Object obj = this.zzb[i11];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.nearby.zzpt, com.google.android.gms.internal.nearby.zzpq
    final int zza(Object[] objArr, int i11) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.nearby.zzpq
    final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.nearby.zzpq
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.nearby.zzpq
    final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.nearby.zzpq
    final Object[] zzg() {
        return this.zzb;
    }
}
