package nn;

import okhttp3.Call;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lnn/a;", "", "<init>", "()V", "Lokhttp3/OkHttpClient;", "client", "tag", "Ljn0/h0;", "a", "(Lokhttp3/OkHttpClient;Ljava/lang/Object;)V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f95229a = new a();

    private a() {
    }

    public static final void a(OkHttpClient client, Object tag) {
        s.k(client, "client");
        s.k(tag, "tag");
        Dispatcher dispatcher = client.getDispatcher();
        for (Call call : dispatcher.queuedCalls()) {
            if (s.f(tag, call.request().tag())) {
                call.cancel();
                return;
            }
        }
        for (Call call2 : dispatcher.runningCalls()) {
            if (s.f(tag, call2.request().tag())) {
                call2.cancel();
                return;
            }
        }
    }
}
