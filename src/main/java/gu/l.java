package gu;

import hu.l0;

/* JADX INFO: loaded from: classes5.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l0 f69561a = new l0("SplitInstallInfoProvider");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f69562b = 0;

    public static String a(String str) {
        return str.startsWith("config.") ? "" : str.split("\\.config\\.", 2)[0];
    }

    public static boolean b(String str) {
        return str.startsWith("config.") || str.contains(".config.");
    }
}
