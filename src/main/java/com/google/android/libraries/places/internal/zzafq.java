package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class zzafq extends zzafu {
    private static final Class zza = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    /* synthetic */ zzafq(zzafp zzafpVar) {
        super(null);
    }

    @Override // com.google.android.libraries.places.internal.zzafu
    final void zza(Object obj, long j11) {
        Object objUnmodifiableList;
        List list = (List) zzahs.zzf(obj, j11);
        if (list instanceof zzafo) {
            objUnmodifiableList = ((zzafo) list).zzd();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzagn) && (list instanceof zzafg)) {
                zzafg zzafgVar = (zzafg) list;
                if (zzafgVar.zzc()) {
                    zzafgVar.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        zzahs.zzs(obj, j11, objUnmodifiableList);
    }

    @Override // com.google.android.libraries.places.internal.zzafu
    final void zzb(Object obj, Object obj2, long j11) {
        List list;
        List list2;
        List listZzf;
        List list3 = (List) zzahs.zzf(obj2, j11);
        int size = list3.size();
        List list4 = (List) zzahs.zzf(obj, j11);
        if (list4.isEmpty()) {
            if (list4 instanceof zzafo) {
                listZzf = new zzafn(size);
            } else {
                listZzf = ((list4 instanceof zzagn) && (list4 instanceof zzafg)) ? ((zzafg) list4).zzf(size) : new ArrayList(size);
            }
            zzahs.zzs(obj, j11, listZzf);
            list2 = listZzf;
        } else {
            if (zza.isAssignableFrom(list4.getClass())) {
                ArrayList arrayList = new ArrayList(list4.size() + size);
                arrayList.addAll(list4);
                zzahs.zzs(obj, j11, arrayList);
                list = arrayList;
            } else if (list4 instanceof zzahn) {
                zzafn zzafnVar = new zzafn(list4.size() + size);
                zzafnVar.addAll(zzafnVar.size(), (zzahn) list4);
                zzahs.zzs(obj, j11, zzafnVar);
                list = zzafnVar;
            } else if ((list4 instanceof zzagn) && (list4 instanceof zzafg)) {
                zzafg zzafgVar = (zzafg) list4;
                if (!zzafgVar.zzc()) {
                    list2 = list4;
                    list2 = list4;
                    list2 = list4;
                    zzafg zzafgVarZzf = zzafgVar.zzf(list4.size() + size);
                    zzahs.zzs(obj, j11, zzafgVarZzf);
                    list2 = zzafgVarZzf;
                }
            }
            list2 = list;
        }
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        int size2 = list2.size();
        int size3 = list3.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list3);
        }
        if (size2 > 0) {
            list3 = list2;
        }
        zzahs.zzs(obj, j11, list3);
    }

    private zzafq() {
        super(null);
    }
}
