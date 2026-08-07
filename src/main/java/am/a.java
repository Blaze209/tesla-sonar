package am;

import ch.qos.logback.core.joran.action.Action;
import java.util.Map;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000bj\u0002`\fH&¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0010\u001a\u00020\u00062\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000bj\u0002`\fH&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lam/a;", "", "E", "", Action.KEY_ATTRIBUTE, "value", "Ljn0/h0;", "o", "(Ljava/lang/String;Ljava/lang/Object;)V", "e0", "(Ljava/lang/String;)Ljava/lang/Object;", "", "Lcom/facebook/fresco/middleware/Extras;", "getExtras", "()Ljava/util/Map;", "extras", "C", "(Ljava/util/Map;)V", "middleware_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface a {
    void C(Map<String, ? extends Object> extras);

    <E> E e0(String key);

    Map<String, Object> getExtras();

    <E> void o(String key, E value);
}
