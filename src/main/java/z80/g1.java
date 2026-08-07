package z80;

import p009i2.v2;
import p013kotlin.Metadata;
import p020r2.w2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "text", "Landroidx/compose/ui/d;", "modifier", "Ljn0/h0;", "a", "(Ljava/lang/String;Landroidx/compose/ui/d;Lr2/l;II)V", "payments-ui-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class g1 {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f127471c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f127472d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f127473e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f127474f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, androidx.compose.ui.d dVar, int i11, int i12) {
            super(2);
            this.f127471c = str;
            this.f127472d = dVar;
            this.f127473e = i11;
            this.f127474f = i12;
        }

        public final void a(p020r2.l lVar, int i11) {
            g1.a(this.f127471c, this.f127472d, lVar, p020r2.k2.a(this.f127473e | 1), this.f127474f);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00af  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    public static final void a(String text, androidx.compose.ui.d dVar, p020r2.l lVar, int i11, int i12) {
        int i13;
        androidx.compose.ui.d dVar2;
        androidx.compose.ui.d dVar3;
        androidx.compose.ui.d dVar4;
        p020r2.l lVar2;
        w2 w2VarX;
        p013kotlin.jvm.internal.s.k(text, "text");
        p020r2.l lVarV = lVar.v(-1723562927);
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
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-1723562927, i13, -1, "com.stripe.android.ui.core.elements.H4Text (H4Text.kt:13)");
                }
                p009i2.j1 j1Var = p009i2.j1.f74525a;
                int i15 = p009i2.j1.f74526b;
                dVar4 = dVar3;
                lVar2 = lVarV;
                v2.b(text, dVar4, j1Var.a(lVarV, i15).i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, j1Var.c(lVarV, i15).getH4(), lVar2, i13 & 126, 0, 65528);
                if (p020r2.o.J()) {
                    p020r2.o.R();
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
                dVar3 = androidx.compose.ui.d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-1723562927, i13, -1, "com.stripe.android.ui.core.elements.H4Text (H4Text.kt:13)");
            }
            p009i2.j1 j1Var2 = p009i2.j1.f74525a;
            int i16 = p009i2.j1.f74526b;
            dVar4 = dVar3;
            lVar2 = lVarV;
            v2.b(text, dVar4, j1Var2.a(lVarV, i16).i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, j1Var2.c(lVarV, i16).getH4(), lVar2, i13 & 126, 0, 65528);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        } else {
            if (i14 != 0) {
                dVar3 = androidx.compose.ui.d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-1723562927, i13, -1, "com.stripe.android.ui.core.elements.H4Text (H4Text.kt:13)");
            }
            p009i2.j1 j1Var3 = p009i2.j1.f74525a;
            int i17 = p009i2.j1.f74526b;
            dVar4 = dVar3;
            lVar2 = lVarV;
            v2.b(text, dVar4, j1Var3.a(lVarV, i17).i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, j1Var3.c(lVarV, i17).getH4(), lVar2, i13 & 126, 0, 65528);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        w2VarX = lVar2.x();
        if (w2VarX != null) {
            w2VarX.a(new a(text, dVar4, i11, i12));
        }
    }
}
