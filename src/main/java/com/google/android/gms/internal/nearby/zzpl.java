package com.google.android.gms.internal.nearby;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzpl implements Serializable {
    zzpl() {
    }

    public static zzpl zzc() {
        return zzph.zza;
    }

    public static zzpl zzd(Object obj) {
        obj.getClass();
        return new zzpn(obj);
    }

    public abstract Object zza();

    public abstract boolean zzb();
}
