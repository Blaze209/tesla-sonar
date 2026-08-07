package dz;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.util.Log;
import android.view.Display;
import android.view.OrientationEventListener;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0005\n\u0002\b\u0007*\u0002',\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0016\u0014B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\nJ\u0015\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0016\u0010\"\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010!R\u0014\u0010.\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010-R\u0011\u00100\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b(\u0010/R\u0011\u00101\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b$\u0010/¨\u00062"}, d2 = {"Ldz/j1;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ldz/j1$a;", "callback", "<init>", "(Landroid/content/Context;Ldz/j1$a;)V", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "()V", "", "degrees", "f", "(I)I", "k", "Lfz/j;", "targetOrientation", "j", "(Lfz/j;)V", "a", "Landroid/content/Context;", "b", "Ldz/j1$a;", "c", "Lfz/j;", "targetOutputOrientation", "Lfz/i;", DateTokenConverter.CONVERTER_KEY, "Lfz/i;", "lastOutputOrientation", "e", "lastPreviewOrientation", "I", "screenRotation", "Landroid/hardware/display/DisplayManager;", "g", "Landroid/hardware/display/DisplayManager;", "displayManager", "dz/j1$d", "h", "Ldz/j1$d;", "displayListener", "deviceRotation", "dz/j1$e", "Ldz/j1$e;", "orientationListener", "()Lfz/i;", "previewOrientation", "outputOrientation", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a callback;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private fz.j targetOutputOrientation;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private fz.i lastOutputOrientation;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private fz.i lastPreviewOrientation;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int screenRotation;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final DisplayManager displayManager;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final d displayListener;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int deviceRotation;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final e orientationListener;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Ldz/j1$a;", "", "Lfz/i;", "outputOrientation", "Ljn0/h0;", "c", "(Lfz/i;)V", "previewOrientation", "n", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface a {
        void c(fz.i outputOrientation);

        void n(fz.i previewOrientation);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f61202a;

        static {
            int[] iArr = new int[fz.j.values().length];
            try {
                iArr[fz.j.DEVICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fz.j.PREVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f61202a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"dz/j1$e", "Landroid/view/OrientationEventListener;", "", "rotationDegrees", "Ljn0/h0;", "onOrientationChanged", "(I)V", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e extends OrientationEventListener {
        e(Context context) {
            super(context);
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int rotationDegrees) {
            if (rotationDegrees == -1) {
                return;
            }
            j1 j1Var = j1.this;
            j1Var.deviceRotation = j1Var.f(rotationDegrees);
            j1.this.i();
        }
    }

    public j1(Context context, a callback) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(callback, "callback");
        this.context = context;
        this.callback = callback;
        this.targetOutputOrientation = fz.j.DEVICE;
        Object systemService = context.getSystemService("display");
        p013kotlin.jvm.internal.s.i(systemService, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
        this.displayManager = (DisplayManager) systemService;
        this.displayListener = new d();
        this.orientationListener = new e(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int f(int degrees) {
        if (45 <= degrees && degrees < 136) {
            return 3;
        }
        if (135 > degrees || degrees >= 226) {
            return (225 > degrees || degrees >= 316) ? 0 : 1;
        }
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        fz.i iVarH = h();
        if (this.lastPreviewOrientation != iVarH) {
            this.callback.n(iVarH);
            this.lastPreviewOrientation = iVarH;
        }
        fz.i iVarG = g();
        if (this.lastOutputOrientation != iVarG) {
            this.callback.c(iVarG);
            this.lastOutputOrientation = iVarG;
        }
    }

    public final fz.i g() {
        int i11 = c.f61202a[this.targetOutputOrientation.ordinal()];
        if (i11 == 1) {
            return fz.i.INSTANCE.b(this.deviceRotation);
        }
        if (i11 == 2) {
            return h();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final fz.i h() {
        return fz.i.INSTANCE.b(this.screenRotation);
    }

    public final void j(fz.j targetOrientation) {
        p013kotlin.jvm.internal.s.k(targetOrientation, "targetOrientation");
        Log.i("OrientationManager", "Target Orientation changed " + this.targetOutputOrientation + " -> " + targetOrientation + "!");
        this.targetOutputOrientation = targetOrientation;
        k();
        int i11 = c.f61202a[targetOrientation.ordinal()];
        if (i11 == 1) {
            Log.i("OrientationManager", "Starting streaming device and screen orientation updates...");
            this.orientationListener.enable();
            this.displayManager.registerDisplayListener(this.displayListener, null);
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            Log.i("OrientationManager", "Starting streaming device and screen orientation updates...");
            this.displayManager.registerDisplayListener(this.displayListener, null);
        }
    }

    public final void k() {
        this.displayManager.unregisterDisplayListener(this.displayListener);
        this.orientationListener.disable();
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"dz/j1$d", "Landroid/hardware/display/DisplayManager$DisplayListener;", "", "displayId", "Ljn0/h0;", "onDisplayAdded", "(I)V", "onDisplayRemoved", "onDisplayChanged", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d implements DisplayManager.DisplayListener {
        d() {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int displayId) {
            Display display = j1.this.displayManager.getDisplay(displayId);
            if (display == null) {
                return;
            }
            j1.this.screenRotation = display.getRotation();
            j1.this.i();
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int displayId) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int displayId) {
        }
    }
}
