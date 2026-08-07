package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes5.dex */
final class c extends h<e> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f42491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f42492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f42493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f42494e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f42495f;

    c(@NonNull e eVar) {
        super(eVar);
    }

    private void h(@NonNull Canvas canvas, @NonNull Paint paint, float f11, float f12, int i11, int i12, int i13) {
        float f13 = f12 >= f11 ? f12 - f11 : (f12 + 1.0f) - f11;
        float f14 = f11 % 1.0f;
        if (this.f42495f < 1.0f) {
            float f15 = f14 + f13;
            if (f15 > 1.0f) {
                h(canvas, paint, f14, 1.0f, i11, i12, 0);
                h(canvas, paint, 1.0f, f15, i11, 0, i13);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.f42492c / this.f42493d);
        if (f14 == BitmapDescriptorFactory.HUE_RED && f13 >= 0.99f) {
            f13 += ((f13 - 0.99f) * ((degrees * 2.0f) / 360.0f)) / 0.01f;
        }
        float fD = mt.a.d(1.0f - this.f42495f, 1.0f, f14);
        float fD2 = mt.a.d(BitmapDescriptorFactory.HUE_RED, this.f42495f, f13);
        float degrees2 = (float) Math.toDegrees(i12 / this.f42493d);
        float degrees3 = ((fD2 * 360.0f) - degrees2) - ((float) Math.toDegrees(i13 / this.f42493d));
        float f16 = (fD * 360.0f) + degrees2;
        if (degrees3 <= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        paint.setAntiAlias(true);
        paint.setColor(i11);
        paint.setStrokeWidth(this.f42491b);
        float f17 = degrees * 2.0f;
        if (degrees3 < f17) {
            float f18 = degrees3 / f17;
            paint.setStyle(Paint.Style.FILL);
            j(canvas, paint, f16 + (degrees * f18), this.f42492c * 2.0f, this.f42491b, f18);
            return;
        }
        float f19 = this.f42493d;
        RectF rectF = new RectF(-f19, -f19, f19, f19);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(this.f42494e ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        float f21 = f16 + degrees;
        canvas.drawArc(rectF, f21, degrees3 - f17, false, paint);
        if (this.f42494e || this.f42492c <= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        i(canvas, paint, f21, this.f42492c * 2.0f, this.f42491b);
        i(canvas, paint, (f16 + degrees3) - degrees, this.f42492c * 2.0f, this.f42491b);
    }

    private void i(@NonNull Canvas canvas, @NonNull Paint paint, float f11, float f12, float f13) {
        j(canvas, paint, f11, f12, f13, 1.0f);
    }

    private void j(@NonNull Canvas canvas, @NonNull Paint paint, float f11, float f12, float f13, float f14) {
        float fMin = (int) Math.min(f13, this.f42491b);
        float f15 = f12 / 2.0f;
        float fMin2 = Math.min(f15, (this.f42492c * fMin) / this.f42491b);
        RectF rectF = new RectF((-fMin) / 2.0f, (-f12) / 2.0f, fMin / 2.0f, f15);
        canvas.save();
        double d11 = f11;
        canvas.translate((float) (((double) this.f42493d) * Math.cos(Math.toRadians(d11))), (float) (((double) this.f42493d) * Math.sin(Math.toRadians(d11))));
        canvas.rotate(f11);
        canvas.scale(f14, f14);
        canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        canvas.restore();
    }

    private int k() {
        S s11 = this.f42537a;
        return ((e) s11).f42511h + (((e) s11).f42512i * 2);
    }

    @Override // com.google.android.material.progressindicator.h
    void a(@NonNull Canvas canvas, @NonNull Rect rect, float f11, boolean z11, boolean z12) {
        float fWidth = rect.width() / f();
        float fHeight = rect.height() / e();
        S s11 = this.f42537a;
        float f12 = (((e) s11).f42511h / 2.0f) + ((e) s11).f42512i;
        canvas.translate((f12 * fWidth) + rect.left, (f12 * fHeight) + rect.top);
        canvas.rotate(-90.0f);
        canvas.scale(fWidth, fHeight);
        if (((e) this.f42537a).f42513j != 0) {
            canvas.scale(1.0f, -1.0f);
        }
        float f13 = -f12;
        canvas.clipRect(f13, f13, f12, f12);
        S s12 = this.f42537a;
        this.f42494e = ((e) s12).f42484a / 2 <= ((e) s12).f42485b;
        this.f42491b = ((e) s12).f42484a * f11;
        this.f42492c = Math.min(((e) s12).f42484a / 2, ((e) s12).f42485b) * f11;
        S s13 = this.f42537a;
        float f14 = (((e) s13).f42511h - ((e) s13).f42484a) / 2.0f;
        this.f42493d = f14;
        if (z11 || z12) {
            if ((z11 && ((e) s13).f42488e == 2) || (z12 && ((e) s13).f42489f == 1)) {
                this.f42493d = f14 + (((1.0f - f11) * ((e) s13).f42484a) / 2.0f);
            } else if ((z11 && ((e) s13).f42488e == 1) || (z12 && ((e) s13).f42489f == 2)) {
                this.f42493d = f14 - (((1.0f - f11) * ((e) s13).f42484a) / 2.0f);
            }
        }
        if (z12 && ((e) s13).f42489f == 3) {
            this.f42495f = f11;
        } else {
            this.f42495f = 1.0f;
        }
    }

    @Override // com.google.android.material.progressindicator.h
    void b(@NonNull Canvas canvas, @NonNull Paint paint, int i11, int i12) {
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
        return k();
    }

    @Override // com.google.android.material.progressindicator.h
    int f() {
        return k();
    }
}
