package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes5.dex */
public final class zzad extends zza implements IInterface {
    zzad(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.fastpair.internal.INearbyFastPairService");
    }

    public final void zzd(zzag zzagVar) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, zzagVar);
        zzs(15, parcelZza);
    }

    public final void zze(zzak zzakVar) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, zzakVar);
        zzs(16, parcelZza);
    }
}
