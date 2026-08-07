package com.google.android.gms.internal.mlkit_vision_document_scanner;

import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
final class zzag extends zzz {
    final transient Object[] zza;

    private zzag(Object obj, Object[] objArr, int i11) {
        this.zza = objArr;
    }

    static zzag zzg(int i11, Object[] objArr, zzy zzyVar) {
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[1];
        Objects.requireNonNull(obj2);
        zzq.zza(obj, obj2);
        return new zzag(null, objArr, 1);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzz, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            Object[] objArr = this.zza;
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            if (obj3.equals(obj)) {
                obj2 = objArr[1];
                Objects.requireNonNull(obj2);
            } else {
                obj2 = null;
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return 1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzz
    final zzaa zzc() {
        return new zzad(this, this.zza, 0, 1);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzz
    final zzaa zzd() {
        return new zzae(this, new zzaf(this.zza, 0, 1));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzz
    final zzt zzf() {
        return new zzaf(this.zza, 1, 1);
    }
}
