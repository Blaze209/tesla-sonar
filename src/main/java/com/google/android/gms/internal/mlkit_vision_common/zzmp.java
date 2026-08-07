package com.google.android.gms.internal.mlkit_vision_common;

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
public final class zzmp implements zzmc {
    private b zza;
    private final b zzb;
    private final zzme zzc;

    public zzmp(Context context, zzme zzmeVar) {
        this.zzc = zzmeVar;
        a aVar = a.f39356g;
        u.f(context);
        final j jVarH = u.c().h(aVar);
        if (aVar.a().contains(c.b("json"))) {
            this.zza = new t(new b() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzmm
                @Override // yv.b
                public final Object get() {
                    return jVarH.a("FIREBASE_ML_SDK", byte[].class, c.b("json"), new h() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzmo
                        @Override // nq.h
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.zzb = new t(new b() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzmn
            @Override // yv.b
            public final Object get() {
                return jVarH.a("FIREBASE_ML_SDK", byte[].class, c.b("proto"), new h() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzml
                    @Override // nq.h
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    static d zzb(zzme zzmeVar, zzmb zzmbVar) {
        return d.h(zzmbVar.zzd(zzmeVar.zza(), false));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmc
    public final void zza(zzmb zzmbVar) {
        if (this.zzc.zza() != 0) {
            ((i) this.zzb.get()).a(zzb(this.zzc, zzmbVar));
            return;
        }
        b bVar = this.zza;
        if (bVar != null) {
            ((i) bVar.get()).a(zzb(this.zzc, zzmbVar));
        }
    }
}
