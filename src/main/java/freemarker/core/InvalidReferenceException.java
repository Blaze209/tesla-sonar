package freemarker.core;

import freemarker.template.TemplateException;

/* JADX INFO: loaded from: classes8.dex */
public class InvalidReferenceException extends TemplateException {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final InvalidReferenceException f66432l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String[] f66433m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String[] f66434n;

    static {
        c cVarC = c.c();
        try {
            c.h(null);
            f66432l = new InvalidReferenceException("Invalid reference. Details are unavilable, as this should have been handled by an FTL construct. If it wasn't, that's problably a bug in FreeMarker.", null);
            c.h(cVarC);
            f66433m = new String[]{"If the failing expression is known to be legally refer to something that's sometimes null or missing, either specify a default value like myOptionalVar!myDefault, or use ", "<#if myOptionalVar??>", "when-present", "<#else>", "when-missing", "</#if>", ". (These only cover the last step of the expression; to cover the whole expression, use parenthesis: (myOptionalVar.foo)!myDefault, (myOptionalVar.foo)??"};
            f66434n = new String[]{"If the target variable is known to be legally null or missing sometimes, instead of something like ", "<#assign x += 1>", ", you could write ", "<#if x??>", "<#assign x += 1>", "</#if>", " or ", "<#assign x = (x!0) + 1>"};
        } catch (Throwable th2) {
            c.h(cVarC);
            throw th2;
        }
    }

    public InvalidReferenceException(String str, c cVar) {
        super(str, cVar);
    }
}
