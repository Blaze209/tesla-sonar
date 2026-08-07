package uc;

import android.graphics.RectF;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.caverock.androidsvg.g;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ec.n;
import p013kotlin.Metadata;
import rc.Options;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001bR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0014\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010\u0015\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\"¨\u0006$"}, d2 = {"Luc/a;", "Luc/b;", "Lcom/caverock/androidsvg/g;", "svg", "<init>", "(Lcom/caverock/androidsvg/g;)V", "", "value", "Ljn0/h0;", "b", "([F)V", "", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)V", "a", "Lrc/n;", "options", "e", "(Lrc/n;)V", "", Snapshot.WIDTH, Snapshot.HEIGHT, "Lec/n;", "c", "(II)Lec/n;", "Lcom/caverock/androidsvg/g;", "Lcom/caverock/androidsvg/f;", "Lcom/caverock/androidsvg/f;", "renderOptions", "f", "()[F", "viewBox", "", "getWidth", "()F", "getHeight", "coil-svg_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g svg;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private com.caverock.androidsvg.f renderOptions;

    public a(g gVar) {
        this.svg = gVar;
    }

    @Override // uc.b
    public void a(String value) {
        this.svg.r(value);
    }

    @Override // uc.b
    public void b(float[] value) {
        g gVar = this.svg;
        float f11 = value[0];
        float f12 = value[1];
        gVar.s(f11, f12, value[2] - f11, value[3] - f12);
    }

    @Override // uc.b
    public n c(int width, int height) {
        return new tc.e(this.svg, this.renderOptions, width, height);
    }

    @Override // uc.b
    public void d(String value) {
        this.svg.t(value);
    }

    @Override // uc.b
    public void e(Options options) {
        String strA = tc.b.a(options);
        if (strA != null) {
            com.caverock.androidsvg.f fVar = new com.caverock.androidsvg.f();
            fVar.a(strA);
            this.renderOptions = fVar;
        }
    }

    @Override // uc.b
    public float[] f() {
        RectF rectFG = this.svg.g();
        if (rectFG != null) {
            return new float[]{rectFG.left, rectFG.top, rectFG.right, rectFG.bottom};
        }
        return null;
    }

    @Override // uc.b
    public float getHeight() {
        return this.svg.f();
    }

    @Override // uc.b
    public float getWidth() {
        return this.svg.h();
    }
}
