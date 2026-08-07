package yc0;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lyc0/k;", "", "<init>", "()V", "", "bitmask", "", "a", "(Ljava/lang/String;)I", "json2proto_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f125370a = new k();

    private k() {
    }

    public final int a(String bitmask) {
        s.k(bitmask, "bitmask");
        String strSubstring = bitmask.substring(0, 1);
        s.j(strSubstring, "substring(...)");
        String strSubstring2 = bitmask.substring(1, 8);
        s.j(strSubstring2, "substring(...)");
        return Integer.parseInt(strSubstring2, p013kotlin.text.a.a(16)) + (Integer.parseInt(strSubstring, p013kotlin.text.a.a(16)) << 28);
    }
}
