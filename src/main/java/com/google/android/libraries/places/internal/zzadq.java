package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.zzadp;
import com.google.android.libraries.places.internal.zzadq;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzadq<MessageType extends zzadq<MessageType, BuilderType>, BuilderType extends zzadp<MessageType, BuilderType>> implements zzagg {
    protected int zza = 0;

    /* JADX WARN: Multi-variable type inference failed */
    protected static void zzM(Iterable iterable, List list) {
        zzafh.zze(iterable);
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + iterable.size());
        }
        int size = list.size();
        for (Object obj : iterable) {
            if (obj == null) {
                String str = "Element at index " + (list.size() - size) + " is null.";
                int size2 = list.size();
                while (true) {
                    size2--;
                    if (size2 < size) {
                        throw new NullPointerException(str);
                    }
                    list.remove(size2);
                }
            } else {
                list.add(obj);
            }
        }
    }

    int zzr(zzagr zzagrVar) {
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.zzagg
    public final zzaed zzs() {
        try {
            int iZzv = zzv();
            zzaed zzaedVar = zzaed.zzb;
            byte[] bArr = new byte[iZzv];
            zzael zzaelVarZzC = zzael.zzC(bArr);
            zzK(zzaelVarZzC);
            zzaelVarZzC.zzD();
            return new zzaea(bArr);
        } catch (IOException e11) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e11);
        }
    }
}
