package zf0;

import android.graphics.BitmapFactory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;
import p013kotlin.Lazy;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lzf0/y0;", "", "<init>", "()V", "", "imagePath", "b", "(Ljava/lang/String;)Ljava/lang/String;", "Ldy/c;", "a", "Lkotlin/Lazy;", "c", "()Ldy/c;", "textDetector", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy textDetector = jn0.m.b(new wn0.a() { // from class: zf0.x0
        @Override // wn0.a
        public final Object invoke() {
            return y0.d();
        }
    });

    private final dy.c c() {
        return (dy.c) this.textDetector.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dy.c d() {
        dy.c cVarA = dy.b.a(fy.a.f66714d);
        p013kotlin.jvm.internal.s.j(cVarA, "getClient(...)");
        return cVarA;
    }

    public final String b(String imagePath) {
        p013kotlin.jvm.internal.s.k(imagePath, "imagePath");
        try {
            wx.a aVarA = wx.a.a(BitmapFactory.decodeFile(imagePath), 0);
            p013kotlin.jvm.internal.s.j(aVarA, "fromBitmap(...)");
            Task<dy.a> taskProcess = c().process(aVarA);
            p013kotlin.jvm.internal.s.j(taskProcess, "process(...)");
            try {
                Tasks.await(taskProcess);
            } catch (ExecutionException unused) {
            }
            return taskProcess.getResult().a();
        } catch (Exception unused2) {
            return null;
        }
    }
}
