package go;

import android.net.Uri;
import android.os.SystemClock;
import com.facebook.imagepipeline.producers.t0;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.modules.network.i;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lgo/c;", "Lcom/facebook/imagepipeline/backends/okhttp3/a;", "Lokhttp3/OkHttpClient;", "okHttpClient", "<init>", "(Lokhttp3/OkHttpClient;)V", "Lcom/facebook/react/bridge/ReadableMap;", "readableMap", "", "", "p", "(Lcom/facebook/react/bridge/ReadableMap;)Ljava/util/Map;", "Lcom/facebook/imagepipeline/backends/okhttp3/a$b;", "fetchState", "Lcom/facebook/imagepipeline/producers/t0$a;", "callback", "Ljn0/h0;", "j", "(Lcom/facebook/imagepipeline/backends/okhttp3/a$b;Lcom/facebook/imagepipeline/producers/t0$a;)V", "e", "Lokhttp3/OkHttpClient;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c extends com.facebook.imagepipeline.backends.okhttp3.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final OkHttpClient okHttpClient;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f69252a;

        static {
            int[] iArr = new int[go.a.values().length];
            try {
                iArr[go.a.RELOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[go.a.FORCE_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[go.a.ONLY_IF_CACHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[go.a.DEFAULT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f69252a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(OkHttpClient okHttpClient) {
        super(okHttpClient);
        s.k(okHttpClient, "okHttpClient");
        this.okHttpClient = okHttpClient;
    }

    private final Map<String, String> p(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        HashMap map = new HashMap();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            String string = readableMap.getString(strNextKey);
            if (string != null) {
                map.put(strNextKey, string);
            }
        }
        return map;
    }

    @Override // com.facebook.imagepipeline.backends.okhttp3.a, com.facebook.imagepipeline.producers.t0
    /* JADX INFO: renamed from: j */
    public void c(com.facebook.imagepipeline.backends.okhttp3.a.b fetchState, t0.a callback) {
        Map<String, String> mapP;
        s.k(fetchState, "fetchState");
        s.k(callback, "callback");
        fetchState.submitTime = SystemClock.elapsedRealtime();
        Uri uriG = fetchState.g();
        s.j(uriG, "getUri(...)");
        CacheControl.Builder builder = new CacheControl.Builder();
        if (fetchState.b().B() instanceof b) {
            com.facebook.imagepipeline.request.a aVarB = fetchState.b().B();
            s.i(aVarB, "null cannot be cast to non-null type com.facebook.react.modules.fresco.ReactNetworkImageRequest");
            b bVar = (b) aVarB;
            mapP = p(bVar.getHeaders());
            int i11 = a.f69252a[bVar.getCacheControl().ordinal()];
            if (i11 == 1) {
                builder.noStore().noCache();
            } else if (i11 == 2) {
                builder.maxStale(Integer.MAX_VALUE, TimeUnit.SECONDS);
            } else if (i11 == 3) {
                builder.onlyIfCached().maxStale(Integer.MAX_VALUE, TimeUnit.SECONDS);
            } else {
                if (i11 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                builder.noStore();
            }
        } else {
            builder.noStore();
            mapP = null;
        }
        Headers headersB = i.b(mapP);
        Request.Builder builder2 = new Request.Builder();
        s.h(headersB);
        Request.Builder builderCacheControl = builder2.headers(headersB).cacheControl(builder.build());
        String string = uriG.toString();
        s.j(string, "toString(...)");
        k(fetchState, callback, builderCacheControl.url(string).get().build());
    }
}
