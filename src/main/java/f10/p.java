package f10;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.v0;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \t2\u00020\u0001:\u0001\u000eB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0017¨\u0006\u0019"}, d2 = {"Lf10/p;", "", "Lcom/facebook/react/uimanager/v0;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/facebook/react/uimanager/v0;)V", "Landroid/view/ViewGroup;", "content", "Ljn0/h0;", "e", "(Landroid/view/ViewGroup;)V", "b", "()V", DateTokenConverter.CONVERTER_KEY, "a", "Lcom/facebook/react/uimanager/v0;", "Lf10/a;", "Lf10/a;", "lastDispatchedDimensions", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "c", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "layoutListener", "Landroid/view/ViewGroup;", "attachedContent", "react-native-keyboard-controller_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class p {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f63843f = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v0 context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Dimensions lastDispatchedDimensions = new Dimensions(0.0d, 0.0d);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private ViewTreeObserver.OnGlobalLayoutListener layoutListener;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private ViewGroup attachedContent;

    public p(v0 v0Var) {
        this.context = v0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(p pVar, ViewGroup viewGroup) {
        pVar.e(viewGroup);
    }

    private final void e(ViewGroup content) {
        if (content == null) {
            return;
        }
        Dimensions dimensions = new Dimensions(c10.d.a(content.getWidth()), c10.d.a(content.getHeight()));
        if (s.f(dimensions, this.lastDispatchedDimensions)) {
            return;
        }
        this.lastDispatchedDimensions = dimensions;
        v0 v0Var = this.context;
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble(Snapshot.HEIGHT, dimensions.getHeight());
        writableMapCreateMap.putDouble(Snapshot.WIDTH, dimensions.getWidth());
        h0 h0Var = h0.f84049a;
        s.j(writableMapCreateMap, "apply(...)");
        c10.g.b(v0Var, "KeyboardController::windowDidResize", writableMapCreateMap);
    }

    public final void b() {
        ViewTreeObserver viewTreeObserver;
        v0 v0Var = this.context;
        if (v0Var == null || f63843f == v0Var.hashCode()) {
            return;
        }
        f63843f = this.context.hashCode();
        final ViewGroup viewGroupA = c10.f.a(this.context);
        this.attachedContent = viewGroupA;
        e(viewGroupA);
        this.layoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: f10.o
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                p.c(this.f63840a, viewGroupA);
            }
        };
        if (viewGroupA == null || (viewTreeObserver = viewGroupA.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(this.layoutListener);
    }

    public final void d() {
        ViewTreeObserver viewTreeObserver;
        ViewGroup viewGroup = this.attachedContent;
        if (viewGroup != null && (viewTreeObserver = viewGroup.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.layoutListener);
        }
        this.attachedContent = null;
        this.layoutListener = null;
    }
}
