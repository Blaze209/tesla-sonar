package com.google.android.gms.internal.mlkit_vision_document_scanner;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;
import rv.c;
import rv.e;
import sv.b;

/* JADX INFO: loaded from: classes5.dex */
public final class zzat implements b {
    public static final /* synthetic */ int zza = 0;
    private static final c zzb = zzas.zza;
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private final c zze = zzb;

    @Override // sv.b
    @NonNull
    public final /* bridge */ /* synthetic */ b registerEncoder(@NonNull Class cls, @NonNull c cVar) {
        this.zzc.put(cls, cVar);
        this.zzd.remove(cls);
        return this;
    }

    public final zzau zza() {
        return new zzau(new HashMap(this.zzc), new HashMap(this.zzd), this.zze);
    }

    @NonNull
    public final /* bridge */ /* synthetic */ b registerEncoder(@NonNull Class cls, @NonNull e eVar) {
        this.zzd.put(cls, eVar);
        this.zzc.remove(cls);
        return this;
    }
}
