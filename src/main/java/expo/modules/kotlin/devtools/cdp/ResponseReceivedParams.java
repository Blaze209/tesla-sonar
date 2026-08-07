package expo.modules.kotlin.devtools.cdp;

import java.math.BigDecimal;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010B%\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u000f\u0010\u0014J\b\u0010 \u001a\u00020!H\u0016J\r\u0010\"\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\r\u0010$\u001a\u00060\u0007j\u0002`\bHÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003J\t\u0010&\u001a\u00020\fHÆ\u0003J\t\u0010'\u001a\u00020\u000eHÆ\u0003JM\u0010(\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00032\f\b\u0002\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010)\u001a\u00020\u000e2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0015\u0010\u0006\u001a\u00060\u0007j\u0002`\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006/"}, d2 = {"Lexpo/modules/kotlin/devtools/cdp/ResponseReceivedParams;", "Lexpo/modules/kotlin/devtools/cdp/JsonSerializable;", "requestId", "", "Lexpo/modules/kotlin/devtools/cdp/RequestId;", "loaderId", "timestamp", "Ljava/math/BigDecimal;", "Lexpo/modules/kotlin/devtools/cdp/MonotonicTime;", "type", "Lexpo/modules/kotlin/devtools/cdp/ResourceType;", "response", "Lexpo/modules/kotlin/devtools/cdp/Response;", "hasExtraInfo", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Lexpo/modules/kotlin/devtools/cdp/ResourceType;Lexpo/modules/kotlin/devtools/cdp/Response;Z)V", "now", "okhttpResponse", "Lokhttp3/Response;", "(Ljava/math/BigDecimal;Ljava/lang/String;Lokhttp3/Response;)V", "getRequestId", "()Ljava/lang/String;", "getLoaderId", "getTimestamp", "()Ljava/math/BigDecimal;", "getType", "()Lexpo/modules/kotlin/devtools/cdp/ResourceType;", "getResponse", "()Lexpo/modules/kotlin/devtools/cdp/Response;", "getHasExtraInfo", "()Z", "toJSONObject", "Lorg/json/JSONObject;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ResponseReceivedParams implements JsonSerializable {
    private final boolean hasExtraInfo;
    private final String loaderId;
    private final String requestId;
    private final Response response;
    private final BigDecimal timestamp;
    private final ResourceType type;

    public ResponseReceivedParams(String requestId, String loaderId, BigDecimal timestamp, ResourceType type, Response response, boolean z11) {
        s.k(requestId, "requestId");
        s.k(loaderId, "loaderId");
        s.k(timestamp, "timestamp");
        s.k(type, "type");
        s.k(response, "response");
        this.requestId = requestId;
        this.loaderId = loaderId;
        this.timestamp = timestamp;
        this.type = type;
        this.response = response;
        this.hasExtraInfo = z11;
    }

    public static /* synthetic */ ResponseReceivedParams copy$default(ResponseReceivedParams responseReceivedParams, String str, String str2, BigDecimal bigDecimal, ResourceType resourceType, Response response, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = responseReceivedParams.requestId;
        }
        if ((i11 & 2) != 0) {
            str2 = responseReceivedParams.loaderId;
        }
        if ((i11 & 4) != 0) {
            bigDecimal = responseReceivedParams.timestamp;
        }
        if ((i11 & 8) != 0) {
            resourceType = responseReceivedParams.type;
        }
        if ((i11 & 16) != 0) {
            response = responseReceivedParams.response;
        }
        if ((i11 & 32) != 0) {
            z11 = responseReceivedParams.hasExtraInfo;
        }
        Response response2 = response;
        boolean z12 = z11;
        return responseReceivedParams.copy(str, str2, bigDecimal, resourceType, response2, z12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLoaderId() {
        return this.loaderId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ResourceType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Response getResponse() {
        return this.response;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getHasExtraInfo() {
        return this.hasExtraInfo;
    }

    public final ResponseReceivedParams copy(String requestId, String loaderId, BigDecimal timestamp, ResourceType type, Response response, boolean hasExtraInfo) {
        s.k(requestId, "requestId");
        s.k(loaderId, "loaderId");
        s.k(timestamp, "timestamp");
        s.k(type, "type");
        s.k(response, "response");
        return new ResponseReceivedParams(requestId, loaderId, timestamp, type, response, hasExtraInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResponseReceivedParams)) {
            return false;
        }
        ResponseReceivedParams responseReceivedParams = (ResponseReceivedParams) other;
        return s.f(this.requestId, responseReceivedParams.requestId) && s.f(this.loaderId, responseReceivedParams.loaderId) && s.f(this.timestamp, responseReceivedParams.timestamp) && this.type == responseReceivedParams.type && s.f(this.response, responseReceivedParams.response) && this.hasExtraInfo == responseReceivedParams.hasExtraInfo;
    }

    public final boolean getHasExtraInfo() {
        return this.hasExtraInfo;
    }

    public final String getLoaderId() {
        return this.loaderId;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final Response getResponse() {
        return this.response;
    }

    public final BigDecimal getTimestamp() {
        return this.timestamp;
    }

    public final ResourceType getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((((this.requestId.hashCode() * 31) + this.loaderId.hashCode()) * 31) + this.timestamp.hashCode()) * 31) + this.type.hashCode()) * 31) + this.response.hashCode()) * 31) + Boolean.hashCode(this.hasExtraInfo);
    }

    @Override // expo.modules.kotlin.devtools.cdp.JsonSerializable
    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("requestId", this.requestId);
        jSONObject.put("loaderId", this.loaderId);
        jSONObject.put("timestamp", this.timestamp);
        jSONObject.put("type", this.type.getValue());
        jSONObject.put("response", this.response.toJSONObject());
        jSONObject.put("hasExtraInfo", this.hasExtraInfo);
        return jSONObject;
    }

    public String toString() {
        return "ResponseReceivedParams(requestId=" + this.requestId + ", loaderId=" + this.loaderId + ", timestamp=" + this.timestamp + ", type=" + this.type + ", response=" + this.response + ", hasExtraInfo=" + this.hasExtraInfo + ")";
    }

    public /* synthetic */ ResponseReceivedParams(String str, String str2, BigDecimal bigDecimal, ResourceType resourceType, Response response, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? "" : str2, bigDecimal, resourceType, response, (i11 & 32) != 0 ? false : z11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ResponseReceivedParams(BigDecimal now, String requestId, okhttp3.Response okhttpResponse) {
        s.k(now, "now");
        s.k(requestId, "requestId");
        s.k(okhttpResponse, "okhttpResponse");
        ResourceType.Companion companion = ResourceType.INSTANCE;
        String strHeader = okhttpResponse.header("Content-Type", "");
        this(requestId, null, now, companion.fromMimeType(strHeader != null ? strHeader : ""), new Response(okhttpResponse), false, 34, null);
    }
}
