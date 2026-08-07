package com.tesla.report.model;

import androidx.annotation.Keep;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/tesla/report/model/PresignedUrlResponse;", "", "response", "Lcom/tesla/report/model/Response;", "<init>", "(Lcom/tesla/report/model/Response;)V", "getResponse", "()Lcom/tesla/report/model/Response;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "report_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PresignedUrlResponse {
    private final Response response;

    public PresignedUrlResponse(@g(name = "response") Response response) {
        this.response = response;
    }

    public static /* synthetic */ PresignedUrlResponse copy$default(PresignedUrlResponse presignedUrlResponse, Response response, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            response = presignedUrlResponse.response;
        }
        return presignedUrlResponse.copy(response);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Response getResponse() {
        return this.response;
    }

    public final PresignedUrlResponse copy(@g(name = "response") Response response) {
        return new PresignedUrlResponse(response);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PresignedUrlResponse) && s.f(this.response, ((PresignedUrlResponse) other).response);
    }

    public final Response getResponse() {
        return this.response;
    }

    public int hashCode() {
        Response response = this.response;
        if (response == null) {
            return 0;
        }
        return response.hashCode();
    }

    public String toString() {
        return "PresignedUrlResponse(response=" + this.response + ")";
    }
}
