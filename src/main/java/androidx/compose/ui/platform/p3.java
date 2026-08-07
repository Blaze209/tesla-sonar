package androidx.compose.ui.platform;

import android.view.View;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bç\u0080\u0001\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/p3;", "", "Landroid/view/View;", "windowRootView", "Lr2/m2;", "a", "(Landroid/view/View;)Lr2/m2;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f5902a;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.p3$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\n\u001a\u00020\u00048\u0006¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/p3$a;", "", "<init>", "()V", "Landroidx/compose/ui/platform/p3;", "b", "Landroidx/compose/ui/platform/p3;", "c", "()Landroidx/compose/ui/platform/p3;", "getLifecycleAware$annotations", "LifecycleAware", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f5902a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final p3 LifecycleAware = new p3() { // from class: androidx.compose.ui.platform.o3
            @Override // androidx.compose.ui.platform.p3
            public final p020r2.m2 a(View view) {
                return p3.Companion.b(view);
            }
        };

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p020r2.m2 b(View view) {
            return r3.c(view, null, null, 3, null);
        }

        public final p3 c() {
            return LifecycleAware;
        }
    }

    p020r2.m2 a(View windowRootView);
}
