package xo0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJI\u0010\u0017\u001a\u00020\f\"\b\b\u0000\u0010\u0011*\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\n2 \u0010\u0016\u001a\u001c\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00150\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00150\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018JM\u0010\u001d\u001a\u00020\f\"\b\b\u0000\u0010\u0019*\u00020\u0010\"\b\b\u0001\u0010\u001a*\u00028\u00002\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u0015H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJC\u0010!\u001a\u00020\f\"\b\b\u0000\u0010\u0019*\u00020\u00102\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u001a\u0010 \u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001f0\u0013H\u0016¢\u0006\u0004\b!\u0010\u0018JE\u0010$\u001a\u00020\f\"\b\b\u0000\u0010\u0019*\u00020\u00102\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u001c\u0010#\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\"0\u0013H\u0016¢\u0006\u0004\b$\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010'¨\u0006("}, d2 = {"Lxo0/p0;", "Lyo0/f;", "", "useArrayPolymorphism", "", "discriminator", "<init>", "(ZLjava/lang/String;)V", "Lto0/f;", "descriptor", "Lco0/d;", "actualClass", "Ljn0/h0;", "g", "(Lto0/f;Lco0/d;)V", "f", "", "T", "kClass", "Lkotlin/Function1;", "", "Lro0/d;", "provider", "c", "(Lco0/d;Lwn0/l;)V", "Base", "Sub", "baseClass", "actualSerializer", DateTokenConverter.CONVERTER_KEY, "(Lco0/d;Lco0/d;Lro0/d;)V", "Lro0/q;", "defaultSerializerProvider", "e", "Lro0/c;", "defaultDeserializerProvider", "b", "a", "Z", "Ljava/lang/String;", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class p0 implements yo0.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean useArrayPolymorphism;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String discriminator;

    public p0(boolean z11, String discriminator) {
        p013kotlin.jvm.internal.s.k(discriminator, "discriminator");
        this.useArrayPolymorphism = z11;
        this.discriminator = discriminator;
    }

    private final void f(to0.f descriptor, co0.d<?> actualClass) {
        int elementsCount = descriptor.getElementsCount();
        for (int i11 = 0; i11 < elementsCount; i11++) {
            String strF = descriptor.f(i11);
            if (p013kotlin.jvm.internal.s.f(strF, this.discriminator)) {
                throw new IllegalArgumentException("Polymorphic serializer for " + actualClass + " has property '" + strF + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            }
        }
    }

    private final void g(to0.f descriptor, co0.d<?> actualClass) {
        to0.n kind = descriptor.getKind();
        if ((kind instanceof to0.d) || p013kotlin.jvm.internal.s.f(kind, to0.n.a.f114904a)) {
            throw new IllegalArgumentException("Serializer for " + actualClass.l() + " can't be registered as a subclass for polymorphic serialization because its kind " + kind + " is not concrete. To work with multiple hierarchies, register it as a base class.");
        }
        if (this.useArrayPolymorphism) {
            return;
        }
        if (p013kotlin.jvm.internal.s.f(kind, to0.o.b.f114907a) || p013kotlin.jvm.internal.s.f(kind, to0.o.c.f114908a) || (kind instanceof to0.e) || (kind instanceof to0.n.b)) {
            throw new IllegalArgumentException("Serializer for " + actualClass.l() + " of kind " + kind + " cannot be serialized polymorphically with class discriminator.");
        }
    }

    @Override // yo0.f
    public <T> void a(co0.d<T> dVar, ro0.d<T> dVar2) {
        yo0.f.a.b(this, dVar, dVar2);
    }

    @Override // yo0.f
    public <Base> void b(co0.d<Base> baseClass, wn0.l<? super String, ? extends ro0.c<? extends Base>> defaultDeserializerProvider) {
        p013kotlin.jvm.internal.s.k(baseClass, "baseClass");
        p013kotlin.jvm.internal.s.k(defaultDeserializerProvider, "defaultDeserializerProvider");
    }

    @Override // yo0.f
    public <T> void c(co0.d<T> kClass, wn0.l<? super List<? extends ro0.d<?>>, ? extends ro0.d<?>> provider) {
        p013kotlin.jvm.internal.s.k(kClass, "kClass");
        p013kotlin.jvm.internal.s.k(provider, "provider");
    }

    @Override // yo0.f
    public <Base, Sub extends Base> void d(co0.d<Base> baseClass, co0.d<Sub> actualClass, ro0.d<Sub> actualSerializer) {
        p013kotlin.jvm.internal.s.k(baseClass, "baseClass");
        p013kotlin.jvm.internal.s.k(actualClass, "actualClass");
        p013kotlin.jvm.internal.s.k(actualSerializer, "actualSerializer");
        to0.f descriptor = actualSerializer.getDescriptor();
        g(descriptor, actualClass);
        if (this.useArrayPolymorphism) {
            return;
        }
        f(descriptor, actualClass);
    }

    @Override // yo0.f
    public <Base> void e(co0.d<Base> baseClass, wn0.l<? super Base, ? extends ro0.q<? super Base>> defaultSerializerProvider) {
        p013kotlin.jvm.internal.s.k(baseClass, "baseClass");
        p013kotlin.jvm.internal.s.k(defaultSerializerProvider, "defaultSerializerProvider");
    }
}
