package com.google.android.gms.internal.mlkit_vision_face;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes5.dex */
public final class zzj extends zza implements IInterface {
    zzj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
    }

    public final void zzd() {
        zzc(3, zza());
    }

    public final zzf[] zze(IObjectWrapper iObjectWrapper, zzp zzpVar) {
        Parcel parcelZza = zza();
        zzc.zzb(parcelZza, iObjectWrapper);
        zzc.zza(parcelZza, zzpVar);
        Parcel parcelZzb = zzb(1, parcelZza);
        zzf[] zzfVarArr = (zzf[]) parcelZzb.createTypedArray(zzf.CREATOR);
        parcelZzb.recycle();
        return zzfVarArr;
    }

    public final zzf[] zzf(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3, int i11, int i12, int i13, int i14, int i15, int i16, zzp zzpVar) {
        Parcel parcelZza = zza();
        zzc.zzb(parcelZza, iObjectWrapper);
        zzc.zzb(parcelZza, iObjectWrapper2);
        zzc.zzb(parcelZza, iObjectWrapper3);
        parcelZza.writeInt(i11);
        parcelZza.writeInt(i12);
        parcelZza.writeInt(i13);
        parcelZza.writeInt(i14);
        parcelZza.writeInt(i15);
        parcelZza.writeInt(i16);
        zzc.zza(parcelZza, zzpVar);
        Parcel parcelZzb = zzb(4, parcelZza);
        zzf[] zzfVarArr = (zzf[]) parcelZzb.createTypedArray(zzf.CREATOR);
        parcelZzb.recycle();
        return zzfVarArr;
    }
}
