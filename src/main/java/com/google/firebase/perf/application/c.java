package com.google.firebase.perf.application;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.util.g;
import com.google.firebase.perf.util.j;
import java.util.WeakHashMap;
import lw.f;
import pw.k;

/* JADX INFO: loaded from: classes5.dex */
public class c extends FragmentManager.k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final kw.a f44405f = kw.a.e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakHashMap<Fragment, Trace> f44406a = new WeakHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.firebase.perf.util.a f44407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k f44408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f44409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d f44410e;

    public c(com.google.firebase.perf.util.a aVar, k kVar, a aVar2, d dVar) {
        this.f44407b = aVar;
        this.f44408c = kVar;
        this.f44409d = aVar2;
        this.f44410e = dVar;
    }

    public String a(Fragment fragment) {
        return "_st_" + fragment.getClass().getSimpleName();
    }

    @Override // androidx.fragment.app.FragmentManager.k
    public void onFragmentPaused(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        super.onFragmentPaused(fragmentManager, fragment);
        kw.a aVar = f44405f;
        aVar.b("FragmentMonitor %s.onFragmentPaused ", fragment.getClass().getSimpleName());
        if (!this.f44406a.containsKey(fragment)) {
            aVar.k("FragmentMonitor: missed a fragment trace from %s", fragment.getClass().getSimpleName());
            return;
        }
        Trace trace = this.f44406a.get(fragment);
        this.f44406a.remove(fragment);
        g<f.a> gVarF = this.f44410e.f(fragment);
        if (!gVarF.d()) {
            aVar.k("onFragmentPaused: recorder failed to trace %s", fragment.getClass().getSimpleName());
        } else {
            j.a(trace, gVarF.c());
            trace.stop();
        }
    }

    @Override // androidx.fragment.app.FragmentManager.k
    public void onFragmentResumed(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        super.onFragmentResumed(fragmentManager, fragment);
        f44405f.b("FragmentMonitor %s.onFragmentResumed", fragment.getClass().getSimpleName());
        Trace trace = new Trace(a(fragment), this.f44408c, this.f44407b, this.f44409d);
        trace.start();
        trace.putAttribute("Parent_fragment", fragment.getParentFragment() == null ? "No parent" : fragment.getParentFragment().getClass().getSimpleName());
        if (fragment.getActivity() != null) {
            trace.putAttribute("Hosting_activity", fragment.getActivity().getClass().getSimpleName());
        }
        this.f44406a.put(fragment, trace);
        this.f44410e.d(fragment);
    }
}
