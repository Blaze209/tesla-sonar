package com.google.android.gms.internal.nearby;

import android.os.Parcel;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzfr extends zzb implements zzfs {
    public zzfr() {
        super("com.google.android.gms.nearby.internal.connection.IResultListener");
    }

    @Override // com.google.android.gms.internal.nearby.zzb
    protected final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 != 2) {
            return false;
        }
        int i13 = parcel.readInt();
        zzc.zzb(parcel);
        zzb(i13);
        return true;
    }
}
