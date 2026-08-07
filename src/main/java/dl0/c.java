package dl0;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\b\"\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u000b\u001a\u00020\n2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u000f\u001a\u00020\u000e\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0011\u001a\u00020\u000e\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\u0011\u0010\u0012R&\u0010\u0016\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00138$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001a\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Ldl0/c;", "Ldl0/b;", "<init>", "()V", "", "T", "Ldl0/a;", Action.KEY_ATTRIBUTE, "a", "(Ldl0/a;)Ljava/lang/Object;", "", "f", "(Ldl0/a;)Z", "value", "Ljn0/h0;", "c", "(Ldl0/a;Ljava/lang/Object;)V", "b", "(Ldl0/a;)V", "", "h", "()Ljava/util/Map;", "map", "", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/List;", "allKeys", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
abstract class c implements b {
    @Override // dl0.b
    public final <T> T a(a<T> key) {
        p013kotlin.jvm.internal.s.k(key, "key");
        return (T) h().get(key);
    }

    @Override // dl0.b
    public final <T> void b(a<T> key) {
        p013kotlin.jvm.internal.s.k(key, "key");
        h().remove(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dl0.b
    public final <T> void c(a<T> key, T value) {
        p013kotlin.jvm.internal.s.k(key, "key");
        p013kotlin.jvm.internal.s.k(value, "value");
        h().put(key, value);
    }

    @Override // dl0.b
    public final List<a<?>> d() {
        return p013kotlin.collections.v.m1(h().keySet());
    }

    @Override // dl0.b
    public <T> T e(a<T> aVar) {
        return (T) b.a.a(this, aVar);
    }

    @Override // dl0.b
    public final boolean f(a<?> key) {
        p013kotlin.jvm.internal.s.k(key, "key");
        return h().containsKey(key);
    }

    protected abstract Map<a<?>, Object> h();
}
