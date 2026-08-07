package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes3.dex */
public class p extends RecyclerView.b0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @SuppressLint({"UnknownNullness"})
    protected PointF f13572k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final DisplayMetrics f13573l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f13575n;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final LinearInterpolator f13570i = new LinearInterpolator();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected final DecelerateInterpolator f13571j = new DecelerateInterpolator();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f13574m = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected int f13576o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected int f13577p = 0;

    @SuppressLint({"UnknownNullness"})
    public p(Context context) {
        this.f13573l = context.getResources().getDisplayMetrics();
    }

    private float A() {
        if (!this.f13574m) {
            this.f13575n = v(this.f13573l);
            this.f13574m = true;
        }
        return this.f13575n;
    }

    private int y(int i11, int i12) {
        int i13 = i11 - i12;
        if (i11 * i13 <= 0) {
            return 0;
        }
        return i13;
    }

    protected int B() {
        PointF pointF = this.f13572k;
        if (pointF == null) {
            return 0;
        }
        float f11 = pointF.y;
        if (f11 == BitmapDescriptorFactory.HUE_RED) {
            return 0;
        }
        return f11 > BitmapDescriptorFactory.HUE_RED ? 1 : -1;
    }

    @SuppressLint({"UnknownNullness"})
    protected void C(RecyclerView.b0.a aVar) {
        PointF pointFA = a(f());
        if (pointFA == null || (pointFA.x == BitmapDescriptorFactory.HUE_RED && pointFA.y == BitmapDescriptorFactory.HUE_RED)) {
            aVar.b(f());
            r();
            return;
        }
        i(pointFA);
        this.f13572k = pointFA;
        this.f13576o = (int) (pointFA.x * 10000.0f);
        this.f13577p = (int) (pointFA.y * 10000.0f);
        aVar.d((int) (this.f13576o * 1.2f), (int) (this.f13577p * 1.2f), (int) (x(10000) * 1.2f), this.f13570i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.b0
    @SuppressLint({"UnknownNullness"})
    protected void l(int i11, int i12, RecyclerView.c0 c0Var, RecyclerView.b0.a aVar) {
        if (c() == 0) {
            r();
            return;
        }
        this.f13576o = y(this.f13576o, i11);
        int iY = y(this.f13577p, i12);
        this.f13577p = iY;
        if (this.f13576o == 0 && iY == 0) {
            C(aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.b0
    protected void m() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.b0
    protected void n() {
        this.f13577p = 0;
        this.f13576o = 0;
        this.f13572k = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.b0
    @SuppressLint({"UnknownNullness"})
    protected void o(View view, RecyclerView.c0 c0Var, RecyclerView.b0.a aVar) {
        int iT = t(view, z());
        int iU = u(view, B());
        int iW = w((int) Math.sqrt((iT * iT) + (iU * iU)));
        if (iW > 0) {
            aVar.d(-iT, -iU, iW, this.f13571j);
        }
    }

    public int s(int i11, int i12, int i13, int i14, int i15) {
        if (i15 == -1) {
            return i13 - i11;
        }
        if (i15 != 0) {
            if (i15 == 1) {
                return i14 - i12;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i16 = i13 - i11;
        if (i16 > 0) {
            return i16;
        }
        int i17 = i14 - i12;
        if (i17 < 0) {
            return i17;
        }
        return 0;
    }

    @SuppressLint({"UnknownNullness"})
    public int t(View view, int i11) {
        RecyclerView.q qVarE = e();
        if (qVarE == null || !qVarE.q()) {
            return 0;
        }
        RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
        return s(qVarE.W(view) - ((ViewGroup.MarginLayoutParams) rVar).leftMargin, qVarE.Z(view) + ((ViewGroup.MarginLayoutParams) rVar).rightMargin, qVarE.j0(), qVarE.t0() - qVarE.k0(), i11);
    }

    @SuppressLint({"UnknownNullness"})
    public int u(View view, int i11) {
        RecyclerView.q qVarE = e();
        if (qVarE == null || !qVarE.r()) {
            return 0;
        }
        RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
        return s(qVarE.a0(view) - ((ViewGroup.MarginLayoutParams) rVar).topMargin, qVarE.U(view) + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin, qVarE.l0(), qVarE.c0() - qVarE.i0(), i11);
    }

    @SuppressLint({"UnknownNullness"})
    protected float v(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    protected int w(int i11) {
        return (int) Math.ceil(((double) x(i11)) / 0.3356d);
    }

    protected int x(int i11) {
        return (int) Math.ceil(Math.abs(i11) * A());
    }

    protected int z() {
        PointF pointF = this.f13572k;
        if (pointF == null) {
            return 0;
        }
        float f11 = pointF.x;
        if (f11 == BitmapDescriptorFactory.HUE_RED) {
            return 0;
        }
        return f11 > BitmapDescriptorFactory.HUE_RED ? 1 : -1;
    }
}
