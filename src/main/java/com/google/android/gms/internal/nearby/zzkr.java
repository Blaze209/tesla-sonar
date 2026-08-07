package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.location.GeofenceStatusCodes;

/* JADX INFO: loaded from: classes5.dex */
public final class zzkr extends zza implements IInterface {
    zzkr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.uwb.internal.INearbyUwbService");
    }

    public final void zzd(zzjs zzjsVar) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, zzjsVar);
        zzs(1008, parcelZza);
    }

    public final void zze(zzjw zzjwVar) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, zzjwVar);
        zzs(1012, parcelZza);
    }

    public final void zzf(zzjy zzjyVar) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, zzjyVar);
        zzs(1007, parcelZza);
    }

    public final void zzg(zzke zzkeVar) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, zzkeVar);
        zzs(GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION, parcelZza);
    }

    public final void zzh(zzki zzkiVar) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, zzkiVar);
        zzs(1003, parcelZza);
    }

    public final void zzi(zzkm zzkmVar) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, zzkmVar);
        zzs(1002, parcelZza);
    }

    public final void zzj(zzlm zzlmVar) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, zzlmVar);
        zzs(1001, parcelZza);
    }

    public final void zzk(zzmo zzmoVar) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, zzmoVar);
        zzs(1014, parcelZza);
    }

    public final void zzl(zzms zzmsVar) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, zzmsVar);
        zzs(1013, parcelZza);
    }

    public final void zzm(zzmw zzmwVar) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, zzmwVar);
        zzs(1009, parcelZza);
    }

    public final void zzn(zzna zznaVar) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, zznaVar);
        zzs(1005, parcelZza);
    }

    public final void zzo(zzne zzneVar) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, zzneVar);
        zzs(1006, parcelZza);
    }

    public final void zzp(zznm zznmVar) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, zznmVar);
        zzs(1016, parcelZza);
    }

    public final void zzq(zznm zznmVar) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, zznmVar);
        zzs(1017, parcelZza);
    }
}
