package com.google.android.gms.maps.internal;

import android.os.Parcel;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzac extends com.google.android.gms.internal.maps.zzb implements zzad {
    public zzac() {
        super("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 != 1) {
            return false;
        }
        zzb(com.google.android.gms.internal.maps.zzw.zzb(parcel.readStrongBinder()));
        parcel2.writeNoException();
        return true;
    }
}
