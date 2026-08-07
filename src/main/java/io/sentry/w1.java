package io.sentry;

import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes9.dex */
public final class w1 implements i3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.sentry.vendor.gson.stream.a f81562a;

    public w1(Reader reader) {
        this.f81562a = new io.sentry.vendor.gson.stream.a(reader);
    }

    @Override // io.sentry.i3
    public void F() throws IOException {
        this.f81562a.F();
    }

    @Override // io.sentry.i3
    public <T> List<T> G1(ILogger iLogger, q1<T> q1Var) throws IOException {
        if (this.f81562a.peek() == io.sentry.vendor.gson.stream.b.NULL) {
            this.f81562a.H();
            return null;
        }
        this.f81562a.f();
        ArrayList arrayList = new ArrayList();
        if (this.f81562a.hasNext()) {
            do {
                try {
                    arrayList.add(q1Var.a(this, iLogger));
                } catch (Exception e11) {
                    iLogger.a(b7.WARNING, "Failed to deserialize object in list.", e11);
                }
            } while (this.f81562a.peek() == io.sentry.vendor.gson.stream.b.BEGIN_OBJECT);
        }
        this.f81562a.e();
        return arrayList;
    }

    @Override // io.sentry.i3
    public String L() {
        return this.f81562a.L();
    }

    @Override // io.sentry.i3
    public Integer N2() throws IOException {
        if (this.f81562a.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return Integer.valueOf(this.f81562a.nextInt());
        }
        this.f81562a.H();
        return null;
    }

    @Override // io.sentry.i3
    public String O() {
        return this.f81562a.O();
    }

    @Override // io.sentry.i3
    public void P(boolean z11) {
        this.f81562a.P(z11);
    }

    @Override // io.sentry.i3
    public Long R2() throws IOException {
        if (this.f81562a.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return Long.valueOf(this.f81562a.nextLong());
        }
        this.f81562a.H();
        return null;
    }

    @Override // io.sentry.i3
    public TimeZone V1(ILogger iLogger) throws IOException {
        if (this.f81562a.peek() == io.sentry.vendor.gson.stream.b.NULL) {
            this.f81562a.H();
            return null;
        }
        try {
            return DesugarTimeZone.getTimeZone(this.f81562a.O());
        } catch (Exception e11) {
            iLogger.a(b7.ERROR, "Error when deserializing TimeZone", e11);
            return null;
        }
    }

    @Override // io.sentry.i3
    public <T> Map<String, T> Y2(ILogger iLogger, q1<T> q1Var) throws IOException {
        if (this.f81562a.peek() == io.sentry.vendor.gson.stream.b.NULL) {
            this.f81562a.H();
            return null;
        }
        this.f81562a.h();
        HashMap map = new HashMap();
        if (this.f81562a.hasNext()) {
            while (true) {
                try {
                    map.put(this.f81562a.L(), q1Var.a(this, iLogger));
                } catch (Exception e11) {
                    iLogger.a(b7.WARNING, "Failed to deserialize object in map.", e11);
                }
                if (this.f81562a.peek() != io.sentry.vendor.gson.stream.b.BEGIN_OBJECT && this.f81562a.peek() != io.sentry.vendor.gson.stream.b.NAME) {
                    break;
                }
            }
        }
        this.f81562a.j();
        return map;
    }

    @Override // io.sentry.i3
    public String a1() throws IOException {
        if (this.f81562a.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return this.f81562a.O();
        }
        this.f81562a.H();
        return null;
    }

    @Override // io.sentry.i3
    public void a3(ILogger iLogger, Map<String, Object> map, String str) {
        try {
            map.put(str, z3());
        } catch (Exception e11) {
            iLogger.b(b7.ERROR, e11, "Error deserializing unknown key: %s", str);
        }
    }

    public void c() {
        this.f81562a.H();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f81562a.close();
    }

    @Override // io.sentry.i3
    public void e() {
        this.f81562a.e();
    }

    @Override // io.sentry.i3
    public void f() {
        this.f81562a.f();
    }

    @Override // io.sentry.i3
    public void h() {
        this.f81562a.h();
    }

    @Override // io.sentry.i3
    public boolean hasNext() {
        return this.f81562a.hasNext();
    }

    @Override // io.sentry.i3
    public void j() {
        this.f81562a.j();
    }

    @Override // io.sentry.i3
    public Double j2() throws IOException {
        if (this.f81562a.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return Double.valueOf(this.f81562a.nextDouble());
        }
        this.f81562a.H();
        return null;
    }

    @Override // io.sentry.i3
    public Date m0(ILogger iLogger) throws IOException {
        if (this.f81562a.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return i3.F0(this.f81562a.O(), iLogger);
        }
        this.f81562a.H();
        return null;
    }

    public boolean nextBoolean() {
        return this.f81562a.nextBoolean();
    }

    @Override // io.sentry.i3
    public double nextDouble() {
        return this.f81562a.nextDouble();
    }

    @Override // io.sentry.i3
    public float nextFloat() {
        return (float) this.f81562a.nextDouble();
    }

    @Override // io.sentry.i3
    public int nextInt() {
        return this.f81562a.nextInt();
    }

    @Override // io.sentry.i3
    public long nextLong() {
        return this.f81562a.nextLong();
    }

    @Override // io.sentry.i3
    public Boolean o0() throws IOException {
        if (this.f81562a.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return Boolean.valueOf(this.f81562a.nextBoolean());
        }
        this.f81562a.H();
        return null;
    }

    @Override // io.sentry.i3
    public Float p1() throws IOException {
        if (this.f81562a.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return Float.valueOf(nextFloat());
        }
        this.f81562a.H();
        return null;
    }

    @Override // io.sentry.i3
    public io.sentry.vendor.gson.stream.b peek() {
        return this.f81562a.peek();
    }

    @Override // io.sentry.i3
    public <T> T v0(ILogger iLogger, q1<T> q1Var) throws IOException {
        if (this.f81562a.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return q1Var.a(this, iLogger);
        }
        this.f81562a.H();
        return null;
    }

    @Override // io.sentry.i3
    public Object z3() {
        return new v1().e(this);
    }
}
