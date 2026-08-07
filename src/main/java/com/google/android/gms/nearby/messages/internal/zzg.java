package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ArrayUtils;

/* JADX INFO: loaded from: classes5.dex */
public final class zzg extends zzc {
    /* JADX WARN: Illegal instructions before constructor call */
    public zzg(String str, String str2) {
        byte[] bArrZzd = zzc.zzd(str);
        int length = bArrZzd.length;
        byte[] bArrZzd2 = zzc.zzd(str2);
        Preconditions.checkArgument(length == 10, "Namespace length(" + length + " bytes) must be 10 bytes.");
        int length2 = bArrZzd2.length;
        Preconditions.checkArgument(length2 == 6, "Instance length(" + length2 + " bytes) must be 6 bytes.");
        byte[] bArrConcatByteArrays = ArrayUtils.concatByteArrays(bArrZzd, bArrZzd2);
        zze(bArrConcatByteArrays);
        super(bArrConcatByteArrays);
    }

    private static byte[] zze(byte[] bArr) {
        int length = bArr.length;
        boolean z11 = true;
        if (length != 10 && length != 16) {
            z11 = false;
        }
        Preconditions.checkArgument(z11, "Bytes must be a namespace (10 bytes), or a namespace plus instance (16 bytes).");
        return bArr;
    }

    @Override // com.google.android.gms.nearby.messages.internal.zzc
    public final String toString() {
        return "EddystoneUidPrefix{bytes=" + zza() + "}";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzg(byte[] bArr) {
        super(bArr);
        zze(bArr);
    }
}
