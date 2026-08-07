package com.google.android.libraries.places.internal;

import java.util.Set;
import java.util.logging.Level;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes5.dex */
final class zzli extends zzkz {
    private final Level zza;
    private final Set zzb;
    private final zzkr zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzli(String str, @NullableDecl String str2, boolean z11, boolean z12, boolean z13, boolean z14) {
        super(str2);
        Level level = Level.ALL;
        Set set = zzlk.zza;
        zzkr zzkrVar = zzlk.zzb;
        this.zza = level;
        this.zzb = set;
        this.zzc = zzkrVar;
    }
}
