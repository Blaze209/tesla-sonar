package fo0;

import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.reflect.full.IllegalCallableAccessException;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u001cB\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB+\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lfo0/j1;", "V", "Lfo0/a2;", "Lco0/j;", "Lfo0/c1;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "descriptor", "<init>", "(Lfo0/c1;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "", "boundReceiver", "(Lfo0/c1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "value", "Ljn0/h0;", "n0", "(Ljava/lang/Object;)V", "Lkotlin/Lazy;", "Lfo0/j1$a;", "q", "Lkotlin/Lazy;", "_setter", "m0", "()Lfo0/j1$a;", "setter", "a", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j1<V> extends a2<V> implements co0.j<V> {

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final Lazy<a<V>> _setter;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lfo0/j1$a;", "R", "Lfo0/j2$d;", "Lco0/j$a;", "Lfo0/j1;", "property", "<init>", "(Lfo0/j1;)V", "value", "Ljn0/h0;", "c0", "(Ljava/lang/Object;)V", "j", "Lfo0/j1;", "b0", "()Lfo0/j1;", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a<R> extends j2.d<R> implements co0.j.a<R> {

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final j1<R> property;

        public a(j1<R> property) {
            p013kotlin.jvm.internal.s.k(property, "property");
            this.property = property;
        }

        @Override // co0.m.a
        /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
        public j1<R> a() {
            return this.property;
        }

        public void c0(R value) throws IllegalCallableAccessException {
            a().n0(value);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(Object obj) throws IllegalCallableAccessException {
            c0(obj);
            return jn0.h0.f84049a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(c1 container, PropertyDescriptor descriptor) {
        super(container, descriptor);
        p013kotlin.jvm.internal.s.k(container, "container");
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        this._setter = jn0.m.a(jn0.p.PUBLICATION, new i1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a k0(j1 j1Var) {
        return new a(j1Var);
    }

    @Override // co0.j, co0.i
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public a<V> getSetter() {
        return this._setter.getValue();
    }

    public void n0(V value) throws IllegalCallableAccessException {
        getSetter().call(value);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(c1 container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        p013kotlin.jvm.internal.s.k(container, "container");
        p013kotlin.jvm.internal.s.k(name, "name");
        p013kotlin.jvm.internal.s.k(signature, "signature");
        this._setter = jn0.m.a(jn0.p.PUBLICATION, new i1(this));
    }
}
