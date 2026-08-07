package freemarker.core;

/* JADX INFO: loaded from: classes8.dex */
public class NonExtendedHashException extends UnexpectedTypeException {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Class[] f66439l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static /* synthetic */ Class f66440m;

    static {
        Class clsL = f66440m;
        if (clsL == null) {
            clsL = l("freemarker.template.TemplateHashModelEx");
            f66440m = clsL;
        }
        f66439l = new Class[]{clsL};
    }

    static /* synthetic */ Class l(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e11) {
            throw new NoClassDefFoundError().initCause(e11);
        }
    }
}
