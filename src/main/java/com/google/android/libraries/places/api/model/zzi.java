package com.google.android.libraries.places.api.model;

/* JADX INFO: loaded from: classes5.dex */
final class zzi extends zzbd {
    private int zza;
    private int zzb;
    private byte zzc;

    zzi() {
    }

    final zzbd zza(int i11) {
        this.zza = i11;
        this.zzc = (byte) (this.zzc | 1);
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.zzbd
    final zzbd zzb(int i11) {
        this.zzb = i11;
        this.zzc = (byte) (this.zzc | 2);
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.zzbd
    final LocalTime zzc() {
        if (this.zzc == 3) {
            return new zzaj(this.zza, this.zzb);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.zzc & 1) == 0) {
            sb2.append(" hours");
        }
        if ((this.zzc & 2) == 0) {
            sb2.append(" minutes");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
