package com.google.android.gms.internal.mlkit_common;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import androidx.core.os.LocaleListCompat;
import com.google.android.gms.common.internal.LibraryVersion;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.sdkinternal.c;
import com.google.mlkit.common.sdkinternal.g;
import com.google.mlkit.common.sdkinternal.l;
import com.google.mlkit.common.sdkinternal.n;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Callable;
import q5.f;
import qx.b;

/* JADX INFO: loaded from: classes5.dex */
public final class zzsh {
    private static zzaf zza;
    private static final zzai zzb = zzai.zzc("optional-module-barcode", "com.google.android.gms.vision.barcode");
    private final String zzc;
    private final String zzd;
    private final zzrz zze;
    private final n zzf;
    private final Task zzg;
    private final Task zzh;
    private final String zzi;
    private final int zzj;

    public zzsh(Context context, final n nVar, zzrz zzrzVar, String str) {
        new HashMap();
        new HashMap();
        this.zzc = context.getPackageName();
        this.zzd = c.a(context);
        this.zzf = nVar;
        this.zze = zzrzVar;
        zzsv.zza();
        this.zzi = str;
        this.zzg = g.a().b(new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzse
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zza();
            }
        });
        g gVarA = g.a();
        Objects.requireNonNull(nVar);
        this.zzh = gVarA.b(new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzsf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return nVar.a();
            }
        });
        zzai zzaiVar = zzb;
        this.zzj = zzaiVar.containsKey(str) ? DynamiteModule.getRemoteVersion(context, (String) zzaiVar.get(str)) : -1;
    }

    @NonNull
    private static synchronized zzaf zzh() {
        try {
            zzaf zzafVar = zza;
            if (zzafVar != null) {
                return zzafVar;
            }
            LocaleListCompat localeListCompatA = f.a(Resources.getSystem().getConfiguration());
            zzac zzacVar = new zzac();
            for (int i11 = 0; i11 < localeListCompatA.h(); i11++) {
                zzacVar.zzb(c.b(localeListCompatA.c(i11)));
            }
            zzaf zzafVarZzc = zzacVar.zzc();
            zza = zzafVarZzc;
            return zzafVarZzc;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final zzqt zzi(String str, String str2) {
        zzqt zzqtVar = new zzqt();
        zzqtVar.zzb(this.zzc);
        zzqtVar.zzc(this.zzd);
        zzqtVar.zzh(zzh());
        zzqtVar.zzg(Boolean.TRUE);
        zzqtVar.zzl(str);
        zzqtVar.zzj(str2);
        zzqtVar.zzi(this.zzh.isSuccessful() ? (String) this.zzh.getResult() : this.zzf.a());
        zzqtVar.zzd(10);
        zzqtVar.zzk(Integer.valueOf(this.zzj));
        return zzqtVar;
    }

    private final String zzj() {
        if (this.zzg.isSuccessful()) {
            return (String) this.zzg.getResult();
        }
        return LibraryVersion.getInstance().getVersion(this.zzi);
    }

    final /* synthetic */ String zza() {
        return LibraryVersion.getInstance().getVersion(this.zzi);
    }

    final /* synthetic */ void zzb(zzry zzryVar, zzmv zzmvVar, String str) {
        zzryVar.zza(zzmvVar);
        zzryVar.zzc(zzi(zzryVar.zzd(), str));
        this.zze.zza(zzryVar);
    }

    final /* synthetic */ void zzc(zzry zzryVar, zzsj zzsjVar, b bVar) {
        zzryVar.zza(zzmv.MODEL_DOWNLOAD);
        zzryVar.zzc(zzi(zzsjVar.zze(), zzj()));
        zzryVar.zzb(zzst.zza(bVar, this.zzf, zzsjVar));
        this.zze.zza(zzryVar);
    }

    public final void zzd(final zzry zzryVar, final zzmv zzmvVar) {
        final String strZzj = zzj();
        g.d().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_common.zzsd
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzb(zzryVar, zzmvVar, strZzj);
            }
        });
    }

    public final void zze(zzry zzryVar, b bVar, boolean z11, int i11) {
        zzsi zzsiVarZzh = zzsj.zzh();
        zzsiVarZzh.zzf(false);
        zzsiVarZzh.zzd(bVar.c());
        zzsiVarZzh.zza(zzna.FAILED);
        zzsiVarZzh.zzb(zzmu.DOWNLOAD_FAILED);
        zzsiVarZzh.zzc(i11);
        zzg(zzryVar, bVar, zzsiVarZzh.zzh());
    }

    public final void zzf(zzry zzryVar, b bVar, zzmu zzmuVar, boolean z11, l lVar, zzna zznaVar) {
        zzsi zzsiVarZzh = zzsj.zzh();
        zzsiVarZzh.zzf(z11);
        zzsiVarZzh.zzd(lVar);
        zzsiVarZzh.zzb(zzmuVar);
        zzsiVarZzh.zza(zznaVar);
        zzg(zzryVar, bVar, zzsiVarZzh.zzh());
    }

    public final void zzg(final zzry zzryVar, final b bVar, final zzsj zzsjVar) {
        g.d().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_common.zzsg
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzc(zzryVar, zzsjVar, bVar);
            }
        });
    }
}
