package vs;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.WindowManager;
import com.google.android.exoplayer2.util.GlUtil;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class l extends GLSurfaceView {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f119831m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList<b> f119832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SensorManager f119833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Sensor f119834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f119835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Handler f119836e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final m f119837f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final i f119838g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private SurfaceTexture f119839h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Surface f119840i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f119841j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f119842k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f119843l;

    final class a implements GLSurfaceView.Renderer, m.a, d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i f119844a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float[] f119847d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float[] f119848e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float[] f119849f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f119850g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f119851h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float[] f119845b = new float[16];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float[] f119846c = new float[16];

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final float[] f119852i = new float[16];

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final float[] f119853j = new float[16];

        public a(i iVar) {
            float[] fArr = new float[16];
            this.f119847d = fArr;
            float[] fArr2 = new float[16];
            this.f119848e = fArr2;
            float[] fArr3 = new float[16];
            this.f119849f = fArr3;
            this.f119844a = iVar;
            GlUtil.j(fArr);
            GlUtil.j(fArr2);
            GlUtil.j(fArr3);
            this.f119851h = 3.1415927f;
        }

        private float c(float f11) {
            if (f11 > 1.0f) {
                return (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f11))) * 2.0d);
            }
            return 90.0f;
        }

        private void d() {
            Matrix.setRotateM(this.f119848e, 0, -this.f119850g, (float) Math.cos(this.f119851h), (float) Math.sin(this.f119851h), BitmapDescriptorFactory.HUE_RED);
        }

        @Override // vs.d.a
        public synchronized void a(float[] fArr, float f11) {
            float[] fArr2 = this.f119847d;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            this.f119851h = -f11;
            d();
        }

        @Override // vs.m.a
        public synchronized void b(PointF pointF) {
            this.f119850g = pointF.y;
            d();
            Matrix.setRotateM(this.f119849f, 0, -pointF.x, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.f119853j, 0, this.f119847d, 0, this.f119849f, 0);
                Matrix.multiplyMM(this.f119852i, 0, this.f119848e, 0, this.f119853j, 0);
            }
            Matrix.multiplyMM(this.f119846c, 0, this.f119845b, 0, this.f119852i, 0);
            this.f119844a.c(this.f119846c, false);
        }

        @Override // vs.m.a
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return l.this.performClick();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i11, int i12) {
            GLES20.glViewport(0, 0, i11, i12);
            float f11 = i11 / i12;
            Matrix.perspectiveM(this.f119845b, 0, c(f11), f11, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            l.this.e(this.f119844a.d());
        }
    }

    public interface b {
        void v(Surface surface);

        void x(Surface surface);
    }

    public l(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void a(l lVar) {
        Surface surface = lVar.f119840i;
        if (surface != null) {
            Iterator<b> it = lVar.f119832a.iterator();
            while (it.hasNext()) {
                it.next().v(surface);
            }
        }
        f(lVar.f119839h, surface);
        lVar.f119839h = null;
        lVar.f119840i = null;
    }

    public static /* synthetic */ void b(l lVar, SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = lVar.f119839h;
        Surface surface = lVar.f119840i;
        Surface surface2 = new Surface(surfaceTexture);
        lVar.f119839h = surfaceTexture;
        lVar.f119840i = surface2;
        Iterator<b> it = lVar.f119832a.iterator();
        while (it.hasNext()) {
            it.next().x(surface2);
        }
        f(surfaceTexture2, surface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final SurfaceTexture surfaceTexture) {
        this.f119836e.post(new Runnable() { // from class: vs.j
            @Override // java.lang.Runnable
            public final void run() {
                l.b(this.f119828a, surfaceTexture);
            }
        });
    }

    private static void f(SurfaceTexture surfaceTexture, Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    private void h() {
        boolean z11 = this.f119841j && this.f119842k;
        Sensor sensor = this.f119834c;
        if (sensor == null || z11 == this.f119843l) {
            return;
        }
        if (z11) {
            this.f119833b.registerListener(this.f119835d, sensor, 0);
        } else {
            this.f119833b.unregisterListener(this.f119835d);
        }
        this.f119843l = z11;
    }

    public void d(b bVar) {
        this.f119832a.add(bVar);
    }

    public void g(b bVar) {
        this.f119832a.remove(bVar);
    }

    public vs.a getCameraMotionListener() {
        return this.f119838g;
    }

    public us.k getVideoFrameMetadataListener() {
        return this.f119838g;
    }

    public Surface getVideoSurface() {
        return this.f119840i;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f119836e.post(new Runnable() { // from class: vs.k
            @Override // java.lang.Runnable
            public final void run() {
                l.a(this.f119830a);
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.f119842k = false;
        h();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.f119842k = true;
        h();
    }

    public void setDefaultStereoMode(int i11) {
        this.f119838g.f(i11);
    }

    public void setUseSensorRotation(boolean z11) {
        this.f119841j = z11;
        h();
    }

    public l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f119832a = new CopyOnWriteArrayList<>();
        this.f119836e = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) ts.a.e(context.getSystemService("sensor"));
        this.f119833b = sensorManager;
        Sensor defaultSensor = p0.f115040a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.f119834c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        i iVar = new i();
        this.f119838g = iVar;
        a aVar = new a(iVar);
        m mVar = new m(context, aVar, 25.0f);
        this.f119837f = mVar;
        this.f119835d = new d(((WindowManager) ts.a.e((WindowManager) context.getSystemService("window"))).getDefaultDisplay(), mVar, aVar);
        this.f119841j = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(mVar);
    }
}
