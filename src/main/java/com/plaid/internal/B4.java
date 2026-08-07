package com.plaid.internal;

import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.workflow.webview.OutOfProcessWebviewViewModel", f = "OutOfProcessWebviewViewModel.kt", i = {0, 1}, l = {125, 127}, m = "readPendingResult", n = {"this", "linkResult"}, s = {"L$0", "L$0"})
public final class B4 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f46224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f46225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4594z4 f46226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f46227d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B4(C4594z4 c4594z4, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f46226c = c4594z4;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f46225b = obj;
        this.f46227d |= Integer.MIN_VALUE;
        return C4594z4.b(this.f46226c, this);
    }
}
