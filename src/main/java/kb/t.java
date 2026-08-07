package kb;

import android.webkit.WebSettings;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: loaded from: classes3.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WebkitToCompatConverterBoundaryInterface f85854a;

    public t(WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.f85854a = webkitToCompatConverterBoundaryInterface;
    }

    public m a(WebSettings webSettings) {
        return new m((WebSettingsBoundaryInterface) oq0.a.a(WebSettingsBoundaryInterface.class, this.f85854a.convertSettings(webSettings)));
    }
}
