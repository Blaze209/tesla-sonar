package f1;

import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.h3;
import c0.b0;
import c0.y0;
import c0.z1;
import g1.m1;
import java.util.Objects;
import z0.e2;

/* JADX INFO: loaded from: classes.dex */
public class l implements u5.j<m1> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Size f63780g = new Size(1280, 720);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Range<Integer> f63781h = new Range<>(1, 60);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f63782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h3 f63783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e2 f63784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Size f63785d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b0 f63786e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Range<Integer> f63787f;

    public l(@NonNull String str, @NonNull h3 h3Var, @NonNull e2 e2Var, @NonNull Size size, @NonNull b0 b0Var, @NonNull Range<Integer> range) {
        this.f63782a = str;
        this.f63783b = h3Var;
        this.f63784c = e2Var;
        this.f63785d = size;
        this.f63786e = b0Var;
        this.f63787f = range;
    }

    private int b() {
        Range<Integer> range = this.f63787f;
        Range<Integer> range2 = z1.f18481p;
        int iIntValue = !Objects.equals(range, range2) ? ((Integer) f63781h.clamp((Integer) this.f63787f.getUpper())).intValue() : 30;
        y0.a("VidEncCfgDefaultRslvr", String.format("Default resolved frame rate: %dfps. [Expected operating range: %s]", Integer.valueOf(iIntValue), Objects.equals(this.f63787f, range2) ? this.f63787f : "<UNSPECIFIED>"));
        return iIntValue;
    }

    @Override // u5.j
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public m1 get() {
        int iB = b();
        y0.a("VidEncCfgDefaultRslvr", "Resolved VIDEO frame rate: " + iB + "fps");
        Range<Integer> rangeC = this.f63784c.c();
        y0.a("VidEncCfgDefaultRslvr", "Using fallback VIDEO bitrate");
        int iA = this.f63786e.a();
        int width = this.f63785d.getWidth();
        Size size = f63780g;
        int iE = k.e(14000000, iA, 8, iB, 30, width, size.getWidth(), this.f63785d.getHeight(), size.getHeight(), rangeC);
        int iA2 = h1.b.a(this.f63782a, this.f63786e);
        return m1.c().h(this.f63782a).g(this.f63783b).j(this.f63785d).b(iE).e(iB).i(iA2).d(k.b(this.f63782a, iA2)).a();
    }
}
