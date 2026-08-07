package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes5.dex */
public final class zzby extends com.google.android.gms.internal.maps.zza implements IUiSettingsDelegate {
    zzby(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate");
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final boolean isCompassEnabled() {
        Parcel parcelZzH = zzH(10, zza());
        boolean zZzg = com.google.android.gms.internal.maps.zzc.zzg(parcelZzH);
        parcelZzH.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final boolean isIndoorLevelPickerEnabled() {
        Parcel parcelZzH = zzH(17, zza());
        boolean zZzg = com.google.android.gms.internal.maps.zzc.zzg(parcelZzH);
        parcelZzH.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final boolean isMapToolbarEnabled() {
        Parcel parcelZzH = zzH(19, zza());
        boolean zZzg = com.google.android.gms.internal.maps.zzc.zzg(parcelZzH);
        parcelZzH.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final boolean isMyLocationButtonEnabled() {
        Parcel parcelZzH = zzH(11, zza());
        boolean zZzg = com.google.android.gms.internal.maps.zzc.zzg(parcelZzH);
        parcelZzH.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final boolean isRotateGesturesEnabled() {
        Parcel parcelZzH = zzH(15, zza());
        boolean zZzg = com.google.android.gms.internal.maps.zzc.zzg(parcelZzH);
        parcelZzH.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final boolean isScrollGesturesEnabled() {
        Parcel parcelZzH = zzH(12, zza());
        boolean zZzg = com.google.android.gms.internal.maps.zzc.zzg(parcelZzH);
        parcelZzH.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final boolean isScrollGesturesEnabledDuringRotateOrZoom() {
        Parcel parcelZzH = zzH(21, zza());
        boolean zZzg = com.google.android.gms.internal.maps.zzc.zzg(parcelZzH);
        parcelZzH.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final boolean isTiltGesturesEnabled() {
        Parcel parcelZzH = zzH(14, zza());
        boolean zZzg = com.google.android.gms.internal.maps.zzc.zzg(parcelZzH);
        parcelZzH.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final boolean isZoomControlsEnabled() {
        Parcel parcelZzH = zzH(9, zza());
        boolean zZzg = com.google.android.gms.internal.maps.zzc.zzg(parcelZzH);
        parcelZzH.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final boolean isZoomGesturesEnabled() {
        Parcel parcelZzH = zzH(13, zza());
        boolean zZzg = com.google.android.gms.internal.maps.zzc.zzg(parcelZzH);
        parcelZzH.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final void setAllGesturesEnabled(boolean z11) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzc(parcelZza, z11);
        zzc(8, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final void setCompassEnabled(boolean z11) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzc(parcelZza, z11);
        zzc(2, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final void setIndoorLevelPickerEnabled(boolean z11) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzc(parcelZza, z11);
        zzc(16, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final void setMapToolbarEnabled(boolean z11) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzc(parcelZza, z11);
        zzc(18, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final void setMyLocationButtonEnabled(boolean z11) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzc(parcelZza, z11);
        zzc(3, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final void setRotateGesturesEnabled(boolean z11) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzc(parcelZza, z11);
        zzc(7, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final void setScrollGesturesEnabled(boolean z11) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzc(parcelZza, z11);
        zzc(4, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final void setScrollGesturesEnabledDuringRotateOrZoom(boolean z11) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzc(parcelZza, z11);
        zzc(20, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final void setTiltGesturesEnabled(boolean z11) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzc(parcelZza, z11);
        zzc(6, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final void setZoomControlsEnabled(boolean z11) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzc(parcelZza, z11);
        zzc(1, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final void setZoomGesturesEnabled(boolean z11) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzc(parcelZza, z11);
        zzc(5, parcelZza);
    }
}
