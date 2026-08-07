package x;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f122467a;

    private static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<j> f122470a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final CameraCaptureSession.StateCallback f122471b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Executor f122472c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f122473d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private i f122474e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private CaptureRequest f122475f = null;

        b(int i11, @NonNull List<j> list, @NonNull Executor executor, @NonNull CameraCaptureSession.StateCallback stateCallback) {
            this.f122473d = i11;
            this.f122470a = Collections.unmodifiableList(new ArrayList(list));
            this.f122471b = stateCallback;
            this.f122472c = executor;
        }

        @Override // x.p.c
        public i a() {
            return this.f122474e;
        }

        @Override // x.p.c
        public int b() {
            return this.f122473d;
        }

        @Override // x.p.c
        @NonNull
        public Executor c() {
            return this.f122472c;
        }

        @Override // x.p.c
        @NonNull
        public CameraCaptureSession.StateCallback d() {
            return this.f122471b;
        }

        @Override // x.p.c
        @NonNull
        public List<j> e() {
            return this.f122470a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (Objects.equals(this.f122474e, bVar.f122474e) && this.f122473d == bVar.f122473d && this.f122470a.size() == bVar.f122470a.size()) {
                    for (int i11 = 0; i11 < this.f122470a.size(); i11++) {
                        if (!this.f122470a.get(i11).equals(bVar.f122470a.get(i11))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // x.p.c
        public void f(@NonNull i iVar) {
            if (this.f122473d == 1) {
                throw new UnsupportedOperationException("Method not supported for high speed session types");
            }
            this.f122474e = iVar;
        }

        @Override // x.p.c
        public Object g() {
            return null;
        }

        @Override // x.p.c
        public void h(@NonNull CaptureRequest captureRequest) {
            this.f122475f = captureRequest;
        }

        public int hashCode() {
            int iHashCode = this.f122470a.hashCode() ^ 31;
            int i11 = (iHashCode << 5) - iHashCode;
            i iVar = this.f122474e;
            int iHashCode2 = (iVar == null ? 0 : iVar.hashCode()) ^ i11;
            return this.f122473d ^ ((iHashCode2 << 5) - iHashCode2);
        }
    }

    private interface c {
        i a();

        int b();

        @NonNull
        Executor c();

        @NonNull
        CameraCaptureSession.StateCallback d();

        @NonNull
        List<j> e();

        void f(@NonNull i iVar);

        Object g();

        void h(@NonNull CaptureRequest captureRequest);
    }

    public p(int i11, @NonNull List<j> list, @NonNull Executor executor, @NonNull CameraCaptureSession.StateCallback stateCallback) {
        if (Build.VERSION.SDK_INT < 28) {
            this.f122467a = new b(i11, list, executor, stateCallback);
        } else {
            this.f122467a = new a(i11, list, executor, stateCallback);
        }
    }

    @NonNull
    public static List<OutputConfiguration> h(@NonNull List<j> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<j> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((OutputConfiguration) it.next().i());
        }
        return arrayList;
    }

    static List<j> i(@NonNull List<OutputConfiguration> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<OutputConfiguration> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(j.j(it.next()));
        }
        return arrayList;
    }

    @NonNull
    public Executor a() {
        return this.f122467a.c();
    }

    public i b() {
        return this.f122467a.a();
    }

    @NonNull
    public List<j> c() {
        return this.f122467a.e();
    }

    public int d() {
        return this.f122467a.b();
    }

    @NonNull
    public CameraCaptureSession.StateCallback e() {
        return this.f122467a.d();
    }

    public boolean equals(Object obj) {
        if (obj instanceof p) {
            return this.f122467a.equals(((p) obj).f122467a);
        }
        return false;
    }

    public void f(@NonNull i iVar) {
        this.f122467a.f(iVar);
    }

    public void g(@NonNull CaptureRequest captureRequest) {
        this.f122467a.h(captureRequest);
    }

    public int hashCode() {
        return this.f122467a.hashCode();
    }

    public Object j() {
        return this.f122467a.g();
    }

    private static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SessionConfiguration f122468a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<j> f122469b;

        a(@NonNull Object obj) {
            SessionConfiguration sessionConfiguration = (SessionConfiguration) obj;
            this.f122468a = sessionConfiguration;
            this.f122469b = Collections.unmodifiableList(p.i(sessionConfiguration.getOutputConfigurations()));
        }

        @Override // x.p.c
        public i a() {
            return i.b(this.f122468a.getInputConfiguration());
        }

        @Override // x.p.c
        public int b() {
            return this.f122468a.getSessionType();
        }

        @Override // x.p.c
        @NonNull
        public Executor c() {
            return this.f122468a.getExecutor();
        }

        @Override // x.p.c
        @NonNull
        public CameraCaptureSession.StateCallback d() {
            return this.f122468a.getStateCallback();
        }

        @Override // x.p.c
        @NonNull
        public List<j> e() {
            return this.f122469b;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return Objects.equals(this.f122468a, ((a) obj).f122468a);
            }
            return false;
        }

        @Override // x.p.c
        public void f(@NonNull i iVar) {
            this.f122468a.setInputConfiguration((InputConfiguration) iVar.a());
        }

        @Override // x.p.c
        public Object g() {
            return this.f122468a;
        }

        @Override // x.p.c
        public void h(@NonNull CaptureRequest captureRequest) {
            this.f122468a.setSessionParameters(captureRequest);
        }

        public int hashCode() {
            return this.f122468a.hashCode();
        }

        a(int i11, @NonNull List<j> list, @NonNull Executor executor, @NonNull CameraCaptureSession.StateCallback stateCallback) {
            this(new SessionConfiguration(i11, p.h(list), executor, stateCallback));
        }
    }
}
