package com.google.android.gms.internal.nearby;

import android.os.Parcel;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzkt extends zzb implements zzku {
    public zzkt() {
        super("com.google.android.gms.nearby.uwb.internal.IRangingCapabilitiesResultListener");
    }

    @Override // com.google.android.gms.internal.nearby.zzb
    protected final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 != 1) {
            return false;
        }
        zzly zzlyVar = (zzly) zzc.zza(parcel, zzly.CREATOR);
        zzc.zzb(parcel);
        zzd(zzlyVar);
        return true;
    }
}
