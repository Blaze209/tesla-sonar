package com.google.android.libraries.places.internal;

import android.text.TextUtils;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zzeb extends zzek {
    zzeb(FindAutocompletePredictionsRequest findAutocompletePredictionsRequest, Locale locale, String str, boolean z11, zzgf zzgfVar) {
        super(findAutocompletePredictionsRequest, locale, str, false, zzgfVar);
    }

    @Override // com.google.android.libraries.places.internal.zzek
    protected final String zze() {
        return "autocomplete/json";
    }

    @Override // com.google.android.libraries.places.internal.zzek
    public final Map zzf() {
        HashMap map = new HashMap();
        FindAutocompletePredictionsRequest findAutocompletePredictionsRequest = (FindAutocompletePredictionsRequest) zzb();
        TypeFilter typeFilter = findAutocompletePredictionsRequest.getTypeFilter();
        List<String> typesFilter = findAutocompletePredictionsRequest.getTypesFilter();
        String query = findAutocompletePredictionsRequest.getQuery();
        zzek.zzg(map, "input", query == null ? null : query.replaceFirst("^\\s+", "").replaceFirst("\\s+$", " "), null);
        if (typesFilter.isEmpty()) {
            zzek.zzg(map, "types", typeFilter != null ? zzfe.zza(typeFilter) : null, null);
        } else {
            zzek.zzg(map, "types", TextUtils.join("|", typesFilter), null);
        }
        zzek.zzg(map, "sessiontoken", findAutocompletePredictionsRequest.getSessionToken(), null);
        zzek.zzg(map, "origin", zzfc.zzd(findAutocompletePredictionsRequest.getOrigin()), null);
        zzek.zzg(map, "locationbias", zzfc.zze(findAutocompletePredictionsRequest.getLocationBias()), null);
        zzek.zzg(map, "locationrestriction", zzfc.zzf(findAutocompletePredictionsRequest.getLocationRestriction()), null);
        zzek.zzg(map, "components", zzfc.zzb(findAutocompletePredictionsRequest.getCountries()), null);
        return map;
    }
}
