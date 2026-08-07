package freemarker.core;

import freemarker.template.Template;

/* JADX INFO: loaded from: classes8.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f66498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f66499b;

    public abstract String a();

    public final String b() {
        return a();
    }

    public Template c() {
        return null;
    }

    public String toString() {
        String strB;
        try {
            strB = b();
        } catch (Exception unused) {
            strB = null;
        }
        return strB != null ? strB : a();
    }
}
