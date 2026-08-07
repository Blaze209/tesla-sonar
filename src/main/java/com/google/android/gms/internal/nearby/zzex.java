package com.google.android.gms.internal.nearby;

import android.os.Parcel;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzex extends zzb implements zzey {
    public zzex() {
        super("com.google.android.gms.nearby.internal.connection.IAdvertisingCallback");
    }

    @Override // com.google.android.gms.internal.nearby.zzb
    protected final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 == 2) {
            zzgd zzgdVar = (zzgd) zzc.zza(parcel, zzgd.CREATOR);
            zzc.zzb(parcel);
            zzb(zzgdVar);
            return true;
        }
        if (i11 != 3) {
            return false;
        }
        zzc.zzb(parcel);
        return true;
    }
}
