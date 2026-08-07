package expo.modules.kotlin.devtools.cdp;

import com.google.android.gms.common.internal.ImagesContract;
import expo.modules.interfaces.permissions.PermissionsResponse;
import expo.modules.kotlin.devtools.OkHttpExtensionsKt;
import java.util.Map;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\bj\u0002`\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\r\u0010\u0011J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u0019\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\bj\u0002`\tHÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\fHÆ\u0003JU\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\bj\u0002`\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020\u0005HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R!\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\bj\u0002`\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006+"}, d2 = {"Lexpo/modules/kotlin/devtools/cdp/Response;", "Lexpo/modules/kotlin/devtools/cdp/JsonSerializable;", ImagesContract.URL, "", PermissionsResponse.STATUS_KEY, "", "statusText", "headers", "", "Lexpo/modules/kotlin/devtools/cdp/Headers;", "mimeType", "encodedDataLength", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;Ljava/lang/String;J)V", "response", "Lokhttp3/Response;", "(Lokhttp3/Response;)V", "getUrl", "()Ljava/lang/String;", "getStatus", "()I", "getStatusText", "getHeaders", "()Ljava/util/Map;", "getMimeType", "getEncodedDataLength", "()J", "toJSONObject", "Lorg/json/JSONObject;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Response implements JsonSerializable {
    private final long encodedDataLength;
    private final Map<String, String> headers;
    private final String mimeType;
    private final int status;
    private final String statusText;
    private final String url;

    public Response(String url, int i11, String statusText, Map<String, String> headers, String mimeType, long j11) {
        s.k(url, "url");
        s.k(statusText, "statusText");
        s.k(headers, "headers");
        s.k(mimeType, "mimeType");
        this.url = url;
        this.status = i11;
        this.statusText = statusText;
        this.headers = headers;
        this.mimeType = mimeType;
        this.encodedDataLength = j11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Response copy$default(Response response, String str, int i11, String str2, Map map, String str3, long j11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = response.url;
        }
        if ((i12 & 2) != 0) {
            i11 = response.status;
        }
        if ((i12 & 4) != 0) {
            str2 = response.statusText;
        }
        if ((i12 & 8) != 0) {
            map = response.headers;
        }
        if ((i12 & 16) != 0) {
            str3 = response.mimeType;
        }
        if ((i12 & 32) != 0) {
            j11 = response.encodedDataLength;
        }
        long j12 = j11;
        String str4 = str3;
        String str5 = str2;
        return response.copy(str, i11, str5, map, str4, j12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatusText() {
        return this.statusText;
    }

    public final Map<String, String> component4() {
        return this.headers;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getEncodedDataLength() {
        return this.encodedDataLength;
    }

    public final Response copy(String url, int status, String statusText, Map<String, String> headers, String mimeType, long encodedDataLength) {
        s.k(url, "url");
        s.k(statusText, "statusText");
        s.k(headers, "headers");
        s.k(mimeType, "mimeType");
        return new Response(url, status, statusText, headers, mimeType, encodedDataLength);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Response)) {
            return false;
        }
        Response response = (Response) other;
        return s.f(this.url, response.url) && this.status == response.status && s.f(this.statusText, response.statusText) && s.f(this.headers, response.headers) && s.f(this.mimeType, response.mimeType) && this.encodedDataLength == response.encodedDataLength;
    }

    public final long getEncodedDataLength() {
        return this.encodedDataLength;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getStatusText() {
        return this.statusText;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((((((((this.url.hashCode() * 31) + Integer.hashCode(this.status)) * 31) + this.statusText.hashCode()) * 31) + this.headers.hashCode()) * 31) + this.mimeType.hashCode()) * 31) + Long.hashCode(this.encodedDataLength);
    }

    @Override // expo.modules.kotlin.devtools.cdp.JsonSerializable
    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ImagesContract.URL, this.url);
        jSONObject.put(PermissionsResponse.STATUS_KEY, this.status);
        jSONObject.put("statusText", this.statusText);
        jSONObject.put("headers", new JSONObject(this.headers));
        jSONObject.put("mimeType", this.mimeType);
        jSONObject.put("encodedDataLength", this.encodedDataLength);
        return jSONObject;
    }

    public String toString() {
        return "Response(url=" + this.url + ", status=" + this.status + ", statusText=" + this.statusText + ", headers=" + this.headers + ", mimeType=" + this.mimeType + ", encodedDataLength=" + this.encodedDataLength + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Response(okhttp3.Response response) {
        s.k(response, "response");
        String url = response.request().url().getUrl();
        int iCode = response.code();
        String strMessage = response.message();
        Map<String, String> singleMap = OkHttpExtensionsKt.toSingleMap(response.headers());
        String strHeader = response.header("Content-Type", "");
        String str = strHeader == null ? "" : strHeader;
        ResponseBody responseBodyBody = response.body();
        this(url, iCode, strMessage, singleMap, str, responseBodyBody != null ? responseBodyBody.getContentLength() : 0L);
    }
}
