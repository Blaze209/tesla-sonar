package com.google.android.gms.internal.mlkit_vision_face;

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
public final class zzok implements zzob {
    private b zza;
    private final b zzb;
    private final zznt zzc;

    public zzok(Context context, zznt zzntVar) {
        this.zzc = zzntVar;
        a aVar = a.f39356g;
        u.f(context);
        final j jVarH = u.c().h(aVar);
        if (aVar.a().contains(c.b("json"))) {
            this.zza = new t(new b() { // from class: com.google.android.gms.internal.mlkit_vision_face.zzoh
                @Override // yv.b
                public final Object get() {
                    return jVarH.a("FIREBASE_ML_SDK", byte[].class, c.b("json"), new h() { // from class: com.google.android.gms.internal.mlkit_vision_face.zzoj
                        @Override // nq.h
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.zzb = new t(new b() { // from class: com.google.android.gms.internal.mlkit_vision_face.zzoi
            @Override // yv.b
            public final Object get() {
                return jVarH.a("FIREBASE_ML_SDK", byte[].class, c.b("proto"), new h() { // from class: com.google.android.gms.internal.mlkit_vision_face.zzog
                    @Override // nq.h
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    static d zzb(zznt zzntVar, zznr zznrVar) {
        int iZza = zzntVar.zza();
        return zznrVar.zza() != 0 ? d.f(zznrVar.zze(iZza, false)) : d.h(zznrVar.zze(iZza, false));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzob
    public final void zza(zznr zznrVar) {
        if (this.zzc.zza() != 0) {
            ((i) this.zzb.get()).a(zzb(this.zzc, zznrVar));
            return;
        }
        b bVar = this.zza;
        if (bVar != null) {
            ((i) bVar.get()).a(zzb(this.zzc, zznrVar));
        }
    }
}
