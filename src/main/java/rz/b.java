package rz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Field f109251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Method f109252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Method f109253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f109254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected Class<?> f109255e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected Type f109256f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected String f109257g;

    public b(Class<?> cls, Field field, j jVar) {
        this.f109257g = field.getName();
        int modifiers = field.getModifiers();
        if ((modifiers & 136) > 0) {
            return;
        }
        if ((modifiers & 1) > 0) {
            this.f109251a = field;
        }
        try {
            this.f109252b = cls.getDeclaredMethod(a.e(field.getName()), field.getType());
        } catch (Exception unused) {
        }
        boolean zEquals = field.getType().equals(Boolean.TYPE);
        try {
            this.f109253c = cls.getDeclaredMethod(zEquals ? a.d(field.getName()) : a.c(field.getName()), null);
        } catch (Exception unused2) {
        }
        if (this.f109253c == null && zEquals) {
            try {
                this.f109253c = cls.getDeclaredMethod(a.c(field.getName()), null);
            } catch (Exception unused3) {
            }
        }
        if (this.f109251a == null && this.f109253c == null && this.f109252b == null) {
            return;
        }
        Method method = this.f109253c;
        if (method != null && !jVar.a(field, method)) {
            this.f109253c = null;
        }
        Method method2 = this.f109252b;
        if (method2 != null && !jVar.a(field, method2)) {
            this.f109252b = null;
        }
        if (this.f109253c == null && this.f109252b == null && this.f109251a == null) {
            return;
        }
        this.f109255e = field.getType();
        this.f109256f = field.getGenericType();
    }

    public int a() {
        return this.f109254d;
    }

    public String b() {
        return this.f109257g;
    }

    public Class<?> c() {
        return this.f109255e;
    }

    public boolean d() {
        return this.f109255e.isEnum();
    }

    public boolean e() {
        return this.f109252b == null && this.f109253c == null;
    }

    public boolean f() {
        return (this.f109251a == null && this.f109253c == null) ? false : true;
    }

    public boolean g() {
        return (this.f109251a == null && this.f109253c == null && this.f109252b == null) ? false : true;
    }

    public boolean h() {
        return (this.f109251a == null && this.f109253c == null) ? false : true;
    }
}
