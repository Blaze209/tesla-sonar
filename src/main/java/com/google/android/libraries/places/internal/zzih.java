package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzih extends zzij {
    final /* synthetic */ zzii zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzih(zzii zziiVar, zzik zzikVar, CharSequence charSequence) {
        super(zzikVar, "2.7.0");
        this.zza = zziiVar;
    }

    @Override // com.google.android.libraries.places.internal.zzij
    final int zzc(int i11) {
        return i11 + 1;
    }

    @Override // com.google.android.libraries.places.internal.zzij
    final int zzd(int i11) {
        zzig.zzb(i11, 5, "index");
        while (i11 < 5) {
            if ("2.7.0".charAt(i11) == '.') {
                return i11;
            }
            i11++;
        }
        return -1;
    }
}
