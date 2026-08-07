package nz;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes6.dex */
public class a {
    public static byte[] a(jz.l lVar) {
        return b(lVar.h());
    }

    public static byte[] b(yz.c cVar) {
        return cVar.toString().getBytes(StandardCharsets.US_ASCII);
    }

    public static byte[] c(byte[] bArr) {
        return ByteBuffer.allocate(8).putLong(yz.e.f(bArr)).array();
    }
}
