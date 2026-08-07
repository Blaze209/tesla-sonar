package com.tesla.oapi.auth;

import bo0.n;
import com.google.android.gms.wallet.WalletConstants;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import com.tesla.logging.g;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import ie0.p0;
import ie0.r;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import ke0.f;
import ke0.i;
import okhttp3.Connection;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.HttpHeaders;
import okio.h;
import okio.j;
import okio.u;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.n0;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\b*\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/tesla/oapi/auth/TeslaLoggingInterceptor;", "Lokhttp3/Interceptor;", "Lcom/tesla/logging/g;", "logger", "<init>", "(Lcom/tesla/logging/g;)V", "Lokhttp3/Headers;", "headers", "", "bodyHasUnknownEncoding", "(Lokhttp3/Headers;)Z", "Lokio/h;", "isProbablyUtf8", "(Lokio/h;)Z", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "Lcom/tesla/logging/g;", "Companion", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TeslaLoggingInterceptor implements Interceptor {
    private static final List<String> ENDPOINT_LOG_BLOCKLIST = v.p("/calendar_history", "/telemetry_history", "/upcoming_calendar_entries", "/token", "/jwt/hermes", "/tokens/v1", "/reports");
    private static final boolean LOG_RESPONSE = true;
    private static final int MAX_LOG_BODY_SIZE = 100000;
    private final g logger;

    public TeslaLoggingInterceptor(g logger) {
        s.k(logger, "logger");
        this.logger = logger;
    }

    private final boolean bodyHasUnknownEncoding(Headers headers) {
        String str = headers.get("Content-Encoding");
        return (str == null || t.M(str, "identity", true) || t.M(str, "gzip", true)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final JSONObject intercept$lambda$4(n0 n0Var) {
        return new JSONObject((String) n0Var.f86529a);
    }

    private final boolean isProbablyUtf8(h hVar) {
        try {
            h hVar2 = new h();
            hVar.t(hVar2, 0L, n.k(hVar.getSize(), 64L));
            for (int i11 = 0; i11 < 16 && !hVar2.T2(); i11++) {
                int iN0 = hVar2.n0();
                if (Character.isISOControl(iN0) && !Character.isWhitespace(iN0)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:148:0x0444  */
    /* JADX WARN: Code duplicated, block: B:149:0x0460  */
    /* JADX WARN: Code duplicated, block: B:155:0x0488  */
    /* JADX WARN: Code duplicated, block: B:157:0x048c  */
    /* JADX WARN: Code duplicated, block: B:158:0x048f  */
    /* JADX WARN: Code duplicated, block: B:159:0x0492  */
    /* JADX WARN: Code duplicated, block: B:160:0x0495  */
    /* JADX WARN: Code duplicated, block: B:161:0x0498  */
    /* JADX WARN: Code duplicated, block: B:162:0x049c  */
    /* JADX WARN: Code duplicated, block: B:163:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:164:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:165:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:166:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:167:0x04af  */
    /* JADX WARN: Code duplicated, block: B:168:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:169:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:170:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:171:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:172:0x04be  */
    /* JADX WARN: Code duplicated, block: B:173:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:174:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:175:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:176:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:177:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:178:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:179:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:180:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:181:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:182:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:183:0x04df  */
    /* JADX WARN: Code duplicated, block: B:184:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:185:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:186:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:187:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:188:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:189:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:190:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:191:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:205:0x054b  */
    /* JADX WARN: Code duplicated, block: B:208:0x0565  */
    /* JADX WARN: Code duplicated, block: B:209:0x0568  */
    /* JADX WARN: Code duplicated, block: B:211:0x056c  */
    /* JADX WARN: Code duplicated, block: B:212:0x056f  */
    /* JADX WARN: Code duplicated, block: B:215:0x058a  */
    /* JADX WARN: Code duplicated, block: B:216:0x058d  */
    /* JADX WARN: Instruction removed from duplicated block: B:148:0x0444, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:149:0x0460, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:212:0x056f, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v9, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v39, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v15, types: [T, java.lang.String] */
    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws Exception {
        String upperCase;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        long j11;
        HttpUrl httpUrl;
        String str6;
        int iCode;
        String str7;
        boolean z11;
        String str8;
        String str9;
        JSONObject jSONObject;
        JSONObject jSONObjectOptJSONObject;
        String strA;
        Long lValueOf;
        Charset charset;
        h hVar;
        int i11;
        String str10;
        String str11;
        Long l11;
        Charset UTF_8;
        String str12;
        int i12;
        s.k(chain, "chain");
        Request request = chain.request();
        Headers headers = request.headers();
        int size = headers.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                upperCase = "";
                break;
            }
            if (t.M(headers.name(i13), "X-TXID", true)) {
                String strValue = headers.value(i13);
                Locale locale = Locale.getDefault();
                s.j(locale, "getDefault(...)");
                upperCase = strValue.toUpperCase(locale);
                s.j(upperCase, "toUpperCase(...)");
                break;
            }
            i13++;
        }
        RequestBody requestBodyBody = request.body();
        Connection connection = chain.connection();
        HttpUrl httpUrlUrl = request.url();
        String str13 = "UTF_8";
        String str14 = "Content-Encoding";
        String str15 = "getDefault(...)";
        String str16 = "X-TXID";
        if (requestBodyBody != null) {
            if (bodyHasUnknownEncoding(request.headers())) {
                str12 = " (encoded body omitted)";
            } else if (requestBodyBody.isDuplex()) {
                str12 = " (duplex request body omitted)";
            } else if (requestBodyBody.isOneShot()) {
                str12 = " (one-shot body omitted)";
            } else {
                h hVar2 = new h();
                requestBodyBody.writeTo(hVar2);
                h hVar3 = hVar2;
                if (t.M("gzip", headers.get("Content-Encoding"), true)) {
                    Long lValueOf2 = Long.valueOf(hVar3.getSize());
                    u uVar = new u(hVar3.clone());
                    try {
                        h hVar4 = new h();
                        hVar4.q2(uVar);
                        hVar3 = hVar4;
                        sn0.b.a(uVar, null);
                        l11 = lValueOf2;
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            sn0.b.a(uVar, th2);
                            throw th3;
                        }
                    }
                } else {
                    l11 = null;
                }
                h hVar5 = hVar3;
                MediaType f22850a = requestBodyBody.getF22850a();
                str = "gzip";
                if (f22850a == null || (UTF_8 = f22850a.charset(StandardCharsets.UTF_8)) == null) {
                    UTF_8 = StandardCharsets.UTF_8;
                    s.j(UTF_8, "UTF_8");
                }
                if (isProbablyUtf8(hVar5)) {
                    String strEncodedPath = httpUrlUrl.encodedPath();
                    List<String> list = ENDPOINT_LOG_BLOCKLIST;
                    str13 = "UTF_8";
                    if ((list instanceof Collection) && list.isEmpty()) {
                        i12 = 0;
                    } else {
                        Iterator it = list.iterator();
                        int i14 = 0;
                        while (it.hasNext()) {
                            Iterator it2 = it;
                            Request request2 = request;
                            String str17 = str14;
                            int i15 = i14;
                            if (t.L(strEncodedPath, (String) it.next(), false, 2, null)) {
                                i14 = i15 + 1;
                                if (i14 < 0) {
                                    v.w();
                                }
                            } else {
                                i14 = i15;
                            }
                            it = it2;
                            str14 = str17;
                            request = request2;
                        }
                        i12 = i14;
                    }
                    request = request;
                    str14 = str14;
                    if (i12 > 0) {
                        str2 = " => redacted";
                    } else {
                        str2 = " => " + hVar5.clone().j1(UTF_8);
                        if (str2.length() > MAX_LOG_BODY_SIZE) {
                            String strSubstring = str2.substring(0, MAX_LOG_BODY_SIZE);
                            s.j(strSubstring, "substring(...)");
                            str2 = strSubstring + "... [TRUNCATED]";
                        }
                    }
                    if (l11 != null) {
                        str3 = " (" + hVar5.getSize() + "-byte, " + l11 + "-gzipped-byte body)";
                    } else {
                        str3 = " (" + hVar5.getSize() + "-byte body)";
                    }
                } else {
                    str12 = " (binary " + requestBodyBody.contentLength() + "-byte body omitted)";
                    str3 = str12;
                    str2 = "";
                }
            }
            str = "gzip";
            str3 = str12;
            str2 = "";
        } else {
            request = request;
            str14 = "Content-Encoding";
            str = "gzip";
            str13 = "UTF_8";
            str2 = "";
            str3 = str2;
        }
        g gVar = this.logger;
        String strMethod = request.method();
        if (connection != null) {
            str4 = " " + connection.protocol();
        } else {
            str4 = "";
        }
        gVar.j(strMethod + " [TXID: " + upperCase + "] " + httpUrlUrl + "\n      " + str4 + str2 + str3);
        long jNanoTime = System.nanoTime();
        try {
            Response responseProceed = chain.proceed(request);
            Headers headers2 = responseProceed.headers();
            int size2 = headers2.size();
            String str18 = "";
            String str19 = str18;
            int i16 = 0;
            boolean zM = false;
            while (i16 < size2) {
                String str20 = upperCase;
                int i17 = size2;
                String str21 = str16;
                boolean z12 = zM;
                if (t.M(headers2.name(i16), str21, true)) {
                    String strValue2 = headers2.value(i16);
                    Locale locale2 = Locale.getDefault();
                    String str22 = str15;
                    s.j(locale2, str22);
                    String upperCase2 = strValue2.toUpperCase(locale2);
                    s.j(upperCase2, "toUpperCase(...)");
                    str19 = upperCase2;
                    str10 = str21;
                    str11 = str22;
                } else {
                    String str23 = str15;
                    str10 = str21;
                    str11 = str23;
                    if (t.M(headers2.name(i16), "X-CACHE", true)) {
                        zM = t.M(headers2.value(i16), "HIT", true);
                    } else if (t.M(headers2.name(i16), "X-ERROR-CODE", true)) {
                        str18 = " [X-ERROR-CODE: " + headers2.value(i16) + "]";
                    }
                    i16++;
                    str16 = str10;
                    upperCase = str20;
                    size2 = i17;
                    str15 = str11;
                }
                zM = z12;
                i16++;
                str16 = str10;
                upperCase = str20;
                size2 = i17;
                str15 = str11;
            }
            boolean z13 = zM;
            String str24 = str19.length() == 0 ? upperCase : str19;
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            final n0 n0Var = new n0();
            n0Var.f86529a = "";
            ResponseBody responseBodyBody = responseProceed.body();
            s.h(responseBodyBody);
            long contentLength = responseBodyBody.getContentLength();
            if (HttpHeaders.promisesBody(responseProceed)) {
                str5 = "";
                if (!bodyHasUnknownEncoding(responseProceed.headers())) {
                    j source = responseBodyBody.getSource();
                    j11 = millis;
                    source.request(Long.MAX_VALUE);
                    h bufferField = source.getBufferField();
                    if (t.M(str, headers2.get(str14), true)) {
                        lValueOf = Long.valueOf(bufferField.getSize());
                        u uVar2 = new u(bufferField.clone());
                        try {
                            bufferField = new h();
                            bufferField.q2(uVar2);
                            sn0.b.a(uVar2, null);
                        } catch (Throwable th4) {
                            try {
                                throw th4;
                            } catch (Throwable th5) {
                                sn0.b.a(uVar2, th4);
                                throw th5;
                            }
                        }
                    } else {
                        lValueOf = null;
                    }
                    MediaType mediaType = responseBodyBody.get$contentType();
                    if (mediaType == null || (charset = mediaType.charset(StandardCharsets.UTF_8)) == null) {
                        charset = StandardCharsets.UTF_8;
                        s.j(charset, str13);
                    }
                    if (isProbablyUtf8(bufferField)) {
                        if (contentLength != 0) {
                            String strEncodedPath2 = httpUrlUrl.encodedPath();
                            List<String> list2 = ENDPOINT_LOG_BLOCKLIST;
                            hVar = bufferField;
                            if ((list2 instanceof Collection) && list2.isEmpty()) {
                                i11 = 0;
                            } else {
                                Iterator it3 = list2.iterator();
                                int i18 = 0;
                                while (it3.hasNext()) {
                                    Iterator it4 = it3;
                                    HttpUrl httpUrl2 = httpUrlUrl;
                                    int i19 = i18;
                                    if (t.L(strEncodedPath2, (String) it3.next(), false, 2, null)) {
                                        i18 = i19 + 1;
                                        if (i18 < 0) {
                                            v.w();
                                        }
                                    } else {
                                        i18 = i19;
                                    }
                                    it3 = it4;
                                    httpUrlUrl = httpUrl2;
                                }
                                i11 = i18;
                            }
                            httpUrl = httpUrlUrl;
                            if (i11 > 0) {
                                n0Var.f86529a = "redacted";
                            } else {
                                ?? J1 = hVar.clone().j1(charset);
                                n0Var.f86529a = J1;
                                if (J1.length() > MAX_LOG_BODY_SIZE) {
                                    String strSubstring2 = ((String) n0Var.f86529a).substring(0, MAX_LOG_BODY_SIZE);
                                    s.j(strSubstring2, "substring(...)");
                                    n0Var.f86529a = strSubstring2 + "... [TRUNCATED]";
                                }
                            }
                        }
                        if (lValueOf != null) {
                            str6 = hVar.getSize() + "-byte, " + lValueOf + "-gzipped-byte body";
                        } else {
                            str6 = hVar.getSize() + "-byte body";
                        }
                    } else {
                        n0Var.f86529a = "(binary " + bufferField.getSize() + "-byte body omitted)";
                    }
                    hVar = bufferField;
                    httpUrl = httpUrlUrl;
                    if (lValueOf != null) {
                        str6 = hVar.getSize() + "-byte, " + lValueOf + "-gzipped-byte body";
                    } else {
                        str6 = hVar.getSize() + "-byte body";
                    }
                }
                iCode = responseProceed.code();
                if (iCode != 400) {
                    str7 = "HTTP_BAD_REQUEST";
                } else if (iCode != 504) {
                    switch (iCode) {
                        case 200:
                            str7 = "HTTP_OK";
                            break;
                        case SDK_ASSET_ICON_CHEVRON_LEFT_DOUBLE_S2_VALUE:
                            str7 = "HTTP_CREATED";
                            break;
                        case SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE:
                            str7 = "HTTP_ACCEPTED";
                            break;
                        case SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE:
                            str7 = "HTTP_NOT_AUTHORITATIVE";
                            break;
                        case SDK_ASSET_ICON_CLEARED_REC_VALUE:
                            str7 = "HTTP_NO_CONTENT";
                            break;
                        case SDK_ASSET_ICON_CLIPBOARD_VALUE:
                            str7 = "HTTP_RESET";
                            break;
                        case SDK_ASSET_ICON_CLOCK_VALUE:
                            str7 = "HTTP_PARTIAL";
                            break;
                        default:
                            switch (iCode) {
                                case 300:
                                    str7 = "HTTP_MULT_CHOICE";
                                    break;
                                case SDK_ASSET_CASH_ICON_CIRCLE_VALUE:
                                    str7 = "HTTP_MOVED_PERM";
                                    break;
                                case SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_VALUE:
                                    str7 = "HTTP_MOVED_TEMP";
                                    break;
                                case SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE:
                                    str7 = "HTTP_SEE_OTHER";
                                    break;
                                case SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE:
                                    str7 = "HTTP_NOT_MODIFIED";
                                    break;
                                default:
                                    switch (iCode) {
                                        case WalletConstants.ERROR_CODE_SERVICE_UNAVAILABLE /* 402 */:
                                            str7 = "HTTP_PAYMENT_REQUIRED";
                                            break;
                                        case DownloaderService.STATUS_FORBIDDEN /* 403 */:
                                            str7 = "HTTP_FORBIDDEN";
                                            break;
                                        case 404:
                                            str7 = "HTTP_NOT_FOUND";
                                            break;
                                        case WalletConstants.ERROR_CODE_MERCHANT_ACCOUNT_ERROR /* 405 */:
                                            str7 = "HTTP_BAD_METHOD";
                                            break;
                                        case WalletConstants.ERROR_CODE_SPENDING_LIMIT_EXCEEDED /* 406 */:
                                            str7 = "HTTP_NOT_ACCEPTABLE";
                                            break;
                                        case 407:
                                            str7 = "HTTP_PROXY_AUTH";
                                            break;
                                        case 408:
                                            str7 = "HTTP_CLIENT_TIMEOUT";
                                            break;
                                        case 409:
                                            str7 = "HTTP_CONFLICT";
                                            break;
                                        case WalletConstants.ERROR_CODE_INVALID_TRANSACTION /* 410 */:
                                            str7 = "HTTP_GONE";
                                            break;
                                        case WalletConstants.ERROR_CODE_AUTHENTICATION_FAILURE /* 411 */:
                                            str7 = "HTTP_LENGTH_REQUIRED";
                                            break;
                                        case WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION /* 412 */:
                                            str7 = "HTTP_PRECON_FAILED";
                                            break;
                                        case 413:
                                            str7 = "HTTP_ENTITY_TOO_LARGE";
                                            break;
                                        case WalletConstants.ERROR_CODE_ILLEGAL_CALLER /* 414 */:
                                            str7 = "HTTP_REQ_TOO_LONG";
                                            break;
                                        default:
                                            switch (iCode) {
                                                case 500:
                                                    str7 = "HTTP_INTERNAL_ERROR";
                                                    break;
                                                case 501:
                                                    str7 = "HTTP_NOT_IMPLEMENTED";
                                                    break;
                                                case HttpStatusCode.BAD_GATEWAY_502 /* 502 */:
                                                    str7 = "HTTP_BAD_GATEWAY";
                                                    break;
                                                default:
                                                    str7 = "UNKNOWN";
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    str7 = "HTTP_GATEWAY_TIMEOUT";
                }
                if (r.d() && responseProceed.code() == 200 && t.h0(httpUrl.encodedPath(), "/vehicle_data", false, 2, null) && !z13 && (jSONObject = (JSONObject) p0.a(new wn0.a() { // from class: com.tesla.oapi.auth.d
                    @Override // wn0.a
                    public final Object invoke() {
                        return TeslaLoggingInterceptor.intercept$lambda$4(n0Var);
                    }
                })) != null && (jSONObjectOptJSONObject = jSONObject.optJSONObject("response")) != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("vehicle_data");
                    f fVar = f.f85990a;
                    String strOptString2 = jSONObjectOptJSONObject.optString("vin");
                    s.j(strOptString2, "optString(...)");
                    s.h(strOptString);
                    strA = fVar.a(strOptString2, strOptString, i.VEHICLE_DATA_FETCH);
                    if (strA != null) {
                        jSONObjectOptJSONObject.put("vehicle_data", strA);
                        jSONObject.put("response", jSONObjectOptJSONObject);
                        n0Var.f86529a = jSONObject.toString();
                    }
                }
                int iCode2 = responseProceed.code();
                if (responseProceed.message().length() == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    str8 = str5;
                } else {
                    str8 = ' ' + responseProceed.message();
                }
                String str25 = (String) n0Var.f86529a;
                if (z13) {
                    str9 = "CACHED";
                } else {
                    str9 = "not cached";
                }
                this.logger.j(t.V(t.n("\n      Response [" + iCode2 + "\n      " + str7 + str8 + "]\n      [TXID: " + str24 + "]" + str18 + " => " + str25 + " (" + j11 + "ms " + str6 + ")\n      [" + str9 + "]\n    "), "\n", "", false, 4, null));
                return responseProceed;
            }
            str5 = "";
            j11 = millis;
            httpUrl = httpUrlUrl;
            str6 = str5;
            iCode = responseProceed.code();
            if (iCode != 400) {
                str7 = "HTTP_BAD_REQUEST";
            } else if (iCode != 504) {
                switch (iCode) {
                    case 200:
                        str7 = "HTTP_OK";
                        break;
                    case SDK_ASSET_ICON_CHEVRON_LEFT_DOUBLE_S2_VALUE:
                        str7 = "HTTP_CREATED";
                        break;
                    case SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE:
                        str7 = "HTTP_ACCEPTED";
                        break;
                    case SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE:
                        str7 = "HTTP_NOT_AUTHORITATIVE";
                        break;
                    case SDK_ASSET_ICON_CLEARED_REC_VALUE:
                        str7 = "HTTP_NO_CONTENT";
                        break;
                    case SDK_ASSET_ICON_CLIPBOARD_VALUE:
                        str7 = "HTTP_RESET";
                        break;
                    case SDK_ASSET_ICON_CLOCK_VALUE:
                        str7 = "HTTP_PARTIAL";
                        break;
                    default:
                        switch (iCode) {
                            case 300:
                                str7 = "HTTP_MULT_CHOICE";
                                break;
                            case SDK_ASSET_CASH_ICON_CIRCLE_VALUE:
                                str7 = "HTTP_MOVED_PERM";
                                break;
                            case SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_VALUE:
                                str7 = "HTTP_MOVED_TEMP";
                                break;
                            case SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE:
                                str7 = "HTTP_SEE_OTHER";
                                break;
                            case SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE:
                                str7 = "HTTP_NOT_MODIFIED";
                                break;
                            default:
                                switch (iCode) {
                                    case WalletConstants.ERROR_CODE_SERVICE_UNAVAILABLE /* 402 */:
                                        str7 = "HTTP_PAYMENT_REQUIRED";
                                        break;
                                    case DownloaderService.STATUS_FORBIDDEN /* 403 */:
                                        str7 = "HTTP_FORBIDDEN";
                                        break;
                                    case 404:
                                        str7 = "HTTP_NOT_FOUND";
                                        break;
                                    case WalletConstants.ERROR_CODE_MERCHANT_ACCOUNT_ERROR /* 405 */:
                                        str7 = "HTTP_BAD_METHOD";
                                        break;
                                    case WalletConstants.ERROR_CODE_SPENDING_LIMIT_EXCEEDED /* 406 */:
                                        str7 = "HTTP_NOT_ACCEPTABLE";
                                        break;
                                    case 407:
                                        str7 = "HTTP_PROXY_AUTH";
                                        break;
                                    case 408:
                                        str7 = "HTTP_CLIENT_TIMEOUT";
                                        break;
                                    case 409:
                                        str7 = "HTTP_CONFLICT";
                                        break;
                                    case WalletConstants.ERROR_CODE_INVALID_TRANSACTION /* 410 */:
                                        str7 = "HTTP_GONE";
                                        break;
                                    case WalletConstants.ERROR_CODE_AUTHENTICATION_FAILURE /* 411 */:
                                        str7 = "HTTP_LENGTH_REQUIRED";
                                        break;
                                    case WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION /* 412 */:
                                        str7 = "HTTP_PRECON_FAILED";
                                        break;
                                    case 413:
                                        str7 = "HTTP_ENTITY_TOO_LARGE";
                                        break;
                                    case WalletConstants.ERROR_CODE_ILLEGAL_CALLER /* 414 */:
                                        str7 = "HTTP_REQ_TOO_LONG";
                                        break;
                                    default:
                                        switch (iCode) {
                                            case 500:
                                                str7 = "HTTP_INTERNAL_ERROR";
                                                break;
                                            case 501:
                                                str7 = "HTTP_NOT_IMPLEMENTED";
                                                break;
                                            case HttpStatusCode.BAD_GATEWAY_502 /* 502 */:
                                                str7 = "HTTP_BAD_GATEWAY";
                                                break;
                                            default:
                                                str7 = "UNKNOWN";
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                str7 = "HTTP_GATEWAY_TIMEOUT";
            }
            if (r.d()) {
                String strOptString3 = jSONObjectOptJSONObject.optString("vehicle_data");
                f fVar2 = f.f85990a;
                String strOptString4 = jSONObjectOptJSONObject.optString("vin");
                s.j(strOptString4, "optString(...)");
                s.h(strOptString3);
                strA = fVar2.a(strOptString4, strOptString3, i.VEHICLE_DATA_FETCH);
                if (strA != null) {
                    jSONObjectOptJSONObject.put("vehicle_data", strA);
                    jSONObject.put("response", jSONObjectOptJSONObject);
                    n0Var.f86529a = jSONObject.toString();
                }
            }
            int iCode3 = responseProceed.code();
            if (responseProceed.message().length() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                str8 = str5;
            } else {
                str8 = ' ' + responseProceed.message();
            }
            String str26 = (String) n0Var.f86529a;
            if (z13) {
                str9 = "CACHED";
            } else {
                str9 = "not cached";
            }
            this.logger.j(t.V(t.n("\n      Response [" + iCode3 + "\n      " + str7 + str8 + "]\n      [TXID: " + str24 + "]" + str18 + " => " + str26 + " (" + j11 + "ms " + str6 + ")\n      [" + str9 + "]\n    "), "\n", "", false, 4, null));
            return responseProceed;
        } catch (Exception e11) {
            this.logger.d("HTTP FAILED: " + httpUrlUrl, e11);
            throw e11;
        }
    }
}
