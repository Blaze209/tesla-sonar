package kb;

import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: loaded from: classes3.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WebSettingsBoundaryInterface f85801a;

    public m(WebSettingsBoundaryInterface webSettingsBoundaryInterface) {
        this.f85801a = webSettingsBoundaryInterface;
    }

    public void a(int i11) {
        this.f85801a.setForceDark(i11);
    }

    public void b(int i11) {
        this.f85801a.setForceDarkBehavior(i11);
    }

    public void c(boolean z11) {
        this.f85801a.setPaymentRequestEnabled(z11);
    }
}
