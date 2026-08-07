package com.fourthline.core.internal;

import java.security.MessageDigest;
import java.util.Arrays;
import p013kotlin.Metadata;
import p013kotlin.collections.n;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0002\b\u0004\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\f\u0010\u0004\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\f\u0010\u0005\u001a\u00020\u0001*\u00020\u0001H\u0007¨\u0006\u0006"}, d2 = {"sha256", "", "", "md5", "toHex", "alpha3Code", "fourthline-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ExtensionsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence a(byte b11) {
        String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b11)}, 1));
        s.j(str, "format(...)");
        return str;
    }

    public static final String alpha3Code(String str) {
        s.k(str, "<this>");
        return s.f(str, "D") ? "DEU" : str;
    }

    public static final String md5(byte[] bArr) {
        s.k(bArr, "<this>");
        byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(bArr);
        s.j(bArrDigest, "digest(...)");
        return toHex(bArrDigest);
    }

    public static final String sha256(byte[] bArr) {
        s.k(bArr, "<this>");
        byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(bArr);
        s.j(bArrDigest, "digest(...)");
        return toHex(bArrDigest);
    }

    public static final String toHex(byte[] bArr) {
        s.k(bArr, "<this>");
        return n.P0(bArr, "", null, null, 0, null, new l() { // from class: com.fourthline.core.internal.a
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return ExtensionsKt.a(((Byte) obj).byteValue());
            }
        }, 30, null);
    }
}
