package xf0;

import java.util.Locale;

/* JADX INFO: loaded from: classes8.dex */
public class k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static k f123488f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f123489a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f123490b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f123491c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f123492d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f123493e = "";

    public static k a() {
        if (f123488f == null) {
            f123488f = Locale.getDefault().toString().startsWith("zh") ? new l() : new m();
        }
        return f123488f;
    }
}
