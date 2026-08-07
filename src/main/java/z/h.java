package z;

import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import androidx.camera.core.impl.r2;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import v.v4;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CaptureSessionOnClosedNotCalledQuirk f126036a;

    @FunctionalInterface
    public interface a {
        void a(@NonNull v4 v4Var);
    }

    public h(@NonNull r2 r2Var) {
        this.f126036a = (CaptureSessionOnClosedNotCalledQuirk) r2Var.b(CaptureSessionOnClosedNotCalledQuirk.class);
    }

    private void a(@NonNull Set<v4> set) {
        for (v4 v4Var : set) {
            v4Var.d().q(v4Var);
        }
    }

    private void b(@NonNull Set<v4> set) {
        for (v4 v4Var : set) {
            v4Var.d().r(v4Var);
        }
    }

    public void c(@NonNull v4 v4Var, @NonNull List<v4> list, @NonNull List<v4> list2, @NonNull a aVar) {
        v4 next;
        v4 next2;
        if (d()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<v4> it = list.iterator();
            while (it.hasNext() && (next2 = it.next()) != v4Var) {
                linkedHashSet.add(next2);
            }
            b(linkedHashSet);
        }
        aVar.a(v4Var);
        if (d()) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Iterator<v4> it2 = list2.iterator();
            while (it2.hasNext() && (next = it2.next()) != v4Var) {
                linkedHashSet2.add(next);
            }
            a(linkedHashSet2);
        }
    }

    public boolean d() {
        return this.f126036a != null;
    }
}
