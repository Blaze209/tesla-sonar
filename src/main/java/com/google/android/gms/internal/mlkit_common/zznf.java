package com.google.android.gms.internal.mlkit_common;

/* JADX INFO: loaded from: classes5.dex */
public enum zznf implements zzba {
    SOURCE_UNKNOWN(0),
    APP_ASSET(1),
    LOCAL(2),
    CLOUD(3),
    SDK_BUILT_IN(4),
    URI(5);

    private final int zzh;

    zznf(int i11) {
        this.zzh = i11;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzba
    public final int zza() {
        return this.zzh;
    }
}
