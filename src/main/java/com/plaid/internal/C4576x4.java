package com.plaid.internal;

import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: renamed from: com.plaid.internal.x4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.workflow.webview.OutOfProcessWebviewViewModel", f = "OutOfProcessWebviewViewModel.kt", i = {}, l = {107}, m = "getUrlUri", n = {}, s = {})
public final class C4576x4 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f48218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4594z4 f48219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f48220c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4576x4(C4594z4 c4594z4, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f48219b = c4594z4;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f48218a = obj;
        this.f48220c |= Integer.MIN_VALUE;
        return this.f48219b.a(this);
    }
}
