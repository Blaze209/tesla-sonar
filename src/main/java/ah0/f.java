package ah0;

import android.content.Context;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lah0/f;", "", "<init>", "()V", "", ImagesContract.URL, "Landroid/net/Uri;", "c", "(Ljava/lang/String;)Landroid/net/Uri;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", DateTokenConverter.CONVERTER_KEY, "(Landroid/content/Context;)Z", "a", "(Ljava/lang/String;)Ljava/lang/String;", "b", "()Ljava/lang/String;", "integration_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f1063a = new f();

    private f() {
    }

    private final Uri c(String url) throws UnsupportedEncodingException {
        String strDecode = URLDecoder.decode(Uri.parse(url).getQueryParameter("redirect_uri"), p013kotlin.text.d.UTF_8.name());
        s.j(strDecode, "decode(...)");
        return Uri.parse(strDecode);
    }

    public final String a(String url) throws UnsupportedEncodingException {
        s.k(url, "url");
        Uri uriC = c(url);
        String host = uriC.getHost();
        if (host == null) {
            return "withpersona.com";
        }
        int port = uriC.getPort();
        if (port == -1) {
            return host;
        }
        return host + ":" + port;
    }

    public final String b() {
        return "/integrations/eid-easy-complete/close";
    }

    public final boolean d(Context context) {
        s.k(context, "context");
        String strC = androidx.browser.customtabs.c.c(context, null);
        if (strC == null) {
            return false;
        }
        return androidx.browser.customtabs.c.isAuthTabSupported(context, strC);
    }
}
