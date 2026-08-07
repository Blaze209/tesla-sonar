package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzfy {
    abstract zzfy zzb(int i11);

    abstract zzfz zzc();

    public abstract zzfy zzd(int i11);

    public final zzfz zze() {
        zzfz zzfzVarZzc = zzc();
        zzig.zzi(!zzfzVarZzc.zzb().isEmpty(), "Package name must not be empty.");
        return zzfzVarZzc;
    }
}
