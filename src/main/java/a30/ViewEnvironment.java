package a30;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: a30.a0, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\t\u001a\u00028\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ4\u0010\r\u001a\u00020\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00012\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00028\u00000\u000bH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R'\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"La30/a0;", "", "", "La30/b0;", "map", "<init>", "(Ljava/util/Map;)V", "T", Action.KEY_ATTRIBUTE, "a", "(La30/b0;)Ljava/lang/Object;", "Lkotlin/Pair;", "pair", "c", "(Lkotlin/Pair;)La30/a0;", "", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ViewEnvironment {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<ViewEnvironmentKey<?>, Object> map;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewEnvironment() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final <T> T a(ViewEnvironmentKey<T> key) {
        p013kotlin.jvm.internal.s.k(key, "key");
        T t11 = (T) this.map.get(key);
        if (t11 == null) {
            t11 = null;
        }
        return t11 == null ? key.a() : t11;
    }

    public final Map<ViewEnvironmentKey<?>, Object> b() {
        return this.map;
    }

    public final <T> ViewEnvironment c(Pair<? extends ViewEnvironmentKey<T>, ? extends T> pair) {
        p013kotlin.jvm.internal.s.k(pair, "pair");
        return new ViewEnvironment(v0.s(this.map, pair));
    }

    public boolean equals(Object other) {
        ViewEnvironment viewEnvironment = other instanceof ViewEnvironment ? (ViewEnvironment) other : null;
        if (viewEnvironment == null) {
            return false;
        }
        return p013kotlin.jvm.internal.s.f(viewEnvironment.b(), b());
    }

    public int hashCode() {
        return this.map.hashCode();
    }

    public String toString() {
        return "ViewEnvironment(" + this.map + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public ViewEnvironment(Map<ViewEnvironmentKey<?>, ? extends Object> map) {
        p013kotlin.jvm.internal.s.k(map, "map");
        this.map = map;
    }

    public /* synthetic */ ViewEnvironment(Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? v0.i() : map);
    }
}
