package com.fourthline.orca.internal;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p020r2.Function0;

/* JADX INFO: renamed from: com.fourthline.orca.internal.zy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4136zy {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.zy$a */
    static final class a extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p019p1.u0 f37379b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p019p1.u0 u0Var, Continuation continuation) {
            super(2, continuation);
            this.f37379b = u0Var;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f37379b, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f37378a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            if (((Boolean) this.f37379b.a()).booleanValue()) {
                this.f37379b.h(Boxing.boxBoolean(false));
            }
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(p019p1.u0 u0Var, int i11, p020r2.l lVar, int i12) {
        a(u0Var, lVar, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    public static final void a(final p019p1.u0 shutterState, p020r2.l lVar, final int i11) {
        int i12;
        p013kotlin.jvm.internal.s.k(shutterState, "shutterState");
        p020r2.l lVarV = lVar.v(-1784367205);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? lVarV.n(shutterState) : lVarV.K(shutterState) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(-1784367205, i12, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.ShutterAnimationEffect (ShutterAnimationEffect.kt:16)");
            }
            int i13 = i12 & 14;
            p015o1.d.d(shutterState, null, androidx.compose.animation.g.m(p019p1.j.l(50, 0, null, 6, null), BitmapDescriptorFactory.HUE_RED, 2, null), androidx.compose.animation.g.o(p019p1.j.l(50, 0, null, 6, null), BitmapDescriptorFactory.HUE_RED, 2, null), null, C4014x4.f36666a.a(), lVarV, p019p1.u0.f100644d | 200064 | i13, 18);
            Object objA = shutterState.a();
            lVarV.o(400561430);
            boolean z11 = i13 == 4 || ((i12 & 8) != 0 && lVarV.K(shutterState));
            Object objI = lVarV.I();
            if (z11 || objI == p020r2.l.INSTANCE.a()) {
                objI = new a(shutterState, null);
                lVarV.B(objI);
            }
            lVarV.l();
            Function0.g(objA, (wn0.p) objI, lVarV, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.jj1
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC4136zy.a(shutterState, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
