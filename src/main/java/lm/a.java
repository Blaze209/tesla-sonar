package lm;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import okhttp3.OkHttpClient;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import pm.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Llm/a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lokhttp3/OkHttpClient;", "okHttpClient", "Lpm/u$a;", "a", "(Landroid/content/Context;Lokhttp3/OkHttpClient;)Lpm/u$a;", "imagepipeline-okhttp3_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f90264a = new a();

    private a() {
    }

    public static final u.a a(Context context, OkHttpClient okHttpClient) {
        s.k(context, "context");
        s.k(okHttpClient, "okHttpClient");
        return u.INSTANCE.i(context).S(new com.facebook.imagepipeline.backends.okhttp3.a(okHttpClient));
    }
}
