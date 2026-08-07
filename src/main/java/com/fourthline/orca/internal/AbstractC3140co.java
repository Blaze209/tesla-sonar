package com.fourthline.orca.internal;

import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.p003lifecycle.Lifecycle;
import androidx.p003lifecycle.LifecycleOwner;
import p020r2.Function0;

/* JADX INFO: renamed from: com.fourthline.orca.internal.co, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3140co {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.co$a */
    public static final class a implements p020r2.k0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Lifecycle f30957a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.p003lifecycle.u f30958b;

        public a(Lifecycle lifecycle, androidx.p003lifecycle.u uVar) {
            this.f30957a = lifecycle;
            this.f30958b = uVar;
        }

        @Override // p020r2.k0
        public void dispose() {
            this.f30957a.d(this.f30958b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(wn0.l lVar, int i11, p020r2.l lVar2, int i12) {
        a(lVar, lVar2, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    public static final void a(final wn0.l onEvent, p020r2.l lVar, final int i11) {
        int i12;
        p013kotlin.jvm.internal.s.k(onEvent, "onEvent");
        p020r2.l lVarV = lVar.v(1741885548);
        if ((i11 & 6) == 0) {
            i12 = (lVarV.K(onEvent) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(1741885548, i12, -1, "com.fourthline.orca.core.internal.composable.OnLifecycleEvent (OnLifecycleEvent.kt:17)");
            }
            final p020r2.y3 y3VarO = p020r2.n3.o(onEvent, lVarV, i12 & 14);
            final p020r2.y3 y3VarO2 = p020r2.n3.o(lVarV.U(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner()), lVarV, 0);
            Object value = y3VarO2.getValue();
            lVarV.o(-1695568844);
            boolean zN = lVarV.n(y3VarO2) | lVarV.n(y3VarO);
            Object objI = lVarV.I();
            if (zN || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.l() { // from class: com.fourthline.orca.internal.ez0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return AbstractC3140co.a(y3VarO2, y3VarO, (p020r2.l0) obj);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            Function0.c(value, (wn0.l) objI, lVarV, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.fz0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC3140co.a(onEvent, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p020r2.k0 a(p020r2.y3 y3Var, final p020r2.y3 y3Var2, p020r2.l0 DisposableEffect) {
        p013kotlin.jvm.internal.s.k(DisposableEffect, "$this$DisposableEffect");
        Lifecycle lifecycle = ((LifecycleOwner) y3Var.getValue()).getLifecycle();
        androidx.p003lifecycle.u uVar = new androidx.p003lifecycle.u() { // from class: com.fourthline.orca.internal.dz0
            @Override // androidx.p003lifecycle.u
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.a aVar) {
                AbstractC3140co.a(y3Var2, lifecycleOwner, aVar);
            }
        };
        lifecycle.a(uVar);
        return new a(lifecycle, uVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(p020r2.y3 y3Var, LifecycleOwner lifecycleOwner, Lifecycle.a event) {
        p013kotlin.jvm.internal.s.k(lifecycleOwner, "<unused var>");
        p013kotlin.jvm.internal.s.k(event, "event");
        ((wn0.l) y3Var.getValue()).invoke(event);
    }
}
