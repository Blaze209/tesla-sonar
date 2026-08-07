package androidx.camera.core.impl;

import android.view.Surface;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class g1 {

    class a implements j0.c<List<Surface>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f3182a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.concurrent.futures.c.a f3183b;

        a(boolean z11, androidx.concurrent.futures.c.a aVar) {
            this.f3182a = z11;
            this.f3183b = aVar;
        }

        @Override // j0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<Surface> list) {
            u5.h.g(list);
            ArrayList arrayList = new ArrayList(list);
            if (this.f3182a) {
                arrayList.removeAll(Collections.singleton(null));
            }
            this.f3183b.c(arrayList);
        }

        @Override // j0.c
        public void onFailure(@NonNull Throwable th2) {
            if (th2 instanceof TimeoutException) {
                this.f3183b.f(th2);
            } else {
                this.f3183b.c(Collections.EMPTY_LIST);
            }
        }
    }

    public static /* synthetic */ Object a(final com.google.common.util.concurrent.s sVar, Executor executor, boolean z11, Collection collection, androidx.concurrent.futures.c.a aVar) {
        aVar.a(new Runnable() { // from class: androidx.camera.core.impl.f1
            @Override // java.lang.Runnable
            public final void run() {
                sVar.cancel(true);
            }
        }, executor);
        j0.n.j(sVar, new a(z11, aVar), executor);
        return "surfaceList[" + collection + "]";
    }

    public static void c(@NonNull List<DeferrableSurface> list) {
        Iterator<DeferrableSurface> it = list.iterator();
        while (it.hasNext()) {
            it.next().e();
        }
    }

    public static void d(@NonNull List<DeferrableSurface> list) throws DeferrableSurface.SurfaceClosedException {
        if (list.isEmpty()) {
            return;
        }
        int i11 = 0;
        do {
            try {
                list.get(i11).l();
                i11++;
            } catch (DeferrableSurface.SurfaceClosedException e11) {
                for (int i12 = i11 - 1; i12 >= 0; i12--) {
                    list.get(i12).e();
                }
                throw e11;
            }
        } while (i11 < list.size());
    }

    @NonNull
    public static com.google.common.util.concurrent.s<List<Surface>> e(@NonNull final Collection<DeferrableSurface> collection, final boolean z11, long j11, @NonNull final Executor executor, @NonNull ScheduledExecutorService scheduledExecutorService) {
        ArrayList arrayList = new ArrayList();
        Iterator<DeferrableSurface> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(j0.n.s(it.next().j()));
        }
        final com.google.common.util.concurrent.s sVarQ = j0.n.q(j11, scheduledExecutorService, j0.n.w(arrayList));
        return androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: androidx.camera.core.impl.e1
            @Override // androidx.concurrent.futures.c.InterfaceC0146c
            public final Object a(androidx.concurrent.futures.c.a aVar) {
                return g1.a(sVarQ, executor, z11, collection, aVar);
            }
        });
    }
}
