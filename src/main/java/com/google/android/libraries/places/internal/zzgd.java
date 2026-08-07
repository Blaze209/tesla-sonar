package com.google.android.libraries.places.internal;

import android.content.Context;
import java.io.IOException;
import nq.d;
import nq.h;
import nq.i;
import pq.u;

/* JADX INFO: loaded from: classes5.dex */
public final class zzgd {
    private final i zza;

    public zzgd(Context context) {
        u.f(context.getApplicationContext());
        this.zza = u.c().g("cct").b("LE", zzmn.class, new h() { // from class: com.google.android.libraries.places.internal.zzgc
            @Override // nq.h
            public final Object apply(Object obj) {
                zzmn zzmnVar = (zzmn) obj;
                try {
                    byte[] bArr = new byte[zzmnVar.zzv()];
                    zzael zzaelVarZzC = zzael.zzC(bArr);
                    zzmnVar.zzK(zzaelVarZzC);
                    zzaelVarZzC.zzD();
                    return bArr;
                } catch (IOException e11) {
                    throw new RuntimeException("Serializing " + zzmnVar.getClass().getName() + " to a byte array threw an IOException (should never happen).", e11);
                }
            }
        });
    }

    public final void zza(zzmn zzmnVar) {
        this.zza.a(d.f(zzmnVar));
    }
}
