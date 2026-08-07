package com.google.android.gms.internal.nearby;

import android.os.Parcel;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzfg extends zzb implements zzfh {
    public zzfg() {
        super("com.google.android.gms.nearby.internal.connection.IConnectionResponseListener");
    }

    @Override // com.google.android.gms.internal.nearby.zzb
    protected final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 != 2) {
            return false;
        }
        zzgf zzgfVar = (zzgf) zzc.zza(parcel, zzgf.CREATOR);
        zzc.zzb(parcel);
        zzb(zzgfVar);
        return true;
    }
}
