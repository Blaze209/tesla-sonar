package v8;

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
import androidx.media3.common.util.GlUtil;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends GLSurfaceView {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f118387m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList<b> f118388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SensorManager f118389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Sensor f118390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f118391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Handler f118392e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final m f118393f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final i f118394g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private SurfaceTexture f118395h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Surface f118396i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f118397j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f118398k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f118399l;

    final class a implements GLSurfaceView.Renderer, m.a, d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i f118400a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float[] f118403d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float[] f118404e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float[] f118405f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f118406g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f118407h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float[] f118401b = new float[16];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float[] f118402c = new float[16];

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final float[] f118408i = new float[16];

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final float[] f118409j = new float[16];

        public a(i iVar) {
            float[] fArr = new float[16];
            this.f118403d = fArr;
            float[] fArr2 = new float[16];
            this.f118404e = fArr2;
            float[] fArr3 = new float[16];
            this.f118405f = fArr3;
            this.f118400a = iVar;
            GlUtil.o(fArr);
            GlUtil.o(fArr2);
            GlUtil.o(fArr3);
            this.f118407h = 3.1415927f;
        }

        private float c(float f11) {
            if (f11 > 1.0f) {
                return (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f11))) * 2.0d);
            }
            return 90.0f;
        }

        private void d() {
            Matrix.setRotateM(this.f118404e, 0, -this.f118406g, (float) Math.cos(this.f118407h), (float) Math.sin(this.f118407h), BitmapDescriptorFactory.HUE_RED);
        }

        @Override // v8.d.a
        public synchronized void a(float[] fArr, float f11) {
            float[] fArr2 = this.f118403d;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            this.f118407h = -f11;
            d();
        }

        @Override // v8.m.a
        public synchronized void b(PointF pointF) {
            this.f118406g = pointF.y;
            d();
            Matrix.setRotateM(this.f118405f, 0, -pointF.x, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.f118409j, 0, this.f118403d, 0, this.f118405f, 0);
                Matrix.multiplyMM(this.f118408i, 0, this.f118404e, 0, this.f118409j, 0);
            }
            Matrix.multiplyMM(this.f118402c, 0, this.f118401b, 0, this.f118408i, 0);
            this.f118400a.c(this.f118402c, false);
        }

        @Override // v8.m.a
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return l.this.performClick();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i11, int i12) {
            GLES20.glViewport(0, 0, i11, i12);
            float f11 = i11 / i12;
            Matrix.perspectiveM(this.f118401b, 0, c(f11), f11, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            l.this.e(this.f118400a.d());
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
        Surface surface = lVar.f118396i;
        if (surface != null) {
            Iterator<b> it = lVar.f118388a.iterator();
            while (it.hasNext()) {
                it.next().v(surface);
            }
        }
        f(lVar.f118395h, surface);
        lVar.f118395h = null;
        lVar.f118396i = null;
    }

    public static /* synthetic */ void b(l lVar, SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = lVar.f118395h;
        Surface surface = lVar.f118396i;
        Surface surface2 = new Surface(surfaceTexture);
        lVar.f118395h = surfaceTexture;
        lVar.f118396i = surface2;
        Iterator<b> it = lVar.f118388a.iterator();
        while (it.hasNext()) {
            it.next().x(surface2);
        }
        f(surfaceTexture2, surface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final SurfaceTexture surfaceTexture) {
        this.f118392e.post(new Runnable() { // from class: v8.k
            @Override // java.lang.Runnable
            public final void run() {
                l.b(this.f118385a, surfaceTexture);
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
        boolean z11 = this.f118397j && this.f118398k;
        Sensor sensor = this.f118390c;
        if (sensor == null || z11 == this.f118399l) {
            return;
        }
        if (z11) {
            this.f118389b.registerListener(this.f118391d, sensor, 0);
        } else {
            this.f118389b.unregisterListener(this.f118391d);
        }
        this.f118399l = z11;
    }

    public void d(b bVar) {
        this.f118388a.add(bVar);
    }

    public void g(b bVar) {
        this.f118388a.remove(bVar);
    }

    public v8.a getCameraMotionListener() {
        return this.f118394g;
    }

    public u8.k getVideoFrameMetadataListener() {
        return this.f118394g;
    }

    public Surface getVideoSurface() {
        return this.f118396i;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f118392e.post(new Runnable() { // from class: v8.j
            @Override // java.lang.Runnable
            public final void run() {
                l.a(this.f118384a);
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.f118398k = false;
        h();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.f118398k = true;
        h();
    }

    public void setDefaultStereoMode(int i11) {
        this.f118394g.f(i11);
    }

    public void setUseSensorRotation(boolean z11) {
        this.f118397j = z11;
        h();
    }

    public l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f118388a = new CopyOnWriteArrayList<>();
        this.f118392e = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) s7.a.f(context.getSystemService("sensor"));
        this.f118389b = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.f118390c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        i iVar = new i();
        this.f118394g = iVar;
        a aVar = new a(iVar);
        m mVar = new m(context, aVar, 25.0f);
        this.f118393f = mVar;
        this.f118391d = new d(((WindowManager) s7.a.f((WindowManager) context.getSystemService("window"))).getDefaultDisplay(), mVar, aVar);
        this.f118397j = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(mVar);
    }
}
