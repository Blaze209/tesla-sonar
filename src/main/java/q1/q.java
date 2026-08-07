package q1;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.widget.EdgeEffect;
import androidx.compose.ui.platform.q1;
import androidx.compose.ui.platform.r1;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import k3.j1;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ#\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00112\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u0017J#\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00112\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u0017J#\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u00112\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0002¢\u0006\u0004\b\u001d\u0010\u0017J+\u0010!\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00112\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0002¢\u0006\u0004\b!\u0010\"J\u0013\u0010$\u001a\u00020\t*\u00020#H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00100\u001a\u00020*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lq1/q;", "Lh3/h;", "Landroidx/compose/ui/platform/r1;", "Lq1/a;", "overscrollEffect", "Lq1/s;", "edgeEffectWrapper", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/q1;", "Ljn0/h0;", "inspectorInfo", "<init>", "(Lq1/a;Lq1/s;Lwn0/l;)V", "", "u", "()Z", "t", "Landroid/widget/EdgeEffect;", "left", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "canvas", "m", "(Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z", "top", "p", "right", "o", "bottom", IntegerTokenConverter.CONVERTER_KEY, "", "rotationDegrees", "edgeEffect", "r", "(FLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z", "Lm3/c;", Gender.FEMALE, "(Lm3/c;)V", "c", "Lq1/a;", DateTokenConverter.CONVERTER_KEY, "Lq1/s;", "Landroid/graphics/RenderNode;", "e", "Landroid/graphics/RenderNode;", "_renderNode", "s", "()Landroid/graphics/RenderNode;", "renderNode", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class q extends r1 implements h3.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a overscrollEffect;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final s edgeEffectWrapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private RenderNode _renderNode;

    public q(a aVar, s sVar, wn0.l<? super q1, jn0.h0> lVar) {
        super(lVar);
        this.overscrollEffect = aVar;
        this.edgeEffectWrapper = sVar;
    }

    private final boolean i(EdgeEffect bottom, Canvas canvas) {
        return r(180.0f, bottom, canvas);
    }

    private final boolean m(EdgeEffect left, Canvas canvas) {
        return r(270.0f, left, canvas);
    }

    private final boolean o(EdgeEffect right, Canvas canvas) {
        return r(90.0f, right, canvas);
    }

    private final boolean p(EdgeEffect top, Canvas canvas) {
        return r(BitmapDescriptorFactory.HUE_RED, top, canvas);
    }

    private final boolean r(float rotationDegrees, EdgeEffect edgeEffect, Canvas canvas) {
        if (rotationDegrees == BitmapDescriptorFactory.HUE_RED) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(rotationDegrees);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    private final RenderNode s() {
        RenderNode renderNode = this._renderNode;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeA = p.a("AndroidEdgeEffectOverscrollEffect");
        this._renderNode = renderNodeA;
        return renderNodeA;
    }

    private final boolean t() {
        s sVar = this.edgeEffectWrapper;
        return sVar.r() || sVar.s() || sVar.u() || sVar.v();
    }

    private final boolean u() {
        s sVar = this.edgeEffectWrapper;
        return sVar.y() || sVar.z() || sVar.o() || sVar.p();
    }

    @Override // h3.h
    public void F(m3.c cVar) {
        boolean zM;
        this.overscrollEffect.r(cVar.b());
        if (j3.m.m(cVar.b())) {
            cVar.M0();
            return;
        }
        this.overscrollEffect.j().getValue();
        float fO1 = cVar.O1(l.b());
        Canvas canvasD = k3.f0.d(cVar.getDrawContext().a());
        s sVar = this.edgeEffectWrapper;
        boolean zU = u();
        boolean zT = t();
        if (zU && zT) {
            s().setPosition(0, 0, canvasD.getWidth(), canvasD.getHeight());
        } else if (zU) {
            s().setPosition(0, 0, canvasD.getWidth() + (yn0.a.d(fO1) * 2), canvasD.getHeight());
        } else {
            if (!zT) {
                cVar.M0();
                return;
            }
            s().setPosition(0, 0, canvasD.getWidth(), canvasD.getHeight() + (yn0.a.d(fO1) * 2));
        }
        RecordingCanvas recordingCanvasBeginRecording = s().beginRecording();
        if (sVar.s()) {
            EdgeEffect edgeEffectI = sVar.i();
            o(edgeEffectI, recordingCanvasBeginRecording);
            edgeEffectI.finish();
        }
        if (sVar.r()) {
            EdgeEffect edgeEffectH = sVar.h();
            zM = m(edgeEffectH, recordingCanvasBeginRecording);
            if (sVar.t()) {
                float fN = j3.g.n(this.overscrollEffect.i());
                r rVar = r.f104310a;
                rVar.d(sVar.i(), rVar.b(edgeEffectH), 1 - fN);
            }
        } else {
            zM = false;
        }
        if (sVar.z()) {
            EdgeEffect edgeEffectM = sVar.m();
            i(edgeEffectM, recordingCanvasBeginRecording);
            edgeEffectM.finish();
        }
        if (sVar.y()) {
            EdgeEffect edgeEffectL = sVar.l();
            zM = p(edgeEffectL, recordingCanvasBeginRecording) || zM;
            if (sVar.A()) {
                float fM = j3.g.m(this.overscrollEffect.i());
                r rVar2 = r.f104310a;
                rVar2.d(sVar.m(), rVar2.b(edgeEffectL), fM);
            }
        }
        if (sVar.v()) {
            EdgeEffect edgeEffectK = sVar.k();
            m(edgeEffectK, recordingCanvasBeginRecording);
            edgeEffectK.finish();
        }
        if (sVar.u()) {
            EdgeEffect edgeEffectJ = sVar.j();
            zM = o(edgeEffectJ, recordingCanvasBeginRecording) || zM;
            if (sVar.w()) {
                float fN2 = j3.g.n(this.overscrollEffect.i());
                r rVar3 = r.f104310a;
                rVar3.d(sVar.k(), rVar3.b(edgeEffectJ), fN2);
            }
        }
        if (sVar.p()) {
            EdgeEffect edgeEffectG = sVar.g();
            p(edgeEffectG, recordingCanvasBeginRecording);
            edgeEffectG.finish();
        }
        if (sVar.o()) {
            EdgeEffect edgeEffectF = sVar.f();
            boolean z11 = i(edgeEffectF, recordingCanvasBeginRecording) || zM;
            if (sVar.q()) {
                float fM2 = j3.g.m(this.overscrollEffect.i());
                r rVar4 = r.f104310a;
                rVar4.d(sVar.g(), rVar4.b(edgeEffectF), 1 - fM2);
            }
            zM = z11;
        }
        if (zM) {
            this.overscrollEffect.k();
        }
        float f11 = zT ? 0.0f : fO1;
        if (zU) {
            fO1 = 0.0f;
        }
        w4.t layoutDirection = cVar.getLayoutDirection();
        j1 j1VarB = k3.f0.b(recordingCanvasBeginRecording);
        long jB = cVar.b();
        w4.d density = cVar.getDrawContext().getDensity();
        w4.t layoutDirection2 = cVar.getDrawContext().getLayoutDirection();
        j1 j1VarA = cVar.getDrawContext().a();
        long jB2 = cVar.getDrawContext().b();
        n3.c graphicsLayer = cVar.getDrawContext().getGraphicsLayer();
        m3.d drawContext = cVar.getDrawContext();
        drawContext.d(cVar);
        drawContext.c(layoutDirection);
        drawContext.h(j1VarB);
        drawContext.f(jB);
        drawContext.e(null);
        j1VarB.u();
        try {
            cVar.getDrawContext().getTransform().c(f11, fO1);
            try {
                cVar.M0();
                float f12 = -f11;
                float f13 = -fO1;
                cVar.getDrawContext().getTransform().c(f12, f13);
                j1VarB.o();
                m3.d drawContext2 = cVar.getDrawContext();
                drawContext2.d(density);
                drawContext2.c(layoutDirection2);
                drawContext2.h(j1VarA);
                drawContext2.f(jB2);
                drawContext2.e(graphicsLayer);
                s().endRecording();
                int iSave = canvasD.save();
                canvasD.translate(f12, f13);
                canvasD.drawRenderNode(s());
                canvasD.restoreToCount(iSave);
            } catch (Throwable th2) {
                cVar.getDrawContext().getTransform().c(-f11, -fO1);
                throw th2;
            }
        } catch (Throwable th3) {
            j1VarB.o();
            m3.d drawContext3 = cVar.getDrawContext();
            drawContext3.d(density);
            drawContext3.c(layoutDirection2);
            drawContext3.h(j1VarA);
            drawContext3.f(jB2);
            drawContext3.e(graphicsLayer);
            throw th3;
        }
    }
}
