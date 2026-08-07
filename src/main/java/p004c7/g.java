package p004c7;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    double f18890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    double f18891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f18892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f18893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f18894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double f18895f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private double f18896g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private double f18897h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private double f18898i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final b.p f18899j;

    public g() {
        this.f18890a = Math.sqrt(1500.0d);
        this.f18891b = 0.5d;
        this.f18892c = false;
        this.f18898i = Double.MAX_VALUE;
        this.f18899j = new b.p();
    }

    private void b() {
        if (this.f18892c) {
            return;
        }
        if (this.f18898i == Double.MAX_VALUE) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        double d11 = this.f18891b;
        if (d11 > 1.0d) {
            double d12 = this.f18890a;
            this.f18895f = ((-d11) * d12) + (d12 * Math.sqrt((d11 * d11) - 1.0d));
            double d13 = this.f18891b;
            double d14 = this.f18890a;
            this.f18896g = ((-d13) * d14) - (d14 * Math.sqrt((d13 * d13) - 1.0d));
        } else if (d11 >= 0.0d && d11 < 1.0d) {
            this.f18897h = this.f18890a * Math.sqrt(1.0d - (d11 * d11));
        }
        this.f18892c = true;
    }

    public float a() {
        return (float) this.f18898i;
    }

    public boolean c(float f11, float f12) {
        return ((double) Math.abs(f12)) < this.f18894e && ((double) Math.abs(f11 - a())) < this.f18893d;
    }

    public g d(float f11) {
        if (f11 < BitmapDescriptorFactory.HUE_RED) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f18891b = f11;
        this.f18892c = false;
        return this;
    }

    public g e(float f11) {
        this.f18898i = f11;
        return this;
    }

    public g f(float f11) {
        if (f11 <= BitmapDescriptorFactory.HUE_RED) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f18890a = Math.sqrt(f11);
        this.f18892c = false;
        return this;
    }

    void g(double d11) {
        double dAbs = Math.abs(d11);
        this.f18893d = dAbs;
        this.f18894e = dAbs * 62.5d;
    }

    b.p h(double d11, double d12, long j11) {
        double dPow;
        double dCos;
        b();
        double d13 = j11 / 1000.0d;
        double d14 = d11 - this.f18898i;
        double d15 = this.f18891b;
        if (d15 > 1.0d) {
            double d16 = this.f18896g;
            double d17 = this.f18895f;
            double d18 = d14 - (((d16 * d14) - d12) / (d16 - d17));
            double d19 = ((d14 * d16) - d12) / (d16 - d17);
            dPow = (Math.pow(2.718281828459045d, d16 * d13) * d18) + (Math.pow(2.718281828459045d, this.f18895f * d13) * d19);
            double d21 = this.f18896g;
            double dPow2 = d18 * d21 * Math.pow(2.718281828459045d, d21 * d13);
            double d22 = this.f18895f;
            dCos = dPow2 + (d19 * d22 * Math.pow(2.718281828459045d, d22 * d13));
        } else if (d15 == 1.0d) {
            double d23 = this.f18890a;
            double d24 = d12 + (d23 * d14);
            double d25 = d14 + (d24 * d13);
            dPow = Math.pow(2.718281828459045d, (-d23) * d13) * d25;
            double dPow3 = d25 * Math.pow(2.718281828459045d, (-this.f18890a) * d13);
            double d26 = this.f18890a;
            dCos = (d24 * Math.pow(2.718281828459045d, (-d26) * d13)) + (dPow3 * (-d26));
        } else {
            double d27 = 1.0d / this.f18897h;
            double d28 = this.f18890a;
            double d29 = d27 * ((d15 * d28 * d14) + d12);
            dPow = Math.pow(2.718281828459045d, (-d15) * d28 * d13) * ((Math.cos(this.f18897h * d13) * d14) + (Math.sin(this.f18897h * d13) * d29));
            double d31 = this.f18890a;
            double d32 = this.f18891b;
            double dPow4 = Math.pow(2.718281828459045d, (-d32) * d31 * d13);
            double d33 = this.f18897h;
            double dSin = (-d33) * d14 * Math.sin(d33 * d13);
            double d34 = this.f18897h;
            dCos = ((-d31) * dPow * d32) + (dPow4 * (dSin + (d29 * d34 * Math.cos(d34 * d13))));
        }
        b.p pVar = this.f18899j;
        pVar.f18884a = (float) (dPow + this.f18898i);
        pVar.f18885b = (float) dCos;
        return pVar;
    }

    public g(float f11) {
        this.f18890a = Math.sqrt(1500.0d);
        this.f18891b = 0.5d;
        this.f18892c = false;
        this.f18898i = Double.MAX_VALUE;
        this.f18899j = new b.p();
        this.f18898i = f11;
    }
}
