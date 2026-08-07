package freemarker.core;

/* JADX INFO: loaded from: classes8.dex */
public class NonStringException extends UnexpectedTypeException {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final Class[] f66454l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static /* synthetic */ Class f66455m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static /* synthetic */ Class f66456n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static /* synthetic */ Class f66457o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static /* synthetic */ Class f66458p;

    static {
        Class clsL = f66455m;
        if (clsL == null) {
            clsL = l("freemarker.template.TemplateScalarModel");
            f66455m = clsL;
        }
        Class clsL2 = f66456n;
        if (clsL2 == null) {
            clsL2 = l("freemarker.template.TemplateNumberModel");
            f66456n = clsL2;
        }
        Class clsL3 = f66457o;
        if (clsL3 == null) {
            clsL3 = l("freemarker.template.TemplateDateModel");
            f66457o = clsL3;
        }
        Class clsL4 = f66458p;
        if (clsL4 == null) {
            clsL4 = l("freemarker.template.TemplateBooleanModel");
            f66458p = clsL4;
        }
        f66454l = new Class[]{clsL, clsL2, clsL3, clsL4};
    }

    static /* synthetic */ Class l(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e11) {
            throw new NoClassDefFoundError().initCause(e11);
        }
    }
}
