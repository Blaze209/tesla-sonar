package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* JADX INFO: loaded from: classes5.dex */
public final class zzkb {
    public static final /* synthetic */ int zza = 0;
    private static final androidx.collection.a zzb = new androidx.collection.a();

    public static synchronized Uri zza(String str) {
        androidx.collection.a aVar = zzb;
        Uri uri = (Uri) aVar.get("com.google.android.gms.measurement");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
        aVar.put("com.google.android.gms.measurement", uri2);
        return uri2;
    }
}
