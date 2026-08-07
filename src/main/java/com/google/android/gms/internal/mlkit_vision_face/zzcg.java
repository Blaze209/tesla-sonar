package com.google.android.gms.internal.mlkit_vision_face;

/* JADX INFO: loaded from: classes5.dex */
final class zzcg extends zzbn {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    zzcg(Object[] objArr, int i11, int i12) {
        this.zza = objArr;
        this.zzb = i11;
        this.zzc = i12;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        zzab.zza(i11, this.zzc, "index");
        Object obj = this.zza[i11 + i11 + this.zzb];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }
}
