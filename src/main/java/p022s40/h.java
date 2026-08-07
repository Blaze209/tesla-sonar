package p022s40;

import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.x;
import androidx.compose.ui.platform.p1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import i40.i;
import jn0.h0;
import o90.f;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w2;
import q1.b0;
import v1.e;
import wn0.p;
import wn0.q;
import z3.k;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a-\u0010\u0007\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "institutionIcon", "Landroidx/compose/ui/d;", "modifier", "", "disablePlaceholder", "Ljn0/h0;", "a", "(Ljava/lang/String;Landroidx/compose/ui/d;ZLr2/l;II)V", "b", "(Landroidx/compose/ui/d;Lr2/l;I)V", "financial-connections_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class h {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv1/e;", "Ljn0/h0;", "a", "(Lv1/e;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements q<e, l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f109918c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.d dVar) {
            super(3);
            this.f109918c = dVar;
        }

        public final void a(e StripeImage, l lVar, int i11) {
            s.k(StripeImage, "$this$StripeImage");
            if ((i11 & 81) == 16 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(-208683345, i11, -1, "com.stripe.android.financialconnections.features.common.InstitutionIcon.<anonymous> (InstitutionIcon.kt:45)");
            }
            h.b(this.f109918c, lVar, 0);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ h0 invoke(e eVar, l lVar, Integer num) {
            a(eVar, lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv1/e;", "Ljn0/h0;", "a", "(Lv1/e;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements q<e, l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f109919c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.d dVar) {
            super(3);
            this.f109919c = dVar;
        }

        public final void a(e StripeImage, l lVar, int i11) {
            s.k(StripeImage, "$this$StripeImage");
            if ((i11 & 81) == 16 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(1510239003, i11, -1, "com.stripe.android.financialconnections.features.common.InstitutionIcon.<anonymous> (InstitutionIcon.kt:44)");
            }
            g.a(androidx.compose.foundation.b.d(this.f109919c, p026y50.d.f125064a.a(lVar, 6).getBackgroundOffset(), null, 2, null), lVar, 0);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ h0 invoke(e eVar, l lVar, Integer num) {
            a(eVar, lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class c extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f109920c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f109921d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f109922e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f109923f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f109924g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, androidx.compose.ui.d dVar, boolean z11, int i11, int i12) {
            super(2);
            this.f109920c = str;
            this.f109921d = dVar;
            this.f109922e = z11;
            this.f109923f = i11;
            this.f109924g = i12;
        }

        public final void a(l lVar, int i11) {
            h.a(this.f109920c, this.f109921d, this.f109922e, lVar, k2.a(this.f109923f | 1), this.f109924g);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class d extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f109925c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f109926d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.compose.ui.d dVar, int i11) {
            super(2);
            this.f109925c = dVar;
            this.f109926d = i11;
        }

        public final void a(l lVar, int i11) {
            h.b(this.f109925c, lVar, k2.a(this.f109926d | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0043  */
    /* JADX WARN: Code duplicated, block: B:28:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x004c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0054  */
    /* JADX WARN: Code duplicated, block: B:33:0x0057  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:46:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x007a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:55:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ed A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:58:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:63:0x0151  */
    /* JADX WARN: Code duplicated, block: B:67:0x015e  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    public static final void a(String str, androidx.compose.ui.d dVar, boolean z11, l lVar, int i11, int i12) {
        int i13;
        androidx.compose.ui.d dVar2;
        int i14;
        boolean z12;
        int i15;
        androidx.compose.ui.d dVar3;
        boolean z13;
        boolean zBooleanValue;
        androidx.compose.ui.d dVarB;
        androidx.compose.ui.d dVar4;
        androidx.compose.ui.d dVar5;
        boolean z14;
        androidx.compose.ui.d dVar6;
        w2 w2VarX;
        l lVarV = lVar.v(-1092343159);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (lVarV.n(str) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i16 = i12 & 2;
        if (i16 == 0) {
            if ((i11 & 112) == 0) {
                dVar2 = dVar;
                i13 |= lVarV.n(dVar2) ? 32 : 16;
            }
            i14 = i12 & 4;
            if (i14 != 0) {
                if ((i11 & 896) == 0) {
                    z12 = z11;
                    if (lVarV.p(z12)) {
                        i15 = 256;
                    } else {
                        i15 = 128;
                    }
                    i13 |= i15;
                }
                if ((i13 & 731) == 146 || !lVarV.b()) {
                    if (i16 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (o.J()) {
                        o.S(-1092343159, i13, -1, "com.stripe.android.financialconnections.features.common.InstitutionIcon (InstitutionIcon.kt:24)");
                    }
                    zBooleanValue = ((Boolean) lVarV.U(p1.a())).booleanValue();
                    dVarB = h3.l.b(x.q(dVar3, w4.h.g(56)), w4.h.g(1), a2.g.c(w4.h.g(12)), true, 0L, 0L, 24, null);
                    if (str == null || !z13) {
                        dVar4 = dVar3;
                        if (!zBooleanValue || str == null) {
                            dVar5 = dVar4;
                            lVarV.H(-855772906);
                            b(dVarB, lVarV, 0);
                            lVarV.T();
                        } else {
                            lVarV.H(-855684308);
                            dVar5 = dVar4;
                            com.stripe.android.uicore.image.a.a(str, (f) lVarV.U(v50.b.d()), null, dVarB, k.INSTANCE.a(), null, null, null, false, z2.c.b(lVarV, -208683345, true, new a(dVarB)), z2.c.b(lVarV, 1510239003, true, new b(dVarB)), lVarV, (i13 & 14) | 805331328 | (f.f96995g << 3), 6, 480);
                            lVarV.T();
                        }
                    } else {
                        lVarV.H(-855909926);
                        g.a(androidx.compose.foundation.b.d(dVarB, p026y50.d.f125064a.a(lVarV, 6).getBackgroundOffset(), null, 2, null), lVarV, 0);
                        lVarV.T();
                        dVar5 = dVar3;
                    }
                    if (o.J()) {
                        o.R();
                    }
                    z14 = z13;
                    dVar6 = dVar5;
                } else {
                    lVarV.j();
                    dVar6 = dVar2;
                    z14 = z12;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new c(str, dVar6, z14, i11, i12));
                }
            }
            i13 |= KyberEngine.KyberPolyBytes;
            z12 = z11;
            if ((i13 & 731) == 146) {
                if (i16 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                if (o.J()) {
                    o.S(-1092343159, i13, -1, "com.stripe.android.financialconnections.features.common.InstitutionIcon (InstitutionIcon.kt:24)");
                }
                zBooleanValue = ((Boolean) lVarV.U(p1.a())).booleanValue();
                dVarB = h3.l.b(x.q(dVar3, w4.h.g(56)), w4.h.g(1), a2.g.c(w4.h.g(12)), true, 0L, 0L, 24, null);
                if (str == null) {
                    dVar4 = dVar3;
                    if (zBooleanValue) {
                        dVar5 = dVar4;
                        lVarV.H(-855772906);
                        b(dVarB, lVarV, 0);
                        lVarV.T();
                    } else {
                        dVar5 = dVar4;
                        lVarV.H(-855772906);
                        b(dVarB, lVarV, 0);
                        lVarV.T();
                    }
                } else {
                    dVar4 = dVar3;
                    if (zBooleanValue) {
                        dVar5 = dVar4;
                        lVarV.H(-855772906);
                        b(dVarB, lVarV, 0);
                        lVarV.T();
                    } else {
                        dVar5 = dVar4;
                        lVarV.H(-855772906);
                        b(dVarB, lVarV, 0);
                        lVarV.T();
                    }
                }
                if (o.J()) {
                    o.R();
                }
                z14 = z13;
                dVar6 = dVar5;
            } else {
                if (i16 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                if (o.J()) {
                    o.S(-1092343159, i13, -1, "com.stripe.android.financialconnections.features.common.InstitutionIcon (InstitutionIcon.kt:24)");
                }
                zBooleanValue = ((Boolean) lVarV.U(p1.a())).booleanValue();
                dVarB = h3.l.b(x.q(dVar3, w4.h.g(56)), w4.h.g(1), a2.g.c(w4.h.g(12)), true, 0L, 0L, 24, null);
                if (str == null) {
                    dVar4 = dVar3;
                    if (zBooleanValue) {
                        dVar5 = dVar4;
                        lVarV.H(-855772906);
                        b(dVarB, lVarV, 0);
                        lVarV.T();
                    } else {
                        dVar5 = dVar4;
                        lVarV.H(-855772906);
                        b(dVarB, lVarV, 0);
                        lVarV.T();
                    }
                } else {
                    dVar4 = dVar3;
                    if (zBooleanValue) {
                        dVar5 = dVar4;
                        lVarV.H(-855772906);
                        b(dVarB, lVarV, 0);
                        lVarV.T();
                    } else {
                        dVar5 = dVar4;
                        lVarV.H(-855772906);
                        b(dVarB, lVarV, 0);
                        lVarV.T();
                    }
                }
                if (o.J()) {
                    o.R();
                }
                z14 = z13;
                dVar6 = dVar5;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new c(str, dVar6, z14, i11, i12));
            }
        }
        i13 |= 48;
        dVar2 = dVar;
        i14 = i12 & 4;
        if (i14 != 0) {
            if ((i11 & 896) == 0) {
                z12 = z11;
                if (lVarV.p(z12)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i13 |= i15;
            }
            if ((i13 & 731) == 146) {
                if (i16 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                if (o.J()) {
                    o.S(-1092343159, i13, -1, "com.stripe.android.financialconnections.features.common.InstitutionIcon (InstitutionIcon.kt:24)");
                }
                zBooleanValue = ((Boolean) lVarV.U(p1.a())).booleanValue();
                dVarB = h3.l.b(x.q(dVar3, w4.h.g(56)), w4.h.g(1), a2.g.c(w4.h.g(12)), true, 0L, 0L, 24, null);
                if (str == null) {
                    dVar4 = dVar3;
                    if (zBooleanValue) {
                        dVar5 = dVar4;
                        lVarV.H(-855772906);
                        b(dVarB, lVarV, 0);
                        lVarV.T();
                    } else {
                        dVar5 = dVar4;
                        lVarV.H(-855772906);
                        b(dVarB, lVarV, 0);
                        lVarV.T();
                    }
                } else {
                    dVar4 = dVar3;
                    if (zBooleanValue) {
                        dVar5 = dVar4;
                        lVarV.H(-855772906);
                        b(dVarB, lVarV, 0);
                        lVarV.T();
                    } else {
                        dVar5 = dVar4;
                        lVarV.H(-855772906);
                        b(dVarB, lVarV, 0);
                        lVarV.T();
                    }
                }
                if (o.J()) {
                    o.R();
                }
                z14 = z13;
                dVar6 = dVar5;
            } else {
                if (i16 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                if (o.J()) {
                    o.S(-1092343159, i13, -1, "com.stripe.android.financialconnections.features.common.InstitutionIcon (InstitutionIcon.kt:24)");
                }
                zBooleanValue = ((Boolean) lVarV.U(p1.a())).booleanValue();
                dVarB = h3.l.b(x.q(dVar3, w4.h.g(56)), w4.h.g(1), a2.g.c(w4.h.g(12)), true, 0L, 0L, 24, null);
                if (str == null) {
                    dVar4 = dVar3;
                    if (zBooleanValue) {
                        dVar5 = dVar4;
                        lVarV.H(-855772906);
                        b(dVarB, lVarV, 0);
                        lVarV.T();
                    } else {
                        dVar5 = dVar4;
                        lVarV.H(-855772906);
                        b(dVarB, lVarV, 0);
                        lVarV.T();
                    }
                } else {
                    dVar4 = dVar3;
                    if (zBooleanValue) {
                        dVar5 = dVar4;
                        lVarV.H(-855772906);
                        b(dVarB, lVarV, 0);
                        lVarV.T();
                    } else {
                        dVar5 = dVar4;
                        lVarV.H(-855772906);
                        b(dVarB, lVarV, 0);
                        lVarV.T();
                    }
                }
                if (o.J()) {
                    o.R();
                }
                z14 = z13;
                dVar6 = dVar5;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new c(str, dVar6, z14, i11, i12));
            }
        }
        i13 |= KyberEngine.KyberPolyBytes;
        z12 = z11;
        if ((i13 & 731) == 146) {
            if (i16 != 0) {
                dVar3 = androidx.compose.ui.d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (i14 != 0) {
                z13 = false;
            } else {
                z13 = z12;
            }
            if (o.J()) {
                o.S(-1092343159, i13, -1, "com.stripe.android.financialconnections.features.common.InstitutionIcon (InstitutionIcon.kt:24)");
            }
            zBooleanValue = ((Boolean) lVarV.U(p1.a())).booleanValue();
            dVarB = h3.l.b(x.q(dVar3, w4.h.g(56)), w4.h.g(1), a2.g.c(w4.h.g(12)), true, 0L, 0L, 24, null);
            if (str == null) {
                dVar4 = dVar3;
                if (zBooleanValue) {
                    dVar5 = dVar4;
                    lVarV.H(-855772906);
                    b(dVarB, lVarV, 0);
                    lVarV.T();
                } else {
                    dVar5 = dVar4;
                    lVarV.H(-855772906);
                    b(dVarB, lVarV, 0);
                    lVarV.T();
                }
            } else {
                dVar4 = dVar3;
                if (zBooleanValue) {
                    dVar5 = dVar4;
                    lVarV.H(-855772906);
                    b(dVarB, lVarV, 0);
                    lVarV.T();
                } else {
                    dVar5 = dVar4;
                    lVarV.H(-855772906);
                    b(dVarB, lVarV, 0);
                    lVarV.T();
                }
            }
            if (o.J()) {
                o.R();
            }
            z14 = z13;
            dVar6 = dVar5;
        } else {
            if (i16 != 0) {
                dVar3 = androidx.compose.ui.d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (i14 != 0) {
                z13 = false;
            } else {
                z13 = z12;
            }
            if (o.J()) {
                o.S(-1092343159, i13, -1, "com.stripe.android.financialconnections.features.common.InstitutionIcon (InstitutionIcon.kt:24)");
            }
            zBooleanValue = ((Boolean) lVarV.U(p1.a())).booleanValue();
            dVarB = h3.l.b(x.q(dVar3, w4.h.g(56)), w4.h.g(1), a2.g.c(w4.h.g(12)), true, 0L, 0L, 24, null);
            if (str == null) {
                dVar4 = dVar3;
                if (zBooleanValue) {
                    dVar5 = dVar4;
                    lVarV.H(-855772906);
                    b(dVarB, lVarV, 0);
                    lVarV.T();
                } else {
                    dVar5 = dVar4;
                    lVarV.H(-855772906);
                    b(dVarB, lVarV, 0);
                    lVarV.T();
                }
            } else {
                dVar4 = dVar3;
                if (zBooleanValue) {
                    dVar5 = dVar4;
                    lVarV.H(-855772906);
                    b(dVarB, lVarV, 0);
                    lVarV.T();
                } else {
                    dVar5 = dVar4;
                    lVarV.H(-855772906);
                    b(dVarB, lVarV, 0);
                    lVarV.T();
                }
            }
            if (o.J()) {
                o.R();
            }
            z14 = z13;
            dVar6 = dVar5;
        }
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new c(str, dVar6, z14, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(androidx.compose.ui.d dVar, l lVar, int i11) {
        int i12;
        androidx.compose.ui.d dVar2;
        l lVarV = lVar.v(-1265667876);
        if ((i11 & 14) == 0) {
            i12 = (lVarV.n(dVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 11) == 2 && lVarV.b()) {
            lVarV.j();
            dVar2 = dVar;
        } else {
            if (o.J()) {
                o.S(-1265667876, i12, -1, "com.stripe.android.financialconnections.features.common.InstitutionPlaceholder (InstitutionIcon.kt:52)");
            }
            dVar2 = dVar;
            b0.a(e4.e.c(i.f75837c, lVarV, 0), "Bank icon placeholder", dVar2, null, k.INSTANCE.a(), BitmapDescriptorFactory.HUE_RED, null, lVarV, ((i12 << 6) & 896) | 24632, 104);
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new d(dVar2, i11));
        }
    }
}
