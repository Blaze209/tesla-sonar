package fv;

import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
public class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final b f66625c = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jv.g f66626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f66627b;

    public f(jv.g gVar) {
        this.f66626a = gVar;
        this.f66627b = f66625c;
    }

    private File d(String str) {
        return this.f66626a.q(str, "userlog");
    }

    public void a() {
        this.f66627b.b();
    }

    public byte[] b() {
        return this.f66627b.a();
    }

    public String c() {
        return this.f66627b.e();
    }

    public final void e(String str) {
        this.f66627b.d();
        this.f66627b = f66625c;
        if (str == null) {
            return;
        }
        f(d(str), 65536);
    }

    void f(File file, int i11) {
        this.f66627b = new i(file, i11);
    }

    public void g(long j11, String str) {
        this.f66627b.c(j11, str);
    }

    public f(jv.g gVar, String str) {
        this(gVar);
        e(str);
    }

    private static final class b implements d {
        private b() {
        }

        @Override // fv.d
        public byte[] a() {
            return null;
        }

        @Override // fv.d
        public String e() {
            return null;
        }

        @Override // fv.d
        public void b() {
        }

        @Override // fv.d
        public void d() {
        }

        @Override // fv.d
        public void c(long j11, String str) {
        }
    }
}
