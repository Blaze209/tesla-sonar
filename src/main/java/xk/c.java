package xk;

import java.io.IOException;
import java.io.InputStream;
import pk.k;

/* JADX INFO: loaded from: classes3.dex */
public class c {
    public static long a(InputStream inputStream, long j11) throws IOException {
        k.g(inputStream);
        k.b(Boolean.valueOf(j11 >= 0));
        long j12 = j11;
        while (j12 > 0) {
            long jSkip = inputStream.skip(j12);
            if (jSkip <= 0) {
                if (inputStream.read() == -1) {
                    return j11 - j12;
                }
                jSkip = 1;
            }
            j12 -= jSkip;
        }
        return j11;
    }
}
