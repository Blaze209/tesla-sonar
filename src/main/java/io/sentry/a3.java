package io.sentry;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
final class a3 implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a3 f79222a = new a3();

    private a3() {
    }

    public static a3 g() {
        return f79222a;
    }

    @Override // io.sentry.e1
    public <T> void a(T t11, Writer writer) {
    }

    @Override // io.sentry.e1
    public void b(p5 p5Var, OutputStream outputStream) {
    }

    @Override // io.sentry.e1
    public <T> T c(Reader reader, Class<T> cls) {
        return null;
    }

    @Override // io.sentry.e1
    public <T, R> T d(Reader reader, Class<T> cls, q1<R> q1Var) {
        return null;
    }

    @Override // io.sentry.e1
    public p5 e(InputStream inputStream) {
        return null;
    }

    @Override // io.sentry.e1
    public String f(Map<String, Object> map) {
        return "";
    }
}
