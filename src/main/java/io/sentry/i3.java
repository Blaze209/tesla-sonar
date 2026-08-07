package io.sentry;

import java.io.Closeable;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes9.dex */
public interface i3 extends Closeable {
    static Date F0(String str, ILogger iLogger) {
        if (str == null) {
            return null;
        }
        try {
            try {
                return l.f(str);
            } catch (Exception e11) {
                iLogger.a(b7.ERROR, "Error when deserializing millis timestamp format.", e11);
                return null;
            }
        } catch (Exception unused) {
            return l.g(str);
        }
    }

    void F();

    <T> List<T> G1(ILogger iLogger, q1<T> q1Var);

    String L();

    Integer N2();

    String O();

    void P(boolean z11);

    Long R2();

    TimeZone V1(ILogger iLogger);

    <T> Map<String, T> Y2(ILogger iLogger, q1<T> q1Var);

    String a1();

    void a3(ILogger iLogger, Map<String, Object> map, String str);

    void e();

    void f();

    void h();

    boolean hasNext();

    void j();

    Double j2();

    Date m0(ILogger iLogger);

    double nextDouble();

    float nextFloat();

    int nextInt();

    long nextLong();

    Boolean o0();

    Float p1();

    io.sentry.vendor.gson.stream.b peek();

    <T> T v0(ILogger iLogger, q1<T> q1Var);

    Object z3();
}
