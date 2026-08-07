package net.time4j.engine;

/* JADX INFO: loaded from: classes9.dex */
public class RuleNotFoundException extends ChronoException {
    private static final long serialVersionUID = -5638437652574160520L;

    RuleNotFoundException(w<?> wVar, p<?> pVar) {
        super(b(wVar, pVar));
    }

    private static String a(w<?> wVar, Object obj) {
        return "Cannot find any rule for chronological unit \"" + c(obj) + "\" in: " + wVar.p().getName();
    }

    private static String b(w<?> wVar, p<?> pVar) {
        return "Cannot find any rule for chronological element \"" + pVar.name() + "\" in: " + wVar.p().getName();
    }

    private static String c(Object obj) {
        return obj instanceof Enum ? ((Enum) Enum.class.cast(obj)).name() : obj.toString();
    }

    RuleNotFoundException(String str) {
        super(str);
    }

    RuleNotFoundException(w<?> wVar, Object obj) {
        super(a(wVar, obj));
    }
}
