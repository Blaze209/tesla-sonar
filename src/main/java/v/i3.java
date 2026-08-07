package v;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.util.Size;
import android.view.Display;
import androidx.annotation.NonNull;
import com.plaid.internal.EnumC4419g;

/* JADX INFO: loaded from: classes.dex */
public class i3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Size f117032e = new Size(1920, 1080);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Size f117033f = new Size(320, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Size f117034g = new Size(640, 480);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object f117035h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile i3 f117036i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final DisplayManager f117037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Size f117038b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z.l f117039c = new z.l();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final z.d f117040d = new z.d();

    private i3(@NonNull Context context) {
        this.f117037a = (DisplayManager) context.getSystemService("display");
    }

    private Size a() {
        Size sizeB = b();
        int width = sizeB.getWidth() * sizeB.getHeight();
        Size size = f117032e;
        if (width > size.getWidth() * size.getHeight()) {
            sizeB = size;
        }
        return this.f117039c.a(sizeB);
    }

    @NonNull
    private Size b() {
        Point point = new Point();
        d(false).getRealSize(point);
        Size size = new Size(point.x, point.y);
        if (o0.c.d(size, f117033f) && (size = this.f117040d.a()) == null) {
            size = f117034g;
        }
        return size.getHeight() > size.getWidth() ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    @NonNull
    public static i3 c(@NonNull Context context) {
        if (f117036i == null) {
            synchronized (f117035h) {
                try {
                    if (f117036i == null) {
                        f117036i = new i3(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f117036i;
    }

    private Display e(@NonNull Display[] displayArr, boolean z11) {
        Display display = null;
        int i11 = -1;
        for (Display display2 : displayArr) {
            if (!z11 || display2.getState() != 1) {
                Point point = new Point();
                display2.getRealSize(point);
                int i12 = point.x;
                int i13 = point.y;
                if (i12 * i13 > i11) {
                    display = display2;
                    i11 = i12 * i13;
                }
            }
        }
        return display;
    }

    @NonNull
    public Display d(boolean z11) {
        Display[] displays = this.f117037a.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display displayE = e(displays, z11);
        if (displayE == null && z11) {
            displayE = e(displays, false);
        }
        if (displayE != null) {
            return displayE;
        }
        throw new IllegalArgumentException("No display can be found from the input display manager!");
    }

    @NonNull
    Size f() {
        if (this.f117038b != null) {
            return this.f117038b;
        }
        this.f117038b = a();
        return this.f117038b;
    }

    void g() {
        this.f117038b = a();
    }
}
