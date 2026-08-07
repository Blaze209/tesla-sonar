package c0;

import androidx.annotation.NonNull;
import com.google.android.gms.location.DeviceOrientationRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<b1> f18296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<b1> f18297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<b1> f18298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f18299d;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List<b1> f18300a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final List<b1> f18301b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final List<b1> f18302c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f18303d;

        public a(@NonNull b1 b1Var) {
            this(b1Var, 7);
        }

        @NonNull
        public a a(@NonNull b1 b1Var, int i11) {
            boolean z11 = false;
            u5.h.b(b1Var != null, "Point cannot be null.");
            if (i11 >= 1 && i11 <= 7) {
                z11 = true;
            }
            u5.h.b(z11, "Invalid metering mode " + i11);
            if ((i11 & 1) != 0) {
                this.f18300a.add(b1Var);
            }
            if ((i11 & 2) != 0) {
                this.f18301b.add(b1Var);
            }
            if ((i11 & 4) != 0) {
                this.f18302c.add(b1Var);
            }
            return this;
        }

        @NonNull
        public e0 b() {
            return new e0(this);
        }

        @NonNull
        public a c() {
            this.f18303d = 0L;
            return this;
        }

        @NonNull
        public a d(int i11) {
            if ((i11 & 1) != 0) {
                this.f18300a.clear();
            }
            if ((i11 & 2) != 0) {
                this.f18301b.clear();
            }
            if ((i11 & 4) != 0) {
                this.f18302c.clear();
            }
            return this;
        }

        public a(@NonNull b1 b1Var, int i11) {
            this.f18300a = new ArrayList();
            this.f18301b = new ArrayList();
            this.f18302c = new ArrayList();
            this.f18303d = DeviceOrientationRequest.OUTPUT_PERIOD_FAST;
            a(b1Var, i11);
        }

        public a(@NonNull e0 e0Var) {
            ArrayList arrayList = new ArrayList();
            this.f18300a = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f18301b = arrayList2;
            ArrayList arrayList3 = new ArrayList();
            this.f18302c = arrayList3;
            this.f18303d = DeviceOrientationRequest.OUTPUT_PERIOD_FAST;
            arrayList.addAll(e0Var.c());
            arrayList2.addAll(e0Var.b());
            arrayList3.addAll(e0Var.d());
            this.f18303d = e0Var.a();
        }
    }

    e0(a aVar) {
        this.f18296a = Collections.unmodifiableList(aVar.f18300a);
        this.f18297b = Collections.unmodifiableList(aVar.f18301b);
        this.f18298c = Collections.unmodifiableList(aVar.f18302c);
        this.f18299d = aVar.f18303d;
    }

    public long a() {
        return this.f18299d;
    }

    @NonNull
    public List<b1> b() {
        return this.f18297b;
    }

    @NonNull
    public List<b1> c() {
        return this.f18296a;
    }

    @NonNull
    public List<b1> d() {
        return this.f18298c;
    }

    public boolean e() {
        return this.f18299d > 0;
    }
}
