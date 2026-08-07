package freemarker.core;

/* JADX INFO: loaded from: classes8.dex */
public class NonSequenceException extends UnexpectedTypeException {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Class[] f66449l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static /* synthetic */ Class f66450m;

    static {
        Class clsL = f66450m;
        if (clsL == null) {
            clsL = l("freemarker.template.TemplateSequenceModel");
            f66450m = clsL;
        }
        f66449l = new Class[]{clsL};
    }

    static /* synthetic */ Class l(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e11) {
            throw new NoClassDefFoundError().initCause(e11);
        }
    }
}
