package freemarker.core;

/* JADX INFO: loaded from: classes8.dex */
public class NonBooleanException extends UnexpectedTypeException {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Class[] f66435l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static /* synthetic */ Class f66436m;

    static {
        Class clsL = f66436m;
        if (clsL == null) {
            clsL = l("freemarker.template.TemplateBooleanModel");
            f66436m = clsL;
        }
        f66435l = new Class[]{clsL};
    }

    static /* synthetic */ Class l(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e11) {
            throw new NoClassDefFoundError().initCause(e11);
        }
    }
}
