package androidx.media3.session;

import android.content.ComponentName;
import android.media.session.MediaSession;
import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class ve {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f12552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f12553c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f12554a;

    interface a {
        int a();

        String e();

        Object f();

        ComponentName g();

        Bundle getExtras();

        String getServiceName();

        int getType();

        int h();

        boolean i();

        MediaSession.Token j();

        Bundle toBundle();
    }

    static {
        p7.d0.a("media3.session");
        f12552b = s7.q0.N0(0);
        f12553c = s7.q0.N0(1);
    }

    ve(int i11, int i12, int i13, int i14, String str, o oVar, Bundle bundle, MediaSession.Token token) {
        this.f12554a = new we(i11, i12, i13, i14, str, oVar, bundle, token);
    }

    Object a() {
        return this.f12554a.f();
    }

    ComponentName b() {
        return this.f12554a.g();
    }

    public Bundle c() {
        return this.f12554a.getExtras();
    }

    public int d() {
        return this.f12554a.h();
    }

    public String e() {
        return this.f12554a.e();
    }

    public boolean equals(Object obj) {
        if (obj instanceof ve) {
            return this.f12554a.equals(((ve) obj).f12554a);
        }
        return false;
    }

    MediaSession.Token f() {
        return this.f12554a.j();
    }

    public String g() {
        return this.f12554a.getServiceName();
    }

    public int h() {
        return this.f12554a.getType();
    }

    public int hashCode() {
        return this.f12554a.hashCode();
    }

    public int i() {
        return this.f12554a.a();
    }

    boolean j() {
        return this.f12554a.i();
    }

    public Bundle k() {
        Bundle bundle = new Bundle();
        if (this.f12554a instanceof we) {
            bundle.putInt(f12552b, 0);
        } else {
            bundle.putInt(f12552b, 1);
        }
        bundle.putBundle(f12553c, this.f12554a.toBundle());
        return bundle;
    }

    public String toString() {
        return this.f12554a.toString();
    }
}
