package p010i90;

import androidx.compose.ui.d;
import f90.n;
import jn0.h0;
import p009i2.j1;
import p009i2.v2;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w2;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "text", "Landroidx/compose/ui/d;", "modifier", "Ljn0/h0;", "a", "(Ljava/lang/String;Landroidx/compose/ui/d;Lr2/l;II)V", "stripe-ui-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class f0 {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f76522c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f76523d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f76524e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f76525f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, d dVar, int i11, int i12) {
            super(2);
            this.f76522c = str;
            this.f76523d = dVar;
            this.f76524e = i11;
            this.f76525f = i12;
        }

        public final void a(l lVar, int i11) {
            f0.a(this.f76522c, this.f76523d, lVar, k2.a(this.f76524e | 1), this.f76525f);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00af  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    public static final void a(String text, d dVar, l lVar, int i11, int i12) {
        int i13;
        d dVar2;
        d dVar3;
        d dVar4;
        l lVar2;
        w2 w2VarX;
        s.k(text, "text");
        l lVarV = lVar.v(1046512805);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = i11 | (lVarV.n(text) ? 4 : 2);
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
                    o.S(1046512805, i13, -1, "com.stripe.android.uicore.elements.H6Text (H6Text.kt:14)");
                }
                j1 j1Var = j1.f74525a;
                int i15 = j1.f74526b;
                dVar4 = dVar3;
                lVar2 = lVarV;
                v2.b(text, dVar4, n.n(j1Var, lVarV, i15).getSubtitle(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, j1Var.c(lVarV, i15).getH6(), lVar2, i13 & 126, 0, 65528);
                if (o.J()) {
                    o.R();
                }
            } else {
                lVarV.j();
                lVar2 = lVarV;
                dVar4 = dVar2;
            }
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new a(text, dVar4, i11, i12));
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
                o.S(1046512805, i13, -1, "com.stripe.android.uicore.elements.H6Text (H6Text.kt:14)");
            }
            j1 j1Var2 = j1.f74525a;
            int i16 = j1.f74526b;
            dVar4 = dVar3;
            lVar2 = lVarV;
            v2.b(text, dVar4, n.n(j1Var2, lVarV, i16).getSubtitle(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, j1Var2.c(lVarV, i16).getH6(), lVar2, i13 & 126, 0, 65528);
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
                o.S(1046512805, i13, -1, "com.stripe.android.uicore.elements.H6Text (H6Text.kt:14)");
            }
            j1 j1Var3 = j1.f74525a;
            int i17 = j1.f74526b;
            dVar4 = dVar3;
            lVar2 = lVarV;
            v2.b(text, dVar4, n.n(j1Var3, lVarV, i17).getSubtitle(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, j1Var3.c(lVarV, i17).getH6(), lVar2, i13 & 126, 0, 65528);
            if (o.J()) {
                o.R();
            }
        }
        w2VarX = lVar2.x();
        if (w2VarX != null) {
            w2VarX.a(new a(text, dVar4, i11, i12));
        }
    }
}
