package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes5.dex */
public final class zzs extends com.google.android.gms.internal.nearby.zza implements IInterface {
    zzs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
    }

    public final void zzd(zzh zzhVar) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.nearby.zzc.zzc(parcelZza, zzhVar);
        zzs(7, parcelZza);
    }

    public final void zze(zzj zzjVar) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.nearby.zzc.zzc(parcelZza, zzjVar);
        zzs(9, parcelZza);
    }

    public final void zzf(zzbz zzbzVar) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.nearby.zzc.zzc(parcelZza, zzbzVar);
        zzs(1, parcelZza);
    }

    public final void zzg(zzcb zzcbVar) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.nearby.zzc.zzc(parcelZza, zzcbVar);
        zzs(8, parcelZza);
    }

    public final void zzh(SubscribeRequest subscribeRequest) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.nearby.zzc.zzc(parcelZza, subscribeRequest);
        zzs(3, parcelZza);
    }

    public final void zzi(zzce zzceVar) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.nearby.zzc.zzc(parcelZza, zzceVar);
        zzs(2, parcelZza);
    }

    public final void zzj(zzcg zzcgVar) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.nearby.zzc.zzc(parcelZza, zzcgVar);
        zzs(4, parcelZza);
    }
}
