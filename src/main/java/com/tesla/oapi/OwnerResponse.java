package com.tesla.oapi;

import android.net.Uri;
import com.tesla.logging.g;
import fc0.u5;
import ie0.r;
import java.util.Locale;
import jn0.h0;
import jn0.m;
import ke0.h;
import ke0.i;
import okhttp3.Headers;
import okhttp3.ResponseBody;
import okio.k;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import retrofit2.y;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 @2\u00020\u0001:\u0001@BC\b\u0002\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e*\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u0016H\u0002¢\u0006\u0004\b\u000f\u0010\u0017R\u001c\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u0017\u0010\u001a\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR$\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010!R(\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010\u001e\u001a\u0004\u0018\u00010\"8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R(\u0010'\u001a\u0004\u0018\u00010\u00162\b\u0010\u001e\u001a\u0004\u0018\u00010\u00168\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R(\u0010+\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R(\u00100\u001a\u0004\u0018\u00010/2\b\u0010\u001e\u001a\u0004\u0018\u00010/8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R(\u00104\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b4\u0010,\u001a\u0004\b5\u0010.R\u001b\u00109\u001a\u0002068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0011\u0010>\u001a\u00020;8F¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0011\u0010?\u001a\u0002068F¢\u0006\u0006\u001a\u0004\b?\u0010:¨\u0006A"}, d2 = {"Lcom/tesla/oapi/OwnerResponse;", "", "Lretrofit2/y;", "Lokhttp3/ResponseBody;", "responseBody", "Lcom/tesla/oapi/OwnerApiStatusCode;", "_statusCode", "", "requestStartDate", "requestEndDate", "Landroid/net/Uri;", "uri", "<init>", "(Lretrofit2/y;Lcom/tesla/oapi/OwnerApiStatusCode;JJLandroid/net/Uri;)V", "Lorg/json/JSONObject;", "toJsonObject", "(Lokhttp3/ResponseBody;)Lorg/json/JSONObject;", "body", "Ljn0/h0;", "parseResponseBody", "(Lorg/json/JSONObject;)V", "parseErrorBody", "", "(Ljava/lang/String;)Lorg/json/JSONObject;", "Lretrofit2/y;", "J", "statusCode", "Lcom/tesla/oapi/OwnerApiStatusCode;", "getStatusCode", "()Lcom/tesla/oapi/OwnerApiStatusCode;", "value", "size", "getSize", "()J", "Lcom/tesla/oapi/OwnerAPIError;", "error", "Lcom/tesla/oapi/OwnerAPIError;", "getError", "()Lcom/tesla/oapi/OwnerAPIError;", "errorDescription", "Ljava/lang/String;", "getErrorDescription", "()Ljava/lang/String;", "response", "Lorg/json/JSONObject;", "getResponse", "()Lorg/json/JSONObject;", "Lokhttp3/Headers;", "headers", "Lokhttp3/Headers;", "getHeaders", "()Lokhttp3/Headers;", "errorResponseBody", "getErrorResponseBody", "", "isCached$delegate", "Lkotlin/Lazy;", "isCached", "()Z", "", "getCode", "()I", "code", "isSuccessful", "Companion", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OwnerResponse {
    private static final String ERROR_MESSAGE_IN_SERVICE = "vehicle is currently in service";
    private static final String ERROR_MESSAGE_TIMEOUT = "timeout in request";
    private static final String ERROR_MESSAGE_UNREACHABLE = "unable to connect to";
    private static final String KEY_ERROR = "error";
    private static final String KEY_ERROR_DESCRIPTION = "error_description";
    private static final String KEY_REQUEST_END_DATE = "Tesla-App-Request-End-Date";
    private static final String KEY_REQUEST_START_DATE = "Tesla-App-Request-Start-Date";
    private static final String SEGMENT_PRODUCT_LIST = "PRODUCTS";
    private static final String SEGMENT_VEHICLE_DATA = "VEHICLE_DATA";
    private OwnerAPIError error;
    private String errorDescription;
    private JSONObject errorResponseBody;
    private Headers headers;

    /* JADX INFO: renamed from: isCached$delegate, reason: from kotlin metadata */
    private final Lazy isCached;
    private final long requestEndDate;
    private final long requestStartDate;
    private JSONObject response;
    private final y<ResponseBody> responseBody;
    private long size;
    private final OwnerApiStatusCode statusCode;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "OwnerResponse";
    private static final g logger = g.INSTANCE.a(TAG);

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fJ5\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\b\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015R\u0014\u0010\u001b\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0015R\u0014\u0010\u001d\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0015R\u0014\u0010\u001e\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0015R\u0014\u0010\u001f\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0015R\u0014\u0010 \u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u0015R\u0014\u0010!\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u0015¨\u0006\""}, d2 = {"Lcom/tesla/oapi/OwnerResponse$Companion;", "", "<init>", "()V", "Lretrofit2/y;", "Lokhttp3/ResponseBody;", "body", "Lcom/tesla/oapi/OwnerResponse;", "newInstance", "(Lretrofit2/y;)Lcom/tesla/oapi/OwnerResponse;", "Lcom/tesla/oapi/OwnerApiStatusCode;", "statusCode", "(Lcom/tesla/oapi/OwnerApiStatusCode;)Lcom/tesla/oapi/OwnerResponse;", "", "requestStartDateMillis", "requestEndDateMillis", "Landroid/net/Uri;", "uri", "(Lretrofit2/y;JJLandroid/net/Uri;)Lcom/tesla/oapi/OwnerResponse;", "", "TAG", "Ljava/lang/String;", "Lcom/tesla/logging/g;", "logger", "Lcom/tesla/logging/g;", "KEY_ERROR", "KEY_ERROR_DESCRIPTION", "ERROR_MESSAGE_TIMEOUT", "ERROR_MESSAGE_UNREACHABLE", "ERROR_MESSAGE_IN_SERVICE", "KEY_REQUEST_START_DATE", "KEY_REQUEST_END_DATE", "SEGMENT_VEHICLE_DATA", "SEGMENT_PRODUCT_LIST", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ OwnerResponse newInstance$default(Companion companion, y yVar, long j11, long j12, Uri uri, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                j12 = System.currentTimeMillis();
            }
            return companion.newInstance(yVar, j11, j12, uri);
        }

        public final OwnerResponse newInstance(y<ResponseBody> body) {
            s.k(body, "body");
            return new OwnerResponse(body, null, 0L, 0L, null, 28, null);
        }

        private Companion() {
        }

        public final OwnerResponse newInstance(OwnerApiStatusCode statusCode) {
            s.k(statusCode, "statusCode");
            return new OwnerResponse(null, statusCode, 0L, 0L, null, 28, null);
        }

        public final OwnerResponse newInstance(y<ResponseBody> body, long requestStartDateMillis, long requestEndDateMillis, Uri uri) {
            s.k(body, "body");
            s.k(uri, "uri");
            return new OwnerResponse(body, null, requestStartDateMillis, requestEndDateMillis, uri, null);
        }
    }

    public /* synthetic */ OwnerResponse(y yVar, OwnerApiStatusCode ownerApiStatusCode, long j11, long j12, Uri uri, DefaultConstructorMarker defaultConstructorMarker) {
        this(yVar, ownerApiStatusCode, j11, j12, uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isCached_delegate$lambda$2(OwnerResponse ownerResponse) {
        String str;
        String str2;
        Boolean boolIsCached_delegate$lambda$2$isHit;
        Headers headers = ownerResponse.headers;
        if (headers != null && (str2 = headers.get("x-cache")) != null && (boolIsCached_delegate$lambda$2$isHit = isCached_delegate$lambda$2$isHit(str2)) != null) {
            return boolIsCached_delegate$lambda$2$isHit.booleanValue();
        }
        Headers headers2 = ownerResponse.headers;
        Boolean boolIsCached_delegate$lambda$2$isHit2 = (headers2 == null || (str = headers2.get("X-Cache")) == null) ? null : isCached_delegate$lambda$2$isHit(str);
        if (boolIsCached_delegate$lambda$2$isHit2 != null) {
            return boolIsCached_delegate$lambda$2$isHit2.booleanValue();
        }
        return false;
    }

    private static final Boolean isCached_delegate$lambda$2$isHit(String str) {
        if (str == null) {
            return null;
        }
        Locale US = Locale.US;
        s.j(US, "US");
        String upperCase = str.toUpperCase(US);
        s.j(upperCase, "toUpperCase(...)");
        if (upperCase != null) {
            return Boolean.valueOf(s.f(upperCase, "HIT"));
        }
        return null;
    }

    private final void parseErrorBody(JSONObject body) throws JSONException {
        if (body.has("error")) {
            String string = body.getString("error");
            s.j(string, "getString(...)");
            Locale locale = Locale.getDefault();
            s.j(locale, "getDefault(...)");
            String lowerCase = string.toLowerCase(locale);
            s.j(lowerCase, "toLowerCase(...)");
            if (body.has(KEY_ERROR_DESCRIPTION)) {
                String string2 = body.getString(KEY_ERROR_DESCRIPTION);
                this.errorDescription = string2;
                if (string2 != null && t.y0(string2)) {
                    this.errorDescription = body.getString("error");
                }
            }
            if (t.h0(lowerCase, ERROR_MESSAGE_TIMEOUT, false, 2, null) || t.h0(lowerCase, ERROR_MESSAGE_UNREACHABLE, false, 2, null)) {
                this.error = OwnerAPIError.OWNERAPI_ERROR_TIMEOUT;
            } else if (t.h0(lowerCase, ERROR_MESSAGE_IN_SERVICE, false, 2, null)) {
                this.error = OwnerAPIError.OWNERAPI_ERROR_SERVICE_MAINTENANCE;
            }
        }
    }

    private final void parseResponseBody(JSONObject body) throws JSONException {
        if (body.has("error")) {
            parseErrorBody(body);
        }
        this.response = body;
    }

    private final JSONObject toJsonObject(ResponseBody responseBody) {
        String strString;
        JSONObject jsonObject;
        return (responseBody == null || (strString = responseBody.string()) == null || (jsonObject = toJsonObject(strString)) == null) ? new JSONObject() : jsonObject;
    }

    public final int getCode() {
        y<ResponseBody> yVar = this.responseBody;
        return yVar != null ? yVar.b() : this.statusCode.getCode();
    }

    public final OwnerAPIError getError() {
        return this.error;
    }

    public final String getErrorDescription() {
        return this.errorDescription;
    }

    public final JSONObject getErrorResponseBody() {
        return this.errorResponseBody;
    }

    public final Headers getHeaders() {
        return this.headers;
    }

    public final JSONObject getResponse() {
        return this.response;
    }

    public final long getSize() {
        return this.size;
    }

    public final OwnerApiStatusCode getStatusCode() {
        return this.statusCode;
    }

    public final boolean isCached() {
        return ((Boolean) this.isCached.getValue()).booleanValue();
    }

    public final boolean isSuccessful() {
        return OwnerApiStatusCode.INSTANCE.fromCode(getCode()).isSuccess();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01f2 A[Catch: JSONException -> 0x01fd, TryCatch #2 {JSONException -> 0x01fd, blocks: (B:96:0x01e5, B:98:0x01eb, B:100:0x01f2, B:102:0x01fa, B:144:0x02bf, B:108:0x0207, B:110:0x020d, B:115:0x021e, B:117:0x023c, B:119:0x0245, B:121:0x024d, B:131:0x0266, B:135:0x0293, B:137:0x029b, B:139:0x02a1, B:141:0x02a7, B:143:0x02ad, B:111:0x0212, B:113:0x0218, B:145:0x02c5), top: B:157:0x01e5 }] */
    /* JADX WARN: Code duplicated, block: B:102:0x01fa A[Catch: JSONException -> 0x01fd, TryCatch #2 {JSONException -> 0x01fd, blocks: (B:96:0x01e5, B:98:0x01eb, B:100:0x01f2, B:102:0x01fa, B:144:0x02bf, B:108:0x0207, B:110:0x020d, B:115:0x021e, B:117:0x023c, B:119:0x0245, B:121:0x024d, B:131:0x0266, B:135:0x0293, B:137:0x029b, B:139:0x02a1, B:141:0x02a7, B:143:0x02ad, B:111:0x0212, B:113:0x0218, B:145:0x02c5), top: B:157:0x01e5 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x0200  */
    /* JADX WARN: Code duplicated, block: B:107:0x0203  */
    /* JADX WARN: Code duplicated, block: B:108:0x0207 A[Catch: JSONException -> 0x01fd, TryCatch #2 {JSONException -> 0x01fd, blocks: (B:96:0x01e5, B:98:0x01eb, B:100:0x01f2, B:102:0x01fa, B:144:0x02bf, B:108:0x0207, B:110:0x020d, B:115:0x021e, B:117:0x023c, B:119:0x0245, B:121:0x024d, B:131:0x0266, B:135:0x0293, B:137:0x029b, B:139:0x02a1, B:141:0x02a7, B:143:0x02ad, B:111:0x0212, B:113:0x0218, B:145:0x02c5), top: B:157:0x01e5 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x020d A[Catch: JSONException -> 0x01fd, TryCatch #2 {JSONException -> 0x01fd, blocks: (B:96:0x01e5, B:98:0x01eb, B:100:0x01f2, B:102:0x01fa, B:144:0x02bf, B:108:0x0207, B:110:0x020d, B:115:0x021e, B:117:0x023c, B:119:0x0245, B:121:0x024d, B:131:0x0266, B:135:0x0293, B:137:0x029b, B:139:0x02a1, B:141:0x02a7, B:143:0x02ad, B:111:0x0212, B:113:0x0218, B:145:0x02c5), top: B:157:0x01e5 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x0212 A[Catch: JSONException -> 0x01fd, TryCatch #2 {JSONException -> 0x01fd, blocks: (B:96:0x01e5, B:98:0x01eb, B:100:0x01f2, B:102:0x01fa, B:144:0x02bf, B:108:0x0207, B:110:0x020d, B:115:0x021e, B:117:0x023c, B:119:0x0245, B:121:0x024d, B:131:0x0266, B:135:0x0293, B:137:0x029b, B:139:0x02a1, B:141:0x02a7, B:143:0x02ad, B:111:0x0212, B:113:0x0218, B:145:0x02c5), top: B:157:0x01e5 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x0218 A[Catch: JSONException -> 0x01fd, TryCatch #2 {JSONException -> 0x01fd, blocks: (B:96:0x01e5, B:98:0x01eb, B:100:0x01f2, B:102:0x01fa, B:144:0x02bf, B:108:0x0207, B:110:0x020d, B:115:0x021e, B:117:0x023c, B:119:0x0245, B:121:0x024d, B:131:0x0266, B:135:0x0293, B:137:0x029b, B:139:0x02a1, B:141:0x02a7, B:143:0x02ad, B:111:0x0212, B:113:0x0218, B:145:0x02c5), top: B:157:0x01e5 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x021d  */
    /* JADX WARN: Code duplicated, block: B:117:0x023c A[Catch: JSONException -> 0x01fd, TryCatch #2 {JSONException -> 0x01fd, blocks: (B:96:0x01e5, B:98:0x01eb, B:100:0x01f2, B:102:0x01fa, B:144:0x02bf, B:108:0x0207, B:110:0x020d, B:115:0x021e, B:117:0x023c, B:119:0x0245, B:121:0x024d, B:131:0x0266, B:135:0x0293, B:137:0x029b, B:139:0x02a1, B:141:0x02a7, B:143:0x02ad, B:111:0x0212, B:113:0x0218, B:145:0x02c5), top: B:157:0x01e5 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x0245 A[Catch: JSONException -> 0x01fd, TryCatch #2 {JSONException -> 0x01fd, blocks: (B:96:0x01e5, B:98:0x01eb, B:100:0x01f2, B:102:0x01fa, B:144:0x02bf, B:108:0x0207, B:110:0x020d, B:115:0x021e, B:117:0x023c, B:119:0x0245, B:121:0x024d, B:131:0x0266, B:135:0x0293, B:137:0x029b, B:139:0x02a1, B:141:0x02a7, B:143:0x02ad, B:111:0x0212, B:113:0x0218, B:145:0x02c5), top: B:157:0x01e5 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x024d A[Catch: JSONException -> 0x01fd, TryCatch #2 {JSONException -> 0x01fd, blocks: (B:96:0x01e5, B:98:0x01eb, B:100:0x01f2, B:102:0x01fa, B:144:0x02bf, B:108:0x0207, B:110:0x020d, B:115:0x021e, B:117:0x023c, B:119:0x0245, B:121:0x024d, B:131:0x0266, B:135:0x0293, B:137:0x029b, B:139:0x02a1, B:141:0x02a7, B:143:0x02ad, B:111:0x0212, B:113:0x0218, B:145:0x02c5), top: B:157:0x01e5 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x0253  */
    /* JADX WARN: Code duplicated, block: B:125:0x0258  */
    /* JADX WARN: Code duplicated, block: B:127:0x025c  */
    /* JADX WARN: Code duplicated, block: B:129:0x0260  */
    /* JADX WARN: Code duplicated, block: B:131:0x0266 A[Catch: JSONException -> 0x01fd, TryCatch #2 {JSONException -> 0x01fd, blocks: (B:96:0x01e5, B:98:0x01eb, B:100:0x01f2, B:102:0x01fa, B:144:0x02bf, B:108:0x0207, B:110:0x020d, B:115:0x021e, B:117:0x023c, B:119:0x0245, B:121:0x024d, B:131:0x0266, B:135:0x0293, B:137:0x029b, B:139:0x02a1, B:141:0x02a7, B:143:0x02ad, B:111:0x0212, B:113:0x0218, B:145:0x02c5), top: B:157:0x01e5 }] */
    /* JADX WARN: Code duplicated, block: B:132:0x028e  */
    /* JADX WARN: Code duplicated, block: B:135:0x0293 A[Catch: JSONException -> 0x01fd, TryCatch #2 {JSONException -> 0x01fd, blocks: (B:96:0x01e5, B:98:0x01eb, B:100:0x01f2, B:102:0x01fa, B:144:0x02bf, B:108:0x0207, B:110:0x020d, B:115:0x021e, B:117:0x023c, B:119:0x0245, B:121:0x024d, B:131:0x0266, B:135:0x0293, B:137:0x029b, B:139:0x02a1, B:141:0x02a7, B:143:0x02ad, B:111:0x0212, B:113:0x0218, B:145:0x02c5), top: B:157:0x01e5 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x029b A[Catch: JSONException -> 0x01fd, TryCatch #2 {JSONException -> 0x01fd, blocks: (B:96:0x01e5, B:98:0x01eb, B:100:0x01f2, B:102:0x01fa, B:144:0x02bf, B:108:0x0207, B:110:0x020d, B:115:0x021e, B:117:0x023c, B:119:0x0245, B:121:0x024d, B:131:0x0266, B:135:0x0293, B:137:0x029b, B:139:0x02a1, B:141:0x02a7, B:143:0x02ad, B:111:0x0212, B:113:0x0218, B:145:0x02c5), top: B:157:0x01e5 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:159:0x010c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x02bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:51:0x0108  */
    /* JADX WARN: Code duplicated, block: B:55:0x0112 A[Catch: JSONException -> 0x014d, TryCatch #3 {JSONException -> 0x014d, blocks: (B:53:0x010c, B:55:0x0112, B:57:0x011f, B:59:0x012e, B:61:0x0136, B:63:0x0146, B:69:0x0155, B:71:0x0162, B:73:0x016a, B:75:0x0170, B:79:0x018f, B:81:0x0197, B:83:0x019d, B:85:0x01a3, B:87:0x01a9, B:88:0x01c2, B:89:0x01c6, B:90:0x01cd), top: B:159:0x010c }] */
    /* JADX WARN: Code duplicated, block: B:57:0x011f A[Catch: JSONException -> 0x014d, TryCatch #3 {JSONException -> 0x014d, blocks: (B:53:0x010c, B:55:0x0112, B:57:0x011f, B:59:0x012e, B:61:0x0136, B:63:0x0146, B:69:0x0155, B:71:0x0162, B:73:0x016a, B:75:0x0170, B:79:0x018f, B:81:0x0197, B:83:0x019d, B:85:0x01a3, B:87:0x01a9, B:88:0x01c2, B:89:0x01c6, B:90:0x01cd), top: B:159:0x010c }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0152  */
    /* JADX WARN: Code duplicated, block: B:69:0x0155 A[Catch: JSONException -> 0x014d, TryCatch #3 {JSONException -> 0x014d, blocks: (B:53:0x010c, B:55:0x0112, B:57:0x011f, B:59:0x012e, B:61:0x0136, B:63:0x0146, B:69:0x0155, B:71:0x0162, B:73:0x016a, B:75:0x0170, B:79:0x018f, B:81:0x0197, B:83:0x019d, B:85:0x01a3, B:87:0x01a9, B:88:0x01c2, B:89:0x01c6, B:90:0x01cd), top: B:159:0x010c }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0170 A[Catch: JSONException -> 0x014d, TryCatch #3 {JSONException -> 0x014d, blocks: (B:53:0x010c, B:55:0x0112, B:57:0x011f, B:59:0x012e, B:61:0x0136, B:63:0x0146, B:69:0x0155, B:71:0x0162, B:73:0x016a, B:75:0x0170, B:79:0x018f, B:81:0x0197, B:83:0x019d, B:85:0x01a3, B:87:0x01a9, B:88:0x01c2, B:89:0x01c6, B:90:0x01cd), top: B:159:0x010c }] */
    /* JADX WARN: Code duplicated, block: B:76:0x018b  */
    /* JADX WARN: Code duplicated, block: B:79:0x018f A[Catch: JSONException -> 0x014d, TryCatch #3 {JSONException -> 0x014d, blocks: (B:53:0x010c, B:55:0x0112, B:57:0x011f, B:59:0x012e, B:61:0x0136, B:63:0x0146, B:69:0x0155, B:71:0x0162, B:73:0x016a, B:75:0x0170, B:79:0x018f, B:81:0x0197, B:83:0x019d, B:85:0x01a3, B:87:0x01a9, B:88:0x01c2, B:89:0x01c6, B:90:0x01cd), top: B:159:0x010c }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c6 A[Catch: JSONException -> 0x014d, TryCatch #3 {JSONException -> 0x014d, blocks: (B:53:0x010c, B:55:0x0112, B:57:0x011f, B:59:0x012e, B:61:0x0136, B:63:0x0146, B:69:0x0155, B:71:0x0162, B:73:0x016a, B:75:0x0170, B:79:0x018f, B:81:0x0197, B:83:0x019d, B:85:0x01a3, B:87:0x01a9, B:88:0x01c2, B:89:0x01c6, B:90:0x01cd), top: B:159:0x010c }] */
    /* JADX WARN: Code duplicated, block: B:92:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:98:0x01eb A[Catch: JSONException -> 0x01fd, TryCatch #2 {JSONException -> 0x01fd, blocks: (B:96:0x01e5, B:98:0x01eb, B:100:0x01f2, B:102:0x01fa, B:144:0x02bf, B:108:0x0207, B:110:0x020d, B:115:0x021e, B:117:0x023c, B:119:0x0245, B:121:0x024d, B:131:0x0266, B:135:0x0293, B:137:0x029b, B:139:0x02a1, B:141:0x02a7, B:143:0x02ad, B:111:0x0212, B:113:0x0218, B:145:0x02c5), top: B:157:0x01e5 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:131:0x0266, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:75:0x0170, please report this as an issue */
    private OwnerResponse(y<ResponseBody> yVar, OwnerApiStatusCode ownerApiStatusCode, long j11, long j12, Uri uri) throws JSONException {
        OwnerApiStatusCode ownerApiStatusCodeFromCode;
        JSONObject jSONObject;
        String lastPathSegment;
        String upperCase;
        JSONObject jSONObject2;
        JSONArray jSONArrayOptJSONArray;
        int length;
        int i11;
        Object obj;
        JSONObject jSONObject3;
        String string;
        g gVar;
        String strOptString;
        i iVar;
        JSONArray jSONArray;
        boolean z11;
        u5 u5VarA;
        String strA;
        u5 u5VarG;
        k kVarEncodeByteString;
        String strA2;
        boolean z12;
        boolean z13;
        JSONObject jSONObject4;
        JSONObject jSONObject5;
        JSONObject jSONObjectOptJSONObject;
        String string2;
        String strOptString2;
        boolean z14;
        u5 u5VarA2;
        String strA3;
        u5 u5VarG2;
        k kVarEncodeByteString2;
        String strOptString3;
        String strA4;
        boolean z15;
        String strA5;
        String str;
        JSONObject jSONObject6;
        this.responseBody = yVar;
        this.requestStartDate = j11;
        this.requestEndDate = j12;
        if (ownerApiStatusCode == null) {
            ownerApiStatusCodeFromCode = yVar != null ? OwnerApiStatusCode.INSTANCE.fromCode(yVar.b()) : null;
            if (ownerApiStatusCodeFromCode == null) {
                ownerApiStatusCodeFromCode = OwnerApiStatusCode.UNKNOWN;
            }
        } else {
            ownerApiStatusCodeFromCode = ownerApiStatusCode;
        }
        this.statusCode = ownerApiStatusCodeFromCode;
        long contentLength = -1;
        this.size = -1L;
        this.isCached = m.b(new wn0.a() { // from class: com.tesla.oapi.c
            @Override // wn0.a
            public final Object invoke() {
                return Boolean.valueOf(OwnerResponse.isCached_delegate$lambda$2(this.f56498a));
            }
        });
        if (yVar != null) {
            ResponseBody responseBodyA = yVar.a();
            ResponseBody responseBodyE = yVar.e();
            try {
                if (responseBodyA != null) {
                    try {
                        contentLength = responseBodyA.getContentLength();
                    } catch (JSONException e11) {
                        logger.f("Error parsing owner response", e11);
                        h0 h0Var = h0.f84049a;
                        if (responseBodyA != null) {
                            responseBodyA.close();
                        }
                        if (responseBodyE != null) {
                        }
                        if (uri != null) {
                            jSONObject = new JSONObject();
                            lastPathSegment = uri.getLastPathSegment();
                            if (lastPathSegment != null) {
                                Locale US = Locale.US;
                                s.j(US, "US");
                                upperCase = lastPathSegment.toUpperCase(US);
                                s.j(upperCase, "toUpperCase(...)");
                                upperCase = upperCase == null ? "UNKNOWN" : upperCase;
                            }
                            if (s.f(upperCase, SEGMENT_VEHICLE_DATA)) {
                                jSONObject5 = this.response;
                                if (jSONObject5 != null) {
                                    try {
                                        jSONObjectOptJSONObject = jSONObject5.optJSONObject("response");
                                        if (jSONObjectOptJSONObject != null) {
                                            string2 = jSONObjectOptJSONObject.getString("vin");
                                            s.h(string2);
                                            if (string2.length() != 0) {
                                                throw new Error("VIN missing from vehicle data response");
                                            }
                                            i iVar2 = i.VEHICLE_DATA_FETCH;
                                            strOptString2 = jSONObjectOptJSONObject.optString("vehicle_data");
                                            s.h(strOptString2);
                                            if (t.y0(strOptString2)) {
                                                z14 = false;
                                            } else {
                                                z14 = false;
                                            }
                                            if (!z14) {
                                                strOptString3 = jSONObjectOptJSONObject.optString("cached_data");
                                                s.h(strOptString3);
                                                if (!t.y0(strOptString3)) {
                                                    if (strA4.length() > 0) {
                                                        logger.j("Used cached_data proto");
                                                        jSONObject.put(string2 + "_cd", strA4);
                                                        z15 = true;
                                                    } else {
                                                        z15 = z14;
                                                    }
                                                    z14 = z15;
                                                }
                                            }
                                            if (!z14) {
                                                u5VarA2 = yc0.i.f125368a.a(jSONObjectOptJSONObject);
                                                if (u5VarA2 != null) {
                                                    strA3 = null;
                                                } else {
                                                    strA3 = null;
                                                }
                                                logger.j("Used JSON converted proto");
                                                jSONObject.put(string2 + "_json", strA3);
                                            }
                                            h0 h0Var2 = h0.f84049a;
                                        }
                                    } catch (JSONException e12) {
                                        logger.f("Error parsing vehicle data response", e12);
                                        h0 h0Var3 = h0.f84049a;
                                    }
                                }
                            } else if (s.f(upperCase, SEGMENT_PRODUCT_LIST)) {
                                try {
                                    jSONArrayOptJSONArray = jSONObject2.optJSONArray("response");
                                    if (jSONArrayOptJSONArray != null) {
                                        length = jSONArrayOptJSONArray.length();
                                        i11 = 0;
                                        while (i11 < length) {
                                            obj = jSONArrayOptJSONArray.get(i11);
                                            if (obj instanceof JSONObject) {
                                                jSONObject3 = (JSONObject) obj;
                                            } else {
                                                jSONObject3 = null;
                                            }
                                            if (jSONObject3 != null) {
                                                if (jSONObject3.has("referenceNumber")) {
                                                    string = jSONObject3.getString("referenceNumber");
                                                } else if (jSONObject3.has("vin")) {
                                                    string = jSONObject3.getString("vin");
                                                } else {
                                                    string = null;
                                                }
                                                gVar = logger;
                                                gVar.j("[PRODUCT LIST] identifier: " + string);
                                                strOptString = jSONObject3.optString("cached_data");
                                                iVar = i.PRODUCT_LIST_FETCH;
                                                if (string != null) {
                                                    s.h(strOptString);
                                                    if (t.y0(strOptString)) {
                                                        jSONArray = jSONArrayOptJSONArray;
                                                    } else {
                                                        strA2 = ke0.f.f85990a.a(string, strOptString, iVar);
                                                        if (strA2 != null) {
                                                            if (strA2.length() > 0) {
                                                                z13 = true;
                                                            } else {
                                                                z13 = false;
                                                            }
                                                            jSONArray = jSONArrayOptJSONArray;
                                                            z12 = z13;
                                                            if (z12) {
                                                                gVar.j("Used cached_data proto from product list for " + string);
                                                                jSONObject.put(string + "_cd", strA2);
                                                                z11 = true;
                                                            }
                                                            if (z11) {
                                                                u5VarA = yc0.i.f125368a.a(jSONObject3);
                                                                if (u5VarA != null) {
                                                                    strA = null;
                                                                } else {
                                                                    strA = null;
                                                                }
                                                                jSONObject.put(string + "_json", strA);
                                                            }
                                                        } else {
                                                            jSONArray = jSONArrayOptJSONArray;
                                                        }
                                                        if (z12) {
                                                            gVar.j("Used cached_data proto from product list for " + string);
                                                            jSONObject.put(string + "_cd", strA2);
                                                            z11 = true;
                                                        }
                                                        if (z11) {
                                                            u5VarA = yc0.i.f125368a.a(jSONObject3);
                                                            if (u5VarA != null) {
                                                                strA = null;
                                                            } else {
                                                                strA = null;
                                                            }
                                                            jSONObject.put(string + "_json", strA);
                                                        }
                                                    }
                                                    z11 = false;
                                                    if (z11) {
                                                        u5VarA = yc0.i.f125368a.a(jSONObject3);
                                                        if (u5VarA != null) {
                                                            strA = null;
                                                        } else {
                                                            strA = null;
                                                        }
                                                        jSONObject.put(string + "_json", strA);
                                                    }
                                                } else {
                                                    jSONArray = jSONArrayOptJSONArray;
                                                }
                                            } else {
                                                jSONArray = jSONArrayOptJSONArray;
                                            }
                                            i11++;
                                            jSONArrayOptJSONArray = jSONArray;
                                        }
                                        h0 h0Var4 = h0.f84049a;
                                    }
                                } catch (JSONException e13) {
                                    logger.f("Error parsing product list response", e13);
                                    h0 h0Var5 = h0.f84049a;
                                }
                            }
                            if (jSONObject.length() > 0) {
                                return;
                            } else {
                                return;
                            }
                        }
                    }
                }
                this.size = contentLength;
                this.error = OwnerAPIError.getOwnerAPIError(yVar.b());
                this.headers = yVar.f().newBuilder().add(KEY_REQUEST_START_DATE, String.valueOf(j11)).add(KEY_REQUEST_END_DATE, String.valueOf(j12)).build();
                parseResponseBody(toJsonObject(responseBodyA));
                JSONObject jsonObject = toJsonObject(responseBodyE);
                parseErrorBody(jsonObject);
                if (jsonObject.length() > 0) {
                    this.errorResponseBody = jsonObject;
                }
                Headers headers = this.headers;
                if (headers != null && (str = headers.get("x-error-code")) != null && (jSONObject6 = this.response) != null) {
                    jSONObject6.put("x-error-code", str);
                }
                if (responseBodyA != null) {
                    responseBodyA.close();
                }
                if (responseBodyE != null) {
                    responseBodyE.close();
                }
            } catch (Throwable th2) {
                if (responseBodyA != null) {
                    responseBodyA.close();
                }
                if (responseBodyE != null) {
                    responseBodyE.close();
                }
                throw th2;
            }
        }
        if (uri != null) {
            jSONObject = new JSONObject();
            lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null) {
                Locale US2 = Locale.US;
                s.j(US2, "US");
                upperCase = lastPathSegment.toUpperCase(US2);
                s.j(upperCase, "toUpperCase(...)");
                if (upperCase == null) {
                }
            }
            if (s.f(upperCase, SEGMENT_VEHICLE_DATA)) {
                jSONObject5 = this.response;
                if (jSONObject5 != null) {
                    jSONObjectOptJSONObject = jSONObject5.optJSONObject("response");
                    if (jSONObjectOptJSONObject != null) {
                        string2 = jSONObjectOptJSONObject.getString("vin");
                        s.h(string2);
                        if (string2.length() != 0) {
                            throw new Error("VIN missing from vehicle data response");
                        }
                        i iVar3 = i.VEHICLE_DATA_FETCH;
                        strOptString2 = jSONObjectOptJSONObject.optString("vehicle_data");
                        s.h(strOptString2);
                        if (t.y0(strOptString2) || (strA5 = ke0.f.f85990a.a(string2, strOptString2, iVar3)) == null) {
                            z14 = false;
                        } else {
                            logger.j("Used vehicle_data proto");
                            jSONObject.put(string2, strA5);
                            if (r.d()) {
                                jSONObjectOptJSONObject.put("vehicle_data", strA5);
                                jSONObject5.put("response", jSONObjectOptJSONObject);
                            }
                            z14 = true;
                        }
                        if (!z14) {
                            strOptString3 = jSONObjectOptJSONObject.optString("cached_data");
                            s.h(strOptString3);
                            if (!t.y0(strOptString3) && (strA4 = ke0.f.f85990a.a(string2, strOptString3, iVar3)) != null) {
                                if (strA4.length() > 0) {
                                    logger.j("Used cached_data proto");
                                    jSONObject.put(string2 + "_cd", strA4);
                                    z15 = true;
                                } else {
                                    z15 = z14;
                                }
                                z14 = z15;
                            }
                        }
                        if (!z14) {
                            u5VarA2 = yc0.i.f125368a.a(jSONObjectOptJSONObject);
                            if (u5VarA2 != null || (u5VarG2 = h.g(u5VarA2, string2, iVar3)) == null || (kVarEncodeByteString2 = u5VarG2.encodeByteString()) == null) {
                                strA3 = null;
                            } else {
                                strA3 = kVarEncodeByteString2.a();
                            }
                            logger.j("Used JSON converted proto");
                            jSONObject.put(string2 + "_json", strA3);
                        }
                        h0 h0Var6 = h0.f84049a;
                    }
                }
            } else if (s.f(upperCase, SEGMENT_PRODUCT_LIST) && (jSONObject2 = this.response) != null) {
                jSONArrayOptJSONArray = jSONObject2.optJSONArray("response");
                if (jSONArrayOptJSONArray != null) {
                    length = jSONArrayOptJSONArray.length();
                    i11 = 0;
                    while (i11 < length) {
                        obj = jSONArrayOptJSONArray.get(i11);
                        if (obj instanceof JSONObject) {
                            jSONObject3 = (JSONObject) obj;
                        } else {
                            jSONObject3 = null;
                        }
                        if (jSONObject3 != null) {
                            if (jSONObject3.has("referenceNumber")) {
                                string = jSONObject3.getString("referenceNumber");
                            } else if (jSONObject3.has("vin")) {
                                string = jSONObject3.getString("vin");
                            } else {
                                string = null;
                            }
                            gVar = logger;
                            gVar.j("[PRODUCT LIST] identifier: " + string);
                            strOptString = jSONObject3.optString("cached_data");
                            iVar = i.PRODUCT_LIST_FETCH;
                            if (string != null) {
                                s.h(strOptString);
                                if (t.y0(strOptString)) {
                                    strA2 = ke0.f.f85990a.a(string, strOptString, iVar);
                                    if (strA2 != null) {
                                        if (strA2.length() > 0) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        jSONArray = jSONArrayOptJSONArray;
                                        if (z13) {
                                        }
                                        if (z12) {
                                            gVar.j("Used cached_data proto from product list for " + string);
                                            jSONObject.put(string + "_cd", strA2);
                                            z11 = true;
                                        }
                                        if (z11) {
                                            u5VarA = yc0.i.f125368a.a(jSONObject3);
                                            if (u5VarA != null || (u5VarG = h.g(u5VarA, string, iVar)) == null || (kVarEncodeByteString = u5VarG.encodeByteString()) == null) {
                                                strA = null;
                                            } else {
                                                strA = kVarEncodeByteString.a();
                                            }
                                            jSONObject.put(string + "_json", strA);
                                        }
                                    } else {
                                        jSONArray = jSONArrayOptJSONArray;
                                    }
                                    if (z12) {
                                        gVar.j("Used cached_data proto from product list for " + string);
                                        jSONObject.put(string + "_cd", strA2);
                                        z11 = true;
                                    }
                                    if (z11) {
                                        u5VarA = yc0.i.f125368a.a(jSONObject3);
                                        if (u5VarA != null) {
                                            strA = null;
                                        } else {
                                            strA = null;
                                        }
                                        jSONObject.put(string + "_json", strA);
                                    }
                                } else {
                                    jSONArray = jSONArrayOptJSONArray;
                                }
                                z11 = false;
                                if (z11) {
                                    u5VarA = yc0.i.f125368a.a(jSONObject3);
                                    if (u5VarA != null) {
                                        strA = null;
                                    } else {
                                        strA = null;
                                    }
                                    jSONObject.put(string + "_json", strA);
                                }
                            } else {
                                jSONArray = jSONArrayOptJSONArray;
                            }
                        } else {
                            jSONArray = jSONArrayOptJSONArray;
                        }
                        i11++;
                        jSONArrayOptJSONArray = jSONArray;
                    }
                    h0 h0Var7 = h0.f84049a;
                }
            }
            if (jSONObject.length() > 0 || (jSONObject4 = this.response) == null) {
                return;
            }
            jSONObject4.put("convertedProtos", jSONObject);
        }
    }

    private final JSONObject toJsonObject(String str) {
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    /* synthetic */ OwnerResponse(y yVar, OwnerApiStatusCode ownerApiStatusCode, long j11, long j12, Uri uri, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(yVar, ownerApiStatusCode, (i11 & 4) != 0 ? 0L : j11, (i11 & 8) != 0 ? 0L : j12, (i11 & 16) != 0 ? null : uri);
    }
}
