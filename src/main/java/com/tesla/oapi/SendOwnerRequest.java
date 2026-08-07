package com.tesla.oapi;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ImagesContract;
import com.tesla.oapi.auth.AuthRepository;
import com.tesla.oapi.auth.OwnerDataModule;
import io.reactivex.rxjava3.core.u;
import java.util.List;
import java.util.Map;
import okhttp3.MultipartBody;
import okhttp3.ResponseBody;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import retrofit2.y;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 #2\u00020\u0001:\u0001#J_\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nH&¢\u0006\u0004\b\u000f\u0010\u0010J«\u0001\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0018\b\u0002\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00062\u0018\b\u0002\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00062\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00062\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nH&¢\u0006\u0004\b\u000f\u0010\u0014J\u009d\u0001\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0018\b\u0002\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00152\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00062\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nH&¢\u0006\u0004\b\u000f\u0010\u0016J\u009d\u0001\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0018\b\u0002\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00062\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nH&¢\u0006\u0004\b\u000f\u0010\u0017J\u009d\u0001\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0018\b\u0002\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00152\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00062\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nH&¢\u0006\u0004\b\u000f\u0010\u0018J«\u0001\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0018\b\u0002\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00062\u0018\b\u0002\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00062\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00062\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nH&¢\u0006\u0004\b\u000f\u0010\u0019J\u0097\u0001\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0018\b\u0002\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00062\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00062\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nH&¢\u0006\u0004\b\u001d\u0010\u001eJ\u008f\u0001\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0018\b\u0002\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00062\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00062\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nH&¢\u0006\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/tesla/oapi/SendOwnerRequest;", "", "Lcom/tesla/oapi/HttpMethodType;", "method", "", ImagesContract.URL, "", "queryParams", "", "timeout", "", "requiresAuth", "disableCompression", "Lio/reactivex/rxjava3/core/u;", "Lcom/tesla/oapi/OwnerResponse;", "execute", "(Lcom/tesla/oapi/HttpMethodType;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Integer;ZZ)Lio/reactivex/rxjava3/core/u;", "urlParams", "data", "headers", "(Lcom/tesla/oapi/HttpMethodType;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Integer;ZZ)Lio/reactivex/rxjava3/core/u;", "Lorg/json/JSONObject;", "(Lcom/tesla/oapi/HttpMethodType;Ljava/lang/String;Ljava/util/Map;Lorg/json/JSONObject;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Integer;ZZ)Lio/reactivex/rxjava3/core/u;", "(Lcom/tesla/oapi/HttpMethodType;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Integer;ZZ)Lio/reactivex/rxjava3/core/u;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lorg/json/JSONObject;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Integer;ZZ)Lio/reactivex/rxjava3/core/u;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Integer;ZZ)Lio/reactivex/rxjava3/core/u;", "", "Lokhttp3/MultipartBody$Part;", "body", "upload", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Integer;ZZ)Lio/reactivex/rxjava3/core/u;", "Lretrofit2/y;", "Lokhttp3/ResponseBody;", "download", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Integer;ZZ)Lio/reactivex/rxjava3/core/u;", "Companion", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SendOwnerRequest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    static SendOwnerRequest newInstance(Context context) {
        return INSTANCE.newInstance(context);
    }

    u<y<ResponseBody>> download(String url, Map<String, ? extends Object> urlParams, Map<String, ? extends Object> queryParams, Map<String, String> headers, Integer timeout, boolean requiresAuth, boolean disableCompression);

    u<OwnerResponse> execute(HttpMethodType method, String url, Map<String, ? extends Object> queryParams, Integer timeout, boolean requiresAuth, boolean disableCompression);

    u<OwnerResponse> execute(HttpMethodType method, String url, Map<String, ? extends Object> urlParams, String data, Map<String, ? extends Object> queryParams, Map<String, String> headers, Integer timeout, boolean requiresAuth, boolean disableCompression);

    u<OwnerResponse> execute(HttpMethodType method, String url, Map<String, ? extends Object> urlParams, Map<String, ? extends Object> data, Map<String, ? extends Object> queryParams, Map<String, String> headers, Integer timeout, boolean requiresAuth, boolean disableCompression);

    u<OwnerResponse> execute(HttpMethodType method, String url, Map<String, ? extends Object> urlParams, JSONObject data, Map<String, ? extends Object> queryParams, Map<String, String> headers, Integer timeout, boolean requiresAuth, boolean disableCompression);

    u<OwnerResponse> execute(String method, String url, Map<String, ? extends Object> urlParams, Map<String, ? extends Object> data, Map<String, ? extends Object> queryParams, Map<String, String> headers, Integer timeout, boolean requiresAuth, boolean disableCompression);

    u<OwnerResponse> execute(String method, String url, Map<String, ? extends Object> urlParams, JSONObject data, Map<String, ? extends Object> queryParams, Map<String, String> headers, Integer timeout, boolean requiresAuth, boolean disableCompression);

    u<OwnerResponse> upload(String url, Map<String, ? extends Object> urlParams, List<MultipartBody.Part> body, Map<String, ? extends Object> queryParams, Map<String, String> headers, Integer timeout, boolean requiresAuth, boolean disableCompression);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ u download$default(SendOwnerRequest sendOwnerRequest, String str, Map map, Map map2, Map map3, Integer num, boolean z11, boolean z12, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: download");
            }
            if ((i11 & 2) != 0) {
                map = null;
            }
            if ((i11 & 4) != 0) {
                map2 = null;
            }
            if ((i11 & 8) != 0) {
                map3 = null;
            }
            if ((i11 & 16) != 0) {
                num = 15;
            }
            if ((i11 & 32) != 0) {
                z11 = true;
            }
            if ((i11 & 64) != 0) {
                z12 = false;
            }
            return sendOwnerRequest.download(str, map, map2, map3, num, z11, z12);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ u execute$default(SendOwnerRequest sendOwnerRequest, HttpMethodType httpMethodType, String str, Map map, Integer num, boolean z11, boolean z12, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: execute");
            }
            if ((i11 & 4) != 0) {
                map = null;
            }
            Map map2 = map;
            if ((i11 & 8) != 0) {
                num = 15;
            }
            Integer num2 = num;
            if ((i11 & 16) != 0) {
                z11 = true;
            }
            boolean z13 = z11;
            if ((i11 & 32) != 0) {
                z12 = false;
            }
            return sendOwnerRequest.execute(httpMethodType, str, map2, num2, z13, z12);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ u upload$default(SendOwnerRequest sendOwnerRequest, String str, Map map, List list, Map map2, Map map3, Integer num, boolean z11, boolean z12, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: upload");
            }
            if ((i11 & 2) != 0) {
                map = null;
            }
            if ((i11 & 8) != 0) {
                map2 = null;
            }
            if ((i11 & 16) != 0) {
                map3 = null;
            }
            if ((i11 & 32) != 0) {
                num = 15;
            }
            if ((i11 & 64) != 0) {
                z11 = true;
            }
            if ((i11 & 128) != 0) {
                z12 = false;
            }
            return sendOwnerRequest.upload(str, map, list, map2, map3, num, z11, z12);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ u execute$default(SendOwnerRequest sendOwnerRequest, HttpMethodType httpMethodType, String str, Map map, Map map2, Map map3, Map map4, Integer num, boolean z11, boolean z12, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: execute");
            }
            if ((i11 & 4) != 0) {
                map = null;
            }
            if ((i11 & 8) != 0) {
                map2 = null;
            }
            if ((i11 & 16) != 0) {
                map3 = null;
            }
            if ((i11 & 32) != 0) {
                map4 = null;
            }
            if ((i11 & 64) != 0) {
                num = 15;
            }
            if ((i11 & 128) != 0) {
                z11 = true;
            }
            if ((i11 & 256) != 0) {
                z12 = false;
            }
            return sendOwnerRequest.execute(httpMethodType, str, (Map<String, ? extends Object>) map, (Map<String, ? extends Object>) map2, (Map<String, ? extends Object>) map3, (Map<String, String>) map4, num, z11, z12);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ u execute$default(SendOwnerRequest sendOwnerRequest, HttpMethodType httpMethodType, String str, Map map, JSONObject jSONObject, Map map2, Map map3, Integer num, boolean z11, boolean z12, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: execute");
            }
            if ((i11 & 4) != 0) {
                map = null;
            }
            if ((i11 & 8) != 0) {
                jSONObject = null;
            }
            if ((i11 & 16) != 0) {
                map2 = null;
            }
            if ((i11 & 32) != 0) {
                map3 = null;
            }
            if ((i11 & 64) != 0) {
                num = 15;
            }
            if ((i11 & 128) != 0) {
                z11 = true;
            }
            if ((i11 & 256) != 0) {
                z12 = false;
            }
            return sendOwnerRequest.execute(httpMethodType, str, (Map<String, ? extends Object>) map, jSONObject, (Map<String, ? extends Object>) map2, (Map<String, String>) map3, num, z11, z12);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ u execute$default(SendOwnerRequest sendOwnerRequest, HttpMethodType httpMethodType, String str, Map map, String str2, Map map2, Map map3, Integer num, boolean z11, boolean z12, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: execute");
            }
            if ((i11 & 4) != 0) {
                map = null;
            }
            if ((i11 & 8) != 0) {
                str2 = null;
            }
            if ((i11 & 16) != 0) {
                map2 = null;
            }
            if ((i11 & 32) != 0) {
                map3 = null;
            }
            if ((i11 & 64) != 0) {
                num = 15;
            }
            if ((i11 & 128) != 0) {
                z11 = true;
            }
            if ((i11 & 256) != 0) {
                z12 = false;
            }
            return sendOwnerRequest.execute(httpMethodType, str, (Map<String, ? extends Object>) map, str2, (Map<String, ? extends Object>) map2, (Map<String, String>) map3, num, z11, z12);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ u execute$default(SendOwnerRequest sendOwnerRequest, String str, String str2, Map map, JSONObject jSONObject, Map map2, Map map3, Integer num, boolean z11, boolean z12, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: execute");
            }
            if ((i11 & 4) != 0) {
                map = null;
            }
            if ((i11 & 8) != 0) {
                jSONObject = null;
            }
            if ((i11 & 16) != 0) {
                map2 = null;
            }
            if ((i11 & 32) != 0) {
                map3 = null;
            }
            if ((i11 & 64) != 0) {
                num = 15;
            }
            if ((i11 & 128) != 0) {
                z11 = true;
            }
            if ((i11 & 256) != 0) {
                z12 = false;
            }
            return sendOwnerRequest.execute(str, str2, (Map<String, ? extends Object>) map, jSONObject, (Map<String, ? extends Object>) map2, (Map<String, String>) map3, num, z11, z12);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ u execute$default(SendOwnerRequest sendOwnerRequest, String str, String str2, Map map, Map map2, Map map3, Map map4, Integer num, boolean z11, boolean z12, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: execute");
            }
            if ((i11 & 4) != 0) {
                map = null;
            }
            if ((i11 & 8) != 0) {
                map2 = null;
            }
            if ((i11 & 16) != 0) {
                map3 = null;
            }
            if ((i11 & 32) != 0) {
                map4 = null;
            }
            if ((i11 & 64) != 0) {
                num = 15;
            }
            if ((i11 & 128) != 0) {
                z11 = true;
            }
            if ((i11 & 256) != 0) {
                z12 = false;
            }
            return sendOwnerRequest.execute(str, str2, (Map<String, ? extends Object>) map, (Map<String, ? extends Object>) map2, (Map<String, ? extends Object>) map3, (Map<String, String>) map4, num, z11, z12);
        }
    }

    static SendOwnerRequest newInstance(Context context, RemoteTeslaDataSource remoteTeslaDataSource, AuthRepository authRepository) {
        return INSTANCE.newInstance(context, remoteTeslaDataSource, authRepository);
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tesla/oapi/SendOwnerRequest$Companion;", "", "<init>", "()V", "DEFAULT_TIMEOUT_SECONDS", "", "newInstance", "Lcom/tesla/oapi/SendOwnerRequest;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "remote", "Lcom/tesla/oapi/RemoteTeslaDataSource;", "authRepository", "Lcom/tesla/oapi/auth/AuthRepository;", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final int DEFAULT_TIMEOUT_SECONDS = 15;

        private Companion() {
        }

        public final SendOwnerRequest newInstance(Context context) {
            s.k(context, "context");
            Context applicationContext = context.getApplicationContext();
            s.h(applicationContext);
            return newInstance(context, OwnerDataModule.getRemoteTeslaDataSource(applicationContext), OwnerDataModule.getAuthRepository());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final SendOwnerRequest newInstance(Context context, RemoteTeslaDataSource remote, AuthRepository authRepository) {
            s.k(context, "context");
            s.k(remote, "remote");
            s.k(authRepository, "authRepository");
            Context applicationContext = context.getApplicationContext();
            kd0.e eVarA = kd0.e.INSTANCE.a();
            s.h(applicationContext);
            return new TeslaSendOwnerRequest(remote, authRepository, eVarA, (CachedResponseListener) applicationContext, (ProductsResponseListener) applicationContext, be0.e.INSTANCE.a(), applicationContext);
        }
    }
}
