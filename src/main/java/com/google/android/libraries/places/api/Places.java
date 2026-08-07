package com.google.android.libraries.places.api;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.google.android.libraries.places.internal.zzfo;
import com.google.android.libraries.places.internal.zzfp;
import com.google.android.libraries.places.internal.zzfq;
import com.google.android.libraries.places.internal.zzfs;
import com.google.android.libraries.places.internal.zzfz;
import com.google.android.libraries.places.internal.zzgb;
import com.google.android.libraries.places.internal.zzig;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public final class Places {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f41408a = 0;
    private static final zzfs zza = new zzfs();
    private static volatile zzfq zzb;

    private Places() {
    }

    @RecentlyNonNull
    public static synchronized PlacesClient createClient(@RecentlyNonNull Context context) {
        try {
            zzig.zzc(context, "Context must not be null.");
        } catch (Error | RuntimeException e11) {
            zzgb.zzb(e11);
            throw e11;
        }
        return zza(context, zzfz.zzd(context).zze());
    }

    public static synchronized void deinitialize() {
        zza.zzc();
    }

    public static void initialize(@RecentlyNonNull Context context, @RecentlyNonNull String str) {
        try {
            zzb(context, str, null, false);
        } catch (Error | RuntimeException e11) {
            zzgb.zzb(e11);
            throw e11;
        }
    }

    public static synchronized boolean isInitialized() {
        try {
        } catch (Error | RuntimeException e11) {
            zzgb.zzb(e11);
            throw e11;
        }
        return zza.zzf();
    }

    public static synchronized PlacesClient zza(Context context, zzfz zzfzVar) {
        zzfp zzfpVarZza;
        try {
            zzig.zzc(context, "Context must not be null.");
            zzig.zzi(isInitialized(), "Places must be initialized first.");
            zzfpVarZza = zzfo.zza();
            zzfpVarZza.zzc(context);
            zzfpVarZza.zza(zza);
            zzfpVarZza.zzb(zzfzVar);
        } catch (Error | RuntimeException e11) {
            zzgb.zzb(e11);
            throw e11;
        }
        return zzfpVarZza.zzd().zza();
    }

    public static synchronized void zzb(@RecentlyNonNull Context context, @RecentlyNonNull String str, Locale locale, boolean z11) {
        try {
            zzig.zzc(context, "Application context must not be null.");
            zzig.zzc(str, "API Key must not be null.");
            zzig.zze(!str.isEmpty(), "API Key must not be empty.");
            zzgb.zza(context.getApplicationContext(), false);
            zza.zzd(str, locale, false);
        } catch (Error | RuntimeException e11) {
            zzgb.zzb(e11);
            throw e11;
        }
    }

    public static synchronized zzfs zzc() {
        return zza;
    }

    public static synchronized void initialize(@RecentlyNonNull Context context, @RecentlyNonNull String str, Locale locale) {
        try {
            zzb(context, str, locale, false);
        } catch (Error | RuntimeException e11) {
            zzgb.zzb(e11);
            throw e11;
        }
    }
}
