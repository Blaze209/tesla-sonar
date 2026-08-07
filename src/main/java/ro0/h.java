package ro0;

import ch.qos.logback.core.CoreConstants;
import java.lang.annotation.Annotation;
import java.util.List;
import jn0.h0;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0011\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u0006\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001c\u001a\u00020\u00178VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lro0/h;", "", "T", "Lvo0/b;", "Lco0/d;", "baseClass", "<init>", "(Lco0/d;)V", "", "", "classAnnotations", "(Lco0/d;[Ljava/lang/annotation/Annotation;)V", "", "toString", "()Ljava/lang/String;", "a", "Lco0/d;", "e", "()Lco0/d;", "", "b", "Ljava/util/List;", "_annotations", "Lto0/f;", "c", "Lkotlin/Lazy;", "getDescriptor", "()Lto0/f;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h<T> extends vo0.b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final co0.d<T> baseClass;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private List<? extends Annotation> _annotations;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Lazy descriptor;

    public h(co0.d<T> baseClass) {
        p013kotlin.jvm.internal.s.k(baseClass, "baseClass");
        this.baseClass = baseClass;
        this._annotations = v.m();
        this.descriptor = jn0.m.a(jn0.p.PUBLICATION, new wn0.a() { // from class: ro0.f
            @Override // wn0.a
            public final Object invoke() {
                return h.h(this.f108671a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final to0.f h(final h hVar) {
        return to0.b.c(to0.m.g("kotlinx.serialization.Polymorphic", to0.d.a.f114873a, new to0.f[0], new wn0.l() { // from class: ro0.g
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return h.i(this.f108672a, (to0.a) obj);
            }
        }), hVar.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 i(h hVar, to0.a buildSerialDescriptor) {
        p013kotlin.jvm.internal.s.k(buildSerialDescriptor, "$this$buildSerialDescriptor");
        to0.a.b(buildSerialDescriptor, "type", so0.a.F(t0.f86535a).getDescriptor(), null, false, 12, null);
        to0.a.b(buildSerialDescriptor, "value", to0.m.h("kotlinx.serialization.Polymorphic<" + hVar.e().l() + '>', to0.n.a.f114904a, new to0.f[0], null, 8, null), null, false, 12, null);
        buildSerialDescriptor.h(hVar._annotations);
        return h0.f84049a;
    }

    @Override // vo0.b
    public co0.d<T> e() {
        return this.baseClass;
    }

    @Override // ro0.d, ro0.q, ro0.c
    public to0.f getDescriptor() {
        return (to0.f) this.descriptor.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + e() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(co0.d<T> baseClass, Annotation[] classAnnotations) {
        this(baseClass);
        p013kotlin.jvm.internal.s.k(baseClass, "baseClass");
        p013kotlin.jvm.internal.s.k(classAnnotations, "classAnnotations");
        this._annotations = p013kotlin.collections.n.h(classAnnotations);
    }
}
