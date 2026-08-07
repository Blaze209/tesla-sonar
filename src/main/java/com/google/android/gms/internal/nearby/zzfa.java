package com.google.android.gms.internal.nearby;

import android.os.Parcel;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzfa extends zzb implements zzfb {
    public zzfa() {
        super("com.google.android.gms.nearby.internal.connection.IConnectionEventListener");
    }

    @Override // com.google.android.gms.internal.nearby.zzb
    protected final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 == 2) {
            zzgr zzgrVar = (zzgr) zzc.zza(parcel, zzgr.CREATOR);
            zzc.zzb(parcel);
            zzd(zzgrVar);
            return true;
        }
        if (i11 == 3) {
            zzgj zzgjVar = (zzgj) zzc.zza(parcel, zzgj.CREATOR);
            zzc.zzb(parcel);
            zzc(zzgjVar);
            return true;
        }
        if (i11 != 4) {
            return false;
        }
        zzc.zzb(parcel);
        return true;
    }
}
