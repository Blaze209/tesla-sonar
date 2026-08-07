package com.plaid.internal;

import com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveFinishResponse;
import com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartRequest;
import com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartResponse;
import com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishRequest;
import com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishResponse;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.plaid.internal.b7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\u0006\u0010\u000bJ)\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000f0\t2\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\fH'¢\u0006\u0004\b\u0006\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/plaid/internal/b7;", "", "Lcom/plaid/internal/core/protos/link/api/SilentNetworkAuth$LinkSNATwilioFinishRequest;", "request", "Lcom/plaid/internal/i4;", "Lcom/plaid/internal/core/protos/link/api/SilentNetworkAuth$LinkSNATwilioFinishResponse;", "a", "(Lcom/plaid/internal/core/protos/link/api/SilentNetworkAuth$LinkSNATwilioFinishRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/plaid/internal/core/protos/link/api/SilentNetworkAuth$LinkSNAProveStartRequest;", "Lretrofit2/d;", "Lcom/plaid/internal/core/protos/link/api/SilentNetworkAuth$LinkSNAProveStartResponse;", "(Lcom/plaid/internal/core/protos/link/api/SilentNetworkAuth$LinkSNAProveStartRequest;)Lretrofit2/d;", "", "id", "vfp", "Lcom/plaid/internal/core/protos/link/api/SilentNetworkAuth$LinkSNAProveFinishResponse;", "(Ljava/lang/String;Ljava/lang/String;)Lretrofit2/d;", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface InterfaceC4357b7 {
    @sr0.k({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf,application/json"})
    @sr0.o("/link/sna/twilio/finish")
    Object a(@sr0.a SilentNetworkAuth$LinkSNATwilioFinishRequest silentNetworkAuth$LinkSNATwilioFinishRequest, Continuation<? super AbstractC4442i4<SilentNetworkAuth$LinkSNATwilioFinishResponse, ? extends Object>> continuation);

    @sr0.k({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf,application/json"})
    @sr0.o("link/sna/prove/start")
    retrofit2.d<SilentNetworkAuth$LinkSNAProveStartResponse> a(@sr0.a SilentNetworkAuth$LinkSNAProveStartRequest request);

    @sr0.f("link/sna/prove/finish")
    @sr0.k({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf,application/json"})
    retrofit2.d<SilentNetworkAuth$LinkSNAProveFinishResponse> a(@sr0.t("id") String id2, @sr0.t("vfp") String vfp);
}
