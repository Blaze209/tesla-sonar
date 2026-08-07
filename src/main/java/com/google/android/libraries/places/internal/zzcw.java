package com.google.android.libraries.places.internal;

import com.android.volley.k;
import com.android.volley.toolbox.j;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
final class zzcw extends j {
    final /* synthetic */ Map zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcw(zzcx zzcxVar, int i11, String str, JSONObject jSONObject, k.b bVar, k.a aVar, Map map) {
        super(0, str, null, bVar, aVar);
        this.zza = map;
    }

    @Override // com.android.volley.i
    public final Map getHeaders() {
        return this.zza;
    }
}
