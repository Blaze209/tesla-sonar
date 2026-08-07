package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.identity.BinderC4334zzb;
import com.google.android.gms.internal.identity.C4335zzc;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzv extends BinderC4334zzb implements zzw {
    public zzv() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    public static zzw zzb(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        return iInterfaceQueryLocalInterface instanceof zzw ? (zzw) iInterfaceQueryLocalInterface : new zzu(iBinder);
    }

    @Override // com.google.android.gms.internal.identity.BinderC4334zzb
    protected final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 == 1) {
            LocationResult locationResult = (LocationResult) C4335zzc.zza(parcel, LocationResult.CREATOR);
            C4335zzc.zzd(parcel);
            zzd(locationResult);
        } else if (i11 == 2) {
            LocationAvailability locationAvailability = (LocationAvailability) C4335zzc.zza(parcel, LocationAvailability.CREATOR);
            C4335zzc.zzd(parcel);
            zze(locationAvailability);
        } else {
            if (i11 != 3) {
                return false;
            }
            zzf();
        }
        return true;
    }
}
