package ki0;

import android.view.View;
import android.view.ViewTreeObserver;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\nB\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lki0/g;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "Ljava/lang/Runnable;", "runnable", "<init>", "(Landroid/view/View;Ljava/lang/Runnable;)V", "Ljn0/h0;", "a", "()V", "", "onPreDraw", "()Z", "v", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "Landroid/view/View;", "b", "Ljava/lang/Runnable;", "Landroid/view/ViewTreeObserver;", "c", "Landroid/view/ViewTreeObserver;", "viewTreeObserver", DateTokenConverter.CONVERTER_KEY, "shared_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final View view;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Runnable runnable;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private ViewTreeObserver viewTreeObserver;

    /* JADX INFO: renamed from: ki0.g$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lki0/g$a;", "", "<init>", "()V", "Landroid/view/View;", "view", "Ljava/lang/Runnable;", "runnable", "Lki0/g;", "a", "(Landroid/view/View;Ljava/lang/Runnable;)Lki0/g;", "shared_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a(View view, Runnable runnable) {
            p013kotlin.jvm.internal.s.k(view, "view");
            p013kotlin.jvm.internal.s.k(runnable, "runnable");
            g gVar = new g(view, runnable, null);
            view.getViewTreeObserver().addOnPreDrawListener(gVar);
            view.addOnAttachStateChangeListener(gVar);
            return gVar;
        }

        private Companion() {
        }
    }

    public /* synthetic */ g(View view, Runnable runnable, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, runnable);
    }

    private final void a() {
        if (this.viewTreeObserver.isAlive()) {
            this.viewTreeObserver.removeOnPreDrawListener(this);
        } else {
            this.view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.view.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        a();
        this.runnable.run();
        return false;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View v11) {
        p013kotlin.jvm.internal.s.k(v11, "v");
        this.viewTreeObserver = v11.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v11) {
        p013kotlin.jvm.internal.s.k(v11, "v");
        a();
    }

    private g(View view, Runnable runnable) {
        this.view = view;
        this.runnable = runnable;
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        p013kotlin.jvm.internal.s.j(viewTreeObserver, "getViewTreeObserver(...)");
        this.viewTreeObserver = viewTreeObserver;
    }
}
