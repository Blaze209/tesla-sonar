package lx;

import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes5.dex */
public class c implements nx.a.InterfaceC2036a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final mx.b f90877c = new mx.b(1.0d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private kx.b f90878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f90879b;

    public c(LatLng latLng, double d11) {
        this.f90878a = f90877c.a(latLng);
        if (d11 >= 0.0d) {
            this.f90879b = d11;
        } else {
            this.f90879b = 1.0d;
        }
    }

    @Override // nx.a.InterfaceC2036a
    public kx.b a() {
        return this.f90878a;
    }

    public double b() {
        return this.f90879b;
    }

    public c(LatLng latLng) {
        this(latLng, 1.0d);
    }
}
