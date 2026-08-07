package p016o2;

import androidx.compose.foundation.layout.i;
import androidx.compose.ui.platform.z0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import g4.v;
import g4.y;
import java.util.ArrayList;
import java.util.List;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p013kotlin.Metadata;
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

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a7\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a7\u0010\f\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\f\u0010\r\u001a;\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00152\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0013H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a+\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00152\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0018\u0010\u0019*0\b\u0002\u0010\u001a\"\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0013\u0012\u0004\u0012\u00020\u00060\u00042\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0013\u0012\u0004\u0012\u00020\u00060\u0004¨\u0006\u001b"}, d2 = {"Lo2/j0;", "hostState", "Landroidx/compose/ui/d;", "modifier", "Lkotlin/Function1;", "Lo2/g0;", "Ljn0/h0;", "snackbar", "b", "(Lo2/j0;Landroidx/compose/ui/d;Lwn0/q;Lr2/l;II)V", "current", "content", "a", "(Lo2/g0;Landroidx/compose/ui/d;Lwn0/q;Lr2/l;II)V", "Lp1/i;", "", "animation", "", "visible", "Lkotlin/Function0;", "onAnimationFinish", "Lr2/y3;", "f", "(Lp1/i;ZLwn0/a;Lr2/l;II)Lr2/y3;", "g", "(Lp1/i;ZLr2/l;I)Lr2/y3;", "FadeInFadeOutTransition", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class i0 {

    /* JADX INFO: renamed from: o2.i0$a, reason: from Kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "Ljn0/h0;", "children", "a", "(Lwn0/p;Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class Function0 extends u implements q<p<? super l, ? super Integer, ? extends h0>, l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g0 f95907c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ g0 f95908d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ List<g0> f95909e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ q<g0> f95910f;

        /* JADX INFO: renamed from: o2.i0$a$a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg4/y;", "Ljn0/h0;", "a", "(Lg4/y;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends u implements wn0.l<y, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ g0 f95911c;

            /* JADX INFO: renamed from: o2.i0$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
            static final class C2044a extends u implements wn0.a<Boolean> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ g0 f95912c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2044a(g0 g0Var) {
                    super(0);
                    this.f95912c = g0Var;
                }

                @Override // wn0.a
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke() {
                    this.f95912c.dismiss();
                    return Boolean.TRUE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g0 g0Var) {
                super(1);
                this.f95911c = g0Var;
            }

            public final void a(y yVar) {
                v.h0(yVar, g4.g.INSTANCE.b());
                v.n(yVar, null, new C2044a(this.f95911c), 1, null);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(y yVar) {
                a(yVar);
                return h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: o2.i0$a$b */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
        static final class b extends u implements wn0.a<h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ g0 f95913c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ q<g0> f95914d;

            /* JADX INFO: renamed from: o2.i0$a$b$a */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo2/p;", "Lo2/g0;", "it", "", "a", "(Lo2/p;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
            static final class a extends u implements wn0.l<FadeInFadeOutAnimationItem<g0>, Boolean> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ g0 f95915c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(g0 g0Var) {
                    super(1);
                    this.f95915c = g0Var;
                }

                @Override // wn0.l
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(FadeInFadeOutAnimationItem<g0> fadeInFadeOutAnimationItem) {
                    return Boolean.valueOf(s.f(fadeInFadeOutAnimationItem.c(), this.f95915c));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(g0 g0Var, q<g0> qVar) {
                super(0);
                this.f95913c = g0Var;
                this.f95914d = qVar;
            }

            public final void b() {
                if (s.f(this.f95913c, this.f95914d.getCurrent())) {
                    return;
                }
                p013kotlin.collections.v.L(this.f95914d.b(), new a(this.f95913c));
                i2 scope = this.f95914d.getScope();
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
        Function0(g0 g0Var, g0 g0Var2, List<g0> list, q<g0> qVar) {
            super(3);
            this.f95907c = g0Var;
            this.f95908d = g0Var2;
            this.f95909e = list;
            this.f95910f = qVar;
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
                o.S(-1654683077, i12, -1, "androidx.compose.material3.FadeInFadeOutWithScale.<anonymous>.<anonymous> (SnackbarHost.kt:338)");
            }
            boolean zF = s.f(this.f95907c, this.f95908d);
            int i13 = zF ? 150 : 75;
            int i14 = (!zF || y4.a.b(this.f95909e).size() == 1) ? 0 : 75;
            o1 o1VarK = j.k(i13, i14, f0.d());
            boolean zN = lVar.n(this.f95907c) | lVar.K(this.f95910f);
            g0 g0Var = this.f95907c;
            q<g0> qVar = this.f95910f;
            Object objI = lVar.I();
            if (zN || objI == l.INSTANCE.a()) {
                objI = new b(g0Var, qVar);
                lVar.B(objI);
            }
            y3 y3VarF = i0.f(o1VarK, zF, (wn0.a) objI, lVar, 0, 0);
            y3 y3VarG = i0.g(j.k(i13, i14, f0.c()), zF, lVar, 0);
            androidx.compose.ui.d dVarC = androidx.compose.ui.graphics.b.c(androidx.compose.ui.d.INSTANCE, ((Number) y3VarG.getValue()).floatValue(), ((Number) y3VarG.getValue()).floatValue(), ((Number) y3VarF.getValue()).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0L, null, false, null, 0L, 0L, 0, 131064, null);
            boolean zN2 = lVar.n(this.f95907c);
            g0 g0Var2 = this.f95907c;
            Object objI2 = lVar.I();
            if (zN2 || objI2 == l.INSTANCE.a()) {
                objI2 = new a(g0Var2);
                lVar.B(objI2);
            }
            androidx.compose.ui.d dVarD = g4.o.d(dVarC, false, (wn0.l) objI2, 1, null);
            z3.i0 i0VarH = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.o(), false);
            int iA = p020r2.j.a(lVar, 0);
            x xVarC = lVar.c();
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVar, dVarD);
            b4.g.Companion companion = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion.a();
            if (lVar.w() == null) {
                p020r2.j.c();
            }
            lVar.h();
            if (lVar.getInserting()) {
                lVar.z(aVarA);
            } else {
                lVar.d();
            }
            l lVarA = d4.a(lVar);
            d4.b(lVarA, i0VarH, companion.c());
            d4.b(lVarA, xVarC, companion.e());
            p<b4.g, Integer, h0> pVarB = companion.b();
            if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            d4.b(lVarA, dVarE, companion.d());
            i iVar = i.f4585a;
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
        final /* synthetic */ q<g0, l, Integer, h0> f95916c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ g0 f95917d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(q<? super g0, ? super l, ? super Integer, h0> qVar, g0 g0Var) {
            super(2);
            this.f95916c = qVar;
            this.f95917d = g0Var;
        }

        public final void a(l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(-1135367807, i11, -1, "androidx.compose.material3.FadeInFadeOutWithScale.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SnackbarHost.kt:395)");
            }
            q<g0, l, Integer, h0> qVar = this.f95916c;
            g0 g0Var = this.f95917d;
            s.h(g0Var);
            qVar.invoke(g0Var, lVar, 0);
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
        final /* synthetic */ g0 f95918c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f95919d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ q<g0, l, Integer, h0> f95920e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f95921f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f95922g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(g0 g0Var, androidx.compose.ui.d dVar, q<? super g0, ? super l, ? super Integer, h0> qVar, int i11, int i12) {
            super(2);
            this.f95918c = g0Var;
            this.f95919d = dVar;
            this.f95920e = qVar;
            this.f95921f = i11;
            this.f95922g = i12;
        }

        public final void a(l lVar, int i11) {
            i0.a(this.f95918c, this.f95919d, this.f95920e, lVar, k2.a(this.f95921f | 1), this.f95922g);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.material3.SnackbarHostKt$SnackbarHost$1$1", f = "SnackbarHost.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f95923n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ g0 f95924o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.i f95925p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(g0 g0Var, androidx.compose.ui.platform.i iVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f95924o = g0Var;
            this.f95925p = iVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new d(this.f95924o, this.f95925p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f95923n;
            if (i11 == 0) {
                t.b(obj);
                g0 g0Var = this.f95924o;
                if (g0Var != null) {
                    g0Var.a();
                    throw null;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                this.f95924o.dismiss();
            }
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
        final /* synthetic */ j0 f95926c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f95927d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ q<g0, l, Integer, h0> f95928e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f95929f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f95930g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(j0 j0Var, androidx.compose.ui.d dVar, q<? super g0, ? super l, ? super Integer, h0> qVar, int i11, int i12) {
            super(2);
            this.f95926c = j0Var;
            this.f95927d = dVar;
            this.f95928e = qVar;
            this.f95929f = i11;
            this.f95930g = i12;
        }

        public final void a(l lVar, int i11) {
            i0.b(this.f95926c, this.f95927d, this.f95928e, lVar, k2.a(this.f95929f | 1), this.f95930g);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.material3.SnackbarHostKt$animatedOpacity$2$1", f = "SnackbarHost.kt", i = {}, l = {HttpStatusCode.UNPROCESSABLE_ENTITY_422}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f95932n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ a<Float, m> f95933o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ boolean f95934p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ p019p1.i<Float> f95935q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f95936r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(a<Float, m> aVar, boolean z11, p019p1.i<Float> iVar, wn0.a<h0> aVar2, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f95933o = aVar;
            this.f95934p = z11;
            this.f95935q = iVar;
            this.f95936r = aVar2;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new g(this.f95933o, this.f95934p, this.f95935q, this.f95936r, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            g gVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f95932n;
            if (i11 == 0) {
                t.b(obj);
                a<Float, m> aVar = this.f95933o;
                Float fBoxFloat = Boxing.boxFloat(this.f95934p ? 1.0f : BitmapDescriptorFactory.HUE_RED);
                p019p1.i<Float> iVar = this.f95935q;
                this.f95932n = 1;
                gVar = this;
                if (a.f(aVar, fBoxFloat, iVar, null, null, gVar, 12, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                gVar = this;
            }
            gVar.f95936r.invoke();
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.material3.SnackbarHostKt$animatedScale$1$1", f = "SnackbarHost.kt", i = {}, l = {432}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f95937n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ a<Float, m> f95938o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ boolean f95939p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ p019p1.i<Float> f95940q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(a<Float, m> aVar, boolean z11, p019p1.i<Float> iVar, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f95938o = aVar;
            this.f95939p = z11;
            this.f95940q = iVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new h(this.f95938o, this.f95939p, this.f95940q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f95937n;
            if (i11 == 0) {
                t.b(obj);
                a<Float, m> aVar = this.f95938o;
                Float fBoxFloat = Boxing.boxFloat(this.f95939p ? 1.0f : 0.8f);
                p019p1.i<Float> iVar = this.f95940q;
                this.f95937n = 1;
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
            return ((h) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
    /* JADX WARN: Code duplicated, block: B:29:0x004c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x0055  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00bd A[LOOP:0: B:52:0x00bb->B:53:0x00bd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f4 A[LOOP:1: B:58:0x00f2->B:59:0x00f4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:0x013b  */
    /* JADX WARN: Code duplicated, block: B:66:0x0147  */
    /* JADX WARN: Code duplicated, block: B:67:0x014b  */
    /* JADX WARN: Code duplicated, block: B:70:0x016a  */
    /* JADX WARN: Code duplicated, block: B:72:0x0178  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a8 A[LOOP:2: B:74:0x01a6->B:75:0x01a8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:78:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    public static final void a(g0 g0Var, androidx.compose.ui.d dVar, q<? super g0, ? super l, ? super Integer, h0> qVar, l lVar, int i11, int i12) {
        int i13;
        androidx.compose.ui.d dVar2;
        int i14;
        androidx.compose.ui.d dVar3;
        Object objI;
        q qVar2;
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
        g0 g0Var2 = g0Var;
        l lVarV = lVar.v(-1316639904);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (lVarV.n(g0Var2) ? 4 : 2) | i11;
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
                    o.S(-1316639904, i13, -1, "androidx.compose.material3.FadeInFadeOutWithScale (SnackbarHost.kt:327)");
                }
                objI = lVarV.I();
                if (objI == l.INSTANCE.a()) {
                    objI = new q();
                    lVarV.B(objI);
                }
                qVar2 = (q) objI;
                lVarV.o(-1256811491);
                if (!s.f(g0Var2, qVar2.getCurrent())) {
                    qVar2.d(g0Var2);
                    listB2 = qVar2.b();
                    arrayList = new ArrayList(listB2.size());
                    size2 = listB2.size();
                    for (i16 = 0; i16 < size2; i16++) {
                        arrayList.add((g0) ((FadeInFadeOutAnimationItem) listB2.get(i16)).c());
                    }
                    listP1 = p013kotlin.collections.v.p1(arrayList);
                    if (!listP1.contains(g0Var2)) {
                        listP1.add(g0Var2);
                    }
                    qVar2.b().clear();
                    listB3 = y4.a.b(listP1);
                    listB4 = qVar2.b();
                    size3 = listB3.size();
                    i17 = 0;
                    while (i17 < size3) {
                        g0 g0Var3 = (g0) listB3.get(i17);
                        listB4.add(new FadeInFadeOutAnimationItem(g0Var3, z2.c.e(-1654683077, true, new Function0(g0Var3, g0Var2, listP1, qVar2), lVarV, 54)));
                        i17++;
                        g0Var2 = g0Var;
                    }
                }
                lVarV.l();
                z3.i0 i0VarH = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.o(), false);
                iA = p020r2.j.a(lVarV, 0);
                x xVarC = lVarV.c();
                androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVarV, dVar3);
                b4.g.Companion companion = b4.g.INSTANCE;
                aVarA = companion.a();
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA);
                } else {
                    lVarV.d();
                }
                lVarA = d4.a(lVarV);
                d4.b(lVarA, i0VarH, companion.c());
                d4.b(lVarA, xVarC, companion.e());
                pVarB = companion.b();
                if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                d4.b(lVarA, dVarE, companion.d());
                i iVar = i.f4585a;
                qVar2.e(p020r2.j.b(lVarV, 0));
                lVarV.o(1748085441);
                listB = qVar2.b();
                size = listB.size();
                for (i15 = 0; i15 < size; i15++) {
                    FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem = (FadeInFadeOutAnimationItem) listB.get(i15);
                    g0 g0Var4 = (g0) fadeInFadeOutAnimationItem.a();
                    q<p<? super l, ? super Integer, h0>, l, Integer, h0> qVarB = fadeInFadeOutAnimationItem.b();
                    lVarV.M(1201076541, g0Var4);
                    qVarB.invoke(z2.c.e(-1135367807, true, new b(qVar, g0Var4), lVarV, 54), lVarV, 6);
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
                w2VarX.a(new c(g0Var, dVar3, qVar, i11, i12));
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
                o.S(-1316639904, i13, -1, "androidx.compose.material3.FadeInFadeOutWithScale (SnackbarHost.kt:327)");
            }
            objI = lVarV.I();
            if (objI == l.INSTANCE.a()) {
                objI = new q();
                lVarV.B(objI);
            }
            qVar2 = (q) objI;
            lVarV.o(-1256811491);
            if (!s.f(g0Var2, qVar2.getCurrent())) {
                qVar2.d(g0Var2);
                listB2 = qVar2.b();
                arrayList = new ArrayList(listB2.size());
                size2 = listB2.size();
                while (i16 < size2) {
                    arrayList.add((g0) ((FadeInFadeOutAnimationItem) listB2.get(i16)).c());
                }
                listP1 = p013kotlin.collections.v.p1(arrayList);
                if (!listP1.contains(g0Var2)) {
                    listP1.add(g0Var2);
                }
                qVar2.b().clear();
                listB3 = y4.a.b(listP1);
                listB4 = qVar2.b();
                size3 = listB3.size();
                i17 = 0;
                while (i17 < size3) {
                    g0 g0Var5 = (g0) listB3.get(i17);
                    listB4.add(new FadeInFadeOutAnimationItem(g0Var5, z2.c.e(-1654683077, true, new Function0(g0Var5, g0Var2, listP1, qVar2), lVarV, 54)));
                    i17++;
                    g0Var2 = g0Var;
                }
            }
            lVarV.l();
            z3.i0 i0VarH2 = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.o(), false);
            iA = p020r2.j.a(lVarV, 0);
            x xVarC2 = lVarV.c();
            androidx.compose.ui.d dVarE2 = androidx.compose.ui.c.e(lVarV, dVar3);
            b4.g.Companion companion2 = b4.g.INSTANCE;
            aVarA = companion2.a();
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            lVarA = d4.a(lVarV);
            d4.b(lVarA, i0VarH2, companion2.c());
            d4.b(lVarA, xVarC2, companion2.e());
            pVarB = companion2.b();
            if (lVarA.getInserting()) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            } else {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            d4.b(lVarA, dVarE2, companion2.d());
            i iVar2 = i.f4585a;
            qVar2.e(p020r2.j.b(lVarV, 0));
            lVarV.o(1748085441);
            listB = qVar2.b();
            size = listB.size();
            while (i15 < size) {
                FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem2 = (FadeInFadeOutAnimationItem) listB.get(i15);
                g0 g0Var6 = (g0) fadeInFadeOutAnimationItem2.a();
                q<p<? super l, ? super Integer, h0>, l, Integer, h0> qVarB2 = fadeInFadeOutAnimationItem2.b();
                lVarV.M(1201076541, g0Var6);
                qVarB2.invoke(z2.c.e(-1135367807, true, new b(qVar, g0Var6), lVarV, 54), lVarV, 6);
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
                o.S(-1316639904, i13, -1, "androidx.compose.material3.FadeInFadeOutWithScale (SnackbarHost.kt:327)");
            }
            objI = lVarV.I();
            if (objI == l.INSTANCE.a()) {
                objI = new q();
                lVarV.B(objI);
            }
            qVar2 = (q) objI;
            lVarV.o(-1256811491);
            if (!s.f(g0Var2, qVar2.getCurrent())) {
                qVar2.d(g0Var2);
                listB2 = qVar2.b();
                arrayList = new ArrayList(listB2.size());
                size2 = listB2.size();
                while (i16 < size2) {
                    arrayList.add((g0) ((FadeInFadeOutAnimationItem) listB2.get(i16)).c());
                }
                listP1 = p013kotlin.collections.v.p1(arrayList);
                if (!listP1.contains(g0Var2)) {
                    listP1.add(g0Var2);
                }
                qVar2.b().clear();
                listB3 = y4.a.b(listP1);
                listB4 = qVar2.b();
                size3 = listB3.size();
                i17 = 0;
                while (i17 < size3) {
                    g0 g0Var7 = (g0) listB3.get(i17);
                    listB4.add(new FadeInFadeOutAnimationItem(g0Var7, z2.c.e(-1654683077, true, new Function0(g0Var7, g0Var2, listP1, qVar2), lVarV, 54)));
                    i17++;
                    g0Var2 = g0Var;
                }
            }
            lVarV.l();
            z3.i0 i0VarH3 = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.o(), false);
            iA = p020r2.j.a(lVarV, 0);
            x xVarC3 = lVarV.c();
            androidx.compose.ui.d dVarE3 = androidx.compose.ui.c.e(lVarV, dVar3);
            b4.g.Companion companion3 = b4.g.INSTANCE;
            aVarA = companion3.a();
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            lVarA = d4.a(lVarV);
            d4.b(lVarA, i0VarH3, companion3.c());
            d4.b(lVarA, xVarC3, companion3.e());
            pVarB = companion3.b();
            if (lVarA.getInserting()) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            } else {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            d4.b(lVarA, dVarE3, companion3.d());
            i iVar3 = i.f4585a;
            qVar2.e(p020r2.j.b(lVarV, 0));
            lVarV.o(1748085441);
            listB = qVar2.b();
            size = listB.size();
            while (i15 < size) {
                FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem3 = (FadeInFadeOutAnimationItem) listB.get(i15);
                g0 g0Var8 = (g0) fadeInFadeOutAnimationItem3.a();
                q<p<? super l, ? super Integer, h0>, l, Integer, h0> qVarB3 = fadeInFadeOutAnimationItem3.b();
                lVarV.M(1201076541, g0Var8);
                qVarB3.invoke(z2.c.e(-1135367807, true, new b(qVar, g0Var8), lVarV, 54), lVarV, 6);
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
            w2VarX.a(new c(g0Var, dVar3, qVar, i11, i12));
        }
    }

    public static final void b(j0 j0Var, androidx.compose.ui.d dVar, q<? super g0, ? super l, ? super Integer, h0> qVar, l lVar, int i11, int i12) {
        int i13;
        androidx.compose.ui.d dVar2;
        q<? super g0, ? super l, ? super Integer, h0> qVar2;
        l lVarV = lVar.v(464178177);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (lVarV.n(j0Var) ? 4 : 2) | i11;
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
                qVar = l.f95976a.a();
            }
            q<? super g0, ? super l, ? super Integer, h0> qVar3 = qVar;
            if (o.J()) {
                o.S(464178177, i13, -1, "androidx.compose.material3.SnackbarHost (SnackbarHost.kt:221)");
            }
            g0 g0VarA = j0Var.a();
            androidx.compose.ui.platform.i iVar = (androidx.compose.ui.platform.i) lVarV.U(z0.c());
            boolean zN = lVarV.n(g0VarA) | lVarV.K(iVar);
            Object objI = lVarV.I();
            if (zN || objI == l.INSTANCE.a()) {
                objI = new d(g0VarA, iVar, null);
                lVarV.B(objI);
            }
            p020r2.Function0.g(g0VarA, (p) objI, lVarV, 0);
            androidx.compose.ui.d dVar3 = dVar;
            a(j0Var.a(), dVar3, qVar3, lVarV, i13 & 1008, 0);
            if (o.J()) {
                o.R();
            }
            dVar2 = dVar3;
            qVar2 = qVar3;
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new e(j0Var, dVar2, qVar2, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y3<Float> f(p019p1.i<Float> iVar, boolean z11, wn0.a<h0> aVar, l lVar, int i11, int i12) {
        if ((i12 & 4) != 0) {
            aVar = f.f95931c;
        }
        wn0.a<h0> aVar2 = aVar;
        if (o.J()) {
            o.S(1431889134, i11, -1, "androidx.compose.material3.animatedOpacity (SnackbarHost.kt:418)");
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
            Object gVar = new g(aVar3, z11, iVar, aVar2, null);
            lVar.B(gVar);
            objI2 = gVar;
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
            o.S(1966809761, i11, -1, "androidx.compose.material3.animatedScale (SnackbarHost.kt:428)");
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
            objI2 = new h(aVar, z11, iVar, null);
            lVar.B(objI2);
        }
        p020r2.Function0.g(boolValueOf, (p) objI2, lVar, (i11 >> 3) & 14);
        y3<Float> y3VarG = aVar.g();
        if (o.J()) {
            o.R();
        }
        return y3VarG;
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class f extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f95931c = new f();

        f() {
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
