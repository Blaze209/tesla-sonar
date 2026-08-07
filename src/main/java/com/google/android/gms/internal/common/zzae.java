package com.google.android.gms.internal.common;

/* JADX INFO: loaded from: classes5.dex */
final class zzae extends zzz {
    private final zzah zza;

    zzae(zzah zzahVar, int i11) {
        super(zzahVar.size(), i11);
        this.zza = zzahVar;
    }

    @Override // com.google.android.gms.internal.common.zzz
    protected final Object zza(int i11) {
        return this.zza.get(i11);
    }
}
