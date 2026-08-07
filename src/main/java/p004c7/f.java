package p004c7;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes.dex */
public final class f extends b<f> {
    private g A;
    private float B;
    private boolean C;

    public f(e eVar) {
        super(eVar);
        this.A = null;
        this.B = Float.MAX_VALUE;
        this.C = false;
    }

    private void x() {
        g gVar = this.A;
        if (gVar == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double dA = gVar.a();
        if (dA > this.f18876g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (dA < this.f18877h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
    }

    @Override // p004c7.b
    public void d() {
        super.d();
        float f11 = this.B;
        if (f11 != Float.MAX_VALUE) {
            g gVar = this.A;
            if (gVar == null) {
                this.A = new g(f11);
            } else {
                gVar.e(f11);
            }
            this.B = Float.MAX_VALUE;
        }
    }

    @Override // p004c7.b
    public void q() {
        x();
        this.A.g(g());
        super.q();
    }

    @Override // p004c7.b
    boolean s(long j11) {
        if (this.C) {
            float f11 = this.B;
            if (f11 != Float.MAX_VALUE) {
                this.A.e(f11);
                this.B = Float.MAX_VALUE;
            }
            this.f18871b = this.A.a();
            this.f18870a = BitmapDescriptorFactory.HUE_RED;
            this.C = false;
            return true;
        }
        if (this.B != Float.MAX_VALUE) {
            long j12 = j11 / 2;
            b.p pVarH = this.A.h(this.f18871b, this.f18870a, j12);
            this.A.e(this.B);
            this.B = Float.MAX_VALUE;
            b.p pVarH2 = this.A.h(pVarH.f18884a, pVarH.f18885b, j12);
            this.f18871b = pVarH2.f18884a;
            this.f18870a = pVarH2.f18885b;
        } else {
            b.p pVarH3 = this.A.h(this.f18871b, this.f18870a, j11);
            this.f18871b = pVarH3.f18884a;
            this.f18870a = pVarH3.f18885b;
        }
        float fMax = Math.max(this.f18871b, this.f18877h);
        this.f18871b = fMax;
        float fMin = Math.min(fMax, this.f18876g);
        this.f18871b = fMin;
        if (!w(fMin, this.f18870a)) {
            return false;
        }
        this.f18871b = this.A.a();
        this.f18870a = BitmapDescriptorFactory.HUE_RED;
        return true;
    }

    public void t(float f11) {
        if (h()) {
            this.B = f11;
            return;
        }
        if (this.A == null) {
            this.A = new g(f11);
        }
        this.A.e(f11);
        q();
    }

    public boolean u() {
        return this.A.f18891b > 0.0d;
    }

    public g v() {
        return this.A;
    }

    boolean w(float f11, float f12) {
        return this.A.c(f11, f12);
    }

    public f y(g gVar) {
        this.A = gVar;
        return this;
    }

    public void z() {
        if (!u()) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f18875f) {
            this.C = true;
        }
    }

    public f(e eVar, float f11) {
        super(eVar);
        this.A = null;
        this.B = Float.MAX_VALUE;
        this.C = false;
        this.A = new g(f11);
    }

    public <K> f(K k11, d<K> dVar) {
        super(k11, dVar);
        this.A = null;
        this.B = Float.MAX_VALUE;
        this.C = false;
    }

    @Override // p004c7.b
    void p(float f11) {
    }
}
