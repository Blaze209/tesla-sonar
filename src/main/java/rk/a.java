package rk;

import androidx.annotation.NonNull;
import ch.qos.logback.core.CoreConstants;
import java.util.Locale;
import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u000bR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000e¨\u0006\u0010"}, d2 = {"Lrk/a;", "", "<init>", "()V", "", "mimeType", "", "c", "(Ljava/lang/String;)Z", "path", "b", "(Ljava/lang/String;)Ljava/lang/String;", "a", "", "Ljava/util/Map;", "ADDITIONAL_ALLOWED_MIME_TYPES", "fbcore_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f108506a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Map<String, String> ADDITIONAL_ALLOWED_MIME_TYPES = v0.m(x.a("mkv", "video/x-matroska"), x.a("glb", "model/gltf-binary"));

    private a() {
    }

    private final String a(@NonNull String path) {
        int iB0 = t.B0(path, CoreConstants.DOT, 0, false, 6, null);
        if (iB0 < 0 || iB0 == path.length() - 1) {
            return null;
        }
        String strSubstring = path.substring(iB0 + 1);
        s.j(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final String b(@NonNull String path) {
        s.k(path, "path");
        String strA = f108506a.a(path);
        if (strA == null) {
            return null;
        }
        Locale US = Locale.US;
        s.j(US, "US");
        String lowerCase = strA.toLowerCase(US);
        s.j(lowerCase, "toLowerCase(...)");
        if (lowerCase == null) {
            return null;
        }
        String strA2 = b.a(lowerCase);
        return strA2 == null ? ADDITIONAL_ALLOWED_MIME_TYPES.get(lowerCase) : strA2;
    }

    public static final boolean c(String mimeType) {
        if (mimeType != null) {
            return t.b0(mimeType, "video/", false, 2, null);
        }
        return false;
    }
}
