package q1;

import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.compose.ui.platform.q1;
import androidx.compose.ui.platform.r1;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0016\u001a\u00020\u0015*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0019\u001a\u00020\u0015*\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00102\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u0017J'\u0010\u001b\u001a\u00020\u0015*\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00102\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0002¢\u0006\u0004\b\u001b\u0010\u0017J'\u0010\u001d\u001a\u00020\u0015*\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u00102\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0002¢\u0006\u0004\b\u001d\u0010\u0017J6\u0010#\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00102\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0002ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u0013\u0010&\u001a\u00020\u000b*\u00020%H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006."}, d2 = {"Lq1/o;", "Lh3/h;", "Landroidx/compose/ui/platform/r1;", "Lq1/a;", "overscrollEffect", "Lq1/s;", "edgeEffectWrapper", "Lq1/l0;", "overscrollConfig", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/q1;", "Ljn0/h0;", "inspectorInfo", "<init>", "(Lq1/a;Lq1/s;Lq1/l0;Lwn0/l;)V", "Lm3/f;", "Landroid/widget/EdgeEffect;", "left", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "canvas", "", "m", "(Lm3/f;Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z", "top", "p", "right", "o", "bottom", IntegerTokenConverter.CONVERTER_KEY, "", "rotationDegrees", "Lj3/g;", "offset", "edgeEffect", "r", "(FJLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z", "Lm3/c;", Gender.FEMALE, "(Lm3/c;)V", "c", "Lq1/a;", DateTokenConverter.CONVERTER_KEY, "Lq1/s;", "e", "Lq1/l0;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class o extends r1 implements h3.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a overscrollEffect;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final s edgeEffectWrapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final OverscrollConfiguration overscrollConfig;

    public o(a aVar, s sVar, OverscrollConfiguration overscrollConfiguration, wn0.l<? super q1, jn0.h0> lVar) {
        super(lVar);
        this.overscrollEffect = aVar;
        this.edgeEffectWrapper = sVar;
        this.overscrollConfig = overscrollConfiguration;
    }

    private final boolean i(m3.f fVar, EdgeEffect edgeEffect, Canvas canvas) {
        return r(180.0f, j3.h.a(-j3.m.k(fVar.b()), (-j3.m.i(fVar.b())) + fVar.O1(this.overscrollConfig.getDrawPadding().getBottom())), edgeEffect, canvas);
    }

    private final boolean m(m3.f fVar, EdgeEffect edgeEffect, Canvas canvas) {
        return r(270.0f, j3.h.a(-j3.m.i(fVar.b()), fVar.O1(this.overscrollConfig.getDrawPadding().c(fVar.getLayoutDirection()))), edgeEffect, canvas);
    }

    private final boolean o(m3.f fVar, EdgeEffect edgeEffect, Canvas canvas) {
        return r(90.0f, j3.h.a(BitmapDescriptorFactory.HUE_RED, (-yn0.a.d(j3.m.k(fVar.b()))) + fVar.O1(this.overscrollConfig.getDrawPadding().b(fVar.getLayoutDirection()))), edgeEffect, canvas);
    }

    private final boolean p(m3.f fVar, EdgeEffect edgeEffect, Canvas canvas) {
        return r(BitmapDescriptorFactory.HUE_RED, j3.h.a(BitmapDescriptorFactory.HUE_RED, fVar.O1(this.overscrollConfig.getDrawPadding().getTop())), edgeEffect, canvas);
    }

    private final boolean r(float rotationDegrees, long offset, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(rotationDegrees);
        canvas.translate(j3.g.m(offset), j3.g.n(offset));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // h3.h
    public void F(m3.c cVar) {
        this.overscrollEffect.r(cVar.b());
        if (j3.m.m(cVar.b())) {
            cVar.M0();
            return;
        }
        cVar.M0();
        this.overscrollEffect.j().getValue();
        Canvas canvasD = k3.f0.d(cVar.getDrawContext().a());
        s sVar = this.edgeEffectWrapper;
        boolean zM = sVar.r() ? m(cVar, sVar.h(), canvasD) : false;
        if (sVar.y()) {
            zM = p(cVar, sVar.l(), canvasD) || zM;
        }
        if (sVar.u()) {
            zM = o(cVar, sVar.j(), canvasD) || zM;
        }
        if (sVar.o()) {
            zM = i(cVar, sVar.f(), canvasD) || zM;
        }
        if (zM) {
            this.overscrollEffect.k();
        }
    }
}
