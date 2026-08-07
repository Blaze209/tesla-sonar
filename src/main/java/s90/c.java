package s90;

import android.net.Uri;
import com.google.android.gms.common.internal.ImagesContract;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ls90/c;", "", "<init>", "()V", "", ImagesContract.URL, "", "a", "(Ljava/lang/String;)Z", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f110652a = new c();

    private c() {
    }

    public final boolean a(String url) {
        s.k(url, "url");
        Uri uri = Uri.parse(url);
        if (!s.f(uri.getScheme(), "https")) {
            return false;
        }
        String host = uri.getHost();
        if (s.f(host, "stripe.com")) {
            return true;
        }
        return host != null ? t.L(host, ".stripe.com", false, 2, null) : false;
    }
}
