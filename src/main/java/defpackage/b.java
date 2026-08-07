package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Map;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u0000\u001a\u00020\u000b2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00062\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0000\u0010\fJ\u0019\u0010\u000e\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\b*\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0012\u001a\u00020\u000b2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00062\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0012\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lb;", "Lh;", "Lj;", "evaluator", "<init>", "(Lj;)V", "", "", "", "expression", "data", "Li;", "(Ljava/util/Map;Ljava/lang/Object;)Li;", "evaluatedValue", "c", "(Ljava/lang/Object;)Li;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;)Ljava/lang/Object;", "a", "Lj;", "core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j evaluator;

    public b(j evaluator) {
        s.k(evaluator, "evaluator");
        this.evaluator = evaluator;
    }

    private final i b(Map<String, ? extends Object> expression, Object data) {
        Object objB;
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            objB = jn0.s.b(this.evaluator.a(expression, data));
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(t.a(th2));
        }
        return jn0.s.e(objB) == null ? c(objB) : i.a.b.f73721a;
    }

    private final i c(Object evaluatedValue) {
        return evaluatedValue != null ? new i.Success(d(evaluatedValue)) : i.a.c.f73722a;
    }

    private final Object d(Object obj) {
        if (!(obj instanceof Double)) {
            return obj;
        }
        Number number = (Number) obj;
        double dDoubleValue = number.doubleValue() % 1.0d;
        if (dDoubleValue != 0.0d && Math.signum(dDoubleValue) != Math.signum(1.0d)) {
            dDoubleValue += 1.0d;
        }
        return dDoubleValue == 0.0d ? Long.valueOf((long) number.doubleValue()) : obj;
    }

    @Override // defpackage.h
    public i a(Map<String, ? extends Object> expression, Object data) {
        i iVarB;
        s.k(expression, "expression");
        return ((!expression.isEmpty() ? expression : null) == null || (iVarB = b(expression, data)) == null) ? i.a.C1546a.f73720a : iVarB;
    }
}
