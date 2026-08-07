package com.plaid.internal;

import ch.qos.logback.core.joran.action.Action;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.workflow.persistence.LocalPaneStateDatabaseStore", f = "LocalPaneStateDatabaseStore.kt", i = {0, 0, 0}, l = {23}, m = "putString", n = {"this", Action.KEY_ATTRIBUTE, "value"}, s = {"L$0", "L$1", "L$2"})
public final class R3 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public S3 f46650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f46651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f46652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f46653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ S3 f46654e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f46655f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R3(S3 s11, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f46654e = s11;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f46653d = obj;
        this.f46655f |= Integer.MIN_VALUE;
        return this.f46654e.a(null, null, null, this);
    }
}
