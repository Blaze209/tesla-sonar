package com.google.android.gms.internal.mlkit_vision_document_scanner;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import androidx.core.os.LocaleListCompat;
import com.google.android.gms.common.internal.LibraryVersion;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.sdkinternal.c;
import com.google.mlkit.common.sdkinternal.g;
import com.google.mlkit.common.sdkinternal.n;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Callable;
import q5.f;

/* JADX INFO: loaded from: classes5.dex */
public final class zztp {
    private static zzx zza;
    private static final zzz zzb = zzz.zza("optional-module-barcode", "com.google.android.gms.vision.barcode");
    private final String zzc;
    private final String zzd;
    private final zzti zze;
    private final n zzf;
    private final Task zzg;
    private final Task zzh;
    private final String zzi;
    private final int zzj;

    public zztp(Context context, final n nVar, zzti zztiVar, String str) {
        new HashMap();
        new HashMap();
        this.zzc = context.getPackageName();
        this.zzd = c.a(context);
        this.zzf = nVar;
        this.zze = zztiVar;
        zzua.zza();
        this.zzi = str;
        this.zzg = g.a().b(new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_document_scanner.zztn
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzb();
            }
        });
        g gVarA = g.a();
        Objects.requireNonNull(nVar);
        this.zzh = gVarA.b(new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_document_scanner.zzto
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return nVar.a();
            }
        });
        zzz zzzVar = zzb;
        this.zzj = zzzVar.containsKey(str) ? DynamiteModule.getRemoteVersion(context, (String) zzzVar.get(str)) : -1;
    }

    @NonNull
    private static synchronized zzx zzd() {
        try {
            zzx zzxVar = zza;
            if (zzxVar != null) {
                return zzxVar;
            }
            LocaleListCompat localeListCompatA = f.a(Resources.getSystem().getConfiguration());
            zzu zzuVar = new zzu();
            for (int i11 = 0; i11 < localeListCompatA.h(); i11++) {
                zzuVar.zza(c.b(localeListCompatA.c(i11)));
            }
            zzx zzxVarZzb = zzuVar.zzb();
            zza = zzxVarZzb;
            return zzxVarZzb;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void zza(final zzth zzthVar, final zznu zznuVar) throws Throwable {
        final String version;
        Task task = this.zzg;
        if (task.isSuccessful()) {
            version = (String) task.getResult();
        } else {
            version = LibraryVersion.getInstance().getVersion(this.zzi);
        }
        g.d().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_document_scanner.zztm
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzc(zzthVar, zznuVar, version);
            }
        });
    }

    final /* synthetic */ String zzb() {
        return LibraryVersion.getInstance().getVersion(this.zzi);
    }

    final /* synthetic */ void zzc(zzth zzthVar, zznu zznuVar, String str) {
        zzthVar.zzc(zznuVar);
        String strZzd = zzthVar.zzd();
        zzsj zzsjVar = new zzsj();
        zzsjVar.zza(this.zzc);
        zzsjVar.zzb(this.zzd);
        zzsjVar.zze(zzd());
        zzsjVar.zzh(Boolean.TRUE);
        zzsjVar.zzd(strZzd);
        zzsjVar.zzc(str);
        Task task = this.zzh;
        zzsjVar.zzf(task.isSuccessful() ? (String) task.getResult() : this.zzf.a());
        zzsjVar.zzj(10);
        zzsjVar.zzk(Integer.valueOf(this.zzj));
        zzthVar.zzb(zzsjVar);
        this.zze.zza(zzthVar);
    }
}
