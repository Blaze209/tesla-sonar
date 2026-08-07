package com.tesla.oapi.auth;

import java.util.Map;
import okhttp3.Request;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001cB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u000e\u001a\u00020\u00122\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00102\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/tesla/oapi/auth/AuthUtils;", "", "<init>", "()V", "", "token", "getBearerTokenValue", "(Ljava/lang/String;)Ljava/lang/String;", "Lokhttp3/Request;", "request", "parseBearerTokenOrNull", "(Lokhttp3/Request;)Ljava/lang/String;", "Lokhttp3/Request$Builder;", "builder", "setAuthorizationHeader", "(Lokhttp3/Request$Builder;Ljava/lang/String;)Lokhttp3/Request;", "", "headers", "Ljn0/h0;", "(Ljava/util/Map;Ljava/lang/String;)V", "Lcom/tesla/oapi/auth/AuthRepository;", "authRepository", "Lcom/tesla/oapi/auth/AuthUtils$LoginStatus;", "getLoginStatus", "(Lcom/tesla/oapi/auth/AuthRepository;)Lcom/tesla/oapi/auth/AuthUtils$LoginStatus;", "HEADER_AUTHORIZATION", "Ljava/lang/String;", "VALUE_PART_BEARER", "LoginStatus", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AuthUtils {
    private static final String HEADER_AUTHORIZATION = "Authorization";
    public static final AuthUtils INSTANCE = new AuthUtils();
    private static final String VALUE_PART_BEARER = "Bearer ";

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/oapi/auth/AuthUtils$LoginStatus;", "", "<init>", "(Ljava/lang/String;I)V", "GLOBAL", "CHINA", "UNAUTHENTICATED", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum LoginStatus {
        GLOBAL,
        CHINA,
        UNAUTHENTICATED;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<LoginStatus> getEntries() {
            return $ENTRIES;
        }
    }

    private AuthUtils() {
    }

    private final String getBearerTokenValue(String token) {
        return VALUE_PART_BEARER + token;
    }

    public final LoginStatus getLoginStatus(AuthRepository authRepository) {
        s.k(authRepository, "authRepository");
        return s.f("https://auth.tesla.cn/oauth2/v3", authRepository.getIssuer()) ? LoginStatus.CHINA : LoginStatus.GLOBAL;
    }

    public final String parseBearerTokenOrNull(Request request) {
        s.k(request, "request");
        String strHeader = request.header(HEADER_AUTHORIZATION);
        if (strHeader != null) {
            return t.r1(strHeader, VALUE_PART_BEARER, null, 2, null);
        }
        return null;
    }

    public final Request setAuthorizationHeader(Request.Builder builder, String token) {
        s.k(builder, "builder");
        s.k(token, "token");
        return builder.header(HEADER_AUTHORIZATION, getBearerTokenValue(token)).build();
    }

    public final void setAuthorizationHeader(Map<String, String> headers, String token) {
        s.k(headers, "headers");
        s.k(token, "token");
        headers.put(HEADER_AUTHORIZATION, getBearerTokenValue(token));
    }
}
