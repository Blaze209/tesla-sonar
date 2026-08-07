package com.plaid.internal;

import com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import com.plaid.link.Plaid;
import com.plaid.link.event.LinkEvent;
import com.plaid.link.result.LinkError;
import com.plaid.link.result.LinkErrorCode;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkExitMetadata;
import com.plaid.link.result.LinkExitMetadataStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes6.dex */
public final class Y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d8 f46821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L4 f46822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4575x3 f46823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final F3 f46824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i8 f46825e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t8 f46826f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C6 f46827g;

    public Y2(d8 api, L4 paneStore, C4575x3 linkWorkflowAnalytics, F3 localErrorFactory, i8 requestFactory, t8 writeOAuthRedirectUri, C6 remoteLogController) {
        p013kotlin.jvm.internal.s.k(api, "api");
        p013kotlin.jvm.internal.s.k(paneStore, "paneStore");
        p013kotlin.jvm.internal.s.k(linkWorkflowAnalytics, "linkWorkflowAnalytics");
        p013kotlin.jvm.internal.s.k(localErrorFactory, "localErrorFactory");
        p013kotlin.jvm.internal.s.k(requestFactory, "requestFactory");
        p013kotlin.jvm.internal.s.k(writeOAuthRedirectUri, "writeOAuthRedirectUri");
        p013kotlin.jvm.internal.s.k(remoteLogController, "remoteLogController");
        this.f46821a = api;
        this.f46822b = paneStore;
        this.f46823c = linkWorkflowAnalytics;
        this.f46824d = localErrorFactory;
        this.f46825e = requestFactory;
        this.f46826f = writeOAuthRedirectUri;
        this.f46827g = remoteLogController;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x0107 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x0124  */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(N2 n11, boolean z11, ContinuationImpl continuationImpl) {
        X2 x11;
        Y2 y11;
        Y2 y12;
        Y2 y13;
        Object objA;
        Object objA2;
        if (continuationImpl instanceof X2) {
            x11 = (X2) continuationImpl;
            int i11 = x11.f46811f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                x11.f46811f = i11 - Integer.MIN_VALUE;
            } else {
                x11 = new X2(this, continuationImpl);
            }
        } else {
            x11 = new X2(this, continuationImpl);
        }
        X2 x12 = x11;
        Object objA3 = x12.f46809d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = x12.f46811f;
        if (i12 == 0) {
            jn0.t.b(objA3);
            if (n11 instanceof N2.a) {
                t8 t8Var = this.f46826f;
                x12.f46806a = this;
                x12.f46807b = n11;
                x12.f46811f = 1;
                if (t8Var.a(x12) != coroutine_suspended) {
                    y13 = this;
                    y13.f46823c.b();
                    N2.a aVar = (N2.a) n11;
                    Workflow$LinkWorkflowStartRequest workflow$LinkWorkflowStartRequestA = y13.f46825e.a(aVar);
                    y13.f46827g.a(aVar.i().a(), aVar.i().b());
                    String strH = n11.h();
                    String strG = n11.g();
                    x12.f46806a = null;
                    x12.f46807b = null;
                    x12.f46811f = 2;
                    objA = y13.a(workflow$LinkWorkflowStartRequestA, strH, strG, "", x12);
                    if (objA == coroutine_suspended) {
                        return objA;
                    }
                }
            } else if (n11 instanceof N2.b) {
                t8 t8Var2 = this.f46826f;
                x12.f46806a = this;
                x12.f46807b = n11;
                x12.f46808c = z11;
                x12.f46811f = 3;
                if (t8Var2.a(x12) != coroutine_suspended) {
                    y12 = this;
                    y12.f46823c.b();
                    N2.b bVar = (N2.b) n11;
                    Workflow$LinkWorkflowStartRequest workflow$LinkWorkflowStartRequestA2 = y12.f46825e.a(bVar, z11);
                    y12.f46827g.a(n11.g(), bVar.i().getToken());
                    String strH2 = n11.h();
                    String strG2 = n11.g();
                    String strA = ((N2.b) n11).a();
                    x12.f46806a = null;
                    x12.f46807b = null;
                    x12.f46811f = 4;
                    objA2 = y12.a(workflow$LinkWorkflowStartRequestA2, strH2, strG2, strA, x12);
                    if (objA2 == coroutine_suspended) {
                        return objA2;
                    }
                }
            } else {
                if (!(n11 instanceof N2.l)) {
                    if (n11 instanceof N2.i) {
                        return n11;
                    }
                    if (n11 instanceof N2.j) {
                        return this.f46824d.a();
                    }
                    if (n11 instanceof N2.k) {
                        return n11;
                    }
                    return a(O2.a(n11), n11.h(), new Throwable("Should not call workflow.start with state: " + n11), "", p013kotlin.collections.v.m());
                }
                L4 l11 = this.f46822b;
                m8 m8VarF = n11.f();
                x12.f46806a = this;
                x12.f46807b = n11;
                x12.f46811f = 5;
                objA3 = l11.a(m8VarF, x12);
                if (objA3 != coroutine_suspended) {
                    y11 = this;
                    if (((Pane$PaneRendering) objA3) == null) {
                        return y11.a(((N2.l) n11).c(), n11.h(), new Throwable("Current pane is null"), ((N2.l) n11).b(), p013kotlin.collections.v.m());
                    }
                    return n11;
                }
            }
        } else if (i12 == 1) {
            n11 = x12.f46807b;
            Y2 y14 = x12.f46806a;
            jn0.t.b(objA3);
            y13 = y14;
            y13.f46823c.b();
            N2.a aVar2 = (N2.a) n11;
            Workflow$LinkWorkflowStartRequest workflow$LinkWorkflowStartRequestA3 = y13.f46825e.a(aVar2);
            y13.f46827g.a(aVar2.i().a(), aVar2.i().b());
            String strH3 = n11.h();
            String strG3 = n11.g();
            x12.f46806a = null;
            x12.f46807b = null;
            x12.f46811f = 2;
            objA = y13.a(workflow$LinkWorkflowStartRequestA3, strH3, strG3, "", x12);
            if (objA == coroutine_suspended) {
                return objA;
            }
        } else {
            if (i12 == 2) {
                jn0.t.b(objA3);
                return objA3;
            }
            if (i12 != 3) {
                if (i12 == 4) {
                    jn0.t.b(objA3);
                    return objA3;
                }
                if (i12 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n11 = x12.f46807b;
                Y2 y15 = x12.f46806a;
                jn0.t.b(objA3);
                y11 = y15;
                if (((Pane$PaneRendering) objA3) == null) {
                    return y11.a(((N2.l) n11).c(), n11.h(), new Throwable("Current pane is null"), ((N2.l) n11).b(), p013kotlin.collections.v.m());
                }
                return n11;
            }
            z11 = x12.f46808c;
            n11 = x12.f46807b;
            y12 = x12.f46806a;
            jn0.t.b(objA3);
            y12.f46823c.b();
            N2.b bVar2 = (N2.b) n11;
            Workflow$LinkWorkflowStartRequest workflow$LinkWorkflowStartRequestA4 = y12.f46825e.a(bVar2, z11);
            y12.f46827g.a(n11.g(), bVar2.i().getToken());
            String strH4 = n11.h();
            String strG4 = n11.g();
            String strA2 = ((N2.b) n11).a();
            x12.f46806a = null;
            x12.f46807b = null;
            x12.f46811f = 4;
            objA2 = y12.a(workflow$LinkWorkflowStartRequestA4, strH4, strG4, strA2, x12);
            if (objA2 == coroutine_suspended) {
                return objA2;
            }
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0103  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x0192  */
    /* JADX WARN: Code duplicated, block: B:83:0x01aa A[RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0120, code lost:
    
        if (r2 == r4) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v2, types: [com.plaid.internal.Y2] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [com.plaid.internal.N2] */
    /* JADX WARN: Type inference failed for: r12v5, types: [com.plaid.internal.N2] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [com.plaid.internal.Y2] */
    /* JADX WARN: Type inference failed for: r13v2, types: [com.plaid.internal.Y2] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.plaid.internal.N2] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.plaid.internal.N2] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0120 -> B:19:0x0050). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.plaid.internal.N2 r25, p013kotlin.coroutines.jvm.internal.ContinuationImpl r26) {
        /*
            Method dump skipped, instruction units count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.Y2.b(com.plaid.internal.N2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static N2.e a(N2.i iVar) {
        String errorCode = iVar.f46500f;
        String displayMessage = iVar.f46499e;
        String errorJson = L2.a(errorCode, displayMessage, displayMessage);
        p013kotlin.jvm.internal.s.k(errorCode, "errorCode");
        p013kotlin.jvm.internal.s.k(displayMessage, "errorMessage");
        p013kotlin.jvm.internal.s.k(displayMessage, "displayMessage");
        p013kotlin.jvm.internal.s.k(errorJson, "errorJson");
        LinkError linkError = new LinkError(LinkErrorCode.INSTANCE.convert(errorCode), displayMessage, displayMessage, errorJson);
        LinkExitMetadataStatus linkExitMetadataStatusFromString = LinkExitMetadataStatus.INSTANCE.fromString(iVar.f46500f);
        String str = iVar.f46496b;
        String str2 = iVar.f46502h;
        LinkExitMetadata metadata = new LinkExitMetadata(linkExitMetadataStatusFromString, null, str, str2, L2.a(str, str2));
        String str3 = iVar.f46496b;
        p013kotlin.jvm.internal.s.k(metadata, "metadata");
        return new N2.e(str3, new LinkExit(linkError, metadata));
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0121  */
    /* JADX WARN: Code duplicated, block: B:54:0x012f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0161  */
    /* JADX WARN: Code duplicated, block: B:63:0x017e  */
    /* JADX WARN: Code duplicated, block: B:69:0x01d7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x018c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(Workflow$LinkWorkflowStartRequest workflow$LinkWorkflowStartRequest, String str, String str2, String str3, ContinuationImpl continuationImpl) {
        P2 p11;
        String workflowId;
        Y2 y11;
        String str4;
        String str5;
        G6 g11;
        C4575x3 c4575x3;
        Long l11;
        Workflow$LinkWorkflowStartResponse.Events events;
        Object objA;
        List<Common$SDKEvent> onAppearList;
        wn0.p<LinkEvent, I2, jn0.h0> linkEventListenerInternal$link_sdk_release;
        if (continuationImpl instanceof P2) {
            p11 = (P2) continuationImpl;
            int i11 = p11.f46581g;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                p11.f46581g = i11 - Integer.MIN_VALUE;
            } else {
                p11 = new P2(this, continuationImpl);
            }
        } else {
            p11 = new P2(this, continuationImpl);
        }
        P2 p12 = p11;
        Object objWithContext = p12.f46579e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = p12.f46581g;
        if (i12 == 0) {
            jn0.t.b(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            Q2 q11 = new Q2(this, workflow$LinkWorkflowStartRequest, null);
            p12.f46575a = this;
            workflowId = str;
            p12.f46576b = workflowId;
            p12.f46577c = str2;
            p12.f46578d = str3;
            p12.f46581g = 1;
            objWithContext = BuildersKt.withContext(io2, q11, p12);
            if (objWithContext != coroutine_suspended) {
                y11 = this;
                str4 = str2;
                str5 = str3;
            }
            return coroutine_suspended;
        }
        if (i12 != 1) {
            if (i12 == 2) {
                jn0.t.b(objWithContext);
                return objWithContext;
            }
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(objWithContext);
            return objWithContext;
        }
        String str6 = p12.f46578d;
        String str7 = p12.f46577c;
        String str8 = p12.f46576b;
        Y2 y12 = p12.f46575a;
        jn0.t.b(objWithContext);
        str5 = str6;
        str4 = str7;
        workflowId = str8;
        y11 = y12;
        AbstractC4442i4 abstractC4442i4 = (AbstractC4442i4) objWithContext;
        if (abstractC4442i4.a()) {
            return y11.a(workflowId, abstractC4442i4, "", p013kotlin.collections.v.m());
        }
        p013kotlin.jvm.internal.s.i(abstractC4442i4, "null cannot be cast to non-null type com.plaid.internal.core.networking.models.NetworkResponse.Success<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse>");
        Workflow$LinkWorkflowStartResponse workflow$LinkWorkflowStartResponse = (Workflow$LinkWorkflowStartResponse) ((AbstractC4442i4.c) abstractC4442i4).f47736a;
        C6 c11 = y11.f46827g;
        Workflow$LinkWorkflowStartResponse.c mobileSdkLogLevel = workflow$LinkWorkflowStartResponse.getMobileSdkLogLevel();
        p013kotlin.jvm.internal.s.j(mobileSdkLogLevel, "getMobileSdkLogLevel(...)");
        p013kotlin.jvm.internal.s.k(mobileSdkLogLevel, "<this>");
        int i13 = C4363c4.f46901a[mobileSdkLogLevel.ordinal()];
        if (i13 == 1) {
            g11 = G6.ALL;
        } else if (i13 != 2) {
            if (i13 != 3 && i13 != 4 && i13 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            g11 = G6.NONE;
        } else {
            g11 = G6.ERRORS_ONLY;
        }
        c11.a(g11);
        if (workflow$LinkWorkflowStartResponse.hasWebviewFallback()) {
            String url = workflow$LinkWorkflowStartResponse.getWebviewFallback().getUrl();
            p013kotlin.jvm.internal.s.j(url, "getUrl(...)");
            if (url.length() > 0) {
                String workflowSessionId = workflow$LinkWorkflowStartResponse.getWorkflowSessionId();
                p013kotlin.jvm.internal.s.j(workflowSessionId, "getWorkflowSessionId(...)");
                String requestId = workflow$LinkWorkflowStartResponse.getRequestId();
                p013kotlin.jvm.internal.s.j(requestId, "getRequestId(...)");
                Common$WebviewFallback webviewFallback = workflow$LinkWorkflowStartResponse.getWebviewFallback();
                p013kotlin.jvm.internal.s.j(webviewFallback, "getWebviewFallback(...)");
                p12.f46575a = null;
                p12.f46576b = null;
                p12.f46577c = null;
                p12.f46578d = null;
                p12.f46581g = 2;
                N2 n2A = y11.a(str4, workflowSessionId, requestId, str5, webviewFallback);
                if (n2A != coroutine_suspended) {
                    return n2A;
                }
            } else {
                c4575x3 = y11.f46823c;
                c4575x3.getClass();
                p013kotlin.jvm.internal.s.k(workflowId, "workflowId");
                l11 = c4575x3.f48217d;
                if (l11 != null) {
                    ClientEventOuterClass$ClientEvent.a aVarA = C4575x3.a().a(ClientEventOuterClass$ClientEvent.ClientOpenDelay.newBuilder().a(String.valueOf(l11.longValue())));
                    p013kotlin.jvm.internal.s.j(aVarA, "setClientOpenDelay(...)");
                    BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new C4566w3(c4575x3, aVarA, workflowId, null), 3, null);
                } else {
                    X5.a.e(X5.f46812a, "markOpenStart was not called before tracking open delay");
                }
                events = workflow$LinkWorkflowStartResponse.getEvents();
                if (events != null && (onAppearList = events.getOnAppearList()) != null) {
                    for (Common$SDKEvent common$SDKEvent : onAppearList) {
                        linkEventListenerInternal$link_sdk_release = Plaid.INSTANCE.getLinkEventListenerInternal$link_sdk_release();
                        if (linkEventListenerInternal$link_sdk_release != null) {
                            p013kotlin.jvm.internal.s.h(common$SDKEvent);
                            linkEventListenerInternal$link_sdk_release.invoke(N6.a(common$SDKEvent), I2.d.f46349a);
                        }
                    }
                }
                String workflowSessionId2 = workflow$LinkWorkflowStartResponse.getWorkflowSessionId();
                p013kotlin.jvm.internal.s.j(workflowSessionId2, "getWorkflowSessionId(...)");
                String continuationToken = workflow$LinkWorkflowStartResponse.getContinuationToken();
                p013kotlin.jvm.internal.s.j(continuationToken, "getContinuationToken(...)");
                Pane$PaneRendering nextPane = workflow$LinkWorkflowStartResponse.getNextPane();
                List<Pane$PaneRendering> additionalPanesList = workflow$LinkWorkflowStartResponse.getAdditionalPanesList();
                p013kotlin.jvm.internal.s.j(additionalPanesList, "getAdditionalPanesList(...)");
                String requestId2 = workflow$LinkWorkflowStartResponse.getRequestId();
                p013kotlin.jvm.internal.s.j(requestId2, "getRequestId(...)");
                p12.f46575a = null;
                p12.f46576b = null;
                p12.f46577c = null;
                p12.f46578d = null;
                p12.f46581g = 3;
                objA = y11.a(str4, workflowSessionId2, continuationToken, str5, nextPane, additionalPanesList, p013kotlin.collections.v.m(), requestId2, p12);
                if (objA == coroutine_suspended) {
                    return objA;
                }
            }
        } else {
            c4575x3 = y11.f46823c;
            c4575x3.getClass();
            p013kotlin.jvm.internal.s.k(workflowId, "workflowId");
            l11 = c4575x3.f48217d;
            if (l11 != null) {
                ClientEventOuterClass$ClientEvent.a aVarA2 = C4575x3.a().a(ClientEventOuterClass$ClientEvent.ClientOpenDelay.newBuilder().a(String.valueOf(l11.longValue())));
                p013kotlin.jvm.internal.s.j(aVarA2, "setClientOpenDelay(...)");
                BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new C4566w3(c4575x3, aVarA2, workflowId, null), 3, null);
            } else {
                X5.a.e(X5.f46812a, "markOpenStart was not called before tracking open delay");
            }
            events = workflow$LinkWorkflowStartResponse.getEvents();
            if (events != null) {
                while (r3.hasNext()) {
                    linkEventListenerInternal$link_sdk_release = Plaid.INSTANCE.getLinkEventListenerInternal$link_sdk_release();
                    if (linkEventListenerInternal$link_sdk_release != null) {
                        p013kotlin.jvm.internal.s.h(common$SDKEvent);
                        linkEventListenerInternal$link_sdk_release.invoke(N6.a(common$SDKEvent), I2.d.f46349a);
                    }
                }
            }
            String workflowSessionId3 = workflow$LinkWorkflowStartResponse.getWorkflowSessionId();
            p013kotlin.jvm.internal.s.j(workflowSessionId3, "getWorkflowSessionId(...)");
            String continuationToken2 = workflow$LinkWorkflowStartResponse.getContinuationToken();
            p013kotlin.jvm.internal.s.j(continuationToken2, "getContinuationToken(...)");
            Pane$PaneRendering nextPane2 = workflow$LinkWorkflowStartResponse.getNextPane();
            List<Pane$PaneRendering> additionalPanesList2 = workflow$LinkWorkflowStartResponse.getAdditionalPanesList();
            p013kotlin.jvm.internal.s.j(additionalPanesList2, "getAdditionalPanesList(...)");
            String requestId3 = workflow$LinkWorkflowStartResponse.getRequestId();
            p013kotlin.jvm.internal.s.j(requestId3, "getRequestId(...)");
            p12.f46575a = null;
            p12.f46576b = null;
            p12.f46577c = null;
            p12.f46578d = null;
            p12.f46581g = 3;
            objA = y11.a(str4, workflowSessionId3, continuationToken2, str5, nextPane2, additionalPanesList2, p013kotlin.collections.v.m(), requestId3, p12);
            if (objA == coroutine_suspended) {
                return objA;
            }
        }
        return coroutine_suspended;
    }

    public final N2 a(String str, String str2, String str3, String str4, Common$WebviewFallback common$WebviewFallback) {
        A a11;
        Y6 y6A;
        String url = common$WebviewFallback.getUrl();
        p013kotlin.jvm.internal.s.h(url);
        if (url.length() == 0) {
            return a(str3, str2, new Throwable("Webview fallback URL was null"), "", p013kotlin.collections.v.m());
        }
        if (common$WebviewFallback.getMode() == com.plaid.internal.core.protos.link.workflow.nodes.panes.b0.WEBVIEW_FALLBACK_MODE_OUT_OF_PROCESS) {
            String webviewFallbackId = common$WebviewFallback.getWebviewFallbackId();
            p013kotlin.jvm.internal.s.j(webviewFallbackId, "getWebviewFallbackId(...)");
            String id2 = common$WebviewFallback.getChannelFromWebview().getId();
            p013kotlin.jvm.internal.s.j(id2, "getId(...)");
            String secret = common$WebviewFallback.getChannelFromWebview().getSecret();
            p013kotlin.jvm.internal.s.j(secret, "getSecret(...)");
            return new N2.k(str, str2, str3, str4, url, webviewFallbackId, new A(common$WebviewFallback.getChannelFromWebview().getPollingIntervalMs(), id2, secret), common$WebviewFallback.getShouldEagerStart(), Y6.NO_SMS_AUTOFILL, 128);
        }
        if (common$WebviewFallback.getMode() == com.plaid.internal.core.protos.link.workflow.nodes.panes.b0.WEBVIEW_FALLBACK_MODE_IN_PROCESS) {
            if (common$WebviewFallback.hasChannelFromWebview()) {
                String id3 = common$WebviewFallback.getChannelFromWebview().getId();
                p013kotlin.jvm.internal.s.j(id3, "getId(...)");
                String secret2 = common$WebviewFallback.getChannelFromWebview().getSecret();
                p013kotlin.jvm.internal.s.j(secret2, "getSecret(...)");
                a11 = new A(common$WebviewFallback.getChannelFromWebview().getPollingIntervalMs(), id3, secret2);
            } else {
                a11 = null;
            }
            A a12 = a11;
            String webviewFallbackId2 = common$WebviewFallback.getWebviewFallbackId();
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Z webviewFallbackBackground = common$WebviewFallback.getWebviewFallbackBackground();
            p013kotlin.jvm.internal.s.j(webviewFallbackBackground, "getWebviewFallbackBackground(...)");
            boolean zA = F7.a(webviewFallbackBackground);
            boolean shouldEagerStart = common$WebviewFallback.getShouldEagerStart();
            com.plaid.internal.core.protos.link.workflow.primitives.f androidSmsVerificationApiType = common$WebviewFallback.getAndroidSmsVerificationApiType();
            if (androidSmsVerificationApiType == null || (y6A = C4401e.a(androidSmsVerificationApiType)) == null) {
                y6A = Y6.NO_SMS_AUTOFILL;
            }
            Y6 y11 = y6A;
            p013kotlin.jvm.internal.s.h(webviewFallbackId2);
            return new N2.k(str, str2, str3, str4, url, webviewFallbackId2, a12, zA, false, shouldEagerStart, y11);
        }
        Throwable th2 = new Throwable("Unsupported webview fallback mode: " + common$WebviewFallback.getMode());
        X5.a.a(X5.f46812a, th2);
        return a(str3, str2, th2, "", p013kotlin.collections.v.m());
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(N2 n11, List list, ContinuationImpl continuationImpl) {
        T2 t11;
        List<m8> listM;
        List<m8> list2;
        String str;
        Object objA;
        List<m8> list3;
        Y2 y11;
        ArrayList arrayList;
        N2 n12;
        if (continuationImpl instanceof T2) {
            t11 = (T2) continuationImpl;
            int i11 = t11.f46713g;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                t11.f46713g = i11 - Integer.MIN_VALUE;
            } else {
                t11 = new T2(this, continuationImpl);
            }
        } else {
            t11 = new T2(this, continuationImpl);
        }
        T2 t12 = t11;
        Object obj = t12.f46711e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = t12.f46713g;
        if (i12 == 0) {
            jn0.t.b(obj);
            if (n11 instanceof N2.i) {
                return a((N2.i) n11);
            }
            boolean z11 = n11 instanceof N2.l;
            if (z11) {
                arrayList = new ArrayList();
                N2.l lVar = (N2.l) n11;
                arrayList.addAll(lVar.f46532h);
                arrayList.add(lVar.f46530f);
            } else {
                listM = p013kotlin.collections.v.m();
            }
            if (z11) {
                list2 = listM;
                list2 = arrayList;
                str = ((N2.l) n11).f46528d;
            } else {
                list2 = listM;
                list2 = arrayList;
                str = "";
            }
            Workflow$LinkWorkflowNextRequest.a aVarNewBuilder = Workflow$LinkWorkflowNextRequest.newBuilder();
            aVarNewBuilder.b(n11.h());
            aVarNewBuilder.a(str);
            if (!list.isEmpty()) {
                aVarNewBuilder.a(list);
            }
            Workflow$LinkWorkflowNextRequest workflow$LinkWorkflowNextRequestBuild = aVarNewBuilder.build();
            Z0 z12 = Z0.f46842a;
            U2 u11 = new U2(this, workflow$LinkWorkflowNextRequestBuild, null);
            t12.f46707a = this;
            t12.f46708b = n11;
            t12.f46709c = list2;
            t12.f46710d = str;
            t12.f46713g = 1;
            objA = z12.a(u11, t12);
            if (objA != coroutine_suspended) {
                list3 = list2;
                y11 = this;
                n12 = n11;
            }
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return obj;
        }
        String str2 = t12.f46710d;
        List<m8> list4 = t12.f46709c;
        N2 n13 = t12.f46708b;
        Y2 y12 = t12.f46707a;
        jn0.t.b(obj);
        list3 = list4;
        objA = obj;
        str = str2;
        n12 = n13;
        y11 = y12;
        AbstractC4442i4 abstractC4442i4 = (AbstractC4442i4) objA;
        if (abstractC4442i4.a()) {
            return y11.a(n12.h(), abstractC4442i4, str, list3);
        }
        p013kotlin.jvm.internal.s.i(abstractC4442i4, "null cannot be cast to non-null type com.plaid.internal.core.networking.models.NetworkResponse.Success<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowNextResponse>");
        Workflow$LinkWorkflowNextResponse workflow$LinkWorkflowNextResponse = (Workflow$LinkWorkflowNextResponse) ((AbstractC4442i4.c) abstractC4442i4).f47736a;
        String strG = n12.g();
        String workflowSessionId = workflow$LinkWorkflowNextResponse.getWorkflowSessionId();
        p013kotlin.jvm.internal.s.j(workflowSessionId, "getWorkflowSessionId(...)");
        String continuationToken = workflow$LinkWorkflowNextResponse.getContinuationToken();
        p013kotlin.jvm.internal.s.j(continuationToken, "getContinuationToken(...)");
        String strA = n12 instanceof N2.g ? ((N2.g) n12).a() : "";
        Pane$PaneRendering nextPane = workflow$LinkWorkflowNextResponse.getNextPane();
        List<Pane$PaneRendering> additionalPanesList = workflow$LinkWorkflowNextResponse.getAdditionalPanesList();
        p013kotlin.jvm.internal.s.j(additionalPanesList, "getAdditionalPanesList(...)");
        String requestId = workflow$LinkWorkflowNextResponse.getRequestId();
        p013kotlin.jvm.internal.s.j(requestId, "getRequestId(...)");
        t12.f46707a = null;
        t12.f46708b = null;
        t12.f46709c = null;
        t12.f46710d = null;
        t12.f46713g = 2;
        Object objA2 = y11.a(strG, workflowSessionId, continuationToken, strA, nextPane, additionalPanesList, list3, requestId, t12);
        return objA2 == coroutine_suspended ? coroutine_suspended : objA2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(N2 n11, ContinuationImpl continuationImpl) {
        R2 r11;
        Y2 y11;
        List<m8> list;
        String str;
        N2 n12;
        if (continuationImpl instanceof R2) {
            r11 = (R2) continuationImpl;
            int i11 = r11.f46649g;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                r11.f46649g = i11 - Integer.MIN_VALUE;
            } else {
                r11 = new R2(this, continuationImpl);
            }
        } else {
            r11 = new R2(this, continuationImpl);
        }
        Object objA = r11.f46647e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = r11.f46649g;
        if (i12 == 0) {
            jn0.t.b(objA);
            m8 m8VarF = n11.f();
            boolean z11 = n11 instanceof N2.f;
            String strB = z11 ? ((N2.f) n11).b() : "";
            List<m8> listD = z11 ? ((N2.f) n11).d() : p013kotlin.collections.v.m();
            L4 l11 = this.f46822b;
            r11.f46643a = this;
            r11.f46644b = n11;
            r11.f46645c = strB;
            r11.f46646d = listD;
            r11.f46649g = 1;
            objA = l11.a(m8VarF, r11);
            if (objA != coroutine_suspended) {
                y11 = this;
                list = listD;
                str = strB;
                n12 = n11;
            }
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(objA);
            return objA;
        }
        List<m8> list2 = r11.f46646d;
        String str2 = r11.f46645c;
        N2 n13 = r11.f46644b;
        Y2 y12 = r11.f46643a;
        jn0.t.b(objA);
        list = list2;
        str = str2;
        n12 = n13;
        y11 = y12;
        Pane$PaneRendering pane$PaneRendering = (Pane$PaneRendering) objA;
        if (pane$PaneRendering == null) {
            return y11.a(O2.a(n12), n12.h(), new Throwable("Current pane is null"), str, list);
        }
        Pane$PaneOutput.a aVarA = K4.a(pane$PaneRendering);
        if (aVarA == null) {
            return y11.a(O2.a(n12), n12.h(), new Throwable("Current pane could not be converted to an exit action: " + pane$PaneRendering.getRenderingPropertyKey()), str, list);
        }
        List listE = p013kotlin.collections.v.e(aVarA.build());
        r11.f46643a = null;
        r11.f46644b = null;
        r11.f46645c = null;
        r11.f46646d = null;
        r11.f46649g = 2;
        Object objA2 = y11.a(n12, listE, r11);
        return objA2 == coroutine_suspended ? coroutine_suspended : objA2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(N2 n11, AbstractC4587y6 abstractC4587y6, ContinuationImpl continuationImpl) {
        W2 w11;
        Object objA;
        Y2 y11;
        N2 n12;
        if (continuationImpl instanceof W2) {
            w11 = (W2) continuationImpl;
            int i11 = w11.f46790e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                w11.f46790e = i11 - Integer.MIN_VALUE;
            } else {
                w11 = new W2(this, continuationImpl);
            }
        } else {
            w11 = new W2(this, continuationImpl);
        }
        W2 w12 = w11;
        Object obj = w12.f46788c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = w12.f46790e;
        if (i12 == 0) {
            jn0.t.b(obj);
            if (abstractC4587y6 instanceof AbstractC4587y6.d) {
                return a(O2.a(n11), n11.h(), ((AbstractC4587y6.d) abstractC4587y6).a(), "", p013kotlin.collections.v.m());
            }
            if (n11 instanceof N2.k) {
                if (!(abstractC4587y6 instanceof AbstractC4587y6.b) && !(abstractC4587y6 instanceof AbstractC4587y6.c)) {
                    i8 i8Var = this.f46825e;
                    N2.k kVar = (N2.k) n11;
                    p013kotlin.jvm.internal.s.i(abstractC4587y6, "null cannot be cast to non-null type com.plaid.internal.redirect.RedirectState.OAuth");
                    Workflow$LinkWorkflowStartRequest workflow$LinkWorkflowStartRequestA = i8Var.a(kVar, (AbstractC4587y6.a) abstractC4587y6);
                    String strH = n11.h();
                    String strG = n11.g();
                    String strA = kVar.a();
                    w12.f46790e = 1;
                    Object objA2 = a(workflow$LinkWorkflowStartRequestA, strH, strG, strA, w12);
                    if (objA2 != coroutine_suspended) {
                        return objA2;
                    }
                } else {
                    return new N2.d(n11.g(), n11.h(), ((N2.k) n11).c(), abstractC4587y6 instanceof AbstractC4587y6.c);
                }
            } else {
                m8 m8VarE = n11 instanceof N2.l ? ((N2.l) n11).e() : null;
                if (m8VarE == null) {
                    return a(O2.a(n11), n11.h(), new IllegalStateException("Link does not have a current pane"), "", p013kotlin.collections.v.m());
                }
                L4 l11 = this.f46822b;
                w12.f46786a = this;
                w12.f46787b = n11;
                w12.f46790e = 2;
                objA = l11.a(m8VarE, w12);
                if (objA != coroutine_suspended) {
                    y11 = this;
                    n12 = n11;
                }
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            jn0.t.b(obj);
            return obj;
        }
        if (i12 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        n12 = w12.f46787b;
        Y2 y12 = w12.f46786a;
        jn0.t.b(obj);
        objA = obj;
        y11 = y12;
        if (((Pane$PaneRendering) objA) != null) {
            return n12;
        }
        return y11.a(O2.a(n12), n12.h(), new IllegalStateException("OAuth pane not found: " + n12), "", p013kotlin.collections.v.m());
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:30:0x0100 A[LOOP:0: B:25:0x00cb->B:30:0x0100, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0122 A[LOOP:1: B:32:0x011c->B:34:0x0122, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object a(String str, String str2, String str3, String str4, Pane$PaneRendering pane$PaneRendering, List list, List list2, String str5, ContinuationImpl continuationImpl) {
        S2 s11;
        String str6;
        String str7;
        List list3;
        String str8;
        Pane$PaneRendering pane$PaneRendering2;
        String str9;
        List list4;
        String str10;
        Y2 y11;
        List<Pane$PaneRendering> list5;
        List list6;
        String str11;
        Pane$PaneRendering pane$PaneRendering3;
        String str12;
        String str13;
        String str14;
        Iterator it;
        String str15;
        Y2 y12;
        ArrayList arrayList;
        Pane$PaneRendering pane$PaneRendering4;
        L4 l11;
        m8 m8VarA;
        if (continuationImpl instanceof S2) {
            s11 = (S2) continuationImpl;
            int i11 = s11.f46694m;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                s11.f46694m = i11 - Integer.MIN_VALUE;
            } else {
                s11 = new S2(this, continuationImpl);
            }
        } else {
            s11 = new S2(this, continuationImpl);
        }
        Object obj = s11.f46692k;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = s11.f46694m;
        if (i12 == 0) {
            jn0.t.b(obj);
            if (pane$PaneRendering == null) {
                return a(str5, str2, new Throwable("Next pane was null in start request"), str3, (List<m8>) list2);
            }
            L4 l12 = this.f46822b;
            m8.CREATOR.getClass();
            m8 m8VarA2 = m8.c.a(pane$PaneRendering, str2);
            s11.f46682a = this;
            str6 = str;
            s11.f46683b = str6;
            s11.f46684c = str2;
            str7 = str3;
            s11.f46685d = str7;
            s11.f46686e = str4;
            s11.f46687f = pane$PaneRendering;
            s11.f46688g = list;
            list3 = list2;
            s11.f46689h = list3;
            str8 = str5;
            s11.f46690i = str8;
            s11.f46694m = 1;
            if (l12.a(m8VarA2, pane$PaneRendering, s11) != coroutine_suspended) {
                pane$PaneRendering2 = pane$PaneRendering;
                str9 = str4;
                list4 = list;
                str10 = str2;
                y11 = this;
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            String str16 = s11.f46690i;
            List list7 = s11.f46689h;
            list4 = s11.f46688g;
            pane$PaneRendering2 = s11.f46687f;
            String str17 = s11.f46686e;
            str7 = s11.f46685d;
            str10 = s11.f46684c;
            String str18 = s11.f46683b;
            Y2 y13 = s11.f46682a;
            jn0.t.b(obj);
            str8 = str16;
            str9 = str17;
            str6 = str18;
            y11 = y13;
            list3 = list7;
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = s11.f46691j;
            str15 = s11.f46690i;
            list6 = s11.f46689h;
            list5 = s11.f46688g;
            pane$PaneRendering3 = s11.f46687f;
            str14 = s11.f46686e;
            str13 = s11.f46685d;
            str12 = s11.f46684c;
            str11 = s11.f46683b;
            y12 = s11.f46682a;
            jn0.t.b(obj);
        }
        while (it.hasNext()) {
            pane$PaneRendering4 = (Pane$PaneRendering) it.next();
            l11 = y12.f46822b;
            m8.CREATOR.getClass();
            m8VarA = m8.c.a(pane$PaneRendering4, str12);
            s11.f46682a = y12;
            s11.f46683b = str11;
            s11.f46684c = str12;
            s11.f46685d = str13;
            s11.f46686e = str14;
            s11.f46687f = pane$PaneRendering3;
            s11.f46688g = list5;
            s11.f46689h = list6;
            s11.f46690i = str15;
            s11.f46691j = it;
            s11.f46694m = 2;
            if (l11.a(m8VarA, pane$PaneRendering4, s11) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        m8.CREATOR.getClass();
        m8 m8VarA3 = m8.c.a(pane$PaneRendering3, str12);
        arrayList = new ArrayList(p013kotlin.collections.v.y(list5, 10));
        for (Pane$PaneRendering pane$PaneRendering5 : list5) {
            m8.CREATOR.getClass();
            arrayList.add(m8.c.a(pane$PaneRendering5, str12));
        }
        return new N2.l(str11, str12, str13, str14, m8VarA3, arrayList, list6, str15);
        Iterator it2 = list4.iterator();
        Pane$PaneRendering pane$PaneRendering6 = pane$PaneRendering2;
        list5 = list4;
        list6 = list3;
        str11 = str6;
        pane$PaneRendering3 = pane$PaneRendering6;
        str12 = str10;
        str13 = str7;
        str14 = str9;
        it = it2;
        str15 = str8;
        y12 = y11;
        while (it.hasNext()) {
            pane$PaneRendering4 = (Pane$PaneRendering) it.next();
            l11 = y12.f46822b;
            m8.CREATOR.getClass();
            m8VarA = m8.c.a(pane$PaneRendering4, str12);
            s11.f46682a = y12;
            s11.f46683b = str11;
            s11.f46684c = str12;
            s11.f46685d = str13;
            s11.f46686e = str14;
            s11.f46687f = pane$PaneRendering3;
            s11.f46688g = list5;
            s11.f46689h = list6;
            s11.f46690i = str15;
            s11.f46691j = it;
            s11.f46694m = 2;
            if (l11.a(m8VarA, pane$PaneRendering4, s11) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        m8.CREATOR.getClass();
        m8 m8VarA4 = m8.c.a(pane$PaneRendering3, str12);
        arrayList = new ArrayList(p013kotlin.collections.v.y(list5, 10));
        while (r2.hasNext()) {
            m8.CREATOR.getClass();
            arrayList.add(m8.c.a(pane$PaneRendering5, str12));
        }
        return new N2.l(str11, str12, str13, str14, m8VarA4, arrayList, list6, str15);
    }

    public final <T> N2.i a(String workflowId, AbstractC4442i4<? extends T, ? extends Object> errorResponse, String continuationToken, List<m8> backstack) throws B2 {
        H3 h11;
        F3 f11 = this.f46824d;
        f11.getClass();
        p013kotlin.jvm.internal.s.k(errorResponse, "errorResponse");
        p013kotlin.jvm.internal.s.k(workflowId, "workflowId");
        p013kotlin.jvm.internal.s.k(continuationToken, "continuationToken");
        p013kotlin.jvm.internal.s.k(backstack, "backstack");
        if (!(errorResponse instanceof AbstractC4442i4.c)) {
            String strValueOf = "";
            if (errorResponse instanceof AbstractC4442i4.b) {
                h11 = H3.NETWORK_ERROR;
            } else if (errorResponse instanceof AbstractC4442i4.d) {
                h11 = H3.UNKNOWN_ERROR;
            } else if (errorResponse instanceof AbstractC4442i4.a) {
                AbstractC4442i4.a aVar = (AbstractC4442i4.a) errorResponse;
                U u11 = aVar.f47733a;
                strValueOf = u11 instanceof bx.b0 ? String.valueOf(((Map) u11).get("request_id")) : "";
                if (aVar.f47734b == 440) {
                    h11 = H3.SESSION_EXPIRED;
                } else {
                    h11 = H3.HTTP_ERROR;
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
            H3 h12 = h11;
            m8.CREATOR.getClass();
            p013kotlin.jvm.internal.s.k(workflowId, "workflowId");
            return new N2.i(workflowId, new m8(workflowId, "error_pane_id", "local_error_pane"), continuationToken, f11.a(h12), LinkErrorCode.ApiError.INTERNAL_SERVER_ERROR.INSTANCE.getJson(), backstack, strValueOf, h12);
        }
        throw new B2("Can't convert success response to local error");
    }

    public final N2.i a(String requestId, String workflowId, Throwable throwable, String continuationToken, List<m8> backstack) {
        X5.a.a(X5.f46812a, throwable);
        F3 f11 = this.f46824d;
        f11.getClass();
        p013kotlin.jvm.internal.s.k(requestId, "requestId");
        p013kotlin.jvm.internal.s.k(throwable, "throwable");
        p013kotlin.jvm.internal.s.k(workflowId, "workflowId");
        p013kotlin.jvm.internal.s.k(continuationToken, "continuationToken");
        p013kotlin.jvm.internal.s.k(backstack, "backstack");
        m8.CREATOR.getClass();
        p013kotlin.jvm.internal.s.k(workflowId, "workflowId");
        m8 m8Var = new m8(workflowId, "error_pane_id", "local_error_pane");
        H3 h11 = H3.UNKNOWN_ERROR;
        return new N2.i(workflowId, m8Var, continuationToken, f11.a(h11), LinkErrorCode.ApiError.INTERNAL_SERVER_ERROR.INSTANCE.getJson(), backstack, requestId, h11);
    }
}
