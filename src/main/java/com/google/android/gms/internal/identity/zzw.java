package com.google.android.gms.internal.identity;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationAvailability;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzw extends BinderC4334zzb implements zzx {
    public zzw() {
        super("com.google.android.gms.location.internal.ILocationAvailabilityStatusCallback");
    }

    @Override // com.google.android.gms.internal.identity.BinderC4334zzb
    protected final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 != 1) {
            return false;
        }
        Status status = (Status) C4335zzc.zza(parcel, Status.CREATOR);
        LocationAvailability locationAvailability = (LocationAvailability) C4335zzc.zza(parcel, LocationAvailability.CREATOR);
        C4335zzc.zzd(parcel);
        zzb(status, locationAvailability);
        return true;
    }
}
