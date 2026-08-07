package com.google.android.gms.internal.mlkit_vision_document_scanner;

import androidx.annotation.NonNull;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import rv.c;

/* JADX INFO: loaded from: classes5.dex */
public final class zzau {
    private final Map zza;
    private final Map zzb;
    private final c zzc;

    zzau(Map map, Map map2, c cVar) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = cVar;
    }

    @NonNull
    public final byte[] zza(@NonNull Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new zzar(byteArrayOutputStream, this.zza, this.zzb, this.zzc).zzf(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
