package com.google.android.gms.internal.mlkit_vision_document_scanner;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class zztl implements zzti {
    final List zza;

    public zztl(Context context, zztk zztkVar) {
        ArrayList arrayList = new ArrayList();
        this.zza = arrayList;
        if (zztkVar.zzb()) {
            arrayList.add(new zztx(context, zztkVar));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzti
    public final void zza(zzth zzthVar) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzti) it.next()).zza(zzthVar);
        }
    }
}
