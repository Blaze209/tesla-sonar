package ki0;

import com.fourthline.analytics.internal.AnalyticsContext;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"Lki0/k;", "", AnalyticsContext.Screen, "Lki0/j;", "transition", "<init>", "(Ljava/lang/Object;Lki0/j;)V", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "b", "Lki0/j;", "()Lki0/j;", "shared_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Object screen;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j transition;

    public k(Object screen, j transition) {
        p013kotlin.jvm.internal.s.k(screen, "screen");
        p013kotlin.jvm.internal.s.k(transition, "transition");
        this.screen = screen;
        this.transition = transition;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Object getScreen() {
        return this.screen;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final j getTransition() {
        return this.transition;
    }
}
