package com.google.android.gms.internal.nearby;

import android.os.Parcel;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzli extends zzb implements zzlj {
    public zzli() {
        super("com.google.android.gms.nearby.uwb.internal.IUwbComplexChannelResultListener");
    }

    @Override // com.google.android.gms.internal.nearby.zzb
    protected final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 != 2) {
            return false;
        }
        zznr zznrVar = (zznr) zzc.zza(parcel, zznr.CREATOR);
        zzc.zzb(parcel);
        zzd(zznrVar);
        return true;
    }
}
