package vo0;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.SerializationException;
import p013kotlin.Lazy;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bB'\b\u0011\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0007\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001b\u0010\"\u001a\u00020\u001d8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lvo0/e1;", "", "T", "Lro0/d;", "", "serialName", "objectInstance", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "", "", "classAnnotations", "(Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/annotation/Annotation;)V", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "serialize", "(Luo0/f;Ljava/lang/Object;)V", "Luo0/e;", "decoder", "deserialize", "(Luo0/e;)Ljava/lang/Object;", "a", "Ljava/lang/Object;", "", "b", "Ljava/util/List;", "_annotations", "Lto0/f;", "c", "Lkotlin/Lazy;", "getDescriptor", "()Lto0/f;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e1<T> implements ro0.d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final T objectInstance;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private List<? extends Annotation> _annotations;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Lazy descriptor;

    public e1(final String serialName, T objectInstance) {
        p013kotlin.jvm.internal.s.k(serialName, "serialName");
        p013kotlin.jvm.internal.s.k(objectInstance, "objectInstance");
        this.objectInstance = objectInstance;
        this._annotations = p013kotlin.collections.v.m();
        this.descriptor = jn0.m.a(jn0.p.PUBLICATION, new wn0.a() { // from class: vo0.c1
            @Override // wn0.a
            public final Object invoke() {
                return e1.c(serialName, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final to0.f c(String str, final e1 e1Var) {
        return to0.m.g(str, to0.o.d.f114909a, new to0.f[0], new wn0.l() { // from class: vo0.d1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return e1.d(this.f119603a, (to0.a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 d(e1 e1Var, to0.a buildSerialDescriptor) {
        p013kotlin.jvm.internal.s.k(buildSerialDescriptor, "$this$buildSerialDescriptor");
        buildSerialDescriptor.h(e1Var._annotations);
        return jn0.h0.f84049a;
    }

    @Override // ro0.c
    public T deserialize(uo0.e decoder) {
        int iA;
        p013kotlin.jvm.internal.s.k(decoder, "decoder");
        to0.f descriptor = getDescriptor();
        uo0.c cVarB = decoder.b(descriptor);
        if (cVarB.i() || (iA = cVarB.A(getDescriptor())) == -1) {
            jn0.h0 h0Var = jn0.h0.f84049a;
            cVarB.c(descriptor);
            return this.objectInstance;
        }
        throw new SerializationException("Unexpected index " + iA);
    }

    @Override // ro0.d, ro0.q, ro0.c
    public to0.f getDescriptor() {
        return (to0.f) this.descriptor.getValue();
    }

    @Override // ro0.q
    public void serialize(uo0.f encoder, T value) {
        p013kotlin.jvm.internal.s.k(encoder, "encoder");
        p013kotlin.jvm.internal.s.k(value, "value");
        encoder.b(getDescriptor()).c(getDescriptor());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e1(String serialName, T objectInstance, Annotation[] classAnnotations) {
        this(serialName, objectInstance);
        p013kotlin.jvm.internal.s.k(serialName, "serialName");
        p013kotlin.jvm.internal.s.k(objectInstance, "objectInstance");
        p013kotlin.jvm.internal.s.k(classAnnotations, "classAnnotations");
        this._annotations = p013kotlin.collections.n.h(classAnnotations);
    }
}
