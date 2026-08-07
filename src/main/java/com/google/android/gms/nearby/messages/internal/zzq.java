package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzq extends com.google.android.gms.internal.nearby.zzb implements zzr {
    public zzq() {
        super("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
    }

    @Override // com.google.android.gms.internal.nearby.zzb
    protected final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 != 1) {
            return false;
        }
        Status status = (Status) com.google.android.gms.internal.nearby.zzc.zza(parcel, Status.CREATOR);
        com.google.android.gms.internal.nearby.zzc.zzb(parcel);
        zzd(status);
        return true;
    }
}
