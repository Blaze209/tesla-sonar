package com.facebook.react.views.text;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.h1;
import com.facebook.react.uimanager.i0;
import com.facebook.react.uimanager.u;
import com.facebook.react.uimanager.v0;
import com.facebook.react.uimanager.w;
import com.facebook.yoga.r;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class f extends c {
    private static final TextPaint F = new TextPaint(1);
    private Spannable B;
    private boolean C;
    private final com.facebook.yoga.o D;
    private final com.facebook.yoga.b E;

    class a implements com.facebook.yoga.o {
        a() {
        }

        /* JADX WARN: Code duplicated, block: B:58:0x0170  */
        @Override // com.facebook.yoga.o
        public long a(r rVar, float f11, com.facebook.yoga.p pVar, float f12, com.facebook.yoga.p pVar2) {
            float lineBottom;
            float fCeil = f11;
            Spannable spannable = (Spannable) gn.a.d(f.this.B, "Spannable element has not been prepared in onBeforeLayout");
            Layout layoutJ = f.this.j(spannable, fCeil, pVar);
            f fVar = f.this;
            int i11 = -1;
            int i12 = 0;
            int i13 = 1;
            if (fVar.f23677t) {
                int iC = fVar.f23658a.c();
                int iC2 = f.this.f23658a.c();
                float f13 = iC;
                int iMax = (int) Math.max(f.this.f23678u * f13, w.h(4.0f));
                while (iC2 > iMax && ((f.this.f23665h != i11 && layoutJ.getLineCount() > f.this.f23665h) || (pVar2 != com.facebook.yoga.p.UNDEFINED && layoutJ.getHeight() > f12))) {
                    iC2 -= Math.max(i13, (int) w.h(1.0f));
                    float f14 = iC2 / f13;
                    ap.d[] dVarArr = (ap.d[]) spannable.getSpans(i12, spannable.length(), ap.d.class);
                    int length = dVarArr.length;
                    int i14 = i12;
                    while (i14 < length) {
                        ap.d dVar = dVarArr[i14];
                        spannable.setSpan(new ap.d((int) Math.max(dVar.getSize() * f14, iMax)), spannable.getSpanStart(dVar), spannable.getSpanEnd(dVar), spannable.getSpanFlags(dVar));
                        spannable.removeSpan(dVar);
                        i14++;
                        i13 = i13;
                        f14 = f14;
                    }
                    layoutJ = f.this.j(spannable, fCeil, pVar);
                    i11 = -1;
                    i12 = 0;
                }
            }
            if (f.this.C) {
                v0 themedContext = f.this.getThemedContext();
                WritableArray writableArrayA = com.facebook.react.views.text.b.a(spannable, layoutJ, f.F, themedContext);
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putArray("lines", writableArrayA);
                if (themedContext.hasActiveReactInstance()) {
                    ((RCTEventEmitter) themedContext.getJSModule(RCTEventEmitter.class)).receiveEvent(f.this.getReactTag(), "topTextLayout", writableMapCreateMap);
                } else {
                    ReactSoftExceptionLogger.logSoftException("ReactTextShadowNode", new ReactNoCrashSoftException("Cannot get RCTEventEmitter, no CatalystInstance"));
                }
            }
            int i15 = f.this.f23665h;
            int lineCount = i15 == -1 ? layoutJ.getLineCount() : Math.min(i15, layoutJ.getLineCount());
            if (pVar != com.facebook.yoga.p.EXACTLY) {
                float f15 = BitmapDescriptorFactory.HUE_RED;
                for (int i16 = 0; i16 < lineCount; i16++) {
                    float lineWidth = (spannable.length() <= 0 || spannable.charAt(layoutJ.getLineEnd(i16) + (-1)) != '\n') ? layoutJ.getLineWidth(i16) : layoutJ.getLineMax(i16);
                    if (lineWidth > f15) {
                        f15 = lineWidth;
                    }
                }
                if (pVar != com.facebook.yoga.p.AT_MOST || f15 <= fCeil) {
                    fCeil = f15;
                }
            }
            if (Build.VERSION.SDK_INT > 29) {
                fCeil = (float) Math.ceil(fCeil);
            }
            if (pVar2 != com.facebook.yoga.p.EXACTLY) {
                lineBottom = layoutJ.getLineBottom(lineCount - 1);
                if (pVar2 == com.facebook.yoga.p.AT_MOST && lineBottom > f12) {
                    lineBottom = f12;
                }
            } else {
                lineBottom = f12;
            }
            return com.facebook.yoga.q.a(fCeil, lineBottom);
        }
    }

    class b implements com.facebook.yoga.b {
        b() {
        }

        @Override // com.facebook.yoga.b
        public float a(r rVar, float f11, float f12) {
            Layout layoutJ = f.this.j((Spannable) gn.a.d(f.this.B, "Spannable element has not been prepared in onBeforeLayout"), f11, com.facebook.yoga.p.EXACTLY);
            return layoutJ.getLineBaseline(layoutJ.getLineCount() - 1);
        }
    }

    public f() {
        this(null);
    }

    private int h() {
        int i11 = this.f23666i;
        if (getLayoutDirection() == com.facebook.yoga.h.RTL) {
            if (i11 == 5) {
                return 3;
            }
            if (i11 == 3) {
                return 5;
            }
        }
        return i11;
    }

    private void i() {
        if (isVirtual()) {
            return;
        }
        setMeasureFunction(this.D);
        setBaselineFunction(this.E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Layout j(Spannable spannable, float f11, com.facebook.yoga.p pVar) {
        TextPaint textPaint = F;
        textPaint.setTextSize(this.f23658a.c());
        BoringLayout.Metrics metricsIsBoring = BoringLayout.isBoring(spannable, textPaint);
        float desiredWidth = metricsIsBoring == null ? Layout.getDesiredWidth(spannable, textPaint) : Float.NaN;
        boolean z11 = pVar == com.facebook.yoga.p.UNDEFINED || f11 < BitmapDescriptorFactory.HUE_RED;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        int iH = h();
        if (iH == 1) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (iH != 3 && iH == 5) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (metricsIsBoring == null && (z11 || (!com.facebook.yoga.g.a(desiredWidth) && desiredWidth <= f11))) {
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(spannable, 0, spannable.length(), textPaint, (int) Math.ceil(desiredWidth)).setAlignment(alignment).setLineSpacing(BitmapDescriptorFactory.HUE_RED, 1.0f).setIncludePad(this.f23676s).setBreakStrategy(this.f23667j).setHyphenationFrequency(this.f23668k);
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 26) {
                hyphenationFrequency.setJustificationMode(this.f23669l);
            }
            if (i11 >= 28) {
                hyphenationFrequency.setUseLineSpacingFromFallbacks(true);
            }
            return hyphenationFrequency.build();
        }
        if (metricsIsBoring != null && (z11 || metricsIsBoring.width <= f11)) {
            return BoringLayout.make(spannable, textPaint, Math.max(metricsIsBoring.width, 0), alignment, 1.0f, BitmapDescriptorFactory.HUE_RED, metricsIsBoring, this.f23676s);
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 > 29) {
            f11 = (float) Math.ceil(f11);
        }
        StaticLayout.Builder hyphenationFrequency2 = StaticLayout.Builder.obtain(spannable, 0, spannable.length(), textPaint, (int) f11).setAlignment(alignment).setLineSpacing(BitmapDescriptorFactory.HUE_RED, 1.0f).setIncludePad(this.f23676s).setBreakStrategy(this.f23667j).setHyphenationFrequency(this.f23668k);
        if (i12 >= 26) {
            hyphenationFrequency2.setJustificationMode(this.f23669l);
        }
        if (i12 >= 28) {
            hyphenationFrequency2.setUseLineSpacingFromFallbacks(true);
        }
        return hyphenationFrequency2.build();
    }

    @Override // com.facebook.react.uimanager.j0, com.facebook.react.uimanager.i0
    public Iterable<? extends i0> calculateLayoutOnChildren() {
        Map<Integer, i0> map = this.A;
        if (map == null || map.isEmpty()) {
            return null;
        }
        Spanned spanned = (Spanned) gn.a.d(this.B, "Spannable element has not been prepared in onBeforeLayout");
        ap.q[] qVarArr = (ap.q[]) spanned.getSpans(0, spanned.length(), ap.q.class);
        ArrayList arrayList = new ArrayList(qVarArr.length);
        for (ap.q qVar : qVarArr) {
            i0 i0Var = this.A.get(Integer.valueOf(qVar.getReactTag()));
            i0Var.calculateLayout();
            arrayList.add(i0Var);
        }
        return arrayList;
    }

    @Override // com.facebook.react.uimanager.j0
    public boolean hoistNativeChildren() {
        return true;
    }

    @Override // com.facebook.react.uimanager.j0
    public boolean isVirtualAnchor() {
        return false;
    }

    @Override // com.facebook.react.uimanager.j0
    public void markUpdated() {
        super.markUpdated();
        super.dirty();
    }

    @Override // com.facebook.react.uimanager.j0, com.facebook.react.uimanager.i0
    public void onBeforeLayout(u uVar) {
        this.B = c(this, null, true, uVar);
        markUpdated();
    }

    @Override // com.facebook.react.uimanager.j0
    public void onCollectExtraUpdates(h1 h1Var) {
        super.onCollectExtraUpdates(h1Var);
        if (this.B != null) {
            h1Var.O(getReactTag(), new g(this.B, -1, this.f23683z, getPadding(4), getPadding(1), getPadding(5), getPadding(3), h(), this.f23667j, this.f23669l));
        }
    }

    @no.a(name = "onTextLayout")
    public void setShouldNotifyOnTextLayout(boolean z11) {
        this.C = z11;
    }

    public f(j jVar) {
        super(jVar);
        this.D = new a();
        this.E = new b();
        i();
    }
}
