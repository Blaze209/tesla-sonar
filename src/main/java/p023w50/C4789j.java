package p023w50;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import jn0.h0;
import p009i2.z1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w2;
import p026y50.d;
import v1.y;
import wn0.p;
import wn0.q;

/* JADX INFO: renamed from: w50.j, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a1\u0010\u0006\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/Function0;", "Ljn0/h0;", "topBar", "Lkotlin/Function1;", "Lv1/y;", "content", "a", "(Lwn0/p;Lwn0/q;Lr2/l;I)V", "financial-connections_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class C4789j {

    /* JADX INFO: renamed from: w50.j$a */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f120939c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ q<y, l, Integer, h0> f120940d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f120941e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(p<? super l, ? super Integer, h0> pVar, q<? super y, ? super l, ? super Integer, h0> qVar, int i11) {
            super(2);
            this.f120939c = pVar;
            this.f120940d = qVar;
            this.f120941e = i11;
        }

        public final void a(l lVar, int i11) {
            C4789j.a(this.f120939c, this.f120940d, lVar, k2.a(this.f120941e | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static final void a(p<? super l, ? super Integer, h0> topBar, q<? super y, ? super l, ? super Integer, h0> qVar, l lVar, int i11) {
        int i12;
        l lVar2;
        q<? super y, ? super l, ? super Integer, h0> content = qVar;
        s.k(topBar, "topBar");
        s.k(content, "content");
        l lVarV = lVar.v(1374211054);
        if ((i11 & 14) == 0) {
            i12 = i11 | (lVarV.K(topBar) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= lVarV.K(content) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && lVarV.b()) {
            lVarV.j();
            lVar2 = lVarV;
        } else {
            if (o.J()) {
                o.S(1374211054, i12, -1, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsScaffold (Scaffold.kt:11)");
            }
            d dVar = d.f125064a;
            lVar2 = lVarV;
            z1.a(null, null, topBar, null, null, null, 0, false, null, false, null, BitmapDescriptorFactory.HUE_RED, 0L, 0L, 0L, dVar.a(lVarV, 6).getBackgroundSurface(), dVar.a(lVarV, 6).getTextDefault(), qVar, lVar2, (i12 << 6) & 896, (i12 << 18) & 29360128, 32763);
            content = qVar;
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVar2.x();
        if (w2VarX != null) {
            w2VarX.a(new a(topBar, content, i11));
        }
    }
}
