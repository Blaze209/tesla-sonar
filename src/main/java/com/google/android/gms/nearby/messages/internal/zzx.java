package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzx extends com.google.android.gms.internal.nearby.zzb implements zzy {
    public zzx() {
        super("com.google.android.gms.nearby.messages.internal.IStatusCallback");
    }

    @Override // com.google.android.gms.internal.nearby.zzb
    protected final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 != 1) {
            return false;
        }
        boolean zZzd = com.google.android.gms.internal.nearby.zzc.zzd(parcel);
        com.google.android.gms.internal.nearby.zzc.zzb(parcel);
        zzd(zZzd);
        return true;
    }
}
