package com.plaid.internal;

import com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchResponse;
import com.plaid.internal.core.protos.link.channel.Channel$Message;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent;
import com.plaid.link.event.LinkEvent;
import com.plaid.link.result.LinkResult;
import java.util.HashSet;

/* JADX INFO: loaded from: classes6.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d8 f46303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet<String> f46304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f46305c;

    public F(d8 workflowApi) {
        p013kotlin.jvm.internal.s.k(workflowApi, "workflowApi");
        this.f46303a = workflowApi;
        this.f46304b = new HashSet<>();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008f  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c3, code lost:
    
        if (r12 == r1) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00c3 -> B:13:0x0038). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.plaid.internal.F r9, com.plaid.internal.A r10, com.plaid.internal.G r11, p013kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.F.a(com.plaid.internal.F, com.plaid.internal.A, com.plaid.internal.G, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final LinkResult a(Channel$LinkChannelFetchResponse channel$LinkChannelFetchResponse, G g11) {
        Channel$Message.SDKResult result;
        LinkResult linkResultA;
        jn0.h0 h0Var;
        Channel$Message.SDKEvent event;
        LinkResult linkResult = null;
        for (Channel$Message channel$Message : channel$LinkChannelFetchResponse.getMessagesList()) {
            if (!this.f46304b.contains(channel$Message.getMessageId())) {
                this.f46304b.add(channel$Message.getMessageId());
                if (channel$Message.hasEvent() && (event = channel$Message.getEvent()) != null) {
                    LinkEvent linkEventA = N6.a(event);
                    if (linkEventA.getEventName().toString().length() != 0) {
                        g11.a(linkEventA, I2.d.f46349a);
                    }
                }
                if (channel$Message.hasInternalEvent() && channel$Message.getInternalEvent().hasRequestSilentNetworkAuth()) {
                    Common$SDKInternalEvent.RequestSilentNetworkAuth requestSilentNetworkAuth = channel$Message.getInternalEvent().getRequestSilentNetworkAuth();
                    p013kotlin.jvm.internal.s.h(requestSilentNetworkAuth);
                    AbstractC4366c7 abstractC4366c7A = L6.a(requestSilentNetworkAuth);
                    if (abstractC4366c7A != null) {
                        A6.a.b(p013kotlin.collections.v0.i(), "Polling received SNA request");
                        g11.a(abstractC4366c7A);
                        h0Var = jn0.h0.f84049a;
                    } else {
                        h0Var = null;
                    }
                    if (h0Var == null) {
                        T6.a.a("Invalid SNA request: " + requestSilentNetworkAuth);
                    }
                }
                if (channel$Message.hasPreCompletionResult()) {
                    Channel$Message.SDKResult preCompletionResult = channel$Message.getPreCompletionResult();
                    p013kotlin.jvm.internal.s.j(preCompletionResult, "getPreCompletionResult(...)");
                    g11.a(preCompletionResult);
                }
                if (channel$Message.hasResult() && (result = channel$Message.getResult()) != null && (linkResultA = O6.a(result)) != null) {
                    linkResult = linkResultA;
                }
            }
        }
        return linkResult;
    }
}
