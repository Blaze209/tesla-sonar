package com.google.android.gms.internal.mlkit_vision_text_common;

import android.content.Context;
import com.google.android.datatransport.cct.a;
import nq.c;
import nq.d;
import nq.h;
import nq.i;
import nq.j;
import pq.u;
import yu.t;
import yv.b;

/* JADX INFO: loaded from: classes5.dex */
public final class zzuk implements zzts {
    private b zza;
    private final b zzb;
    private final zztu zzc;

    public zzuk(Context context, zztu zztuVar) {
        this.zzc = zztuVar;
        a aVar = a.f39356g;
        u.f(context);
        final j jVarH = u.c().h(aVar);
        if (aVar.a().contains(c.b("json"))) {
            this.zza = new t(new b() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zzuh
                @Override // yv.b
                public final Object get() {
                    return jVarH.a("FIREBASE_ML_SDK", byte[].class, c.b("json"), new h() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zzuj
                        @Override // nq.h
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.zzb = new t(new b() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zzui
            @Override // yv.b
            public final Object get() {
                return jVarH.a("FIREBASE_ML_SDK", byte[].class, c.b("proto"), new h() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zzug
                    @Override // nq.h
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    static d zzb(zztu zztuVar, zztr zztrVar) {
        int iZza = zztuVar.zza();
        return zztrVar.zza() != 0 ? d.f(zztrVar.zze(iZza, false)) : d.h(zztrVar.zze(iZza, false));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzts
    public final void zza(zztr zztrVar) {
        if (this.zzc.zza() != 0) {
            ((i) this.zzb.get()).a(zzb(this.zzc, zztrVar));
            return;
        }
        b bVar = this.zza;
        if (bVar != null) {
            ((i) bVar.get()).a(zzb(this.zzc, zztrVar));
        }
    }
}
