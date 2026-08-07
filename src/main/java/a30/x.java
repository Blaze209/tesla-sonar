package a30;

import kotlinx.coroutines.Job;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"La30/x;", "", "La30/t;", "controller", "Lkotlinx/coroutines/Job;", "subscription", "<init>", "(La30/t;Lkotlinx/coroutines/Job;)V", "a", "La30/t;", "()La30/t;", "b", "Lkotlinx/coroutines/Job;", "()Lkotlinx/coroutines/Job;", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t controller;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Job subscription;

    public x(t controller, Job subscription) {
        p013kotlin.jvm.internal.s.k(controller, "controller");
        p013kotlin.jvm.internal.s.k(subscription, "subscription");
        this.controller = controller;
        this.subscription = subscription;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final t getController() {
        return this.controller;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Job getSubscription() {
        return this.subscription;
    }
}
