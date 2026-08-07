package j80;

import androidx.compose.foundation.layout.x;
import androidx.compose.ui.platform.s2;
import g4.v;
import g4.y;
import jn0.h0;
import n70.DisplayableSavedPaymentMethod;
import p008h80.q0;
import p009i2.e1;
import p009i2.j1;
import p013kotlin.Metadata;
import p020r2.d4;
import p020r2.k2;
import p020r2.p1;
import p020r2.s3;
import p020r2.w2;
import p020r2.y2;
import z3.a0;
import z3.i0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\b\u0010\u0006\u001a@\u0010\u0013\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Ln70/g;", "paymentMethod", "Lkotlin/Function1;", "Ljn0/h0;", "deletePaymentMethod", "a", "(Ln70/g;Lwn0/l;Lr2/l;I)V", "editPaymentMethod", "b", "Lk3/p1;", "backgroundColor", "Landroidx/compose/ui/graphics/painter/b;", "icon", "Lkotlin/Function0;", "onClick", "", "contentDescription", "Landroidx/compose/ui/d;", "modifier", "c", "(JLandroidx/compose/ui/graphics/painter/b;Lwn0/a;Ljava/lang/String;Landroidx/compose/ui/d;Lr2/l;I)V", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class h {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p1<Boolean> f82928c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p1<Boolean> p1Var) {
            super(0);
            this.f82928c = p1Var;
        }

        public final void b() {
            this.f82928c.setValue(Boolean.TRUE);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p1<Boolean> f82929c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.l<DisplayableSavedPaymentMethod, h0> f82930d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ DisplayableSavedPaymentMethod f82931e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(p1<Boolean> p1Var, wn0.l<? super DisplayableSavedPaymentMethod, h0> lVar, DisplayableSavedPaymentMethod displayableSavedPaymentMethod) {
            super(0);
            this.f82929c = p1Var;
            this.f82930d = lVar;
            this.f82931e = displayableSavedPaymentMethod;
        }

        public final void b() {
            this.f82929c.setValue(Boolean.FALSE);
            this.f82930d.invoke(this.f82931e);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class c extends p013kotlin.jvm.internal.u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p1<Boolean> f82932c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(p1<Boolean> p1Var) {
            super(0);
            this.f82932c = p1Var;
        }

        public final void b() {
            this.f82932c.setValue(Boolean.FALSE);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class d extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ DisplayableSavedPaymentMethod f82933c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.l<DisplayableSavedPaymentMethod, h0> f82934d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f82935e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(DisplayableSavedPaymentMethod displayableSavedPaymentMethod, wn0.l<? super DisplayableSavedPaymentMethod, h0> lVar, int i11) {
            super(2);
            this.f82933c = displayableSavedPaymentMethod;
            this.f82934d = lVar;
            this.f82935e = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            h.a(this.f82933c, this.f82934d, lVar, k2.a(this.f82935e | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr2/p1;", "", "b", "()Lr2/p1;"}, k = 3, mv = {1, 9, 0})
    static final class e extends p013kotlin.jvm.internal.u implements wn0.a<p1<Boolean>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f82936c = new e();

        e() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final p1<Boolean> invoke() {
            return s3.d(Boolean.FALSE, null, 2, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class f extends p013kotlin.jvm.internal.u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.l<DisplayableSavedPaymentMethod, h0> f82937c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ DisplayableSavedPaymentMethod f82938d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(wn0.l<? super DisplayableSavedPaymentMethod, h0> lVar, DisplayableSavedPaymentMethod displayableSavedPaymentMethod) {
            super(0);
            this.f82937c = lVar;
            this.f82938d = displayableSavedPaymentMethod;
        }

        public final void b() {
            this.f82937c.invoke(this.f82938d);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class g extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ DisplayableSavedPaymentMethod f82939c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.l<DisplayableSavedPaymentMethod, h0> f82940d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f82941e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(DisplayableSavedPaymentMethod displayableSavedPaymentMethod, wn0.l<? super DisplayableSavedPaymentMethod, h0> lVar, int i11) {
            super(2);
            this.f82939c = displayableSavedPaymentMethod;
            this.f82940d = lVar;
            this.f82941e = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            h.b(this.f82939c, this.f82940d, lVar, k2.a(this.f82941e | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: j80.h$h, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg4/y;", "Ljn0/h0;", "a", "(Lg4/y;)V"}, k = 3, mv = {1, 9, 0})
    static final class C1744h extends p013kotlin.jvm.internal.u implements wn0.l<y, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f82942c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1744h(String str) {
            super(1);
            this.f82942c = str;
        }

        public final void a(y semantics) {
            p013kotlin.jvm.internal.s.k(semantics, "$this$semantics");
            v.c0(semantics, this.f82942c);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(y yVar) {
            a(yVar);
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class i extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f82943c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.painter.b f82944d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f82945e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f82946f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f82947g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f82948h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(long j11, androidx.compose.ui.graphics.painter.b bVar, wn0.a<h0> aVar, String str, androidx.compose.ui.d dVar, int i11) {
            super(2);
            this.f82943c = j11;
            this.f82944d = bVar;
            this.f82945e = aVar;
            this.f82946f = str;
            this.f82947g = dVar;
            this.f82948h = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            h.c(this.f82943c, this.f82944d, this.f82945e, this.f82946f, this.f82947g, lVar, k2.a(this.f82948h | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static final void a(DisplayableSavedPaymentMethod paymentMethod, wn0.l<? super DisplayableSavedPaymentMethod, h0> deletePaymentMethod, p020r2.l lVar, int i11) {
        p013kotlin.jvm.internal.s.k(paymentMethod, "paymentMethod");
        p013kotlin.jvm.internal.s.k(deletePaymentMethod, "deletePaymentMethod");
        p020r2.l lVarV = lVar.v(292197921);
        if (p020r2.o.J()) {
            p020r2.o.S(292197921, i11, -1, "com.stripe.android.paymentsheet.verticalmode.DeleteIcon (ManageScreenIcons.kt:32)");
        }
        p1 p1Var = (p1) a3.b.c(new Object[0], null, null, e.f82936c, lVarV, 3080, 6);
        String str = paymentMethod.getPaymentMethod().id;
        long jD = j1.f74525a.a(lVarV, j1.f74526b).d();
        androidx.compose.ui.graphics.painter.b bVarC = e4.e.c(n70.u.f93493y, lVarV, 0);
        androidx.compose.ui.d dVarA = s2.a(androidx.compose.ui.d.INSTANCE, "manage_screen_delete_icon_" + str);
        String strA = p008h80.a.a(p90.a.a(paymentMethod.e(), lVarV, 8));
        lVarV.H(1499726796);
        boolean zN = lVarV.n(p1Var);
        Object objI = lVarV.I();
        if (zN || objI == p020r2.l.INSTANCE.a()) {
            objI = new a(p1Var);
            lVarV.B(objI);
        }
        lVarV.T();
        c(jD, bVarC, (wn0.a) objI, strA, dVarA, lVarV, 64);
        if (((Boolean) p1Var.getValue()).booleanValue()) {
            b bVar = new b(p1Var, deletePaymentMethod, paymentMethod);
            lVarV.H(1499741293);
            boolean zN2 = lVarV.n(p1Var);
            Object objI2 = lVarV.I();
            if (zN2 || objI2 == p020r2.l.INSTANCE.a()) {
                objI2 = new c(p1Var);
                lVarV.B(objI2);
            }
            lVarV.T();
            q0.a(paymentMethod, bVar, (wn0.a) objI2, lVarV, 8);
        }
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new d(paymentMethod, deletePaymentMethod, i11));
        }
    }

    public static final void b(DisplayableSavedPaymentMethod paymentMethod, wn0.l<? super DisplayableSavedPaymentMethod, h0> editPaymentMethod, p020r2.l lVar, int i11) {
        p013kotlin.jvm.internal.s.k(paymentMethod, "paymentMethod");
        p013kotlin.jvm.internal.s.k(editPaymentMethod, "editPaymentMethod");
        p020r2.l lVarV = lVar.v(-38368896);
        if (p020r2.o.J()) {
            p020r2.o.S(-38368896, i11, -1, "com.stripe.android.paymentsheet.verticalmode.EditIcon (ManageScreenIcons.kt:63)");
        }
        String str = paymentMethod.getPaymentMethod().id;
        androidx.compose.ui.graphics.painter.b bVarC = e4.e.c(n70.u.f93472d, lVarV, 0);
        c(k3.p1.INSTANCE.d(), bVarC, new f(editPaymentMethod, paymentMethod), p008h80.a.a(p90.a.a(paymentMethod.c(), lVarV, 8)), s2.a(androidx.compose.ui.d.INSTANCE, "manage_screen_edit_icon_" + str), lVarV, 70);
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new g(paymentMethod, editPaymentMethod, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(long j11, androidx.compose.ui.graphics.painter.b bVar, wn0.a<h0> aVar, String str, androidx.compose.ui.d dVar, p020r2.l lVar, int i11) {
        p020r2.l lVarV = lVar.v(-671161571);
        if (p020r2.o.J()) {
            p020r2.o.S(-671161571, i11, -1, "com.stripe.android.paymentsheet.verticalmode.TrailingIcon (ManageScreenIcons.kt:85)");
        }
        d3.c cVarE = d3.c.INSTANCE.e();
        androidx.compose.ui.d dVarD = androidx.compose.foundation.d.d(androidx.compose.foundation.b.d(x.q(h3.e.a(dVar, a2.g.f()), w4.h.g(24)), j11, null, 2, null), false, null, null, aVar, 7, null);
        lVarV.H(733328855);
        i0 i0VarJ = androidx.compose.foundation.layout.g.j(cVarE, false, lVarV, 6);
        lVarV.H(-1323940314);
        int iA = p020r2.j.a(lVarV, 0);
        p020r2.x xVarC = lVarV.c();
        b4.g.Companion companion = b4.g.INSTANCE;
        wn0.a<b4.g> aVarA = companion.a();
        wn0.q<y2<b4.g>, p020r2.l, Integer, h0> qVarA = a0.a(dVarD);
        if (lVarV.w() == null) {
            p020r2.j.c();
        }
        lVarV.h();
        if (lVarV.u()) {
            lVarV.z(aVarA);
        } else {
            lVarV.d();
        }
        p020r2.l lVarA = d4.a(lVarV);
        d4.b(lVarA, i0VarJ, companion.c());
        d4.b(lVarA, xVarC, companion.e());
        wn0.p<b4.g, Integer, h0> pVarB = companion.b();
        if (lVarA.u() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
            lVarA.B(Integer.valueOf(iA));
            lVarA.f(Integer.valueOf(iA), pVarB);
        }
        qVarA.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
        lVarV.H(2058660585);
        androidx.compose.foundation.layout.i iVar = androidx.compose.foundation.layout.i.f4585a;
        long jK = k3.p1.INSTANCE.k();
        androidx.compose.ui.d dVarQ = x.q(androidx.compose.ui.d.INSTANCE, w4.h.g(10));
        lVarV.H(-1665292485);
        boolean z11 = (((i11 & 7168) ^ 3072) > 2048 && lVarV.n(str)) || (i11 & 3072) == 2048;
        Object objI = lVarV.I();
        if (z11 || objI == p020r2.l.INSTANCE.a()) {
            objI = new C1744h(str);
            lVarV.B(objI);
        }
        lVarV.T();
        e1.a(bVar, null, g4.o.d(dVarQ, false, (wn0.l) objI, 1, null), jK, lVarV, 3128, 0);
        lVarV.T();
        lVarV.g();
        lVarV.T();
        lVarV.T();
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new i(j11, bVar, aVar, str, dVar, i11));
        }
    }
}
