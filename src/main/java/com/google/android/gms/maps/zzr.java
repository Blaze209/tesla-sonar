package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.zzbc;
import com.google.android.gms.maps.model.PointOfInterest;

/* JADX INFO: loaded from: classes5.dex */
final class zzr extends zzbc {
    final /* synthetic */ GoogleMap.OnPoiClickListener zza;

    zzr(GoogleMap googleMap, GoogleMap.OnPoiClickListener onPoiClickListener) {
        this.zza = onPoiClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzbd
    public final void zzb(PointOfInterest pointOfInterest) {
        this.zza.onPoiClick(pointOfInterest);
    }
}
