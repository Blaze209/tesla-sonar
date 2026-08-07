package com.google.android.libraries.places.internal;

import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes5.dex */
public final class zzlh implements zzlb {
    private final String zza;
    private final Level zzb;
    private final Set zzc;
    private final zzkr zzd;

    private zzlh(String str, boolean z11, boolean z12, Level level, boolean z13, Set set, zzkr zzkrVar) {
        this.zza = "";
        this.zzb = level;
        this.zzc = set;
        this.zzd = zzkrVar;
    }

    @Override // com.google.android.libraries.places.internal.zzlb
    public final zzkg zza(String str) {
        return new zzlk(this.zza, str, true, false, this.zzb, this.zzc, this.zzd, null);
    }

    public final zzlh zzb(boolean z11) {
        return new zzlh(this.zza, true, false, Level.OFF, false, this.zzc, this.zzd);
    }

    public zzlh() {
        this("", true, false, Level.ALL, false, zzlk.zza, zzlk.zzb);
    }
}
