package v;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes.dex */
public final class x implements androidx.camera.core.impl.g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final Context f117367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d0.a f117368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.camera.core.impl.t0 f117369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.camera.core.impl.s0 f117370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w.m0 f117371e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<String> f117372f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final i3 f117373g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f117374h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<String, x0> f117375i = new HashMap();

    public x(@NonNull Context context, @NonNull androidx.camera.core.impl.t0 t0Var, c0.p pVar, long j11) {
        this.f117367a = context;
        this.f117369c = t0Var;
        w.m0 m0VarB = w.m0.b(context, t0Var.c());
        this.f117371e = m0VarB;
        this.f117373g = i3.c(context);
        this.f117372f = e(s2.b(this, pVar));
        a0.a aVar = new a0.a(m0VarB);
        this.f117368b = aVar;
        androidx.camera.core.impl.s0 s0Var = new androidx.camera.core.impl.s0(aVar, 1);
        this.f117370d = s0Var;
        aVar.c(s0Var);
        this.f117374h = j11;
    }

    private List<String> e(@NonNull List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str.equals(WebrtcBuildVersion.maint_version) || str.equals("1")) {
                arrayList.add(str);
            } else if (r2.a(this.f117371e, str)) {
                arrayList.add(str);
            } else {
                c0.y0.a("Camera2CameraFactory", "Camera " + str + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
            }
        }
        return arrayList;
    }

    @Override // androidx.camera.core.impl.g0
    @NonNull
    public androidx.camera.core.impl.j0 a(@NonNull String str) {
        if (this.f117372f.contains(str)) {
            return new q0(this.f117367a, this.f117371e, str, f(str), this.f117368b, this.f117370d, this.f117369c.b(), this.f117369c.c(), this.f117373g, this.f117374h);
        }
        throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
    }

    @Override // androidx.camera.core.impl.g0
    @NonNull
    public Set<String> b() {
        return new LinkedHashSet(this.f117372f);
    }

    @Override // androidx.camera.core.impl.g0
    @NonNull
    public d0.a c() {
        return this.f117368b;
    }

    x0 f(@NonNull String str) throws CameraUnavailableException {
        try {
            x0 x0Var = this.f117375i.get(str);
            if (x0Var != null) {
                return x0Var;
            }
            x0 x0Var2 = new x0(str, this.f117371e);
            this.f117375i.put(str, x0Var2);
            return x0Var2;
        } catch (CameraAccessExceptionCompat e11) {
            throw u2.a(e11);
        }
    }

    @Override // androidx.camera.core.impl.g0
    @NonNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public w.m0 d() {
        return this.f117371e;
    }
}
