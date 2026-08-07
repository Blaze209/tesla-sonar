package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zzagb {
    zzagb() {
    }

    public static final int zza(int i11, Object obj, Object obj2) {
        zzaga zzagaVar = (zzaga) obj;
        if (zzagaVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzagaVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }
}
