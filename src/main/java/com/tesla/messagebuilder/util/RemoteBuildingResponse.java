package com.tesla.messagebuilder.util;

import androidx.annotation.Keep;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/tesla/messagebuilder/util/RemoteBuildingResponse;", "", AnalyticsAttribute.Error, "", "errorDescription", "response", "Lcom/tesla/messagebuilder/util/Response;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/tesla/messagebuilder/util/Response;)V", "getError", "()Ljava/lang/String;", "getErrorDescription", "getResponse", "()Lcom/tesla/messagebuilder/util/Response;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "message-builder_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RemoteBuildingResponse {
    private final String error;
    private final String errorDescription;
    private final Response response;

    public RemoteBuildingResponse(@g(name = AnalyticsAttribute.Error) String str, @g(name = "error_description") String str2, @g(name = "response") Response response) {
        this.error = str;
        this.errorDescription = str2;
        this.response = response;
    }

    public static /* synthetic */ RemoteBuildingResponse copy$default(RemoteBuildingResponse remoteBuildingResponse, String str, String str2, Response response, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = remoteBuildingResponse.error;
        }
        if ((i11 & 2) != 0) {
            str2 = remoteBuildingResponse.errorDescription;
        }
        if ((i11 & 4) != 0) {
            response = remoteBuildingResponse.response;
        }
        return remoteBuildingResponse.copy(str, str2, response);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getErrorDescription() {
        return this.errorDescription;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Response getResponse() {
        return this.response;
    }

    public final RemoteBuildingResponse copy(@g(name = AnalyticsAttribute.Error) String error, @g(name = "error_description") String errorDescription, @g(name = "response") Response response) {
        return new RemoteBuildingResponse(error, errorDescription, response);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoteBuildingResponse)) {
            return false;
        }
        RemoteBuildingResponse remoteBuildingResponse = (RemoteBuildingResponse) other;
        return s.f(this.error, remoteBuildingResponse.error) && s.f(this.errorDescription, remoteBuildingResponse.errorDescription) && s.f(this.response, remoteBuildingResponse.response);
    }

    public final String getError() {
        return this.error;
    }

    public final String getErrorDescription() {
        return this.errorDescription;
    }

    public final Response getResponse() {
        return this.response;
    }

    public int hashCode() {
        String str = this.error;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.errorDescription;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Response response = this.response;
        return iHashCode2 + (response != null ? response.hashCode() : 0);
    }

    public String toString() {
        return "RemoteBuildingResponse(error=" + this.error + ", errorDescription=" + this.errorDescription + ", response=" + this.response + ")";
    }
}
