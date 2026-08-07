package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.Cap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class zzab extends zza implements zzad {
    zzab(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IPolylineDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final void zzA(float f11) {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f11);
        zzc(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final boolean zzB(zzad zzadVar) {
        Parcel parcelZza = zza();
        zzc.zzf(parcelZza, zzadVar);
        Parcel parcelZzH = zzH(15, parcelZza);
        boolean zZzg = zzc.zzg(parcelZzH);
        parcelZzH.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final boolean zzC() {
        Parcel parcelZzH = zzH(18, zza());
        boolean zZzg = zzc.zzg(parcelZzH);
        parcelZzH.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final boolean zzD() {
        Parcel parcelZzH = zzH(14, zza());
        boolean zZzg = zzc.zzg(parcelZzH);
        parcelZzH.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final boolean zzE() {
        Parcel parcelZzH = zzH(12, zza());
        boolean zZzg = zzc.zzg(parcelZzH);
        parcelZzH.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final float zzd() {
        Parcel parcelZzH = zzH(6, zza());
        float f11 = parcelZzH.readFloat();
        parcelZzH.recycle();
        return f11;
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final float zze() {
        Parcel parcelZzH = zzH(10, zza());
        float f11 = parcelZzH.readFloat();
        parcelZzH.recycle();
        return f11;
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final int zzf() {
        Parcel parcelZzH = zzH(8, zza());
        int i11 = parcelZzH.readInt();
        parcelZzH.recycle();
        return i11;
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final int zzg() {
        Parcel parcelZzH = zzH(24, zza());
        int i11 = parcelZzH.readInt();
        parcelZzH.recycle();
        return i11;
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final int zzh() {
        Parcel parcelZzH = zzH(16, zza());
        int i11 = parcelZzH.readInt();
        parcelZzH.recycle();
        return i11;
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final IObjectWrapper zzi() {
        Parcel parcelZzH = zzH(28, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzH.readStrongBinder());
        parcelZzH.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final Cap zzj() {
        Parcel parcelZzH = zzH(22, zza());
        Cap cap = (Cap) zzc.zza(parcelZzH, Cap.CREATOR);
        parcelZzH.recycle();
        return cap;
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final Cap zzk() {
        Parcel parcelZzH = zzH(20, zza());
        Cap cap = (Cap) zzc.zza(parcelZzH, Cap.CREATOR);
        parcelZzH.recycle();
        return cap;
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final String zzl() {
        Parcel parcelZzH = zzH(2, zza());
        String string = parcelZzH.readString();
        parcelZzH.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final List<PatternItem> zzm() {
        Parcel parcelZzH = zzH(26, zza());
        ArrayList arrayListCreateTypedArrayList = parcelZzH.createTypedArrayList(PatternItem.CREATOR);
        parcelZzH.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final List<LatLng> zzn() {
        Parcel parcelZzH = zzH(4, zza());
        ArrayList arrayListCreateTypedArrayList = parcelZzH.createTypedArrayList(LatLng.CREATOR);
        parcelZzH.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final void zzo() {
        zzc(1, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final void zzp(boolean z11) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, z11);
        zzc(17, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final void zzq(int i11) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i11);
        zzc(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final void zzr(Cap cap) {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, cap);
        zzc(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final void zzs(boolean z11) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, z11);
        zzc(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final void zzt(int i11) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i11);
        zzc(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final void zzu(List<PatternItem> list) {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzc(25, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final void zzv(List<LatLng> list) {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzc(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final void zzw(Cap cap) {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, cap);
        zzc(19, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final void zzx(IObjectWrapper iObjectWrapper) {
        Parcel parcelZza = zza();
        zzc.zzf(parcelZza, iObjectWrapper);
        zzc(27, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final void zzy(boolean z11) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, z11);
        zzc(11, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final void zzz(float f11) {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f11);
        zzc(5, parcelZza);
    }
}
