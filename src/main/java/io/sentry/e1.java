package io.sentry;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public interface e1 {
    <T> void a(T t11, Writer writer);

    void b(p5 p5Var, OutputStream outputStream);

    <T> T c(Reader reader, Class<T> cls);

    <T, R> T d(Reader reader, Class<T> cls, q1<R> q1Var);

    p5 e(InputStream inputStream);

    String f(Map<String, Object> map);
}
