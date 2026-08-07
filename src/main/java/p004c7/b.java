package p004c7;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import p004c7.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class b<T extends b<T>> implements c7.a.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final s f18856m = new g("translationX");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final s f18857n = new h("translationY");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final s f18858o = new i("translationZ");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final s f18859p = new j("scaleX");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final s f18860q = new k("scaleY");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final s f18861r = new l("rotation");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final s f18862s = new m("rotationX");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final s f18863t = new n("rotationY");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final s f18864u = new o("x");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final s f18865v = new a("y");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final s f18866w = new C0383b("z");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final s f18867x = new c("alpha");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final s f18868y = new d("scrollX");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final s f18869z = new e("scrollY");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    float f18870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    float f18871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f18872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Object f18873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final p004c7.d f18874e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f18875f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float f18876g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f18877h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f18878i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f18879j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ArrayList<q> f18880k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ArrayList<r> f18881l;

    static class a extends s {
        a(String str) {
            super(str, null);
        }

        @Override // p004c7.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getY();
        }

        @Override // p004c7.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f11) {
            view.setY(f11);
        }
    }

    /* JADX INFO: renamed from: c7.b$b, reason: collision with other inner class name */
    static class C0383b extends s {
        C0383b(String str) {
            super(str, null);
        }

        @Override // p004c7.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return ViewCompat.N(view);
        }

        @Override // p004c7.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f11) {
            ViewCompat.M0(view, f11);
        }
    }

    static class c extends s {
        c(String str) {
            super(str, null);
        }

        @Override // p004c7.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getAlpha();
        }

        @Override // p004c7.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f11) {
            view.setAlpha(f11);
        }
    }

    static class d extends s {
        d(String str) {
            super(str, null);
        }

        @Override // p004c7.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScrollX();
        }

        @Override // p004c7.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f11) {
            view.setScrollX((int) f11);
        }
    }

    static class e extends s {
        e(String str) {
            super(str, null);
        }

        @Override // p004c7.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScrollY();
        }

        @Override // p004c7.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f11) {
            view.setScrollY((int) f11);
        }
    }

    class f extends p004c7.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p004c7.e f18882b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, p004c7.e eVar) {
            super(str);
            this.f18882b = eVar;
        }

        @Override // p004c7.d
        public float a(Object obj) {
            return this.f18882b.a();
        }

        @Override // p004c7.d
        public void b(Object obj, float f11) {
            this.f18882b.b(f11);
        }
    }

    static class g extends s {
        g(String str) {
            super(str, null);
        }

        @Override // p004c7.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getTranslationX();
        }

        @Override // p004c7.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f11) {
            view.setTranslationX(f11);
        }
    }

    static class h extends s {
        h(String str) {
            super(str, null);
        }

        @Override // p004c7.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getTranslationY();
        }

        @Override // p004c7.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f11) {
            view.setTranslationY(f11);
        }
    }

    static class i extends s {
        i(String str) {
            super(str, null);
        }

        @Override // p004c7.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return ViewCompat.K(view);
        }

        @Override // p004c7.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f11) {
            ViewCompat.K0(view, f11);
        }
    }

    static class j extends s {
        j(String str) {
            super(str, null);
        }

        @Override // p004c7.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScaleX();
        }

        @Override // p004c7.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f11) {
            view.setScaleX(f11);
        }
    }

    static class k extends s {
        k(String str) {
            super(str, null);
        }

        @Override // p004c7.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScaleY();
        }

        @Override // p004c7.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f11) {
            view.setScaleY(f11);
        }
    }

    static class l extends s {
        l(String str) {
            super(str, null);
        }

        @Override // p004c7.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotation();
        }

        @Override // p004c7.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f11) {
            view.setRotation(f11);
        }
    }

    static class m extends s {
        m(String str) {
            super(str, null);
        }

        @Override // p004c7.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotationX();
        }

        @Override // p004c7.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f11) {
            view.setRotationX(f11);
        }
    }

    static class n extends s {
        n(String str) {
            super(str, null);
        }

        @Override // p004c7.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotationY();
        }

        @Override // p004c7.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f11) {
            view.setRotationY(f11);
        }
    }

    static class o extends s {
        o(String str) {
            super(str, null);
        }

        @Override // p004c7.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getX();
        }

        @Override // p004c7.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f11) {
            view.setX(f11);
        }
    }

    static class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f18884a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f18885b;

        p() {
        }
    }

    public interface q {
        void a(b bVar, boolean z11, float f11, float f12);
    }

    public interface r {
        void b(b bVar, float f11, float f12);
    }

    public static abstract class s extends p004c7.d<View> {
        /* synthetic */ s(String str, g gVar) {
            this(str);
        }

        private s(String str) {
            super(str);
        }
    }

    b(p004c7.e eVar) {
        this.f18870a = BitmapDescriptorFactory.HUE_RED;
        this.f18871b = Float.MAX_VALUE;
        this.f18872c = false;
        this.f18875f = false;
        this.f18876g = Float.MAX_VALUE;
        this.f18877h = -Float.MAX_VALUE;
        this.f18878i = 0L;
        this.f18880k = new ArrayList<>();
        this.f18881l = new ArrayList<>();
        this.f18873d = null;
        this.f18874e = new f("FloatValueHolder", eVar);
        this.f18879j = 1.0f;
    }

    private void e(boolean z11) {
        this.f18875f = false;
        p004c7.a.d().g(this);
        this.f18878i = 0L;
        this.f18872c = false;
        for (int i11 = 0; i11 < this.f18880k.size(); i11++) {
            if (this.f18880k.get(i11) != null) {
                this.f18880k.get(i11).a(this, z11, this.f18871b, this.f18870a);
            }
        }
        i(this.f18880k);
    }

    private float f() {
        return this.f18874e.a(this.f18873d);
    }

    private static <T> void i(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    private void r() {
        if (this.f18875f) {
            return;
        }
        this.f18875f = true;
        if (!this.f18872c) {
            this.f18871b = f();
        }
        float f11 = this.f18871b;
        if (f11 > this.f18876g || f11 < this.f18877h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        p004c7.a.d().a(this, 0L);
    }

    @Override // c7.a.b
    public boolean a(long j11) {
        long j12 = this.f18878i;
        if (j12 == 0) {
            this.f18878i = j11;
            m(this.f18871b);
            return false;
        }
        this.f18878i = j11;
        boolean zS = s(j11 - j12);
        float fMin = Math.min(this.f18871b, this.f18876g);
        this.f18871b = fMin;
        float fMax = Math.max(fMin, this.f18877h);
        this.f18871b = fMax;
        m(fMax);
        if (zS) {
            e(false);
        }
        return zS;
    }

    public T b(q qVar) {
        if (!this.f18880k.contains(qVar)) {
            this.f18880k.add(qVar);
        }
        return this;
    }

    public T c(r rVar) {
        if (h()) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        if (!this.f18881l.contains(rVar)) {
            this.f18881l.add(rVar);
        }
        return this;
    }

    public void d() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
        }
        if (this.f18875f) {
            e(true);
        }
    }

    float g() {
        return this.f18879j * 0.75f;
    }

    public boolean h() {
        return this.f18875f;
    }

    public T j(float f11) {
        this.f18876g = f11;
        return this;
    }

    public T k(float f11) {
        this.f18877h = f11;
        return this;
    }

    public T l(float f11) {
        if (f11 <= BitmapDescriptorFactory.HUE_RED) {
            throw new IllegalArgumentException("Minimum visible change must be positive.");
        }
        this.f18879j = f11;
        p(f11 * 0.75f);
        return this;
    }

    void m(float f11) {
        this.f18874e.b(this.f18873d, f11);
        for (int i11 = 0; i11 < this.f18881l.size(); i11++) {
            if (this.f18881l.get(i11) != null) {
                this.f18881l.get(i11).b(this, this.f18871b, this.f18870a);
            }
        }
        i(this.f18881l);
    }

    public T n(float f11) {
        this.f18871b = f11;
        this.f18872c = true;
        return this;
    }

    public T o(float f11) {
        this.f18870a = f11;
        return this;
    }

    abstract void p(float f11);

    public void q() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f18875f) {
            return;
        }
        r();
    }

    abstract boolean s(long j11);

    <K> b(K k11, p004c7.d<K> dVar) {
        this.f18870a = BitmapDescriptorFactory.HUE_RED;
        this.f18871b = Float.MAX_VALUE;
        this.f18872c = false;
        this.f18875f = false;
        this.f18876g = Float.MAX_VALUE;
        this.f18877h = -Float.MAX_VALUE;
        this.f18878i = 0L;
        this.f18880k = new ArrayList<>();
        this.f18881l = new ArrayList<>();
        this.f18873d = k11;
        this.f18874e = dVar;
        if (dVar != f18861r && dVar != f18862s && dVar != f18863t) {
            if (dVar == f18867x) {
                this.f18879j = 0.00390625f;
                return;
            } else if (dVar != f18859p && dVar != f18860q) {
                this.f18879j = 1.0f;
                return;
            } else {
                this.f18879j = 0.00390625f;
                return;
            }
        }
        this.f18879j = 0.1f;
    }
}
