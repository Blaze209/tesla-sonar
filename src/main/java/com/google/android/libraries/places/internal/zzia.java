package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class zzia {
    public static final Appendable zza(Appendable appendable, Iterator it, zzib zzibVar, String str) throws IOException {
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            appendable.append(zzibVar.zza(entry.getKey()));
            appendable.append("=");
            appendable.append(zzibVar.zza(entry.getValue()));
            while (it.hasNext()) {
                appendable.append(zzibVar.zza);
                Map.Entry entry2 = (Map.Entry) it.next();
                appendable.append(zzibVar.zza(entry2.getKey()));
                appendable.append("=");
                appendable.append(zzibVar.zza(entry2.getValue()));
            }
        }
        return appendable;
    }
}
