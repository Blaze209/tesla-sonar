package com.google.android.libraries.places.internal;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.android.volley.k;
import com.android.volley.toolbox.i;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zzdc extends i {
    final /* synthetic */ Map zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdc(zzdd zzddVar, String str, k.b bVar, int i11, int i12, ImageView.ScaleType scaleType, Bitmap.Config config, k.a aVar, Map map) {
        super(str, bVar, 0, 0, scaleType, config, aVar);
        this.zza = map;
    }

    @Override // com.android.volley.i
    public final Map getHeaders() {
        return this.zza;
    }
}
