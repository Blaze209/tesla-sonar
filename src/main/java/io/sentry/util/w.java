package io.sentry.util;

import io.sentry.ILogger;
import io.sentry.b7;
import io.sentry.i3;
import io.sentry.q1;
import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes9.dex */
public final class w implements i3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Deque<Map.Entry<String, Object>> f81485a;

    public w(Map<String, Object> map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f81485a = arrayDeque;
        arrayDeque.addLast(new AbstractMap.SimpleEntry(null, map));
    }

    private <T> T n() throws IOException {
        try {
            return (T) o(null, null);
        } catch (Exception e11) {
            throw new IOException(e11);
        }
    }

    private <T> T o(ILogger iLogger, q1<T> q1Var) {
        Map.Entry<String, Object> entryPeekLast = this.f81485a.peekLast();
        if (entryPeekLast == null) {
            return null;
        }
        T t11 = (T) entryPeekLast.getValue();
        if (q1Var != null && iLogger != null) {
            return q1Var.a(this, iLogger);
        }
        this.f81485a.removeLast();
        return t11;
    }

    @Override // io.sentry.i3
    public void F() {
    }

    @Override // io.sentry.i3
    public <T> List<T> G1(ILogger iLogger, q1<T> q1Var) throws IOException {
        if (peek() == io.sentry.vendor.gson.stream.b.NULL) {
            c();
            return null;
        }
        try {
            f();
            ArrayList arrayList = new ArrayList();
            if (hasNext()) {
                do {
                    try {
                        arrayList.add(q1Var.a(this, iLogger));
                    } catch (Exception e11) {
                        iLogger.a(b7.WARNING, "Failed to deserialize object in list.", e11);
                    }
                } while (peek() == io.sentry.vendor.gson.stream.b.BEGIN_OBJECT);
            }
            e();
            return arrayList;
        } catch (Exception e12) {
            throw new IOException(e12);
        }
    }

    @Override // io.sentry.i3
    public String L() throws IOException {
        Map.Entry<String, Object> entryPeekLast = this.f81485a.peekLast();
        if (entryPeekLast != null && entryPeekLast.getKey() != null) {
            return entryPeekLast.getKey();
        }
        throw new IOException("Expected a name but was " + peek());
    }

    @Override // io.sentry.i3
    public Integer N2() throws IOException {
        Object objN = n();
        if (objN instanceof Number) {
            return Integer.valueOf(((Number) objN).intValue());
        }
        return null;
    }

    @Override // io.sentry.i3
    public String O() throws IOException {
        String str = (String) n();
        if (str != null) {
            return str;
        }
        throw new IOException("Expected string");
    }

    @Override // io.sentry.i3
    public void P(boolean z11) {
    }

    @Override // io.sentry.i3
    public Long R2() throws IOException {
        Object objN = n();
        if (objN instanceof Number) {
            return Long.valueOf(((Number) objN).longValue());
        }
        return null;
    }

    @Override // io.sentry.i3
    public TimeZone V1(ILogger iLogger) {
        String strA1 = a1();
        if (strA1 != null) {
            return DesugarTimeZone.getTimeZone(strA1);
        }
        return null;
    }

    @Override // io.sentry.i3
    public <T> Map<String, T> Y2(ILogger iLogger, q1<T> q1Var) throws IOException {
        if (peek() == io.sentry.vendor.gson.stream.b.NULL) {
            c();
            return null;
        }
        try {
            h();
            HashMap map = new HashMap();
            if (hasNext()) {
                while (true) {
                    try {
                        map.put(L(), q1Var.a(this, iLogger));
                    } catch (Exception e11) {
                        iLogger.a(b7.WARNING, "Failed to deserialize object in map.", e11);
                    }
                    if (peek() != io.sentry.vendor.gson.stream.b.BEGIN_OBJECT && peek() != io.sentry.vendor.gson.stream.b.NAME) {
                        break;
                    }
                }
            }
            j();
            return map;
        } catch (Exception e12) {
            throw new IOException(e12);
        }
    }

    @Override // io.sentry.i3
    public String a1() {
        return (String) n();
    }

    @Override // io.sentry.i3
    public void a3(ILogger iLogger, Map<String, Object> map, String str) {
        try {
            map.put(str, z3());
        } catch (Exception e11) {
            iLogger.b(b7.ERROR, e11, "Error deserializing unknown key: %s", str);
        }
    }

    public void c() throws IOException {
        if (n() == null) {
            return;
        }
        throw new IOException("Expected null but was " + peek());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f81485a.clear();
    }

    @Override // io.sentry.i3
    public void e() {
        if (this.f81485a.size() > 1) {
            this.f81485a.removeLast();
        }
    }

    @Override // io.sentry.i3
    public void f() throws IOException {
        Map.Entry<String, Object> entryRemoveLast = this.f81485a.removeLast();
        if (entryRemoveLast == null) {
            throw new IOException("No more entries");
        }
        Object value = entryRemoveLast.getValue();
        if (!(value instanceof List)) {
            throw new IOException("Current token is not an object");
        }
        this.f81485a.addLast(new AbstractMap.SimpleEntry(null, io.sentry.vendor.gson.stream.b.END_ARRAY));
        List list = (List) value;
        for (int size = list.size() - 1; size >= 0; size--) {
            this.f81485a.addLast(new AbstractMap.SimpleEntry(null, list.get(size)));
        }
    }

    @Override // io.sentry.i3
    public void h() throws IOException {
        Map.Entry<String, Object> entryRemoveLast = this.f81485a.removeLast();
        if (entryRemoveLast == null) {
            throw new IOException("No more entries");
        }
        Object value = entryRemoveLast.getValue();
        if (!(value instanceof Map)) {
            throw new IOException("Current token is not an object");
        }
        this.f81485a.addLast(new AbstractMap.SimpleEntry(null, io.sentry.vendor.gson.stream.b.END_OBJECT));
        Iterator it = ((Map) value).entrySet().iterator();
        while (it.hasNext()) {
            this.f81485a.addLast((Map.Entry) it.next());
        }
    }

    @Override // io.sentry.i3
    public boolean hasNext() {
        return !this.f81485a.isEmpty();
    }

    @Override // io.sentry.i3
    public void j() {
        if (this.f81485a.size() > 1) {
            this.f81485a.removeLast();
        }
    }

    @Override // io.sentry.i3
    public Double j2() throws IOException {
        Object objN = n();
        if (objN instanceof Number) {
            return Double.valueOf(((Number) objN).doubleValue());
        }
        return null;
    }

    @Override // io.sentry.i3
    public Date m0(ILogger iLogger) {
        return i3.F0(a1(), iLogger);
    }

    @Override // io.sentry.i3
    public double nextDouble() throws IOException {
        Object objN = n();
        if (objN instanceof Number) {
            return ((Number) objN).doubleValue();
        }
        throw new IOException("Expected double");
    }

    @Override // io.sentry.i3
    public float nextFloat() throws IOException {
        Object objN = n();
        if (objN instanceof Number) {
            return ((Number) objN).floatValue();
        }
        throw new IOException("Expected float");
    }

    @Override // io.sentry.i3
    public int nextInt() throws IOException {
        Object objN = n();
        if (objN instanceof Number) {
            return ((Number) objN).intValue();
        }
        throw new IOException("Expected int");
    }

    @Override // io.sentry.i3
    public long nextLong() throws IOException {
        Object objN = n();
        if (objN instanceof Number) {
            return ((Number) objN).longValue();
        }
        throw new IOException("Expected long");
    }

    @Override // io.sentry.i3
    public Boolean o0() {
        return (Boolean) n();
    }

    @Override // io.sentry.i3
    public Float p1() throws IOException {
        Object objN = n();
        if (objN instanceof Number) {
            return Float.valueOf(((Number) objN).floatValue());
        }
        return null;
    }

    @Override // io.sentry.i3
    public io.sentry.vendor.gson.stream.b peek() {
        if (this.f81485a.isEmpty()) {
            return io.sentry.vendor.gson.stream.b.END_DOCUMENT;
        }
        Map.Entry<String, Object> entryPeekLast = this.f81485a.peekLast();
        if (entryPeekLast == null) {
            return io.sentry.vendor.gson.stream.b.END_DOCUMENT;
        }
        if (entryPeekLast.getKey() != null) {
            return io.sentry.vendor.gson.stream.b.NAME;
        }
        Object value = entryPeekLast.getValue();
        if (value instanceof Map) {
            return io.sentry.vendor.gson.stream.b.BEGIN_OBJECT;
        }
        if (value instanceof List) {
            return io.sentry.vendor.gson.stream.b.BEGIN_ARRAY;
        }
        if (value instanceof String) {
            return io.sentry.vendor.gson.stream.b.STRING;
        }
        if (value instanceof Number) {
            return io.sentry.vendor.gson.stream.b.NUMBER;
        }
        if (value instanceof Boolean) {
            return io.sentry.vendor.gson.stream.b.BOOLEAN;
        }
        return value instanceof io.sentry.vendor.gson.stream.b ? (io.sentry.vendor.gson.stream.b) value : io.sentry.vendor.gson.stream.b.END_DOCUMENT;
    }

    @Override // io.sentry.i3
    public <T> T v0(ILogger iLogger, q1<T> q1Var) {
        return (T) o(iLogger, q1Var);
    }

    @Override // io.sentry.i3
    public Object z3() {
        return n();
    }
}
