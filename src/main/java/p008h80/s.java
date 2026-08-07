package p008h80;

import androidx.compose.ui.d;
import f90.n;
import i4.TextStyle;
import jn0.h0;
import p009i2.j1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w2;
import q90.c;
import t4.j;
import w4.v;
import w4.w;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\u000b\u001a\u00020\n*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "mandateText", "Landroidx/compose/ui/d;", "modifier", "Ljn0/h0;", "a", "(Ljava/lang/String;Landroidx/compose/ui/d;Lr2/l;II)V", "Li4/r0;", "", "spacing", "Lw4/v;", "b", "(Li4/r0;I)J", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class s {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f71332c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f71333d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f71334e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f71335f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, d dVar, int i11, int i12) {
            super(2);
            this.f71332c = str;
            this.f71333d = dVar;
            this.f71334e = i11;
            this.f71335f = i12;
        }

        public final void a(l lVar, int i11) {
            s.a(this.f71332c, this.f71333d, lVar, k2.a(this.f71334e | 1), this.f71335f);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x00de  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    public static final void a(String str, d dVar, l lVar, int i11, int i12) {
        int i13;
        d dVar2;
        d dVar3;
        d dVar4;
        w2 w2VarX;
        l lVarV = lVar.v(-2016262463);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (lVarV.n(str) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 == 0) {
            if ((i11 & 112) == 0) {
                dVar2 = dVar;
                i13 |= lVarV.n(dVar2) ? 32 : 16;
            }
            if ((i13 & 91) == 18 || !lVarV.b()) {
                if (i14 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (o.J()) {
                    o.S(-2016262463, i13, -1, "com.stripe.android.paymentsheet.ui.Mandate (MandateText.kt:18)");
                }
                if (str == null) {
                    dVar4 = dVar3;
                } else {
                    j1 j1Var = j1.f74525a;
                    int i15 = j1.f74526b;
                    TextStyle body1 = j1Var.c(lVarV, i15).getBody1();
                    dVar4 = dVar3;
                    c.b(str, dVar4, null, n.n(j1Var, lVarV, i15).getSubtitle(), TextStyle.e(body1, 0L, w.h(11), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, j.h(j.INSTANCE.d()), null, b(body1, 4), null, null, null, null, null, null, 16613373, null), false, null, 0, null, lVarV, i13 & 112, 484);
                }
                if (o.J()) {
                    o.R();
                }
            } else {
                lVarV.j();
                dVar4 = dVar2;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new a(str, dVar4, i11, i12));
            }
        }
        i13 |= 48;
        dVar2 = dVar;
        if ((i13 & 91) == 18) {
            if (i14 != 0) {
                dVar3 = d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (o.J()) {
                o.S(-2016262463, i13, -1, "com.stripe.android.paymentsheet.ui.Mandate (MandateText.kt:18)");
            }
            if (str == null) {
                dVar4 = dVar3;
            } else {
                j1 j1Var2 = j1.f74525a;
                int i16 = j1.f74526b;
                TextStyle body2 = j1Var2.c(lVarV, i16).getBody1();
                dVar4 = dVar3;
                c.b(str, dVar4, null, n.n(j1Var2, lVarV, i16).getSubtitle(), TextStyle.e(body2, 0L, w.h(11), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, j.h(j.INSTANCE.d()), null, b(body2, 4), null, null, null, null, null, null, 16613373, null), false, null, 0, null, lVarV, i13 & 112, 484);
            }
            if (o.J()) {
                o.R();
            }
        } else {
            if (i14 != 0) {
                dVar3 = d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (o.J()) {
                o.S(-2016262463, i13, -1, "com.stripe.android.paymentsheet.ui.Mandate (MandateText.kt:18)");
            }
            if (str == null) {
                dVar4 = dVar3;
            } else {
                j1 j1Var3 = j1.f74525a;
                int i17 = j1.f74526b;
                TextStyle body3 = j1Var3.c(lVarV, i17).getBody1();
                dVar4 = dVar3;
                c.b(str, dVar4, null, n.n(j1Var3, lVarV, i17).getSubtitle(), TextStyle.e(body3, 0L, w.h(11), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, j.h(j.INSTANCE.d()), null, b(body3, 4), null, null, null, null, null, null, 16613373, null), false, null, 0, null, lVarV, i13 & 112, 484);
            }
            if (o.J()) {
                o.R();
            }
        }
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new a(str, dVar4, i11, i12));
        }
    }

    private static final long b(TextStyle textStyle, int i11) {
        return v.j(textStyle.n()) ? w.g(v.h(textStyle.n()) + i11) : textStyle.n();
    }
}
