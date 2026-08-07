package p008h80;

import androidx.compose.foundation.layout.q;
import androidx.compose.foundation.layout.t;
import androidx.compose.foundation.layout.x;
import androidx.compose.ui.platform.s2;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f30.d0;
import g4.v;
import g4.y;
import java.util.List;
import jn0.h0;
import p009i2.C4672l;
import p009i2.e1;
import p009i2.g1;
import p009i2.j1;
import p009i2.n2;
import p009i2.r2;
import p009i2.v2;
import p010i90.Function1;
import p010i90.o1;
import p010i90.t1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.d4;
import p020r2.g2;
import p020r2.h2;
import p020r2.k2;
import p020r2.p1;
import p020r2.s3;
import p020r2.w;
import p020r2.w2;
import p020r2.y2;
import p020r2.y3;
import q1.b0;
import v1.e0;
import z3.a0;
import z3.i0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a5\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\t2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a-\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0015H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a+\u0010\u0019\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\tH\u0003¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001c²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u001b\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002"}, d2 = {"Lh80/n;", "interactor", "Landroidx/compose/ui/d;", "modifier", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lh80/n;Landroidx/compose/ui/d;Lr2/l;II)V", "Lh80/o;", "viewState", "Lkotlin/Function1;", "Lh80/m;", "viewActionHandler", "f", "(Lh80/o;Lwn0/l;Landroidx/compose/ui/d;Lr2/l;II)V", "", "text", "g", "(Ljava/lang/String;Landroidx/compose/ui/d;Lr2/l;I)V", "", "idle", "removing", "Lkotlin/Function0;", "onRemove", "h", "(ZZLwn0/a;Lr2/l;I)V", "a", "(Lh80/o;Lwn0/l;Lr2/l;I)V", "expanded", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class l {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.l<p008h80.m, h0> f71212c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p1<Boolean> f71213d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(wn0.l<? super p008h80.m, h0> lVar, p1<Boolean> p1Var) {
            super(0);
            this.f71212c = lVar;
            this.f71213d = p1Var;
        }

        public final void b() {
            if (l.b(this.f71213d)) {
                return;
            }
            l.c(this.f71213d, true);
            this.f71212c.invoke(h80.m.c.f71263a);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg4/y;", "Ljn0/h0;", "a", "(Lg4/y;)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements wn0.l<y, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ EditPaymentMethodViewState f71214c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(EditPaymentMethodViewState editPaymentMethodViewState) {
            super(1);
            this.f71214c = editPaymentMethodViewState;
        }

        public final void a(y semantics) {
            s.k(semantics, "$this$semantics");
            v.c0(semantics, this.f71214c.getSelectedBrand().getBrand().getDisplayName());
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(y yVar) {
            a(yVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh80/o$a;", "item", "Ljn0/h0;", "a", "(Lh80/o$a;)V"}, k = 3, mv = {1, 9, 0})
    static final class c extends u implements wn0.l<EditPaymentMethodViewState.CardBrandChoice, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.l<p008h80.m, h0> f71215c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p1<Boolean> f71216d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(wn0.l<? super p008h80.m, h0> lVar, p1<Boolean> p1Var) {
            super(1);
            this.f71215c = lVar;
            this.f71216d = p1Var;
        }

        public final void a(EditPaymentMethodViewState.CardBrandChoice item) {
            s.k(item, "item");
            l.c(this.f71216d, false);
            this.f71215c.invoke(new p008h80.m.OnBrandChoiceChanged(item));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(EditPaymentMethodViewState.CardBrandChoice cardBrandChoice) {
            a(cardBrandChoice);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class d extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.l<p008h80.m, h0> f71217c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p1<Boolean> f71218d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(wn0.l<? super p008h80.m, h0> lVar, p1<Boolean> p1Var) {
            super(0);
            this.f71217c = lVar;
            this.f71218d = p1Var;
        }

        public final void b() {
            l.c(this.f71218d, false);
            this.f71217c.invoke(h80.m.b.f71262a);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class e extends u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ EditPaymentMethodViewState f71219c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.l<p008h80.m, h0> f71220d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f71221e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(EditPaymentMethodViewState editPaymentMethodViewState, wn0.l<? super p008h80.m, h0> lVar, int i11) {
            super(2);
            this.f71219c = editPaymentMethodViewState;
            this.f71220d = lVar;
            this.f71221e = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            l.a(this.f71219c, this.f71220d, lVar, k2.a(this.f71221e | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class f extends p013kotlin.jvm.internal.p implements wn0.l<p008h80.m, h0> {
        f(Object obj) {
            super(1, obj, p008h80.n.class, "handleViewAction", "handleViewAction(Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewAction;)V", 0);
        }

        public final void a(p008h80.m p11) {
            s.k(p11, "p0");
            ((p008h80.n) this.receiver).b(p11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(p008h80.m mVar) {
            a(mVar);
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class g extends u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p008h80.n f71222c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f71223d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f71224e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f71225f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(p008h80.n nVar, androidx.compose.ui.d dVar, int i11, int i12) {
            super(2);
            this.f71222c = nVar;
            this.f71223d = dVar;
            this.f71224e = i11;
            this.f71225f = i12;
        }

        public final void a(p020r2.l lVar, int i11) {
            l.d(this.f71222c, this.f71223d, lVar, k2.a(this.f71224e | 1), this.f71225f);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class h extends u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ EditPaymentMethodViewState f71226c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f71227d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.l<p008h80.m, h0> f71228e;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements wn0.l<String, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f71229c = new a();

            a() {
                super(1);
            }

            public final void a(String it) {
                s.k(it, "it");
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(String str) {
                a(str);
                return h0.f84049a;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
        static final class b extends u implements wn0.p<p020r2.l, Integer, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.d f71230c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(androidx.compose.ui.d dVar) {
                super(2);
                this.f71230c = dVar;
            }

            public final void a(p020r2.l lVar, int i11) {
                if ((i11 & 11) == 2 && lVar.b()) {
                    lVar.j();
                    return;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(1623512054, i11, -1, "com.stripe.android.paymentsheet.ui.EditPaymentMethodUi.<anonymous>.<anonymous>.<anonymous> (EditPaymentMethod.kt:107)");
                }
                l.g(e4.i.c(d0.f63934a, lVar, 0), this.f71230c, lVar, 0);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
                a(lVar, num.intValue());
                return h0.f84049a;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
        static final class c extends u implements wn0.p<p020r2.l, Integer, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ EditPaymentMethodViewState f71231c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ wn0.l<p008h80.m, h0> f71232d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(EditPaymentMethodViewState editPaymentMethodViewState, wn0.l<? super p008h80.m, h0> lVar) {
                super(2);
                this.f71231c = editPaymentMethodViewState;
                this.f71232d = lVar;
            }

            public final void a(p020r2.l lVar, int i11) {
                if ((i11 & 11) == 2 && lVar.b()) {
                    lVar.j();
                    return;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(1857875321, i11, -1, "com.stripe.android.paymentsheet.ui.EditPaymentMethodUi.<anonymous>.<anonymous>.<anonymous> (EditPaymentMethod.kt:113)");
                }
                l.a(this.f71231c, this.f71232d, lVar, 8);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
                a(lVar, num.intValue());
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(EditPaymentMethodViewState editPaymentMethodViewState, androidx.compose.ui.d dVar, wn0.l<? super p008h80.m, h0> lVar) {
            super(2);
            this.f71226c = editPaymentMethodViewState;
            this.f71227d = dVar;
            this.f71228e = lVar;
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(1330496850, i11, -1, "com.stripe.android.paymentsheet.ui.EditPaymentMethodUi.<anonymous>.<anonymous> (EditPaymentMethod.kt:99)");
            }
            n2 n2VarD = Function1.d(false, lVar, 6, 0);
            r2.a("•••• •••• •••• " + this.f71226c.getLast4(), a.f71229c, x.h(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), false, false, null, z2.c.b(lVar, 1623512054, true, new b(this.f71227d)), null, null, z2.c.b(lVar, 1857875321, true, new c(this.f71226c, this.f71228e)), false, null, null, null, false, 0, 0, null, null, n2VarD, lVar, 806882736, 0, 523696);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class i extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.l<p008h80.m, h0> f71233c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(wn0.l<? super p008h80.m, h0> lVar) {
            super(0);
            this.f71233c = lVar;
        }

        public final void b() {
            this.f71233c.invoke(h80.m.g.f71267a);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class j extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.l<p008h80.m, h0> f71234c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(wn0.l<? super p008h80.m, h0> lVar) {
            super(0);
            this.f71234c = lVar;
        }

        public final void b() {
            this.f71234c.invoke(h80.m.f.f71266a);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class k extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.l<p008h80.m, h0> f71235c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(wn0.l<? super p008h80.m, h0> lVar) {
            super(0);
            this.f71235c = lVar;
        }

        public final void b() {
            this.f71235c.invoke(h80.m.e.f71265a);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: h80.l$l, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class C1499l extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.l<p008h80.m, h0> f71236c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C1499l(wn0.l<? super p008h80.m, h0> lVar) {
            super(0);
            this.f71236c = lVar;
        }

        public final void b() {
            this.f71236c.invoke(h80.m.d.f71264a);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class m extends u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ EditPaymentMethodViewState f71237c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.l<p008h80.m, h0> f71238d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f71239e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f71240f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f71241g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        m(EditPaymentMethodViewState editPaymentMethodViewState, wn0.l<? super p008h80.m, h0> lVar, androidx.compose.ui.d dVar, int i11, int i12) {
            super(2);
            this.f71237c = editPaymentMethodViewState;
            this.f71238d = lVar;
            this.f71239e = dVar;
            this.f71240f = i11;
            this.f71241g = i12;
        }

        public final void a(p020r2.l lVar, int i11) {
            l.f(this.f71237c, this.f71238d, this.f71239e, lVar, k2.a(this.f71240f | 1), this.f71241g);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class n extends u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f71242c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f71243d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f71244e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(String str, androidx.compose.ui.d dVar, int i11) {
            super(2);
            this.f71242c = str;
            this.f71243d = dVar;
            this.f71244e = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            l.g(this.f71242c, this.f71243d, lVar, k2.a(this.f71244e | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class o extends u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f71245c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f71246d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f71247e;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements wn0.p<p020r2.l, Integer, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ v1.c f71248c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f71249d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f71250e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ wn0.a<h0> f71251f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(v1.c cVar, boolean z11, boolean z12, wn0.a<h0> aVar) {
                super(2);
                this.f71248c = cVar;
                this.f71249d = z11;
                this.f71250e = z12;
                this.f71251f = aVar;
            }

            public final void a(p020r2.l lVar, int i11) {
                if ((i11 & 11) == 2 && lVar.b()) {
                    lVar.j();
                    return;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(649323835, i11, -1, "com.stripe.android.paymentsheet.ui.RemoveButton.<anonymous>.<anonymous>.<anonymous> (EditPaymentMethod.kt:206)");
                }
                C4672l.c(this.f71251f, this.f71248c.a(androidx.compose.ui.d.INSTANCE, d3.c.INSTANCE.e()), this.f71249d && !this.f71250e, null, null, f90.n.o(j1.f74525a, lVar, j1.f74526b).e(), null, null, null, p008h80.f.f71029a.a(), lVar, 805306368, 472);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
                a(lVar, num.intValue());
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(boolean z11, boolean z12, wn0.a<h0> aVar) {
            super(2);
            this.f71245c = z11;
            this.f71246d = z12;
            this.f71247e = aVar;
        }

        public final void a(p020r2.l lVar, int i11) {
            p020r2.l lVar2;
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(934400577, i11, -1, "com.stripe.android.paymentsheet.ui.RemoveButton.<anonymous> (EditPaymentMethod.kt:195)");
            }
            androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
            float f11 = 8;
            androidx.compose.ui.d dVarC = q.c(t.m(x.h(s2.a(companion, "PaymentSheetEditScreenRemoveButton"), BitmapDescriptorFactory.HUE_RED, 1, null), w4.h.g(f11), BitmapDescriptorFactory.HUE_RED, w4.h.g(f11), BitmapDescriptorFactory.HUE_RED, 10, null), BitmapDescriptorFactory.HUE_RED, w4.h.g(f11), 1, null);
            boolean z11 = this.f71245c;
            boolean z12 = this.f71246d;
            wn0.a<h0> aVar = this.f71247e;
            lVar.H(733328855);
            d3.c.Companion companion2 = d3.c.INSTANCE;
            i0 i0VarJ = androidx.compose.foundation.layout.g.j(companion2.o(), false, lVar, 0);
            lVar.H(-1323940314);
            int iA = p020r2.j.a(lVar, 0);
            p020r2.x xVarC = lVar.c();
            b4.g.Companion companion3 = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion3.a();
            wn0.q<y2<b4.g>, p020r2.l, Integer, h0> qVarA = a0.a(dVarC);
            if (lVar.w() == null) {
                p020r2.j.c();
            }
            lVar.h();
            if (lVar.getInserting()) {
                lVar.z(aVarA);
            } else {
                lVar.d();
            }
            p020r2.l lVarA = d4.a(lVar);
            d4.b(lVarA, i0VarJ, companion3.c());
            d4.b(lVarA, xVarC, companion3.e());
            wn0.p<b4.g, Integer, h0> pVarB = companion3.b();
            if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(y2.a(y2.b(lVar)), lVar, 0);
            lVar.H(2058660585);
            androidx.compose.foundation.layout.i iVar = androidx.compose.foundation.layout.i.f4585a;
            w.b(new h2[]{g1.b().d(Boolean.FALSE)}, z2.c.b(lVar, 649323835, true, new a(iVar, z12, z11, aVar)), lVar, 56);
            lVar.H(-245505959);
            if (z11) {
                lVar2 = lVar;
                m30.b.b(iVar.a(companion, companion2.f()), j1.f74525a.a(lVar, j1.f74526b).d(), lVar2, 0, 0);
            } else {
                lVar2 = lVar;
            }
            lVar2.T();
            lVar2.T();
            lVar2.g();
            lVar2.T();
            lVar2.T();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class p extends u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f71252c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f71253d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f71254e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f71255f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(boolean z11, boolean z12, wn0.a<h0> aVar, int i11) {
            super(2);
            this.f71252c = z11;
            this.f71253d = z12;
            this.f71254e = aVar;
            this.f71255f = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            l.h(this.f71252c, this.f71253d, this.f71254e, lVar, k2.a(this.f71255f | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(EditPaymentMethodViewState editPaymentMethodViewState, wn0.l<? super p008h80.m, h0> lVar, p020r2.l lVar2, int i11) {
        p020r2.l lVarV = lVar2.v(1943978362);
        if (p020r2.o.J()) {
            p020r2.o.S(1943978362, i11, -1, "com.stripe.android.paymentsheet.ui.Dropdown (EditPaymentMethod.kt:234)");
        }
        lVarV.H(-1126870505);
        Object objI = lVarV.I();
        p020r2.l.Companion companion = p020r2.l.INSTANCE;
        if (objI == companion.a()) {
            objI = s3.d(Boolean.FALSE, null, 2, null);
            lVarV.B(objI);
        }
        p1 p1Var = (p1) objI;
        lVarV.T();
        androidx.compose.ui.d.Companion companion2 = androidx.compose.ui.d.INSTANCE;
        lVarV.H(-1126866892);
        int i12 = (i11 & 112) ^ 48;
        boolean z11 = (i12 > 32 && lVarV.n(lVar)) || (i11 & 48) == 32;
        Object objI2 = lVarV.I();
        if (z11 || objI2 == companion.a()) {
            objI2 = new a(lVar, p1Var);
            lVarV.B(objI2);
        }
        lVarV.T();
        androidx.compose.ui.d dVarA = s2.a(g4.o.d(androidx.compose.foundation.d.d(companion2, false, null, null, (wn0.a) objI2, 7, null), false, new b(editPaymentMethodViewState), 1, null), "dropdown_menu_clickable");
        lVarV.H(733328855);
        d3.c.Companion companion3 = d3.c.INSTANCE;
        i0 i0VarJ = androidx.compose.foundation.layout.g.j(companion3.o(), false, lVarV, 0);
        lVarV.H(-1323940314);
        int iA = p020r2.j.a(lVarV, 0);
        p020r2.x xVarC = lVarV.c();
        b4.g.Companion companion4 = b4.g.INSTANCE;
        wn0.a<b4.g> aVarA = companion4.a();
        wn0.q<y2<b4.g>, p020r2.l, Integer, h0> qVarA = a0.a(dVarA);
        if (lVarV.w() == null) {
            p020r2.j.c();
        }
        lVarV.h();
        if (lVarV.getInserting()) {
            lVarV.z(aVarA);
        } else {
            lVarV.d();
        }
        p020r2.l lVarA = d4.a(lVarV);
        d4.b(lVarA, i0VarJ, companion4.c());
        d4.b(lVarA, xVarC, companion4.e());
        wn0.p<b4.g, Integer, h0> pVarB = companion4.b();
        if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
            lVarA.B(Integer.valueOf(iA));
            lVarA.f(Integer.valueOf(iA), pVarB);
        }
        qVarA.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
        lVarV.H(2058660585);
        androidx.compose.foundation.layout.i iVar = androidx.compose.foundation.layout.i.f4585a;
        androidx.compose.ui.d dVarI = t.i(companion2, w4.h.g(10));
        d3.c.InterfaceC1212c interfaceC1212cI = companion3.i();
        v1.b.f fVarN = v1.b.f117444a.n(w4.h.g(4));
        lVarV.H(693286680);
        i0 i0VarB = e0.b(fVarN, interfaceC1212cI, lVarV, 54);
        lVarV.H(-1323940314);
        int iA2 = p020r2.j.a(lVarV, 0);
        p020r2.x xVarC2 = lVarV.c();
        wn0.a<b4.g> aVarA2 = companion4.a();
        wn0.q<y2<b4.g>, p020r2.l, Integer, h0> qVarA2 = a0.a(dVarI);
        if (lVarV.w() == null) {
            p020r2.j.c();
        }
        lVarV.h();
        if (lVarV.getInserting()) {
            lVarV.z(aVarA2);
        } else {
            lVarV.d();
        }
        p020r2.l lVarA2 = d4.a(lVarV);
        d4.b(lVarA2, i0VarB, companion4.c());
        d4.b(lVarA2, xVarC2, companion4.e());
        wn0.p<b4.g, Integer, h0> pVarB2 = companion4.b();
        if (lVarA2.getInserting() || !s.f(lVarA2.I(), Integer.valueOf(iA2))) {
            lVarA2.B(Integer.valueOf(iA2));
            lVarA2.f(Integer.valueOf(iA2), pVarB2);
        }
        qVarA2.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
        lVarV.H(2058660585);
        v1.h0 h0Var = v1.h0.f117504a;
        b0.a(e4.e.c(editPaymentMethodViewState.getSelectedBrand().getIcon().intValue(), lVarV, 0), null, null, null, null, BitmapDescriptorFactory.HUE_RED, null, lVarV, 56, 124);
        e1.a(e4.e.c(f90.g.f64610a, lVarV, 0), null, null, 0L, lVarV, 56, 12);
        lVarV.T();
        lVarV.g();
        lVarV.T();
        lVarV.T();
        boolean zB = b(p1Var);
        x30.c cVarA = x30.d.a(d0.Y);
        EditPaymentMethodViewState.CardBrandChoice selectedBrand = editPaymentMethodViewState.getSelectedBrand();
        List<EditPaymentMethodViewState.CardBrandChoice> listA = editPaymentMethodViewState.a();
        j1 j1Var = j1.f74525a;
        int i13 = j1.f74526b;
        long subtitle = f90.n.n(j1Var, lVarV, i13).getSubtitle();
        long onComponent = f90.n.n(j1Var, lVarV, i13).getOnComponent();
        lVarV.H(-533235224);
        boolean z12 = (i12 > 32 && lVarV.n(lVar)) || (i11 & 48) == 32;
        Object objI3 = lVarV.I();
        if (z12 || objI3 == companion.a()) {
            objI3 = new c(lVar, p1Var);
            lVarV.B(objI3);
        }
        wn0.l lVar3 = (wn0.l) objI3;
        lVarV.T();
        lVarV.H(-533228291);
        boolean z13 = (i12 > 32 && lVarV.n(lVar)) || (i11 & 48) == 32;
        Object objI4 = lVarV.I();
        if (z13 || objI4 == companion.a()) {
            objI4 = new d(lVar, p1Var);
            lVarV.B(objI4);
        }
        lVarV.T();
        t1.b(zB, cVarA, selectedBrand, listA, lVar3, subtitle, onComponent, (wn0.a) objI4, lVarV, 4160);
        lVarV.T();
        lVarV.g();
        lVarV.T();
        lVarV.T();
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new e(editPaymentMethodViewState, lVar, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(p1<Boolean> p1Var) {
        return p1Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(p1<Boolean> p1Var, boolean z11) {
        p1Var.setValue(Boolean.valueOf(z11));
    }

    public static final void d(p008h80.n interactor, androidx.compose.ui.d dVar, p020r2.l lVar, int i11, int i12) {
        int i13;
        s.k(interactor, "interactor");
        p020r2.l lVarV = lVar.v(958707926);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (lVarV.n(interactor) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            i13 |= lVarV.n(dVar) ? 32 : 16;
        }
        if ((i13 & 91) == 18 && lVarV.b()) {
            lVarV.j();
        } else {
            if (i14 != 0) {
                dVar = androidx.compose.ui.d.INSTANCE;
            }
            androidx.compose.ui.d dVar2 = dVar;
            if (p020r2.o.J()) {
                p020r2.o.S(958707926, i13, -1, "com.stripe.android.paymentsheet.ui.EditPaymentMethod (EditPaymentMethod.kt:73)");
            }
            f(e(r90.f.a(interactor.a(), lVarV, 8)), new f(interactor), dVar2, lVarV, ((i13 << 3) & 896) | 8, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            dVar = dVar2;
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new g(interactor, dVar, i11, i12));
        }
    }

    private static final EditPaymentMethodViewState e(y3<EditPaymentMethodViewState> y3Var) {
        return y3Var.getValue();
    }

    public static final void f(EditPaymentMethodViewState viewState, wn0.l<? super p008h80.m, h0> viewActionHandler, androidx.compose.ui.d dVar, p020r2.l lVar, int i11, int i12) {
        int i13;
        s.k(viewState, "viewState");
        s.k(viewActionHandler, "viewActionHandler");
        p020r2.l lVarV = lVar.v(124818519);
        androidx.compose.ui.d dVar2 = (i12 & 4) != 0 ? androidx.compose.ui.d.INSTANCE : dVar;
        if (p020r2.o.J()) {
            p020r2.o.S(124818519, i11, -1, "com.stripe.android.paymentsheet.ui.EditPaymentMethodUi (EditPaymentMethod.kt:88)");
        }
        float fA = e4.f.a(n70.t.f93465e, lVarV, 0);
        boolean z11 = viewState.getStatus() == EditPaymentMethodViewState.b.Idle;
        androidx.compose.ui.d dVarA = s2.a(t.k(dVar2, fA, BitmapDescriptorFactory.HUE_RED, 2, null), "TEST_TAG_PAYMENT_SHEET_EDIT_SCREEN");
        lVarV.H(-483455358);
        i0 i0VarA = v1.g.a(v1.b.f117444a.g(), d3.c.INSTANCE.k(), lVarV, 0);
        lVarV.H(-1323940314);
        int iA = p020r2.j.a(lVarV, 0);
        p020r2.x xVarC = lVarV.c();
        b4.g.Companion companion = b4.g.INSTANCE;
        wn0.a<b4.g> aVarA = companion.a();
        wn0.q<y2<b4.g>, p020r2.l, Integer, h0> qVarA = a0.a(dVarA);
        if (lVarV.w() == null) {
            p020r2.j.c();
        }
        lVarV.h();
        if (lVarV.getInserting()) {
            lVarV.z(aVarA);
        } else {
            lVarV.d();
        }
        p020r2.l lVarA = d4.a(lVarV);
        d4.b(lVarA, i0VarA, companion.c());
        d4.b(lVarA, xVarC, companion.e());
        wn0.p<b4.g, Integer, h0> pVarB = companion.b();
        if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
            lVarA.B(Integer.valueOf(iA));
            lVarA.f(Integer.valueOf(iA), pVarB);
        }
        qVarA.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
        lVarV.H(2058660585);
        v1.j jVar = v1.j.f117505a;
        boolean z12 = z11;
        o1.b(null, null, false, 0L, null, z2.c.b(lVarV, 1330496850, true, new h(viewState, dVar2, viewActionHandler)), lVarV, 196608, 31);
        androidx.compose.ui.d.Companion companion2 = androidx.compose.ui.d.INSTANCE;
        v1.i0.a(x.l(companion2, w4.h.g(32)), lVarV, 6);
        x30.c error = viewState.getError();
        lVarV.H(1368259767);
        if (error == null) {
            i13 = 48;
        } else {
            i13 = 48;
            p008h80.p.a(p90.a.a(error, lVarV, 8), t.m(companion2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, w4.h.g(8), 7, null), lVarV, 48, 0);
        }
        lVarV.T();
        String strC = e4.i.c(d0.O0, lVarV, 0);
        boolean z13 = viewState.getStatus() == EditPaymentMethodViewState.b.Updating;
        boolean z14 = viewState.getCanUpdate() && z12;
        androidx.compose.ui.d dVarA2 = s2.a(companion2, "TEST_TAG_EDIT_SCREEN_UPDATE_BUTTON");
        lVarV.H(1368275269);
        int i14 = i13 ^ (i11 & 112);
        boolean z15 = (i14 > 32 && lVarV.n(viewActionHandler)) || (i11 & 48) == 32;
        Object objI = lVarV.I();
        if (z15 || objI == p020r2.l.INSTANCE.a()) {
            objI = new i(viewActionHandler);
            lVarV.B(objI);
        }
        lVarV.T();
        m30.c.a(strC, z14, (wn0.a) objI, dVarA2, z13, false, lVarV, 3072, 32);
        lVarV.H(1368280033);
        if (viewState.getCanRemove()) {
            boolean z16 = viewState.getStatus() == EditPaymentMethodViewState.b.Removing;
            lVarV.H(1368286270);
            boolean z17 = (i14 > 32 && lVarV.n(viewActionHandler)) || (i11 & 48) == 32;
            Object objI2 = lVarV.I();
            if (z17 || objI2 == p020r2.l.INSTANCE.a()) {
                objI2 = new j(viewActionHandler);
                lVarV.B(objI2);
            }
            lVarV.T();
            h(z12, z16, (wn0.a) objI2, lVarV, 0);
        }
        lVarV.T();
        lVarV.T();
        lVarV.g();
        lVarV.T();
        lVarV.T();
        if (viewState.getConfirmRemoval()) {
            String strD = e4.i.d(n70.x.f93507c0, new Object[]{p90.a.a(viewState.getDisplayName(), lVarV, 8)}, lVarV, 64);
            String strD2 = e4.i.d(d0.f63935a0, new Object[]{viewState.getSelectedBrand().getBrand().getDisplayName(), viewState.getLast4()}, lVarV, 64);
            String strC2 = e4.i.c(d0.H0, lVarV, 0);
            String strC3 = e4.i.c(d0.W, lVarV, 0);
            lVarV.H(692292641);
            boolean z18 = (i14 > 32 && lVarV.n(viewActionHandler)) || (i11 & 48) == 32;
            Object objI3 = lVarV.I();
            if (z18 || objI3 == p020r2.l.INSTANCE.a()) {
                objI3 = new k(viewActionHandler);
                lVarV.B(objI3);
            }
            wn0.a aVar = (wn0.a) objI3;
            lVarV.T();
            lVarV.H(692295021);
            boolean z19 = (i14 > 32 && lVarV.n(viewActionHandler)) || (i11 & 48) == 32;
            Object objI4 = lVarV.I();
            if (z19 || objI4 == p020r2.l.INSTANCE.a()) {
                objI4 = new C1499l(viewActionHandler);
                lVarV.B(objI4);
            }
            lVarV.T();
            z80.h2.a(strD, strD2, strC2, strC3, true, aVar, (wn0.a) objI4, lVarV, 24576, 0);
        }
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new m(viewState, viewActionHandler, dVar2, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(String str, androidx.compose.ui.d dVar, p020r2.l lVar, int i11) {
        int i12;
        p020r2.l lVar2;
        p020r2.l lVarV = lVar.v(1417892261);
        if ((i11 & 14) == 0) {
            i12 = i11 | (lVarV.n(str) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= lVarV.n(dVar) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && lVarV.b()) {
            lVarV.j();
            lVar2 = lVarV;
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(1417892261, i12, -1, "com.stripe.android.paymentsheet.ui.Label (EditPaymentMethod.kt:175)");
            }
            j1 j1Var = j1.f74525a;
            int i13 = j1.f74526b;
            lVar2 = lVarV;
            v2.b(str, dVar, k3.p1.p(f90.n.n(j1Var, lVarV, i13).getPlaceholderText(), p009i2.x.f75438a.b(lVarV, p009i2.x.f75439b), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, j1Var.c(lVarV, i13).getSubtitle1(), lVar2, i12 & 126, 0, 65528);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        w2 w2VarX = lVar2.x();
        if (w2VarX != null) {
            w2VarX.a(new n(str, dVar, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(boolean z11, boolean z12, wn0.a<h0> aVar, p020r2.l lVar, int i11) {
        int i12;
        float fC;
        p020r2.l lVarV = lVar.v(-336781567);
        if ((i11 & 14) == 0) {
            i12 = (lVarV.p(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= lVarV.p(z12) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= lVarV.K(aVar) ? 256 : 128;
        }
        if ((i12 & 731) == 146 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(-336781567, i12, -1, "com.stripe.android.paymentsheet.ui.RemoveButton (EditPaymentMethod.kt:190)");
            }
            g2<Float> g2VarA = p009i2.y.a();
            if (z12) {
                lVarV.H(701841046);
                fC = p009i2.x.f75438a.b(lVarV, p009i2.x.f75439b);
            } else {
                lVarV.H(701841906);
                fC = p009i2.x.f75438a.c(lVarV, p009i2.x.f75439b);
            }
            lVarV.T();
            w.b(new h2[]{g2VarA.d(Float.valueOf(fC)), n2.n.d().d(q.f71303b)}, z2.c.b(lVarV, 934400577, true, new o(z12, z11, aVar)), lVarV, 56);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new p(z11, z12, aVar, i11));
        }
    }
}
