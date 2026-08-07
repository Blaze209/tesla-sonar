package freemarker.core;

/* JADX INFO: loaded from: classes8.dex */
public class NonMethodException extends UnexpectedTypeException {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Class[] f66443l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static /* synthetic */ Class f66444m;

    static {
        Class clsL = f66444m;
        if (clsL == null) {
            clsL = l("freemarker.template.TemplateMethodModel");
            f66444m = clsL;
        }
        f66443l = new Class[]{clsL};
    }

    static /* synthetic */ Class l(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e11) {
            throw new NoClassDefFoundError().initCause(e11);
        }
    }
}
