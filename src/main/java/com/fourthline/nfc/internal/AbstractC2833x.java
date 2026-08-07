package com.fourthline.nfc.internal;

/* JADX INFO: renamed from: com.fourthline.nfc.internal.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2833x {
    public static final int a(byte[] bArr, byte[] tag) {
        p013kotlin.jvm.internal.s.k(bArr, "<this>");
        p013kotlin.jvm.internal.s.k(tag, "tag");
        if (tag.length == 0) {
            return 0;
        }
        int length = (bArr.length - tag.length) + 1;
        for (int i11 = 0; i11 < length; i11++) {
            int length2 = tag.length;
            for (int i12 = 0; i12 < length2; i12++) {
                if (bArr[i11 + i12] == tag[i12]) {
                }
            }
            return i11;
        }
        return -1;
    }
}
