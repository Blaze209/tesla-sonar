package freemarker.core;

/* JADX INFO: loaded from: classes8.dex */
public class NonHashException extends UnexpectedTypeException {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Class[] f66441l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static /* synthetic */ Class f66442m;

    static {
        Class clsL = f66442m;
        if (clsL == null) {
            clsL = l("freemarker.template.TemplateHashModel");
            f66442m = clsL;
        }
        f66441l = new Class[]{clsL};
    }

    static /* synthetic */ Class l(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e11) {
            throw new NoClassDefFoundError().initCause(e11);
        }
    }
}
