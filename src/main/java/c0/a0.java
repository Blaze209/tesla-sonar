package c0;

import android.graphics.PointF;
import android.view.Display;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends c1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f18230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f18231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    private final Display f18232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    private final n f18233e;

    public a0(@NonNull Display display, @NonNull n nVar, float f11, float f12) {
        this.f18230b = f11;
        this.f18231c = f12;
        this.f18232d = display;
        this.f18233e = nVar;
    }

    private int f(boolean z11) {
        try {
            int i11 = this.f18233e.i(this.f18232d.getRotation());
            return z11 ? (360 - i11) % 360 : i11;
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // c0.c1
    @NonNull
    protected PointF a(float f11, float f12) {
        float f13 = this.f18230b;
        float f14 = this.f18231c;
        boolean z11 = this.f18233e.f() == 0;
        int iF = f(z11);
        if (iF != 90 && iF != 270) {
            f12 = f11;
            f11 = f12;
            f14 = f13;
            f13 = f14;
        }
        if (iF == 90) {
            f11 = f13 - f11;
        } else if (iF == 180) {
            f12 = f14 - f12;
            f11 = f13 - f11;
        } else if (iF == 270) {
            f12 = f14 - f12;
        }
        if (z11) {
            f12 = f14 - f12;
        }
        return new PointF(f12 / f14, f11 / f13);
    }
}
