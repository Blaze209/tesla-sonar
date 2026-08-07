package g80;

import c60.LinkConfiguration;
import kotlinx.coroutines.flow.FlowKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lg80/b;", "Lg80/f;", "Lc60/d;", "linkConfigurationCoordinator", "<init>", "(Lc60/d;)V", "Lc60/c;", "configuration", "Lg60/a;", "a", "(Lc60/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lc60/d;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c60.d linkConfigurationCoordinator;

    public b(c60.d linkConfigurationCoordinator) {
        s.k(linkConfigurationCoordinator, "linkConfigurationCoordinator");
        this.linkConfigurationCoordinator = linkConfigurationCoordinator;
    }

    @Override // g80.f
    public Object a(LinkConfiguration linkConfiguration, Continuation<? super g60.a> continuation) {
        return FlowKt.first(this.linkConfigurationCoordinator.c(linkConfiguration), continuation);
    }
}
