package com.google.android.gms.internal.nearby;

import android.os.Parcel;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzlc extends zzb implements zzld {
    public zzlc() {
        super("com.google.android.gms.nearby.uwb.internal.IUwbAddressResultListener");
    }

    @Override // com.google.android.gms.internal.nearby.zzb
    protected final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 != 2) {
            return false;
        }
        zzni zzniVar = (zzni) zzc.zza(parcel, zzni.CREATOR);
        zzc.zzb(parcel);
        zzd(zzniVar);
        return true;
    }
}
