package com.fourthline.vision.internal;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import java.io.File;
import java.lang.ref.WeakReference;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.vision.internal.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4298v extends GLSurfaceView implements W5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final G f38982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final N5 f38983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeakReference f38984c;

    /* JADX INFO: renamed from: com.fourthline.vision.internal.v$a */
    public interface a {
        void onSurfaceCreated(SurfaceTexture surfaceTexture);

        void onSurfaceDestroyed();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4298v(Context context, AttributeSet attributeSet, InterfaceC4306w0 mediaCodecDataSource) {
        this(context, attributeSet, 0, mediaCodecDataSource, 4, null);
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(mediaCodecDataSource, "mediaCodecDataSource");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resetVideoEncoder$lambda$1(C4298v c4298v) {
        c4298v.f38982a.setFrameListener(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setVideoEncoder$lambda$0(C4268q3 c4268q3, C4298v c4298v) {
        if (c4268q3 != null) {
            c4268q3.setEglContext();
        }
        c4298v.f38982a.setFrameListener(c4268q3);
    }

    public final WeakReference<a> getListener() {
        return this.f38984c;
    }

    public final SurfaceTexture getSurfaceTexture() {
        return this.f38982a.getSurfaceTexture();
    }

    @Override // com.fourthline.vision.internal.W5
    public void resetVideoEncoder() {
        queueEvent(new Runnable() { // from class: com.fourthline.vision.internal.sb
            @Override // java.lang.Runnable
            public final void run() {
                C4298v.resetVideoEncoder$lambda$1(this.f38870a);
            }
        });
    }

    public final void setListener(WeakReference<a> weakReference) {
        this.f38984c = weakReference;
    }

    @Override // com.fourthline.vision.internal.W5
    public void setVideoEncoder(final C4268q3 c4268q3) {
        queueEvent(new Runnable() { // from class: com.fourthline.vision.internal.tb
            @Override // java.lang.Runnable
            public final void run() {
                C4298v.setVideoEncoder$lambda$0(c4268q3, this);
            }
        });
    }

    public final void startRecording(File outputFile) {
        p013kotlin.jvm.internal.s.k(outputFile, "outputFile");
        this.f38983b.startRecording(outputFile);
    }

    public final Object stopRecording(Continuation<? super File> continuation) {
        return this.f38983b.stopRecording(continuation);
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder holder) {
        p013kotlin.jvm.internal.s.k(holder, "holder");
        super.surfaceDestroyed(holder);
        this.f38982a.onSurfaceDestroyed();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4298v(Context context, InterfaceC4306w0 mediaCodecDataSource) {
        this(context, null, 0, mediaCodecDataSource, 6, null);
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(mediaCodecDataSource, "mediaCodecDataSource");
    }

    public /* synthetic */ C4298v(Context context, AttributeSet attributeSet, int i11, InterfaceC4306w0 interfaceC4306w0, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11, interfaceC4306w0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4298v(Context context, AttributeSet attributeSet, int i11, InterfaceC4306w0 mediaCodecDataSource) {
        super(context, attributeSet);
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(mediaCodecDataSource, "mediaCodecDataSource");
        G g11 = new G(this);
        this.f38982a = g11;
        this.f38983b = new N5(this, mediaCodecDataSource);
        setEGLContextClientVersion(2);
        setRenderer(g11);
    }
}
