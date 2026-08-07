package com.google.android.gms.internal.nearby;

/* JADX INFO: loaded from: classes5.dex */
final class zzpr extends zzpp {
    private final zzpt zza;

    zzpr(zzpt zzptVar, int i11) {
        super(zzptVar.size(), i11);
        this.zza = zzptVar;
    }

    @Override // com.google.android.gms.internal.nearby.zzpp
    protected final Object zza(int i11) {
        return this.zza.get(i11);
    }
}
