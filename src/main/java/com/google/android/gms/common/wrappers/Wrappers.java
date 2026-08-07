package com.google.android.gms.common.wrappers;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes5.dex */
@KeepForSdk
public class Wrappers {
    private static final Wrappers zzb = new Wrappers();
    private PackageManagerWrapper zza = null;

    @NonNull
    @KeepForSdk
    public static PackageManagerWrapper packageManager(@NonNull Context context) {
        return zzb.zza(context);
    }

    @NonNull
    public final synchronized PackageManagerWrapper zza(@NonNull Context context) {
        try {
            if (this.zza == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.zza = new PackageManagerWrapper(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.zza;
    }
}
