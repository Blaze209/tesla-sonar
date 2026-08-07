package vo0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.lang.annotation.Annotation;
import java.util.List;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: vo0.s1, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000bH\u0016¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\"¨\u0006+"}, d2 = {"Lvo0/s1;", "Lto0/f;", "", "serialName", "Lto0/e;", "kind", "<init>", "(Ljava/lang/String;Lto0/e;)V", "", "a", "()Ljava/lang/Void;", "", "index", "f", "(I)Ljava/lang/String;", "name", "c", "(Ljava/lang/String;)I", "", IntegerTokenConverter.CONVERTER_KEY, "(I)Z", DateTokenConverter.CONVERTER_KEY, "(I)Lto0/f;", "", "", "g", "(I)Ljava/util/List;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Ljava/lang/String;", "h", "b", "Lto0/e;", "j", "()Lto0/e;", "e", "elementsCount", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PrimitiveDescriptor implements to0.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String serialName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final to0.e kind;

    public PrimitiveDescriptor(String serialName, to0.e kind) {
        p013kotlin.jvm.internal.s.k(serialName, "serialName");
        p013kotlin.jvm.internal.s.k(kind, "kind");
        this.serialName = serialName;
        this.kind = kind;
    }

    private final Void a() {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // to0.f
    public boolean b() {
        return to0.f.a.c(this);
    }

    @Override // to0.f
    public int c(String name) {
        p013kotlin.jvm.internal.s.k(name, "name");
        a();
        throw new KotlinNothingValueException();
    }

    @Override // to0.f
    public to0.f d(int index) {
        a();
        throw new KotlinNothingValueException();
    }

    @Override // to0.f
    /* JADX INFO: renamed from: e */
    public int getElementsCount() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrimitiveDescriptor)) {
            return false;
        }
        PrimitiveDescriptor primitiveDescriptor = (PrimitiveDescriptor) other;
        return p013kotlin.jvm.internal.s.f(getSerialName(), primitiveDescriptor.getSerialName()) && p013kotlin.jvm.internal.s.f(getKind(), primitiveDescriptor.getKind());
    }

    @Override // to0.f
    public String f(int index) {
        a();
        throw new KotlinNothingValueException();
    }

    @Override // to0.f
    public List<Annotation> g(int index) {
        a();
        throw new KotlinNothingValueException();
    }

    @Override // to0.f
    public List<Annotation> getAnnotations() {
        return to0.f.a.a(this);
    }

    @Override // to0.f
    /* JADX INFO: renamed from: h, reason: from getter */
    public String getSerialName() {
        return this.serialName;
    }

    public int hashCode() {
        return getSerialName().hashCode() + (getKind().hashCode() * 31);
    }

    @Override // to0.f
    public boolean i(int index) {
        a();
        throw new KotlinNothingValueException();
    }

    @Override // to0.f
    public boolean isInline() {
        return to0.f.a.b(this);
    }

    @Override // to0.f
    /* JADX INFO: renamed from: j, reason: from getter */
    public to0.e getKind() {
        return this.kind;
    }

    public String toString() {
        return "PrimitiveDescriptor(" + getSerialName() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
