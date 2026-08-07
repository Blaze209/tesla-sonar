package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.api.model.PhotoMetadata;
import com.google.android.libraries.places.api.net.FetchPhotoRequest;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zzdr extends zzek {
    zzdr(FetchPhotoRequest fetchPhotoRequest, String str, boolean z11, zzgf zzgfVar) {
        super(fetchPhotoRequest, null, str, false, zzgfVar);
    }

    @Override // com.google.android.libraries.places.internal.zzek
    protected final String zze() {
        return "photo";
    }

    @Override // com.google.android.libraries.places.internal.zzek
    public final Map zzf() {
        FetchPhotoRequest fetchPhotoRequest = (FetchPhotoRequest) zzb();
        PhotoMetadata photoMetadata = fetchPhotoRequest.getPhotoMetadata();
        HashMap map = new HashMap();
        zzek.zzg(map, "maxheight", fetchPhotoRequest.getMaxHeight(), null);
        zzek.zzg(map, "maxwidth", fetchPhotoRequest.getMaxWidth(), null);
        map.put("photoreference", photoMetadata.zza());
        return map;
    }
}
