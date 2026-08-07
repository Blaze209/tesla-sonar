package com.google.android.gms.internal.mlkit_common;

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
public final class zzsp implements zzrz {
    private b zza;
    private final b zzb;
    private final zzsb zzc;

    public zzsp(Context context, zzsb zzsbVar) {
        this.zzc = zzsbVar;
        a aVar = a.f39356g;
        u.f(context);
        final j jVarH = u.c().h(aVar);
        if (aVar.a().contains(c.b("json"))) {
            this.zza = new t(new b() { // from class: com.google.android.gms.internal.mlkit_common.zzsm
                @Override // yv.b
                public final Object get() {
                    return jVarH.a("FIREBASE_ML_SDK", byte[].class, c.b("json"), new h() { // from class: com.google.android.gms.internal.mlkit_common.zzso
                        @Override // nq.h
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.zzb = new t(new b() { // from class: com.google.android.gms.internal.mlkit_common.zzsn
            @Override // yv.b
            public final Object get() {
                return jVarH.a("FIREBASE_ML_SDK", byte[].class, c.b("proto"), new h() { // from class: com.google.android.gms.internal.mlkit_common.zzsl
                    @Override // nq.h
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    static d zzb(zzsb zzsbVar, zzry zzryVar) {
        return d.h(zzryVar.zze(zzsbVar.zza(), false));
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzrz
    public final void zza(zzry zzryVar) {
        if (this.zzc.zza() != 0) {
            ((i) this.zzb.get()).a(zzb(this.zzc, zzryVar));
            return;
        }
        b bVar = this.zza;
        if (bVar != null) {
            ((i) bVar.get()).a(zzb(this.zzc, zzryVar));
        }
    }
}
