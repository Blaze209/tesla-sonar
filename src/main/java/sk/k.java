package sk;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f111331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f111332b;

    public k(a aVar) {
        this(aVar, 16384);
    }

    public long a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = this.f111332b.get(this.f111331a);
        long j11 = 0;
        while (true) {
            try {
                int i11 = inputStream.read(bArr, 0, this.f111331a);
                if (i11 == -1) {
                    this.f111332b.a(bArr);
                    return j11;
                }
                outputStream.write(bArr, 0, i11);
                j11 += (long) i11;
            } catch (Throwable th2) {
                this.f111332b.a(bArr);
                throw th2;
            }
        }
    }

    public k(a aVar, int i11) {
        pk.k.b(Boolean.valueOf(i11 > 0));
        this.f111331a = i11;
        this.f111332b = aVar;
    }
}
