package m10;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.uimanager.v0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 E2\u00020\u0001:\u0001(B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\u00122\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u0012¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u0012¢\u0006\u0004\b'\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010/\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00101\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010.R\u0016\u00104\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00106\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00103R\u0016\u0010\u001c\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00103R\u0016\u0010 \u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u00109R\u0016\u0010:\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010+R\u0016\u0010;\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010+R\u0014\u0010>\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010=R\u0014\u0010A\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010@R\u0018\u0010D\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010C¨\u0006F"}, d2 = {"Lm10/g;", "Lcom/facebook/react/views/view/e;", "Lcom/facebook/react/uimanager/v0;", "reactContext", "<init>", "(Lcom/facebook/react/uimanager/v0;)V", "Landroid/view/MotionEvent;", "event", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(Landroid/view/MotionEvent;)V", "j", "k", "h", "()V", "l", "", "dy", "", "imeVisible", "m", "(FZ)Z", "", "getWindowHeight", "()I", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "", "offset", "setOffset", "(D)V", "", "interpolator", "setInterpolator", "(Ljava/lang/String;)V", "scrollImeOnScreenWhenNotVisible", "setScrollKeyboardOnScreenWhenNotVisible", "(Z)V", "scrollImeOffScreenWhenVisible", "setScrollKeyboardOffScreenWhenVisible", "a", "Lcom/facebook/react/uimanager/v0;", "b", "Z", "isHandling", "c", Gender.FEMALE, "lastTouchX", DateTokenConverter.CONVERTER_KEY, "lastTouchY", "e", "I", "lastWindowY", "f", "keyboardHeight", "g", "Le10/a;", "Le10/a;", "scrollKeyboardOnScreenWhenNotVisible", "scrollKeyboardOffScreenWhenVisible", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "bounds", "Ld10/f;", "Ld10/f;", "controller", "Landroid/view/VelocityTracker;", "Landroid/view/VelocityTracker;", "velocityTracker", "n", "react-native-keyboard-controller_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public final class g extends com.facebook.react.views.view.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v0 reactContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean isHandling;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private float lastTouchX;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float lastTouchY;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int lastWindowY;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int keyboardHeight;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int offset;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private e10.a interpolator;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean scrollKeyboardOnScreenWhenNotVisible;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean scrollKeyboardOffScreenWhenVisible;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Rect bounds;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final d10.f controller;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private VelocityTracker velocityTracker;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(v0 reactContext) {
        super(reactContext);
        s.k(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.interpolator = new e10.c();
        this.scrollKeyboardOffScreenWhenVisible = true;
        this.bounds = new Rect();
        this.controller = new d10.f();
    }

    private final int getWindowHeight() {
        Rect bounds;
        WindowManager windowManager;
        if (Build.VERSION.SDK_INT >= 30) {
            Activity currentActivity = this.reactContext.getCurrentActivity();
            WindowMetrics currentWindowMetrics = (currentActivity == null || (windowManager = currentActivity.getWindowManager()) == null) ? null : windowManager.getCurrentWindowMetrics();
            if (currentWindowMetrics != null && (bounds = currentWindowMetrics.getBounds()) != null) {
                return bounds.height();
            }
        }
        return 0;
    }

    private final void h() {
        this.controller.n();
        l();
    }

    private final void i(MotionEvent event) {
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.addMovement(event);
        }
        this.lastTouchX = event.getX();
        this.lastTouchY = event.getY();
        c10.i.a(this, this.bounds);
        this.lastWindowY = this.bounds.top;
    }

    private final void j(MotionEvent event) {
        c10.i.a(this, this.bounds);
        int i11 = this.bounds.top - this.lastWindowY;
        MotionEvent motionEventObtain = MotionEvent.obtain(event);
        motionEventObtain.offsetLocation(BitmapDescriptorFactory.HUE_RED, i11);
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEventObtain);
        }
        float x11 = motionEventObtain.getX() - this.lastTouchX;
        float y11 = motionEventObtain.getY() - this.lastTouchY;
        boolean z11 = false;
        if (!this.isHandling) {
            this.isHandling = Math.abs(y11) > Math.abs(x11) && Math.abs(y11) >= ((float) ViewConfiguration.get(getContext()).getScaledTouchSlop());
        }
        if (this.isHandling) {
            if (this.controller.t()) {
                if (this.keyboardHeight == 0) {
                    this.keyboardHeight = this.controller.q();
                }
                int iA = this.interpolator.a(yn0.a.d(y11), getWindowHeight() - ((int) event.getRawY()), this.controller.q(), this.offset);
                if (iA != 0) {
                    this.controller.r(iA);
                }
            } else if (!this.controller.u()) {
                WindowInsetsCompat windowInsetsCompatH = ViewCompat.H(this);
                if (windowInsetsCompatH != null && windowInsetsCompatH.q(WindowInsetsCompat.n.c())) {
                    z11 = true;
                }
                if (m(y11, z11)) {
                    d10.f.y(this.controller, this, null, 2, null);
                }
            }
            this.lastTouchY = event.getY();
            this.lastTouchX = event.getX();
            this.lastWindowY = this.bounds.top;
        }
    }

    private final void k(MotionEvent event) {
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.addMovement(event);
        }
        VelocityTracker velocityTracker2 = this.velocityTracker;
        if (velocityTracker2 != null) {
            velocityTracker2.computeCurrentVelocity(500);
        }
        VelocityTracker velocityTracker3 = this.velocityTracker;
        this.controller.l((this.controller.t() && this.keyboardHeight == this.controller.q()) ? null : velocityTracker3 != null ? Float.valueOf(velocityTracker3.getYVelocity()) : null);
        l();
    }

    private final void l() {
        this.isHandling = false;
        this.lastTouchX = BitmapDescriptorFactory.HUE_RED;
        this.lastTouchY = BitmapDescriptorFactory.HUE_RED;
        this.lastWindowY = 0;
        this.keyboardHeight = 0;
        this.bounds.setEmpty();
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.velocityTracker = null;
    }

    private final boolean m(float dy2, boolean imeVisible) {
        if (dy2 < BitmapDescriptorFactory.HUE_RED) {
            return !imeVisible && this.scrollKeyboardOnScreenWhenNotVisible;
        }
        return dy2 > BitmapDescriptorFactory.HUE_RED && imeVisible && this.scrollKeyboardOffScreenWhenVisible;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent event) {
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        Integer numValueOf = event != null ? Integer.valueOf(event.getAction()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            i(event);
        } else if (numValueOf != null && numValueOf.intValue() == 2) {
            j(event);
        } else if (numValueOf != null && numValueOf.intValue() == 1) {
            k(event);
        } else if (numValueOf != null && numValueOf.intValue() == 3) {
            h();
        }
        return super.dispatchTouchEvent(event);
    }

    public final void setInterpolator(String interpolator) {
        s.k(interpolator, "interpolator");
        e10.a cVar = h.a().get(interpolator);
        if (cVar == null) {
            cVar = new e10.c();
        }
        this.interpolator = cVar;
    }

    public final void setOffset(double offset) {
        this.offset = (int) c10.d.b((float) offset);
    }

    public final void setScrollKeyboardOffScreenWhenVisible(boolean scrollImeOffScreenWhenVisible) {
        this.scrollKeyboardOffScreenWhenVisible = scrollImeOffScreenWhenVisible;
    }

    public final void setScrollKeyboardOnScreenWhenNotVisible(boolean scrollImeOnScreenWhenNotVisible) {
        this.scrollKeyboardOnScreenWhenNotVisible = scrollImeOnScreenWhenNotVisible;
    }
}
