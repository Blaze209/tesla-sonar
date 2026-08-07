package q1;

import androidx.compose.ui.platform.z0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lq1/t;", "Landroidx/compose/ui/d$c;", "Lb4/h;", "Li3/j;", "<init>", "()V", "Landroidx/compose/ui/focus/k;", "focusProperties", "Ljn0/h0;", "y1", "(Landroidx/compose/ui/focus/k;)V", "", "n", "Z", "c2", "()Z", "shouldAutoInvalidate", "Ls3/b;", "x2", "()Ls3/b;", "inputModeManager", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class t extends androidx.compose.ui.d.c implements b4.h, i3.j {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    private final s3.b x2() {
        return (s3.b) b4.i.a(this, z0.l());
    }

    @Override // androidx.compose.ui.d.c
    /* JADX INFO: renamed from: c2, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // i3.j
    public void y1(androidx.compose.ui.focus.k focusProperties) {
        focusProperties.r(!s3.a.f(x2().a(), s3.a.INSTANCE.b()));
    }
}
