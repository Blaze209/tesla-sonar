package el0;

import ch.qos.logback.core.joran.action.Action;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0006\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lel0/a;", "", "K", "V", "<init>", "()V", Action.KEY_ATTRIBUTE, "a", "(Ljava/lang/Object;)Ljava/lang/Object;", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f63060a = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "current");
    private volatile /* synthetic */ Object current = v0.i();

    public final V a(K key) {
        s.k(key, "key");
        return (V) ((Map) this.current).get(key);
    }
}
