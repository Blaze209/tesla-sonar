package com.google.android.gms.internal.nearby;

import android.os.Parcel;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzlf extends zzb implements zzlg {
    public zzlf() {
        super("com.google.android.gms.nearby.uwb.internal.IUwbAvailabilityObserver");
    }

    @Override // com.google.android.gms.internal.nearby.zzb
    protected final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 != 2) {
            return false;
        }
        boolean zZzd = zzc.zzd(parcel);
        int i13 = parcel.readInt();
        zzc.zzb(parcel);
        zzd(zZzd, i13);
        return true;
    }
}
