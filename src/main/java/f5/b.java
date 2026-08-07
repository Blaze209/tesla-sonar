package f5;

import androidx.constraintlayout.motion.widget.o;
import b5.k;
import b5.m;
import b5.n;

/* JADX INFO: loaded from: classes.dex */
public class b extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n f64385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private k f64386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private m f64387c;

    public b() {
        n nVar = new n();
        this.f64385a = nVar;
        this.f64387c = nVar;
    }

    @Override // androidx.constraintlayout.motion.widget.o
    public float a() {
        return this.f64387c.a();
    }

    public void b(float f11, float f12, float f13, float f14, float f15, float f16) {
        n nVar = this.f64385a;
        this.f64387c = nVar;
        nVar.d(f11, f12, f13, f14, f15, f16);
    }

    public boolean c() {
        return this.f64387c.b();
    }

    public void d(float f11, float f12, float f13, float f14, float f15, float f16, float f17, int i11) {
        if (this.f64386b == null) {
            this.f64386b = new k();
        }
        k kVar = this.f64386b;
        this.f64387c = kVar;
        kVar.d(f11, f12, f13, f14, f15, f16, f17, i11);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f11) {
        return this.f64387c.getInterpolation(f11);
    }
}
