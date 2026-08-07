package com.fourthline.vision.internal;

import java.util.List;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.fourthline.vision.internal.u2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4294u2 implements InterfaceC4265q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f38934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f38935b;

    private final void throwError() throws AbstractC4255o4.a {
        AbstractC4255o4.a aVar = new AbstractC4255o4.a(EnumC4241m4.CONTENT_DISAPPEARED, null, 2, null);
        this.f38934a = true;
        throw aVar;
    }

    @Override // com.fourthline.vision.internal.InterfaceC4265q0
    public /* bridge */ /* synthetic */ Object consume(Object obj, Continuation continuation) {
        return consume((List<? extends AbstractC4273r2>) obj, (Continuation<? super jn0.h0>) continuation);
    }

    public Object consume(List<? extends AbstractC4273r2> list, Continuation<? super jn0.h0> continuation) throws AbstractC4255o4.a {
        if (this.f38934a) {
            throwError();
        }
        if (this.f38935b && list.isEmpty()) {
            throwError();
        } else if (!list.isEmpty()) {
            this.f38935b = true;
        }
        return jn0.h0.f84049a;
    }
}
