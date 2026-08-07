package com.plaid.internal;

import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.workflow.webview.OutOfProcessWebviewViewModel", f = "OutOfProcessWebviewViewModel.kt", i = {0}, l = {115}, m = "readChannelAndStartPolling", n = {"this"}, s = {"L$0"})
public final class A4 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4594z4 f46202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f46203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4594z4 f46204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f46205d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A4(C4594z4 c4594z4, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f46204c = c4594z4;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f46203b = obj;
        this.f46205d |= Integer.MIN_VALUE;
        return C4594z4.a(this.f46204c, this);
    }
}
