package rr;

import android.util.SparseArray;
import com.google.android.exoplayer2.u0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class j implements i0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f108853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<u0> f108854b;

    public j(int i11) {
        this(i11, com.google.common.collect.x.r());
    }

    private d0 c(i0.b bVar) {
        return new d0(e(bVar));
    }

    private k0 d(i0.b bVar) {
        return new k0(e(bVar));
    }

    private List<u0> e(i0.b bVar) {
        String str;
        int i11;
        if (f(32)) {
            return this.f108854b;
        }
        ts.d0 d0Var = new ts.d0(bVar.f108847d);
        List<u0> arrayList = this.f108854b;
        while (d0Var.a() > 0) {
            int iH = d0Var.H();
            int iF = d0Var.f() + d0Var.H();
            if (iH == 134) {
                arrayList = new ArrayList<>();
                int iH2 = d0Var.H() & 31;
                for (int i12 = 0; i12 < iH2; i12++) {
                    String strE = d0Var.E(3);
                    int iH3 = d0Var.H();
                    boolean z11 = (iH3 & 128) != 0;
                    if (z11) {
                        i11 = iH3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i11 = 1;
                    }
                    byte bH = (byte) d0Var.H();
                    d0Var.V(1);
                    arrayList.add(new u0.b().g0(str).X(strE).H(i11).V(z11 ? ts.e.b((bH & 64) != 0) : null).G());
                }
            }
            d0Var.U(iF);
        }
        return arrayList;
    }

    private boolean f(int i11) {
        return (i11 & this.f108853a) != 0;
    }

    @Override // rr.i0.c
    public SparseArray<i0> a() {
        return new SparseArray<>();
    }

    @Override // rr.i0.c
    public i0 b(int i11, i0.b bVar) {
        if (i11 != 2) {
            if (i11 == 3 || i11 == 4) {
                return new w(new t(bVar.f108845b));
            }
            if (i11 == 21) {
                return new w(new r());
            }
            if (i11 == 27) {
                if (f(4)) {
                    return null;
                }
                return new w(new p(c(bVar), f(1), f(8)));
            }
            if (i11 == 36) {
                return new w(new q(c(bVar)));
            }
            if (i11 == 89) {
                return new w(new l(bVar.f108846c));
            }
            if (i11 != 138) {
                if (i11 == 172) {
                    return new w(new f(bVar.f108845b));
                }
                if (i11 == 257) {
                    return new c0(new v("application/vnd.dvb.ait"));
                }
                if (i11 == 134) {
                    if (f(16)) {
                        return null;
                    }
                    return new c0(new v("application/x-scte35"));
                }
                if (i11 != 135) {
                    switch (i11) {
                        case 15:
                            if (f(2)) {
                                return null;
                            }
                            return new w(new i(false, bVar.f108845b));
                        case 16:
                            return new w(new o(d(bVar)));
                        case 17:
                            if (f(2)) {
                                return null;
                            }
                            return new w(new s(bVar.f108845b));
                        default:
                            switch (i11) {
                                case 128:
                                    break;
                                case SDK_ASSET_ILLUSTRATION_FORM_VALUE:
                                    break;
                                case SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE:
                                    if (!f(64)) {
                                        return null;
                                    }
                                    break;
                                default:
                                    return null;
                            }
                            break;
                    }
                }
                return new w(new c(bVar.f108845b));
            }
            return new w(new k(bVar.f108845b));
        }
        return new w(new n(d(bVar)));
    }

    public j(int i11, List<u0> list) {
        this.f108853a = i11;
        this.f108854b = list;
    }
}
