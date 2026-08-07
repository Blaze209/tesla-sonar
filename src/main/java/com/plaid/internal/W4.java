package com.plaid.internal;

import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes6.dex */
public final class W4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H5 f46793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public S4 f46794b;

    public W4(H5 storage) {
        p013kotlin.jvm.internal.s.k(storage, "storage");
        this.f46793a = storage;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        T4 t11;
        W4 w11;
        if (continuationImpl instanceof T4) {
            t11 = (T4) continuationImpl;
            int i11 = t11.f46717d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                t11.f46717d = i11 - Integer.MIN_VALUE;
            } else {
                t11 = new T4(this, continuationImpl);
            }
        } else {
            t11 = new T4(this, continuationImpl);
        }
        Object objWithContext = t11.f46715b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = t11.f46717d;
        if (i12 == 0) {
            jn0.t.b(objWithContext);
            S4 s11 = this.f46794b;
            if (s11 != null) {
                return s11;
            }
            t11.f46714a = this;
            t11.f46717d = 1;
            if ((s11 != null ? Boxing.boxBoolean(s11.f46697a) : null) != null) {
                S4 s12 = this.f46794b;
                objWithContext = Boxing.boxBoolean(s12 != null && s12.f46697a);
            } else {
                objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new U4(this, null), t11);
            }
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            w11 = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            w11 = t11.f46714a;
            jn0.t.b(objWithContext);
        }
        S4 s13 = new S4(((Boolean) objWithContext).booleanValue());
        w11.f46794b = s13;
        return s13;
    }
}
