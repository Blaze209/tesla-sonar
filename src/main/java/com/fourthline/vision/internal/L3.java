package com.fourthline.vision.internal;

import java.util.List;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class L3 implements InterfaceC4265q0 {
    @Override // com.fourthline.vision.internal.InterfaceC4265q0
    public /* bridge */ /* synthetic */ Object consume(Object obj, Continuation continuation) {
        return consume((List<? extends AbstractC4273r2>) obj, (Continuation<? super jn0.h0>) continuation);
    }

    public Object consume(List<? extends AbstractC4273r2> list, Continuation<? super jn0.h0> continuation) throws AbstractC4255o4.a {
        if (list.size() <= 1) {
            return jn0.h0.f84049a;
        }
        throw new AbstractC4255o4.a(EnumC4241m4.MULTIPLE_FACES_DETECTED, null, 2, null);
    }
}
