package com.google.firebase.perf.metrics;

import androidx.annotation.NonNull;
import com.google.firebase.perf.v1.PerfSession;
import com.google.firebase.perf.v1.TraceMetric;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Trace f44495a;

    b(@NonNull Trace trace) {
        this.f44495a = trace;
    }

    TraceMetric a() {
        TraceMetric.b bVarK = TraceMetric.newBuilder().l(this.f44495a.getName()).j(this.f44495a.g().e()).k(this.f44495a.g().d(this.f44495a.e()));
        for (a aVar : this.f44495a.d().values()) {
            bVarK.h(aVar.getName(), aVar.a());
        }
        List<Trace> listH = this.f44495a.h();
        if (!listH.isEmpty()) {
            Iterator<Trace> it = listH.iterator();
            while (it.hasNext()) {
                bVarK.e(new b(it.next()).a());
            }
        }
        bVarK.g(this.f44495a.getAttributes());
        PerfSession[] perfSessionArrB = ow.a.b(this.f44495a.f());
        if (perfSessionArrB != null) {
            bVarK.b(Arrays.asList(perfSessionArrB));
        }
        return bVarK.build();
    }
}
