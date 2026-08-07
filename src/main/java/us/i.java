package us;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.util.Log;
import com.google.android.exoplayer2.util.GlUtil;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class i extends GLSurfaceView implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f116635b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f116636a;

    private static final class a implements GLSurfaceView.Renderer {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final float[] f116637k = {1.164f, 1.164f, 1.164f, BitmapDescriptorFactory.HUE_RED, -0.392f, 2.017f, 1.596f, -0.813f, BitmapDescriptorFactory.HUE_RED};

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final float[] f116638l = {1.164f, 1.164f, 1.164f, BitmapDescriptorFactory.HUE_RED, -0.213f, 2.112f, 1.793f, -0.533f, BitmapDescriptorFactory.HUE_RED};

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final float[] f116639m = {1.168f, 1.168f, 1.168f, BitmapDescriptorFactory.HUE_RED, -0.188f, 2.148f, 1.683f, -0.652f, BitmapDescriptorFactory.HUE_RED};

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String[] f116640n = {"y_tex", "u_tex", "v_tex"};

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final FloatBuffer f116641o = GlUtil.e(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final GLSurfaceView f116642a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f116643b = new int[3];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f116644c = new int[3];

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int[] f116645d = new int[3];

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int[] f116646e = new int[3];

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final AtomicReference<fr.i> f116647f = new AtomicReference<>();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final FloatBuffer[] f116648g = new FloatBuffer[3];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private com.google.android.exoplayer2.util.b f116649h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f116650i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private fr.i f116651j;

        public a(GLSurfaceView gLSurfaceView) {
            this.f116642a = gLSurfaceView;
            for (int i11 = 0; i11 < 3; i11++) {
                int[] iArr = this.f116645d;
                this.f116646e[i11] = -1;
                iArr[i11] = -1;
            }
        }

        @RequiresNonNull({"program"})
        private void b() {
            try {
                GLES20.glGenTextures(3, this.f116643b, 0);
                for (int i11 = 0; i11 < 3; i11++) {
                    GLES20.glUniform1i(this.f116649h.j(f116640n[i11]), i11);
                    GLES20.glActiveTexture(33984 + i11);
                    GlUtil.a(3553, this.f116643b[i11]);
                }
                GlUtil.b();
            } catch (GlUtil.GlException e11) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures", e11);
            }
        }

        public void a(fr.i iVar) {
            fr.i andSet = this.f116647f.getAndSet(iVar);
            if (andSet != null) {
                andSet.p();
            }
            this.f116642a.requestRender();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            fr.i andSet = this.f116647f.getAndSet(null);
            if (andSet == null && this.f116651j == null) {
                return;
            }
            if (andSet != null) {
                fr.i iVar = this.f116651j;
                if (iVar != null) {
                    iVar.p();
                }
                this.f116651j = andSet;
            }
            fr.i iVar2 = (fr.i) ts.a.e(this.f116651j);
            float[] fArr = f116638l;
            int i11 = iVar2.f66405h;
            if (i11 == 1) {
                fArr = f116637k;
            } else if (i11 == 3) {
                fArr = f116639m;
            }
            GLES20.glUniformMatrix3fv(this.f116650i, 1, false, fArr, 0);
            int[] iArr = (int[]) ts.a.e(iVar2.f66404g);
            ByteBuffer[] byteBufferArr = (ByteBuffer[]) ts.a.e(iVar2.f66403f);
            int i12 = 0;
            while (i12 < 3) {
                int i13 = i12 == 0 ? iVar2.f66402e : (iVar2.f66402e + 1) / 2;
                GLES20.glActiveTexture(33984 + i12);
                GLES20.glBindTexture(3553, this.f116643b[i12]);
                GLES20.glPixelStorei(3317, 1);
                GLES20.glTexImage2D(3553, 0, 6409, iArr[i12], i13, 0, 6409, 5121, byteBufferArr[i12]);
                i12++;
            }
            int i14 = iVar2.f66401d;
            int i15 = (i14 + 1) / 2;
            int[] iArr2 = {i14, i15, i15};
            for (int i16 = 0; i16 < 3; i16++) {
                if (this.f116645d[i16] != iArr2[i16] || this.f116646e[i16] != iArr[i16]) {
                    ts.a.g(iArr[i16] != 0);
                    float f11 = iArr2[i16] / iArr[i16];
                    this.f116648g[i16] = GlUtil.e(new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, f11, BitmapDescriptorFactory.HUE_RED, f11, 1.0f});
                    GLES20.glVertexAttribPointer(this.f116644c[i16], 2, 5126, false, 0, (Buffer) this.f116648g[i16]);
                    this.f116645d[i16] = iArr2[i16];
                    this.f116646e[i16] = iArr[i16];
                }
            }
            GLES20.glClear(16384);
            GLES20.glDrawArrays(5, 0, 4);
            try {
                GlUtil.b();
            } catch (GlUtil.GlException e11) {
                Log.e("VideoDecoderGLSV", "Failed to draw a frame", e11);
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i11, int i12) {
            GLES20.glViewport(0, 0, i11, i12);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            try {
                com.google.android.exoplayer2.util.b bVar = new com.google.android.exoplayer2.util.b("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
                this.f116649h = bVar;
                GLES20.glVertexAttribPointer(bVar.e("in_pos"), 2, 5126, false, 0, (Buffer) f116641o);
                this.f116644c[0] = this.f116649h.e("in_tc_y");
                this.f116644c[1] = this.f116649h.e("in_tc_u");
                this.f116644c[2] = this.f116649h.e("in_tc_v");
                this.f116650i = this.f116649h.j("mColorConversion");
                GlUtil.b();
                b();
                GlUtil.b();
            } catch (GlUtil.GlException e11) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures and program", e11);
            }
        }
    }

    public i(Context context) {
        this(context, null);
    }

    public void setOutputBuffer(fr.i iVar) {
        this.f116636a.a(iVar);
    }

    public i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar = new a(this);
        this.f116636a = aVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setRenderMode(0);
    }

    @Deprecated
    public j getVideoDecoderOutputBufferRenderer() {
        return this;
    }
}
