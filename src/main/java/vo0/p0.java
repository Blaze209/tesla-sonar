package vo0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.lang.annotation.Annotation;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010%\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u001bR\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(\u0082\u0001\u0003*+,¨\u0006-"}, d2 = {"Lvo0/p0;", "Lto0/f;", "elementDescriptor", "<init>", "(Lto0/f;)V", "", "index", "", "f", "(I)Ljava/lang/String;", "name", "c", "(Ljava/lang/String;)I", "", IntegerTokenConverter.CONVERTER_KEY, "(I)Z", "", "", "g", "(I)Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "(I)Lto0/f;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Lto0/f;", "getElementDescriptor", "()Lto0/f;", "b", "I", "e", "elementsCount", "Lto0/n;", "getKind", "()Lto0/n;", "kind", "Lvo0/d;", "Lvo0/n0;", "Lvo0/q1;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class p0 implements to0.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final to0.f elementDescriptor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int elementsCount;

    public /* synthetic */ p0(to0.f fVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar);
    }

    @Override // to0.f
    public boolean b() {
        return to0.f.a.c(this);
    }

    @Override // to0.f
    public int c(String name) {
        p013kotlin.jvm.internal.s.k(name, "name");
        Integer numX = p013kotlin.text.t.x(name);
        if (numX != null) {
            return numX.intValue();
        }
        throw new IllegalArgumentException(name + " is not a valid list index");
    }

    @Override // to0.f
    public to0.f d(int index) {
        if (index >= 0) {
            return this.elementDescriptor;
        }
        throw new IllegalArgumentException(("Illegal index " + index + ", " + getSerialName() + " expects only non-negative indices").toString());
    }

    @Override // to0.f
    /* JADX INFO: renamed from: e, reason: from getter */
    public int getElementsCount() {
        return this.elementsCount;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) other;
        return p013kotlin.jvm.internal.s.f(this.elementDescriptor, p0Var.elementDescriptor) && p013kotlin.jvm.internal.s.f(getSerialName(), p0Var.getSerialName());
    }

    @Override // to0.f
    public String f(int index) {
        return String.valueOf(index);
    }

    @Override // to0.f
    public List<Annotation> g(int index) {
        if (index >= 0) {
            return p013kotlin.collections.v.m();
        }
        throw new IllegalArgumentException(("Illegal index " + index + ", " + getSerialName() + " expects only non-negative indices").toString());
    }

    @Override // to0.f
    public List<Annotation> getAnnotations() {
        return to0.f.a.a(this);
    }

    @Override // to0.f
    public to0.n getKind() {
        return to0.o.b.f114907a;
    }

    public int hashCode() {
        return (this.elementDescriptor.hashCode() * 31) + getSerialName().hashCode();
    }

    @Override // to0.f
    public boolean i(int index) {
        if (index >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + index + ", " + getSerialName() + " expects only non-negative indices").toString());
    }

    @Override // to0.f
    public boolean isInline() {
        return to0.f.a.b(this);
    }

    public String toString() {
        return getSerialName() + CoreConstants.LEFT_PARENTHESIS_CHAR + this.elementDescriptor + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    private p0(to0.f fVar) {
        this.elementDescriptor = fVar;
        this.elementsCount = 1;
    }
}
