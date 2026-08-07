package wf;

import android.annotation.SuppressLint;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a<K, A> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d<K> f121719c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected ig.c<A> f121721e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List<b> f121717a = new ArrayList(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f121718b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected float f121720d = BitmapDescriptorFactory.HUE_RED;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private A f121722f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f121723g = -1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f121724h = -1.0f;

    public interface b {
        void e();
    }

    private static final class c<T> implements d<T> {
        private c() {
        }

        @Override // wf.a.d
        public ig.a<T> a() {
            throw new IllegalStateException("not implemented");
        }

        @Override // wf.a.d
        public float b() {
            return BitmapDescriptorFactory.HUE_RED;
        }

        @Override // wf.a.d
        public boolean c(float f11) {
            throw new IllegalStateException("not implemented");
        }

        @Override // wf.a.d
        public boolean d(float f11) {
            return false;
        }

        @Override // wf.a.d
        public float e() {
            return 1.0f;
        }

        @Override // wf.a.d
        public boolean isEmpty() {
            return true;
        }
    }

    private interface d<T> {
        ig.a<T> a();

        float b();

        boolean c(float f11);

        boolean d(float f11);

        float e();

        boolean isEmpty();
    }

    private static final class e<T> implements d<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<? extends ig.a<T>> f121725a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ig.a<T> f121727c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f121728d = -1.0f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        private ig.a<T> f121726b = f(BitmapDescriptorFactory.HUE_RED);

        e(List<? extends ig.a<T>> list) {
            this.f121725a = list;
        }

        private ig.a<T> f(float f11) {
            List<? extends ig.a<T>> list = this.f121725a;
            ig.a<T> aVar = list.get(list.size() - 1);
            if (f11 >= aVar.f()) {
                return aVar;
            }
            for (int size = this.f121725a.size() - 2; size >= 1; size--) {
                ig.a<T> aVar2 = this.f121725a.get(size);
                if (this.f121726b != aVar2 && aVar2.a(f11)) {
                    return aVar2;
                }
            }
            return this.f121725a.get(0);
        }

        @Override // wf.a.d
        @NonNull
        public ig.a<T> a() {
            return this.f121726b;
        }

        @Override // wf.a.d
        public float b() {
            return this.f121725a.get(0).f();
        }

        @Override // wf.a.d
        public boolean c(float f11) {
            ig.a<T> aVar = this.f121727c;
            ig.a<T> aVar2 = this.f121726b;
            if (aVar == aVar2 && this.f121728d == f11) {
                return true;
            }
            this.f121727c = aVar2;
            this.f121728d = f11;
            return false;
        }

        @Override // wf.a.d
        public boolean d(float f11) {
            if (this.f121726b.a(f11)) {
                return !this.f121726b.i();
            }
            this.f121726b = f(f11);
            return true;
        }

        @Override // wf.a.d
        public float e() {
            List<? extends ig.a<T>> list = this.f121725a;
            return list.get(list.size() - 1).c();
        }

        @Override // wf.a.d
        public boolean isEmpty() {
            return false;
        }
    }

    private static final class f<T> implements d<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private final ig.a<T> f121729a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f121730b = -1.0f;

        f(List<? extends ig.a<T>> list) {
            this.f121729a = list.get(0);
        }

        @Override // wf.a.d
        public ig.a<T> a() {
            return this.f121729a;
        }

        @Override // wf.a.d
        public float b() {
            return this.f121729a.f();
        }

        @Override // wf.a.d
        public boolean c(float f11) {
            if (this.f121730b == f11) {
                return true;
            }
            this.f121730b = f11;
            return false;
        }

        @Override // wf.a.d
        public boolean d(float f11) {
            return !this.f121729a.i();
        }

        @Override // wf.a.d
        public float e() {
            return this.f121729a.c();
        }

        @Override // wf.a.d
        public boolean isEmpty() {
            return false;
        }
    }

    a(List<? extends ig.a<K>> list) {
        this.f121719c = q(list);
    }

    @SuppressLint({"Range"})
    private float g() {
        if (this.f121723g == -1.0f) {
            this.f121723g = this.f121719c.b();
        }
        return this.f121723g;
    }

    private static <T> d<T> q(List<? extends ig.a<T>> list) {
        if (list.isEmpty()) {
            return new c();
        }
        return list.size() == 1 ? new f(list) : new e(list);
    }

    public void a(b bVar) {
        this.f121717a.add(bVar);
    }

    protected ig.a<K> b() {
        if (tf.e.h()) {
            tf.e.b("BaseKeyframeAnimation#getCurrentKeyframe");
        }
        ig.a<K> aVarA = this.f121719c.a();
        if (tf.e.h()) {
            tf.e.c("BaseKeyframeAnimation#getCurrentKeyframe");
        }
        return aVarA;
    }

    @SuppressLint({"Range"})
    float c() {
        if (this.f121724h == -1.0f) {
            this.f121724h = this.f121719c.e();
        }
        return this.f121724h;
    }

    protected float d() {
        Interpolator interpolator;
        ig.a<K> aVarB = b();
        return (aVarB == null || aVarB.i() || (interpolator = aVarB.f77659d) == null) ? BitmapDescriptorFactory.HUE_RED : interpolator.getInterpolation(e());
    }

    float e() {
        if (this.f121718b) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        ig.a<K> aVarB = b();
        return aVarB.i() ? BitmapDescriptorFactory.HUE_RED : (this.f121720d - aVarB.f()) / (aVarB.c() - aVarB.f());
    }

    public float f() {
        return this.f121720d;
    }

    public A h() {
        float fE = e();
        if (this.f121721e == null && this.f121719c.c(fE) && !p()) {
            return this.f121722f;
        }
        ig.a<K> aVarB = b();
        Interpolator interpolator = aVarB.f77660e;
        A aI = (interpolator == null || aVarB.f77661f == null) ? i(aVarB, d()) : j(aVarB, fE, interpolator.getInterpolation(fE), aVarB.f77661f.getInterpolation(fE));
        this.f121722f = aI;
        return aI;
    }

    abstract A i(ig.a<K> aVar, float f11);

    protected A j(ig.a<K> aVar, float f11, float f12, float f13) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public boolean k() {
        return this.f121721e != null;
    }

    public void l() {
        if (tf.e.h()) {
            tf.e.b("BaseKeyframeAnimation#notifyListeners");
        }
        for (int i11 = 0; i11 < this.f121717a.size(); i11++) {
            this.f121717a.get(i11).e();
        }
        if (tf.e.h()) {
            tf.e.c("BaseKeyframeAnimation#notifyListeners");
        }
    }

    public void m() {
        this.f121718b = true;
    }

    public void n(float f11) {
        if (tf.e.h()) {
            tf.e.b("BaseKeyframeAnimation#setProgress");
        }
        if (this.f121719c.isEmpty()) {
            if (tf.e.h()) {
                tf.e.c("BaseKeyframeAnimation#setProgress");
                return;
            }
            return;
        }
        if (f11 < g()) {
            f11 = g();
        } else if (f11 > c()) {
            f11 = c();
        }
        if (f11 == this.f121720d) {
            if (tf.e.h()) {
                tf.e.c("BaseKeyframeAnimation#setProgress");
            }
        } else {
            this.f121720d = f11;
            if (this.f121719c.d(f11)) {
                l();
            }
            if (tf.e.h()) {
                tf.e.c("BaseKeyframeAnimation#setProgress");
            }
        }
    }

    public void o(ig.c<A> cVar) {
        ig.c<A> cVar2 = this.f121721e;
        if (cVar2 != null) {
            cVar2.c(null);
        }
        this.f121721e = cVar;
        if (cVar != null) {
            cVar.c(this);
        }
    }

    protected boolean p() {
        return false;
    }
}
