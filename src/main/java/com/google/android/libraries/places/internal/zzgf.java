package com.google.android.libraries.places.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class zzgf {
    private final Context zza;

    public zzgf(Context context) {
        zzig.zzc(context, "Context must not be null.");
        this.zza = context;
    }

    public final zzjb zza() {
        String packageName = this.zza.getPackageName();
        String strZza = zzfu.zza(this.zza.getPackageManager(), packageName);
        zzja zzjaVar = new zzja();
        if (packageName != null) {
            zzjaVar.zza("X-Android-Package", packageName);
        }
        if (strZza != null) {
            zzjaVar.zza("X-Android-Cert", strZza);
        }
        return zzjaVar.zzb();
    }
}
