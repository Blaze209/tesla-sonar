package p010i90;

import org.webrtc.WebrtcBuildVersion;
import p013kotlin.Metadata;
import p013kotlin.text.a;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0015\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "input", "a", "(Ljava/lang/String;)Ljava/lang/String;", "stripe-ui-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class s {
    public static final String a(String input) {
        p013kotlin.jvm.internal.s.k(input, "input");
        String str = WebrtcBuildVersion.maint_version + input;
        if ((t.y0(input) || input.charAt(0) == '0' || input.charAt(0) == '1') && (input.length() <= 1 || input.charAt(0) != '1' || a.f(input.charAt(1)) <= 2)) {
            str = null;
        }
        return str == null ? input : str;
    }
}
