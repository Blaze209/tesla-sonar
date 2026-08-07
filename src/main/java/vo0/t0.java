package vo0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.lang.annotation.Annotation;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001B!\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0005\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b'\u0010&R\u001a\u0010*\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0016\u0010(\u001a\u0004\b)\u0010\u001dR\u0014\u0010.\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-\u0082\u0001\u0001/¨\u00060"}, d2 = {"Lvo0/t0;", "Lto0/f;", "", "serialName", "keyDescriptor", "valueDescriptor", "<init>", "(Ljava/lang/String;Lto0/f;Lto0/f;)V", "", "index", "f", "(I)Ljava/lang/String;", "name", "c", "(Ljava/lang/String;)I", "", IntegerTokenConverter.CONVERTER_KEY, "(I)Z", "", "", "g", "(I)Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "(I)Lto0/f;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "h", "b", "Lto0/f;", "getKeyDescriptor", "()Lto0/f;", "getValueDescriptor", "I", "e", "elementsCount", "Lto0/n;", "getKind", "()Lto0/n;", "kind", "Lvo0/l0;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class t0 implements to0.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String serialName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final to0.f keyDescriptor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final to0.f valueDescriptor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int elementsCount;

    public /* synthetic */ t0(String str, to0.f fVar, to0.f fVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, fVar, fVar2);
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
        throw new IllegalArgumentException(name + " is not a valid map index");
    }

    @Override // to0.f
    public to0.f d(int index) {
        if (index >= 0) {
            int i11 = index % 2;
            if (i11 == 0) {
                return this.keyDescriptor;
            }
            if (i11 == 1) {
                return this.valueDescriptor;
            }
            throw new IllegalStateException("Unreached");
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
        if (!(other instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) other;
        return p013kotlin.jvm.internal.s.f(getSerialName(), t0Var.getSerialName()) && p013kotlin.jvm.internal.s.f(this.keyDescriptor, t0Var.keyDescriptor) && p013kotlin.jvm.internal.s.f(this.valueDescriptor, t0Var.valueDescriptor);
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
        return to0.o.c.f114908a;
    }

    @Override // to0.f
    /* JADX INFO: renamed from: h, reason: from getter */
    public String getSerialName() {
        return this.serialName;
    }

    public int hashCode() {
        return (((getSerialName().hashCode() * 31) + this.keyDescriptor.hashCode()) * 31) + this.valueDescriptor.hashCode();
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
        return getSerialName() + CoreConstants.LEFT_PARENTHESIS_CHAR + this.keyDescriptor + ", " + this.valueDescriptor + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    private t0(String str, to0.f fVar, to0.f fVar2) {
        this.serialName = str;
        this.keyDescriptor = fVar;
        this.valueDescriptor = fVar2;
        this.elementsCount = 2;
    }
}
