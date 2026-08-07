package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureRequest;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f3542a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f3543b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<CaptureRequest.Key<?>, Object> f3544c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<g> f3545d = new ArrayList();

    private static class a implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f3546a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f3547b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map<CaptureRequest.Key<?>, Object> f3548c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List<g> f3549d;

        a(int i11, int i12, Map<CaptureRequest.Key<?>, Object> map, List<g> list) {
            this.f3546a = i11;
            this.f3547b = i12;
            this.f3548c = map;
            this.f3549d = list;
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.i
        public int b() {
            return this.f3547b;
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.i
        @NonNull
        public Map<CaptureRequest.Key<?>, Object> c() {
            return this.f3548c;
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.i
        public int d() {
            return this.f3546a;
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.i
        @NonNull
        public List<g> e() {
            return this.f3549d;
        }
    }

    j() {
    }

    @NonNull
    j a(@NonNull g gVar) {
        this.f3545d.add(gVar);
        return this;
    }

    @NonNull
    j b(@NonNull CaptureRequest.Key key, Object obj) {
        this.f3544c.put(key, obj);
        return this;
    }

    @NonNull
    i c() {
        return new a(this.f3542a, this.f3543b, this.f3544c, this.f3545d);
    }

    @NonNull
    j d(int i11) {
        this.f3542a = i11;
        return this;
    }

    @NonNull
    j e(int i11) {
        this.f3543b = i11;
        return this;
    }
}
