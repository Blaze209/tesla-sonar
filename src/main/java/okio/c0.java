package okio;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"okio/d0", "okio/e0", "okio/f0"}, d2 = {}, k = 4, mv = {2, 1, 0}, xi = 48)
public final class c0 {
    public static final p0 a(File file) {
        return d0.b(file);
    }

    public static final p0 b() {
        return e0.a();
    }

    public static final i c(p0 p0Var) {
        return e0.b(p0Var);
    }

    public static final j d(r0 r0Var) {
        return e0.c(r0Var);
    }

    public static final boolean e(AssertionError assertionError) {
        return d0.c(assertionError);
    }

    public static final o f(o oVar, i0 i0Var) {
        return f0.a(oVar, i0Var);
    }

    public static final p0 g(File file) {
        return d0.d(file);
    }

    public static final p0 h(File file, boolean z11) {
        return d0.e(file, z11);
    }

    public static final p0 i(OutputStream outputStream) {
        return d0.f(outputStream);
    }

    public static final p0 j(Socket socket) {
        return d0.g(socket);
    }

    public static final r0 l(File file) {
        return d0.i(file);
    }

    public static final r0 m(InputStream inputStream) {
        return d0.j(inputStream);
    }

    public static final r0 n(Socket socket) {
        return d0.k(socket);
    }
}
