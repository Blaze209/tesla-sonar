package com.plaid.internal;

import com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchRequest;
import com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchResponse;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventResponse;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\u0006\u0010\nJ&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000bH§@¢\u0006\u0004\b\u0006\u0010\rJ&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0006\u0010\u0010J&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0006\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/plaid/internal/d8;", "", "Lcom/plaid/internal/core/protos/link/api/Workflow$LinkWorkflowStartRequest;", "request", "Lcom/plaid/internal/i4;", "Lcom/plaid/internal/core/protos/link/api/Workflow$LinkWorkflowStartResponse;", "a", "(Lcom/plaid/internal/core/protos/link/api/Workflow$LinkWorkflowStartRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/plaid/internal/core/protos/link/api/Workflow$LinkWorkflowNextRequest;", "Lcom/plaid/internal/core/protos/link/api/Workflow$LinkWorkflowNextResponse;", "(Lcom/plaid/internal/core/protos/link/api/Workflow$LinkWorkflowNextRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/plaid/internal/core/protos/link/api/Workflow$LinkWorkflowEventRequest;", "Lcom/plaid/internal/core/protos/link/api/Workflow$LinkWorkflowEventResponse;", "(Lcom/plaid/internal/core/protos/link/api/Workflow$LinkWorkflowEventRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/plaid/internal/core/protos/link/api/Workflow$LinkWorkflowPollRequest;", "Lcom/plaid/internal/core/protos/link/api/Workflow$LinkWorkflowPollResponse;", "(Lcom/plaid/internal/core/protos/link/api/Workflow$LinkWorkflowPollRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/plaid/internal/core/protos/link/api/Channel$LinkChannelFetchRequest;", "Lcom/plaid/internal/core/protos/link/api/Channel$LinkChannelFetchResponse;", "(Lcom/plaid/internal/core/protos/link/api/Channel$LinkChannelFetchRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface d8 {
    @sr0.k({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf,application/json"})
    @sr0.o("link/channel/fetch")
    Object a(@sr0.a Channel$LinkChannelFetchRequest channel$LinkChannelFetchRequest, Continuation<? super AbstractC4442i4<Channel$LinkChannelFetchResponse, ? extends Object>> continuation);

    @sr0.k({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf,application/json"})
    @sr0.o("/link/workflow/event")
    Object a(@sr0.a Workflow$LinkWorkflowEventRequest workflow$LinkWorkflowEventRequest, Continuation<? super AbstractC4442i4<Workflow$LinkWorkflowEventResponse, ? extends Object>> continuation);

    @sr0.k({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf,application/json"})
    @sr0.o("/link/workflow/next")
    Object a(@sr0.a Workflow$LinkWorkflowNextRequest workflow$LinkWorkflowNextRequest, Continuation<? super AbstractC4442i4<Workflow$LinkWorkflowNextResponse, ? extends Object>> continuation);

    @sr0.k({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf,application/json"})
    @sr0.o("link/workflow/poll")
    Object a(@sr0.a Workflow$LinkWorkflowPollRequest workflow$LinkWorkflowPollRequest, Continuation<? super AbstractC4442i4<Workflow$LinkWorkflowPollResponse, ? extends Object>> continuation);

    @sr0.k({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf,application/json"})
    @sr0.o("/link/workflow/start")
    Object a(@sr0.a Workflow$LinkWorkflowStartRequest workflow$LinkWorkflowStartRequest, Continuation<? super AbstractC4442i4<Workflow$LinkWorkflowStartResponse, ? extends Object>> continuation);
}
