package com.google.android.gms.measurement.internal;

import android.os.Parcel;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzgg extends com.google.android.gms.internal.measurement.zzbm implements zzgh {
    public zzgg() {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    protected final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 != 2) {
            return false;
        }
        zzoq zzoqVar = (zzoq) com.google.android.gms.internal.measurement.zzbn.zzb(parcel, zzoq.CREATOR);
        com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
        zze(zzoqVar);
        return true;
    }
}
