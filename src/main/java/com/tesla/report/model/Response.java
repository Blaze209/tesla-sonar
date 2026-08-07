package com.tesla.report.model;

import androidx.annotation.Keep;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u001c\b\u0001\u0010\u0002\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J3\u0010\u000f\u001a\u00020\u00002\u001c\b\u0003\u0010\u0002\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R%\u0010\u0002\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/tesla/report/model/Response;", "", "presignedInfoList", "", "", "", "origin", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getPresignedInfoList", "()Ljava/util/List;", "getOrigin", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "report_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Response {
    private final String origin;
    private final List<Map<String, String>> presignedInfoList;

    /* JADX WARN: Multi-variable type inference failed */
    public Response(@g(name = "files") List<? extends Map<String, String>> list, @g(name = "origin") String str) {
        this.presignedInfoList = list;
        this.origin = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Response copy$default(Response response, List list, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = response.presignedInfoList;
        }
        if ((i11 & 2) != 0) {
            str = response.origin;
        }
        return response.copy(list, str);
    }

    public final List<Map<String, String>> component1() {
        return this.presignedInfoList;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOrigin() {
        return this.origin;
    }

    public final Response copy(@g(name = "files") List<? extends Map<String, String>> presignedInfoList, @g(name = "origin") String origin) {
        return new Response(presignedInfoList, origin);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Response)) {
            return false;
        }
        Response response = (Response) other;
        return s.f(this.presignedInfoList, response.presignedInfoList) && s.f(this.origin, response.origin);
    }

    public final String getOrigin() {
        return this.origin;
    }

    public final List<Map<String, String>> getPresignedInfoList() {
        return this.presignedInfoList;
    }

    public int hashCode() {
        List<Map<String, String>> list = this.presignedInfoList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.origin;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "Response(presignedInfoList=" + this.presignedInfoList + ", origin=" + this.origin + ")";
    }
}
