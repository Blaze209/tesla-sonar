package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.identity.BinderC4334zzb;
import com.google.android.gms.internal.identity.C4335zzc;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzs extends BinderC4334zzb implements zzt {
    public zzs() {
        super("com.google.android.gms.location.IDeviceOrientationListener");
    }

    public static zzt zzb(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
        return iInterfaceQueryLocalInterface instanceof zzt ? (zzt) iInterfaceQueryLocalInterface : new zzr(iBinder);
    }

    @Override // com.google.android.gms.internal.identity.BinderC4334zzb
    protected final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 != 1) {
            return false;
        }
        DeviceOrientation deviceOrientation = (DeviceOrientation) C4335zzc.zza(parcel, DeviceOrientation.CREATOR);
        C4335zzc.zzd(parcel);
        zzd(deviceOrientation);
        return true;
    }
}
