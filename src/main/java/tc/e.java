package tc;

import android.graphics.Canvas;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.caverock.androidsvg.f;
import com.caverock.androidsvg.g;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import ec.n;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010#¨\u0006%"}, d2 = {"Ltc/e;", "Lec/n;", "Lcom/caverock/androidsvg/g;", "svg", "Lcom/caverock/androidsvg/f;", "renderOptions", "", Snapshot.WIDTH, Snapshot.HEIGHT, "<init>", "(Lcom/caverock/androidsvg/g;Lcom/caverock/androidsvg/f;II)V", "Landroid/graphics/Canvas;", "Lcoil3/Canvas;", "canvas", "Ljn0/h0;", "a", "(Landroid/graphics/Canvas;)V", "Lcom/caverock/androidsvg/g;", "getSvg", "()Lcom/caverock/androidsvg/g;", "b", "Lcom/caverock/androidsvg/f;", "getRenderOptions", "()Lcom/caverock/androidsvg/f;", "c", "I", "getWidth", "()I", DateTokenConverter.CONVERTER_KEY, "getHeight", "", "getSize", "()J", "size", "", "()Z", "shareable", "coil-svg_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g svg;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f renderOptions;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int width;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int height;

    public e(g gVar, f fVar, int i11, int i12) {
        this.svg = gVar;
        this.renderOptions = fVar;
        this.width = i11;
        this.height = i12;
    }

    @Override // ec.n
    public void a(Canvas canvas) {
        this.svg.o(canvas, this.renderOptions);
    }

    @Override // ec.n
    /* JADX INFO: renamed from: b */
    public boolean getShareable() {
        return true;
    }

    @Override // ec.n
    public int getHeight() {
        return this.height;
    }

    @Override // ec.n
    public long getSize() {
        return ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX;
    }

    @Override // ec.n
    public int getWidth() {
        return this.width;
    }
}
