package androidx.core.app;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class FrameMetricsAggregator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f7429a;

    private static class a extends b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static HandlerThread f7430e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static Handler f7431f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f7432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        SparseIntArray[] f7433b = new SparseIntArray[9];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ArrayList<WeakReference<Activity>> f7434c = new ArrayList<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Window.OnFrameMetricsAvailableListener f7435d = new WindowOnFrameMetricsAvailableListenerC0150a();

        /* JADX INFO: renamed from: androidx.core.app.FrameMetricsAggregator$a$a, reason: collision with other inner class name */
        class WindowOnFrameMetricsAvailableListenerC0150a implements Window.OnFrameMetricsAvailableListener {
            WindowOnFrameMetricsAvailableListenerC0150a() {
            }

            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i11) {
                a aVar = a.this;
                if ((aVar.f7432a & 1) != 0) {
                    aVar.f(aVar.f7433b[0], frameMetrics.getMetric(8));
                }
                a aVar2 = a.this;
                if ((aVar2.f7432a & 2) != 0) {
                    aVar2.f(aVar2.f7433b[1], frameMetrics.getMetric(1));
                }
                a aVar3 = a.this;
                if ((aVar3.f7432a & 4) != 0) {
                    aVar3.f(aVar3.f7433b[2], frameMetrics.getMetric(3));
                }
                a aVar4 = a.this;
                if ((aVar4.f7432a & 8) != 0) {
                    aVar4.f(aVar4.f7433b[3], frameMetrics.getMetric(4));
                }
                a aVar5 = a.this;
                if ((aVar5.f7432a & 16) != 0) {
                    aVar5.f(aVar5.f7433b[4], frameMetrics.getMetric(5));
                }
                a aVar6 = a.this;
                if ((aVar6.f7432a & 64) != 0) {
                    aVar6.f(aVar6.f7433b[6], frameMetrics.getMetric(7));
                }
                a aVar7 = a.this;
                if ((aVar7.f7432a & 32) != 0) {
                    aVar7.f(aVar7.f7433b[5], frameMetrics.getMetric(6));
                }
                a aVar8 = a.this;
                if ((aVar8.f7432a & 128) != 0) {
                    aVar8.f(aVar8.f7433b[7], frameMetrics.getMetric(0));
                }
                a aVar9 = a.this;
                if ((aVar9.f7432a & 256) != 0) {
                    aVar9.f(aVar9.f7433b[8], frameMetrics.getMetric(2));
                }
            }
        }

        a(int i11) {
            this.f7432a = i11;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public void a(Activity activity) {
            if (f7430e == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                f7430e = handlerThread;
                handlerThread.start();
                f7431f = new Handler(f7430e.getLooper());
            }
            for (int i11 = 0; i11 <= 8; i11++) {
                SparseIntArray[] sparseIntArrayArr = this.f7433b;
                if (sparseIntArrayArr[i11] == null && (this.f7432a & (1 << i11)) != 0) {
                    sparseIntArrayArr[i11] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f7435d, f7431f);
            this.f7434c.add(new WeakReference<>(activity));
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public SparseIntArray[] b() {
            return this.f7433b;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public SparseIntArray[] c(Activity activity) {
            for (WeakReference<Activity> weakReference : this.f7434c) {
                if (weakReference.get() == activity) {
                    this.f7434c.remove(weakReference);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.f7435d);
            return this.f7433b;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public SparseIntArray[] d() {
            SparseIntArray[] sparseIntArrayArr = this.f7433b;
            this.f7433b = new SparseIntArray[9];
            return sparseIntArrayArr;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public SparseIntArray[] e() {
            for (int size = this.f7434c.size() - 1; size >= 0; size--) {
                WeakReference<Activity> weakReference = this.f7434c.get(size);
                Activity activity = weakReference.get();
                if (weakReference.get() != null) {
                    activity.getWindow().removeOnFrameMetricsAvailableListener(this.f7435d);
                    this.f7434c.remove(size);
                }
            }
            return this.f7433b;
        }

        void f(SparseIntArray sparseIntArray, long j11) {
            if (sparseIntArray != null) {
                int i11 = (int) ((500000 + j11) / 1000000);
                if (j11 >= 0) {
                    sparseIntArray.put(i11, sparseIntArray.get(i11) + 1);
                }
            }
        }
    }

    private static class b {
        b() {
        }

        public void a(Activity activity) {
            throw null;
        }

        public SparseIntArray[] b() {
            throw null;
        }

        public SparseIntArray[] c(Activity activity) {
            throw null;
        }

        public SparseIntArray[] d() {
            throw null;
        }

        public SparseIntArray[] e() {
            throw null;
        }
    }

    public FrameMetricsAggregator() {
        this(1);
    }

    public void a(Activity activity) {
        this.f7429a.a(activity);
    }

    public SparseIntArray[] b() {
        return this.f7429a.b();
    }

    public SparseIntArray[] c(Activity activity) {
        return this.f7429a.c(activity);
    }

    public SparseIntArray[] d() {
        return this.f7429a.d();
    }

    public SparseIntArray[] e() {
        return this.f7429a.e();
    }

    public FrameMetricsAggregator(int i11) {
        this.f7429a = new a(i11);
    }
}
