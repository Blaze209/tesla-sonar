package com.google.firebase.perf.application;

import android.app.Activity;
import android.os.Build;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import androidx.fragment.app.Fragment;
import com.google.firebase.perf.util.g;
import java.util.HashMap;
import java.util.Map;
import lw.f;

/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final kw.a f44411e = kw.a.e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f44412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FrameMetricsAggregator f44413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<Fragment, f.a> f44414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f44415d;

    public d(Activity activity) {
        this(activity, new FrameMetricsAggregator(), new HashMap());
    }

    static boolean a() {
        return true;
    }

    private g<f.a> b() {
        if (!this.f44415d) {
            f44411e.a("No recording has been started.");
            return g.a();
        }
        SparseIntArray[] sparseIntArrayArrB = this.f44413b.b();
        if (sparseIntArrayArrB == null) {
            f44411e.a("FrameMetricsAggregator.mMetrics is uninitialized.");
            return g.a();
        }
        if (sparseIntArrayArrB[0] != null) {
            return g.e(f.a(sparseIntArrayArrB));
        }
        f44411e.a("FrameMetricsAggregator.mMetrics[TOTAL_INDEX] is uninitialized.");
        return g.a();
    }

    public void c() {
        if (this.f44415d) {
            f44411e.b("FrameMetricsAggregator is already recording %s", this.f44412a.getClass().getSimpleName());
        } else {
            this.f44413b.a(this.f44412a);
            this.f44415d = true;
        }
    }

    public void d(Fragment fragment) {
        if (!this.f44415d) {
            f44411e.a("Cannot start sub-recording because FrameMetricsAggregator is not recording");
            return;
        }
        if (this.f44414c.containsKey(fragment)) {
            f44411e.b("Cannot start sub-recording because one is already ongoing with the key %s", fragment.getClass().getSimpleName());
            return;
        }
        g<f.a> gVarB = b();
        if (gVarB.d()) {
            this.f44414c.put(fragment, gVarB.c());
        } else {
            f44411e.b("startFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
        }
    }

    public g<f.a> e() {
        if (!this.f44415d) {
            f44411e.a("Cannot stop because no recording was started");
            return g.a();
        }
        if (!this.f44414c.isEmpty()) {
            f44411e.a("Sub-recordings are still ongoing! Sub-recordings should be stopped first before stopping Activity screen trace.");
            this.f44414c.clear();
        }
        g<f.a> gVarB = b();
        try {
            this.f44413b.c(this.f44412a);
        } catch (IllegalArgumentException | NullPointerException e11) {
            if ((e11 instanceof NullPointerException) && Build.VERSION.SDK_INT > 28) {
                throw e11;
            }
            f44411e.k("View not hardware accelerated. Unable to collect FrameMetrics. %s", e11.toString());
            gVarB = g.a();
        }
        this.f44413b.d();
        this.f44415d = false;
        return gVarB;
    }

    public g<f.a> f(Fragment fragment) {
        if (!this.f44415d) {
            f44411e.a("Cannot stop sub-recording because FrameMetricsAggregator is not recording");
            return g.a();
        }
        if (!this.f44414c.containsKey(fragment)) {
            f44411e.b("Sub-recording associated with key %s was not started or does not exist", fragment.getClass().getSimpleName());
            return g.a();
        }
        f.a aVarRemove = this.f44414c.remove(fragment);
        g<f.a> gVarB = b();
        if (gVarB.d()) {
            return g.e(gVarB.c().a(aVarRemove));
        }
        f44411e.b("stopFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
        return g.a();
    }

    d(Activity activity, FrameMetricsAggregator frameMetricsAggregator, Map<Fragment, f.a> map) {
        this.f44415d = false;
        this.f44412a = activity;
        this.f44413b = frameMetricsAggregator;
        this.f44414c = map;
    }
}
