package fo0;

import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.reflect.full.IllegalCallableAccessException;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u001eB\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB+\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R&\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lfo0/l1;", "T", "V", "Lfo0/d2;", "Lco0/k;", "Lfo0/c1;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "descriptor", "<init>", "(Lfo0/c1;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "", "boundReceiver", "(Lfo0/c1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "receiver", "value", "Ljn0/h0;", "h", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Lkotlin/Lazy;", "Lfo0/l1$a;", "q", "Lkotlin/Lazy;", "_setter", "m0", "()Lfo0/l1$a;", "setter", "a", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l1<T, V> extends d2<T, V> implements co0.k<T, V> {

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final Lazy<a<T, V>> _setter;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\b\u0012\u0004\u0012\u00028\u00030\u00032\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00028\u00022\u0006\u0010\n\u001a\u00028\u0003H\u0096\u0002¢\u0006\u0004\b\f\u0010\rR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lfo0/l1$a;", "T", "V", "Lfo0/j2$d;", "Lco0/k$a;", "Lfo0/l1;", "property", "<init>", "(Lfo0/l1;)V", "receiver", "value", "Ljn0/h0;", "c0", "(Ljava/lang/Object;Ljava/lang/Object;)V", "j", "Lfo0/l1;", "b0", "()Lfo0/l1;", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a<T, V> extends j2.d<V> implements co0.k.a<T, V> {

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final l1<T, V> property;

        public a(l1<T, V> property) {
            p013kotlin.jvm.internal.s.k(property, "property");
            this.property = property;
        }

        @Override // co0.m.a
        /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
        public l1<T, V> a() {
            return this.property;
        }

        public void c0(T receiver, V value) throws IllegalCallableAccessException {
            a().h(receiver, value);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(Object obj, Object obj2) throws IllegalCallableAccessException {
            c0(obj, obj2);
            return jn0.h0.f84049a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(c1 container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        p013kotlin.jvm.internal.s.k(container, "container");
        p013kotlin.jvm.internal.s.k(name, "name");
        p013kotlin.jvm.internal.s.k(signature, "signature");
        this._setter = jn0.m.a(jn0.p.PUBLICATION, new k1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a k0(l1 l1Var) {
        return new a(l1Var);
    }

    @Override // co0.k
    public void h(T receiver, V value) throws IllegalCallableAccessException {
        getSetter().call(receiver, value);
    }

    @Override // co0.k, co0.i
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public a<T, V> getSetter() {
        return this._setter.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(c1 container, PropertyDescriptor descriptor) {
        super(container, descriptor);
        p013kotlin.jvm.internal.s.k(container, "container");
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        this._setter = jn0.m.a(jn0.p.PUBLICATION, new k1(this));
    }
}
