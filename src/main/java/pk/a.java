package pk;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static long a(InputStream inputStream, OutputStream outputStream) throws IOException {
        k.g(inputStream);
        k.g(outputStream);
        byte[] bArr = new byte[4096];
        long j11 = 0;
        while (true) {
            int i11 = inputStream.read(bArr);
            if (i11 == -1) {
                return j11;
            }
            outputStream.write(bArr, 0, i11);
            j11 += (long) i11;
        }
    }

    public static int b(InputStream inputStream, byte[] bArr, int i11, int i12) throws IOException {
        k.g(inputStream);
        k.g(bArr);
        if (i12 < 0) {
            throw new IndexOutOfBoundsException("len is negative");
        }
        int i13 = 0;
        while (i13 < i12) {
            int i14 = inputStream.read(bArr, i11 + i13, i12 - i13);
            if (i14 == -1) {
                break;
            }
            i13 += i14;
        }
        return i13;
    }
}
