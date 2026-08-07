package androidx.compose.ui.platform;

import android.os.Build;
import android.view.ViewConfiguration;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\nR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/platform/p0;", "Landroidx/compose/ui/platform/e3;", "Landroid/view/ViewConfiguration;", "viewConfiguration", "<init>", "(Landroid/view/ViewConfiguration;)V", "a", "Landroid/view/ViewConfiguration;", "", "f", "()J", "longPressTimeoutMillis", "e", "doubleTapTimeoutMillis", "doubleTapMinTimeMillis", "", "c", "()F", "touchSlop", "b", "handwritingSlop", "h", "maximumFlingVelocity", DateTokenConverter.CONVERTER_KEY, "handwritingGestureLineMargin", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class p0 implements e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ViewConfiguration viewConfiguration;

    public p0(ViewConfiguration viewConfiguration) {
        this.viewConfiguration = viewConfiguration;
    }

    @Override // androidx.compose.ui.platform.e3
    public long a() {
        return 40L;
    }

    @Override // androidx.compose.ui.platform.e3
    public float b() {
        return Build.VERSION.SDK_INT >= 34 ? q0.f5905a.b(this.viewConfiguration) : super.b();
    }

    @Override // androidx.compose.ui.platform.e3
    public float c() {
        return this.viewConfiguration.getScaledTouchSlop();
    }

    @Override // androidx.compose.ui.platform.e3
    public float d() {
        return Build.VERSION.SDK_INT >= 34 ? q0.f5905a.a(this.viewConfiguration) : super.d();
    }

    @Override // androidx.compose.ui.platform.e3
    public long e() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // androidx.compose.ui.platform.e3
    public long f() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // androidx.compose.ui.platform.e3
    public float h() {
        return this.viewConfiguration.getScaledMaximumFlingVelocity();
    }
}
