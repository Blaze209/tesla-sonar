package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes5.dex */
final class k extends h<n> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f42547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f42548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f42549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f42550e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f42551f;

    k(@NonNull n nVar) {
        super(nVar);
        this.f42547b = 300.0f;
    }

    private void h(@NonNull Canvas canvas, @NonNull Paint paint, float f11, float f12, int i11, int i12, int i13) {
        float f13;
        float fA = o5.a.a(f11, BitmapDescriptorFactory.HUE_RED, 1.0f);
        float fA2 = o5.a.a(f12, BitmapDescriptorFactory.HUE_RED, 1.0f);
        float fD = mt.a.d(1.0f - this.f42551f, 1.0f, fA);
        float fD2 = mt.a.d(1.0f - this.f42551f, 1.0f, fA2);
        int iA = (int) ((i12 * o5.a.a(fD, BitmapDescriptorFactory.HUE_RED, 0.01f)) / 0.01f);
        int iA2 = (int) ((i13 * (1.0f - o5.a.a(fD2, 0.99f, 1.0f))) / 0.01f);
        float f14 = this.f42547b;
        int i14 = (int) ((fD * f14) + iA);
        int i15 = (int) ((fD2 * f14) - iA2);
        float f15 = (-f14) / 2.0f;
        if (i14 <= i15) {
            float f16 = this.f42549d;
            float f17 = i14 + f16;
            float f18 = i15 - f16;
            float f19 = f16 * 2.0f;
            paint.setColor(i11);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.f42548c);
            if (f17 >= f18) {
                j(canvas, paint, new PointF(f17 + f15, BitmapDescriptorFactory.HUE_RED), new PointF(f18 + f15, BitmapDescriptorFactory.HUE_RED), f19, this.f42548c);
                return;
            }
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(this.f42550e ? Paint.Cap.ROUND : Paint.Cap.BUTT);
            float f21 = f17 + f15;
            float f22 = f18 + f15;
            canvas.drawLine(f21, BitmapDescriptorFactory.HUE_RED, f22, BitmapDescriptorFactory.HUE_RED, paint);
            if (this.f42550e || this.f42549d <= BitmapDescriptorFactory.HUE_RED) {
                return;
            }
            paint.setStyle(Paint.Style.FILL);
            if (f17 > BitmapDescriptorFactory.HUE_RED) {
                f13 = f19;
                i(canvas, paint, new PointF(f21, BitmapDescriptorFactory.HUE_RED), f13, this.f42548c);
            } else {
                f13 = f19;
            }
            if (f18 < this.f42547b) {
                i(canvas, paint, new PointF(f22, BitmapDescriptorFactory.HUE_RED), f13, this.f42548c);
            }
        }
    }

    private void i(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull PointF pointF, float f11, float f12) {
        j(canvas, paint, pointF, null, f11, f12);
    }

    private void j(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull PointF pointF, PointF pointF2, float f11, float f12) {
        float fMin = Math.min(f12, this.f42548c);
        float f13 = f11 / 2.0f;
        float fMin2 = Math.min(f13, (this.f42549d * fMin) / this.f42548c);
        RectF rectF = new RectF((-f11) / 2.0f, (-fMin) / 2.0f, f13, fMin / 2.0f);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (pointF2 != null) {
            canvas.translate(pointF2.x, pointF2.y);
            Path path = new Path();
            path.addRoundRect(rectF, fMin2, fMin2, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.translate(-pointF2.x, -pointF2.y);
        }
        canvas.translate(pointF.x, pointF.y);
        canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        canvas.restore();
    }

    @Override // com.google.android.material.progressindicator.h
    void a(@NonNull Canvas canvas, @NonNull Rect rect, float f11, boolean z11, boolean z12) {
        this.f42547b = rect.width();
        float f12 = ((n) this.f42537a).f42484a;
        canvas.translate(rect.left + (rect.width() / 2.0f), rect.top + (rect.height() / 2.0f) + Math.max(BitmapDescriptorFactory.HUE_RED, (rect.height() - f12) / 2.0f));
        if (((n) this.f42537a).f42575j) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f13 = this.f42547b / 2.0f;
        float f14 = f12 / 2.0f;
        canvas.clipRect(-f13, -f14, f13, f14);
        S s11 = this.f42537a;
        this.f42550e = ((n) s11).f42484a / 2 == ((n) s11).f42485b;
        this.f42548c = ((n) s11).f42484a * f11;
        this.f42549d = Math.min(((n) s11).f42484a / 2, ((n) s11).f42485b) * f11;
        if (z11 || z12) {
            if ((z11 && ((n) this.f42537a).f42488e == 2) || (z12 && ((n) this.f42537a).f42489f == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z11 || (z12 && ((n) this.f42537a).f42489f != 3)) {
                canvas.translate(BitmapDescriptorFactory.HUE_RED, (((n) this.f42537a).f42484a * (1.0f - f11)) / 2.0f);
            }
        }
        if (z12 && ((n) this.f42537a).f42489f == 3) {
            this.f42551f = f11;
        } else {
            this.f42551f = 1.0f;
        }
    }

    @Override // com.google.android.material.progressindicator.h
    void b(@NonNull Canvas canvas, @NonNull Paint paint, int i11, int i12) {
        int iA = ht.a.a(i11, i12);
        if (((n) this.f42537a).f42576k <= 0 || iA == 0) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(iA);
        PointF pointF = new PointF((this.f42547b / 2.0f) - (this.f42548c / 2.0f), BitmapDescriptorFactory.HUE_RED);
        S s11 = this.f42537a;
        i(canvas, paint, pointF, ((n) s11).f42576k, ((n) s11).f42576k);
    }

    @Override // com.google.android.material.progressindicator.h
    void c(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull h.a aVar, int i11) {
        int iA = ht.a.a(aVar.f42540c, i11);
        float f11 = aVar.f42538a;
        float f12 = aVar.f42539b;
        int i12 = aVar.f42541d;
        h(canvas, paint, f11, f12, iA, i12, i12);
    }

    @Override // com.google.android.material.progressindicator.h
    void d(@NonNull Canvas canvas, @NonNull Paint paint, float f11, float f12, int i11, int i12, int i13) {
        h(canvas, paint, f11, f12, ht.a.a(i11, i12), i13, i13);
    }

    @Override // com.google.android.material.progressindicator.h
    int e() {
        return ((n) this.f42537a).f42484a;
    }

    @Override // com.google.android.material.progressindicator.h
    int f() {
        return -1;
    }
}
