package freemarker.core;

/* JADX INFO: loaded from: classes8.dex */
public class NonSequenceOrCollectionException extends UnexpectedTypeException {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Class[] f66451l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static /* synthetic */ Class f66452m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static /* synthetic */ Class f66453n;

    static {
        Class clsL = f66452m;
        if (clsL == null) {
            clsL = l("freemarker.template.TemplateSequenceModel");
            f66452m = clsL;
        }
        Class clsL2 = f66453n;
        if (clsL2 == null) {
            clsL2 = l("freemarker.template.TemplateCollectionModel");
            f66453n = clsL2;
        }
        f66451l = new Class[]{clsL, clsL2};
    }

    static /* synthetic */ Class l(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e11) {
            throw new NoClassDefFoundError().initCause(e11);
        }
    }
}
