package com.withpersona.sdk2.inquiry.internal.network;

import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;", "a", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;", "inquiry-internal_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class c {
    public static final ErrorRequest.a a(InternalErrorInfo internalErrorInfo) {
        s.k(internalErrorInfo, "<this>");
        if (internalErrorInfo instanceof InternalErrorInfo.NetworkErrorInfo) {
            return ErrorRequest.a.Network;
        }
        if (internalErrorInfo instanceof InternalErrorInfo.IntegrationErrorInfo) {
            return ErrorRequest.a.Other;
        }
        if (internalErrorInfo instanceof InternalErrorInfo.PermissionErrorInfo) {
            return ErrorRequest.a.Permissions;
        }
        if (internalErrorInfo instanceof InternalErrorInfo.CameraErrorInfo) {
            return ErrorRequest.a.Camera;
        }
        if (internalErrorInfo instanceof InternalErrorInfo.ConfigurationErrorInfo) {
            return ErrorRequest.a.Other;
        }
        if (internalErrorInfo instanceof InternalErrorInfo.NoDiskSpaceErrorInfo) {
            return ErrorRequest.a.Other;
        }
        if (internalErrorInfo instanceof InternalErrorInfo.WebRtcIntegrationErrorInfo) {
            return ErrorRequest.a.Other;
        }
        if (internalErrorInfo instanceof InternalErrorInfo.UnknownErrorInfo) {
            return ErrorRequest.a.Other;
        }
        if (internalErrorInfo instanceof InternalErrorInfo.InvalidOneTimeLinkCode) {
            return ErrorRequest.a.Other;
        }
        throw new NoWhenBranchMatchedException();
    }
}
