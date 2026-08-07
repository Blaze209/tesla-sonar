package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* JADX INFO: loaded from: classes5.dex */
public final class zzm extends zza implements zzo {
    zzm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzo
    public final boolean zzA() {
        Parcel parcelZzH = zzH(23, zza());
        boolean zZzg = zzc.zzg(parcelZzH);
        parcelZzH.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.maps.zzo
    public final boolean zzB() {
        Parcel parcelZzH = zzH(16, zza());
        boolean zZzg = zzc.zzg(parcelZzH);
        parcelZzH.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.maps.zzo
    public final float zzd() {
        Parcel parcelZzH = zzH(12, zza());
        float f11 = parcelZzH.readFloat();
        parcelZzH.recycle();
        return f11;
    }

    @Override // com.google.android.gms.internal.maps.zzo
    public final float zze() {
        Parcel parcelZzH = zzH(8, zza());
        float f11 = parcelZzH.readFloat();
        parcelZzH.recycle();
        return f11;
    }

    @Override // com.google.android.gms.internal.maps.zzo
    public final float zzf() {
        Parcel parcelZzH = zzH(18, zza());
        float f11 = parcelZzH.readFloat();
        parcelZzH.recycle();
        return f11;
    }

    @Override // com.google.android.gms.internal.maps.zzo
    public final float zzg() {
        Parcel parcelZzH = zzH(7, zza());
        float f11 = parcelZzH.readFloat();
        parcelZzH.recycle();
        return f11;
    }

    @Override // com.google.android.gms.internal.maps.zzo
    public final float zzh() {
        Parcel parcelZzH = zzH(14, zza());
        float f11 = parcelZzH.readFloat();
        parcelZzH.recycle();
        return f11;
    }

    @Override // com.google.android.gms.internal.maps.zzo
    public final int zzi() {
        Parcel parcelZzH = zzH(20, zza());
        int i11 = parcelZzH.readInt();
        parcelZzH.recycle();
        return i11;
    }

    @Override // com.google.android.gms.internal.maps.zzo
    public final IObjectWrapper zzj() {
        Parcel parcelZzH = zzH(25, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzH.readStrongBinder());
        parcelZzH.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.internal.maps.zzo
    public final LatLng zzk() {
        Parcel parcelZzH = zzH(4, zza());
        LatLng latLng = (LatLng) zzc.zza(parcelZzH, LatLng.CREATOR);
        parcelZzH.recycle();
        return latLng;
    }

    @Override // com.google.android.gms.internal.maps.zzo
    public final LatLngBounds zzl() {
        Parcel parcelZzH = zzH(10, zza());
        LatLngBounds latLngBounds = (LatLngBounds) zzc.zza(parcelZzH, LatLngBounds.CREATOR);
        parcelZzH.recycle();
        return latLngBounds;
    }

    @Override // com.google.android.gms.internal.maps.zzo
    public final String zzm() {
        Parcel parcelZzH = zzH(2, zza());
        String string = parcelZzH.readString();
        parcelZzH.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.maps.zzo
    public final void zzn() {
        zzc(1, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzo
    public final void zzo(float f11) {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f11);
        zzc(11, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzo
    public final void zzp(boolean z11) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, z11);
        zzc(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzo
    public final void zzq(float f11) {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f11);
        zzc(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzo
    public final void zzr(float f11, float f12) {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f11);
        parcelZza.writeFloat(f12);
        zzc(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzo
    public final void zzs(IObjectWrapper iObjectWrapper) {
        Parcel parcelZza = zza();
        zzc.zzf(parcelZza, iObjectWrapper);
        zzc(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzo
    public final void zzt(LatLng latLng) {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, latLng);
        zzc(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzo
    public final void zzu(LatLngBounds latLngBounds) {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, latLngBounds);
        zzc(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzo
    public final void zzv(IObjectWrapper iObjectWrapper) {
        Parcel parcelZza = zza();
        zzc.zzf(parcelZza, iObjectWrapper);
        zzc(24, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzo
    public final void zzw(float f11) {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f11);
        zzc(17, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzo
    public final void zzx(boolean z11) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, z11);
        zzc(15, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzo
    public final void zzy(float f11) {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f11);
        zzc(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzo
    public final boolean zzz(zzo zzoVar) {
        Parcel parcelZza = zza();
        zzc.zzf(parcelZza, zzoVar);
        Parcel parcelZzH = zzH(19, parcelZza);
        boolean zZzg = zzc.zzg(parcelZzH);
        parcelZzH.recycle();
        return zZzg;
    }
}
