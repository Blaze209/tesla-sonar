package j80;

import androidx.compose.ui.platform.s2;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import jn0.h0;
import n70.DisplayableSavedPaymentMethod;
import p008h80.v0;
import p013kotlin.Metadata;
import p020r2.d4;
import p020r2.k2;
import p020r2.w2;
import p020r2.x;
import p020r2.y2;
import p020r2.y3;
import v1.e0;
import v1.g0;
import z3.a0;
import z3.i0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a_\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00020\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00020\fH\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013²\u0006\f\u0010\u0012\u001a\u00020\u00118\nX\u008a\u0084\u0002"}, d2 = {"Lj80/i;", "interactor", "Ljn0/h0;", "a", "(Lj80/i;Lr2/l;I)V", "", "isSelected", "isEditing", "isModifiable", "canRemove", "Ln70/g;", "paymentMethod", "Lkotlin/Function1;", "deletePaymentMethod", "editPaymentMethod", "c", "(ZZZZLn70/g;Lwn0/l;Lwn0/l;Lr2/l;I)V", "Lj80/i$a;", "state", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class j {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ i f82958c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ DisplayableSavedPaymentMethod f82959d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i iVar, DisplayableSavedPaymentMethod displayableSavedPaymentMethod) {
            super(0);
            this.f82958c = iVar;
            this.f82959d = displayableSavedPaymentMethod;
        }

        public final void b() {
            this.f82958c.a(new i.b.SelectPaymentMethod(this.f82959d));
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv1/g0;", "Ljn0/h0;", "a", "(Lv1/g0;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.q<g0, p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f82960c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ DisplayableSavedPaymentMethod f82961d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ y3<i.State> f82962e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ i f82963f;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ln70/g;", "paymentMethod", "Ljn0/h0;", "a", "(Ln70/g;)V"}, k = 3, mv = {1, 9, 0})
        static final class a extends p013kotlin.jvm.internal.u implements wn0.l<DisplayableSavedPaymentMethod, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ i f82964c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(i iVar) {
                super(1);
                this.f82964c = iVar;
            }

            public final void a(DisplayableSavedPaymentMethod paymentMethod) {
                p013kotlin.jvm.internal.s.k(paymentMethod, "paymentMethod");
                this.f82964c.a(new i.b.DeletePaymentMethod(paymentMethod));
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(DisplayableSavedPaymentMethod displayableSavedPaymentMethod) {
                a(displayableSavedPaymentMethod);
                return h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: j80.j$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ln70/g;", "paymentMethod", "Ljn0/h0;", "a", "(Ln70/g;)V"}, k = 3, mv = {1, 9, 0})
        static final class C1746b extends p013kotlin.jvm.internal.u implements wn0.l<DisplayableSavedPaymentMethod, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ i f82965c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1746b(i iVar) {
                super(1);
                this.f82965c = iVar;
            }

            public final void a(DisplayableSavedPaymentMethod paymentMethod) {
                p013kotlin.jvm.internal.s.k(paymentMethod, "paymentMethod");
                this.f82965c.a(new i.b.EditPaymentMethod(paymentMethod));
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(DisplayableSavedPaymentMethod displayableSavedPaymentMethod) {
                a(displayableSavedPaymentMethod);
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z11, DisplayableSavedPaymentMethod displayableSavedPaymentMethod, y3<i.State> y3Var, i iVar) {
            super(3);
            this.f82960c = z11;
            this.f82961d = displayableSavedPaymentMethod;
            this.f82962e = y3Var;
            this.f82963f = iVar;
        }

        public final void a(g0 SavedPaymentMethodRowButton, p020r2.l lVar, int i11) {
            p013kotlin.jvm.internal.s.k(SavedPaymentMethodRowButton, "$this$SavedPaymentMethodRowButton");
            if ((i11 & 81) == 16 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(77758085, i11, -1, "com.stripe.android.paymentsheet.verticalmode.ManageScreenUI.<anonymous>.<anonymous>.<anonymous> (ManageScreenUI.kt:40)");
            }
            j.c(this.f82960c, j.b(this.f82962e).getIsEditing(), this.f82961d.f(), j.b(this.f82962e).getCanRemove(), this.f82961d, new a(this.f82963f), new C1746b(this.f82963f), lVar, 32768);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ h0 invoke(g0 g0Var, p020r2.l lVar, Integer num) {
            a(g0Var, lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class c extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ i f82966c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f82967d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(i iVar, int i11) {
            super(2);
            this.f82966c = iVar;
            this.f82967d = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            j.a(this.f82966c, lVar, k2.a(this.f82967d | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class d extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f82968c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f82969d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f82970e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f82971f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ DisplayableSavedPaymentMethod f82972g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ wn0.l<DisplayableSavedPaymentMethod, h0> f82973h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ wn0.l<DisplayableSavedPaymentMethod, h0> f82974i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f82975j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(boolean z11, boolean z12, boolean z13, boolean z14, DisplayableSavedPaymentMethod displayableSavedPaymentMethod, wn0.l<? super DisplayableSavedPaymentMethod, h0> lVar, wn0.l<? super DisplayableSavedPaymentMethod, h0> lVar2, int i11) {
            super(2);
            this.f82968c = z11;
            this.f82969d = z12;
            this.f82970e = z13;
            this.f82971f = z14;
            this.f82972g = displayableSavedPaymentMethod;
            this.f82973h = lVar;
            this.f82974i = lVar2;
            this.f82975j = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            j.c(this.f82968c, this.f82969d, this.f82970e, this.f82971f, this.f82972g, this.f82973h, this.f82974i, lVar, k2.a(this.f82975j | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static final void a(i interactor, p020r2.l lVar, int i11) {
        p013kotlin.jvm.internal.s.k(interactor, "interactor");
        p020r2.l lVarV = lVar.v(-655977581);
        int i12 = (i11 & 14) == 0 ? (lVarV.n(interactor) ? 4 : 2) | i11 : i11;
        if ((i12 & 11) == 2 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(-655977581, i12, -1, "com.stripe.android.paymentsheet.verticalmode.ManageScreenUI (ManageScreenUI.kt:18)");
            }
            float fA = e4.f.a(n70.t.f93465e, lVarV, 0);
            y3 y3VarA = r90.f.a(interactor.getState(), lVarV, 8);
            androidx.compose.ui.d dVarA = s2.a(androidx.compose.foundation.layout.t.k(androidx.compose.ui.d.INSTANCE, fA, BitmapDescriptorFactory.HUE_RED, 2, null), "manage_screen_saved_pms_list");
            v1.b.f fVarN = v1.b.f117444a.n(w4.h.g(12));
            lVarV.H(-483455358);
            i0 i0VarA = v1.g.a(fVarN, d3.c.INSTANCE.k(), lVarV, 6);
            lVarV.H(-1323940314);
            int iA = p020r2.j.a(lVarV, 0);
            x xVarC = lVarV.c();
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
            if (lVarA.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
            lVarV.H(2058660585);
            v1.j jVar = v1.j.f117505a;
            lVarV.H(-648129373);
            for (DisplayableSavedPaymentMethod displayableSavedPaymentMethod : b(y3VarA).d()) {
                boolean zF = p013kotlin.jvm.internal.s.f(displayableSavedPaymentMethod, b(y3VarA).getCurrentSelection());
                p.a(displayableSavedPaymentMethod, true, !b(y3VarA).getIsEditing(), zF, null, new a(interactor, displayableSavedPaymentMethod), z2.c.b(lVarV, 77758085, true, new b(zF, displayableSavedPaymentMethod, y3VarA, interactor)), lVarV, 1572920, 16);
            }
            lVarV.T();
            lVarV.T();
            lVarV.g();
            lVarV.T();
            lVarV.T();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new c(interactor, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i.State b(y3<i.State> y3Var) {
        return y3Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(boolean z11, boolean z12, boolean z13, boolean z14, DisplayableSavedPaymentMethod displayableSavedPaymentMethod, wn0.l<? super DisplayableSavedPaymentMethod, h0> lVar, wn0.l<? super DisplayableSavedPaymentMethod, h0> lVar2, p020r2.l lVar3, int i11) {
        wn0.l<? super DisplayableSavedPaymentMethod, h0> lVar4;
        p020r2.l lVarV = lVar3.v(-176682203);
        if (p020r2.o.J()) {
            p020r2.o.S(-176682203, i11, -1, "com.stripe.android.paymentsheet.verticalmode.TrailingContent (ManageScreenUI.kt:75)");
        }
        if (z12 && z13) {
            lVarV.H(-959522877);
            v1.b.f fVarN = v1.b.f117444a.n(w4.h.g(12));
            lVarV.H(693286680);
            androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
            i0 i0VarB = e0.b(fVarN, d3.c.INSTANCE.l(), lVarV, 6);
            lVarV.H(-1323940314);
            int iA = p020r2.j.a(lVarV, 0);
            x xVarC = lVarV.c();
            b4.g.Companion companion2 = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion2.a();
            wn0.q<y2<b4.g>, p020r2.l, Integer, h0> qVarA = a0.a(companion);
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
            d4.b(lVarA, i0VarB, companion2.c());
            d4.b(lVarA, xVarC, companion2.e());
            wn0.p<b4.g, Integer, h0> pVarB = companion2.b();
            if (lVarA.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
            lVarV.H(2058660585);
            v1.h0 h0Var = v1.h0.f117504a;
            lVar4 = lVar2;
            h.b(displayableSavedPaymentMethod, lVar4, lVarV, ((i11 >> 15) & 112) | 8);
            lVarV.H(114380678);
            if (z14) {
                h.a(displayableSavedPaymentMethod, lVar, lVarV, ((i11 >> 12) & 112) | 8);
            }
            lVarV.T();
            lVarV.T();
            lVarV.g();
            lVarV.T();
            lVarV.T();
            lVarV.T();
        } else {
            lVar4 = lVar2;
            if (z12 && z14) {
                lVarV.H(-959251782);
                h.a(displayableSavedPaymentMethod, lVar, lVarV, ((i11 >> 12) & 112) | 8);
                lVarV.T();
            } else if (z11) {
                lVarV.H(-959169415);
                v0.a(null, lVarV, 0, 1);
                lVarV.T();
            } else {
                lVarV.H(-959139624);
                lVarV.T();
            }
        }
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new d(z11, z12, z13, z14, displayableSavedPaymentMethod, lVar, lVar4, i11));
        }
    }
}
