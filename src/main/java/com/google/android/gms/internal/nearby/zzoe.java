package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zzoe implements RemoteCall {
    public final /* synthetic */ zzom zza;

    public /* synthetic */ zzoe(zzom zzomVar) {
        this.zza = zzomVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object obj, Object obj2) {
        int i11 = zzou.zza;
        zzkr zzkrVar = (zzkr) ((zzno) obj).getService();
        zznk zznkVar = new zznk();
        zznkVar.zza(this.zza);
        zzkrVar.zzq(zznkVar.zzb());
        ((TaskCompletionSource) obj2).setResult(null);
    }
}
