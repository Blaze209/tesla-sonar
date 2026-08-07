package androidx.media3.exoplayer.video;

import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;
import p7.e1;
import p7.u;
import s7.e0;

/* JADX INFO: loaded from: classes3.dex */
public interface VideoSink {

    public static final class VideoSinkException extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u f11181a;

        public VideoSinkException(Throwable th2, u uVar) {
            super(th2);
            this.f11181a = uVar;
        }
    }

    public interface b {
        void a();

        void b(long j11);
    }

    void A(int i11, u uVar, long j11, int i12, List<Object> list);

    void B();

    void C(boolean z11);

    void D(boolean z11);

    boolean E(u uVar);

    boolean a();

    void d(long j11, long j12);

    boolean isInitialized();

    void l(float f11);

    Surface m();

    void n();

    void o();

    void p(u8.k kVar);

    void q();

    void r();

    void release();

    void s();

    void t(int i11);

    void u(a aVar, Executor executor);

    boolean v(long j11, b bVar);

    void w(Surface surface, e0 e0Var);

    void x(long j11);

    void y(List<Object> list);

    boolean z(boolean z11);

    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f11182a = new C0206a();

        /* JADX INFO: renamed from: androidx.media3.exoplayer.video.VideoSink$a$a, reason: collision with other inner class name */
        class C0206a implements a {
            C0206a() {
            }
        }

        default void a() {
        }

        default void c() {
        }

        default void onFirstFrameRendered() {
        }

        default void b(e1 e1Var) {
        }
    }
}
