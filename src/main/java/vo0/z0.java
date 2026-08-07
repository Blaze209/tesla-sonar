package vo0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.lang.annotation.Annotation;
import java.util.List;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010%\u001a\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010(\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010\u0019R\u0014\u0010*\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u001f¨\u0006+"}, d2 = {"Lvo0/z0;", "Lto0/f;", "<init>", "()V", "", "a", "()Ljava/lang/Void;", "", "index", "", "f", "(I)Ljava/lang/String;", "name", "c", "(Ljava/lang/String;)I", "", IntegerTokenConverter.CONVERTER_KEY, "(I)Z", DateTokenConverter.CONVERTER_KEY, "(I)Lto0/f;", "", "", "g", "(I)Ljava/util/List;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Lto0/n;", "b", "Lto0/n;", "getKind", "()Lto0/n;", "kind", "Ljava/lang/String;", "h", "serialName", "e", "elementsCount", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class z0 implements to0.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z0 f119727a = new z0();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final to0.n kind = to0.o.d.f114909a;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final String serialName = "kotlin.Nothing";

    private z0() {
    }

    private final Void a() {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
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
        return this == other;
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
    public to0.n getKind() {
        return kind;
    }

    @Override // to0.f
    /* JADX INFO: renamed from: h */
    public String getSerialName() {
        return serialName;
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

    public String toString() {
        return "NothingSerialDescriptor";
    }
}
