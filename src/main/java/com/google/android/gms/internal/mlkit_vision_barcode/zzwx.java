package com.google.android.gms.internal.mlkit_vision_barcode;

import android.content.Context;
import nq.c;
import nq.d;
import nq.h;
import nq.i;
import nq.j;
import pq.u;
import yu.t;
import yv.b;

/* JADX INFO: loaded from: classes5.dex */
public final class zzwx implements zzwf {
    private b zza;
    private final b zzb;
    private final zzwh zzc;

    public zzwx(Context context, zzwh zzwhVar) {
        this.zzc = zzwhVar;
        com.google.android.datatransport.cct.a aVar = com.google.android.datatransport.cct.a.f39356g;
        u.f(context);
        final j jVarH = u.c().h(aVar);
        if (aVar.a().contains(c.b("json"))) {
            this.zza = new t(new b() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwu
                @Override // yv.b
                public final Object get() {
                    return jVarH.a("FIREBASE_ML_SDK", byte[].class, c.b("json"), new h() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzww
                        @Override // nq.h
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.zzb = new t(new b() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwv
            @Override // yv.b
            public final Object get() {
                return jVarH.a("FIREBASE_ML_SDK", byte[].class, c.b("proto"), new h() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwt
                    @Override // nq.h
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    static d zzb(zzwh zzwhVar, zzwe zzweVar) {
        int iZza = zzwhVar.zza();
        return zzweVar.zza() != 0 ? d.f(zzweVar.zze(iZza, false)) : d.h(zzweVar.zze(iZza, false));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwf
    public final void zza(zzwe zzweVar) {
        if (this.zzc.zza() != 0) {
            ((i) this.zzb.get()).a(zzb(this.zzc, zzweVar));
            return;
        }
        b bVar = this.zza;
        if (bVar != null) {
            ((i) bVar.get()).a(zzb(this.zzc, zzweVar));
        }
    }
}
