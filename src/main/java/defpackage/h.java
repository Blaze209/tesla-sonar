package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Map;
import jn0.h0;
import jn0.x;
import jp0.b;
import np0.c;
import org.slf4j.Marker;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import tp0.e;
import tp0.f;
import tp0.g;
import uj0.LogicOperations;
import up0.d;
import wn0.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0007J/\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lh;", "", "", "", "expression", "data", "Li;", "a", "(Ljava/util/Map;Ljava/lang/Object;)Li;", "core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface h {

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0014\u001a\u00020\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\r¢\u0006\u0004\b\u0014\u0010\u0010J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017R&\u0010\u001b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001aR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001dR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001d¨\u0006 "}, d2 = {"Lh$a;", "", "<init>", "()V", "", "operationName", "", "f", "(Ljava/lang/String;)Z", "Ljp0/b;", "operation", "c", "(Ljava/lang/String;Ljp0/b;)Lh$a;", "", "operations", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/Map;)Lh$a;", "Ljp0/a;", "a", "(Ljava/lang/String;Ljp0/a;)Lh$a;", "b", "Lh;", "e", "()Lh;", "Lkotlin/Function1;", "Ljn0/h0;", "Lwn0/l;", "logger", "", "Ljava/util/Map;", "standardOperations", "functionalOperations", "core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private l<Object, h0> logger;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Map<String, b> standardOperations = v0.o(x.a("var", c.f95286a), x.a("missing_some", np0.b.f95285a), x.a("missing", np0.a.f95284a), x.a(">", up0.a.f116500a), x.a(">=", up0.b.f116502a), x.a("<", up0.c.f116504a), x.a("<=", d.f116506a), x.a("min", e.f114915a), x.a("max", tp0.d.f114913a), x.a(Marker.ANY_NON_NULL_MARKER, tp0.a.f114910a), x.a("-", tp0.h.f114920a), x.a(Marker.ANY_MARKER, g.f114918a), x.a("/", tp0.b.f114912a), x.a("%", f.f114917a), x.a("==", qp0.a.f105826a), x.a("!=", qp0.d.f105830a), x.a("===", rp0.b.f108688a), x.a("!==", rp0.a.f108686a), x.a("!", pp0.d.f103540a), x.a("!!", pp0.b.f103538a), x.a("and", pp0.a.f103537a), x.a("or", pp0.e.f103541a), x.a("if", pp0.c.f103539a), x.a("cat", wp0.a.f122179a), x.a("substr", wp0.c.f122180a), x.a("merge", lp0.e.f90662a), x.a("in", kp0.d.f89293a));

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Map<String, jp0.a> functionalOperations = v0.o(x.a("map", lp0.d.f90661a), x.a("filter", lp0.c.f90660a), x.a("reduce", lp0.g.f90663a), x.a("all", mp0.a.f92422a), x.a("none", mp0.b.f92423a), x.a("some", mp0.e.f92428a));

        private final boolean f(String operationName) {
            return (this.functionalOperations.containsKey(operationName) || this.standardOperations.containsKey(operationName)) ? false : true;
        }

        public final a a(String operationName, jp0.a operation) {
            s.k(operationName, "operationName");
            s.k(operation, "operation");
            if (f(operationName)) {
                this.functionalOperations.put(operationName, operation);
            }
            return this;
        }

        public final a b(Map<String, ? extends jp0.a> operations) {
            s.k(operations, "operations");
            for (Map.Entry<String, ? extends jp0.a> entry : operations.entrySet()) {
                a(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public final a c(String operationName, b operation) {
            s.k(operationName, "operationName");
            s.k(operation, "operation");
            if (f(operationName)) {
                this.standardOperations.put(operationName, operation);
            }
            return this;
        }

        public final a d(Map<String, ? extends b> operations) {
            s.k(operations, "operations");
            for (Map.Entry<String, ? extends b> entry : operations.entrySet()) {
                c(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public final h e() {
            this.standardOperations.put("log", new kp0.e(this.logger));
            return new b(new uj0.a(new LogicOperations(this.standardOperations, this.functionalOperations)));
        }
    }

    i a(Map<String, ? extends Object> expression, Object data);
}
