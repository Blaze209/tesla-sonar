package com.google.android.gms.internal.nearby;

import android.os.Parcel;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzfu extends zzb implements zzfv {
    public zzfu() {
        super("com.google.android.gms.nearby.internal.connection.IStartAdvertisingResultListener");
    }

    @Override // com.google.android.gms.internal.nearby.zzb
    protected final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 != 2) {
            return false;
        }
        zzgv zzgvVar = (zzgv) zzc.zza(parcel, zzgv.CREATOR);
        zzc.zzb(parcel);
        zzb(zzgvVar);
        return true;
    }
}
