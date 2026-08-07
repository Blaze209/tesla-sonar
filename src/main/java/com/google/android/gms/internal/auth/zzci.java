package com.google.android.gms.internal.auth;

import android.net.Uri;
import androidx.collection.x0;

/* JADX INFO: loaded from: classes5.dex */
public final class zzci {
    private final x0 zza;

    zzci(x0 x0Var) {
        this.zza = x0Var;
    }

    public final String zza(Uri uri, String str, String str2, String str3) {
        x0 x0Var;
        if (uri != null) {
            x0Var = (x0) this.zza.get(uri.toString());
        } else {
            x0Var = null;
        }
        if (x0Var == null) {
            return null;
        }
        return (String) x0Var.get("".concat(str3));
    }
}
