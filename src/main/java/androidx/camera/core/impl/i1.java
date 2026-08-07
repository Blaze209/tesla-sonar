package androidx.camera.core.impl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i1 f3192a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<Integer> f3193b = Collections.unmodifiableList(Arrays.asList(13, 10, 8, 11, 6, 5, 4, 9, 3, 7, 2));

    class a implements i1 {
        a() {
        }

        @Override // androidx.camera.core.impl.i1
        public j1 a(int i11) {
            return null;
        }

        @Override // androidx.camera.core.impl.i1
        public boolean b(int i11) {
            return false;
        }
    }

    j1 a(int i11);

    boolean b(int i11);
}
