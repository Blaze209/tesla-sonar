package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.collection.x0;

/* JADX INFO: loaded from: classes5.dex */
public final class zzjt {
    private final x0 zza;

    zzjt(x0 x0Var) {
        this.zza = x0Var;
    }

    public final String zza(Uri uri, String str, String str2, String str3) {
        x0 x0Var = uri != null ? (x0) this.zza.get(uri.toString()) : null;
        if (x0Var == null) {
            return null;
        }
        return (String) x0Var.get("".concat(str3));
    }
}
