package uj0;

import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: uj0.b, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B3\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u0017"}, d2 = {"Luj0/b;", "", "", "", "Ljp0/b;", "standardOperations", "Ljp0/a;", "functionalOperations", "<init>", "(Ljava/util/Map;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class LogicOperations {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<String, jp0.b> standardOperations;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<String, jp0.a> functionalOperations;

    /* JADX WARN: Multi-variable type inference failed */
    public LogicOperations(Map<String, ? extends jp0.b> standardOperations, Map<String, ? extends jp0.a> functionalOperations) {
        s.k(standardOperations, "standardOperations");
        s.k(functionalOperations, "functionalOperations");
        this.standardOperations = standardOperations;
        this.functionalOperations = functionalOperations;
    }

    public final Map<String, jp0.a> a() {
        return this.functionalOperations;
    }

    public final Map<String, jp0.b> b() {
        return this.standardOperations;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LogicOperations)) {
            return false;
        }
        LogicOperations logicOperations = (LogicOperations) other;
        return s.f(this.standardOperations, logicOperations.standardOperations) && s.f(this.functionalOperations, logicOperations.functionalOperations);
    }

    public int hashCode() {
        return (this.standardOperations.hashCode() * 31) + this.functionalOperations.hashCode();
    }

    public String toString() {
        return "LogicOperations(standardOperations=" + this.standardOperations + ", functionalOperations=" + this.functionalOperations + ")";
    }
}
