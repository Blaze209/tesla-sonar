package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zzdx extends zzek {
    zzdx(FetchPlaceRequest fetchPlaceRequest, Locale locale, String str, boolean z11, zzgf zzgfVar) {
        super(fetchPlaceRequest, locale, str, false, zzgfVar);
    }

    @Override // com.google.android.libraries.places.internal.zzek
    protected final String zze() {
        return "details/json";
    }

    @Override // com.google.android.libraries.places.internal.zzek
    public final Map zzf() {
        FetchPlaceRequest fetchPlaceRequest = (FetchPlaceRequest) zzb();
        HashMap map = new HashMap();
        zzek.zzg(map, "placeid", fetchPlaceRequest.getPlaceId(), null);
        zzek.zzg(map, "sessiontoken", fetchPlaceRequest.getSessionToken(), null);
        zzek.zzg(map, "fields", zzfd.zza(fetchPlaceRequest.getPlaceFields()), null);
        return map;
    }
}
