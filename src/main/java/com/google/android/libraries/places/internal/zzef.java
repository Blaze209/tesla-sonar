package com.google.android.libraries.places.internal;

import android.location.Location;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zzef extends zzek {
    private final Location zza;
    private final zziy zzb;

    zzef(FindCurrentPlaceRequest findCurrentPlaceRequest, Location location, zziy zziyVar, Locale locale, String str, boolean z11, zzgf zzgfVar) {
        super(findCurrentPlaceRequest, locale, str, false, zzgfVar);
        this.zza = location;
        this.zzb = zziyVar;
    }

    @Override // com.google.android.libraries.places.internal.zzek
    protected final String zze() {
        return "findplacefromuserlocation/json";
    }

    @Override // com.google.android.libraries.places.internal.zzek
    public final Map zzf() {
        FindCurrentPlaceRequest findCurrentPlaceRequest = (FindCurrentPlaceRequest) zzb();
        HashMap map = new HashMap();
        zzek.zzg(map, "location", zzfc.zzc(this.zza), null);
        zzek.zzg(map, "wifiaccesspoints", zzfc.zzg(this.zzb, 4000), null);
        zzek.zzg(map, "precision", zzfc.zza(this.zza), null);
        zzek.zzg(map, "timestamp", Long.valueOf(this.zza.getTime()), null);
        zzek.zzg(map, "fields", zzfd.zza(findCurrentPlaceRequest.getPlaceFields()), null);
        return map;
    }
}
