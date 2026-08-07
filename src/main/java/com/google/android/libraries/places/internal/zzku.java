package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class zzku {
    private static final zzkq zza = new zzks();
    private static final zzkp zzb = new zzkt();

    public static zzkm zza(Set set) {
        zzkm zzkmVar = new zzkm(zza, null);
        zzkmVar.zza(zzb);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzkmVar.zzg((zzkd) it.next());
        }
        return zzkmVar;
    }
}
