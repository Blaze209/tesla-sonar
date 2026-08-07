package com.plaid.internal;

import android.util.Base64;
import com.plaid.internal.core.protos.link.channel.Channel$Message;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes6.dex */
public final class Z5 implements InterfaceC4551u6, u8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T3 f46852a;

    public Z5(T3 localPaneStateStore) {
        p013kotlin.jvm.internal.s.k(localPaneStateStore, "localPaneStateStore");
        this.f46852a = localPaneStateStore;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.plaid.internal.InterfaceC4551u6
    public final Object a(ContinuationImpl continuationImpl) {
        Y5 y11;
        if (continuationImpl instanceof Y5) {
            y11 = (Y5) continuationImpl;
            int i11 = y11.f46833c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                y11.f46833c = i11 - Integer.MIN_VALUE;
            } else {
                y11 = new Y5(this, continuationImpl);
            }
        } else {
            y11 = new Y5(this, continuationImpl);
        }
        Object objA = y11.f46831a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = y11.f46833c;
        if (i12 == 0) {
            jn0.t.b(objA);
            T3 t11 = this.f46852a;
            y11.f46833c = 1;
            objA = t11.a("pre_completion_result_state", "pre_completion_result", y11);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(objA);
        }
        String str = (String) objA;
        if (str == null) {
            return null;
        }
        return Channel$Message.SDKResult.parseFrom(Base64.decode(str, 0));
    }

    @Override // com.plaid.internal.InterfaceC4551u6
    public final Object b(ContinuationImpl continuationImpl) {
        Object objA = this.f46852a.a("pre_completion_result_state", continuationImpl);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.h0.f84049a;
    }

    @Override // com.plaid.internal.u8
    public final Object a(Channel$Message.SDKResult sDKResult, C4585y4.b bVar) {
        String strEncodeToString = Base64.encodeToString(sDKResult.toByteArray(), 0);
        T3 t11 = this.f46852a;
        p013kotlin.jvm.internal.s.h(strEncodeToString);
        Object objA = t11.a("pre_completion_result_state", "pre_completion_result", strEncodeToString, bVar);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.h0.f84049a;
    }
}
