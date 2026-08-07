package dl0;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.concurrent.ConcurrentHashMap;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR,\u0010\u0011\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00040\f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Ldl0/m;", "Ldl0/c;", "<init>", "()V", "", "T", "Ldl0/a;", Action.KEY_ATTRIBUTE, "Lkotlin/Function0;", "block", "g", "(Ldl0/a;Lwn0/a;)Ljava/lang/Object;", "Ljava/util/concurrent/ConcurrentHashMap;", "a", "Ljava/util/concurrent/ConcurrentHashMap;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/util/concurrent/ConcurrentHashMap;", "map", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class m extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ConcurrentHashMap<a<?>, Object> map = new ConcurrentHashMap<>();

    @Override // dl0.b
    public <T> T g(a<T> key, wn0.a<? extends T> block) {
        p013kotlin.jvm.internal.s.k(key, "key");
        p013kotlin.jvm.internal.s.k(block, "block");
        T t11 = (T) h().get(key);
        if (t11 != null) {
            return t11;
        }
        T tInvoke = block.invoke();
        Object objPutIfAbsent = h().putIfAbsent(key, tInvoke);
        if (objPutIfAbsent != null) {
            tInvoke = (T) objPutIfAbsent;
        }
        p013kotlin.jvm.internal.s.i(tInvoke, "null cannot be cast to non-null type T of io.ktor.util.ConcurrentSafeAttributes.computeIfAbsent");
        return tInvoke;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // dl0.c
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public ConcurrentHashMap<a<?>, Object> h() {
        return this.map;
    }
}
