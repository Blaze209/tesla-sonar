package com.google.android.gms.internal.identity;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzy extends BinderC4334zzb implements zzz {
    public zzy() {
        super("com.google.android.gms.location.internal.ILocationStatusCallback");
    }

    @Override // com.google.android.gms.internal.identity.BinderC4334zzb
    protected final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 != 1) {
            return false;
        }
        Status status = (Status) C4335zzc.zza(parcel, Status.CREATOR);
        Location location = (Location) C4335zzc.zza(parcel, Location.CREATOR);
        C4335zzc.zzd(parcel);
        zzb(status, location);
        return true;
    }
}
