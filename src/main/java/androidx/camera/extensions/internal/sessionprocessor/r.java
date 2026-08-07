package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureRequest;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.t2;
import androidx.camera.core.impl.x0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Integer> f3560a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<CaptureRequest.Key<?>, Object> f3561b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f3562c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f3563d;

    static class a implements t2.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List<Integer> f3564a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final x0 f3565b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f3566c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f3567d;

        a(List<Integer> list, Map<CaptureRequest.Key<?>, Object> map, int i11, int i12) {
            this.f3564a = list;
            this.f3566c = i11;
            this.f3567d = i12;
            u0.n.b bVar = new u0.n.b();
            for (CaptureRequest.Key<?> key : map.keySet()) {
                bVar.d(key, map.get(key));
            }
            this.f3565b = bVar.b();
        }

        public int a() {
            return this.f3567d;
        }

        @Override // androidx.camera.core.impl.t2.b
        @NonNull
        public x0 getParameters() {
            return this.f3565b;
        }

        @Override // androidx.camera.core.impl.t2.b
        @NonNull
        public List<Integer> getTargetOutputConfigIds() {
            return this.f3564a;
        }

        @Override // androidx.camera.core.impl.t2.b
        public int getTemplateId() {
            return this.f3566c;
        }
    }

    r() {
    }

    @NonNull
    r a(int i11) {
        this.f3560a.add(Integer.valueOf(i11));
        return this;
    }

    @NonNull
    t2.b b() {
        return new a(this.f3560a, this.f3561b, this.f3562c, this.f3563d);
    }

    @NonNull
    public r c(int i11) {
        this.f3563d = i11;
        return this;
    }

    @NonNull
    r d(@NonNull CaptureRequest.Key<?> key, @NonNull Object obj) {
        this.f3561b.put(key, obj);
        return this;
    }

    @NonNull
    r e(int i11) {
        this.f3562c = i11;
        return this;
    }
}
