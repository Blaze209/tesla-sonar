package w8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f121223c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f121224a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f121225b = -1;

    private boolean b(String str) {
        Matcher matcher = f121223c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int i11 = Integer.parseInt((String) s7.q0.l(matcher.group(1)), 16);
            int i12 = Integer.parseInt((String) s7.q0.l(matcher.group(2)), 16);
            if (i11 <= 0 && i12 <= 0) {
                return false;
            }
            this.f121224a = i11;
            this.f121225b = i12;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public boolean a() {
        return (this.f121224a == -1 || this.f121225b == -1) ? false : true;
    }

    public boolean c(p7.f0 f0Var) {
        for (int i11 = 0; i11 < f0Var.e(); i11++) {
            p7.f0.a aVarD = f0Var.d(i11);
            if (aVarD instanceof k9.e) {
                k9.e eVar = (k9.e) aVarD;
                if ("iTunSMPB".equals(eVar.f85415c) && b(eVar.f85416d)) {
                    return true;
                }
            } else if (aVarD instanceof k9.k) {
                k9.k kVar = (k9.k) aVarD;
                if ("com.apple.iTunes".equals(kVar.f85428b) && "iTunSMPB".equals(kVar.f85429c) && b(kVar.f85430d)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
