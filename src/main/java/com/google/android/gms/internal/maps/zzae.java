package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes5.dex */
public final class zzae extends zza implements zzag {
    zzae(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final float zzd() {
        Parcel parcelZzH = zzH(13, zza());
        float f11 = parcelZzH.readFloat();
        parcelZzH.recycle();
        return f11;
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final float zze() {
        Parcel parcelZzH = zzH(5, zza());
        float f11 = parcelZzH.readFloat();
        parcelZzH.recycle();
        return f11;
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final int zzf() {
        Parcel parcelZzH = zzH(9, zza());
        int i11 = parcelZzH.readInt();
        parcelZzH.recycle();
        return i11;
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final String zzg() {
        Parcel parcelZzH = zzH(3, zza());
        String string = parcelZzH.readString();
        parcelZzH.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final void zzh() {
        zzc(2, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final void zzi() {
        zzc(1, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final void zzj(boolean z11) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, z11);
        zzc(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final void zzk(float f11) {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f11);
        zzc(12, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final void zzl(boolean z11) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, z11);
        zzc(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final void zzm(float f11) {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f11);
        zzc(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final boolean zzn(zzag zzagVar) {
        Parcel parcelZza = zza();
        zzc.zzf(parcelZza, zzagVar);
        Parcel parcelZzH = zzH(8, parcelZza);
        boolean zZzg = zzc.zzg(parcelZzH);
        parcelZzH.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final boolean zzo() {
        Parcel parcelZzH = zzH(11, zza());
        boolean zZzg = zzc.zzg(parcelZzH);
        parcelZzH.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final boolean zzp() {
        Parcel parcelZzH = zzH(7, zza());
        boolean zZzg = zzc.zzg(parcelZzH);
        parcelZzH.recycle();
        return zZzg;
    }
}
