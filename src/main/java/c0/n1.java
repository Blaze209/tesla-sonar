package c0;

import android.graphics.PointF;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class n1 extends c1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f18374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f18375c;

    public n1(float f11, float f12) {
        this.f18374b = f11;
        this.f18375c = f12;
    }

    @Override // c0.c1
    @NonNull
    protected PointF a(float f11, float f12) {
        return new PointF(f11 / this.f18374b, f12 / this.f18375c);
    }
}
