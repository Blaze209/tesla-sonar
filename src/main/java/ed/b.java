package ed;

import gd.c;
import je.d;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0011\u0010\u0012\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0011¨\u0006\u0013"}, d2 = {"Led/b;", "", "Lgd/c;", "genericActionDelegate", "Lje/d;", "paymentDelegate", "<init>", "(Lgd/c;Lje/d;)V", "a", "Lgd/c;", "b", "Lje/d;", "", "c", "Z", "isHandlingAction", "Lje/b;", "()Lje/b;", "activeDelegate", "action-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c genericActionDelegate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d<?> paymentDelegate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean isHandlingAction;

    public b(c genericActionDelegate, d<?> paymentDelegate) {
        s.k(genericActionDelegate, "genericActionDelegate");
        s.k(paymentDelegate, "paymentDelegate");
        this.genericActionDelegate = genericActionDelegate;
        this.paymentDelegate = paymentDelegate;
    }

    public final je.b a() {
        return this.isHandlingAction ? this.genericActionDelegate.getDelegate() : this.paymentDelegate;
    }
}
