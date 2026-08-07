package com.plaid.internal;

import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import java.util.Iterator;
import java.util.List;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.workflow.LinkStateReducer", f = "LinkStateReducer.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {DownloaderService.STATUS_CANNOT_RESUME, DownloaderService.STATUS_UNKNOWN_ERROR}, m = "handleSuccess", n = {"this", "linkOpenId", "workflowId", "continuationToken", "oauthNonce", "nextPane", "additionalPanes", "backstack", "requestId", "this", "linkOpenId", "workflowId", "continuationToken", "oauthNonce", "nextPane", "additionalPanes", "backstack", "requestId"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8"})
public final class S2 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Y2 f46682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f46683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f46684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f46685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f46686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Pane$PaneRendering f46687f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f46688g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f46689h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f46690i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Iterator f46691j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f46692k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y2 f46693l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f46694m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S2(Y2 y11, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f46693l = y11;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f46692k = obj;
        this.f46694m |= Integer.MIN_VALUE;
        return this.f46693l.a(null, null, null, null, null, null, null, null, this);
    }
}
