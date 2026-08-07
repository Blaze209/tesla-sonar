package xx;

import android.graphics.Matrix;
import android.media.Image;
import androidx.annotation.NonNull;
import androidx.p003lifecycle.Lifecycle;
import androidx.p003lifecycle.k0;
import androidx.p003lifecycle.w;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_common.zzlx;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.common.MlKitException;
import java.io.Closeable;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
@KeepForSdk
public class e<DetectionResultT> implements Closeable, w {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final GmsLogger f124049f = new GmsLogger("MobileVisionBase", "");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f124050g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f124051a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.mlkit.common.sdkinternal.f f124052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CancellationTokenSource f124053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Executor f124054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Task f124055e;

    @KeepForSdk
    public e(@NonNull com.google.mlkit.common.sdkinternal.f<DetectionResultT, wx.a> fVar, @NonNull Executor executor) {
        this.f124052b = fVar;
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        this.f124053c = cancellationTokenSource;
        this.f124054d = executor;
        fVar.c();
        this.f124055e = fVar.a(executor, new Callable() { // from class: xx.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i11 = e.f124050g;
                return null;
            }
        }, cancellationTokenSource.getToken()).addOnFailureListener(new OnFailureListener() { // from class: xx.h
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                e.f124049f.e("MobileVisionBase", "Error preloading model resource", exc);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, sx.a
    @k0(Lifecycle.a.ON_DESTROY)
    @KeepForSdk
    public synchronized void close() {
        if (this.f124051a.getAndSet(true)) {
            return;
        }
        this.f124053c.cancel();
        this.f124052b.e(this.f124054d);
    }

    @NonNull
    @KeepForSdk
    public synchronized Task<DetectionResultT> n(@NonNull final wx.a aVar) {
        Preconditions.checkNotNull(aVar, "InputImage can not be null");
        if (this.f124051a.get()) {
            return Tasks.forException(new MlKitException("This detector is already closed!", 14));
        }
        if (aVar.m() < 32 || aVar.i() < 32) {
            return Tasks.forException(new MlKitException("InputImage width and height should be at least 32!", 3));
        }
        return this.f124052b.a(this.f124054d, new Callable() { // from class: xx.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f124056a.o(aVar);
            }
        }, this.f124053c.getToken());
    }

    final /* synthetic */ Object o(wx.a aVar) {
        zzlx zzlxVarZze = zzlx.zze("detectorTaskWithResource#run");
        zzlxVarZze.zzb();
        try {
            Object objI = this.f124052b.i(aVar);
            zzlxVarZze.close();
            return objI;
        } catch (Throwable th2) {
            try {
                zzlxVarZze.close();
            } catch (Throwable th3) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                } catch (Exception unused) {
                }
            }
            throw th2;
        }
    }

    @NonNull
    @KeepForSdk
    public Task<DetectionResultT> process(@NonNull Image image, int i11, @NonNull Matrix matrix) {
        return n(wx.a.d(image, i11, matrix));
    }
}
