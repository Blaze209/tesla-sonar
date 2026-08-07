package p010i90;

import androidx.compose.ui.d;
import com.plaid.internal.EnumC4419g;
import jn0.h0;
import o4.r;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w2;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Li90/f;", "controller", "Lkotlin/Function0;", "Ljn0/h0;", "onClick", "a", "(Li90/f;Lwn0/a;Lr2/l;II)V", "stripe-ui-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class h {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f76585c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f fVar) {
            super(0);
            this.f76585c = fVar;
        }

        public final void b() {
            this.f76585c.y();
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f76586c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(wn0.a<h0> aVar) {
            super(0);
            this.f76586c = aVar;
        }

        public final void b() {
            this.f76586c.invoke();
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class c extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f76587c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f76588d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f76589e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f76590f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(f fVar, wn0.a<h0> aVar, int i11, int i12) {
            super(2);
            this.f76587c = fVar;
            this.f76588d = aVar;
            this.f76589e = i11;
            this.f76590f = i12;
        }

        public final void a(l lVar, int i11) {
            h.a(this.f76587c, this.f76588d, lVar, k2.a(this.f76589e | 1), this.f76590f);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static final void a(f controller, wn0.a<h0> aVar, l lVar, int i11, int i12) {
        wn0.a<h0> aVar2;
        int i13;
        s.k(controller, "controller");
        l lVarV = lVar.v(-2118013992);
        if ((i12 & 2) != 0) {
            i13 = i11 & (-113);
            aVar2 = new a(controller);
        } else {
            aVar2 = aVar;
            i13 = i11;
        }
        if (o.J()) {
            o.S(-2118013992, i13, -1, "com.stripe.android.uicore.elements.AddressTextFieldUI (AddressTextFieldUI.kt:15)");
        }
        int iD = r.INSTANCE.d();
        d.Companion companion = d.INSTANCE;
        lVarV.H(-814672579);
        boolean z11 = (((i11 & 112) ^ 48) > 32 && lVarV.n(aVar2)) || (i11 & 48) == 32;
        Object objI = lVarV.I();
        if (z11 || objI == l.INSTANCE.a()) {
            objI = new b(aVar2);
            lVarV.B(objI);
        }
        lVarV.T();
        Function1.c(controller, false, iD, androidx.compose.foundation.d.d(companion, false, null, null, (wn0.a) objI, 7, null), null, 0, 0, null, lVarV, 440, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
        if (o.J()) {
            o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new c(controller, aVar2, i11, i12));
        }
    }
}
