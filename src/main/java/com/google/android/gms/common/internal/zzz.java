package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzz extends com.google.android.gms.internal.common.zzb implements IGmsCallbacks {
    public zzz() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // com.google.android.gms.internal.common.zzb
    protected final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 == 1) {
            int i13 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) com.google.android.gms.internal.common.zzc.zzb(parcel, Bundle.CREATOR);
            com.google.android.gms.internal.common.zzc.zzf(parcel);
            onPostInitComplete(i13, strongBinder, bundle);
        } else if (i11 == 2) {
            int i14 = parcel.readInt();
            Bundle bundle2 = (Bundle) com.google.android.gms.internal.common.zzc.zzb(parcel, Bundle.CREATOR);
            com.google.android.gms.internal.common.zzc.zzf(parcel);
            zzb(i14, bundle2);
        } else {
            if (i11 != 3) {
                return false;
            }
            int i15 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            zzj zzjVar = (zzj) com.google.android.gms.internal.common.zzc.zzb(parcel, zzj.CREATOR);
            com.google.android.gms.internal.common.zzc.zzf(parcel);
            zzc(i15, strongBinder2, zzjVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
