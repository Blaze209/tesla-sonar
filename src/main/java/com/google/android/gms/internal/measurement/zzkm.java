package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import ou.m;
import ou.p;
import ou.x;
import ou.y;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzkm {
    public static final /* synthetic */ int zzc = 0;
    private static final Object zzd = new Object();
    private static volatile zzkh zze = null;
    private static volatile boolean zzf = false;
    private static final AtomicInteger zzh;
    final zzkg zza;
    final String zzb;
    private Object zzg;
    private volatile int zzi = -1;
    private volatile Object zzj;
    private volatile boolean zzk;

    static {
        new AtomicReference();
        p.n(zzkk.zza, "BuildInfo must be non-null");
        zzh = new AtomicInteger();
    }

    /* synthetic */ zzkm(zzkg zzkgVar, String str, Object obj, boolean z11, byte[] bArr) {
        if (zzkgVar.zza == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.zza = zzkgVar;
        this.zzb = str;
        this.zzg = obj;
        this.zzk = false;
    }

    public static void zzb(final Context context) {
        if (zze != null || context == null) {
            return;
        }
        Object obj = zzd;
        synchronized (obj) {
            try {
                if (zze == null) {
                    synchronized (obj) {
                        try {
                            zzkh zzkhVar = zze;
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext != null) {
                                context = applicationContext;
                            }
                            if (zzkhVar == null || zzkhVar.zza() != context) {
                                if (zzkhVar != null) {
                                    zzjr.zzd();
                                    zzko.zzb();
                                    zzjy.zzc();
                                }
                                zze = new zzjn(context, y.a(new x() { // from class: com.google.android.gms.internal.measurement.zzkl
                                    @Override // ou.x
                                    public final /* synthetic */ Object get() {
                                        int i11 = zzkm.zzc;
                                        return zzjz.zza(context);
                                    }
                                }));
                                zzh.incrementAndGet();
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static void zzc() {
        zzh.incrementAndGet();
    }

    abstract Object zza(Object obj);

    /* JADX WARN: Code duplicated, block: B:16:0x004a A[PHI: r2
      0x004a: PHI (r2v1 ou.m) = (r2v0 ou.m), (r2v0 ou.m), (r2v7 ou.m) binds: [B:8:0x0016, B:10:0x001c, B:12:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    public final Object zzd() {
        String strZza;
        zzjv zzjvVarZza;
        String strZzb;
        Object objZze;
        int i11 = zzh.get();
        if (this.zzi < i11) {
            synchronized (this) {
                try {
                    if (this.zzi < i11) {
                        zzkh zzkhVar = zze;
                        m mVarA = m.a();
                        Object objZza = null;
                        if (zzkhVar == null || zzkhVar.zzb() == null) {
                            strZza = null;
                        } else {
                            mVarA = (m) ((x) p.m(zzkhVar.zzb())).get();
                            if (mVarA.c()) {
                                zzjt zzjtVar = (zzjt) mVarA.b();
                                zzkg zzkgVar = this.zza;
                                strZza = zzjtVar.zza(zzkgVar.zza, null, zzkgVar.zzc, this.zzb);
                            } else {
                                strZza = null;
                            }
                        }
                        p.s(zzkhVar != null, "Must call PhenotypeFlagInitializer.maybeInit() first");
                        zzkg zzkgVar2 = this.zza;
                        Uri uri = zzkgVar2.zza;
                        if (uri != null) {
                            zzjvVarZza = zzka.zza(zzkhVar.zza(), uri) ? zzjr.zza(zzkhVar.zza().getContentResolver(), uri, zzkj.zza) : null;
                        } else {
                            zzjvVarZza = zzko.zza(zzkhVar.zza(), (String) p.m(null), zzki.zza);
                        }
                        Object objZza2 = (zzjvVarZza == null || (objZze = zzjvVarZza.zze(this.zzb)) == null) ? null : zza(objZze);
                        if (objZza2 == null) {
                            if (!zzkgVar2.zzd && (strZzb = zzjy.zza(zzkhVar.zza()).zze(this.zzb)) != null) {
                                objZza = zza(strZzb);
                            }
                            objZza2 = objZza == null ? this.zzg : objZza;
                        }
                        if (mVarA.c()) {
                            objZza2 = strZza == null ? this.zzg : zza(strZza);
                        }
                        this.zzj = objZza2;
                        this.zzi = i11;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.zzj;
    }
}
