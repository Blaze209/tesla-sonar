package o10;

import android.view.MotionEvent;
import android.view.ViewGroup;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.j;
import java.lang.reflect.Method;
import jn0.m;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\r\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lo10/c;", "Lcom/facebook/react/uimanager/j;", "Landroid/view/ViewGroup;", "viewGroup", "<init>", "(Landroid/view/ViewGroup;)V", "Landroid/view/MotionEvent;", "event", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "eventDispatcher", "", "isCapture", "Ljn0/h0;", "w", "(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/EventDispatcher;Z)V", "Ljava/lang/reflect/Method;", "k", "Lkotlin/Lazy;", "v", "()Ljava/lang/reflect/Method;", "handleMotionEventMethod", "l", "a", "react-native-keyboard-controller_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c extends j {

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Lazy handleMotionEventMethod;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ViewGroup viewGroup) {
        super(viewGroup);
        s.k(viewGroup, "viewGroup");
        this.handleMotionEventMethod = m.b(new wn0.a() { // from class: o10.b
            @Override // wn0.a
            public final Object invoke() {
                return c.x();
            }
        });
    }

    private final Method v() {
        return (Method) this.handleMotionEventMethod.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Method x() {
        try {
            try {
                return j.class.getMethod("k", MotionEvent.class, EventDispatcher.class, Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } catch (NoSuchMethodException unused2) {
            return j.class.getMethod("handleMotionEvent", MotionEvent.class, EventDispatcher.class);
        }
    }

    public final void w(MotionEvent event, EventDispatcher eventDispatcher, boolean isCapture) {
        Method methodV = v();
        if (methodV != null) {
            if (a.a(methodV) == 3) {
                methodV.invoke(this, event, eventDispatcher, Boolean.valueOf(isCapture));
            } else {
                methodV.invoke(this, event, eventDispatcher);
            }
        }
    }
}
