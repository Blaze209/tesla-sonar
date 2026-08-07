package db0;

import jn0.m;
import okhttp3.OkHttpClient;
import p013kotlin.Lazy;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Ldb0/b;", "", "<init>", "()V", "Lokhttp3/OkHttpClient;", "b", "Lkotlin/Lazy;", "c", "()Lokhttp3/OkHttpClient;", "INSTANCE", "command_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f60354a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Lazy INSTANCE = m.b(new wn0.a() { // from class: db0.a
        @Override // wn0.a
        public final Object invoke() {
            return b.b();
        }
    });

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OkHttpClient b() {
        return new OkHttpClient.Builder().build();
    }

    public final OkHttpClient c() {
        return (OkHttpClient) INSTANCE.getValue();
    }
}
