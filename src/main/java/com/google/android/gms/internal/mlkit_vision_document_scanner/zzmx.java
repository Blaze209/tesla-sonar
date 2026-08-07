package com.google.android.gms.internal.mlkit_vision_document_scanner;

/* JADX INFO: loaded from: classes5.dex */
public enum zzmx implements zzan {
    MODE_UNKNOWN(0),
    MODE_AUTO(1),
    MODE_MANUAL(2);

    private final int zzd;

    zzmx(int i11) {
        this.zzd = i11;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzan
    public final int zza() {
        return this.zzd;
    }
}
