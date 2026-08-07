package w0;

import android.media.Image;
import android.media.ImageWriter;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.s1;
import androidx.camera.core.n;
import androidx.camera.core.o;
import androidx.camera.extensions.internal.compat.quirk.CaptureOutputSurfaceOccupiedQuirk;
import c0.y0;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ImageWriter f120238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s1 f120239c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    private final Surface f120241e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f120242f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f120243g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f120237a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f120240d = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    long f120244h = -1;

    static final class a {
        static void a(@NonNull Image image, long j11) {
            image.setTimestamp(j11);
        }
    }

    static final class b {
        static void a(ImageWriter imageWriter) {
            imageWriter.close();
        }

        @NonNull
        static ImageWriter b(@NonNull Surface surface, int i11, int i12) {
            return ImageWriter.newInstance(surface, i11, i12);
        }

        static void c(@NonNull ImageWriter imageWriter, @NonNull Image image) {
            imageWriter.queueInputImage(image);
        }
    }

    public c(@NonNull Surface surface, @NonNull Size size, boolean z11) {
        this.f120243g = z11;
        boolean z12 = androidx.camera.extensions.internal.compat.quirk.a.b(CaptureOutputSurfaceOccupiedQuirk.class) != null || z11;
        this.f120242f = z12;
        if (Build.VERSION.SDK_INT < 29 || !z12) {
            this.f120241e = surface;
            this.f120239c = null;
            this.f120238b = null;
        } else {
            y0.a("CaptureOutputSurface", "Enabling intermediate surface");
            s1 s1VarA = o.a(size.getWidth(), size.getHeight(), 35, 2);
            this.f120239c = s1VarA;
            this.f120241e = s1VarA.getSurface();
            this.f120238b = b.b(surface, 2, 35);
            s1VarA.g(new s1.a() { // from class: w0.b
                @Override // androidx.camera.core.impl.s1.a
                public final void a(s1 s1Var) {
                    c.a(this.f120236a, s1Var);
                }
            }, i0.c.b());
        }
    }

    public static /* synthetic */ void a(c cVar, s1 s1Var) {
        Image image;
        synchronized (cVar.f120237a) {
            try {
                if (cVar.f120240d) {
                    return;
                }
                n nVarC = s1Var.c();
                if (nVarC != null && (image = nVarC.getImage()) != null) {
                    if (cVar.f120243g) {
                        long j11 = cVar.f120244h;
                        if (j11 != -1) {
                            a.a(image, j11);
                        }
                    }
                    b.c(cVar.f120238b, image);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b() {
        synchronized (this.f120237a) {
            try {
                this.f120240d = true;
                if (Build.VERSION.SDK_INT >= 29 && this.f120242f) {
                    this.f120239c.f();
                    this.f120239c.close();
                    b.a(this.f120238b);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    public Surface c() {
        return this.f120241e;
    }

    public void d(long j11) {
        if (this.f120243g) {
            this.f120244h = j11;
        }
    }
}
