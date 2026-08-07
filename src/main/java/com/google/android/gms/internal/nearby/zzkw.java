package com.google.android.gms.internal.nearby;

import android.os.Parcel;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzkw extends zzb implements zzkx {
    public zzkw() {
        super("com.google.android.gms.nearby.uwb.internal.IRangingSessionCallback");
    }

    @Override // com.google.android.gms.internal.nearby.zzb
    protected final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 == 2) {
            zzlo zzloVar = (zzlo) zzc.zza(parcel, zzlo.CREATOR);
            zzc.zzb(parcel);
            zzd(zzloVar);
            return true;
        }
        if (i11 == 3) {
            zzlq zzlqVar = (zzlq) zzc.zza(parcel, zzlq.CREATOR);
            zzc.zzb(parcel);
            zze(zzlqVar);
            return true;
        }
        if (i11 != 4) {
            return false;
        }
        zzls zzlsVar = (zzls) zzc.zza(parcel, zzls.CREATOR);
        zzc.zzb(parcel);
        zzf(zzlsVar);
        return true;
    }
}
