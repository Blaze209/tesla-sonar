package com.fourthline.vision.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.fourthline.vision.internal.y3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4323y3 implements InterfaceC4306w0, InterfaceC4265q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f39115a = Collections.synchronizedList(new ArrayList());

    @Override // com.fourthline.vision.internal.InterfaceC4265q0
    public /* bridge */ /* synthetic */ Object consume(Object obj, Continuation continuation) {
        return consume((AbstractC4316x3) obj, (Continuation<? super jn0.h0>) continuation);
    }

    @Override // com.fourthline.vision.internal.InterfaceC4306w0
    public void subscribe(wn0.p<? super List<? extends AbstractC4316x3>, ? super Continuation<? super jn0.h0>, ? extends Object> pVar) {
        InterfaceC4306w0.a.subscribe(this, pVar);
    }

    public Object consume(AbstractC4316x3 abstractC4316x3, Continuation<? super jn0.h0> continuation) {
        this.f39115a.add(abstractC4316x3);
        return jn0.h0.f84049a;
    }

    @Override // com.fourthline.vision.internal.InterfaceC4306w0
    public List<AbstractC4316x3> get() {
        List metadatas = this.f39115a;
        p013kotlin.jvm.internal.s.j(metadatas, "metadatas");
        return p013kotlin.collections.v.m1(metadatas);
    }
}
