package com.plaid.internal;

import com.google.protobuf.Timestamp;
import com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;

/* JADX INFO: renamed from: com.plaid.internal.x3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4575x3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d8 f48214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A3 f48215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineDispatcher f48216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f48217d;

    public C4575x3(d8 api, A3 workflowAnalyticsStore) {
        p013kotlin.jvm.internal.s.k(api, "api");
        p013kotlin.jvm.internal.s.k(workflowAnalyticsStore, "workflowAnalyticsStore");
        this.f48214a = api;
        this.f48215b = workflowAnalyticsStore;
        this.f48216c = Dispatchers.getIO().limitedParallelism(1);
    }

    public final void a(m8 currentPane, m8 m8Var) {
        String str;
        p013kotlin.jvm.internal.s.k(currentPane, "currentPane");
        String str2 = currentPane.f47884a;
        ClientEventOuterClass$ClientEvent.a aVarA = a();
        ClientEventOuterClass$ClientEvent.Back.a aVarNewBuilder = ClientEventOuterClass$ClientEvent.Back.newBuilder();
        aVarNewBuilder.a(currentPane.f47886c);
        if (m8Var == null || (str = m8Var.f47886c) == null) {
            str = "";
        }
        aVarNewBuilder.b(str);
        jn0.h0 h0Var = jn0.h0.f84049a;
        ClientEventOuterClass$ClientEvent.a aVarA2 = aVarA.a(aVarNewBuilder);
        p013kotlin.jvm.internal.s.j(aVarA2, "setBack(...)");
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new C4566w3(this, aVarA2, str2, null), 3, null);
    }

    public final void b(m8 currentPane) {
        p013kotlin.jvm.internal.s.k(currentPane, "currentPane");
        String str = currentPane.f47884a;
        ClientEventOuterClass$ClientEvent.a aVarA = a().a(ClientEventOuterClass$ClientEvent.OAuthLink.newBuilder().a(ClientEventOuterClass$ClientEvent.OAuthLink.PollingStarted.getDefaultInstance()));
        p013kotlin.jvm.internal.s.j(aVarA, "setOauthLink(...)");
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new C4566w3(this, aVarA, str, null), 3, null);
    }

    public final void c(String webviewFallbackId) {
        p013kotlin.jvm.internal.s.k(webviewFallbackId, "webviewFallbackId");
        ClientEventOuterClass$ClientEvent clientEventOuterClass$ClientEventBuild = a().a(ClientEventOuterClass$ClientEvent.WebviewFallbackOpen.getDefaultInstance()).build();
        p013kotlin.jvm.internal.s.h(clientEventOuterClass$ClientEventBuild);
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new C4557v3(this, webviewFallbackId, clientEventOuterClass$ClientEventBuild, null), 3, null);
    }

    public final void b() {
        this.f48217d = Long.valueOf(System.currentTimeMillis());
    }

    public final void b(String webviewFallbackId) {
        p013kotlin.jvm.internal.s.k(webviewFallbackId, "webviewFallbackId");
        ClientEventOuterClass$ClientEvent clientEventOuterClass$ClientEventBuild = a().a(ClientEventOuterClass$ClientEvent.WebviewFallbackEmitPreCompletionResult.getDefaultInstance()).build();
        p013kotlin.jvm.internal.s.h(clientEventOuterClass$ClientEventBuild);
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new C4557v3(this, webviewFallbackId, clientEventOuterClass$ClientEventBuild, null), 3, null);
    }

    public final void a(m8 currentPane) {
        p013kotlin.jvm.internal.s.k(currentPane, "currentPane");
        String str = currentPane.f47884a;
        ClientEventOuterClass$ClientEvent.a aVarA = a().a(ClientEventOuterClass$ClientEvent.OAuthLink.newBuilder().a(ClientEventOuterClass$ClientEvent.OAuthLink.PollingComplete.getDefaultInstance()));
        p013kotlin.jvm.internal.s.j(aVarA, "setOauthLink(...)");
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new C4566w3(this, aVarA, str, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00df  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:41:0x0103  */
    /* JADX WARN: Code duplicated, block: B:44:0x011e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(com.plaid.internal.C4575x3 r9, p013kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.C4575x3.a(com.plaid.internal.x3, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static ClientEventOuterClass$ClientEvent.a a() {
        return ClientEventOuterClass$ClientEvent.newBuilder().a(Timestamp.newBuilder().setSeconds(System.currentTimeMillis() / ((long) 1000)));
    }

    public final void a(String webviewFallbackId) {
        p013kotlin.jvm.internal.s.k(webviewFallbackId, "webviewFallbackId");
        ClientEventOuterClass$ClientEvent clientEventOuterClass$ClientEventBuild = a().a(ClientEventOuterClass$ClientEvent.WebviewFallbackCancel.newBuilder().a(ClientEventOuterClass$ClientEvent.WebviewFallbackCancel.b.LINK_WORKFLOW_EVENT_WEBVIEW_FALLBACK_CANCEL_REASON_UNKNOWN).build()).build();
        p013kotlin.jvm.internal.s.h(clientEventOuterClass$ClientEventBuild);
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new C4557v3(this, webviewFallbackId, clientEventOuterClass$ClientEventBuild, null), 3, null);
    }
}
