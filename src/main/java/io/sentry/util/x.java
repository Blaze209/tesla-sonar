package io.sentry.util;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.b7;
import io.sentry.j3;
import java.net.InetAddress;
import java.net.URI;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: loaded from: classes9.dex */
public final class x implements j3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map<String, Object> f81486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ArrayDeque<Object> f81487b;

    public x(Map<String, Object> map) {
        this.f81486a = map;
        ArrayDeque<Object> arrayDeque = new ArrayDeque<>();
        this.f81487b = arrayDeque;
        arrayDeque.addLast(map);
    }

    private Map<String, Object> k() {
        Object objPeekLast = this.f81487b.peekLast();
        if (objPeekLast == null) {
            throw new IllegalStateException("Stack is empty.");
        }
        if (objPeekLast instanceof Map) {
            return (Map) objPeekLast;
        }
        throw new IllegalStateException("Stack element is not a Map.");
    }

    private void l(Object obj) {
        Object objPeekLast = this.f81487b.peekLast();
        if (objPeekLast instanceof List) {
            ((List) objPeekLast).add(obj);
        } else {
            if (!(objPeekLast instanceof String)) {
                throw new IllegalStateException("Invalid stack state, expected array or string on top");
            }
            k().put((String) this.f81487b.removeLast(), obj);
        }
    }

    private void m(ILogger iLogger, Collection<?> collection) {
        f();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            V(iLogger, it.next());
        }
        e();
    }

    private void n(ILogger iLogger, Date date) {
        try {
            w(io.sentry.l.h(date));
        } catch (Exception e11) {
            iLogger.a(b7.ERROR, "Error when serializing Date", e11);
            R();
        }
    }

    private void o(ILogger iLogger, Map<?, ?> map) {
        h();
        for (Object obj : map.keySet()) {
            if (obj instanceof String) {
                N((String) obj);
                V(iLogger, map.get(obj));
            }
        }
        j();
    }

    private void p(ILogger iLogger, TimeZone timeZone) {
        try {
            w(timeZone.getID());
        } catch (Exception e11) {
            iLogger.a(b7.ERROR, "Error when serializing TimeZone", e11);
            R();
        }
    }

    @Override // io.sentry.j3
    public String O() {
        return null;
    }

    @Override // io.sentry.j3
    public void P(boolean z11) {
    }

    @Override // io.sentry.j3
    public j3 S(String str) {
        return this;
    }

    @Override // io.sentry.j3
    public void T(String str) {
    }

    @Override // io.sentry.j3
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public x f() {
        this.f81487b.add(new ArrayList());
        return this;
    }

    @Override // io.sentry.j3
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public x h() {
        this.f81487b.addLast(new HashMap());
        return this;
    }

    @Override // io.sentry.j3
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public x e() {
        j();
        return this;
    }

    @Override // io.sentry.j3
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public x j() {
        l(this.f81487b.removeLast());
        return this;
    }

    @Override // io.sentry.j3
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public x N(String str) {
        this.f81487b.add(str);
        return this;
    }

    @Override // io.sentry.j3
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public x R() {
        l(null);
        return this;
    }

    @Override // io.sentry.j3
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public x E(double d11) {
        l(Double.valueOf(d11));
        return this;
    }

    @Override // io.sentry.j3
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public x D(long j11) {
        l(Long.valueOf(j11));
        return this;
    }

    @Override // io.sentry.j3
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public x V(ILogger iLogger, Object obj) {
        if (obj == null) {
            R();
            return this;
        }
        if (obj instanceof Character) {
            w(Character.toString(((Character) obj).charValue()));
            return this;
        }
        if (obj instanceof String) {
            w((String) obj);
            return this;
        }
        if (obj instanceof Boolean) {
            K(((Boolean) obj).booleanValue());
            return this;
        }
        if (obj instanceof Number) {
            U((Number) obj);
            return this;
        }
        if (obj instanceof Date) {
            n(iLogger, (Date) obj);
            return this;
        }
        if (obj instanceof TimeZone) {
            p(iLogger, (TimeZone) obj);
            return this;
        }
        if (obj instanceof a2) {
            ((a2) obj).serialize(this, iLogger);
            return this;
        }
        if (obj instanceof Collection) {
            m(iLogger, (Collection) obj);
            return this;
        }
        if (obj.getClass().isArray()) {
            m(iLogger, Arrays.asList((Object[]) obj));
            return this;
        }
        if (obj instanceof Map) {
            o(iLogger, (Map) obj);
            return this;
        }
        if (obj instanceof Locale) {
            w(obj.toString());
            return this;
        }
        if (obj instanceof AtomicIntegerArray) {
            m(iLogger, q.a((AtomicIntegerArray) obj));
            return this;
        }
        if (obj instanceof AtomicBoolean) {
            K(((AtomicBoolean) obj).get());
            return this;
        }
        if (obj instanceof URI) {
            w(obj.toString());
            return this;
        }
        if (obj instanceof InetAddress) {
            w(obj.toString());
            return this;
        }
        if (obj instanceof UUID) {
            w(obj.toString());
            return this;
        }
        if (obj instanceof Currency) {
            w(obj.toString());
            return this;
        }
        if (obj instanceof Calendar) {
            o(iLogger, q.d((Calendar) obj));
            return this;
        }
        if (obj.getClass().isEnum()) {
            w(obj.toString());
            return this;
        }
        iLogger.c(b7.WARNING, "Failed serializing unknown object.", obj);
        return this;
    }

    @Override // io.sentry.j3
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public x W(Boolean bool) {
        l(bool);
        return this;
    }

    @Override // io.sentry.j3
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public x U(Number number) {
        l(number);
        return this;
    }

    @Override // io.sentry.j3
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public x w(String str) {
        l(str);
        return this;
    }

    @Override // io.sentry.j3
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public x K(boolean z11) {
        l(Boolean.valueOf(z11));
        return this;
    }
}
