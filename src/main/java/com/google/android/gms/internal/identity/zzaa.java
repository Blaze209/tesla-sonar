package com.google.android.gms.internal.identity;

import android.os.Parcel;
import com.google.android.gms.location.LocationSettingsResult;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzaa extends BinderC4334zzb implements zzab {
    public zzaa() {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
    }

    @Override // com.google.android.gms.internal.identity.BinderC4334zzb
    protected final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 != 1) {
            return false;
        }
        LocationSettingsResult locationSettingsResult = (LocationSettingsResult) C4335zzc.zza(parcel, LocationSettingsResult.CREATOR);
        C4335zzc.zzd(parcel);
        zzb(locationSettingsResult);
        return true;
    }
}
