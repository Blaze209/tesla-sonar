package io.sentry;

import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class h0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Map<String, Class<?>> f80611h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Object> f80612a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<b> f80613b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.sentry.util.a f80614c = new io.sentry.util.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f80615d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f80616e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f80617f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private z3 f80618g = null;

    static {
        HashMap map = new HashMap();
        f80611h = map;
        map.put(InquiryField.BooleanField.TYPE, Boolean.class);
        map.put("char", Character.class);
        map.put("byte", Byte.class);
        map.put("short", Short.class);
        map.put("int", Integer.class);
        map.put("long", Long.class);
        map.put(InquiryField.FloatField.TYPE, Float.class);
        map.put("double", Double.class);
    }

    private boolean j(Object obj, Class<?> cls) {
        Class<?> cls2 = f80611h.get(cls.getCanonicalName());
        return obj != null && cls.isPrimitive() && cls2 != null && cls2.isInstance(obj);
    }

    public void a(List<b> list) {
        if (list != null) {
            this.f80613b.addAll(list);
        }
    }

    public void b() {
        d1 d1VarA = this.f80614c.a();
        try {
            Iterator<Map.Entry<String, Object>> it = this.f80612a.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, Object> next = it.next();
                if (next.getKey() == null || !next.getKey().startsWith("sentry:")) {
                    it.remove();
                }
            }
            if (d1VarA != null) {
                d1VarA.close();
            }
        } catch (Throwable th2) {
            if (d1VarA != null) {
                try {
                    d1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public Object c(String str) {
        d1 d1VarA = this.f80614c.a();
        try {
            Object obj = this.f80612a.get(str);
            if (d1VarA != null) {
                d1VarA.close();
            }
            return obj;
        } catch (Throwable th2) {
            if (d1VarA != null) {
                try {
                    d1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public <T> T d(String str, Class<T> cls) {
        d1 d1VarA = this.f80614c.a();
        try {
            T t11 = (T) this.f80612a.get(str);
            if (cls.isInstance(t11)) {
                if (d1VarA != null) {
                    d1VarA.close();
                    return t11;
                }
            } else {
                if (!j(t11, cls)) {
                    if (d1VarA != null) {
                        d1VarA.close();
                    }
                    return null;
                }
                if (d1VarA != null) {
                    d1VarA.close();
                }
            }
            return t11;
        } catch (Throwable th2) {
            if (d1VarA != null) {
                try {
                    d1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public List<b> e() {
        return new ArrayList(this.f80613b);
    }

    public z3 f() {
        return this.f80618g;
    }

    public b g() {
        return this.f80615d;
    }

    public b h() {
        return this.f80617f;
    }

    public b i() {
        return this.f80616e;
    }

    public void k(String str, Object obj) {
        d1 d1VarA = this.f80614c.a();
        try {
            this.f80612a.put(str, obj);
            if (d1VarA != null) {
                d1VarA.close();
            }
        } catch (Throwable th2) {
            if (d1VarA != null) {
                try {
                    d1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public void l(z3 z3Var) {
        this.f80618g = z3Var;
    }

    public void m(b bVar) {
        this.f80615d = bVar;
    }

    public void n(b bVar) {
        this.f80617f = bVar;
    }

    public void o(b bVar) {
        this.f80616e = bVar;
    }
}
