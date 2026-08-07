package zf0;

import android.view.View;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.io.File;
import kotlinx.coroutines.flow.StateFlow;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\u0004J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH¦@¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\nH¦@¢\u0006\u0004\b\u000e\u0010\rJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH¦@¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0005H&¢\u0006\u0004\b\u0011\u0010\bR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lzf0/i;", "", "Ljn0/h0;", "b", "()V", "", "enable", "c", "(Z)V", "f", "Ljn0/s;", "Ljava/io/File;", IntegerTokenConverter.CONVERTER_KEY, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "g", "k", "enableAnalyzer", "j", "Lkotlinx/coroutines/flow/StateFlow;", "Lzf0/w;", "a", "()Lkotlinx/coroutines/flow/StateFlow;", "cameraState", "Landroid/view/View;", "e", "()Landroid/view/View;", "previewView", "Lzf0/u;", DateTokenConverter.CONVERTER_KEY, "()Lzf0/u;", "cameraProperties", "h", "()Z", "isRecordingLocally", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface i {
    StateFlow<w> a();

    void b();

    void c(boolean enable);

    u d();

    View e();

    void f();

    Object g(Continuation<? super jn0.s<Boolean>> continuation);

    boolean h();

    Object i(Continuation<? super jn0.s<? extends File>> continuation);

    void j(boolean enableAnalyzer);

    Object k(Continuation<? super jn0.s<? extends File>> continuation);
}
