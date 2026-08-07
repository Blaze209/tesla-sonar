package q9;

import com.reactnativecommunity.clipboard.ClipboardModule;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p7.g0;

/* JADX INFO: loaded from: classes3.dex */
final class k {
    public static String a(List<w> list) {
        Iterator<w> it = list.iterator();
        boolean z11 = false;
        String str = null;
        while (it.hasNext()) {
            String str2 = it.next().f105110a.f105081g.f101544o;
            if (g0.t(str2)) {
                return "video/mp4";
            }
            if (g0.o(str2)) {
                z11 = true;
            } else if (g0.q(str2)) {
                if (Objects.equals(str2, ClipboardModule.MIMETYPE_HEIC)) {
                    str = ClipboardModule.MIMETYPE_HEIF;
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        if (z11) {
            return "audio/mp4";
        }
        return str != null ? str : "application/mp4";
    }

    public static String b(p7.u uVar) {
        String str = uVar.f101544o;
        if (g0.t(str)) {
            return "video/mp4";
        }
        if (g0.o(str)) {
            return "audio/mp4";
        }
        if (!g0.q(str)) {
            return "application/mp4";
        }
        if (Objects.equals(str, ClipboardModule.MIMETYPE_HEIC)) {
            return ClipboardModule.MIMETYPE_HEIF;
        }
        return Objects.equals(str, "image/avif") ? "image/avif" : "application/mp4";
    }
}
