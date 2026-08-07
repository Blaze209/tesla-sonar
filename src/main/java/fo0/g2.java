package fo0;

import java.lang.reflect.Member;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0006\b\u0002\u0010\u0003 \u00012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\b\u0012\u0004\u0012\u00028\u00020\u0005:\u0001 B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000fJ\u001f\u0010\u0012\u001a\u00028\u00022\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0014\u001a\u00028\u00022\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0013R,\u0010\u0019\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R&\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lfo0/g2;", "D", "E", "V", "Lco0/p;", "Lfo0/j2;", "Lfo0/c1;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "descriptor", "<init>", "(Lfo0/c1;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "(Lfo0/c1;Ljava/lang/String;Ljava/lang/String;)V", "receiver1", "receiver2", "n", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "invoke", "Lkotlin/Lazy;", "Lfo0/g2$a;", "o", "Lkotlin/Lazy;", "_getter", "Ljava/lang/reflect/Member;", "p", "delegateSource", "j0", "()Lfo0/g2$a;", "getter", "a", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class g2<D, E, V> extends j2<V> implements co0.p<D, E, V> {

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Lazy<a<D, E, V>> _getter;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final Lazy<Member> delegateSource;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000*\u0004\b\u0003\u0010\u0001*\u0004\b\u0004\u0010\u0002*\u0006\b\u0005\u0010\u0003 \u00012\b\u0012\u0004\u0012\u00028\u00050\u00042\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0005B!\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0006¢\u0006\u0004\b\b\u0010\tJ \u0010\f\u001a\u00028\u00052\u0006\u0010\n\u001a\u00028\u00032\u0006\u0010\u000b\u001a\u00028\u0004H\u0096\u0002¢\u0006\u0004\b\f\u0010\rR,\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lfo0/g2$a;", "D", "E", "V", "Lfo0/j2$c;", "Lco0/p$a;", "Lfo0/g2;", "property", "<init>", "(Lfo0/g2;)V", "receiver1", "receiver2", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "j", "Lfo0/g2;", "b0", "()Lfo0/g2;", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a<D, E, V> extends j2.c<V> implements co0.p.a<D, E, V> {

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final g2<D, E, V> property;

        /* JADX WARN: Multi-variable type inference failed */
        public a(g2<D, E, ? extends V> property) {
            p013kotlin.jvm.internal.s.k(property, "property");
            this.property = property;
        }

        @Override // co0.m.a
        /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
        public g2<D, E, V> a() {
            return this.property;
        }

        @Override // wn0.p
        public V invoke(D receiver1, E receiver2) {
            return a().n(receiver1, receiver2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(c1 container, String name, String signature) {
        super(container, name, signature, p013kotlin.jvm.internal.f.NO_RECEIVER);
        p013kotlin.jvm.internal.s.k(container, "container");
        p013kotlin.jvm.internal.s.k(name, "name");
        p013kotlin.jvm.internal.s.k(signature, "signature");
        jn0.p pVar = jn0.p.PUBLICATION;
        this._getter = jn0.m.a(pVar, new e2(this));
        this.delegateSource = jn0.m.a(pVar, new f2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a f0(g2 g2Var) {
        return new a(g2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Member i0(g2 g2Var) {
        return g2Var.Y();
    }

    @Override // wn0.p
    public V invoke(D receiver1, E receiver2) {
        return n(receiver1, receiver2);
    }

    @Override // co0.m
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public a<D, E, V> getGetter() {
        return this._getter.getValue();
    }

    @Override // co0.p
    public V n(D receiver1, E receiver2) {
        return getGetter().call(receiver1, receiver2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(c1 container, PropertyDescriptor descriptor) {
        super(container, descriptor);
        p013kotlin.jvm.internal.s.k(container, "container");
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        jn0.p pVar = jn0.p.PUBLICATION;
        this._getter = jn0.m.a(pVar, new e2(this));
        this.delegateSource = jn0.m.a(pVar, new f2(this));
    }
}
