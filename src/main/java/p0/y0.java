package p0;

import androidx.annotation.NonNull;
import androidx.camera.core.ProcessingException;
import androidx.core.util.Consumer;
import c0.o1;
import c0.p1;
import c0.z1;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class y0 implements r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final p1 f100227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final Executor f100228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final Consumer<Throwable> f100229c;

    public y0(@NonNull c0.j jVar) {
        p1 p1VarF = jVar.f();
        Objects.requireNonNull(p1VarF);
        this.f100227a = p1VarF;
        this.f100228b = jVar.c();
        this.f100229c = jVar.b();
    }

    public static /* synthetic */ void d(y0 y0Var, o1 o1Var) {
        y0Var.getClass();
        try {
            y0Var.f100227a.c(o1Var);
        } catch (ProcessingException e11) {
            c0.y0.d("SurfaceProcessor", "Failed to setup SurfaceProcessor output.", e11);
            y0Var.f100229c.accept(e11);
        }
    }

    public static /* synthetic */ void e(y0 y0Var, z1 z1Var) {
        y0Var.getClass();
        try {
            y0Var.f100227a.b(z1Var);
        } catch (ProcessingException e11) {
            c0.y0.d("SurfaceProcessor", "Failed to setup SurfaceProcessor input.", e11);
            y0Var.f100229c.accept(e11);
        }
    }

    @Override // p0.r0
    @NonNull
    public com.google.common.util.concurrent.s<Void> a(int i11, int i12) {
        return j0.n.n(new Exception("Snapshot not supported by external SurfaceProcessor"));
    }

    @Override // c0.p1
    public void b(@NonNull final z1 z1Var) {
        this.f100228b.execute(new Runnable() { // from class: p0.w0
            @Override // java.lang.Runnable
            public final void run() {
                y0.e(this.f100217a, z1Var);
            }
        });
    }

    @Override // c0.p1
    public void c(@NonNull final o1 o1Var) {
        this.f100228b.execute(new Runnable() { // from class: p0.x0
            @Override // java.lang.Runnable
            public final void run() {
                y0.d(this.f100222a, o1Var);
            }
        });
    }

    @Override // p0.r0
    public void release() {
    }
}
