package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.internal.auth.zzau;
import com.google.android.gms.internal.auth.zzax;

/* JADX INFO: loaded from: classes5.dex */
final class zze extends zzl {
    final /* synthetic */ zzax zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zze(AccountTransferClient accountTransferClient, int i11, zzax zzaxVar) {
        super(1607, null);
        this.zza = zzaxVar;
    }

    @Override // com.google.android.gms.auth.api.accounttransfer.zzl
    protected final void zza(zzau zzauVar) {
        zzauVar.zzg(new zzd(this, this), this.zza);
    }
}
