package p0;

import androidx.annotation.NonNull;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ProcessingException;
import androidx.core.util.Consumer;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final Executor f100224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final c0.v0 f100225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final Consumer<Throwable> f100226c;

    public y(@NonNull c0.j jVar) {
        u5.h.a(jVar.g() == 4);
        this.f100224a = jVar.c();
        c0.v0 v0VarD = jVar.d();
        Objects.requireNonNull(v0VarD);
        this.f100225b = v0VarD;
        this.f100226c = jVar.b();
    }

    public static /* synthetic */ Object a(final y yVar, final c0.v0.a aVar, final androidx.concurrent.futures.c.a aVar2) {
        yVar.f100224a.execute(new Runnable() { // from class: p0.x
            @Override // java.lang.Runnable
            public final void run() {
                y.b(this.f100219a, aVar, aVar2);
            }
        });
        return "InternalImageProcessor#process " + aVar.hashCode();
    }

    public static /* synthetic */ void b(y yVar, c0.v0.a aVar, androidx.concurrent.futures.c.a aVar2) {
        yVar.getClass();
        try {
            aVar2.c(yVar.f100225b.a(aVar));
        } catch (ProcessingException e11) {
            yVar.f100226c.accept(e11);
            aVar2.f(e11);
        }
    }

    @NonNull
    public c0.v0.b c(@NonNull final c0.v0.a aVar) throws ImageCaptureException {
        try {
            return (c0.v0.b) androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: p0.w
                @Override // androidx.concurrent.futures.c.InterfaceC0146c
                public final Object a(androidx.concurrent.futures.c.a aVar2) {
                    return y.a(this.f100215a, aVar, aVar2);
                }
            }).get();
        } catch (Exception e11) {
            e = e11;
            if (e.getCause() != null) {
                e = e.getCause();
            }
            throw new ImageCaptureException(0, "Failed to invoke ImageProcessor.", e);
        }
    }
}
