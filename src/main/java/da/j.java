package da;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements l0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f60050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<p7.u> f60051b;

    public j(int i11) {
        this(i11, com.google.common.collect.x.r());
    }

    private g0 c(l0.b bVar) {
        return new g0(e(bVar), "video/mp2t");
    }

    private o0 d(l0.b bVar) {
        return new o0(e(bVar), "video/mp2t");
    }

    private List<p7.u> e(l0.b bVar) {
        String str;
        int i11;
        if (f(32)) {
            return this.f60051b;
        }
        s7.c0 c0Var = new s7.c0(bVar.f60112e);
        List<p7.u> arrayList = this.f60051b;
        while (c0Var.a() > 0) {
            int iM = c0Var.M();
            int iG = c0Var.g() + c0Var.M();
            if (iM == 134) {
                arrayList = new ArrayList<>();
                int iM2 = c0Var.M() & 31;
                for (int i12 = 0; i12 < iM2; i12++) {
                    String strJ = c0Var.J(3);
                    int iM3 = c0Var.M();
                    boolean z11 = (iM3 & 128) != 0;
                    if (z11) {
                        i11 = iM3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i11 = 1;
                    }
                    byte bM = (byte) c0Var.M();
                    c0Var.c0(1);
                    arrayList.add(new p7.u.b().y0(str).n0(strJ).Q(i11).k0(z11 ? s7.k.g((bM & 64) != 0) : null).P());
                }
            }
            c0Var.b0(iG);
        }
        return arrayList;
    }

    private boolean f(int i11) {
        return (i11 & this.f60050a) != 0;
    }

    @Override // da.l0.c
    public SparseArray<l0> a() {
        return new SparseArray<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:38:0x0059  */
    @Override // da.l0.c
    public l0 b(int i11, l0.b bVar) {
        if (i11 != 2) {
            if (i11 == 3 || i11 == 4) {
                return new y(new t(bVar.f60109b, bVar.a(), "video/mp2t"));
            }
            if (i11 == 21) {
                return new y(new r("video/mp2t"));
            }
            if (i11 == 27) {
                if (f(4)) {
                    return null;
                }
                return new y(new p(c(bVar), f(1), f(8), "video/mp2t"));
            }
            if (i11 == 36) {
                return new y(new q(c(bVar), "video/mp2t"));
            }
            if (i11 == 45) {
                return new y(new u("video/mp2t"));
            }
            if (i11 == 89) {
                return new y(new l(bVar.f60111d, "video/mp2t"));
            }
            if (i11 == 172) {
                return new y(new f(bVar.f60109b, bVar.a(), "video/mp2t"));
            }
            if (i11 == 257) {
                return new e0(new x("application/vnd.dvb.ait", "video/mp2t"));
            }
            if (i11 != 138) {
                if (i11 == 139) {
                    return new y(new k(bVar.f60109b, bVar.a(), 5408, "video/mp2t"));
                }
                switch (i11) {
                    case 15:
                        if (f(2)) {
                            return null;
                        }
                        return new y(new i(false, bVar.f60109b, bVar.a(), "video/mp2t"));
                    case 16:
                        return new y(new o(d(bVar), "video/mp2t"));
                    case 17:
                        if (f(2)) {
                            return null;
                        }
                        return new y(new s(bVar.f60109b, bVar.a(), "video/mp2t"));
                    default:
                        switch (i11) {
                            case 128:
                                break;
                            case SDK_ASSET_ILLUSTRATION_FORM_VALUE:
                                return new y(new c(bVar.f60109b, bVar.a(), "video/mp2t"));
                            case SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE:
                                if (!f(64)) {
                                    return null;
                                }
                                break;
                            default:
                                switch (i11) {
                                    case 134:
                                        if (f(16)) {
                                            return null;
                                        }
                                        return new e0(new x("application/x-scte35", "video/mp2t"));
                                    case 135:
                                        return new y(new c(bVar.f60109b, bVar.a(), "video/mp2t"));
                                    case 136:
                                        break;
                                    default:
                                        return null;
                                }
                                break;
                        }
                        break;
                }
            }
            return new y(new k(bVar.f60109b, bVar.a(), 4096, "video/mp2t"));
        }
        return new y(new n(d(bVar), "video/mp2t"));
    }

    public j(int i11, List<p7.u> list) {
        this.f60050a = i11;
        this.f60051b = list;
    }
}
