package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.zzbe;
import com.google.android.gms.maps.model.Polygon;

/* JADX INFO: loaded from: classes5.dex */
final class zzo extends zzbe {
    final /* synthetic */ GoogleMap.OnPolygonClickListener zza;

    zzo(GoogleMap googleMap, GoogleMap.OnPolygonClickListener onPolygonClickListener) {
        this.zza = onPolygonClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzbf
    public final void zzb(com.google.android.gms.internal.maps.zzaa zzaaVar) {
        this.zza.onPolygonClick(new Polygon(zzaaVar));
    }
}
