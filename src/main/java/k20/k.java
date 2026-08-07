package k20;

import java.util.List;
import java.util.function.Function;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B3\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00020\u0005¢\u0006\u0004\b\t\u0010\nR\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR)\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010¨\u0006\u0011"}, d2 = {"Lk20/k;", "", "", "", "schemas", "Ljava/util/function/Function;", "Ls20/b;", "Lr20/b;", "closure", "<init>", "(Ljava/util/List;Ljava/util/function/Function;)V", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ljava/util/function/Function;", "()Ljava/util/function/Function;", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<String> schemas;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function<s20.b, List<r20.b>> closure;

    public k(List<String> list, Function<s20.b, List<r20.b>> closure) {
        s.k(closure, "closure");
        this.schemas = list;
        this.closure = closure;
    }

    public final Function<s20.b, List<r20.b>> a() {
        return this.closure;
    }

    public final List<String> b() {
        return this.schemas;
    }

    public /* synthetic */ k(List list, Function function, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, function);
    }
}
