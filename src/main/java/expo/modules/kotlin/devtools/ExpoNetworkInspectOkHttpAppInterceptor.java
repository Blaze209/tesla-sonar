package expo.modules.kotlin.devtools;

import okhttp3.Interceptor;
import okhttp3.Response;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lexpo/modules/kotlin/devtools/ExpoNetworkInspectOkHttpAppInterceptor;", "Lokhttp3/Interceptor;", "<init>", "()V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ExpoNetworkInspectOkHttpAppInterceptor implements Interceptor {
    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        s.k(chain, "chain");
        return chain.proceed(chain.request().newBuilder().tag(RedirectResponse.class, new RedirectResponse()).build());
    }
}
