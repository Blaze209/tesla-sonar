package com.fourthline.orca.internal;

import com.fourthline.analytics.FourthlineAnalytics;
import com.fourthline.analytics.internal.AnalyticsInterface;
import com.fourthline.analytics.internal.AppGenericEvent;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p020r2.Function0;

/* JADX INFO: renamed from: com.fourthline.orca.internal.xk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4036xk {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.xk$a */
    static final class a extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36755a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3654op f36756b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3654op interfaceC3654op, Continuation continuation) {
            super(2, continuation);
            this.f36756b = interfaceC3654op;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f36756b, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f36755a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            this.f36756b.i().a();
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.xk$b */
    static final class b extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36757a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3654op f36758b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3098bo f36759c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC3654op interfaceC3654op, C3098bo c3098bo, Continuation continuation) {
            super(2, continuation);
            this.f36758b = interfaceC3654op;
            this.f36759c = c3098bo;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.f36758b, this.f36759c, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f36757a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            this.f36758b.q().a(this.f36759c);
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(InterfaceC3654op interfaceC3654op, int i11, p020r2.l lVar, int i12) {
        a(interfaceC3654op, lVar, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    public static final void a(final InterfaceC3654op orcaSubcomponent, p020r2.l lVar, final int i11) {
        int i12;
        String strA;
        p013kotlin.jvm.internal.s.k(orcaSubcomponent, "orcaSubcomponent");
        p020r2.l lVarV = lVar.v(331103980);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? lVarV.n(orcaSubcomponent) : lVarV.K(orcaSubcomponent) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(331103980, i12, -1, "com.fourthline.orca.core.internal.navigation.NavigationGraph (NavigationGraph.kt:25)");
            }
            lVarV.o(-809280137);
            int i13 = i12 & 14;
            boolean z11 = true;
            boolean z12 = i13 == 4 || ((i12 & 8) != 0 && lVarV.n(orcaSubcomponent));
            Object objI = lVarV.I();
            if (z12 || objI == p020r2.l.INSTANCE.a()) {
                objI = new LinkedHashMap();
                lVarV.B(objI);
            }
            lVarV.l();
            lVarV.o(-809277396);
            boolean z13 = i13 == 4 || ((i12 & 8) != 0 && lVarV.n(orcaSubcomponent));
            Object objI2 = lVarV.I();
            if (z13 || objI2 == p020r2.l.INSTANCE.a()) {
                objI2 = p020r2.s3.d(p013kotlin.collections.v.m(), null, 2, null);
                lVarV.B(objI2);
            }
            final p020r2.p1 p1Var = (p020r2.p1) objI2;
            lVarV.l();
            Rf rfD = orcaSubcomponent.a().d();
            lVarV.o(-809274047);
            boolean zN = lVarV.n(rfD) | (i13 == 4 || ((i12 & 8) != 0 && lVarV.n(orcaSubcomponent)));
            Object objI3 = lVarV.I();
            if (zN || objI3 == p020r2.l.INSTANCE.a()) {
                objI3 = new C3098bo(orcaSubcomponent);
                lVarV.B(objI3);
            }
            C3098bo c3098bo = (C3098bo) objI3;
            lVarV.l();
            Rf rfD2 = orcaSubcomponent.a().d();
            lVarV.o(-809268032);
            boolean zN2 = lVarV.n(rfD2) | lVarV.n(c3098bo);
            Object objI4 = lVarV.I();
            if (zN2 || objI4 == p020r2.l.INSTANCE.a()) {
                objI4 = c3098bo.a(orcaSubcomponent.a().d());
                lVarV.B(objI4);
            }
            final Do r11 = (Do) objI4;
            lVarV.l();
            if (r11 == null || (strA = r11.e()) == null) {
                strA = orcaSubcomponent.o().a();
            }
            lVarV.o(817764351);
            if (a(orcaSubcomponent)) {
                lVarV.o(-809255048);
                boolean zK = lVarV.K(orcaSubcomponent);
                Object objI5 = lVarV.I();
                if (zK || objI5 == p020r2.l.INSTANCE.a()) {
                    objI5 = new a(orcaSubcomponent, null);
                    lVarV.B(objI5);
                }
                lVarV.l();
                Function0.g(orcaSubcomponent, (wn0.p) objI5, lVarV, i13);
            }
            lVarV.l();
            p011ja.w wVarC = orcaSubcomponent.C();
            lVarV.o(-809248460);
            boolean zK2 = lVarV.K(r11);
            if (i13 != 4 && ((i12 & 8) == 0 || !lVarV.K(orcaSubcomponent))) {
                z11 = false;
            }
            boolean zN3 = zK2 | z11 | lVarV.n(p1Var);
            Object objI6 = lVarV.I();
            if (zN3 || objI6 == p020r2.l.INSTANCE.a()) {
                objI6 = new wn0.l() { // from class: com.fourthline.orca.internal.bi1
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return AbstractC4036xk.a(r11, orcaSubcomponent, p1Var, (p011ja.u) obj);
                    }
                };
                lVarV.B(objI6);
            }
            lVarV.l();
            AbstractC3923v0.a(wVarC, strA, (wn0.l) objI6, lVarV, 0);
            List listA = a(p1Var);
            lVarV.o(-809223008);
            boolean zK3 = lVarV.K(orcaSubcomponent) | lVarV.K(c3098bo);
            Object objI7 = lVarV.I();
            if (zK3 || objI7 == p020r2.l.INSTANCE.a()) {
                objI7 = new b(orcaSubcomponent, c3098bo, null);
                lVarV.B(objI7);
            }
            lVarV.l();
            Function0.f(listA, c3098bo, (wn0.p) objI7, lVarV, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.ci1
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC4036xk.a(orcaSubcomponent, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(Do r11, InterfaceC3654op interfaceC3654op, p020r2.p1 p1Var, p011ja.u AnimatedGraph) {
        p013kotlin.jvm.internal.s.k(AnimatedGraph, "$this$AnimatedGraph");
        a();
        if (r11 != null) {
            String strA = r11.b().b().a();
            String strE = r11.e();
            wn0.l lVarD = r11.d();
            p011ja.u uVar = new p011ja.u(AnimatedGraph.getProvider(), strA, strE);
            lVarD.invoke(uVar);
            AnimatedGraph.h(uVar);
        }
        if (interfaceC3654op instanceof Lf) {
            a(p1Var, p013kotlin.collections.v.m());
        } else if (!(interfaceC3654op instanceof InterfaceC3005Wb) && !(interfaceC3654op instanceof InterfaceC3920uy)) {
            throw new IllegalStateException("Unsupported subcomponent type!");
        }
        return jn0.h0.f84049a;
    }

    private static final boolean a(InterfaceC3654op interfaceC3654op) {
        return (interfaceC3654op instanceof InterfaceC3005Wb) || (interfaceC3654op instanceof InterfaceC3920uy);
    }

    private static final void a() {
        AppGenericEvent appGenericEvent = new AppGenericEvent("root_composition_triggered", null, 2, null);
        AnalyticsInterface analytics = FourthlineAnalytics.INSTANCE.getAnalytics();
        if (analytics != null) {
            analytics.trackNew(appGenericEvent);
        }
    }

    private static final List a(p020r2.p1 p1Var) {
        return (List) p1Var.getValue();
    }

    private static final void a(p020r2.p1 p1Var, List list) {
        p1Var.setValue(list);
    }
}
