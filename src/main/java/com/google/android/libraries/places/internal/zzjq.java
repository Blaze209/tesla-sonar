package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzjq extends zziy {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    zzjq(Object[] objArr, int i11, int i12) {
        this.zza = objArr;
        this.zzb = i11;
        this.zzc = i12;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        zzig.zza(i11, this.zzc, "index");
        Object obj = this.zza[i11 + i11 + this.zzb];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.internal.zziv
    final boolean zzf() {
        return true;
    }
}
