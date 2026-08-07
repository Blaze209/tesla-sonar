package freemarker.core;

/* JADX INFO: loaded from: classes8.dex */
public class NonDateException extends UnexpectedTypeException {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Class[] f66437l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static /* synthetic */ Class f66438m;

    static {
        Class clsL = f66438m;
        if (clsL == null) {
            clsL = l("freemarker.template.TemplateDateModel");
            f66438m = clsL;
        }
        f66437l = new Class[]{clsL};
    }

    static /* synthetic */ Class l(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e11) {
            throw new NoClassDefFoundError().initCause(e11);
        }
    }
}
