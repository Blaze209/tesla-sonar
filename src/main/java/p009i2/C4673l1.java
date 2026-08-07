package p009i2;

import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w2;
import wn0.p;

/* JADX INFO: renamed from: i2.l1, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/Function0;", "Ljn0/h0;", "content", "a", "(Lwn0/p;Lr2/l;I)V", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class C4673l1 {

    /* JADX INFO: renamed from: i2.l1$a */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f74630c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f74631d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(p<? super l, ? super Integer, h0> pVar, int i11) {
            super(2);
            this.f74630c = pVar;
            this.f74631d = i11;
        }

        public final void a(l lVar, int i11) {
            C4673l1.a(this.f74630c, lVar, k2.a(this.f74631d | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static final void a(p<? super l, ? super Integer, h0> pVar, l lVar, int i11) {
        int i12;
        l lVarV = lVar.v(-1322912246);
        if ((i11 & 6) == 0) {
            i12 = (lVarV.K(pVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && lVarV.b()) {
            lVarV.j();
        } else {
            if (o.J()) {
                o.S(-1322912246, i12, -1, "androidx.compose.material.PlatformMaterialTheme (MaterialTheme.android.kt:21)");
            }
            pVar.invoke(lVarV, Integer.valueOf(i12 & 14));
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new a(pVar, i11));
        }
    }
}
