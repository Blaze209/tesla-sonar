package com.plaid.internal;

import android.os.Looper;
import android.util.Patterns;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes6.dex */
public final class N implements InterfaceC4517q7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L f46465a;

    public N(L requestManager) {
        p013kotlin.jvm.internal.s.k(requestManager, "requestManager");
        this.f46465a = requestManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.plaid.internal.InterfaceC4517q7
    public final Object a(String str, ContinuationImpl continuationImpl) throws Throwable {
        M m11;
        N n11;
        if (continuationImpl instanceof M) {
            m11 = (M) continuationImpl;
            int i11 = m11.f46439d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                m11.f46439d = i11 - Integer.MIN_VALUE;
            } else {
                m11 = new M(this, continuationImpl);
            }
        } else {
            m11 = new M(this, continuationImpl);
        }
        Object objA = m11.f46437b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = m11.f46439d;
        try {
            if (i12 == 0) {
                jn0.t.b(objA);
                if (!Patterns.WEB_URL.matcher(str).matches()) {
                    throw AbstractC4525r7.b.f48095a;
                }
                if (p013kotlin.jvm.internal.s.f(Looper.myLooper(), Looper.getMainLooper())) {
                    throw AbstractC4525r7.e.f48098a;
                }
                L l11 = this.f46465a;
                m11.f46436a = this;
                m11.f46439d = 1;
                objA = l11.a(str, m11);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
                n11 = this;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n11 = m11.f46436a;
                jn0.t.b(objA);
            }
            C4433h4 c4433h4 = (C4433h4) objA;
            String str2 = c4433h4.f47710b;
            n11.getClass();
            boolean zH0 = false;
            if (str2 != null) {
                zH0 = p013kotlin.text.t.h0(str2, "ErrorCode=0&ErrorDescription=Success", false, 2, null);
            }
            if (zH0) {
                return new InterfaceC4471l6.b(c4433h4);
            }
            throw new AbstractC4525r7.d(String.valueOf(c4433h4.f47710b));
        } catch (AbstractC4525r7 e11) {
            return new InterfaceC4471l6.a(e11);
        } catch (Exception e12) {
            return new InterfaceC4471l6.a(new AbstractC4525r7.f(e12));
        }
    }
}
