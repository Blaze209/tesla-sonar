package st;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes5.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m[] f111856a = new m[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Matrix[] f111857b = new Matrix[4];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Matrix[] f111858c = new Matrix[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PointF f111859d = new PointF();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Path f111860e = new Path();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Path f111861f = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final m f111862g = new m();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float[] f111863h = new float[2];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float[] f111864i = new float[2];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Path f111865j = new Path();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Path f111866k = new Path();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f111867l = true;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final l f111868a = new l();
    }

    public interface b {
        void a(m mVar, Matrix matrix, int i11);

        void b(m mVar, Matrix matrix, int i11);
    }

    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final k f111869a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        public final Path f111870b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        public final RectF f111871c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b f111872d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f111873e;

        c(@NonNull k kVar, float f11, RectF rectF, b bVar, Path path) {
            this.f111872d = bVar;
            this.f111869a = kVar;
            this.f111873e = f11;
            this.f111871c = rectF;
            this.f111870b = path;
        }
    }

    public l() {
        for (int i11 = 0; i11 < 4; i11++) {
            this.f111856a[i11] = new m();
            this.f111857b[i11] = new Matrix();
            this.f111858c[i11] = new Matrix();
        }
    }

    private float a(int i11) {
        return ((i11 + 1) % 4) * 90;
    }

    private void b(@NonNull c cVar, int i11) {
        this.f111863h[0] = this.f111856a[i11].k();
        this.f111863h[1] = this.f111856a[i11].l();
        this.f111857b[i11].mapPoints(this.f111863h);
        if (i11 == 0) {
            Path path = cVar.f111870b;
            float[] fArr = this.f111863h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.f111870b;
            float[] fArr2 = this.f111863h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f111856a[i11].d(this.f111857b[i11], cVar.f111870b);
        b bVar = cVar.f111872d;
        if (bVar != null) {
            bVar.b(this.f111856a[i11], this.f111857b[i11], i11);
        }
    }

    private void c(@NonNull c cVar, int i11) {
        int i12 = (i11 + 1) % 4;
        this.f111863h[0] = this.f111856a[i11].i();
        this.f111863h[1] = this.f111856a[i11].j();
        this.f111857b[i11].mapPoints(this.f111863h);
        this.f111864i[0] = this.f111856a[i12].k();
        this.f111864i[1] = this.f111856a[i12].l();
        this.f111857b[i12].mapPoints(this.f111864i);
        float[] fArr = this.f111863h;
        float f11 = fArr[0];
        float[] fArr2 = this.f111864i;
        float fMax = Math.max(((float) Math.hypot(f11 - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, BitmapDescriptorFactory.HUE_RED);
        float fI = i(cVar.f111871c, i11);
        this.f111862g.n(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        f fVarJ = j(i11, cVar.f111869a);
        fVarJ.b(fMax, fI, cVar.f111873e, this.f111862g);
        this.f111865j.reset();
        this.f111862g.d(this.f111858c[i11], this.f111865j);
        if (this.f111867l && (fVarJ.a() || l(this.f111865j, i11) || l(this.f111865j, i12))) {
            Path path = this.f111865j;
            path.op(path, this.f111861f, Path.Op.DIFFERENCE);
            this.f111863h[0] = this.f111862g.k();
            this.f111863h[1] = this.f111862g.l();
            this.f111858c[i11].mapPoints(this.f111863h);
            Path path2 = this.f111860e;
            float[] fArr3 = this.f111863h;
            path2.moveTo(fArr3[0], fArr3[1]);
            this.f111862g.d(this.f111858c[i11], this.f111860e);
        } else {
            this.f111862g.d(this.f111858c[i11], cVar.f111870b);
        }
        b bVar = cVar.f111872d;
        if (bVar != null) {
            bVar.a(this.f111862g, this.f111858c[i11], i11);
        }
    }

    private void f(int i11, @NonNull RectF rectF, @NonNull PointF pointF) {
        if (i11 == 1) {
            pointF.set(rectF.right, rectF.bottom);
            return;
        }
        if (i11 == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i11 != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    private st.c g(int i11, @NonNull k kVar) {
        if (i11 == 1) {
            return kVar.l();
        }
        if (i11 != 2) {
            return i11 != 3 ? kVar.t() : kVar.r();
        }
        return kVar.j();
    }

    private d h(int i11, @NonNull k kVar) {
        if (i11 == 1) {
            return kVar.k();
        }
        if (i11 != 2) {
            return i11 != 3 ? kVar.s() : kVar.q();
        }
        return kVar.i();
    }

    private float i(@NonNull RectF rectF, int i11) {
        float[] fArr = this.f111863h;
        m mVar = this.f111856a[i11];
        fArr[0] = mVar.f111876c;
        fArr[1] = mVar.f111877d;
        this.f111857b[i11].mapPoints(fArr);
        return (i11 == 1 || i11 == 3) ? Math.abs(rectF.centerX() - this.f111863h[0]) : Math.abs(rectF.centerY() - this.f111863h[1]);
    }

    private f j(int i11, @NonNull k kVar) {
        if (i11 == 1) {
            return kVar.h();
        }
        if (i11 != 2) {
            return i11 != 3 ? kVar.o() : kVar.p();
        }
        return kVar.n();
    }

    @NonNull
    public static l k() {
        return a.f111868a;
    }

    private boolean l(Path path, int i11) {
        this.f111866k.reset();
        this.f111856a[i11].d(this.f111857b[i11], this.f111866k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f111866k.computeBounds(rectF, true);
        path.op(this.f111866k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    private void m(@NonNull c cVar, int i11) {
        h(i11, cVar.f111869a).b(this.f111856a[i11], 90.0f, cVar.f111873e, cVar.f111871c, g(i11, cVar.f111869a));
        float fA = a(i11);
        this.f111857b[i11].reset();
        f(i11, cVar.f111871c, this.f111859d);
        Matrix matrix = this.f111857b[i11];
        PointF pointF = this.f111859d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f111857b[i11].preRotate(fA);
    }

    private void n(int i11) {
        this.f111863h[0] = this.f111856a[i11].i();
        this.f111863h[1] = this.f111856a[i11].j();
        this.f111857b[i11].mapPoints(this.f111863h);
        float fA = a(i11);
        this.f111858c[i11].reset();
        Matrix matrix = this.f111858c[i11];
        float[] fArr = this.f111863h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f111858c[i11].preRotate(fA);
    }

    public void d(k kVar, float f11, RectF rectF, @NonNull Path path) {
        e(kVar, f11, rectF, null, path);
    }

    public void e(k kVar, float f11, RectF rectF, b bVar, @NonNull Path path) {
        path.rewind();
        this.f111860e.rewind();
        this.f111861f.rewind();
        this.f111861f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(kVar, f11, rectF, bVar, path);
        for (int i11 = 0; i11 < 4; i11++) {
            m(cVar, i11);
            n(i11);
        }
        for (int i12 = 0; i12 < 4; i12++) {
            b(cVar, i12);
            c(cVar, i12);
        }
        path.close();
        this.f111860e.close();
        if (this.f111860e.isEmpty()) {
            return;
        }
        path.op(this.f111860e, Path.Op.UNION);
    }
}
