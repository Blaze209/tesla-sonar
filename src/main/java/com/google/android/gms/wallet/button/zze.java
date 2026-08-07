package com.google.android.gms.wallet.button;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes5.dex */
public final class zze extends com.google.android.gms.internal.wallet.zza implements IInterface {
    zze(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wallet.button.IPayButtonCreator");
    }

    public final IObjectWrapper zzd(IObjectWrapper iObjectWrapper, ButtonOptions buttonOptions) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.wallet.zzc.zzd(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.wallet.zzc.zzc(parcelZza, buttonOptions);
        Parcel parcelZzb = zzb(1, parcelZza);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzb.readStrongBinder());
        parcelZzb.recycle();
        return iObjectWrapperAsInterface;
    }
}
