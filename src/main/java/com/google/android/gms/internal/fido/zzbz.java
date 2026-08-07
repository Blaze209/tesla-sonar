package com.google.android.gms.internal.fido;

/* JADX INFO: loaded from: classes5.dex */
final class zzbz extends zzbu {
    private final zzcc zza;

    zzbz(zzcc zzccVar, int i11) {
        super(zzccVar.size(), i11);
        this.zza = zzccVar;
    }

    @Override // com.google.android.gms.internal.fido.zzbu
    protected final Object zza(int i11) {
        return this.zza.get(i11);
    }
}
