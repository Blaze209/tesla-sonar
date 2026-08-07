package td0;

import io.realm.p0;
import io.realm.y0;

/* JADX INFO: loaded from: classes8.dex */
public class o extends p0 implements y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f113228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f113229b;

    /* JADX WARN: Multi-variable type inference failed */
    public o() {
        if (this instanceof io.realm.internal.o) {
            ((io.realm.internal.o) this).d();
        }
    }

    public String a() {
        return this.f113229b;
    }

    public String b() {
        return this.f113228a;
    }

    public void c(String str) {
        this.f113228a = str;
    }

    public void g(String str) {
        this.f113229b = str;
    }

    public String k() {
        return b();
    }

    public String l() {
        return a();
    }

    public o m(String str) {
        c(str);
        return this;
    }

    public o n(String str) {
        g(str);
        return this;
    }
}
