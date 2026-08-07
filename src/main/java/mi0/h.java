package mi0;

import android.view.View;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"Lmi0/h;", "", "Lmi0/i;", "viewBindings", "Landroid/view/View;", "contentView", "footerView", "<init>", "(Lmi0/i;Landroid/view/View;Landroid/view/View;)V", "a", "Lmi0/i;", "c", "()Lmi0/i;", "b", "Landroid/view/View;", "()Landroid/view/View;", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i viewBindings;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final View contentView;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final View footerView;

    public h(i viewBindings, View contentView, View view) {
        s.k(viewBindings, "viewBindings");
        s.k(contentView, "contentView");
        this.viewBindings = viewBindings;
        this.contentView = contentView;
        this.footerView = view;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final View getContentView() {
        return this.contentView;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final View getFooterView() {
        return this.footerView;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final i getViewBindings() {
        return this.viewBindings;
    }
}
