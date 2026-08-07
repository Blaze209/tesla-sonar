package f1;

import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.h3;
import androidx.camera.core.impl.j1;
import c0.b0;
import c0.y0;
import c0.z1;
import g1.m1;
import java.util.Objects;
import z0.e2;

/* JADX INFO: loaded from: classes.dex */
public class m implements u5.j<m1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f63788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h3 f63789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e2 f63790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Size f63791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final j1.c f63792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final b0 f63793f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Range<Integer> f63794g;

    public m(@NonNull String str, @NonNull h3 h3Var, @NonNull e2 e2Var, @NonNull Size size, @NonNull j1.c cVar, @NonNull b0 b0Var, @NonNull Range<Integer> range) {
        this.f63788a = str;
        this.f63789b = h3Var;
        this.f63790c = e2Var;
        this.f63791d = size;
        this.f63792e = cVar;
        this.f63793f = b0Var;
        this.f63794g = range;
    }

    private int b() {
        int iF = this.f63792e.f();
        Range<Integer> range = this.f63794g;
        Range<Integer> range2 = z1.f18481p;
        int iIntValue = !Objects.equals(range, range2) ? ((Integer) this.f63794g.clamp(Integer.valueOf(iF))).intValue() : iF;
        y0.a("VidEncVdPrflRslvr", String.format("Resolved frame rate %dfps [Video profile frame rate: %dfps, Expected operating range: %s]", Integer.valueOf(iIntValue), Integer.valueOf(iF), Objects.equals(this.f63794g, range2) ? this.f63794g : "<UNSPECIFIED>"));
        return iIntValue;
    }

    @Override // u5.j
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public m1 get() {
        int iB = b();
        y0.a("VidEncVdPrflRslvr", "Resolved VIDEO frame rate: " + iB + "fps");
        Range<Integer> rangeC = this.f63790c.c();
        y0.a("VidEncVdPrflRslvr", "Using resolved VIDEO bitrate from EncoderProfiles");
        int iE = k.e(this.f63792e.c(), this.f63793f.a(), this.f63792e.b(), iB, this.f63792e.f(), this.f63791d.getWidth(), this.f63792e.k(), this.f63791d.getHeight(), this.f63792e.h(), rangeC);
        int iJ = this.f63792e.j();
        return m1.c().h(this.f63788a).g(this.f63789b).j(this.f63791d).b(iE).e(iB).i(iJ).d(k.b(this.f63788a, iJ)).a();
    }
}
