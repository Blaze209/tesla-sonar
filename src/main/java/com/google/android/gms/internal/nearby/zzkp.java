package com.google.android.gms.internal.nearby;

import android.os.Parcel;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzkp extends zzb implements zzkq {
    public zzkp() {
        super("com.google.android.gms.nearby.uwb.internal.IBooleanResultListener");
    }

    @Override // com.google.android.gms.internal.nearby.zzb
    protected final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 != 1) {
            return false;
        }
        boolean zZzd = zzc.zzd(parcel);
        zzc.zzb(parcel);
        zzd(zZzd);
        return true;
    }
}
