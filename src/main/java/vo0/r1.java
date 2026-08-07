package vo0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Iterator;
import p013kotlin.Metadata;
import vo0.p1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b!\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u000e\b\u0002\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005B\u0017\b\u0000\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\n*\u00028\u0002H\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00028\u0001*\u00028\u0002H\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u0010*\u00028\u00022\u0006\u0010\u000f\u001a\u00020\nH\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013*\u00028\u0001H\u0004¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0018\u001a\u00020\u0010*\u00028\u00022\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00028\u0002H\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00028\u0001H$¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010!\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\nH$¢\u0006\u0004\b!\u0010\"J\u001d\u0010%\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020#2\u0006\u0010$\u001a\u00028\u0001¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00028\u00012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*R\u0017\u00100\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lvo0/r1;", "Element", "Array", "Lvo0/p1;", "Builder", "Lvo0/p;", "Lro0/d;", "primitiveSerializer", "<init>", "(Lro0/d;)V", "", "p", "(Lvo0/p1;)I", "t", "(Lvo0/p1;)Ljava/lang/Object;", "size", "Ljn0/h0;", "q", "(Lvo0/p1;I)V", "", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;)Ljava/util/Iterator;", "index", "element", "s", "(Lvo0/p1;ILjava/lang/Object;)V", "o", "()Lvo0/p1;", "r", "()Ljava/lang/Object;", "Luo0/d;", "encoder", "content", "u", "(Luo0/d;Ljava/lang/Object;I)V", "Luo0/f;", "value", "serialize", "(Luo0/f;Ljava/lang/Object;)V", "Luo0/e;", "decoder", "deserialize", "(Luo0/e;)Ljava/lang/Object;", "Lto0/f;", "b", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class r1<Element, Array, Builder extends p1<Array>> extends p<Element, Array, Builder> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final to0.f descriptor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(ro0.d<Element> primitiveSerializer) {
        super(primitiveSerializer, null);
        p013kotlin.jvm.internal.s.k(primitiveSerializer, "primitiveSerializer");
        this.descriptor = new q1(primitiveSerializer.getDescriptor());
    }

    @Override // vo0.a
    protected final Iterator<Element> d(Array array) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // vo0.a, ro0.c
    public final Array deserialize(uo0.e decoder) {
        p013kotlin.jvm.internal.s.k(decoder, "decoder");
        return f(decoder, null);
    }

    @Override // vo0.p, ro0.d, ro0.q, ro0.c
    public final to0.f getDescriptor() {
        return this.descriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vo0.a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final Builder a() {
        return k(r());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vo0.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final int b(Builder builder) {
        p013kotlin.jvm.internal.s.k(builder, "<this>");
        return builder.getPosition();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vo0.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void c(Builder builder, int i11) {
        p013kotlin.jvm.internal.s.k(builder, "<this>");
        builder.b(i11);
    }

    protected abstract Array r();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vo0.p
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void n(Builder builder, int i11, Element element) {
        p013kotlin.jvm.internal.s.k(builder, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    @Override // vo0.p, ro0.q
    public final void serialize(uo0.f encoder, Array value) {
        p013kotlin.jvm.internal.s.k(encoder, "encoder");
        int iE = e(value);
        to0.f fVar = this.descriptor;
        uo0.d dVarT = encoder.t(fVar, iE);
        u(dVarT, value, iE);
        dVarT.c(fVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vo0.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final Array l(Builder builder) {
        p013kotlin.jvm.internal.s.k(builder, "<this>");
        return (Array) builder.a();
    }

    protected abstract void u(uo0.d encoder, Array content, int size);
}
