package yc;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Locale;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lyc/v;", "", "<init>", "()V", "", ImagesContract.URL, "b", "(Ljava/lang/String;)Ljava/lang/String;", "extension", "a", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f125365a = new v();

    private v() {
    }

    public final String a(String extension) {
        if (p013kotlin.text.t.y0(extension)) {
            return null;
        }
        String lowerCase = extension.toLowerCase(Locale.ROOT);
        p013kotlin.jvm.internal.s.j(lowerCase, "toLowerCase(...)");
        String str = (String) w.f125366a.get(lowerCase);
        return str == null ? x.a(lowerCase) : str;
    }

    public final String b(String url) {
        if (p013kotlin.text.t.y0(url)) {
            return null;
        }
        return a(p013kotlin.text.t.s1(p013kotlin.text.t.u1(p013kotlin.text.t.C1(p013kotlin.text.t.C1(url, '#', null, 2, null), '?', null, 2, null), '/', null, 2, null), CoreConstants.DOT, ""));
    }
}
