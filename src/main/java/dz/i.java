package dz;

import android.os.Handler;
import android.os.HandlerThread;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.android.HandlerDispatcher;
import kotlinx.coroutines.android.HandlerDispatcherKt;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Ldz/i;", "", "a", "b", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ExecutorService f61154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ExecutorService f61155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a f61156d;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001a\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\n\u0010\u0019¨\u0006\u001b"}, d2 = {"Ldz/i$a;", "", "", "name", "<init>", "(Ljava/lang/String;)V", "Ljn0/h0;", "finalize", "()V", "Landroid/os/HandlerThread;", "a", "Landroid/os/HandlerThread;", "thread", "Landroid/os/Handler;", "b", "Landroid/os/Handler;", "()Landroid/os/Handler;", "handler", "Lkotlinx/coroutines/CoroutineDispatcher;", "c", "Lkotlinx/coroutines/CoroutineDispatcher;", "coroutineDispatcher", "Ljava/util/concurrent/Executor;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/concurrent/Executor;", "()Ljava/util/concurrent/Executor;", "executor", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final HandlerThread thread;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Handler handler;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final CoroutineDispatcher coroutineDispatcher;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final Executor executor;

        public a(String name) {
            p013kotlin.jvm.internal.s.k(name, "name");
            HandlerThread handlerThread = new HandlerThread(name);
            this.thread = handlerThread;
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper());
            this.handler = handler;
            HandlerDispatcher handlerDispatcherFrom = HandlerDispatcherKt.from(handler, name);
            this.coroutineDispatcher = handlerDispatcherFrom;
            this.executor = ExecutorsKt.asExecutor(handlerDispatcherFrom);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Executor getExecutor() {
            return this.executor;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Handler getHandler() {
            return this.handler;
        }

        protected final void finalize() {
            this.thread.quitSafely();
        }
    }

    /* JADX INFO: renamed from: dz.i$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ldz/i$b;", "", "<init>", "()V", "Ljava/util/concurrent/ExecutorService;", "analyzerExecutor", "Ljava/util/concurrent/ExecutorService;", "a", "()Ljava/util/concurrent/ExecutorService;", "cameraExecutor", "b", "Ldz/i$a;", "videoQueue", "Ldz/i$a;", "c", "()Ldz/i$a;", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ExecutorService a() {
            return i.f61154b;
        }

        public final ExecutorService b() {
            return i.f61155c;
        }

        public final a c() {
            return i.f61156d;
        }

        private Companion() {
        }
    }

    static {
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        p013kotlin.jvm.internal.s.j(executorServiceNewCachedThreadPool, "newCachedThreadPool(...)");
        f61154b = executorServiceNewCachedThreadPool;
        ExecutorService executorServiceNewCachedThreadPool2 = Executors.newCachedThreadPool();
        p013kotlin.jvm.internal.s.j(executorServiceNewCachedThreadPool2, "newCachedThreadPool(...)");
        f61155c = executorServiceNewCachedThreadPool2;
        f61156d = new a("mrousavy/VisionCamera.video");
    }
}
