package com.plaid.internal;

import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest;
import java.util.Iterator;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: renamed from: com.plaid.internal.u3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.workflow.LinkWorkflowAnalytics", f = "LinkWorkflowAnalytics.kt", i = {0, 1, 1, 2}, l = {178, 185, 187}, m = "sendAllAnalyticsEventsToServer", n = {"this", "this", "it", "this"}, s = {"L$0", "L$0", "L$2", "L$0"})
public final class C4548u3 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4575x3 f48153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f48154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Workflow$LinkWorkflowEventRequest f48155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f48156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4575x3 f48157e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f48158f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4548u3(C4575x3 c4575x3, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f48157e = c4575x3;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f48156d = obj;
        this.f48158f |= Integer.MIN_VALUE;
        return C4575x3.a(this.f48157e, this);
    }
}
