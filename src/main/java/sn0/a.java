package sn0;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0000H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ljava/io/InputStream;", "Ljava/io/OutputStream;", "out", "", "bufferSize", "", "a", "(Ljava/io/InputStream;Ljava/io/OutputStream;I)J", "", "c", "(Ljava/io/InputStream;)[B", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a {
    public static final long a(InputStream inputStream, OutputStream out, int i11) throws IOException {
        s.k(inputStream, "<this>");
        s.k(out, "out");
        byte[] bArr = new byte[i11];
        int i12 = inputStream.read(bArr);
        long j11 = 0;
        while (i12 >= 0) {
            out.write(bArr, 0, i12);
            j11 += (long) i12;
            i12 = inputStream.read(bArr);
        }
        return j11;
    }

    public static /* synthetic */ long b(InputStream inputStream, OutputStream outputStream, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = PKIFailureInfo.certRevoked;
        }
        return a(inputStream, outputStream, i11);
    }

    public static final byte[] c(InputStream inputStream) {
        s.k(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(PKIFailureInfo.certRevoked, inputStream.available()));
        b(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        s.j(byteArray, "toByteArray(...)");
        return byteArray;
    }
}
