package com.google.android.gms.internal.mlkit_vision_document_scanner;

import android.content.Context;
import com.google.android.datatransport.cct.a;
import nq.c;
import nq.d;
import nq.i;
import nq.j;
import pq.u;
import yu.t;
import yv.b;

/* JADX INFO: loaded from: classes5.dex */
public final class zztx implements zzti {
    private b zza;
    private final b zzb;
    private final zztk zzc;

    public zztx(Context context, zztk zztkVar) {
        this.zzc = zztkVar;
        a aVar = a.f39356g;
        u.f(context);
        final j jVarH = u.c().h(aVar);
        if (aVar.a().contains(c.b("json"))) {
            this.zza = new t(new b() { // from class: com.google.android.gms.internal.mlkit_vision_document_scanner.zztt
                @Override // yv.b
                public final /* synthetic */ Object get() {
                    return jVarH.a("FIREBASE_ML_SDK", byte[].class, c.b("json"), zztv.zza);
                }
            });
        }
        this.zzb = new t(new b() { // from class: com.google.android.gms.internal.mlkit_vision_document_scanner.zztw
            @Override // yv.b
            public final /* synthetic */ Object get() {
                return jVarH.a("FIREBASE_ML_SDK", byte[].class, c.b("proto"), zztu.zza);
            }
        });
    }

    static d zzb(zztk zztkVar, zzth zzthVar) {
        return d.h(zzthVar.zza(zztkVar.zzc(), false));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzti
    public final void zza(zzth zzthVar) {
        zztk zztkVar = this.zzc;
        if (zztkVar.zzc() != 0) {
            ((i) this.zzb.get()).a(zzb(zztkVar, zzthVar));
            return;
        }
        b bVar = this.zza;
        if (bVar != null) {
            ((i) bVar.get()).a(zzb(zztkVar, zzthVar));
        }
    }
}
