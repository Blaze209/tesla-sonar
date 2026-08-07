package zf0;

import android.view.View;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.withpersona.sdk2.camera.NoSuitableCameraError;
import java.io.File;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.Boxing;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\bJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u000eH\u0096@¢\u0006\u0004\b\u0012\u0010\u0011J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0096@¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lzf0/p0;", "Lzf0/i;", "Landroid/view/View;", "previewView", "<init>", "(Landroid/view/View;)V", "Ljn0/h0;", "b", "()V", "", "enable", "c", "(Z)V", "f", "Ljn0/s;", "Ljava/io/File;", IntegerTokenConverter.CONVERTER_KEY, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "g", "k", "enableAnalyzer", "j", "a", "Landroid/view/View;", "e", "()Landroid/view/View;", "Lkotlinx/coroutines/flow/StateFlow;", "Lzf0/w;", "()Lkotlinx/coroutines/flow/StateFlow;", "cameraState", "Lzf0/u;", DateTokenConverter.CONVERTER_KEY, "()Lzf0/u;", "cameraProperties", "h", "()Z", "isRecordingLocally", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class p0 implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final View previewView;

    public p0(View previewView) {
        p013kotlin.jvm.internal.s.k(previewView, "previewView");
        this.previewView = previewView;
    }

    @Override // zf0.i
    public StateFlow<w> a() {
        return StateFlowKt.MutableStateFlow(w.c.f128331a);
    }

    @Override // zf0.i
    public u d() {
        return new u(null, null, null, 0, 15, null);
    }

    @Override // zf0.i
    /* JADX INFO: renamed from: e, reason: from getter */
    public View getPreviewView() {
        return this.previewView;
    }

    @Override // zf0.i
    public Object g(Continuation<? super jn0.s<Boolean>> continuation) {
        jn0.s.Companion companion = jn0.s.INSTANCE;
        return jn0.s.b(Boxing.boxBoolean(false));
    }

    @Override // zf0.i
    public boolean h() {
        return false;
    }

    @Override // zf0.i
    public Object i(Continuation<? super jn0.s<? extends File>> continuation) {
        jn0.s.Companion companion = jn0.s.INSTANCE;
        return jn0.s.b(jn0.t.a(new NoSuitableCameraError()));
    }

    @Override // zf0.i
    public Object k(Continuation<? super jn0.s<? extends File>> continuation) {
        jn0.s.Companion companion = jn0.s.INSTANCE;
        return jn0.s.b(jn0.t.a(new NoSuitableCameraError()));
    }

    @Override // zf0.i
    public void b() {
    }

    @Override // zf0.i
    public void f() {
    }

    @Override // zf0.i
    public void c(boolean enable) {
    }

    @Override // zf0.i
    public void j(boolean enableAnalyzer) {
    }
}
