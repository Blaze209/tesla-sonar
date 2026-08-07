package com.fourthline.vision.internal;

import java.util.List;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.fourthline.vision.internal.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4313x0 implements InterfaceC4265q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f39088a = p013kotlin.collections.v.m();

    @Override // com.fourthline.vision.internal.InterfaceC4265q0
    public /* bridge */ /* synthetic */ Object consume(Object obj, Continuation continuation) {
        return consume((List<C4165c4>) obj, (Continuation<? super jn0.h0>) continuation);
    }

    public final List<C4165c4> getDetections$fourthline_vision_release() {
        return this.f39088a;
    }

    public final void setDetections$fourthline_vision_release(List<C4165c4> list) {
        p013kotlin.jvm.internal.s.k(list, "<set-?>");
        this.f39088a = list;
    }

    public Object consume(List<C4165c4> list, Continuation<? super jn0.h0> continuation) {
        this.f39088a = list;
        return jn0.h0.f84049a;
    }
}
