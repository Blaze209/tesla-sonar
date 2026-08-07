package com.google.android.libraries.places.internal;

import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
final class zzadv implements Comparator {
    zzadv() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzaed zzaedVar = (zzaed) obj;
        zzaed zzaedVar2 = (zzaed) obj2;
        zzadu zzaduVar = new zzadu(zzaedVar);
        zzadu zzaduVar2 = new zzadu(zzaedVar2);
        while (zzaduVar.hasNext() && zzaduVar2.hasNext()) {
            int iCompareTo = Integer.valueOf(zzaduVar.zza() & 255).compareTo(Integer.valueOf(zzaduVar2.zza() & 255));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Integer.valueOf(zzaedVar.zzd()).compareTo(Integer.valueOf(zzaedVar2.zzd()));
    }
}
