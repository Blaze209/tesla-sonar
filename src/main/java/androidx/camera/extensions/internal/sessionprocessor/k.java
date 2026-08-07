package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.LongSparseArray;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f3550a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LongSparseArray<List<TotalCaptureResult>> f3551b = new LongSparseArray<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Map<TotalCaptureResult, Integer> f3552c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LongSparseArray<List<n>> f3553d = new LongSparseArray<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    a f3554e;

    interface a {
        void a(@NonNull n nVar, @NonNull TotalCaptureResult totalCaptureResult, int i11);
    }

    k() {
    }

    private <T> void a(LongSparseArray<List<T>> longSparseArray, long j11, T t11) {
        List<T> arrayList = longSparseArray.get(j11);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            longSparseArray.put(j11, arrayList);
        }
        arrayList.add(t11);
    }

    private long f(TotalCaptureResult totalCaptureResult) {
        Long l11 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l11 != null) {
            return l11.longValue();
        }
        return -1L;
    }

    private void h() {
        TotalCaptureResult totalCaptureResult;
        n nVar;
        synchronized (this.f3550a) {
            try {
                int size = this.f3551b.size() - 1;
                while (true) {
                    if (size < 0) {
                        totalCaptureResult = null;
                        nVar = null;
                        break;
                    }
                    List<TotalCaptureResult> listValueAt = this.f3551b.valueAt(size);
                    if (!listValueAt.isEmpty()) {
                        totalCaptureResult = listValueAt.get(0);
                        long jF = f(totalCaptureResult);
                        u5.h.i(jF == this.f3551b.keyAt(size));
                        List<n> list = this.f3553d.get(jF);
                        if (list != null && !list.isEmpty()) {
                            nVar = list.get(0);
                            j(this.f3553d, jF, nVar);
                            listValueAt.remove(totalCaptureResult);
                            if (!listValueAt.isEmpty()) {
                                break;
                            }
                            this.f3551b.removeAt(size);
                            break;
                        }
                    }
                    size--;
                }
                k();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (nVar == null || totalCaptureResult == null) {
            return;
        }
        i(nVar, totalCaptureResult);
    }

    private void i(n nVar, TotalCaptureResult totalCaptureResult) {
        a aVar;
        Integer num;
        synchronized (this.f3550a) {
            try {
                aVar = this.f3554e;
                if (aVar != null) {
                    num = this.f3552c.get(totalCaptureResult);
                } else {
                    nVar.b();
                    aVar = null;
                    num = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (aVar != null) {
            aVar.a(nVar, totalCaptureResult, num.intValue());
        }
    }

    private <T> void j(LongSparseArray<List<T>> longSparseArray, long j11, T t11) {
        List<T> list = longSparseArray.get(j11);
        if (list != null) {
            list.remove(t11);
            if (list.isEmpty()) {
                longSparseArray.remove(j11);
            }
        }
    }

    private void k() {
        synchronized (this.f3550a) {
            try {
                if (this.f3553d.size() != 0 && this.f3551b.size() != 0) {
                    long jKeyAt = this.f3553d.keyAt(0);
                    Long lValueOf = Long.valueOf(jKeyAt);
                    long jKeyAt2 = this.f3551b.keyAt(0);
                    u5.h.a(!Long.valueOf(jKeyAt2).equals(lValueOf));
                    if (jKeyAt2 > jKeyAt) {
                        for (int size = this.f3553d.size() - 1; size >= 0; size--) {
                            if (this.f3553d.keyAt(size) < jKeyAt2) {
                                Iterator<n> it = this.f3553d.valueAt(size).iterator();
                                while (it.hasNext()) {
                                    it.next().b();
                                }
                                this.f3553d.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.f3551b.size() - 1; size2 >= 0; size2--) {
                            if (this.f3551b.keyAt(size2) < jKeyAt) {
                                this.f3551b.removeAt(size2);
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void b(@NonNull TotalCaptureResult totalCaptureResult) {
        c(totalCaptureResult, 0);
    }

    void c(@NonNull TotalCaptureResult totalCaptureResult, int i11) {
        synchronized (this.f3550a) {
            try {
                long jF = f(totalCaptureResult);
                if (jF == -1) {
                    return;
                }
                a(this.f3551b, jF, totalCaptureResult);
                this.f3552c.put(totalCaptureResult, Integer.valueOf(i11));
                h();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void d() {
        synchronized (this.f3550a) {
            try {
                this.f3551b.clear();
                for (int i11 = 0; i11 < this.f3553d.size(); i11++) {
                    Iterator<n> it = this.f3553d.get(this.f3553d.keyAt(i11)).iterator();
                    while (it.hasNext()) {
                        it.next().b();
                    }
                }
                this.f3553d.clear();
                this.f3552c.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void e() {
        synchronized (this.f3550a) {
            this.f3554e = null;
        }
    }

    void g(@NonNull n nVar) {
        synchronized (this.f3550a) {
            a(this.f3553d, nVar.get().getTimestamp(), nVar);
        }
        h();
    }

    void l(@NonNull a aVar) {
        synchronized (this.f3550a) {
            this.f3554e = aVar;
        }
    }
}
