package nm;

import ch.qos.logback.core.joran.action.Action;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u00032\u00020\u0004:\u0001\u0019J-\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006H&¢\u0006\u0004\b\b\u0010\tJ \u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00028\u0000H¦\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH&¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0015\u001a\u00020\u00142\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH¦\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00028\u0000H¦\u0002¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lnm/x;", "K", "V", "Lsk/c;", "", Action.KEY_ATTRIBUTE, "Ltk/a;", "value", "c", "(Ljava/lang/Object;Ltk/a;)Ltk/a;", "get", "(Ljava/lang/Object;)Ltk/a;", "Ljn0/h0;", "b", "(Ljava/lang/Object;)V", "Lpk/l;", "predicate", "", "e", "(Lpk/l;)I", "", "f", "(Lpk/l;)Z", "contains", "(Ljava/lang/Object;)Z", "a", "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface x<K, V> extends sk.c {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnm/x$a;", "", "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface a {
    }

    void b(K key);

    tk.a<V> c(K key, tk.a<V> value);

    boolean contains(K key);

    int e(pk.l<K> predicate);

    boolean f(pk.l<K> predicate);

    tk.a<V> get(K key);
}
