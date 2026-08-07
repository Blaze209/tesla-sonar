package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class zzy extends zza implements zzaa {
    zzy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IPolygonDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final void zzA(float f11) {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f11);
        zzc(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final boolean zzB(zzaa zzaaVar) {
        Parcel parcelZza = zza();
        zzc.zzf(parcelZza, zzaaVar);
        Parcel parcelZzH = zzH(19, parcelZza);
        boolean zZzg = zzc.zzg(parcelZzH);
        parcelZzH.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final boolean zzC() {
        Parcel parcelZzH = zzH(22, zza());
        boolean zZzg = zzc.zzg(parcelZzH);
        parcelZzH.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final boolean zzD() {
        Parcel parcelZzH = zzH(18, zza());
        boolean zZzg = zzc.zzg(parcelZzH);
        parcelZzH.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final boolean zzE() {
        Parcel parcelZzH = zzH(16, zza());
        boolean zZzg = zzc.zzg(parcelZzH);
        parcelZzH.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final float zzd() {
        Parcel parcelZzH = zzH(8, zza());
        float f11 = parcelZzH.readFloat();
        parcelZzH.recycle();
        return f11;
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final float zze() {
        Parcel parcelZzH = zzH(14, zza());
        float f11 = parcelZzH.readFloat();
        parcelZzH.recycle();
        return f11;
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final int zzf() {
        Parcel parcelZzH = zzH(12, zza());
        int i11 = parcelZzH.readInt();
        parcelZzH.recycle();
        return i11;
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final int zzg() {
        Parcel parcelZzH = zzH(10, zza());
        int i11 = parcelZzH.readInt();
        parcelZzH.recycle();
        return i11;
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final int zzh() {
        Parcel parcelZzH = zzH(24, zza());
        int i11 = parcelZzH.readInt();
        parcelZzH.recycle();
        return i11;
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final int zzi() {
        Parcel parcelZzH = zzH(20, zza());
        int i11 = parcelZzH.readInt();
        parcelZzH.recycle();
        return i11;
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final IObjectWrapper zzj() {
        Parcel parcelZzH = zzH(28, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzH.readStrongBinder());
        parcelZzH.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final String zzk() {
        Parcel parcelZzH = zzH(2, zza());
        String string = parcelZzH.readString();
        parcelZzH.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final List zzl() {
        Parcel parcelZzH = zzH(6, zza());
        ArrayList arrayListZzb = zzc.zzb(parcelZzH);
        parcelZzH.recycle();
        return arrayListZzb;
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final List<LatLng> zzm() {
        Parcel parcelZzH = zzH(4, zza());
        ArrayList arrayListCreateTypedArrayList = parcelZzH.createTypedArrayList(LatLng.CREATOR);
        parcelZzH.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final List<PatternItem> zzn() {
        Parcel parcelZzH = zzH(26, zza());
        ArrayList arrayListCreateTypedArrayList = parcelZzH.createTypedArrayList(PatternItem.CREATOR);
        parcelZzH.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final void zzo() {
        zzc(1, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final void zzp(boolean z11) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, z11);
        zzc(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final void zzq(int i11) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i11);
        zzc(11, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final void zzr(boolean z11) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, z11);
        zzc(17, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final void zzs(List list) {
        Parcel parcelZza = zza();
        parcelZza.writeList(list);
        zzc(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final void zzt(List<LatLng> list) {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzc(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final void zzu(int i11) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i11);
        zzc(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final void zzv(int i11) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i11);
        zzc(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final void zzw(List<PatternItem> list) {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzc(25, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final void zzx(float f11) {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f11);
        zzc(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final void zzy(IObjectWrapper iObjectWrapper) {
        Parcel parcelZza = zza();
        zzc.zzf(parcelZza, iObjectWrapper);
        zzc(27, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final void zzz(boolean z11) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, z11);
        zzc(15, parcelZza);
    }
}
