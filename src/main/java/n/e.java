package n;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.w0;
import androidx.core.view.x0;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Interpolator f92616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    w0 f92617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f92618e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f92615b = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final x0 f92619f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ArrayList<ViewPropertyAnimatorCompat> f92614a = new ArrayList<>();

    class a extends x0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f92620a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f92621b = 0;

        a() {
        }

        @Override // androidx.core.view.w0
        public void b(View view) {
            int i11 = this.f92621b + 1;
            this.f92621b = i11;
            if (i11 == e.this.f92614a.size()) {
                w0 w0Var = e.this.f92617d;
                if (w0Var != null) {
                    w0Var.b(null);
                }
                d();
            }
        }

        @Override // androidx.core.view.x0, androidx.core.view.w0
        public void c(View view) {
            if (this.f92620a) {
                return;
            }
            this.f92620a = true;
            w0 w0Var = e.this.f92617d;
            if (w0Var != null) {
                w0Var.c(null);
            }
        }

        void d() {
            this.f92621b = 0;
            this.f92620a = false;
            e.this.b();
        }
    }

    public void a() {
        if (this.f92618e) {
            Iterator<ViewPropertyAnimatorCompat> it = this.f92614a.iterator();
            while (it.hasNext()) {
                it.next().c();
            }
            this.f92618e = false;
        }
    }

    void b() {
        this.f92618e = false;
    }

    public e c(ViewPropertyAnimatorCompat viewPropertyAnimatorCompat) {
        if (!this.f92618e) {
            this.f92614a.add(viewPropertyAnimatorCompat);
        }
        return this;
    }

    public e d(ViewPropertyAnimatorCompat viewPropertyAnimatorCompat, ViewPropertyAnimatorCompat viewPropertyAnimatorCompat2) {
        this.f92614a.add(viewPropertyAnimatorCompat);
        viewPropertyAnimatorCompat2.i(viewPropertyAnimatorCompat.d());
        this.f92614a.add(viewPropertyAnimatorCompat2);
        return this;
    }

    public e e(long j11) {
        if (!this.f92618e) {
            this.f92615b = j11;
        }
        return this;
    }

    public e f(Interpolator interpolator) {
        if (!this.f92618e) {
            this.f92616c = interpolator;
        }
        return this;
    }

    public e g(w0 w0Var) {
        if (!this.f92618e) {
            this.f92617d = w0Var;
        }
        return this;
    }

    public void h() {
        if (this.f92618e) {
            return;
        }
        for (ViewPropertyAnimatorCompat viewPropertyAnimatorCompat : this.f92614a) {
            long j11 = this.f92615b;
            if (j11 >= 0) {
                viewPropertyAnimatorCompat.e(j11);
            }
            Interpolator interpolator = this.f92616c;
            if (interpolator != null) {
                viewPropertyAnimatorCompat.f(interpolator);
            }
            if (this.f92617d != null) {
                viewPropertyAnimatorCompat.g(this.f92619f);
            }
            viewPropertyAnimatorCompat.k();
        }
        this.f92618e = true;
    }
}
