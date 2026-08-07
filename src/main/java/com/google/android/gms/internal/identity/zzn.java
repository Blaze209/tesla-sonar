package com.google.android.gms.internal.identity;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzn extends BinderC4334zzb implements zzo {
    public zzn() {
        super("com.google.android.gms.location.internal.IBooleanStatusCallback");
    }

    @Override // com.google.android.gms.internal.identity.BinderC4334zzb
    protected final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 != 1) {
            return false;
        }
        Status status = (Status) C4335zzc.zza(parcel, Status.CREATOR);
        boolean z11 = parcel.readInt() != 0;
        C4335zzc.zzd(parcel);
        zzb(status, z11);
        return true;
    }
}
