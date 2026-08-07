package z0;

import android.util.Size;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public static final j1 f126162a = new a();

    class a implements j1 {
        a() {
        }

        @Override // z0.j1
        public boolean a() {
            return false;
        }

        @Override // z0.j1
        @NonNull
        public Set<c0.b0> b() {
            return new HashSet();
        }

        @Override // z0.j1
        @NonNull
        public List<x> f(@NonNull c0.b0 b0Var) {
            return new ArrayList();
        }
    }

    default boolean a() {
        return false;
    }

    @NonNull
    Set<c0.b0> b();

    @NonNull
    default x c(@NonNull Size size, @NonNull c0.b0 b0Var) {
        return x.f126363g;
    }

    default b1.i d(@NonNull Size size, @NonNull c0.b0 b0Var) {
        return null;
    }

    default b1.i e(@NonNull x xVar, @NonNull c0.b0 b0Var) {
        return null;
    }

    @NonNull
    List<x> f(@NonNull c0.b0 b0Var);
}
