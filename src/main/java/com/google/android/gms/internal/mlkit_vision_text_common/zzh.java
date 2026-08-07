package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes5.dex */
public final class zzh extends zza implements IInterface {
    zzh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.text.internal.client.INativeTextRecognizer");
    }

    public final void zzd() {
        zzc(2, zza());
    }

    public final zzl[] zze(IObjectWrapper iObjectWrapper, zzd zzdVar) {
        Parcel parcelZza = zza();
        zzc.zzb(parcelZza, iObjectWrapper);
        zzc.zza(parcelZza, zzdVar);
        Parcel parcelZzb = zzb(1, parcelZza);
        zzl[] zzlVarArr = (zzl[]) parcelZzb.createTypedArray(zzl.CREATOR);
        parcelZzb.recycle();
        return zzlVarArr;
    }
}
