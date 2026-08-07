package p7;

import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final HashSet<String> f101252a = new HashSet<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f101253b = "media3.common";

    public static synchronized void a(String str) {
        if (f101252a.add(str)) {
            f101253b += ", " + str;
        }
    }

    public static synchronized String b() {
        return f101253b;
    }
}
