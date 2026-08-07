package ro0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.lang.annotation.Annotation;
import java.util.List;
import jn0.h0;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import vo0.g1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B7\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\u0012\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001e\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001eR\u001a\u0010$\u001a\u00020\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lro0/b;", "", "T", "Lro0/d;", "Lco0/d;", "serializableClass", "fallbackSerializer", "", "typeArgumentsSerializers", "<init>", "(Lco0/d;Lro0/d;[Lro0/d;)V", "Lyo0/c;", "serializersModule", "c", "(Lyo0/c;)Lro0/d;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "serialize", "(Luo0/f;Ljava/lang/Object;)V", "Luo0/e;", "decoder", "deserialize", "(Luo0/e;)Ljava/lang/Object;", "a", "Lco0/d;", "b", "Lro0/d;", "", "Ljava/util/List;", "Lto0/f;", DateTokenConverter.CONVERTER_KEY, "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b<T> implements d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final co0.d<T> serializableClass;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d<T> fallbackSerializer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<d<?>> typeArgumentsSerializers;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final to0.f descriptor;

    public b(co0.d<T> serializableClass, d<T> dVar, d<?>[] typeArgumentsSerializers) {
        p013kotlin.jvm.internal.s.k(serializableClass, "serializableClass");
        p013kotlin.jvm.internal.s.k(typeArgumentsSerializers, "typeArgumentsSerializers");
        this.serializableClass = serializableClass;
        this.fallbackSerializer = dVar;
        this.typeArgumentsSerializers = p013kotlin.collections.n.h(typeArgumentsSerializers);
        this.descriptor = to0.b.c(to0.m.g("kotlinx.serialization.ContextualSerializer", to0.n.a.f114904a, new to0.f[0], new wn0.l() { // from class: ro0.a
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return b.b(this.f108666a, (to0.a) obj);
            }
        }), serializableClass);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 b(b bVar, to0.a buildSerialDescriptor) {
        to0.f descriptor;
        p013kotlin.jvm.internal.s.k(buildSerialDescriptor, "$this$buildSerialDescriptor");
        d<T> dVar = bVar.fallbackSerializer;
        List<Annotation> annotations = (dVar == null || (descriptor = dVar.getDescriptor()) == null) ? null : descriptor.getAnnotations();
        if (annotations == null) {
            annotations = v.m();
        }
        buildSerialDescriptor.h(annotations);
        return h0.f84049a;
    }

    private final d<T> c(yo0.c serializersModule) {
        d<T> dVarB = serializersModule.b(this.serializableClass, this.typeArgumentsSerializers);
        if (dVarB != null) {
            return dVarB;
        }
        d<T> dVar = this.fallbackSerializer;
        if (dVar != null) {
            return dVar;
        }
        g1.e(this.serializableClass);
        throw new KotlinNothingValueException();
    }

    @Override // ro0.c
    public T deserialize(uo0.e decoder) {
        p013kotlin.jvm.internal.s.k(decoder, "decoder");
        return (T) decoder.o(c(decoder.getSerializersModule()));
    }

    @Override // ro0.d, ro0.q, ro0.c
    public to0.f getDescriptor() {
        return this.descriptor;
    }

    @Override // ro0.q
    public void serialize(uo0.f encoder, T value) {
        p013kotlin.jvm.internal.s.k(encoder, "encoder");
        p013kotlin.jvm.internal.s.k(value, "value");
        encoder.s(c(encoder.getSerializersModule()), value);
    }
}
