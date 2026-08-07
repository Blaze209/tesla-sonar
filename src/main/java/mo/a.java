package mo;

import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u00052\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u0003J\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0016¨\u0006\u0017"}, d2 = {"Lmo/a;", "Lmo/b;", "<init>", "()V", "Ljn0/h0;", "c", "", "tag", "Landroid/view/ViewParent;", "viewParentBlockingNativeResponder", DateTokenConverter.CONVERTER_KEY, "(ILandroid/view/ViewParent;)V", "b", "Landroid/view/ViewGroup;", "view", "Landroid/view/MotionEvent;", "event", "", "a", "(Landroid/view/ViewGroup;Landroid/view/MotionEvent;)Z", "I", "currentJSResponder", "Landroid/view/ViewParent;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C1976a f92416c = new C1976a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private volatile int currentJSResponder = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private ViewParent viewParentBlockingNativeResponder;

    /* JADX INFO: renamed from: mo.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lmo/a$a;", "", "<init>", "()V", "", "JS_RESPONDER_UNSET", "I", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class C1976a {
        public /* synthetic */ C1976a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1976a() {
        }
    }

    private final void c() {
        ViewParent viewParent = this.viewParentBlockingNativeResponder;
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(false);
        }
        this.viewParentBlockingNativeResponder = null;
    }

    @Override // mo.b
    public boolean a(ViewGroup view, MotionEvent event) {
        s.k(view, "view");
        s.k(event, "event");
        int i11 = this.currentJSResponder;
        return (i11 == -1 || event.getAction() == 1 || view.getId() != i11) ? false : true;
    }

    public final void b() {
        this.currentJSResponder = -1;
        c();
    }

    public final void d(int tag, ViewParent viewParentBlockingNativeResponder) {
        this.currentJSResponder = tag;
        c();
        if (viewParentBlockingNativeResponder != null) {
            viewParentBlockingNativeResponder.requestDisallowInterceptTouchEvent(true);
            this.viewParentBlockingNativeResponder = viewParentBlockingNativeResponder;
        }
    }
}
