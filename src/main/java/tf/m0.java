package tf;

import com.airbnb.lottie.LottieAnimationView;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class m0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LottieAnimationView f113375b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, String> f113374a = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f113377d = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.p f113376c = null;

    public m0(LottieAnimationView lottieAnimationView) {
        this.f113375b = lottieAnimationView;
    }

    private void d() {
        LottieAnimationView lottieAnimationView = this.f113375b;
        if (lottieAnimationView != null) {
            lottieAnimationView.invalidate();
        }
        com.airbnb.lottie.p pVar = this.f113376c;
        if (pVar != null) {
            pVar.invalidateSelf();
        }
    }

    public String b(String str, String str2) {
        return a(str2);
    }

    public final String c(String str, String str2) {
        if (this.f113377d && this.f113374a.containsKey(str2)) {
            return this.f113374a.get(str2);
        }
        String strB = b(str, str2);
        if (this.f113377d) {
            this.f113374a.put(str2, strB);
        }
        return strB;
    }

    public void e(String str, String str2) {
        this.f113374a.put(str, str2);
        d();
    }

    public String a(String str) {
        return str;
    }
}
