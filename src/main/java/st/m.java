package st;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public float f111874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public float f111875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public float f111876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public float f111877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public float f111878e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public float f111879f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<f> f111880g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<g> f111881h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f111882i;

    class a extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f111883c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Matrix f111884d;

        a(List list, Matrix matrix) {
            this.f111883c = list;
            this.f111884d = matrix;
        }

        @Override // st.m.g
        public void a(Matrix matrix, rt.a aVar, int i11, Canvas canvas) {
            Iterator it = this.f111883c.iterator();
            while (it.hasNext()) {
                ((g) it.next()).a(this.f111884d, aVar, i11, canvas);
            }
        }
    }

    static class b extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final d f111886c;

        public b(d dVar) {
            this.f111886c = dVar;
        }

        @Override // st.m.g
        public void a(Matrix matrix, @NonNull rt.a aVar, int i11, @NonNull Canvas canvas) {
            aVar.a(canvas, matrix, new RectF(this.f111886c.k(), this.f111886c.o(), this.f111886c.l(), this.f111886c.j()), i11, this.f111886c.m(), this.f111886c.n());
        }
    }

    static class c extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final e f111887c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f111888d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f111889e;

        public c(e eVar, float f11, float f12) {
            this.f111887c = eVar;
            this.f111888d = f11;
            this.f111889e = f12;
        }

        @Override // st.m.g
        public void a(Matrix matrix, @NonNull rt.a aVar, int i11, @NonNull Canvas canvas) {
            RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) Math.hypot(this.f111887c.f111898c - this.f111889e, this.f111887c.f111897b - this.f111888d), BitmapDescriptorFactory.HUE_RED);
            this.f111901a.set(matrix);
            this.f111901a.preTranslate(this.f111888d, this.f111889e);
            this.f111901a.preRotate(c());
            aVar.b(canvas, this.f111901a, rectF, i11);
        }

        float c() {
            return (float) Math.toDegrees(Math.atan((this.f111887c.f111898c - this.f111889e) / (this.f111887c.f111897b - this.f111888d)));
        }
    }

    public static class d extends f {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final RectF f111890h = new RectF();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Deprecated
        public float f111891b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Deprecated
        public float f111892c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Deprecated
        public float f111893d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Deprecated
        public float f111894e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Deprecated
        public float f111895f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Deprecated
        public float f111896g;

        public d(float f11, float f12, float f13, float f14) {
            q(f11);
            u(f12);
            r(f13);
            p(f14);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float j() {
            return this.f111894e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float k() {
            return this.f111891b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float l() {
            return this.f111893d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float m() {
            return this.f111895f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float n() {
            return this.f111896g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float o() {
            return this.f111892c;
        }

        private void p(float f11) {
            this.f111894e = f11;
        }

        private void q(float f11) {
            this.f111891b = f11;
        }

        private void r(float f11) {
            this.f111893d = f11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s(float f11) {
            this.f111895f = f11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t(float f11) {
            this.f111896g = f11;
        }

        private void u(float f11) {
            this.f111892c = f11;
        }

        @Override // st.m.f
        public void a(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.f111899a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f111890h;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }
    }

    public static class e extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f111897b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f111898c;

        @Override // st.m.f
        public void a(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.f111899a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f111897b, this.f111898c);
            path.transform(matrix);
        }
    }

    public static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final Matrix f111899a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    static abstract class g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final Matrix f111900b = new Matrix();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Matrix f111901a = new Matrix();

        g() {
        }

        public abstract void a(Matrix matrix, rt.a aVar, int i11, Canvas canvas);

        public final void b(rt.a aVar, int i11, Canvas canvas) {
            a(f111900b, aVar, i11, canvas);
        }
    }

    public m() {
        n(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    private void b(float f11) {
        if (g() == f11) {
            return;
        }
        float fG = ((f11 - g()) + 360.0f) % 360.0f;
        if (fG > 180.0f) {
            return;
        }
        d dVar = new d(i(), j(), i(), j());
        dVar.s(g());
        dVar.t(fG);
        this.f111881h.add(new b(dVar));
        p(f11);
    }

    private void c(g gVar, float f11, float f12) {
        b(f11);
        this.f111881h.add(gVar);
        p(f12);
    }

    private float g() {
        return this.f111878e;
    }

    private float h() {
        return this.f111879f;
    }

    private void p(float f11) {
        this.f111878e = f11;
    }

    private void q(float f11) {
        this.f111879f = f11;
    }

    private void r(float f11) {
        this.f111876c = f11;
    }

    private void s(float f11) {
        this.f111877d = f11;
    }

    private void t(float f11) {
        this.f111874a = f11;
    }

    private void u(float f11) {
        this.f111875b = f11;
    }

    public void a(float f11, float f12, float f13, float f14, float f15, float f16) {
        d dVar = new d(f11, f12, f13, f14);
        dVar.s(f15);
        dVar.t(f16);
        this.f111880g.add(dVar);
        b bVar = new b(dVar);
        float f17 = f15 + f16;
        boolean z11 = f16 < BitmapDescriptorFactory.HUE_RED;
        if (z11) {
            f15 = (f15 + 180.0f) % 360.0f;
        }
        c(bVar, f15, z11 ? (180.0f + f17) % 360.0f : f17);
        double d11 = f17;
        r(((f11 + f13) * 0.5f) + (((f13 - f11) / 2.0f) * ((float) Math.cos(Math.toRadians(d11)))));
        s(((f12 + f14) * 0.5f) + (((f14 - f12) / 2.0f) * ((float) Math.sin(Math.toRadians(d11)))));
    }

    public void d(Matrix matrix, Path path) {
        int size = this.f111880g.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f111880g.get(i11).a(matrix, path);
        }
    }

    boolean e() {
        return this.f111882i;
    }

    @NonNull
    g f(Matrix matrix) {
        b(h());
        return new a(new ArrayList(this.f111881h), new Matrix(matrix));
    }

    float i() {
        return this.f111876c;
    }

    float j() {
        return this.f111877d;
    }

    float k() {
        return this.f111874a;
    }

    float l() {
        return this.f111875b;
    }

    public void m(float f11, float f12) {
        e eVar = new e();
        eVar.f111897b = f11;
        eVar.f111898c = f12;
        this.f111880g.add(eVar);
        c cVar = new c(eVar, i(), j());
        c(cVar, cVar.c() + 270.0f, cVar.c() + 270.0f);
        r(f11);
        s(f12);
    }

    public void n(float f11, float f12) {
        o(f11, f12, 270.0f, BitmapDescriptorFactory.HUE_RED);
    }

    public void o(float f11, float f12, float f13, float f14) {
        t(f11);
        u(f12);
        r(f11);
        s(f12);
        p(f13);
        q((f13 + f14) % 360.0f);
        this.f111880g.clear();
        this.f111881h.clear();
        this.f111882i = false;
    }
}
