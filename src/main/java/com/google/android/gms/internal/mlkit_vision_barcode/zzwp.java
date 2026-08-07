package com.google.android.gms.internal.mlkit_vision_barcode;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.core.os.LocaleListCompat;
import com.google.android.gms.common.internal.LibraryVersion;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.sdkinternal.c;
import com.google.mlkit.common.sdkinternal.g;
import com.google.mlkit.common.sdkinternal.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import q5.f;
import vx.k;

/* JADX INFO: loaded from: classes5.dex */
public final class zzwp {
    private static zzcs zza;
    private static final zzcu zzb = zzcu.zzc("optional-module-barcode", "com.google.android.gms.vision.barcode");
    private final String zzc;
    private final String zzd;
    private final zzwf zze;
    private final n zzf;
    private final Task zzg;
    private final Task zzh;
    private final String zzi;
    private final int zzj;
    private final Map zzk = new HashMap();
    private final Map zzl = new HashMap();

    public zzwp(Context context, final n nVar, zzwf zzwfVar, String str) {
        this.zzc = context.getPackageName();
        this.zzd = c.a(context);
        this.zzf = nVar;
        this.zze = zzwfVar;
        zzxb.zza();
        this.zzi = str;
        this.zzg = g.a().b(new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzb();
            }
        });
        g gVarA = g.a();
        Objects.requireNonNull(nVar);
        this.zzh = gVarA.b(new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return nVar.a();
            }
        });
        zzcu zzcuVar = zzb;
        this.zzj = zzcuVar.containsKey(str) ? DynamiteModule.getRemoteVersion(context, (String) zzcuVar.get(str)) : -1;
    }

    static long zza(List list, double d11) {
        return ((Long) list.get(Math.max(((int) Math.ceil((d11 / 100.0d) * ((double) list.size()))) - 1, 0))).longValue();
    }

    @NonNull
    private static synchronized zzcs zzi() {
        try {
            zzcs zzcsVar = zza;
            if (zzcsVar != null) {
                return zzcsVar;
            }
            LocaleListCompat localeListCompatA = f.a(Resources.getSystem().getConfiguration());
            zzcp zzcpVar = new zzcp();
            for (int i11 = 0; i11 < localeListCompatA.h(); i11++) {
                zzcpVar.zzd(c.b(localeListCompatA.c(i11)));
            }
            zzcs zzcsVarZzf = zzcpVar.zzf();
            zza = zzcsVarZzf;
            return zzcsVarZzf;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final String zzj() {
        if (this.zzg.isSuccessful()) {
            return (String) this.zzg.getResult();
        }
        return LibraryVersion.getInstance().getVersion(this.zzi);
    }

    private final boolean zzk(zzrc zzrcVar, long j11, long j12) {
        return this.zzk.get(zzrcVar) == null || j11 - ((Long) this.zzk.get(zzrcVar)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }

    final /* synthetic */ String zzb() {
        return LibraryVersion.getInstance().getVersion(this.zzi);
    }

    final /* synthetic */ void zzc(zzwe zzweVar, zzrc zzrcVar, String str) {
        zzweVar.zzb(zzrcVar);
        String strZzd = zzweVar.zzd();
        zzvb zzvbVar = new zzvb();
        zzvbVar.zzb(this.zzc);
        zzvbVar.zzc(this.zzd);
        zzvbVar.zzh(zzi());
        zzvbVar.zzg(Boolean.TRUE);
        zzvbVar.zzl(strZzd);
        zzvbVar.zzj(str);
        zzvbVar.zzi(this.zzh.isSuccessful() ? (String) this.zzh.getResult() : this.zzf.a());
        zzvbVar.zzd(10);
        zzvbVar.zzk(Integer.valueOf(this.zzj));
        zzweVar.zzc(zzvbVar);
        this.zze.zza(zzweVar);
    }

    public final void zzd(zzwe zzweVar, zzrc zzrcVar) {
        zze(zzweVar, zzrcVar, zzj());
    }

    public final void zze(final zzwe zzweVar, final zzrc zzrcVar, final String str) {
        g.d().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwj
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzc(zzweVar, zzrcVar, str);
            }
        });
    }

    public final void zzf(zzwo zzwoVar, zzrc zzrcVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (zzk(zzrcVar, jElapsedRealtime, 30L)) {
            this.zzk.put(zzrcVar, Long.valueOf(jElapsedRealtime));
            zze(zzwoVar.zza(), zzrcVar, zzj());
        }
    }

    final /* synthetic */ void zzg(zzrc zzrcVar, k kVar) {
        zzcy zzcyVar = (zzcy) this.zzl.get(zzrcVar);
        if (zzcyVar != null) {
            for (Object obj : zzcyVar.zzw()) {
                ArrayList arrayList = new ArrayList(zzcyVar.zze(obj));
                Collections.sort(arrayList);
                zzqb zzqbVar = new zzqb();
                Iterator it = arrayList.iterator();
                long jLongValue = 0;
                while (it.hasNext()) {
                    jLongValue += ((Long) it.next()).longValue();
                }
                zzqbVar.zza(Long.valueOf(jLongValue / ((long) arrayList.size())));
                zzqbVar.zzc(Long.valueOf(zza(arrayList, 100.0d)));
                zzqbVar.zzf(Long.valueOf(zza(arrayList, 75.0d)));
                zzqbVar.zzd(Long.valueOf(zza(arrayList, 50.0d)));
                zzqbVar.zzb(Long.valueOf(zza(arrayList, 25.0d)));
                zzqbVar.zze(Long.valueOf(zza(arrayList, 0.0d)));
                zze(kVar.a(obj, arrayList.size(), zzqbVar.zzg()), zzrcVar, zzj());
            }
            this.zzl.remove(zzrcVar);
        }
    }

    final /* synthetic */ void zzh(final zzrc zzrcVar, Object obj, long j11, final k kVar) {
        if (!this.zzl.containsKey(zzrcVar)) {
            this.zzl.put(zzrcVar, zzbw.zzz());
        }
        ((zzcy) this.zzl.get(zzrcVar)).zzt(obj, Long.valueOf(j11));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (zzk(zzrcVar, jElapsedRealtime, 30L)) {
            this.zzk.put(zzrcVar, Long.valueOf(jElapsedRealtime));
            g.d().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwk
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzg(zzrcVar, kVar);
                }
            });
        }
    }
}
