package com.fourthline.vision.internal;

import android.media.Image;
import java.util.List;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class N3 implements InterfaceC4265q0 {
    @Override // com.fourthline.vision.internal.InterfaceC4265q0
    public /* bridge */ /* synthetic */ Object consume(Object obj, Continuation continuation) {
        return consume((Pair<? extends Image, ? extends List<? extends T0>>) obj, (Continuation<? super jn0.h0>) continuation);
    }

    public Object consume(Pair<? extends Image, ? extends List<? extends T0>> pair, Continuation<? super jn0.h0> continuation) throws AbstractC4255o4.f.a {
        List<? extends T0> listF = pair.f();
        if (listF.isEmpty() || !(p013kotlin.collections.v.q0(listF) instanceof T0.b)) {
            throw AbstractC4255o4.f.a.f38693a;
        }
        return jn0.h0.f84049a;
    }
}
