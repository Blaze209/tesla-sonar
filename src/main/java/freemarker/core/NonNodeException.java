package freemarker.core;

/* JADX INFO: loaded from: classes8.dex */
public class NonNodeException extends UnexpectedTypeException {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Class[] f66445l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static /* synthetic */ Class f66446m;

    static {
        Class clsL = f66446m;
        if (clsL == null) {
            clsL = l("freemarker.template.TemplateNodeModel");
            f66446m = clsL;
        }
        f66445l = new Class[]{clsL};
    }

    static /* synthetic */ Class l(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e11) {
            throw new NoClassDefFoundError().initCause(e11);
        }
    }
}
