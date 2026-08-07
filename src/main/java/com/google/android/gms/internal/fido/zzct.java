package com.google.android.gms.internal.fido;

import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
final class zzct extends zzcc {
    static final zzcc zza = new zzct(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    zzct(Object[] objArr, int i11) {
        this.zzb = objArr;
        this.zzc = i11;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        zzbm.zza(i11, this.zzc, "index");
        Object obj = this.zzb[i11];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.fido.zzcc, com.google.android.gms.internal.fido.zzby
    final int zza(Object[] objArr, int i11) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.fido.zzby
    final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.fido.zzby
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.fido.zzby
    final Object[] zze() {
        return this.zzb;
    }
}
