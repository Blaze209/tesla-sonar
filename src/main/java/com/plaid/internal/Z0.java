package com.plaid.internal;

import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes6.dex */
public final class Z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Z0 f46842a = new Z0();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(U2 u11, ContinuationImpl continuationImpl) {
        X0 x11;
        p013kotlin.jvm.internal.n0 n0Var;
        wn0.l lVar;
        p013kotlin.jvm.internal.n0 n0Var2;
        T t11;
        p013kotlin.jvm.internal.n0 n0Var3;
        if (continuationImpl instanceof X0) {
            x11 = (X0) continuationImpl;
            int i11 = x11.f46803f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                x11.f46803f = i11 - Integer.MIN_VALUE;
            } else {
                x11 = new X0(this, continuationImpl);
            }
        } else {
            x11 = new X0(this, continuationImpl);
        }
        Object obj = x11.f46801d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = x11.f46803f;
        if (i12 == 0) {
            jn0.t.b(obj);
            n0Var = new p013kotlin.jvm.internal.n0();
            x11.f46798a = u11;
            x11.f46799b = n0Var;
            x11.f46800c = n0Var;
            x11.f46803f = 1;
            Object objInvoke = u11.invoke(x11);
            if (objInvoke != coroutine_suspended) {
                lVar = u11;
                n0Var2 = n0Var;
                t11 = objInvoke;
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            n0Var2 = x11.f46800c;
            p013kotlin.jvm.internal.n0 n0Var4 = x11.f46799b;
            wn0.l lVar2 = (wn0.l) x11.f46798a;
            jn0.t.b(obj);
            t11 = obj;
            n0Var = n0Var4;
            lVar = lVar2;
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n0Var3 = (p013kotlin.jvm.internal.n0) x11.f46798a;
            jn0.t.b(obj);
        }
        return n0Var3.f86529a;
        n0Var2.f86529a = t11;
        p013kotlin.jvm.internal.l0 l0Var = new p013kotlin.jvm.internal.l0();
        CoroutineDispatcher io2 = Dispatchers.getIO();
        Y0 y11 = new Y0(l0Var, n0Var, lVar, null);
        x11.f46798a = n0Var;
        x11.f46799b = null;
        x11.f46800c = null;
        x11.f46803f = 2;
        if (BuildersKt.withContext(io2, y11, x11) != coroutine_suspended) {
            n0Var3 = n0Var;
            return n0Var3.f86529a;
        }
        return coroutine_suspended;
    }
}
