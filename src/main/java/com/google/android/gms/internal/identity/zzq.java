package com.google.android.gms.internal.identity;

import android.os.Parcel;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzq extends BinderC4334zzb implements zzr {
    public zzq() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    @Override // com.google.android.gms.internal.identity.BinderC4334zzb
    protected final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 == 1) {
            zzl zzlVar = (zzl) C4335zzc.zza(parcel, zzl.CREATOR);
            C4335zzc.zzd(parcel);
            zzd(zzlVar);
        } else {
            if (i11 != 2) {
                return false;
            }
            zze();
        }
        return true;
    }
}
