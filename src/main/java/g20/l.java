package g20;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.HashMap;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R2\u0010\u0015\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u0012j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006`\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R\u0011\u0010\u0018\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lg20/l;", "Lg20/m;", "<init>", "()V", "", "stateIdentifier", "Lg20/g;", "state", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Lg20/g;)V", "c", "(Ljava/lang/String;)Lg20/g;", "e", "(Ljava/lang/String;)V", "Lg20/f;", "a", "(Ljava/lang/String;)Lg20/f;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "trackerState", "b", "()Lg20/m;", "snapshot", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private HashMap<String, g> trackerState = new HashMap<>();

    @Override // g20.m
    public f a(String stateIdentifier) {
        s.k(stateIdentifier, "stateIdentifier");
        g gVarC = c(stateIdentifier);
        if (gVarC == null) {
            return null;
        }
        return gVarC.a();
    }

    public final synchronized m b() {
        l lVar;
        lVar = new l();
        lVar.trackerState = new HashMap<>(this.trackerState);
        return lVar;
    }

    public final synchronized g c(String stateIdentifier) {
        s.k(stateIdentifier, "stateIdentifier");
        return this.trackerState.get(stateIdentifier);
    }

    public final synchronized void d(String stateIdentifier, g state) {
        s.k(stateIdentifier, "stateIdentifier");
        s.k(state, "state");
        this.trackerState.put(stateIdentifier, state);
    }

    public final void e(String stateIdentifier) {
        s.k(stateIdentifier, "stateIdentifier");
        this.trackerState.remove(stateIdentifier);
    }
}
