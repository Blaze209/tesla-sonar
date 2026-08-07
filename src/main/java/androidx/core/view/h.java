package androidx.core.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f7800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f7801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f7802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f7803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private VelocityTracker f7804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f7805f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f7806g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f7807h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f7808i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f7809j;

    interface a {
        float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i11);
    }

    interface b {
        void a(Context context, int[] iArr, MotionEvent motionEvent, int i11);
    }

    public h(Context context, i iVar) {
        this(context, iVar, new b() { // from class: androidx.core.view.f
            @Override // androidx.core.view.h.b
            public final void a(Context context2, int[] iArr, MotionEvent motionEvent, int i11) {
                h.c(context2, iArr, motionEvent, i11);
            }
        }, new a() { // from class: androidx.core.view.g
            @Override // androidx.core.view.h.a
            public final float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i11) {
                return h.f(velocityTracker, motionEvent, i11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, int[] iArr, MotionEvent motionEvent, int i11) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = p0.i(context, viewConfiguration, motionEvent.getDeviceId(), i11, motionEvent.getSource());
        iArr[1] = p0.h(context, viewConfiguration, motionEvent.getDeviceId(), i11, motionEvent.getSource());
    }

    private boolean d(MotionEvent motionEvent, int i11) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.f7807h == source && this.f7808i == deviceId && this.f7806g == i11) {
            return false;
        }
        this.f7802c.a(this.f7800a, this.f7809j, motionEvent, i11);
        this.f7807h = source;
        this.f7808i = deviceId;
        this.f7806g = i11;
        return true;
    }

    private float e(MotionEvent motionEvent, int i11) {
        if (this.f7804e == null) {
            this.f7804e = VelocityTracker.obtain();
        }
        return this.f7803d.a(this.f7804e, motionEvent, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float f(VelocityTracker velocityTracker, MotionEvent motionEvent, int i11) {
        k0.a(velocityTracker, motionEvent);
        k0.b(velocityTracker, 1000);
        return k0.d(velocityTracker, i11);
    }

    public void g(MotionEvent motionEvent, int i11) {
        boolean zD = d(motionEvent, i11);
        if (this.f7809j[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f7804e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f7804e = null;
                return;
            }
            return;
        }
        float fE = e(motionEvent, i11) * this.f7801b.a();
        float fSignum = Math.signum(fE);
        float f11 = BitmapDescriptorFactory.HUE_RED;
        if (zD || (fSignum != Math.signum(this.f7805f) && fSignum != BitmapDescriptorFactory.HUE_RED)) {
            this.f7801b.c();
        }
        float fAbs = Math.abs(fE);
        int[] iArr = this.f7809j;
        if (fAbs < iArr[0]) {
            return;
        }
        int i12 = iArr[1];
        float fMax = Math.max(-i12, Math.min(fE, i12));
        if (this.f7801b.b(fMax)) {
            f11 = fMax;
        }
        this.f7805f = f11;
    }

    h(Context context, i iVar, b bVar, a aVar) {
        this.f7806g = -1;
        this.f7807h = -1;
        this.f7808i = -1;
        this.f7809j = new int[]{Integer.MAX_VALUE, 0};
        this.f7800a = context;
        this.f7801b = iVar;
        this.f7802c = bVar;
        this.f7803d = aVar;
    }
}
