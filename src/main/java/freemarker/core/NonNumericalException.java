package freemarker.core;

/* JADX INFO: loaded from: classes8.dex */
public class NonNumericalException extends UnexpectedTypeException {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Class[] f66447l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static /* synthetic */ Class f66448m;

    static {
        Class clsL = f66448m;
        if (clsL == null) {
            clsL = l("freemarker.template.TemplateNumberModel");
            f66448m = clsL;
        }
        f66447l = new Class[]{clsL};
    }

    static /* synthetic */ Class l(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e11) {
            throw new NoClassDefFoundError().initCause(e11);
        }
    }
}
