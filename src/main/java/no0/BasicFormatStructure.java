package no0;

import ch.qos.logback.core.CoreConstants;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: no0.e, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lno0/e;", "T", "Lno0/s;", "Lno0/l;", "directive", "<init>", "(Lno0/l;)V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lpo0/p;", "b", "()Lpo0/p;", "Loo0/e;", "a", "()Loo0/e;", "Lno0/l;", "c", "()Lno0/l;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class BasicFormatStructure<T> implements s<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l<T> directive;

    /* JADX WARN: Multi-variable type inference failed */
    public BasicFormatStructure(l<? super T> directive) {
        p013kotlin.jvm.internal.s.k(directive, "directive");
        this.directive = directive;
    }

    @Override // no0.o
    public oo0.e<T> a() {
        return this.directive.a();
    }

    @Override // no0.o
    public po0.p<T> b() {
        return this.directive.b();
    }

    public final l<T> c() {
        return this.directive;
    }

    public boolean equals(Object other) {
        return (other instanceof BasicFormatStructure) && p013kotlin.jvm.internal.s.f(this.directive, ((BasicFormatStructure) other).directive);
    }

    public int hashCode() {
        return this.directive.hashCode();
    }

    public String toString() {
        return "BasicFormatStructure(" + this.directive + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
