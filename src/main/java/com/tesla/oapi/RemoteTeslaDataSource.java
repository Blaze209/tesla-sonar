package com.tesla.oapi;

import com.google.android.gms.common.internal.ImagesContract;
import io.reactivex.rxjava3.core.u;
import java.util.List;
import java.util.Map;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import retrofit2.y;
import sr0.h;
import sr0.j;
import sr0.k;
import sr0.l;
import sr0.n;
import sr0.o;
import sr0.p;
import sr0.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001JQ\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\u0014\b\u0003\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H'¢\u0006\u0004\b\n\u0010\u000bJ[\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\f2\u0014\b\u0003\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H'¢\u0006\u0004\b\u000e\u0010\u000fJa\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\u000e\b\u0001\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0014\b\u0003\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H'¢\u0006\u0004\b\u0012\u0010\u0013J[\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\f2\u0014\b\u0003\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H'¢\u0006\u0004\b\u0014\u0010\u000fJ[\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\f2\u0014\b\u0003\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H'¢\u0006\u0004\b\u0015\u0010\u000fJ[\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\f2\u0014\b\u0003\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H'¢\u0006\u0004\b\u0016\u0010\u000fJQ\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\u0014\b\u0003\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H'¢\u0006\u0004\b\u0017\u0010\u000bJ[\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\f2\u0014\b\u0003\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H'¢\u0006\u0004\b\u0018\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/tesla/oapi/RemoteTeslaDataSource;", "", "", ImagesContract.URL, "", "params", "headers", "Lio/reactivex/rxjava3/core/u;", "Lretrofit2/y;", "Lokhttp3/ResponseBody;", "get", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lio/reactivex/rxjava3/core/u;", "Lokhttp3/RequestBody;", "body", "post", "(Ljava/lang/String;Ljava/util/Map;Lokhttp3/RequestBody;Ljava/util/Map;)Lio/reactivex/rxjava3/core/u;", "", "Lokhttp3/MultipartBody$Part;", "postMultipart", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;)Lio/reactivex/rxjava3/core/u;", "put", "patch", "patchWithoutCompression", "delete", "deleteWithBody", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface RemoteTeslaDataSource {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ u delete$default(RemoteTeslaDataSource remoteTeslaDataSource, String str, Map map, Map map2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
            }
            if ((i11 & 4) != 0) {
                map2 = v0.i();
            }
            return remoteTeslaDataSource.delete(str, map, map2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ u deleteWithBody$default(RemoteTeslaDataSource remoteTeslaDataSource, String str, Map map, RequestBody requestBody, Map map2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteWithBody");
            }
            if ((i11 & 8) != 0) {
                map2 = v0.i();
            }
            return remoteTeslaDataSource.deleteWithBody(str, map, requestBody, map2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ u get$default(RemoteTeslaDataSource remoteTeslaDataSource, String str, Map map, Map map2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get");
            }
            if ((i11 & 4) != 0) {
                map2 = v0.i();
            }
            return remoteTeslaDataSource.get(str, map, map2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ u patch$default(RemoteTeslaDataSource remoteTeslaDataSource, String str, Map map, RequestBody requestBody, Map map2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: patch");
            }
            if ((i11 & 8) != 0) {
                map2 = v0.i();
            }
            return remoteTeslaDataSource.patch(str, map, requestBody, map2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ u patchWithoutCompression$default(RemoteTeslaDataSource remoteTeslaDataSource, String str, Map map, RequestBody requestBody, Map map2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: patchWithoutCompression");
            }
            if ((i11 & 8) != 0) {
                map2 = v0.i();
            }
            return remoteTeslaDataSource.patchWithoutCompression(str, map, requestBody, map2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ u post$default(RemoteTeslaDataSource remoteTeslaDataSource, String str, Map map, RequestBody requestBody, Map map2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: post");
            }
            if ((i11 & 8) != 0) {
                map2 = v0.i();
            }
            return remoteTeslaDataSource.post(str, map, requestBody, map2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ u postMultipart$default(RemoteTeslaDataSource remoteTeslaDataSource, String str, Map map, List list, Map map2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postMultipart");
            }
            if ((i11 & 8) != 0) {
                map2 = v0.i();
            }
            return remoteTeslaDataSource.postMultipart(str, map, list, map2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ u put$default(RemoteTeslaDataSource remoteTeslaDataSource, String str, Map map, RequestBody requestBody, Map map2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: put");
            }
            if ((i11 & 8) != 0) {
                map2 = v0.i();
            }
            return remoteTeslaDataSource.put(str, map, requestBody, map2);
        }
    }

    @sr0.b
    u<y<ResponseBody>> delete(@sr0.y String url, @sr0.u Map<String, String> params, @j Map<String, String> headers);

    @h(hasBody = true, method = "DELETE")
    u<y<ResponseBody>> deleteWithBody(@sr0.y String url, @sr0.u Map<String, String> params, @sr0.a RequestBody body, @j Map<String, String> headers);

    @sr0.f
    u<y<ResponseBody>> get(@sr0.y String url, @sr0.u Map<String, String> params, @j Map<String, String> headers);

    @n
    u<y<ResponseBody>> patch(@sr0.y String url, @sr0.u Map<String, String> params, @sr0.a RequestBody body, @j Map<String, String> headers);

    @n
    u<y<ResponseBody>> patchWithoutCompression(@sr0.y String url, @sr0.u Map<String, String> params, @sr0.a RequestBody body, @j Map<String, String> headers);

    @o
    u<y<ResponseBody>> post(@sr0.y String url, @sr0.u Map<String, String> params, @sr0.a RequestBody body, @j Map<String, String> headers);

    @k({"Content-Encoding: utf-8"})
    @o
    @l
    u<y<ResponseBody>> postMultipart(@sr0.y String url, @sr0.u Map<String, String> params, @q List<MultipartBody.Part> body, @j Map<String, String> headers);

    @p
    u<y<ResponseBody>> put(@sr0.y String url, @sr0.u Map<String, String> params, @sr0.a RequestBody body, @j Map<String, String> headers);
}
