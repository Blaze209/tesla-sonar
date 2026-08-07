package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzu extends com.google.android.gms.internal.nearby.zzb implements zzv {
    public zzu() {
        super("com.google.android.gms.nearby.messages.internal.IPublishCallback");
    }

    @Override // com.google.android.gms.internal.nearby.zzb
    protected final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 != 1) {
            return false;
        }
        zzd();
        return true;
    }
}
