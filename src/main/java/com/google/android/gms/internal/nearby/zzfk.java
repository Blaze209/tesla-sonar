package com.google.android.gms.internal.nearby;

import android.os.Parcel;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzfk extends zzb implements zzfl {
    public zzfk() {
        super("com.google.android.gms.nearby.internal.connection.IDiscoveryListener");
    }

    @Override // com.google.android.gms.internal.nearby.zzb
    protected final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 == 2) {
            zzgn zzgnVar = (zzgn) zzc.zza(parcel, zzgn.CREATOR);
            zzc.zzb(parcel);
            zzc(zzgnVar);
            return true;
        }
        if (i11 == 3) {
            zzgp zzgpVar = (zzgp) zzc.zza(parcel, zzgp.CREATOR);
            zzc.zzb(parcel);
            zzd(zzgpVar);
            return true;
        }
        if (i11 == 4) {
            zzc.zzb(parcel);
            return true;
        }
        if (i11 != 5) {
            return false;
        }
        zzgl zzglVar = (zzgl) zzc.zza(parcel, zzgl.CREATOR);
        zzc.zzb(parcel);
        zzb(zzglVar);
        return true;
    }
}
