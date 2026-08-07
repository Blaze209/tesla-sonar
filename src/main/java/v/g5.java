package v;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class g5 extends v4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<v4.c> f117010a;

    g5(@NonNull List<v4.c> list) {
        ArrayList arrayList = new ArrayList();
        this.f117010a = arrayList;
        arrayList.addAll(list);
    }

    @NonNull
    static v4.c w(@NonNull v4.c... cVarArr) {
        return new g5(Arrays.asList(cVarArr));
    }

    @Override // v.v4.c
    public void o(@NonNull v4 v4Var) {
        Iterator<v4.c> it = this.f117010a.iterator();
        while (it.hasNext()) {
            it.next().o(v4Var);
        }
    }

    @Override // v.v4.c
    public void p(@NonNull v4 v4Var) {
        Iterator<v4.c> it = this.f117010a.iterator();
        while (it.hasNext()) {
            it.next().p(v4Var);
        }
    }

    @Override // v.v4.c
    public void q(@NonNull v4 v4Var) {
        Iterator<v4.c> it = this.f117010a.iterator();
        while (it.hasNext()) {
            it.next().q(v4Var);
        }
    }

    @Override // v.v4.c
    public void r(@NonNull v4 v4Var) {
        Iterator<v4.c> it = this.f117010a.iterator();
        while (it.hasNext()) {
            it.next().r(v4Var);
        }
    }

    @Override // v.v4.c
    public void s(@NonNull v4 v4Var) {
        Iterator<v4.c> it = this.f117010a.iterator();
        while (it.hasNext()) {
            it.next().s(v4Var);
        }
    }

    @Override // v.v4.c
    public void t(@NonNull v4 v4Var) {
        Iterator<v4.c> it = this.f117010a.iterator();
        while (it.hasNext()) {
            it.next().t(v4Var);
        }
    }

    @Override // v.v4.c
    void u(@NonNull v4 v4Var) {
        Iterator<v4.c> it = this.f117010a.iterator();
        while (it.hasNext()) {
            it.next().u(v4Var);
        }
    }

    @Override // v.v4.c
    public void v(@NonNull v4 v4Var, @NonNull Surface surface) {
        Iterator<v4.c> it = this.f117010a.iterator();
        while (it.hasNext()) {
            it.next().v(v4Var, surface);
        }
    }

    static class a extends v4.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private final CameraCaptureSession.StateCallback f117011a;

        a(@NonNull CameraCaptureSession.StateCallback stateCallback) {
            this.f117011a = stateCallback;
        }

        @Override // v.v4.c
        public void o(@NonNull v4 v4Var) {
            this.f117011a.onActive(v4Var.h().c());
        }

        @Override // v.v4.c
        public void p(@NonNull v4 v4Var) {
            w.d.a(this.f117011a, v4Var.h().c());
        }

        @Override // v.v4.c
        public void q(@NonNull v4 v4Var) {
            this.f117011a.onClosed(v4Var.h().c());
        }

        @Override // v.v4.c
        public void r(@NonNull v4 v4Var) {
            this.f117011a.onConfigureFailed(v4Var.h().c());
        }

        @Override // v.v4.c
        public void s(@NonNull v4 v4Var) {
            this.f117011a.onConfigured(v4Var.h().c());
        }

        @Override // v.v4.c
        public void t(@NonNull v4 v4Var) {
            this.f117011a.onReady(v4Var.h().c());
        }

        @Override // v.v4.c
        public void v(@NonNull v4 v4Var, @NonNull Surface surface) {
            w.b.a(this.f117011a, v4Var.h().c(), surface);
        }

        a(@NonNull List<CameraCaptureSession.StateCallback> list) {
            this(p2.a(list));
        }

        @Override // v.v4.c
        void u(@NonNull v4 v4Var) {
        }
    }
}
