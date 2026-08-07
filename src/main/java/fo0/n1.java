package fo0;

import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.reflect.full.IllegalCallableAccessException;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005:\u0001\u001aB\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u00012\u0006\u0010\u000e\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R,\u0010\u0016\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R&\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lfo0/n1;", "D", "E", "V", "Lfo0/g2;", "", "Lfo0/c1;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "descriptor", "<init>", "(Lfo0/c1;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "receiver1", "receiver2", "value", "Ljn0/h0;", "n0", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "Lkotlin/Lazy;", "Lfo0/n1$a;", "q", "Lkotlin/Lazy;", "_setter", "m0", "()Lfo0/n1$a;", "setter", "a", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n1<D, E, V> extends g2<D, E, V> implements co0.p, co0.i {

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final Lazy<a<D, E, V>> _setter;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0003\u0010\u0001*\u0004\b\u0004\u0010\u0002*\u0004\b\u0005\u0010\u00032\b\u0012\u0004\u0012\u00028\u00050\u00042\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0005B!\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0006¢\u0006\u0004\b\b\u0010\tJ(\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00028\u00032\u0006\u0010\u000b\u001a\u00028\u00042\u0006\u0010\f\u001a\u00028\u0005H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR,\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lfo0/n1$a;", "D", "E", "V", "Lfo0/j2$d;", "", "Lfo0/n1;", "property", "<init>", "(Lfo0/n1;)V", "receiver1", "receiver2", "value", "Ljn0/h0;", "c0", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "j", "Lfo0/n1;", "b0", "()Lfo0/n1;", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a<D, E, V> extends j2.d<V> implements co0.i.a, wn0.q {

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final n1<D, E, V> property;

        public a(n1<D, E, V> property) {
            p013kotlin.jvm.internal.s.k(property, "property");
            this.property = property;
        }

        @Override // co0.m.a
        /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
        public n1<D, E, V> a() {
            return this.property;
        }

        public void c0(D receiver1, E receiver2, V value) throws IllegalCallableAccessException {
            a().n0(receiver1, receiver2, value);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // wn0.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) throws IllegalCallableAccessException {
            c0(obj, obj2, obj3);
            return jn0.h0.f84049a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(c1 container, PropertyDescriptor descriptor) {
        super(container, descriptor);
        p013kotlin.jvm.internal.s.k(container, "container");
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        this._setter = jn0.m.a(jn0.p.PUBLICATION, new m1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a k0(n1 n1Var) {
        return new a(n1Var);
    }

    @Override // co0.i
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public a<D, E, V> getSetter() {
        return this._setter.getValue();
    }

    public void n0(D receiver1, E receiver2, V value) throws IllegalCallableAccessException {
        getSetter().call(receiver1, receiver2, value);
    }
}
