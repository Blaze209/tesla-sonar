package okio;

import java.io.InputStream;
import java.io.OutputStream;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@jn0.e
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lokio/b;", "", "<init>", "()V", "Lokio/p0;", "sink", "Lokio/i;", "a", "(Lokio/p0;)Lokio/i;", "Ljava/io/OutputStream;", "outputStream", "b", "(Ljava/io/OutputStream;)Lokio/p0;", "Ljava/io/InputStream;", "inputStream", "Lokio/r0;", "c", "(Ljava/io/InputStream;)Lokio/r0;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f97906a = new b();

    private b() {
    }

    @jn0.e
    public final i a(p0 sink) {
        p013kotlin.jvm.internal.s.k(sink, "sink");
        return c0.c(sink);
    }

    @jn0.e
    public final p0 b(OutputStream outputStream) {
        p013kotlin.jvm.internal.s.k(outputStream, "outputStream");
        return c0.i(outputStream);
    }

    @jn0.e
    public final r0 c(InputStream inputStream) {
        p013kotlin.jvm.internal.s.k(inputStream, "inputStream");
        return c0.m(inputStream);
    }
}
