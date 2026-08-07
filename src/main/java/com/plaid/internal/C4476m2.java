package com.plaid.internal;

import java.util.LinkedHashMap;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: renamed from: com.plaid.internal.m2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.workflow.LinkController", f = "LinkController.kt", i = {}, l = {98}, m = "handleSessionHandoff", n = {}, s = {})
public final class C4476m2 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f47867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4538t2 f47868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f47869c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4476m2(C4538t2 c4538t2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f47868b = c4538t2;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f47867a = obj;
        this.f47869c |= Integer.MIN_VALUE;
        return this.f47868b.a((LinkedHashMap) null, this);
    }
}
