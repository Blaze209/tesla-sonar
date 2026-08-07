package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class zzhz extends zzib {
    final /* synthetic */ zzib zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzhz(zzib zzibVar, zzib zzibVar2) {
        super(zzibVar2, null);
        this.zza = zzibVar;
    }

    @Override // com.google.android.libraries.places.internal.zzib
    public final Appendable zzb(Appendable appendable, Iterator it) throws IOException {
        zzig.zzc(it, "parts");
        while (it.hasNext()) {
            Object next = it.next();
            if (next != null) {
                appendable.append(this.zza.zza(next));
                break;
            }
        }
        while (it.hasNext()) {
            Object next2 = it.next();
            if (next2 != null) {
                appendable.append(this.zza.zza);
                appendable.append(this.zza.zza(next2));
            }
        }
        return appendable;
    }
}
