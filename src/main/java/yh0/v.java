package yh0;

import android.view.Window;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0016¨\u0006\u0017"}, d2 = {"Lyh0/v;", "", "", "controlNavigationBar", "controlStatusBar", "<init>", "(ZZ)V", "Lgi0/b;", "imageHelper", "Lgi0/a;", "b", "(Lgi0/b;)Lgi0/a;", "Lyh0/q;", "fileHelper", "Lyh0/i;", "a", "(Lyh0/q;)Lyh0/i;", "Landroid/view/Window;", "window", "Lji0/a;", "c", "(Landroid/view/Window;)Lji0/a;", "Z", "shared_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean controlNavigationBar;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean controlStatusBar;

    /* JADX WARN: Illegal instructions before constructor call */
    public v() {
        boolean z11 = false;
        this(z11, z11, 3, null);
    }

    public final i a(q fileHelper) {
        p013kotlin.jvm.internal.s.k(fileHelper, "fileHelper");
        return fileHelper;
    }

    public final gi0.a b(gi0.b imageHelper) {
        p013kotlin.jvm.internal.s.k(imageHelper, "imageHelper");
        return imageHelper;
    }

    public final ji0.a c(Window window) {
        p013kotlin.jvm.internal.s.k(window, "window");
        return new ji0.a(window, this.controlNavigationBar, this.controlStatusBar);
    }

    public v(boolean z11, boolean z12) {
        this.controlNavigationBar = z11;
        this.controlStatusBar = z12;
    }

    public /* synthetic */ v(boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? true : z11, (i11 & 2) != 0 ? true : z12);
    }
}
