package kw;

import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile a f89433c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f89434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f89435b;

    public a(c cVar) {
        this.f89435b = false;
        this.f89434a = cVar == null ? c.c() : cVar;
    }

    public static a e() {
        if (f89433c == null) {
            synchronized (a.class) {
                try {
                    if (f89433c == null) {
                        f89433c = new a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f89433c;
    }

    public void a(String str) {
        if (this.f89435b) {
            this.f89434a.a(str);
        }
    }

    public void b(String str, Object... objArr) {
        if (this.f89435b) {
            this.f89434a.a(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void c(String str) {
        if (this.f89435b) {
            this.f89434a.b(str);
        }
    }

    public void d(String str, Object... objArr) {
        if (this.f89435b) {
            this.f89434a.b(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void f(String str) {
        if (this.f89435b) {
            this.f89434a.d(str);
        }
    }

    public void g(String str, Object... objArr) {
        if (this.f89435b) {
            this.f89434a.d(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public boolean h() {
        return this.f89435b;
    }

    public void i(boolean z11) {
        this.f89435b = z11;
    }

    public void j(String str) {
        if (this.f89435b) {
            this.f89434a.e(str);
        }
    }

    public void k(String str, Object... objArr) {
        if (this.f89435b) {
            this.f89434a.e(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    private a() {
        this(null);
    }
}
