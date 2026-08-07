package com.google.android.libraries.places.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzek extends zzdf {
    private final Locale zza;
    private final String zzb;
    private final zzgf zzc;

    protected zzek(zzft zzftVar, Locale locale, String str, boolean z11, zzgf zzgfVar) {
        super(zzftVar);
        this.zza = locale;
        this.zzb = str;
        this.zzc = zzgfVar;
    }

    protected static void zzg(Map map, String str, Object obj, Object obj2) {
        String string = obj != null ? obj.toString() : null;
        if (TextUtils.isEmpty(string)) {
            return;
        }
        map.put(str, string);
    }

    @Override // com.google.android.libraries.places.internal.zzdf
    protected final String zzc() {
        zzew zzewVar = new zzew(zze(), this.zzb);
        zzewVar.zza(this.zza);
        zzewVar.zzb(zzf());
        return zzewVar.zzc();
    }

    @Override // com.google.android.libraries.places.internal.zzdf
    protected final Map zzd() {
        HashMap map = new HashMap();
        map.putAll(this.zzc.zza());
        map.put("X-Places-Android-Sdk", "2.7.0");
        return map;
    }

    protected abstract String zze();

    protected abstract Map zzf();
}
