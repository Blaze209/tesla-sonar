package com.google.android.gms.internal.identity;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.identity.intents.UserAddressRequest;

/* JADX INFO: loaded from: classes5.dex */
public final class zzh extends zza implements IInterface {
    zzh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.identity.intents.internal.IAddressService");
    }

    public final void zzc(zzg zzgVar, UserAddressRequest userAddressRequest, Bundle bundle) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, zzgVar);
        zzc.zzb(parcelZza, userAddressRequest);
        zzc.zzb(parcelZza, bundle);
        zzb(2, parcelZza);
    }
}
