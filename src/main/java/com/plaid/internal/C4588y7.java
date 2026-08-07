package com.plaid.internal;

import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: renamed from: com.plaid.internal.y7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.workflow.di.WebviewBackgroundTransparencyStore", f = "WebviewBackgroundTransparencyStore.kt", i = {}, l = {27}, m = "readWebviewBackgroundTransparencyState", n = {}, s = {})
public final class C4588y7 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f48248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4597z7 f48249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f48250c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4588y7(C4597z7 c4597z7, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f48249b = c4597z7;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f48248a = obj;
        this.f48250c |= Integer.MIN_VALUE;
        return this.f48249b.a(this);
    }
}
