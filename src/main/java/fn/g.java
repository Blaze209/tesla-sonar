package fn;

import java.io.IOException;
import java.io.InputStream;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lfn/g;", "", "<init>", "()V", "Ljava/io/InputStream;", "stream", "", "numBytes", "", "isLittleEndian", "a", "(Ljava/io/InputStream;IZ)I", "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f66061a = new g();

    private g() {
    }

    public static final int a(InputStream stream, int numBytes, boolean isLittleEndian) throws IOException {
        int i11;
        s.k(stream, "stream");
        int i12 = 0;
        for (int i13 = 0; i13 < numBytes; i13++) {
            int i14 = stream.read();
            if (i14 == -1) {
                throw new IOException("no more bytes");
            }
            if (isLittleEndian) {
                i11 = (i14 & 255) << (i13 * 8);
            } else {
                i12 <<= 8;
                i11 = i14 & 255;
            }
            i12 |= i11;
        }
        return i12;
    }
}
