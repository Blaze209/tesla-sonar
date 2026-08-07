package c20;

import java.util.function.Function;
import k20.j;
import k20.k;
import k20.n;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002R\u001a\u0010\u0007\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000f¨\u0006\u0011"}, d2 = {"Lc20/b;", "Lk20/n;", "Lk20/j;", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "identifier", "Lp20/a;", "b", "Lp20/a;", "getGlobalContext", "()Lp20/a;", "globalContext", "Lk20/k;", "()Lk20/k;", "entitiesConfiguration", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b implements n, j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String identifier;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p20.a globalContext;

    @Override // k20.n
    /* JADX INFO: renamed from: a, reason: from getter */
    public String getIdentifier() {
        return this.identifier;
    }

    @Override // k20.j
    public k b() {
        final p20.a aVar = this.globalContext;
        return new k(null, new Function() { // from class: c20.a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return aVar.a((s20.b) obj);
            }
        }, 1, null);
    }
}
