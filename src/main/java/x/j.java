package x;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f122456a;

    interface a {
        String a();

        void b(@NonNull Surface surface);

        void c();

        void d(long j11);

        void e(long j11);

        void f(String str);

        void g(int i11);

        Surface getSurface();

        Object h();
    }

    public j(int i11, @NonNull Surface surface) {
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 33) {
            this.f122456a = new n(i11, surface);
            return;
        }
        if (i12 >= 28) {
            this.f122456a = new m(i11, surface);
        } else if (i12 >= 26) {
            this.f122456a = new l(i11, surface);
        } else {
            this.f122456a = new k(i11, surface);
        }
    }

    public static j j(Object obj) {
        a aVarK;
        if (obj == null) {
            return null;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            aVarK = n.m((OutputConfiguration) obj);
        } else if (i11 >= 28) {
            aVarK = m.l((OutputConfiguration) obj);
        } else {
            aVarK = i11 >= 26 ? l.k((OutputConfiguration) obj) : k.j((OutputConfiguration) obj);
        }
        if (aVarK == null) {
            return null;
        }
        return new j(aVarK);
    }

    public void a(@NonNull Surface surface) {
        this.f122456a.b(surface);
    }

    public void b() {
        this.f122456a.c();
    }

    public String c() {
        return this.f122456a.a();
    }

    public Surface d() {
        return this.f122456a.getSurface();
    }

    public void e(long j11) {
        this.f122456a.e(j11);
    }

    public boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f122456a.equals(((j) obj).f122456a);
        }
        return false;
    }

    public void f(int i11) {
        this.f122456a.g(i11);
    }

    public void g(String str) {
        this.f122456a.f(str);
    }

    public void h(long j11) {
        this.f122456a.d(j11);
    }

    public int hashCode() {
        return this.f122456a.hashCode();
    }

    public Object i() {
        return this.f122456a.h();
    }

    private j(@NonNull a aVar) {
        this.f122456a = aVar;
    }
}
