package okio;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\t\u001a\u00020\u0001*\u00020\b¢\u0006\u0004\b\t\u0010\n\u001a\u0011\u0010\u000b\u001a\u00020\u0005*\u00020\b¢\u0006\u0004\b\u000b\u0010\f\u001a\u001d\u0010\u0010\u001a\u00020\u0001*\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0011\u0010\u0012\u001a\u00020\u0001*\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0014\u001a\u00020\u0005*\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015\"\u001c\u0010\u001a\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\"\u001c\u0010\u001f\u001a\u00020\u000e*\u00060\u001bj\u0002`\u001c8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Ljava/io/OutputStream;", "Lokio/p0;", "f", "(Ljava/io/OutputStream;)Lokio/p0;", "Ljava/io/InputStream;", "Lokio/r0;", "j", "(Ljava/io/InputStream;)Lokio/r0;", "Ljava/net/Socket;", "g", "(Ljava/net/Socket;)Lokio/p0;", "k", "(Ljava/net/Socket;)Lokio/r0;", "Ljava/io/File;", "", "append", "e", "(Ljava/io/File;Z)Lokio/p0;", "b", "(Ljava/io/File;)Lokio/p0;", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/io/File;)Lokio/r0;", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "a", "Ljava/util/logging/Logger;", "logger", "Ljava/lang/AssertionError;", "Lkotlin/AssertionError;", "c", "(Ljava/lang/AssertionError;)Z", "isAndroidGetsocknameError", "okio"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "okio/Okio")
final /* synthetic */ class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f97910a = Logger.getLogger("okio.Okio");

    public static final p0 b(File file) {
        p013kotlin.jvm.internal.s.k(file, "<this>");
        return c0.i(new FileOutputStream(file, true));
    }

    public static final boolean c(AssertionError assertionError) {
        p013kotlin.jvm.internal.s.k(assertionError, "<this>");
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? p013kotlin.text.t.h0(message, "getsockname failed", false, 2, null) : false) {
                return true;
            }
        }
        return false;
    }

    public static final p0 d(File file) {
        p013kotlin.jvm.internal.s.k(file, "<this>");
        return h(file, false, 1, null);
    }

    public static final p0 e(File file, boolean z11) {
        p013kotlin.jvm.internal.s.k(file, "<this>");
        return c0.i(new FileOutputStream(file, z11));
    }

    public static final p0 f(OutputStream outputStream) {
        p013kotlin.jvm.internal.s.k(outputStream, "<this>");
        return new sink(outputStream, new s0());
    }

    public static final p0 g(Socket socket) throws IOException {
        p013kotlin.jvm.internal.s.k(socket, "<this>");
        q0 q0Var = new q0(socket);
        OutputStream outputStream = socket.getOutputStream();
        p013kotlin.jvm.internal.s.j(outputStream, "getOutputStream(...)");
        return q0Var.sink(new sink(outputStream, q0Var));
    }

    public static /* synthetic */ p0 h(File file, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return c0.h(file, z11);
    }

    public static final r0 i(File file) {
        p013kotlin.jvm.internal.s.k(file, "<this>");
        return new source(new FileInputStream(file), s0.NONE);
    }

    public static final r0 j(InputStream inputStream) {
        p013kotlin.jvm.internal.s.k(inputStream, "<this>");
        return new source(inputStream, new s0());
    }

    public static final r0 k(Socket socket) throws IOException {
        p013kotlin.jvm.internal.s.k(socket, "<this>");
        q0 q0Var = new q0(socket);
        InputStream inputStream = socket.getInputStream();
        p013kotlin.jvm.internal.s.j(inputStream, "getInputStream(...)");
        return q0Var.source(new source(inputStream, q0Var));
    }
}
