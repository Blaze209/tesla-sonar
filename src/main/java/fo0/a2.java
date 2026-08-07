package fo0;

import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u001eB\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB+\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000fJ\u000f\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0011R \u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lfo0/a2;", "V", "Lco0/n;", "Lfo0/j2;", "Lfo0/c1;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "descriptor", "<init>", "(Lfo0/c1;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "", "boundReceiver", "(Lfo0/c1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "get", "()Ljava/lang/Object;", "getDelegate", "invoke", "Lkotlin/Lazy;", "Lfo0/a2$a;", "o", "Lkotlin/Lazy;", "_getter", "p", "delegateValue", "j0", "()Lfo0/a2$a;", "getter", "a", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class a2<V> extends j2<V> implements co0.n<V> {

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Lazy<a<V>> _getter;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final Lazy<Object> delegateValue;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lfo0/a2$a;", "R", "Lfo0/j2$c;", "Lco0/n$a;", "Lfo0/a2;", "property", "<init>", "(Lfo0/a2;)V", "invoke", "()Ljava/lang/Object;", "j", "Lfo0/a2;", "b0", "()Lfo0/a2;", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a<R> extends j2.c<R> implements co0.n.a<R> {

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final a2<R> property;

        /* JADX WARN: Multi-variable type inference failed */
        public a(a2<? extends R> property) {
            p013kotlin.jvm.internal.s.k(property, "property");
            this.property = property;
        }

        @Override // co0.m.a
        /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
        public a2<R> a() {
            return this.property;
        }

        @Override // wn0.a
        public R invoke() {
            return a().get();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(c1 container, PropertyDescriptor descriptor) {
        super(container, descriptor);
        p013kotlin.jvm.internal.s.k(container, "container");
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        jn0.p pVar = jn0.p.PUBLICATION;
        this._getter = jn0.m.a(pVar, new y1(this));
        this.delegateValue = jn0.m.a(pVar, new z1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a f0(a2 a2Var) {
        return new a(a2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object i0(a2 a2Var) {
        return a2Var.a0(a2Var.Y(), null, null);
    }

    @Override // co0.n
    public V get() {
        return getGetter().call(new Object[0]);
    }

    @Override // co0.n
    public Object getDelegate() {
        return this.delegateValue.getValue();
    }

    @Override // wn0.a
    public V invoke() {
        return get();
    }

    @Override // co0.m
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public a<V> getGetter() {
        return this._getter.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(c1 container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        p013kotlin.jvm.internal.s.k(container, "container");
        p013kotlin.jvm.internal.s.k(name, "name");
        p013kotlin.jvm.internal.s.k(signature, "signature");
        jn0.p pVar = jn0.p.PUBLICATION;
        this._getter = jn0.m.a(pVar, new y1(this));
        this.delegateValue = jn0.m.a(pVar, new z1(this));
    }
}
