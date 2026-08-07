package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.annotation.NonNull;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes5.dex */
final class zzfb extends OutputStream {
    private long zza = 0;

    zzfb() {
    }

    @Override // java.io.OutputStream
    public final void write(int i11) {
        this.zza++;
    }

    final long zza() {
        return this.zza;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.zza += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(@NonNull byte[] bArr, int i11, int i12) {
        int length;
        int i13;
        if (i11 >= 0 && i11 <= (length = bArr.length) && i12 >= 0 && (i13 = i11 + i12) <= length && i13 >= 0) {
            this.zza += (long) i12;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
