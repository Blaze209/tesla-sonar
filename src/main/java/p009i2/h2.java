package p009i2;

import androidx.compose.ui.platform.z0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import g4.v;
import g4.y;
import java.util.ArrayList;
import java.util.List;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p019p1.a;
import p019p1.f0;
import p019p1.j;
import p019p1.m;
import p019p1.o1;
import p020r2.d4;
import p020r2.i2;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w2;
import p020r2.x;
import p020r2.y3;
import wn0.p;
import wn0.q;
import z3.i0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a7\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\u0010\u001a\u00020\u000f*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a7\u0010\u0014\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a;\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\u001c2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0019\u001a\u00020\u000b2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u001aH\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a+\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170\u001c2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0019\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u001f\u0010 *0\b\u0002\u0010!\"\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u001a\u0012\u0004\u0012\u00020\u00060\u00042\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u001a\u0012\u0004\u0012\u00020\u00060\u0004¨\u0006\""}, d2 = {"Li2/i2;", "hostState", "Landroidx/compose/ui/d;", "modifier", "Lkotlin/Function1;", "Li2/e2;", "Ljn0/h0;", "snackbar", "b", "(Li2/i2;Landroidx/compose/ui/d;Lwn0/q;Lr2/l;II)V", "Li2/g2;", "", "hasAction", "Landroidx/compose/ui/platform/i;", "accessibilityManager", "", "h", "(Li2/g2;ZLandroidx/compose/ui/platform/i;)J", "current", "content", "a", "(Li2/e2;Landroidx/compose/ui/d;Lwn0/q;Lr2/l;II)V", "Lp1/i;", "", "animation", "visible", "Lkotlin/Function0;", "onAnimationFinish", "Lr2/y3;", "f", "(Lp1/i;ZLwn0/a;Lr2/l;II)Lr2/y3;", "g", "(Lp1/i;ZLr2/l;I)Lr2/y3;", "FadeInFadeOutTransition", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class h2 {

    /* JADX INFO: renamed from: i2.h2$a, reason: from Kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "Ljn0/h0;", "children", "a", "(Lwn0/p;Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class Function0 extends u implements q<p<? super l, ? super Integer, ? extends h0>, l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e2 f74470c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ e2 f74471d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ List<e2> f74472e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ y0<e2> f74473f;

        /* JADX INFO: renamed from: i2.h2$a$a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg4/y;", "Ljn0/h0;", "a", "(Lg4/y;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends u implements wn0.l<y, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ e2 f74474c;

            /* JADX INFO: renamed from: i2.h2$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
            static final class C1557a extends u implements wn0.a<Boolean> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ e2 f74475c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1557a(e2 e2Var) {
                    super(0);
                    this.f74475c = e2Var;
                }

                @Override // wn0.a
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke() {
                    this.f74475c.dismiss();
                    return Boolean.TRUE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e2 e2Var) {
                super(1);
                this.f74474c = e2Var;
            }

            public final void a(y yVar) {
                v.h0(yVar, g4.g.INSTANCE.b());
                v.n(yVar, null, new C1557a(this.f74474c), 1, null);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(y yVar) {
                a(yVar);
                return h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: i2.h2$a$b */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
        static final class b extends u implements wn0.a<h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ e2 f74476c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ y0<e2> f74477d;

            /* JADX INFO: renamed from: i2.h2$a$b$a */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Li2/x0;", "Li2/e2;", "it", "", "a", "(Li2/x0;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
            static final class a extends u implements wn0.l<FadeInFadeOutAnimationItem<e2>, Boolean> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ e2 f74478c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(e2 e2Var) {
                    super(1);
                    this.f74478c = e2Var;
                }

                @Override // wn0.l
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(FadeInFadeOutAnimationItem<e2> fadeInFadeOutAnimationItem) {
                    return Boolean.valueOf(s.f(fadeInFadeOutAnimationItem.c(), this.f74478c));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(e2 e2Var, y0<e2> y0Var) {
                super(0);
                this.f74476c = e2Var;
                this.f74477d = y0Var;
            }

            public final void b() {
                if (s.f(this.f74476c, this.f74477d.getCurrent())) {
                    return;
                }
                p013kotlin.collections.v.L(this.f74477d.b(), new a(this.f74476c));
                i2 scope = this.f74477d.getScope();
                if (scope != null) {
                    scope.invalidate();
                }
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ h0 invoke() {
                b();
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Function0(e2 e2Var, e2 e2Var2, List<e2> list, y0<e2> y0Var) {
            super(3);
            this.f74470c = e2Var;
            this.f74471d = e2Var2;
            this.f74472e = list;
            this.f74473f = y0Var;
        }

        public final void a(p<? super l, ? super Integer, h0> pVar, l lVar, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = i11 | (lVar.K(pVar) ? 4 : 2);
            } else {
                i12 = i11;
            }
            if ((i12 & 19) == 18 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(1471040642, i12, -1, "androidx.compose.material.FadeInFadeOutWithScale.<anonymous>.<anonymous> (SnackbarHost.kt:274)");
            }
            boolean zF = s.f(this.f74470c, this.f74471d);
            int i13 = zF ? 150 : 75;
            int i14 = (!zF || y4.a.b(this.f74472e).size() == 1) ? 0 : 75;
            o1 o1VarK = j.k(i13, i14, f0.d());
            boolean zK = lVar.K(this.f74470c) | lVar.K(this.f74473f);
            e2 e2Var = this.f74470c;
            y0<e2> y0Var = this.f74473f;
            Object objI = lVar.I();
            if (zK || objI == l.INSTANCE.a()) {
                objI = new b(e2Var, y0Var);
                lVar.B(objI);
            }
            y3 y3VarF = h2.f(o1VarK, zF, (wn0.a) objI, lVar, 0, 0);
            y3 y3VarG = h2.g(j.k(i13, i14, f0.c()), zF, lVar, 0);
            androidx.compose.ui.d dVarC = androidx.compose.ui.graphics.b.c(androidx.compose.ui.d.INSTANCE, ((Number) y3VarG.getValue()).floatValue(), ((Number) y3VarG.getValue()).floatValue(), ((Number) y3VarF.getValue()).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0L, null, false, null, 0L, 0L, 0, 131064, null);
            boolean zK2 = lVar.K(this.f74470c);
            e2 e2Var2 = this.f74470c;
            Object objI2 = lVar.I();
            if (zK2 || objI2 == l.INSTANCE.a()) {
                objI2 = new a(e2Var2);
                lVar.B(objI2);
            }
            androidx.compose.ui.d dVarD = g4.o.d(dVarC, false, (wn0.l) objI2, 1, null);
            i0 i0VarH = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.o(), false);
            int iA = p020r2.j.a(lVar, 0);
            x xVarC = lVar.c();
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVar, dVarD);
            b4.g.Companion companion = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion.a();
            if (lVar.w() == null) {
                p020r2.j.c();
            }
            lVar.h();
            if (lVar.u()) {
                lVar.z(aVarA);
            } else {
                lVar.d();
            }
            l lVarA = d4.a(lVar);
            d4.b(lVarA, i0VarH, companion.c());
            d4.b(lVarA, xVarC, companion.e());
            p<b4.g, Integer, h0> pVarB = companion.b();
            if (lVarA.u() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            d4.b(lVarA, dVarE, companion.d());
            androidx.compose.foundation.layout.i iVar = androidx.compose.foundation.layout.i.f4585a;
            pVar.invoke(lVar, Integer.valueOf(i12 & 14));
            lVar.g();
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ h0 invoke(p<? super l, ? super Integer, ? extends h0> pVar, l lVar, Integer num) {
            a(pVar, lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ q<e2, l, Integer, h0> f74479c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ e2 f74480d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(q<? super e2, ? super l, ? super Integer, h0> qVar, e2 e2Var) {
            super(2);
            this.f74479c = qVar;
            this.f74480d = e2Var;
        }

        public final void a(l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(2041982076, i11, -1, "androidx.compose.material.FadeInFadeOutWithScale.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SnackbarHost.kt:327)");
            }
            q<e2, l, Integer, h0> qVar = this.f74479c;
            e2 e2Var = this.f74480d;
            s.h(e2Var);
            qVar.invoke(e2Var, lVar, 0);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e2 f74481c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f74482d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ q<e2, l, Integer, h0> f74483e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f74484f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f74485g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(e2 e2Var, androidx.compose.ui.d dVar, q<? super e2, ? super l, ? super Integer, h0> qVar, int i11, int i12) {
            super(2);
            this.f74481c = e2Var;
            this.f74482d = dVar;
            this.f74483e = qVar;
            this.f74484f = i11;
            this.f74485g = i12;
        }

        public final void a(l lVar, int i11) {
            h2.a(this.f74481c, this.f74482d, this.f74483e, lVar, k2.a(this.f74484f | 1), this.f74485g);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.material.SnackbarHostKt$SnackbarHost$1$1", f = "SnackbarHost.kt", i = {}, l = {167}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f74486n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ e2 f74487o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.i f74488p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(e2 e2Var, androidx.compose.ui.platform.i iVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f74487o = e2Var;
            this.f74488p = iVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new d(this.f74487o, this.f74488p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f74486n;
            if (i11 == 0) {
                t.b(obj);
                e2 e2Var = this.f74487o;
                if (e2Var != null) {
                    long jH = h2.h(e2Var.getDuration(), this.f74487o.b() != null, this.f74488p);
                    this.f74486n = 1;
                    if (DelayKt.delay(jH, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return h0.f84049a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            this.f74487o.dismiss();
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ i2 f74489c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f74490d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ q<e2, l, Integer, h0> f74491e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f74492f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f74493g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(i2 i2Var, androidx.compose.ui.d dVar, q<? super e2, ? super l, ? super Integer, h0> qVar, int i11, int i12) {
            super(2);
            this.f74489c = i2Var;
            this.f74490d = dVar;
            this.f74491e = qVar;
            this.f74492f = i11;
            this.f74493g = i12;
        }

        public final void a(l lVar, int i11) {
            h2.b(this.f74489c, this.f74490d, this.f74491e, lVar, k2.a(this.f74492f | 1), this.f74493g);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f74494a;

        static {
            int[] iArr = new int[g2.values().length];
            try {
                iArr[g2.Indefinite.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g2.Long.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g2.Short.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f74494a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.material.SnackbarHostKt$animatedOpacity$2$1", f = "SnackbarHost.kt", i = {}, l = {357}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f74496n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ a<Float, m> f74497o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ boolean f74498p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ p019p1.i<Float> f74499q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f74500r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(a<Float, m> aVar, boolean z11, p019p1.i<Float> iVar, wn0.a<h0> aVar2, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f74497o = aVar;
            this.f74498p = z11;
            this.f74499q = iVar;
            this.f74500r = aVar2;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new h(this.f74497o, this.f74498p, this.f74499q, this.f74500r, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            h hVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f74496n;
            if (i11 == 0) {
                t.b(obj);
                a<Float, m> aVar = this.f74497o;
                Float fBoxFloat = Boxing.boxFloat(this.f74498p ? 1.0f : BitmapDescriptorFactory.HUE_RED);
                p019p1.i<Float> iVar = this.f74499q;
                this.f74496n = 1;
                hVar = this;
                if (a.f(aVar, fBoxFloat, iVar, null, null, hVar, 12, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                hVar = this;
            }
            hVar.f74500r.invoke();
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.material.SnackbarHostKt$animatedScale$1$1", f = "SnackbarHost.kt", i = {}, l = {370}, m = "invokeSuspend", n = {}, s = {})
    static final class i extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f74501n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ a<Float, m> f74502o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ boolean f74503p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ p019p1.i<Float> f74504q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(a<Float, m> aVar, boolean z11, p019p1.i<Float> iVar, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f74502o = aVar;
            this.f74503p = z11;
            this.f74504q = iVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new i(this.f74502o, this.f74503p, this.f74504q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f74501n;
            if (i11 == 0) {
                t.b(obj);
                a<Float, m> aVar = this.f74502o;
                Float fBoxFloat = Boxing.boxFloat(this.f74503p ? 1.0f : 0.8f);
                p019p1.i<Float> iVar = this.f74504q;
                this.f74501n = 1;
                if (a.f(aVar, fBoxFloat, iVar, null, null, this, 12, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:35:0x005e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:51:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c6 A[LOOP:0: B:55:0x00c4->B:56:0x00c6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fd A[LOOP:1: B:61:0x00fb->B:62:0x00fd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x0122  */
    /* JADX WARN: Code duplicated, block: B:67:0x014e  */
    /* JADX WARN: Code duplicated, block: B:70:0x015a  */
    /* JADX WARN: Code duplicated, block: B:71:0x015e  */
    /* JADX WARN: Code duplicated, block: B:74:0x017d  */
    /* JADX WARN: Code duplicated, block: B:76:0x018b  */
    /* JADX WARN: Code duplicated, block: B:79:0x01bb A[LOOP:2: B:78:0x01b9->B:79:0x01bb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:85:0x0200  */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    public static final void a(e2 e2Var, androidx.compose.ui.d dVar, q<? super e2, ? super l, ? super Integer, h0> qVar, l lVar, int i11, int i12) {
        int i13;
        androidx.compose.ui.d dVar2;
        int i14;
        androidx.compose.ui.d dVar3;
        Object objI;
        y0 y0Var;
        int iA;
        wn0.a<b4.g> aVarA;
        l lVarA;
        p<b4.g, Integer, h0> pVarB;
        List listB;
        int size;
        int i15;
        List listB2;
        ArrayList arrayList;
        int size2;
        int i16;
        List listP1;
        List listB3;
        List listB4;
        int size3;
        int i17;
        w2 w2VarX;
        e2 e2Var2 = e2Var;
        l lVarV = lVar.v(2036134589);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = ((i11 & 8) == 0 ? lVarV.n(e2Var2) : lVarV.K(e2Var2) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i18 = i12 & 2;
        if (i18 == 0) {
            if ((i11 & 48) == 0) {
                dVar2 = dVar;
                i13 |= lVarV.n(dVar2) ? 32 : 16;
            }
            if ((i12 & 4) != 0) {
                i13 |= KyberEngine.KyberPolyBytes;
            } else if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                if (lVarV.K(qVar)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i13 |= i14;
            }
            if ((i13 & 147) == 146 || !lVarV.b()) {
                if (i18 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (o.J()) {
                    o.S(2036134589, i13, -1, "androidx.compose.material.FadeInFadeOutWithScale (SnackbarHost.kt:263)");
                }
                objI = lVarV.I();
                if (objI == l.INSTANCE.a()) {
                    objI = new y0();
                    lVarV.B(objI);
                }
                y0Var = (y0) objI;
                if (s.f(e2Var2, y0Var.getCurrent())) {
                    lVarV.o(1524065801);
                    lVarV.l();
                } else {
                    lVarV.o(1521898746);
                    y0Var.d(e2Var2);
                    listB2 = y0Var.b();
                    arrayList = new ArrayList(listB2.size());
                    size2 = listB2.size();
                    for (i16 = 0; i16 < size2; i16++) {
                        arrayList.add((e2) ((FadeInFadeOutAnimationItem) listB2.get(i16)).c());
                    }
                    listP1 = p013kotlin.collections.v.p1(arrayList);
                    if (!listP1.contains(e2Var2)) {
                        listP1.add(e2Var2);
                    }
                    y0Var.b().clear();
                    listB3 = y4.a.b(listP1);
                    listB4 = y0Var.b();
                    size3 = listB3.size();
                    i17 = 0;
                    while (i17 < size3) {
                        e2 e2Var3 = (e2) listB3.get(i17);
                        listB4.add(new FadeInFadeOutAnimationItem(e2Var3, z2.c.e(1471040642, true, new Function0(e2Var3, e2Var2, listP1, y0Var), lVarV, 54)));
                        i17++;
                        e2Var2 = e2Var;
                    }
                    lVarV.l();
                }
                i0 i0VarH = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.o(), false);
                iA = p020r2.j.a(lVarV, 0);
                x xVarC = lVarV.c();
                androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVarV, dVar3);
                b4.g.Companion companion = b4.g.INSTANCE;
                aVarA = companion.a();
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.u()) {
                    lVarV.z(aVarA);
                } else {
                    lVarV.d();
                }
                lVarA = d4.a(lVarV);
                d4.b(lVarA, i0VarH, companion.c());
                d4.b(lVarA, xVarC, companion.e());
                pVarB = companion.b();
                if (lVarA.u() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                d4.b(lVarA, dVarE, companion.d());
                androidx.compose.foundation.layout.i iVar = androidx.compose.foundation.layout.i.f4585a;
                y0Var.e(p020r2.j.b(lVarV, 0));
                lVarV.o(1801432280);
                listB = y0Var.b();
                size = listB.size();
                for (i15 = 0; i15 < size; i15++) {
                    FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem = (FadeInFadeOutAnimationItem) listB.get(i15);
                    e2 e2Var4 = (e2) fadeInFadeOutAnimationItem.a();
                    q<p<? super l, ? super Integer, h0>, l, Integer, h0> qVarB = fadeInFadeOutAnimationItem.b();
                    lVarV.M(2123976768, e2Var4);
                    qVarB.invoke(z2.c.e(2041982076, true, new b(qVar, e2Var4), lVarV, 54), lVarV, 6);
                    lVarV.S();
                }
                lVarV.l();
                lVarV.g();
                if (o.J()) {
                    o.R();
                }
            } else {
                lVarV.j();
                dVar3 = dVar2;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new c(e2Var, dVar3, qVar, i11, i12));
            }
        }
        i13 |= 48;
        dVar2 = dVar;
        if ((i12 & 4) != 0) {
            i13 |= KyberEngine.KyberPolyBytes;
        } else if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            if (lVarV.K(qVar)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i13 |= i14;
        }
        if ((i13 & 147) == 146) {
            if (i18 != 0) {
                dVar3 = androidx.compose.ui.d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (o.J()) {
                o.S(2036134589, i13, -1, "androidx.compose.material.FadeInFadeOutWithScale (SnackbarHost.kt:263)");
            }
            objI = lVarV.I();
            if (objI == l.INSTANCE.a()) {
                objI = new y0();
                lVarV.B(objI);
            }
            y0Var = (y0) objI;
            if (s.f(e2Var2, y0Var.getCurrent())) {
                lVarV.o(1521898746);
                y0Var.d(e2Var2);
                listB2 = y0Var.b();
                arrayList = new ArrayList(listB2.size());
                size2 = listB2.size();
                while (i16 < size2) {
                    arrayList.add((e2) ((FadeInFadeOutAnimationItem) listB2.get(i16)).c());
                }
                listP1 = p013kotlin.collections.v.p1(arrayList);
                if (!listP1.contains(e2Var2)) {
                    listP1.add(e2Var2);
                }
                y0Var.b().clear();
                listB3 = y4.a.b(listP1);
                listB4 = y0Var.b();
                size3 = listB3.size();
                i17 = 0;
                while (i17 < size3) {
                    e2 e2Var5 = (e2) listB3.get(i17);
                    listB4.add(new FadeInFadeOutAnimationItem(e2Var5, z2.c.e(1471040642, true, new Function0(e2Var5, e2Var2, listP1, y0Var), lVarV, 54)));
                    i17++;
                    e2Var2 = e2Var;
                }
                lVarV.l();
            } else {
                lVarV.o(1524065801);
                lVarV.l();
            }
            i0 i0VarH2 = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.o(), false);
            iA = p020r2.j.a(lVarV, 0);
            x xVarC2 = lVarV.c();
            androidx.compose.ui.d dVarE2 = androidx.compose.ui.c.e(lVarV, dVar3);
            b4.g.Companion companion2 = b4.g.INSTANCE;
            aVarA = companion2.a();
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.u()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            lVarA = d4.a(lVarV);
            d4.b(lVarA, i0VarH2, companion2.c());
            d4.b(lVarA, xVarC2, companion2.e());
            pVarB = companion2.b();
            if (lVarA.u()) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            } else {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            d4.b(lVarA, dVarE2, companion2.d());
            androidx.compose.foundation.layout.i iVar2 = androidx.compose.foundation.layout.i.f4585a;
            y0Var.e(p020r2.j.b(lVarV, 0));
            lVarV.o(1801432280);
            listB = y0Var.b();
            size = listB.size();
            while (i15 < size) {
                FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem2 = (FadeInFadeOutAnimationItem) listB.get(i15);
                e2 e2Var6 = (e2) fadeInFadeOutAnimationItem2.a();
                q<p<? super l, ? super Integer, h0>, l, Integer, h0> qVarB2 = fadeInFadeOutAnimationItem2.b();
                lVarV.M(2123976768, e2Var6);
                qVarB2.invoke(z2.c.e(2041982076, true, new b(qVar, e2Var6), lVarV, 54), lVarV, 6);
                lVarV.S();
            }
            lVarV.l();
            lVarV.g();
            if (o.J()) {
                o.R();
            }
        } else {
            if (i18 != 0) {
                dVar3 = androidx.compose.ui.d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (o.J()) {
                o.S(2036134589, i13, -1, "androidx.compose.material.FadeInFadeOutWithScale (SnackbarHost.kt:263)");
            }
            objI = lVarV.I();
            if (objI == l.INSTANCE.a()) {
                objI = new y0();
                lVarV.B(objI);
            }
            y0Var = (y0) objI;
            if (s.f(e2Var2, y0Var.getCurrent())) {
                lVarV.o(1521898746);
                y0Var.d(e2Var2);
                listB2 = y0Var.b();
                arrayList = new ArrayList(listB2.size());
                size2 = listB2.size();
                while (i16 < size2) {
                    arrayList.add((e2) ((FadeInFadeOutAnimationItem) listB2.get(i16)).c());
                }
                listP1 = p013kotlin.collections.v.p1(arrayList);
                if (!listP1.contains(e2Var2)) {
                    listP1.add(e2Var2);
                }
                y0Var.b().clear();
                listB3 = y4.a.b(listP1);
                listB4 = y0Var.b();
                size3 = listB3.size();
                i17 = 0;
                while (i17 < size3) {
                    e2 e2Var7 = (e2) listB3.get(i17);
                    listB4.add(new FadeInFadeOutAnimationItem(e2Var7, z2.c.e(1471040642, true, new Function0(e2Var7, e2Var2, listP1, y0Var), lVarV, 54)));
                    i17++;
                    e2Var2 = e2Var;
                }
                lVarV.l();
            } else {
                lVarV.o(1524065801);
                lVarV.l();
            }
            i0 i0VarH3 = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.o(), false);
            iA = p020r2.j.a(lVarV, 0);
            x xVarC3 = lVarV.c();
            androidx.compose.ui.d dVarE3 = androidx.compose.ui.c.e(lVarV, dVar3);
            b4.g.Companion companion3 = b4.g.INSTANCE;
            aVarA = companion3.a();
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.u()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            lVarA = d4.a(lVarV);
            d4.b(lVarA, i0VarH3, companion3.c());
            d4.b(lVarA, xVarC3, companion3.e());
            pVarB = companion3.b();
            if (lVarA.u()) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            } else {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            d4.b(lVarA, dVarE3, companion3.d());
            androidx.compose.foundation.layout.i iVar3 = androidx.compose.foundation.layout.i.f4585a;
            y0Var.e(p020r2.j.b(lVarV, 0));
            lVarV.o(1801432280);
            listB = y0Var.b();
            size = listB.size();
            while (i15 < size) {
                FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem3 = (FadeInFadeOutAnimationItem) listB.get(i15);
                e2 e2Var8 = (e2) fadeInFadeOutAnimationItem3.a();
                q<p<? super l, ? super Integer, h0>, l, Integer, h0> qVarB3 = fadeInFadeOutAnimationItem3.b();
                lVarV.M(2123976768, e2Var8);
                qVarB3.invoke(z2.c.e(2041982076, true, new b(qVar, e2Var8), lVarV, 54), lVarV, 6);
                lVarV.S();
            }
            lVarV.l();
            lVarV.g();
            if (o.J()) {
                o.R();
            }
        }
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new c(e2Var, dVar3, qVar, i11, i12));
        }
    }

    public static final void b(i2 i2Var, androidx.compose.ui.d dVar, q<? super e2, ? super l, ? super Integer, h0> qVar, l lVar, int i11, int i12) {
        int i13;
        androidx.compose.ui.d dVar2;
        q<? super e2, ? super l, ? super Integer, h0> qVar2;
        l lVarV = lVar.v(431012348);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (lVarV.n(i2Var) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= lVarV.n(dVar) ? 32 : 16;
        }
        int i15 = i12 & 4;
        if (i15 != 0) {
            i13 |= KyberEngine.KyberPolyBytes;
        } else if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i13 |= lVarV.K(qVar) ? 256 : 128;
        }
        if ((i13 & 147) == 146 && lVarV.b()) {
            lVarV.j();
            dVar2 = dVar;
            qVar2 = qVar;
        } else {
            if (i14 != 0) {
                dVar = androidx.compose.ui.d.INSTANCE;
            }
            if (i15 != 0) {
                qVar = w.f75381a.a();
            }
            q<? super e2, ? super l, ? super Integer, h0> qVar3 = qVar;
            if (o.J()) {
                o.S(431012348, i13, -1, "androidx.compose.material.SnackbarHost (SnackbarHost.kt:157)");
            }
            e2 e2VarA = i2Var.a();
            androidx.compose.ui.platform.i iVar = (androidx.compose.ui.platform.i) lVarV.U(z0.c());
            boolean zK = lVarV.K(e2VarA) | lVarV.K(iVar);
            Object objI = lVarV.I();
            if (zK || objI == l.INSTANCE.a()) {
                objI = new d(e2VarA, iVar, null);
                lVarV.B(objI);
            }
            p020r2.Function0.g(e2VarA, (p) objI, lVarV, 0);
            androidx.compose.ui.d dVar3 = dVar;
            a(i2Var.a(), dVar3, qVar3, lVarV, i13 & 1008, 0);
            if (o.J()) {
                o.R();
            }
            dVar2 = dVar3;
            qVar2 = qVar3;
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new e(i2Var, dVar2, qVar2, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y3<Float> f(p019p1.i<Float> iVar, boolean z11, wn0.a<h0> aVar, l lVar, int i11, int i12) {
        if ((i12 & 4) != 0) {
            aVar = g.f74495c;
        }
        wn0.a<h0> aVar2 = aVar;
        if (o.J()) {
            o.S(1016418159, i11, -1, "androidx.compose.material.animatedOpacity (SnackbarHost.kt:353)");
        }
        Object objI = lVar.I();
        l.Companion companion = l.INSTANCE;
        if (objI == companion.a()) {
            objI = p019p1.b.b(!z11 ? 1.0f : 0.0f, BitmapDescriptorFactory.HUE_RED, 2, null);
            lVar.B(objI);
        }
        a aVar3 = (a) objI;
        Boolean boolValueOf = Boolean.valueOf(z11);
        boolean zK = lVar.K(aVar3) | ((((i11 & 112) ^ 48) > 32 && lVar.p(z11)) || (i11 & 48) == 32) | lVar.K(iVar) | ((((i11 & 896) ^ KyberEngine.KyberPolyBytes) > 256 && lVar.n(aVar2)) || (i11 & KyberEngine.KyberPolyBytes) == 256);
        Object objI2 = lVar.I();
        if (zK || objI2 == companion.a()) {
            Object hVar = new h(aVar3, z11, iVar, aVar2, null);
            lVar.B(hVar);
            objI2 = hVar;
        }
        p020r2.Function0.g(boolValueOf, (p) objI2, lVar, (i11 >> 3) & 14);
        y3<Float> y3VarG = aVar3.g();
        if (o.J()) {
            o.R();
        }
        return y3VarG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y3<Float> g(p019p1.i<Float> iVar, boolean z11, l lVar, int i11) {
        if (o.J()) {
            o.S(2003504988, i11, -1, "androidx.compose.material.animatedScale (SnackbarHost.kt:366)");
        }
        Object objI = lVar.I();
        l.Companion companion = l.INSTANCE;
        if (objI == companion.a()) {
            objI = p019p1.b.b(!z11 ? 1.0f : 0.8f, BitmapDescriptorFactory.HUE_RED, 2, null);
            lVar.B(objI);
        }
        a aVar = (a) objI;
        Boolean boolValueOf = Boolean.valueOf(z11);
        boolean zK = lVar.K(aVar) | ((((i11 & 112) ^ 48) > 32 && lVar.p(z11)) || (i11 & 48) == 32) | lVar.K(iVar);
        Object objI2 = lVar.I();
        if (zK || objI2 == companion.a()) {
            objI2 = new i(aVar, z11, iVar, null);
            lVar.B(objI2);
        }
        p020r2.Function0.g(boolValueOf, (p) objI2, lVar, (i11 >> 3) & 14);
        y3<Float> y3VarG = aVar.g();
        if (o.J()) {
            o.R();
        }
        return y3VarG;
    }

    public static final long h(g2 g2Var, boolean z11, androidx.compose.ui.platform.i iVar) {
        long j11;
        int i11 = f.f74494a[g2Var.ordinal()];
        if (i11 == 1) {
            j11 = Long.MAX_VALUE;
        } else if (i11 == 2) {
            j11 = 10000;
        } else {
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            j11 = 4000;
        }
        long j12 = j11;
        return iVar == null ? j12 : iVar.a(j12, true, true, z11);
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class g extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f74495c = new g();

        g() {
            super(0);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }

        public final void b() {
        }
    }
}
