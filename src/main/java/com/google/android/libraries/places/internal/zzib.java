package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public class zzib {
    private final String zza;

    public static zzib zzc(String str) {
        return new zzib(str);
    }

    CharSequence zza(Object obj) {
        obj.getClass();
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public Appendable zzb(Appendable appendable, Iterator it) throws IOException {
        if (it.hasNext()) {
            appendable.append(zza(it.next()));
            while (it.hasNext()) {
                appendable.append(this.zza);
                appendable.append(zza(it.next()));
            }
        }
        return appendable;
    }

    public final zzib zzd() {
        return new zzhz(this, this);
    }

    public final String zzf(Iterable iterable) {
        Iterator it = iterable.iterator();
        StringBuilder sb2 = new StringBuilder();
        try {
            zzb(sb2, it);
            return sb2.toString();
        } catch (IOException e11) {
            throw new AssertionError(e11);
        }
    }

    private zzib(String str) {
        this.zza = str;
    }
}
