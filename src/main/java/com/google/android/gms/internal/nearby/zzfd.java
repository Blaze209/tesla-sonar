package com.google.android.gms.internal.nearby;

import android.os.Parcel;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzfd extends zzb implements zzfe {
    public zzfd() {
        super("com.google.android.gms.nearby.internal.connection.IConnectionLifecycleListener");
    }

    @Override // com.google.android.gms.internal.nearby.zzb
    protected final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 == 2) {
            zzgb zzgbVar = (zzgb) zzc.zza(parcel, zzgb.CREATOR);
            zzc.zzb(parcel);
            zzc(zzgbVar);
            return true;
        }
        if (i11 == 3) {
            zzgh zzghVar = (zzgh) zzc.zza(parcel, zzgh.CREATOR);
            zzc.zzb(parcel);
            zzd(zzghVar);
            return true;
        }
        if (i11 == 4) {
            zzgj zzgjVar = (zzgj) zzc.zza(parcel, zzgj.CREATOR);
            zzc.zzb(parcel);
            zze(zzgjVar);
            return true;
        }
        if (i11 != 5) {
            return false;
        }
        zzfz zzfzVar = (zzfz) zzc.zza(parcel, zzfz.CREATOR);
        zzc.zzb(parcel);
        zzb(zzfzVar);
        return true;
    }
}
