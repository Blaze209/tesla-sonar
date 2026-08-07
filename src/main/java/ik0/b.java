package ik0;

import jk0.e;
import lk0.g;

/* JADX INFO: loaded from: classes8.dex */
public class b implements g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Class f78221g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f78222h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static /* synthetic */ Class f78223i;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e f78224e = new a(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f78225f = true;

    static {
        Class clsA = f78223i;
        if (clsA == null) {
            clsA = a("org.python.core.PyObject");
            f78223i = clsA;
        }
        f78221g = clsA;
        f78222h = new b();
    }

    static /* synthetic */ Class a(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e11) {
            throw new NoClassDefFoundError().initCause(e11);
        }
    }
}
