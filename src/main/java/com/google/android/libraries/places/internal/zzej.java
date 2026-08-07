package com.google.android.libraries.places.internal;

import com.google.gson.JsonSyntaxException;
import com.google.gson.c;
import com.google.gson.f;
import com.google.gson.g;

/* JADX INFO: loaded from: classes5.dex */
public final class zzej {
    private final f zza = new g().f(c.LOWER_CASE_WITH_UNDERSCORES).b();

    public final Object zza(String str, Class cls) throws zzdh {
        try {
            return this.zza.j(str, cls);
        } catch (JsonSyntaxException unused) {
            throw new zzdh("Could not convert JSON string to " + cls.getName() + " due to syntax errors.");
        }
    }
}
