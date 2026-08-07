package androidx.work;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0006\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005¨\u0006\u0007"}, d2 = {"", "className", "Landroidx/work/o;", "a", "(Ljava/lang/String;)Landroidx/work/o;", "Ljava/lang/String;", "TAG", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f14729a;

    static {
        String strI = z.i("InputMerger");
        p013kotlin.jvm.internal.s.j(strI, "tagWithPrefix(...)");
        f14729a = strI;
    }

    public static final o a(String className) {
        p013kotlin.jvm.internal.s.k(className, "className");
        try {
            Object objNewInstance = Class.forName(className).getDeclaredConstructor(null).newInstance(null);
            p013kotlin.jvm.internal.s.i(objNewInstance, "null cannot be cast to non-null type androidx.work.InputMerger");
            return (o) objNewInstance;
        } catch (Exception e11) {
            z.e().d(f14729a, "Trouble instantiating " + className, e11);
            return null;
        }
    }
}
