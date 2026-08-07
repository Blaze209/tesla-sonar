package androidx.compose.ui.platform;

import androidx.p003lifecycle.Lifecycle;
import androidx.p003lifecycle.LifecycleOwner;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/a;", "view", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Lkotlin/Function0;", "Ljn0/h0;", "c", "(Landroidx/compose/ui/platform/a;Landroidx/lifecycle/Lifecycle;)Lwn0/a;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class d3 {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Lifecycle f5686c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.p003lifecycle.u f5687d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Lifecycle lifecycle, androidx.p003lifecycle.u uVar) {
            super(0);
            this.f5686c = lifecycle;
            this.f5687d = uVar;
        }

        public final void b() {
            this.f5686c.d(this.f5687d);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ jn0.h0 invoke() {
            b();
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wn0.a<jn0.h0> c(final androidx.compose.ui.platform.a aVar, Lifecycle lifecycle) {
        if (lifecycle.getState().compareTo(Lifecycle.State.DESTROYED) > 0) {
            androidx.p003lifecycle.u uVar = new androidx.p003lifecycle.u() { // from class: androidx.compose.ui.platform.c3
                @Override // androidx.p003lifecycle.u
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.a aVar2) {
                    d3.d(aVar, lifecycleOwner, aVar2);
                }
            };
            lifecycle.a(uVar);
            return new a(lifecycle, uVar);
        }
        throw new IllegalStateException(("Cannot configure " + aVar + " to disposeComposition at Lifecycle ON_DESTROY: " + lifecycle + "is already destroyed").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(androidx.compose.ui.platform.a aVar, LifecycleOwner lifecycleOwner, Lifecycle.a aVar2) {
        if (aVar2 == Lifecycle.a.ON_DESTROY) {
            aVar.e();
        }
    }
}
