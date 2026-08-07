package y0;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.media.Image;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.f;
import androidx.camera.core.n;
import androidx.core.util.Consumer;
import c0.y0;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import h0.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class c implements f.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Size f124319g = new Size(480, 360);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final List<cy.a<?>> f124320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f124321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    final Consumer<a> f124322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final l1.a f124323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    private final Executor f124324e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Matrix f124325f;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private final Map<cy.a<?>, Object> f124326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        private final Map<cy.a<?>, Throwable> f124327b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f124328c;

        public a(@NonNull Map<cy.a<?>, Object> map, long j11, @NonNull Map<cy.a<?>, Throwable> map2) {
            this.f124326a = map;
            this.f124327b = map2;
            this.f124328c = j11;
        }

        private void a(@NonNull cy.a<?> aVar) {
            Preconditions.checkArgument(this.f124326a.containsKey(aVar) || this.f124327b.containsKey(aVar), "The detector does not exist");
        }

        public Throwable b(@NonNull cy.a<?> aVar) {
            a(aVar);
            return this.f124327b.get(aVar);
        }

        public <T> T c(@NonNull cy.a<T> aVar) {
            a(aVar);
            return (T) this.f124326a.get(aVar);
        }
    }

    public c(@NonNull List<cy.a<?>> list, int i11, @NonNull Executor executor, @NonNull Consumer<a> consumer) {
        if (i11 != 0) {
            Iterator<cy.a<?>> it = list.iterator();
            while (it.hasNext()) {
                Preconditions.checkArgument(it.next().getDetectorType() != 7, "Segmentation only works with COORDINATE_SYSTEM_ORIGINAL");
            }
        }
        this.f124320a = new ArrayList(list);
        this.f124321b = i11;
        this.f124322c = consumer;
        this.f124324e = executor;
        l1.a aVar = new l1.a();
        this.f124323d = aVar;
        aVar.a(true);
    }

    public static /* synthetic */ void a(c cVar, Map map, cy.a aVar, Map map2, n nVar, int i11, Matrix matrix, Task task) {
        cVar.getClass();
        if (task.isCanceled()) {
            map.put(aVar, new CancellationException("The task is canceled."));
        } else if (task.isSuccessful()) {
            map2.put(aVar, task.getResult());
        } else {
            map.put(aVar, task.getException());
        }
        cVar.c(nVar, i11 + 1, matrix, map2, map);
    }

    private void c(@NonNull final n nVar, final int i11, @NonNull final Matrix matrix, final Map<cy.a<?>, Object> map, @NonNull final Map<cy.a<?>, Throwable> map2) {
        Image image = nVar.getImage();
        if (image == null) {
            y0.c("MlKitAnalyzer", "Image is null.");
            nVar.close();
            return;
        }
        if (i11 > this.f124320a.size() - 1) {
            nVar.close();
            this.f124324e.execute(new Runnable() { // from class: y0.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f124308a.f124322c.accept(new c.a(map, nVar.z().a(), map2));
                }
            });
            return;
        }
        final cy.a<?> aVar = this.f124320a.get(i11);
        try {
            aVar.process(image, nVar.z().d(), matrix).addOnCompleteListener(this.f124324e, new OnCompleteListener() { // from class: y0.b
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    c.a(this.f124312a, map2, aVar, map, nVar, i11, matrix, task);
                }
            });
        } catch (Exception e11) {
            map2.put(aVar, new RuntimeException("Failed to process the image.", e11));
            c(nVar, i11 + 1, matrix, map, map2);
        }
    }

    @NonNull
    private Size e(int i11) {
        return (i11 == 1 || i11 == 4) ? new Size(1280, 720) : f124319g;
    }

    @Override // androidx.camera.core.f.a
    public final void analyze(@NonNull n nVar) {
        Matrix matrix = new Matrix();
        int i11 = this.f124321b;
        if (i11 != 0) {
            Matrix matrix2 = this.f124325f;
            if (i11 != 2 && matrix2 == null) {
                y0.a("MlKitAnalyzer", "Sensor-to-target transformation is null.");
                nVar.close();
                return;
            }
            Matrix matrix3 = new Matrix(nVar.z().e());
            RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, nVar.getWidth(), nVar.getHeight());
            matrix3.postConcat(s.d(rectF, s.p(rectF, nVar.z().d()), nVar.z().d()));
            matrix3.invert(matrix);
            if (this.f124321b != 2) {
                matrix.postConcat(matrix2);
            }
        }
        c(nVar, 0, matrix, new HashMap(), new HashMap());
    }

    public final int d() {
        return this.f124321b;
    }

    public final void f(Matrix matrix) {
        if (matrix == null) {
            this.f124325f = null;
        } else {
            this.f124325f = new Matrix(matrix);
        }
    }

    @Override // androidx.camera.core.f.a
    @NonNull
    public final Size getDefaultTargetResolution() {
        Size size = f124319g;
        Iterator<cy.a<?>> it = this.f124320a.iterator();
        while (it.hasNext()) {
            Size sizeE = e(it.next().getDetectorType());
            if (sizeE.getHeight() * sizeE.getWidth() > size.getWidth() * size.getHeight()) {
                size = sizeE;
            }
        }
        return size;
    }
}
