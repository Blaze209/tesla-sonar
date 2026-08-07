package aj0;

import android.net.Uri;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a%\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "baseUrl", "oneTimeLinkCode", "componentName", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class o1 {
    public static final String a(String baseUrl, String oneTimeLinkCode, String componentName) {
        p013kotlin.jvm.internal.s.k(baseUrl, "baseUrl");
        p013kotlin.jvm.internal.s.k(oneTimeLinkCode, "oneTimeLinkCode");
        p013kotlin.jvm.internal.s.k(componentName, "componentName");
        String string = Uri.parse(baseUrl).buildUpon().appendQueryParameter("code", oneTimeLinkCode).appendQueryParameter("component", componentName).build().toString();
        p013kotlin.jvm.internal.s.j(string, "toString(...)");
        return string;
    }
}
