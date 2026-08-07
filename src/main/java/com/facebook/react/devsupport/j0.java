package com.facebook.react.devsupport;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.ReactContext;
import java.util.Arrays;
import java.util.Locale;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0002\u0017\u0013B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u00060\u001aR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/facebook/react/devsupport/j0;", "Landroid/widget/FrameLayout;", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactContext;)V", "", "currentFPS", "currentJSFPS", "", "droppedUIFrames", "total4PlusFrameStutters", "Ljn0/h0;", "c", "(DDII)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Landroid/widget/TextView;", "a", "Landroid/widget/TextView;", "textView", "Lcom/facebook/react/modules/debug/h;", "b", "Lcom/facebook/react/modules/debug/h;", "frameCallback", "Lcom/facebook/react/devsupport/j0$b;", "Lcom/facebook/react/devsupport/j0$b;", "fpsMonitorRunnable", DateTokenConverter.CONVERTER_KEY, "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j0 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final TextView textView;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final com.facebook.react.modules.debug.h frameCallback;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b fpsMonitorRunnable;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/facebook/react/devsupport/j0$b;", "Ljava/lang/Runnable;", "<init>", "(Lcom/facebook/react/devsupport/j0;)V", "Ljn0/h0;", "run", "()V", "a", "stop", "", "Z", "shouldStop", "", "b", "I", "totalFramesDropped", "c", "total4PlusFrameStutters", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private boolean shouldStop;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int totalFramesDropped;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int total4PlusFrameStutters;

        public b() {
        }

        public final void a() {
            this.shouldStop = false;
            j0.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.shouldStop) {
                return;
            }
            this.totalFramesDropped += j0.this.frameCallback.d() - j0.this.frameCallback.g();
            this.total4PlusFrameStutters += j0.this.frameCallback.getFourPlusFrameStutters();
            j0 j0Var = j0.this;
            j0Var.c(j0Var.frameCallback.e(), j0.this.frameCallback.f(), this.totalFramesDropped, this.total4PlusFrameStutters);
            j0.this.frameCallback.j();
            j0.this.postDelayed(this, 500L);
        }

        public final void stop() {
            this.shouldStop = true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(ReactContext reactContext) {
        super(reactContext);
        p013kotlin.jvm.internal.s.h(reactContext);
        View.inflate(reactContext, com.facebook.react.o.f22879c, this);
        View viewFindViewById = findViewById(com.facebook.react.m.f22665o);
        p013kotlin.jvm.internal.s.i(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        this.textView = (TextView) viewFindViewById;
        this.frameCallback = new com.facebook.react.modules.debug.h(reactContext);
        this.fpsMonitorRunnable = new b();
        c(0.0d, 0.0d, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(double currentFPS, double currentJSFPS, int droppedUIFrames, int total4PlusFrameStutters) {
        p013kotlin.jvm.internal.t0 t0Var = p013kotlin.jvm.internal.t0.f86535a;
        String str = String.format(Locale.US, "UI: %.1f fps\n%d dropped so far\n%d stutters (4+) so far\nJS: %.1f fps", Arrays.copyOf(new Object[]{Double.valueOf(currentFPS), Integer.valueOf(droppedUIFrames), Integer.valueOf(total4PlusFrameStutters), Double.valueOf(currentJSFPS)}, 4));
        p013kotlin.jvm.internal.s.j(str, "format(...)");
        this.textView.setText(str);
        qk.a.b("ReactNative", str);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.frameCallback.j();
        com.facebook.react.modules.debug.h.l(this.frameCallback, 0.0d, 1, null);
        this.fpsMonitorRunnable.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.frameCallback.n();
        this.fpsMonitorRunnable.stop();
    }
}
