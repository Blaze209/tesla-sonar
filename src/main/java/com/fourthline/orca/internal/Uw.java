package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Build;
import android.util.Base64;
import ch.qos.logback.core.FileAppender;
import ch.qos.logback.core.util.FileSize;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;
import java.util.regex.Pattern;
import okhttp3.internal.http2.Http2Stream;

/* JADX INFO: loaded from: classes4.dex */
public class Uw {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final boolean f28864i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final boolean f28865j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final boolean f28866k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final boolean f28867l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final boolean f28868m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final boolean f28869n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final boolean f28870o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final boolean f28871p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final boolean f28872q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final boolean f28873r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Pattern f28874s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Pattern f28875t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final Pattern f28876u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final Pattern f28877v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final Pattern f28878w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final Pattern f28879x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static HashSet f28880y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Canvas f28881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f28882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Vw f28883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private h f28884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Stack f28885e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Stack f28886f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Stack f28887g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private I3.p f28888h = null;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28889a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f28890b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f28891c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f28892d;

        static {
            int[] iArr = new int[DA.i.values().length];
            f28892d = iArr;
            try {
                iArr[DA.i.Miter.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28892d[DA.i.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28892d[DA.i.Bevel.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[DA.h.values().length];
            f28891c = iArr2;
            try {
                iArr2[DA.h.Butt.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28891c[DA.h.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28891c[DA.h.Square.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[Ks.a.values().length];
            f28890b = iArr3;
            try {
                iArr3[Ks.a.xMidYMin.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f28890b[Ks.a.xMidYMid.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f28890b[Ks.a.xMidYMax.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f28890b[Ks.a.xMaxYMin.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f28890b[Ks.a.xMaxYMid.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f28890b[Ks.a.xMaxYMax.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f28890b[Ks.a.xMinYMid.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f28890b[Ks.a.xMinYMax.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            int[] iArr4 = new int[DA.b.values().length];
            f28889a = iArr4;
            try {
                iArr4[DA.b.multiply.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f28889a[DA.b.screen.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f28889a[DA.b.overlay.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f28889a[DA.b.darken.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f28889a[DA.b.lighten.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f28889a[DA.b.color_dodge.ordinal()] = 6;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f28889a[DA.b.color_burn.ordinal()] = 7;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f28889a[DA.b.hard_light.ordinal()] = 8;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f28889a[DA.b.soft_light.ordinal()] = 9;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f28889a[DA.b.difference.ordinal()] = 10;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f28889a[DA.b.exclusion.ordinal()] = 11;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f28889a[DA.b.hue.ordinal()] = 12;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f28889a[DA.b.saturation.ordinal()] = 13;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f28889a[DA.b.color.ordinal()] = 14;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f28889a[DA.b.luminosity.ordinal()] = 15;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f28889a[DA.b.normal.ordinal()] = 16;
            } catch (NoSuchFieldError unused30) {
            }
        }
    }

    private class b implements Vw.InterfaceC3002y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f28893a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f28894b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f28895c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private c f28896d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f28897e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f28898f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f28899g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f28900h;

        b(Vw.C3001x c3001x) {
            ArrayList arrayList = new ArrayList();
            this.f28893a = arrayList;
            this.f28896d = null;
            this.f28897e = false;
            this.f28898f = true;
            this.f28899g = -1;
            if (c3001x == null) {
                return;
            }
            c3001x.a(this);
            if (this.f28900h) {
                this.f28896d.a((c) arrayList.get(this.f28899g));
                arrayList.set(this.f28899g, this.f28896d);
                this.f28900h = false;
            }
            c cVar = this.f28896d;
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }

        List a() {
            return this.f28893a;
        }

        @Override // com.fourthline.orca.internal.Vw.InterfaceC3002y
        public void close() {
            this.f28893a.add(this.f28896d);
            lineTo(this.f28894b, this.f28895c);
            this.f28900h = true;
        }

        @Override // com.fourthline.orca.internal.Vw.InterfaceC3002y
        public void cubicTo(float f11, float f12, float f13, float f14, float f15, float f16) {
            if (this.f28898f || this.f28897e) {
                this.f28896d.a(f11, f12);
                this.f28893a.add(this.f28896d);
                this.f28897e = false;
            }
            this.f28896d = new c(f15, f16, f15 - f13, f16 - f14);
            this.f28900h = false;
        }

        @Override // com.fourthline.orca.internal.Vw.InterfaceC3002y
        public void lineTo(float f11, float f12) {
            this.f28896d.a(f11, f12);
            this.f28893a.add(this.f28896d);
            c cVar = this.f28896d;
            this.f28896d = new c(f11, f12, f11 - cVar.f28902a, f12 - cVar.f28903b);
            this.f28900h = false;
        }

        @Override // com.fourthline.orca.internal.Vw.InterfaceC3002y
        public void moveTo(float f11, float f12) {
            if (this.f28900h) {
                this.f28896d.a((c) this.f28893a.get(this.f28899g));
                this.f28893a.set(this.f28899g, this.f28896d);
                this.f28900h = false;
            }
            c cVar = this.f28896d;
            if (cVar != null) {
                this.f28893a.add(cVar);
            }
            this.f28894b = f11;
            this.f28895c = f12;
            this.f28896d = new c(f11, f12, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            this.f28899g = this.f28893a.size();
        }

        @Override // com.fourthline.orca.internal.Vw.InterfaceC3002y
        public void a(float f11, float f12, float f13, float f14) {
            this.f28896d.a(f11, f12);
            this.f28893a.add(this.f28896d);
            this.f28896d = new c(f13, f14, f13 - f11, f14 - f12);
            this.f28900h = false;
        }

        @Override // com.fourthline.orca.internal.Vw.InterfaceC3002y
        public void a(float f11, float f12, float f13, boolean z11, boolean z12, float f14, float f15) {
            this.f28897e = true;
            this.f28898f = false;
            c cVar = this.f28896d;
            Uw.a(cVar.f28902a, cVar.f28903b, f11, f12, f13, z11, z12, f14, f15, this);
            this.f28898f = true;
            this.f28900h = false;
        }
    }

    protected static class d implements Vw.InterfaceC3002y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Path f28907a = new Path();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f28908b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f28909c;

        d(Vw.C3001x c3001x) {
            if (c3001x == null) {
                return;
            }
            c3001x.a(this);
        }

        Path a() {
            return this.f28907a;
        }

        @Override // com.fourthline.orca.internal.Vw.InterfaceC3002y
        public void close() {
            this.f28907a.close();
        }

        @Override // com.fourthline.orca.internal.Vw.InterfaceC3002y
        public void cubicTo(float f11, float f12, float f13, float f14, float f15, float f16) {
            this.f28907a.cubicTo(f11, f12, f13, f14, f15, f16);
            this.f28908b = f15;
            this.f28909c = f16;
        }

        @Override // com.fourthline.orca.internal.Vw.InterfaceC3002y
        public void lineTo(float f11, float f12) {
            this.f28907a.lineTo(f11, f12);
            this.f28908b = f11;
            this.f28909c = f12;
        }

        @Override // com.fourthline.orca.internal.Vw.InterfaceC3002y
        public void moveTo(float f11, float f12) {
            this.f28907a.moveTo(f11, f12);
            this.f28908b = f11;
            this.f28909c = f12;
        }

        @Override // com.fourthline.orca.internal.Vw.InterfaceC3002y
        public void a(float f11, float f12, float f13, float f14) {
            this.f28907a.quadTo(f11, f12, f13, f14);
            this.f28908b = f13;
            this.f28909c = f14;
        }

        @Override // com.fourthline.orca.internal.Vw.InterfaceC3002y
        public void a(float f11, float f12, float f13, boolean z11, boolean z12, float f14, float f15) {
            Uw.a(this.f28908b, this.f28909c, f11, f12, f13, z11, z12, f14, f15, this);
            this.f28908b = f14;
            this.f28909c = f15;
        }
    }

    private class e extends f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Path f28910d;

        e(Path path, float f11, float f12) {
            super(f11, f12);
            this.f28910d = path;
        }

        @Override // com.fourthline.orca.internal.Uw.f, com.fourthline.orca.internal.Uw.j
        public void a(String str) {
            float fA;
            if (Uw.this.t()) {
                if (Uw.f28868m) {
                    Uw uw2 = Uw.this;
                    fA = uw2.f28884d.f28919a.f25325b0.a(uw2) / 2.0f;
                } else {
                    fA = BitmapDescriptorFactory.HUE_RED;
                }
                Uw uw3 = Uw.this;
                h hVar = uw3.f28884d;
                if (hVar.f28920b) {
                    uw3.f28881a.drawTextOnPath(str, this.f28910d, this.f28912a - fA, this.f28913b, hVar.f28925g);
                }
                Uw uw4 = Uw.this;
                h hVar2 = uw4.f28884d;
                if (hVar2.f28921c) {
                    uw4.f28881a.drawTextOnPath(str, this.f28910d, this.f28912a - fA, this.f28913b, hVar2.f28926h);
                }
            }
            float f11 = this.f28912a;
            Uw uw5 = Uw.this;
            this.f28912a = f11 + uw5.a(str, uw5.f28884d.f28925g);
        }
    }

    private class f extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f28912a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f28913b;

        f(float f11, float f12) {
            super();
            this.f28912a = f11;
            this.f28913b = f12;
        }

        @Override // com.fourthline.orca.internal.Uw.j
        public void a(String str) {
            float fA;
            Uw.a("TextSequence render", new Object[0]);
            if (Uw.this.t()) {
                if (Uw.f28868m) {
                    Uw uw2 = Uw.this;
                    fA = uw2.f28884d.f28919a.f25325b0.a(uw2) / 2.0f;
                } else {
                    fA = BitmapDescriptorFactory.HUE_RED;
                }
                Uw uw3 = Uw.this;
                h hVar = uw3.f28884d;
                if (hVar.f28920b) {
                    uw3.f28881a.drawText(str, this.f28912a - fA, this.f28913b, hVar.f28925g);
                }
                Uw uw4 = Uw.this;
                h hVar2 = uw4.f28884d;
                if (hVar2.f28921c) {
                    uw4.f28881a.drawText(str, this.f28912a - fA, this.f28913b, hVar2.f28926h);
                }
            }
            float f11 = this.f28912a;
            Uw uw5 = Uw.this;
            this.f28912a = f11 + uw5.a(str, uw5.f28884d.f28925g);
        }
    }

    private static abstract class j {
        public abstract void a(String str);

        public boolean a(Vw.Y y11) {
            return true;
        }

        private j() {
        }
    }

    private class k extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f28933a;

        @Override // com.fourthline.orca.internal.Uw.j
        public void a(String str) {
            float f11 = this.f28933a;
            Uw uw2 = Uw.this;
            this.f28933a = f11 + uw2.a(str, uw2.f28884d.f28925g);
        }

        private k() {
            super();
            this.f28933a = BitmapDescriptorFactory.HUE_RED;
        }
    }

    static {
        int i11 = Build.VERSION.SDK_INT;
        f28864i = true;
        f28865j = true;
        f28866k = true;
        f28867l = true;
        f28868m = true;
        f28869n = i11 >= 26;
        f28870o = i11 >= 29;
        f28871p = i11 >= 29;
        f28872q = true;
        f28873r = i11 >= 31;
        f28874s = Pattern.compile("[\\n\\t]");
        f28875t = Pattern.compile("\\t");
        f28876u = Pattern.compile("\\n");
        f28877v = Pattern.compile("^\\s+");
        f28878w = Pattern.compile("\\s+$");
        f28879x = Pattern.compile("\\s{2,}");
        f28880y = null;
    }

    Uw(Canvas canvas, float f11, Ww ww2) {
        this.f28881a = canvas;
        this.f28882b = f11;
    }

    private Path.FillType e() {
        DA.c cVar = this.f28884d.f28919a.G;
        return (cVar == null || cVar != DA.c.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    private Path.FillType j() {
        DA.c cVar = this.f28884d.f28919a.f25326c;
        return (cVar == null || cVar != DA.c.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    private static synchronized void k() {
        HashSet hashSet = new HashSet();
        f28880y = hashSet;
        hashSet.add("Structure");
        f28880y.add("BasicStructure");
        f28880y.add("ConditionalProcessing");
        f28880y.add("Image");
        f28880y.add("Style");
        f28880y.add("ViewportAttribute");
        f28880y.add("Shape");
        f28880y.add("BasicText");
        f28880y.add("PaintAttribute");
        f28880y.add("BasicPaintAttribute");
        f28880y.add("OpacityAttribute");
        f28880y.add("BasicGraphicsAttribute");
        f28880y.add("Marker");
        f28880y.add("Gradient");
        f28880y.add("Pattern");
        f28880y.add("Clip");
        f28880y.add("BasicClip");
        f28880y.add("Mask");
        f28880y.add("View");
    }

    private void l() {
        this.f28886f.pop();
        this.f28887g.pop();
    }

    private boolean m() {
        return b(1.0f);
    }

    private boolean n() {
        if (this.f28884d.f28919a.f25337m.floatValue() < 1.0f) {
            return true;
        }
        DA da2 = this.f28884d.f28919a;
        if (da2.H != null || da2.O == DA.g.isolate) {
            return true;
        }
        return f28870o && da2.P != DA.b.normal;
    }

    private void o() {
        this.f28884d = new h();
        this.f28885e = new Stack();
        a(this.f28884d, DA.a());
        h hVar = this.f28884d;
        hVar.f28922d = null;
        hVar.f28924f = false;
        this.f28885e.push(new h(hVar));
        this.f28887g = new Stack();
        this.f28886f = new Stack();
    }

    private void p() {
        List<String> list = this.f28884d.f28919a.f25339o;
        Typeface typefaceA = null;
        if (list != null && this.f28883c != null) {
            for (String str : list) {
                DA da2 = this.f28884d.f28919a;
                typefaceA = a(str, da2.f25341q, da2.f25342r);
                if (typefaceA != null) {
                    break;
                }
            }
        }
        if (typefaceA == null) {
            DA da3 = this.f28884d.f28919a;
            typefaceA = a("serif", da3.f25341q, da3.f25342r);
        }
        this.f28884d.f28925g.setTypeface(typefaceA);
        this.f28884d.f28926h.setTypeface(typefaceA);
        if (f28869n) {
            h hVar = this.f28884d;
            hVar.f28928j.a("wght", hVar.f28919a.f25341q.floatValue());
            h hVar2 = this.f28884d;
            DA.e eVar = hVar2.f28919a.f25342r;
            if (eVar == DA.e.italic) {
                hVar2.f28928j.a("ital", G3.f25894b.floatValue());
                this.f28884d.f28928j.a("slnt", G3.f25895c.floatValue());
            } else if (eVar == DA.e.oblique) {
                hVar2.f28928j.a("slnt", G3.f25895c.floatValue());
            }
            h hVar3 = this.f28884d;
            hVar3.f28928j.a("wdth", hVar3.f28919a.f25343s.floatValue());
            String string = this.f28884d.f28928j.toString();
            a("fontVariationSettings = " + string, new Object[0]);
            this.f28884d.f28925g.setFontVariationSettings(string);
            this.f28884d.f28926h.setFontVariationSettings(string);
        }
        if (f28867l) {
            String string2 = this.f28884d.f28927i.toString();
            a("fontFeatureSettings = " + string2, new Object[0]);
            this.f28884d.f28925g.setFontFeatureSettings(string2);
            this.f28884d.f28926h.setFontFeatureSettings(string2);
        }
    }

    private void q() {
        this.f28881a.restore();
        this.f28884d = (h) this.f28885e.pop();
    }

    private void r() {
        a(false);
    }

    private void s() {
        int iA;
        DA da2 = this.f28884d.f28919a;
        Vw.O o11 = da2.K;
        if (o11 instanceof Vw.C2984g) {
            iA = ((Vw.C2984g) o11).f29315a;
        } else if (!(o11 instanceof Vw.C2985h)) {
            return;
        } else {
            iA = da2.f25338n.f29315a;
        }
        Float f11 = da2.L;
        if (f11 != null) {
            iA = a(iA, f11.floatValue());
        }
        this.f28881a.drawColor(iA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean t() {
        Boolean bool = this.f28884d.f28919a.C;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    float f() {
        return this.f28884d.f28925g.getTextSize();
    }

    float g() {
        return this.f28884d.f28925g.getTextSize() / 2.0f;
    }

    float h() {
        return this.f28882b;
    }

    Vw.C2980c i() {
        h hVar = this.f28884d;
        Vw.C2980c c2980c = hVar.f28923e;
        return c2980c != null ? c2980c : hVar.f28922d;
    }

    private class g extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f28915a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f28916b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Path f28917c;

        g(float f11, float f12, Path path) {
            super();
            this.f28915a = f11;
            this.f28916b = f12;
            this.f28917c = path;
        }

        @Override // com.fourthline.orca.internal.Uw.j
        public boolean a(Vw.Y y11) {
            if (!(y11 instanceof Vw.Z)) {
                return true;
            }
            Uw.c("Using <textPath> elements in a clip path is not supported.", new Object[0]);
            return false;
        }

        @Override // com.fourthline.orca.internal.Uw.j
        public void a(String str) {
            String str2;
            if (Uw.this.t()) {
                Path path = new Path();
                str2 = str;
                Uw.this.f28884d.f28925g.getTextPath(str2, 0, str.length(), this.f28915a, this.f28916b, path);
                this.f28917c.addPath(path);
            } else {
                str2 = str;
            }
            float f11 = this.f28915a;
            Uw uw2 = Uw.this;
            this.f28915a = f11 + uw2.a(str2, uw2.f28884d.f28925g);
        }
    }

    private float a(float f11, float f12, float f13, float f14) {
        return (f11 * f13) + (f12 * f14);
    }

    private void b(Path path) {
        h hVar = this.f28884d;
        if (hVar.f28919a.M != DA.o.NonScalingStroke) {
            this.f28881a.drawPath(path, hVar.f28926h);
            return;
        }
        Matrix matrix = this.f28881a.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        this.f28881a.setMatrix(new Matrix());
        Shader shader = this.f28884d.f28926h.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        this.f28881a.drawPath(path2, this.f28884d.f28926h);
        this.f28881a.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    private void c(Vw.N n11) {
        if (n11 instanceof Vw.InterfaceC2998u) {
            return;
        }
        r();
        a(n11);
        if (n11 instanceof Vw.F) {
            a((Vw.F) n11);
        } else if (n11 instanceof Vw.e0) {
            a((Vw.e0) n11);
        } else if (n11 instanceof Vw.S) {
            a((Vw.S) n11);
        } else if (n11 instanceof Vw.C2991n) {
            a((Vw.C2991n) n11);
        } else if (n11 instanceof Vw.C2993p) {
            a((Vw.C2993p) n11);
        } else if (n11 instanceof Vw.C3000w) {
            a((Vw.C3000w) n11);
        } else if (n11 instanceof Vw.C) {
            b((Vw.C) n11);
        } else if (n11 instanceof Vw.C2982e) {
            b((Vw.C2982e) n11);
        } else if (n11 instanceof Vw.C2987j) {
            b((Vw.C2987j) n11);
        } else if (n11 instanceof Vw.C2995r) {
            c((Vw.C2995r) n11);
        } else if (n11 instanceof Vw.B) {
            a((Vw.B) n11);
        } else if (n11 instanceof Vw.A) {
            c((Vw.A) n11);
        } else if (n11 instanceof Vw.W) {
            b((Vw.W) n11);
        }
        q();
    }

    private void d(Vw.K k11) {
        if (k11.f29262b == null || k11.f29251h == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (((Matrix) this.f28887g.peek()).invert(matrix)) {
            Vw.C2980c c2980c = k11.f29251h;
            float f11 = c2980c.f29284a;
            float f12 = c2980c.f29285b;
            float fA = c2980c.a();
            Vw.C2980c c2980c2 = k11.f29251h;
            float f13 = c2980c2.f29285b;
            float fA2 = c2980c2.a();
            float fB = k11.f29251h.b();
            Vw.C2980c c2980c3 = k11.f29251h;
            float[] fArr = {f11, f12, fA, f13, fA2, fB, c2980c3.f29284a, c2980c3.b()};
            matrix.preConcat(this.f28881a.getMatrix());
            matrix.mapPoints(fArr);
            float f14 = fArr[0];
            float f15 = fArr[1];
            RectF rectF = new RectF(f14, f15, f14, f15);
            for (int i11 = 2; i11 <= 6; i11 += 2) {
                float f16 = fArr[i11];
                if (f16 < rectF.left) {
                    rectF.left = f16;
                }
                if (f16 > rectF.right) {
                    rectF.right = f16;
                }
                float f17 = fArr[i11 + 1];
                if (f17 < rectF.top) {
                    rectF.top = f17;
                }
                if (f17 > rectF.bottom) {
                    rectF.bottom = f17;
                }
            }
            Vw.K k12 = (Vw.K) this.f28886f.peek();
            Vw.C2980c c2980c4 = k12.f29251h;
            if (c2980c4 == null) {
                k12.f29251h = Vw.C2980c.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
            } else {
                c2980c4.a(Vw.C2980c.a(rectF.left, rectF.top, rectF.right, rectF.bottom));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(String str, Object... objArr) {
    }

    void a(Vw vw2, Qw qw2) {
        Vw.C2980c c2980c;
        Ks ks2;
        if (qw2 != null) {
            this.f28883c = vw2;
            Vw.F f11 = vw2.f();
            if (f11 == null) {
                c("Nothing to render. Document is empty.", new Object[0]);
                return;
            }
            if (qw2.d()) {
                Vw.L lB = this.f28883c.b(qw2.f27574f);
                if (!(lB instanceof Vw.f0)) {
                    String.format("View element with id \"%s\" not found.", qw2.f27574f);
                    return;
                }
                Vw.f0 f0Var = (Vw.f0) lB;
                c2980c = f0Var.f29270p;
                if (c2980c == null) {
                    String.format("View element with id \"%s\" is missing a viewBox attribute.", qw2.f27574f);
                    return;
                }
                ks2 = f0Var.f29263o;
            } else {
                c2980c = qw2.e() ? qw2.f27573e : f11.f29270p;
                ks2 = qw2.b() ? qw2.f27571c : f11.f29263o;
            }
            if (qw2.a()) {
                if (qw2.f27569a != null) {
                    vw2.a(new I3(I3.t.RenderOptions, null).a(qw2.f27569a));
                } else {
                    I3.q qVar = qw2.f27570b;
                    if (qVar != null) {
                        vw2.a(qVar);
                    }
                }
            }
            if (qw2.c()) {
                I3.p pVar = new I3.p();
                this.f28888h = pVar;
                pVar.f26249a = vw2.b(qw2.f27572d);
            }
            o();
            a((Vw.N) f11);
            a(true);
            Vw.C2980c c2980c2 = new Vw.C2980c(qw2.f27575g);
            Vw.C2994q c2994q = f11.f29237s;
            if (c2994q != null) {
                c2980c2.f29286c = c2994q.a(this, c2980c2.f29286c);
            }
            Vw.C2994q c2994q2 = f11.f29238t;
            if (c2994q2 != null) {
                c2980c2.f29287d = c2994q2.a(this, c2980c2.f29287d);
            }
            a(f11, c2980c2, c2980c, ks2);
            q();
            if (qw2.a()) {
                vw2.a();
                return;
            }
            return;
        }
        throw new NullPointerException("renderOptions shouldn't be null");
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final float f28902a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final float f28903b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f28904c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f28905d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f28906e = false;

        c(float f11, float f12, float f13, float f14) {
            this.f28904c = BitmapDescriptorFactory.HUE_RED;
            this.f28905d = BitmapDescriptorFactory.HUE_RED;
            this.f28902a = f11;
            this.f28903b = f12;
            double dSqrt = Math.sqrt((f13 * f13) + (f14 * f14));
            if (dSqrt != 0.0d) {
                this.f28904c = (float) (((double) f13) / dSqrt);
                this.f28905d = (float) (((double) f14) / dSqrt);
            }
        }

        void a(float f11, float f12) {
            float f13 = f11 - this.f28902a;
            float f14 = f12 - this.f28903b;
            double dSqrt = Math.sqrt((f13 * f13) + (f14 * f14));
            if (dSqrt != 0.0d) {
                f13 = (float) (((double) f13) / dSqrt);
                f14 = (float) (((double) f14) / dSqrt);
            }
            float f15 = this.f28904c;
            if (f13 != (-f15) || f14 != (-this.f28905d)) {
                this.f28904c = f15 + f13;
                this.f28905d += f14;
            } else {
                this.f28906e = true;
                this.f28904c = -f14;
                this.f28905d = f13;
            }
        }

        public String toString() {
            return "(" + this.f28902a + "," + this.f28903b + " " + this.f28904c + "," + this.f28905d + ")";
        }

        void a(c cVar) {
            float f11 = cVar.f28904c;
            float f12 = this.f28904c;
            if (f11 == (-f12)) {
                float f13 = cVar.f28905d;
                if (f13 == (-this.f28905d)) {
                    this.f28906e = true;
                    this.f28904c = -f13;
                    this.f28905d = cVar.f28904c;
                    return;
                }
            }
            this.f28904c = f12 + f11;
            this.f28905d += cVar.f28905d;
        }
    }

    private class i extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f28929a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f28930b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final RectF f28931c;

        i(float f11, float f12) {
            super();
            this.f28931c = new RectF();
            this.f28929a = f11;
            this.f28930b = f12;
        }

        @Override // com.fourthline.orca.internal.Uw.j
        public boolean a(Vw.Y y11) {
            if (!(y11 instanceof Vw.Z)) {
                return true;
            }
            Vw.Z z11 = (Vw.Z) y11;
            Vw.N nC = y11.f29261a.c(z11.f29275o);
            if (nC == null) {
                Uw.b("TextPath path reference '%s' not found", z11.f29275o);
                return false;
            }
            Vw.C3000w c3000w = (Vw.C3000w) nC;
            Path pathA = new d(c3000w.f29360o).a();
            Matrix matrix = c3000w.f29330n;
            if (matrix != null) {
                pathA.transform(matrix);
            }
            RectF rectF = new RectF();
            pathA.computeBounds(rectF, true);
            this.f28931c.union(rectF);
            return false;
        }

        @Override // com.fourthline.orca.internal.Uw.j
        public void a(String str) {
            if (Uw.this.t()) {
                Rect rect = new Rect();
                Uw.this.f28884d.f28925g.getTextBounds(str, 0, str.length(), rect);
                RectF rectF = new RectF(rect);
                rectF.offset(this.f28929a, this.f28930b);
                this.f28931c.union(rectF);
            }
            float f11 = this.f28929a;
            Uw uw2 = Uw.this;
            this.f28929a = f11 + uw2.a(str, uw2.f28884d.f28925g);
        }
    }

    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        DA f28919a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f28920b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f28921c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Vw.C2980c f28922d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Vw.C2980c f28923e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f28924f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final Paint f28925g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final Paint f28926h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final F3 f28927i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final G3 f28928j;

        h() {
            Paint paint = new Paint();
            this.f28925g = paint;
            paint.setFlags(193);
            boolean z11 = Uw.f28864i;
            if (z11) {
                paint.setHinting(0);
            }
            paint.setStyle(Paint.Style.FILL);
            Typeface typeface = Typeface.DEFAULT;
            paint.setTypeface(typeface);
            Paint paint2 = new Paint();
            this.f28926h = paint2;
            paint2.setFlags(193);
            if (z11) {
                paint2.setHinting(0);
            }
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setTypeface(typeface);
            this.f28927i = new F3();
            this.f28928j = new G3();
            this.f28919a = DA.a();
        }

        h(h hVar) {
            this.f28920b = hVar.f28920b;
            this.f28921c = hVar.f28921c;
            this.f28925g = new Paint(hVar.f28925g);
            this.f28926h = new Paint(hVar.f28926h);
            Vw.C2980c c2980c = hVar.f28922d;
            if (c2980c != null) {
                this.f28922d = new Vw.C2980c(c2980c);
            }
            Vw.C2980c c2980c2 = hVar.f28923e;
            if (c2980c2 != null) {
                this.f28923e = new Vw.C2980c(c2980c2);
            }
            this.f28924f = hVar.f28924f;
            this.f28927i = new F3(hVar.f28927i);
            this.f28928j = new G3(hVar.f28928j);
            try {
                this.f28919a = (DA) hVar.f28919a.clone();
            } catch (CloneNotSupportedException unused) {
                this.f28919a = DA.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, Object... objArr) {
        String.format(str, objArr);
    }

    private boolean b(float f11) {
        if (!n() && f11 == 1.0f) {
            return false;
        }
        Paint paint = new Paint();
        paint.setAlpha(a(this.f28884d.f28919a.f25337m.floatValue() * f11));
        if (f28870o && this.f28884d.f28919a.P != DA.b.normal) {
            a(paint);
        }
        a(this.f28881a, (RectF) null, paint);
        this.f28885e.push(this.f28884d);
        h hVar = new h(this.f28884d);
        this.f28884d = hVar;
        String str = hVar.f28919a.H;
        if (str != null && !(this.f28883c.c(str) instanceof Vw.C2997t)) {
            b("Mask reference '%s' not found", this.f28884d.f28919a.H);
            this.f28884d.f28919a.H = null;
        }
        return true;
    }

    private void d(Vw.K k11, Vw.C2980c c2980c) {
        if (this.f28884d.f28919a.H != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            a(this.f28881a, (RectF) null, paint);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.2127f, 0.7151f, 0.0722f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED})));
            a(this.f28881a, (RectF) null, paint2);
            Vw.C2997t c2997t = (Vw.C2997t) this.f28883c.c(this.f28884d.f28919a.H);
            a(c2997t, k11, c2980c);
            this.f28881a.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            a(this.f28881a, (RectF) null, paint3);
            a(c2997t, k11, c2980c);
            this.f28881a.restore();
            this.f28881a.restore();
        }
        q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void b(Vw.S s11) {
        Set setB;
        String language = Locale.getDefault().getLanguage();
        for (Vw.N n11 : s11.getChildren()) {
            if (n11 instanceof Vw.G) {
                Vw.G g11 = (Vw.G) n11;
                if (g11.c() == null && ((setB = g11.b()) == null || (!setB.isEmpty() && setB.contains(language)))) {
                    Set setA = g11.a();
                    if (setA != null) {
                        if (f28880y == null) {
                            k();
                        }
                        if (setA.isEmpty() || !f28880y.containsAll(setA)) {
                        }
                    }
                    Set setE = g11.e();
                    if (setE != null) {
                        setE.isEmpty();
                    } else {
                        Set setF = g11.f();
                        if (setF != null) {
                            setF.isEmpty();
                        } else {
                            c(n11);
                            return;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str, Object... objArr) {
        String.format(str, objArr);
    }

    private void c(Vw.K k11) {
        d(k11, k11.f29251h);
    }

    private void c(Vw.C2995r c2995r) {
        a("Line render", new Object[0]);
        a(this.f28884d, c2995r);
        if (c() && t() && this.f28884d.f28921c) {
            Matrix matrix = c2995r.f29330n;
            if (matrix != null) {
                this.f28881a.concat(matrix);
            }
            Path pathB = b(c2995r);
            d(c2995r);
            b((Vw.K) c2995r);
            a((Vw.K) c2995r);
            boolean zM = m();
            b(pathB);
            a((Vw.AbstractC2990m) c2995r);
            if (zM) {
                c((Vw.K) c2995r);
            }
        }
    }

    private DA.k d() {
        DA.k kVar;
        DA da2 = this.f28884d.f28919a;
        if (da2.f25345u != DA.m.LTR && (kVar = da2.f25346v) != DA.k.Middle) {
            DA.k kVar2 = DA.k.Start;
            return kVar == kVar2 ? DA.k.End : kVar2;
        }
        return da2.f25346v;
    }

    private void a(Vw.J j11, boolean z11) {
        if (z11) {
            a(j11);
        }
        Iterator it = j11.getChildren().iterator();
        while (it.hasNext()) {
            c((Vw.N) it.next());
        }
        if (z11) {
            l();
        }
    }

    private void a(boolean z11) {
        if (z11) {
            a(this.f28881a, (RectF) null, (Paint) null);
        } else {
            this.f28881a.save();
        }
        this.f28885e.push(this.f28884d);
        this.f28884d = new h(this.f28884d);
    }

    private void b(Vw.C c11) {
        a("Rect render", new Object[0]);
        Vw.C2994q c2994q = c11.f29230q;
        if (c2994q == null || c11.f29231r == null || c2994q.c() || c11.f29231r.c()) {
            return;
        }
        a(this.f28884d, c11);
        if (c() && t()) {
            Matrix matrix = c11.f29330n;
            if (matrix != null) {
                this.f28881a.concat(matrix);
            }
            Path pathA = a(c11);
            d(c11);
            b((Vw.K) c11);
            a((Vw.K) c11);
            boolean zM = m();
            if (this.f28884d.f28920b) {
                a(c11, pathA);
            }
            if (this.f28884d.f28921c) {
                b(pathA);
            }
            if (zM) {
                c((Vw.K) c11);
            }
        }
    }

    private void a(Canvas canvas, RectF rectF, Paint paint) {
        if (f28872q) {
            canvas.saveLayer(rectF, paint);
        } else {
            U3.a(canvas, rectF, paint, U3.f27995b);
        }
    }

    private void c(Vw.A a11) {
        a("PolyLine render", new Object[0]);
        a(this.f28884d, a11);
        if (c() && t()) {
            h hVar = this.f28884d;
            if (hVar.f28921c || hVar.f28920b) {
                Matrix matrix = a11.f29330n;
                if (matrix != null) {
                    this.f28881a.concat(matrix);
                }
                float[] fArr = a11.f29227o;
                int length = fArr != null ? fArr.length : 0;
                if (length < 2 || length % 2 == 1) {
                    return;
                }
                Path pathB = b(a11);
                d(a11);
                pathB.setFillType(j());
                b((Vw.K) a11);
                a((Vw.K) a11);
                boolean zM = m();
                if (this.f28884d.f28920b) {
                    a(a11, pathB);
                }
                if (this.f28884d.f28921c) {
                    b(pathB);
                }
                a((Vw.AbstractC2990m) a11);
                if (zM) {
                    c((Vw.K) a11);
                }
            }
        }
    }

    private void a(Vw.J j11) {
        this.f28886f.push(j11);
        this.f28887g.push(this.f28881a.getMatrix());
    }

    private void a(h hVar, Vw.L l11) {
        hVar.f28919a.a(l11.f29262b == null);
        DA da2 = l11.f29254e;
        if (da2 != null) {
            a(hVar, da2);
        }
        if (this.f28883c.g()) {
            for (I3.o oVar : this.f28883c.c()) {
                if (I3.a(this.f28888h, oVar.f26246a, l11)) {
                    a(hVar, oVar.f26247b);
                }
            }
        }
        DA da3 = l11.f29255f;
        if (da3 != null) {
            a(hVar, da3);
        }
    }

    private void a(Vw.N n11) {
        Boolean bool;
        if ((n11 instanceof Vw.L) && (bool = ((Vw.L) n11).f29253d) != null) {
            this.f28884d.f28924f = bool.booleanValue();
        }
    }

    private void b(Vw.C2982e c2982e) {
        a("Circle render", new Object[0]);
        Vw.C2994q c2994q = c2982e.f29306q;
        if (c2994q == null || c2994q.c()) {
            return;
        }
        a(this.f28884d, c2982e);
        if (c() && t()) {
            Matrix matrix = c2982e.f29330n;
            if (matrix != null) {
                this.f28881a.concat(matrix);
            }
            Path pathA = a(c2982e);
            d(c2982e);
            b((Vw.K) c2982e);
            a((Vw.K) c2982e);
            boolean zM = m();
            if (this.f28884d.f28920b) {
                a(c2982e, pathA);
            }
            if (this.f28884d.f28921c) {
                b(pathA);
            }
            if (zM) {
                c((Vw.K) c2982e);
            }
        }
    }

    private void a(Vw.K k11, Path path) {
        Vw.O o11 = this.f28884d.f28919a.f25324b;
        if (o11 instanceof Vw.C2999v) {
            Vw.N nC = this.f28883c.c(((Vw.C2999v) o11).f29358a);
            if (nC instanceof Vw.C3003z) {
                a(k11, path, (Vw.C3003z) nC);
                return;
            }
        }
        this.f28881a.drawPath(path, this.f28884d.f28925g);
    }

    private boolean c() {
        Boolean bool = this.f28884d.f28919a.B;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private void c(Vw.K k11, Vw.C2980c c2980c) {
        Vw.N nC = k11.f29261a.c(this.f28884d.f28919a.F);
        if (nC == null) {
            b("ClipPath reference '%s' not found", this.f28884d.f28919a.F);
            return;
        }
        if (nC.g() != "clipPath") {
            return;
        }
        Vw.C2983f c2983f = (Vw.C2983f) nC;
        if (c2983f.f29240i.isEmpty()) {
            this.f28881a.clipRect(0, 0, 0, 0);
            return;
        }
        Boolean bool = c2983f.f29312p;
        boolean z11 = bool == null || bool.booleanValue();
        if ((k11 instanceof Vw.C2991n) && !z11) {
            c("<clipPath clipPathUnits=\"objectBoundingBox\"> is not supported when referenced from container elements (like %s)", k11.g());
            return;
        }
        b();
        if (!z11) {
            Matrix matrix = new Matrix();
            matrix.preTranslate(c2980c.f29284a, c2980c.f29285b);
            matrix.preScale(c2980c.f29286c, c2980c.f29287d);
            this.f28881a.concat(matrix);
        }
        Matrix matrix2 = c2983f.f29331o;
        if (matrix2 != null) {
            this.f28881a.concat(matrix2);
        }
        this.f28884d = b((Vw.N) c2983f);
        a((Vw.K) c2983f);
        Path path = new Path();
        Iterator it = c2983f.f29240i.iterator();
        while (it.hasNext()) {
            a((Vw.N) it.next(), true, path, new Matrix());
        }
        this.f28881a.clipPath(path);
        a();
    }

    private void a(Vw.F f11) {
        a(f11, a(f11.f29235q, f11.f29236r, f11.f29237s, f11.f29238t), f11.f29270p, f11.f29263o);
    }

    private void a(Vw.F f11, Vw.C2980c c2980c) {
        a(f11, c2980c, f11.f29270p, f11.f29263o);
    }

    private void a(Vw.F f11, Vw.C2980c c2980c, Vw.C2980c c2980c2, Ks ks2) {
        a("Svg render", new Object[0]);
        if (c2980c.f29286c == BitmapDescriptorFactory.HUE_RED || c2980c.f29287d == BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        if (ks2 == null && (ks2 = f11.f29263o) == null) {
            ks2 = Ks.f26654f;
        }
        a(this.f28884d, f11);
        if (c()) {
            h hVar = this.f28884d;
            hVar.f28922d = c2980c;
            if (!hVar.f28919a.f25347w.booleanValue()) {
                Vw.C2980c c2980c3 = this.f28884d.f28922d;
                b(c2980c3.f29284a, c2980c3.f29285b, c2980c3.f29286c, c2980c3.f29287d);
            }
            b(f11, this.f28884d.f28922d);
            if (c2980c2 != null) {
                this.f28881a.concat(a(this.f28884d.f28922d, c2980c2, ks2));
                this.f28884d.f28923e = f11.f29270p;
            } else {
                Canvas canvas = this.f28881a;
                Vw.C2980c c2980c4 = this.f28884d.f28922d;
                canvas.translate(c2980c4.f29284a, c2980c4.f29285b);
                this.f28884d.f28923e = null;
            }
            boolean zM = m();
            s();
            a((Vw.J) f11, true);
            if (zM) {
                c((Vw.K) f11);
            }
            d(f11);
        }
    }

    private void b(Vw.C2987j c2987j) {
        a("Ellipse render", new Object[0]);
        Vw.C2994q c2994q = c2987j.f29319q;
        if (c2994q == null || c2987j.f29320r == null || c2994q.c() || c2987j.f29320r.c()) {
            return;
        }
        a(this.f28884d, c2987j);
        if (c() && t()) {
            Matrix matrix = c2987j.f29330n;
            if (matrix != null) {
                this.f28881a.concat(matrix);
            }
            Path pathA = a(c2987j);
            d(c2987j);
            b((Vw.K) c2987j);
            a((Vw.K) c2987j);
            boolean zM = m();
            if (this.f28884d.f28920b) {
                a(c2987j, pathA);
            }
            if (this.f28884d.f28921c) {
                b(pathA);
            }
            if (zM) {
                c((Vw.K) c2987j);
            }
        }
    }

    private Vw.C2980c a(Vw.C2994q c2994q, Vw.C2994q c2994q2, Vw.C2994q c2994q3, Vw.C2994q c2994q4) {
        float fC = BitmapDescriptorFactory.HUE_RED;
        float fB = c2994q != null ? c2994q.b(this) : 0.0f;
        if (c2994q2 != null) {
            fC = c2994q2.c(this);
        }
        Vw.C2980c c2980cI = i();
        return new Vw.C2980c(fB, fC, c2994q3 != null ? c2994q3.b(this) : c2980cI.f29286c, c2994q4 != null ? c2994q4.c(this) : c2980cI.f29287d);
    }

    private void b(Vw.W w11) {
        a("Text render", new Object[0]);
        a(this.f28884d, w11);
        if (c()) {
            p();
            Matrix matrix = w11.f29274s;
            if (matrix != null) {
                this.f28881a.concat(matrix);
            }
            List list = w11.f29279o;
            float fC = BitmapDescriptorFactory.HUE_RED;
            float fB = (list == null || list.size() == 0) ? 0.0f : ((Vw.C2994q) w11.f29279o.get(0)).b(this);
            List list2 = w11.f29280p;
            float fC2 = (list2 == null || list2.size() == 0) ? 0.0f : ((Vw.C2994q) w11.f29280p.get(0)).c(this);
            List list3 = w11.f29281q;
            float fB2 = (list3 == null || list3.size() == 0) ? 0.0f : ((Vw.C2994q) w11.f29281q.get(0)).b(this);
            List list4 = w11.f29282r;
            if (list4 != null && list4.size() != 0) {
                fC = ((Vw.C2994q) w11.f29282r.get(0)).c(this);
            }
            DA.k kVarD = d();
            if (kVarD != DA.k.Start) {
                float fA = a((Vw.Y) w11);
                if (kVarD == DA.k.Middle) {
                    fA /= 2.0f;
                }
                fB -= fA;
            }
            if (w11.f29251h == null) {
                i iVar = new i(fB, fC2);
                a((Vw.Y) w11, (j) iVar);
                RectF rectF = iVar.f28931c;
                w11.f29251h = new Vw.C2980c(rectF.left, rectF.top, rectF.width(), iVar.f28931c.height());
            }
            d(w11);
            b((Vw.K) w11);
            a((Vw.K) w11);
            boolean zM = m();
            a((Vw.Y) w11, new f(fB + fB2, fC2 + fC));
            if (zM) {
                c((Vw.K) w11);
            }
        }
    }

    private void a(Vw.C2991n c2991n) {
        a(c2991n.g() + " render", new Object[0]);
        a(this.f28884d, c2991n);
        if (c()) {
            Matrix matrix = c2991n.f29331o;
            if (matrix != null) {
                this.f28881a.concat(matrix);
            }
            a((Vw.K) c2991n);
            boolean zM = m();
            a((Vw.J) c2991n, true);
            if (zM) {
                c((Vw.K) c2991n);
            }
            d(c2991n);
        }
    }

    private void a(Paint paint) {
        a("Setting blend mode to " + this.f28884d.f28919a.P, new Object[0]);
        switch (a.f28889a[this.f28884d.f28919a.P.ordinal()]) {
            case 1:
                paint.setBlendMode(BlendMode.MULTIPLY);
                break;
            case 2:
                paint.setBlendMode(BlendMode.SCREEN);
                break;
            case 3:
                paint.setBlendMode(BlendMode.OVERLAY);
                break;
            case 4:
                paint.setBlendMode(BlendMode.DARKEN);
                break;
            case 5:
                paint.setBlendMode(BlendMode.LIGHTEN);
                break;
            case 6:
                paint.setBlendMode(BlendMode.COLOR_DODGE);
                break;
            case 7:
                paint.setBlendMode(BlendMode.COLOR_BURN);
                break;
            case 8:
                paint.setBlendMode(BlendMode.HARD_LIGHT);
                break;
            case 9:
                paint.setBlendMode(BlendMode.SOFT_LIGHT);
                break;
            case 10:
                paint.setBlendMode(BlendMode.DIFFERENCE);
                break;
            case 11:
                paint.setBlendMode(BlendMode.EXCLUSION);
                break;
            case 12:
                paint.setBlendMode(BlendMode.HUE);
                break;
            case 13:
                paint.setBlendMode(BlendMode.SATURATION);
                break;
            case 14:
                paint.setBlendMode(BlendMode.COLOR);
                break;
            case 15:
                paint.setBlendMode(BlendMode.LUMINOSITY);
                break;
            default:
                paint.setBlendMode(null);
                break;
        }
    }

    private void b(float f11, float f12, float f13, float f14) {
        float fB = f13 + f11;
        float fC = f14 + f12;
        Vw.C2981d c2981d = this.f28884d.f28919a.f25348x;
        if (c2981d != null) {
            f11 += c2981d.f29293d.b(this);
            f12 += this.f28884d.f28919a.f25348x.f29290a.c(this);
            fB -= this.f28884d.f28919a.f25348x.f29291b.b(this);
            fC -= this.f28884d.f28919a.f25348x.f29292c.c(this);
        }
        this.f28881a.clipRect(f11, f12, fB, fC);
    }

    private h b(Vw.N n11) {
        h hVar = new h();
        a(hVar, DA.a());
        return a(n11, hVar);
    }

    private void a(Vw.S s11) {
        a("Switch render", new Object[0]);
        a(this.f28884d, s11);
        if (c()) {
            Matrix matrix = s11.f29331o;
            if (matrix != null) {
                this.f28881a.concat(matrix);
            }
            a((Vw.K) s11);
            boolean zM = m();
            b(s11);
            if (zM) {
                c((Vw.K) s11);
            }
            d(s11);
        }
    }

    private void b(Vw.K k11) {
        Vw.O o11 = this.f28884d.f28919a.f25324b;
        if (o11 instanceof Vw.C2999v) {
            a(true, k11.f29251h, (Vw.C2999v) o11);
        }
        Vw.O o12 = this.f28884d.f28919a.f25329e;
        if (o12 instanceof Vw.C2999v) {
            a(false, k11.f29251h, (Vw.C2999v) o12);
        }
    }

    private void b(Vw.K k11, Vw.C2980c c2980c) {
        if (this.f28884d.f28919a.F == null) {
            return;
        }
        if (f28866k) {
            Path pathA = a(k11, c2980c);
            if (pathA != null) {
                this.f28881a.clipPath(pathA);
                return;
            }
            return;
        }
        c(k11, c2980c);
    }

    private void a(Vw.e0 e0Var) {
        a("Use render", new Object[0]);
        Vw.C2994q c2994q = e0Var.f29310s;
        if (c2994q == null || !c2994q.c()) {
            Vw.C2994q c2994q2 = e0Var.f29311t;
            if (c2994q2 == null || !c2994q2.c()) {
                a(this.f28884d, e0Var);
                if (c()) {
                    Vw.N nC = e0Var.f29261a.c(e0Var.f29307p);
                    if (nC == null) {
                        b("Use reference '%s' not found", e0Var.f29307p);
                        return;
                    }
                    Matrix matrix = e0Var.f29331o;
                    if (matrix != null) {
                        this.f28881a.concat(matrix);
                    }
                    Vw.C2994q c2994q3 = e0Var.f29308q;
                    float fC = BitmapDescriptorFactory.HUE_RED;
                    float fB = c2994q3 != null ? c2994q3.b(this) : 0.0f;
                    Vw.C2994q c2994q4 = e0Var.f29309r;
                    if (c2994q4 != null) {
                        fC = c2994q4.c(this);
                    }
                    this.f28881a.translate(fB, fC);
                    a((Vw.K) e0Var);
                    boolean zM = m();
                    a((Vw.J) e0Var);
                    if (nC instanceof Vw.F) {
                        Vw.C2980c c2980cA = a((Vw.C2994q) null, (Vw.C2994q) null, e0Var.f29310s, e0Var.f29311t);
                        r();
                        a((Vw.F) nC, c2980cA);
                        q();
                    } else if (nC instanceof Vw.T) {
                        Vw.C2994q c2994q5 = e0Var.f29310s;
                        if (c2994q5 == null) {
                            c2994q5 = new Vw.C2994q(100.0f, Vw.d0.percent);
                        }
                        Vw.C2994q c2994q6 = e0Var.f29311t;
                        if (c2994q6 == null) {
                            c2994q6 = new Vw.C2994q(100.0f, Vw.d0.percent);
                        }
                        Vw.C2980c c2980cA2 = a((Vw.C2994q) null, (Vw.C2994q) null, c2994q5, c2994q6);
                        r();
                        a((Vw.T) nC, c2980cA2);
                        q();
                    } else {
                        c(nC);
                    }
                    l();
                    if (zM) {
                        c((Vw.K) e0Var);
                    }
                    d(e0Var);
                }
            }
        }
    }

    private void b() {
        U3.a(this.f28881a, U3.f27994a);
        this.f28885e.push(this.f28884d);
        this.f28884d = new h(this.f28884d);
    }

    private Path b(Vw.C2995r c2995r) {
        Vw.C2994q c2994q = c2995r.f29342o;
        float fC = BitmapDescriptorFactory.HUE_RED;
        float fB = c2994q == null ? 0.0f : c2994q.b(this);
        Vw.C2994q c2994q2 = c2995r.f29343p;
        float fC2 = c2994q2 == null ? 0.0f : c2994q2.c(this);
        Vw.C2994q c2994q3 = c2995r.f29344q;
        float fB2 = c2994q3 == null ? 0.0f : c2994q3.b(this);
        Vw.C2994q c2994q4 = c2995r.f29345r;
        if (c2994q4 != null) {
            fC = c2994q4.c(this);
        }
        if (c2995r.f29251h == null) {
            c2995r.f29251h = new Vw.C2980c(Math.min(fB, fB2), Math.min(fC2, fC), Math.abs(fB2 - fB), Math.abs(fC - fC2));
        }
        Path path = new Path();
        path.moveTo(fB, fC2);
        path.lineTo(fB2, fC);
        return path;
    }

    private Path b(Vw.A a11) {
        Path path = new Path();
        float[] fArr = a11.f29227o;
        int i11 = 0;
        int length = fArr != null ? fArr.length : 0;
        if (length % 2 != 0) {
            return null;
        }
        if (length > 0) {
            while (length >= 2) {
                if (i11 == 0) {
                    float[] fArr2 = a11.f29227o;
                    path.moveTo(fArr2[i11], fArr2[i11 + 1]);
                } else {
                    float[] fArr3 = a11.f29227o;
                    path.lineTo(fArr3[i11], fArr3[i11 + 1]);
                }
                i11 += 2;
                length -= 2;
            }
            if (a11 instanceof Vw.B) {
                path.close();
            }
        }
        if (a11.f29251h == null) {
            a11.f29251h = a(path);
        }
        return path;
    }

    private void a(Vw.C3000w c3000w) {
        a("Path render", new Object[0]);
        if (c3000w.f29360o == null) {
            return;
        }
        a(this.f28884d, c3000w);
        if (c() && t()) {
            h hVar = this.f28884d;
            if (hVar.f28921c || hVar.f28920b) {
                Matrix matrix = c3000w.f29330n;
                if (matrix != null) {
                    this.f28881a.concat(matrix);
                }
                Path pathA = new d(c3000w.f29360o).a();
                if (c3000w.f29251h == null) {
                    c3000w.f29251h = a(pathA);
                }
                d(c3000w);
                b((Vw.K) c3000w);
                a((Vw.K) c3000w);
                boolean zM = m();
                if (this.f28884d.f28920b) {
                    pathA.setFillType(j());
                    a(c3000w, pathA);
                }
                if (this.f28884d.f28921c) {
                    b(pathA);
                }
                a((Vw.AbstractC2990m) c3000w);
                if (zM) {
                    c((Vw.K) c3000w);
                }
            }
        }
    }

    private Vw.C2980c a(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new Vw.C2980c(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    private List a(Vw.C2995r c2995r) {
        Vw.C2994q c2994q = c2995r.f29342o;
        float fC = BitmapDescriptorFactory.HUE_RED;
        float fB = c2994q != null ? c2994q.b(this) : 0.0f;
        Vw.C2994q c2994q2 = c2995r.f29343p;
        float fC2 = c2994q2 != null ? c2994q2.c(this) : 0.0f;
        Vw.C2994q c2994q3 = c2995r.f29344q;
        float fB2 = c2994q3 != null ? c2994q3.b(this) : 0.0f;
        Vw.C2994q c2994q4 = c2995r.f29345r;
        if (c2994q4 != null) {
            fC = c2994q4.c(this);
        }
        ArrayList arrayList = new ArrayList(2);
        float f11 = fB2 - fB;
        float f12 = fC - fC2;
        arrayList.add(new c(fB, fC2, f11, f12));
        arrayList.add(new c(fB2, fC, f11, f12));
        return arrayList;
    }

    private List a(Vw.A a11) {
        float[] fArr = a11.f29227o;
        int length = fArr != null ? fArr.length : 0;
        int i11 = 2;
        if (length < 2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        float[] fArr2 = a11.f29227o;
        float f11 = fArr2[0];
        float f12 = fArr2[1];
        float f13 = BitmapDescriptorFactory.HUE_RED;
        c cVar = new c(f11, f12, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        float f14 = 0.0f;
        while (i11 < length) {
            float[] fArr3 = a11.f29227o;
            f13 = fArr3[i11];
            f14 = fArr3[i11 + 1];
            cVar.a(f13, f14);
            arrayList.add(cVar);
            i11 += 2;
            cVar = new c(f13, f14, f13 - cVar.f28902a, f14 - cVar.f28903b);
        }
        if (a11 instanceof Vw.B) {
            float[] fArr4 = a11.f29227o;
            float f15 = fArr4[0];
            if (f13 != f15) {
                float f16 = fArr4[1];
                if (f14 != f16) {
                    cVar.a(f15, f16);
                    arrayList.add(cVar);
                    c cVar2 = new c(f15, f16, f15 - cVar.f28902a, f16 - cVar.f28903b);
                    cVar2.a((c) arrayList.get(0));
                    arrayList.add(cVar2);
                    arrayList.set(0, cVar2);
                }
            }
            return arrayList;
        }
        arrayList.add(cVar);
        return arrayList;
    }

    private void a(Vw.B b11) {
        a("Polygon render", new Object[0]);
        a(this.f28884d, b11);
        if (c() && t()) {
            h hVar = this.f28884d;
            if (hVar.f28921c || hVar.f28920b) {
                Matrix matrix = b11.f29330n;
                if (matrix != null) {
                    this.f28881a.concat(matrix);
                }
                float[] fArr = b11.f29227o;
                if ((fArr != null ? fArr.length : 0) < 2) {
                    return;
                }
                Path pathB = b((Vw.A) b11);
                d(b11);
                b((Vw.K) b11);
                a((Vw.K) b11);
                boolean zM = m();
                if (this.f28884d.f28920b) {
                    a(b11, pathB);
                }
                if (this.f28884d.f28921c) {
                    b(pathB);
                }
                a((Vw.AbstractC2990m) b11);
                if (zM) {
                    c((Vw.K) b11);
                }
            }
        }
    }

    private void a(Vw.Y y11, j jVar) {
        if (c()) {
            Iterator it = y11.f29240i.iterator();
            boolean z11 = true;
            while (it.hasNext()) {
                Vw.N n11 = (Vw.N) it.next();
                if (n11 instanceof Vw.c0) {
                    jVar.a(a(((Vw.c0) n11).f29288c, z11, !it.hasNext()));
                } else {
                    a(n11, jVar);
                }
                z11 = false;
            }
        }
    }

    private void a(Vw.N n11, j jVar) {
        float f11;
        float fC;
        float fB;
        DA.k kVarD;
        if (jVar.a((Vw.Y) n11)) {
            if (n11 instanceof Vw.Z) {
                r();
                a((Vw.Z) n11);
                q();
                return;
            }
            if (n11 instanceof Vw.V) {
                a("TSpan render", new Object[0]);
                r();
                Vw.V v11 = (Vw.V) n11;
                a(this.f28884d, v11);
                if (c()) {
                    p();
                    List list = v11.f29279o;
                    boolean z11 = list != null && list.size() > 0;
                    boolean z12 = jVar instanceof f;
                    float fC2 = BitmapDescriptorFactory.HUE_RED;
                    if (z12) {
                        float fB2 = !z11 ? ((f) jVar).f28912a : ((Vw.C2994q) v11.f29279o.get(0)).b(this);
                        List list2 = v11.f29280p;
                        fC = (list2 == null || list2.size() == 0) ? ((f) jVar).f28913b : ((Vw.C2994q) v11.f29280p.get(0)).c(this);
                        List list3 = v11.f29281q;
                        fB = (list3 == null || list3.size() == 0) ? 0.0f : ((Vw.C2994q) v11.f29281q.get(0)).b(this);
                        List list4 = v11.f29282r;
                        if (list4 != null && list4.size() != 0) {
                            fC2 = ((Vw.C2994q) v11.f29282r.get(0)).c(this);
                        }
                        f11 = fC2;
                        fC2 = fB2;
                    } else {
                        f11 = 0.0f;
                        fC = 0.0f;
                        fB = 0.0f;
                    }
                    if (z11 && (kVarD = d()) != DA.k.Start) {
                        float fA = a((Vw.Y) v11);
                        if (kVarD == DA.k.Middle) {
                            fA /= 2.0f;
                        }
                        fC2 -= fA;
                    }
                    b((Vw.K) v11.d());
                    if (z12) {
                        f fVar = (f) jVar;
                        fVar.f28912a = fC2 + fB;
                        fVar.f28913b = fC + f11;
                    }
                    boolean zM = m();
                    a((Vw.Y) v11, jVar);
                    if (zM) {
                        c((Vw.K) v11);
                    }
                }
                q();
                return;
            }
            if (n11 instanceof Vw.U) {
                r();
                Vw.U u11 = (Vw.U) n11;
                a(this.f28884d, u11);
                if (c()) {
                    b((Vw.K) u11.d());
                    Vw.N nC = n11.f29261a.c(u11.f29271o);
                    if (nC instanceof Vw.Y) {
                        StringBuilder sb2 = new StringBuilder();
                        a((Vw.Y) nC, sb2);
                        if (sb2.length() > 0) {
                            jVar.a(sb2.toString());
                        }
                    } else {
                        b("Tref reference '%s' not found", u11.f29271o);
                    }
                }
                q();
            }
        }
    }

    private void a(Vw.Z z11) {
        a("TextPath render", new Object[0]);
        a(this.f28884d, z11);
        if (c() && t()) {
            p();
            Vw.N nC = z11.f29261a.c(z11.f29275o);
            if (nC == null) {
                b("TextPath reference '%s' not found", z11.f29275o);
                return;
            }
            Vw.C3000w c3000w = (Vw.C3000w) nC;
            Path pathA = new d(c3000w.f29360o).a();
            Matrix matrix = c3000w.f29330n;
            if (matrix != null) {
                pathA.transform(matrix);
            }
            PathMeasure pathMeasure = new PathMeasure(pathA, false);
            Vw.C2994q c2994q = z11.f29276p;
            float fA = c2994q != null ? c2994q.a(this, pathMeasure.getLength()) : 0.0f;
            DA.k kVarD = d();
            if (kVarD != DA.k.Start) {
                float fA2 = a((Vw.Y) z11);
                if (kVarD == DA.k.Middle) {
                    fA2 /= 2.0f;
                }
                fA -= fA2;
            }
            b((Vw.K) z11.d());
            boolean zM = m();
            a((Vw.Y) z11, (j) new e(pathA, fA, BitmapDescriptorFactory.HUE_RED));
            if (zM) {
                c((Vw.K) z11);
            }
        }
    }

    private float a(Vw.Y y11) {
        k kVar = new k();
        a(y11, (j) kVar);
        return kVar.f28933a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float a(String str, Paint paint) {
        int length = str.length();
        float[] fArr = new float[length];
        paint.getTextWidths(str, fArr);
        float f11 = BitmapDescriptorFactory.HUE_RED;
        for (int i11 = 0; i11 < length; i11++) {
            f11 += fArr[i11];
        }
        return f11;
    }

    private void a(Vw.Y y11, StringBuilder sb2) {
        Iterator it = y11.f29240i.iterator();
        boolean z11 = true;
        while (it.hasNext()) {
            Vw.N n11 = (Vw.N) it.next();
            if (n11 instanceof Vw.Y) {
                a((Vw.Y) n11, sb2);
            } else if (n11 instanceof Vw.c0) {
                sb2.append(a(((Vw.c0) n11).f29288c, z11, !it.hasNext()));
            }
            z11 = false;
        }
    }

    private String a(String str, boolean z11, boolean z12) {
        if (this.f28884d.f28924f) {
            return f28874s.matcher(str).replaceAll(" ");
        }
        String strReplaceAll = f28876u.matcher(f28875t.matcher(str).replaceAll("")).replaceAll(" ");
        if (z11) {
            strReplaceAll = f28877v.matcher(strReplaceAll).replaceAll("");
        }
        if (z12) {
            strReplaceAll = f28878w.matcher(strReplaceAll).replaceAll("");
        }
        return f28879x.matcher(strReplaceAll).replaceAll(" ");
    }

    private void a(Vw.T t11, Vw.C2980c c2980c) {
        a("Symbol render", new Object[0]);
        if (c2980c.f29286c == BitmapDescriptorFactory.HUE_RED || c2980c.f29287d == BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        Ks ks2 = t11.f29263o;
        if (ks2 == null) {
            ks2 = Ks.f26654f;
        }
        a(this.f28884d, t11);
        h hVar = this.f28884d;
        hVar.f28922d = c2980c;
        if (!hVar.f28919a.f25347w.booleanValue()) {
            Vw.C2980c c2980c2 = this.f28884d.f28922d;
            b(c2980c2.f29284a, c2980c2.f29285b, c2980c2.f29286c, c2980c2.f29287d);
        }
        Vw.C2980c c2980c3 = t11.f29270p;
        if (c2980c3 != null) {
            this.f28881a.concat(a(this.f28884d.f28922d, c2980c3, ks2));
            this.f28884d.f28923e = t11.f29270p;
        } else {
            Canvas canvas = this.f28881a;
            Vw.C2980c c2980c4 = this.f28884d.f28922d;
            canvas.translate(c2980c4.f29284a, c2980c4.f29285b);
            this.f28884d.f28923e = null;
        }
        boolean zM = m();
        a((Vw.J) t11, true);
        if (zM) {
            c((Vw.K) t11);
        }
        d(t11);
    }

    private void a(Vw.C2993p c2993p) {
        Vw.C2994q c2994q;
        String str;
        a("Image render", new Object[0]);
        Vw.C2994q c2994q2 = c2993p.f29335s;
        if (c2994q2 == null || c2994q2.c() || (c2994q = c2993p.f29336t) == null || c2994q.c() || (str = c2993p.f29332p) == null) {
            return;
        }
        Ks ks2 = c2993p.f29263o;
        if (ks2 == null) {
            ks2 = Ks.f26654f;
        }
        Bitmap bitmapA = a(str);
        if (bitmapA == null) {
            return;
        }
        Vw.C2980c c2980c = new Vw.C2980c(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, bitmapA.getWidth(), bitmapA.getHeight());
        a(this.f28884d, c2993p);
        if (c() && t()) {
            Matrix matrix = c2993p.f29337u;
            if (matrix != null) {
                this.f28881a.concat(matrix);
            }
            Vw.C2994q c2994q3 = c2993p.f29333q;
            float fB = c2994q3 != null ? c2994q3.b(this) : 0.0f;
            Vw.C2994q c2994q4 = c2993p.f29334r;
            this.f28884d.f28922d = new Vw.C2980c(fB, c2994q4 != null ? c2994q4.c(this) : 0.0f, c2993p.f29335s.b(this), c2993p.f29336t.b(this));
            if (!this.f28884d.f28919a.f25347w.booleanValue()) {
                Vw.C2980c c2980c2 = this.f28884d.f28922d;
                b(c2980c2.f29284a, c2980c2.f29285b, c2980c2.f29286c, c2980c2.f29287d);
            }
            c2993p.f29251h = this.f28884d.f28922d;
            d(c2993p);
            a((Vw.K) c2993p);
            boolean zM = m();
            s();
            this.f28881a.save();
            this.f28881a.concat(a(this.f28884d.f28922d, c2980c, ks2));
            this.f28881a.drawBitmap(bitmapA, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new Paint(this.f28884d.f28919a.N != DA.j.optimizeSpeed ? 2 : 0));
            this.f28881a.restore();
            if (zM) {
                c((Vw.K) c2993p);
            }
        }
    }

    private Bitmap a(String str) {
        int iIndexOf;
        if (!str.startsWith("data:") || str.length() < 14 || (iIndexOf = str.indexOf(44)) < 12 || !";base64".equals(str.substring(iIndexOf - 7, iIndexOf))) {
            return null;
        }
        try {
            byte[] bArrDecode = Base64.decode(str.substring(iIndexOf + 1), 0);
            return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0075  */
    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0081  */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (r12 != 8) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.graphics.Matrix a(com.fourthline.orca.internal.Vw.C2980c r10, com.fourthline.orca.internal.Vw.C2980c r11, com.fourthline.orca.internal.Ks r12) {
        /*
            r9 = this;
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            if (r12 == 0) goto L9d
            com.fourthline.orca.internal.Ks$a r1 = r12.a()
            if (r1 != 0) goto Lf
            goto L9d
        Lf:
            float r1 = r10.f29286c
            float r2 = r11.f29286c
            float r1 = r1 / r2
            float r2 = r10.f29287d
            float r3 = r11.f29287d
            float r2 = r2 / r3
            float r3 = r11.f29284a
            float r3 = -r3
            float r4 = r11.f29285b
            float r4 = -r4
            com.fourthline.orca.internal.Ks r5 = com.fourthline.orca.internal.Ks.f26653e
            boolean r5 = r12.equals(r5)
            if (r5 == 0) goto L35
            float r11 = r10.f29284a
            float r10 = r10.f29285b
            r0.preTranslate(r11, r10)
            r0.preScale(r1, r2)
            r0.preTranslate(r3, r4)
            return r0
        L35:
            com.fourthline.orca.internal.Ks$b r5 = r12.b()
            com.fourthline.orca.internal.Ks$b r6 = com.fourthline.orca.internal.Ks.b.slice
            if (r5 != r6) goto L42
            float r1 = java.lang.Math.max(r1, r2)
            goto L46
        L42:
            float r1 = java.lang.Math.min(r1, r2)
        L46:
            float r2 = r10.f29286c
            float r2 = r2 / r1
            float r5 = r10.f29287d
            float r5 = r5 / r1
            int[] r6 = com.fourthline.orca.internal.Uw.a.f28890b
            com.fourthline.orca.internal.Ks$a r7 = r12.a()
            int r7 = r7.ordinal()
            r7 = r6[r7]
            r8 = 1073741824(0x40000000, float:2.0)
            switch(r7) {
                case 1: goto L63;
                case 2: goto L63;
                case 3: goto L63;
                case 4: goto L5e;
                case 5: goto L5e;
                case 6: goto L5e;
                default: goto L5d;
            }
        L5d:
            goto L68
        L5e:
            float r7 = r11.f29286c
            float r7 = r7 - r2
        L61:
            float r3 = r3 - r7
            goto L68
        L63:
            float r7 = r11.f29286c
            float r7 = r7 - r2
            float r7 = r7 / r8
            goto L61
        L68:
            com.fourthline.orca.internal.Ks$a r12 = r12.a()
            int r12 = r12.ordinal()
            r12 = r6[r12]
            r2 = 2
            if (r12 == r2) goto L8b
            r2 = 3
            if (r12 == r2) goto L86
            r2 = 5
            if (r12 == r2) goto L8b
            r2 = 6
            if (r12 == r2) goto L86
            r2 = 7
            if (r12 == r2) goto L8b
            r2 = 8
            if (r12 == r2) goto L86
            goto L90
        L86:
            float r11 = r11.f29287d
            float r11 = r11 - r5
        L89:
            float r4 = r4 - r11
            goto L90
        L8b:
            float r11 = r11.f29287d
            float r11 = r11 - r5
            float r11 = r11 / r8
            goto L89
        L90:
            float r11 = r10.f29284a
            float r10 = r10.f29285b
            r0.preTranslate(r11, r10)
            r0.preScale(r1, r1)
            r0.preTranslate(r3, r4)
        L9d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.Uw.a(com.fourthline.orca.internal.Vw$c, com.fourthline.orca.internal.Vw$c, com.fourthline.orca.internal.Ks):android.graphics.Matrix");
    }

    private boolean a(DA da2, long j11) {
        return (da2.f25322a & j11) != 0;
    }

    private void a(h hVar, DA da2) {
        Float fValueOf = Float.valueOf(700.0f);
        Float fValueOf2 = Float.valueOf(400.0f);
        if (a(da2, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF)) {
            hVar.f28919a.f25338n = da2.f25338n;
        }
        if (a(da2, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX)) {
            hVar.f28919a.f25337m = da2.f25337m;
        }
        if (a(da2, 1L)) {
            hVar.f28919a.f25324b = da2.f25324b;
            Vw.O o11 = da2.f25324b;
            hVar.f28920b = (o11 == null || o11 == Vw.C2984g.f29314c) ? false : true;
        }
        if (a(da2, 4L)) {
            hVar.f28919a.f25328d = da2.f25328d;
        }
        if (a(da2, 6149L)) {
            a(hVar, true, hVar.f28919a.f25324b);
        }
        if (a(da2, 2L)) {
            hVar.f28919a.f25326c = da2.f25326c;
        }
        if (a(da2, 8L)) {
            hVar.f28919a.f25329e = da2.f25329e;
            Vw.O o12 = da2.f25329e;
            hVar.f28921c = (o12 == null || o12 == Vw.C2984g.f29314c) ? false : true;
        }
        if (a(da2, 16L)) {
            hVar.f28919a.f25330f = da2.f25330f;
        }
        if (a(da2, 6168L)) {
            a(hVar, false, hVar.f28919a.f25329e);
        }
        if (a(da2, 34359738368L)) {
            hVar.f28919a.M = da2.M;
        }
        if (a(da2, 32L)) {
            DA da3 = hVar.f28919a;
            Vw.C2994q c2994q = da2.f25331g;
            da3.f25331g = c2994q;
            hVar.f28926h.setStrokeWidth(c2994q.a(this));
        }
        if (a(da2, 64L)) {
            hVar.f28919a.f25332h = da2.f25332h;
            int i11 = a.f28891c[da2.f25332h.ordinal()];
            if (i11 == 1) {
                hVar.f28926h.setStrokeCap(Paint.Cap.BUTT);
            } else if (i11 == 2) {
                hVar.f28926h.setStrokeCap(Paint.Cap.ROUND);
            } else if (i11 == 3) {
                hVar.f28926h.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (a(da2, 128L)) {
            hVar.f28919a.f25333i = da2.f25333i;
            int i12 = a.f28892d[da2.f25333i.ordinal()];
            if (i12 == 1) {
                hVar.f28926h.setStrokeJoin(Paint.Join.MITER);
            } else if (i12 == 2) {
                hVar.f28926h.setStrokeJoin(Paint.Join.ROUND);
            } else if (i12 == 3) {
                hVar.f28926h.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (a(da2, 256L)) {
            hVar.f28919a.f25334j = da2.f25334j;
            hVar.f28926h.setStrokeMiter(da2.f25334j.floatValue());
        }
        if (a(da2, 512L)) {
            hVar.f28919a.f25335k = da2.f25335k;
        }
        if (a(da2, 1024L)) {
            hVar.f28919a.f25336l = da2.f25336l;
        }
        if (a(da2, 1536L)) {
            Vw.C2994q[] c2994qArr = hVar.f28919a.f25335k;
            if (c2994qArr == null) {
                hVar.f28926h.setPathEffect(null);
            } else {
                int length = c2994qArr.length;
                int i13 = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i13];
                float f11 = 0.0f;
                for (int i14 = 0; i14 < i13; i14++) {
                    float fA = hVar.f28919a.f25335k[i14 % length].a(this);
                    fArr[i14] = fA;
                    f11 += fA;
                }
                if (f11 == BitmapDescriptorFactory.HUE_RED) {
                    hVar.f28926h.setPathEffect(null);
                } else {
                    float fA2 = hVar.f28919a.f25336l.a(this);
                    if (fA2 < BitmapDescriptorFactory.HUE_RED) {
                        fA2 = (fA2 % f11) + f11;
                    }
                    hVar.f28926h.setPathEffect(new DashPathEffect(fArr, fA2));
                }
            }
        }
        if (a(da2, Http2Stream.EMIT_BUFFER_SIZE)) {
            float f12 = f();
            hVar.f28919a.f25340p = da2.f25340p;
            hVar.f28925g.setTextSize(da2.f25340p.a(this, f12));
            hVar.f28926h.setTextSize(da2.f25340p.a(this, f12));
        }
        if (a(da2, FileAppender.DEFAULT_BUFFER_SIZE)) {
            hVar.f28919a.f25339o = da2.f25339o;
        }
        if (a(da2, 32768L)) {
            if (da2.f25341q.floatValue() == Float.MIN_VALUE) {
                float fFloatValue = hVar.f28919a.f25341q.floatValue();
                if (fFloatValue >= 100.0f && fFloatValue < 550.0f) {
                    hVar.f28919a.f25341q = Float.valueOf(100.0f);
                } else if (fFloatValue >= 550.0f && fFloatValue < 750.0f) {
                    hVar.f28919a.f25341q = fValueOf2;
                } else if (fFloatValue >= 750.0f) {
                    hVar.f28919a.f25341q = fValueOf;
                }
            } else if (da2.f25341q.floatValue() == Float.MAX_VALUE) {
                float fFloatValue2 = hVar.f28919a.f25341q.floatValue();
                if (fFloatValue2 < 350.0f) {
                    hVar.f28919a.f25341q = fValueOf2;
                } else if (fFloatValue2 >= 350.0f && fFloatValue2 < 550.0f) {
                    hVar.f28919a.f25341q = fValueOf;
                } else if (fFloatValue2 >= 550.0f && fFloatValue2 < 900.0f) {
                    hVar.f28919a.f25341q = Float.valueOf(900.0f);
                }
            } else {
                hVar.f28919a.f25341q = da2.f25341q;
            }
        }
        if (a(da2, 65536L)) {
            hVar.f28919a.f25342r = da2.f25342r;
        }
        if (a(da2, 2251799813685248L)) {
            hVar.f28919a.f25343s = da2.f25343s;
        }
        if (a(da2, 131072L)) {
            hVar.f28919a.f25344t = da2.f25344t;
            Paint paint = hVar.f28925g;
            DA.l lVar = da2.f25344t;
            DA.l lVar2 = DA.l.LineThrough;
            paint.setStrikeThruText(lVar == lVar2);
            Paint paint2 = hVar.f28925g;
            DA.l lVar3 = da2.f25344t;
            DA.l lVar4 = DA.l.Underline;
            paint2.setUnderlineText(lVar3 == lVar4);
            if (f28865j) {
                hVar.f28926h.setStrikeThruText(da2.f25344t == lVar2);
                hVar.f28926h.setUnderlineText(da2.f25344t == lVar4);
            }
        }
        if (a(da2, 68719476736L)) {
            hVar.f28919a.f25345u = da2.f25345u;
        }
        if (a(da2, 262144L)) {
            hVar.f28919a.f25346v = da2.f25346v;
        }
        if (a(da2, 524288L)) {
            hVar.f28919a.f25347w = da2.f25347w;
        }
        if (a(da2, 2097152L)) {
            hVar.f28919a.f25349y = da2.f25349y;
        }
        if (a(da2, 4194304L)) {
            hVar.f28919a.f25350z = da2.f25350z;
        }
        if (a(da2, 8388608L)) {
            hVar.f28919a.A = da2.A;
        }
        if (a(da2, 16777216L)) {
            hVar.f28919a.B = da2.B;
        }
        if (a(da2, 33554432L)) {
            hVar.f28919a.C = da2.C;
        }
        if (a(da2, 1048576L)) {
            hVar.f28919a.f25348x = da2.f25348x;
        }
        if (a(da2, 268435456L)) {
            hVar.f28919a.F = da2.F;
        }
        if (a(da2, 536870912L)) {
            hVar.f28919a.G = da2.G;
        }
        if (a(da2, FileSize.GB_COEFFICIENT)) {
            hVar.f28919a.H = da2.H;
        }
        if (a(da2, 67108864L)) {
            hVar.f28919a.D = da2.D;
        }
        if (a(da2, 134217728L)) {
            hVar.f28919a.E = da2.E;
        }
        if (a(da2, 8589934592L)) {
            hVar.f28919a.K = da2.K;
        }
        if (a(da2, 17179869184L)) {
            hVar.f28919a.L = da2.L;
        }
        if (a(da2, 137438953472L)) {
            hVar.f28919a.N = da2.N;
        }
        if (a(da2, 274877906944L)) {
            hVar.f28919a.O = da2.O;
        }
        if (a(da2, 549755813888L)) {
            hVar.f28919a.P = da2.P;
        }
        if (a(da2, 562949953421312L)) {
            hVar.f28919a.Q = da2.Q;
            hVar.f28927i.a(da2.Q);
        }
        if (a(da2, 35184372088832L)) {
            hVar.f28919a.W = da2.W;
            hVar.f28927i.a(da2.W);
        }
        if (a(da2, 1099511627776L)) {
            hVar.f28919a.R = da2.R;
            hVar.f28927i.a(da2.R);
        }
        if (a(da2, 2199023255552L)) {
            hVar.f28919a.S = da2.S;
            hVar.f28927i.a(da2.S);
        }
        if (a(da2, 4398046511104L)) {
            hVar.f28919a.T = da2.T;
            hVar.f28927i.a(da2.T);
        }
        if (a(da2, 8796093022208L)) {
            hVar.f28919a.U = da2.U;
            hVar.f28927i.a(da2.U);
        }
        if (a(da2, 17592186044416L)) {
            hVar.f28919a.V = da2.V;
            hVar.f28927i.a(da2.V);
        }
        if (f28869n && a(da2, 1125899906842624L)) {
            hVar.f28919a.X = da2.X;
            hVar.f28928j.a(da2.X);
        }
        if (a(da2, 70368744177664L)) {
            hVar.f28919a.Y = da2.Y;
        }
        if (a(da2, 140737488355328L)) {
            hVar.f28919a.Z = da2.Z;
        }
        if (a(da2, 281474976710656L)) {
            hVar.f28919a.f25323a0 = da2.f25323a0;
        }
        if (a(da2, 4503599627370496L)) {
            hVar.f28919a.f25325b0 = da2.f25325b0;
            if (f28868m) {
                hVar.f28925g.setLetterSpacing(da2.f25325b0.a(this) / f());
                hVar.f28926h.setLetterSpacing(da2.f25325b0.a(this) / f());
            }
        }
        if (a(da2, 9007199254740992L)) {
            hVar.f28919a.f25327c0 = da2.f25327c0;
            if (f28871p) {
                hVar.f28925g.setWordSpacing(da2.f25327c0.a(this));
                hVar.f28926h.setWordSpacing(da2.f25327c0.a(this));
            }
        }
    }

    private void a(h hVar, boolean z11, Vw.O o11) {
        int i11;
        float fFloatValue = (z11 ? hVar.f28919a.f25328d : hVar.f28919a.f25330f).floatValue();
        if (o11 instanceof Vw.C2984g) {
            i11 = ((Vw.C2984g) o11).f29315a;
        } else if (!(o11 instanceof Vw.C2985h)) {
            return;
        } else {
            i11 = hVar.f28919a.f25338n.f29315a;
        }
        int iA = a(i11, fFloatValue);
        if (z11) {
            hVar.f28925g.setColor(iA);
        } else {
            hVar.f28926h.setColor(iA);
        }
    }

    private Typeface a(String str, Float f11, DA.e eVar) {
        int i11;
        boolean z11 = eVar == DA.e.italic;
        if (f11.floatValue() >= 700.0f) {
            i11 = z11 ? 3 : 1;
        } else {
            i11 = z11 ? 2 : 0;
        }
        str.getClass();
        switch (str) {
            case "sans-serif":
            case "fantasy":
            case "cursive":
                return Typeface.create(Typeface.SANS_SERIF, i11);
            case "monospace":
                return Typeface.create(Typeface.MONOSPACE, i11);
            case "serif":
                return Typeface.create(Typeface.SERIF, i11);
            default:
                return null;
        }
    }

    private static int a(float f11) {
        int i11 = (int) (f11 * 256.0f);
        if (i11 < 0) {
            return 0;
        }
        return Math.min(i11, 255);
    }

    private static int a(int i11, float f11) {
        int iRound = Math.round(((i11 >> 24) & 255) * f11);
        return (i11 & 16777215) | ((iRound < 0 ? 0 : Math.min(iRound, 255)) << 24);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(float f11, float f12, float f13, float f14, float f15, boolean z11, boolean z12, float f16, float f17, Vw.InterfaceC3002y interfaceC3002y) {
        float f18 = f16;
        if (f11 == f18 && f12 == f17) {
            return;
        }
        if (f13 == BitmapDescriptorFactory.HUE_RED) {
            f18 = f16;
        } else if (f14 != BitmapDescriptorFactory.HUE_RED) {
            float fAbs = Math.abs(f13);
            float fAbs2 = Math.abs(f14);
            double radians = Math.toRadians(((double) f15) % 360.0d);
            double dCos = Math.cos(radians);
            double dSin = Math.sin(radians);
            double d11 = ((double) (f11 - f18)) / 2.0d;
            double d12 = ((double) (f12 - f17)) / 2.0d;
            double d13 = (dCos * d11) + (dSin * d12);
            double d14 = ((-dSin) * d11) + (d12 * dCos);
            double d15 = fAbs * fAbs;
            double d16 = fAbs2 * fAbs2;
            double d17 = d13 * d13;
            double d18 = d14 * d14;
            double d19 = (d17 / d15) + (d18 / d16);
            if (d19 > 0.99999d) {
                double dSqrt = Math.sqrt(d19) * 1.00001d;
                fAbs = (float) (((double) fAbs) * dSqrt);
                fAbs2 = (float) (dSqrt * ((double) fAbs2));
                d15 = fAbs * fAbs;
                d16 = fAbs2 * fAbs2;
            }
            double d21 = z11 == z12 ? -1.0d : 1.0d;
            double d22 = d15 * d16;
            double d23 = d15 * d18;
            double d24 = d16 * d17;
            double d25 = ((d22 - d23) - d24) / (d23 + d24);
            if (d25 < 0.0d) {
                d25 = 0.0d;
            }
            double dSqrt2 = d21 * Math.sqrt(d25);
            double d26 = fAbs;
            double d27 = fAbs2;
            double d28 = ((d26 * d14) / d27) * dSqrt2;
            double d29 = dSqrt2 * (-((d27 * d13) / d26));
            double d31 = (((double) (f11 + f18)) / 2.0d) + ((dCos * d28) - (dSin * d29));
            double d32 = (((double) (f12 + f17)) / 2.0d) + (dSin * d28) + (dCos * d29);
            double d33 = (d13 - d28) / d26;
            double d34 = (d14 - d29) / d27;
            double d35 = ((-d13) - d28) / d26;
            double d36 = ((-d14) - d29) / d27;
            double d37 = (d33 * d33) + (d34 * d34);
            double dAcos = (d34 < 0.0d ? -1.0d : 1.0d) * Math.acos(d33 / Math.sqrt(d37));
            double dA = ((d33 * d36) - (d34 * d35) < 0.0d ? -1.0d : 1.0d) * a(((d33 * d35) + (d34 * d36)) / Math.sqrt(d37 * ((d35 * d35) + (d36 * d36))));
            if (dA == 0.0d) {
                interfaceC3002y.lineTo(f18, f17);
                return;
            }
            if (!z12 && dA > 0.0d) {
                dA -= 6.283185307179586d;
            } else if (z12 && dA < 0.0d) {
                dA += 6.283185307179586d;
            }
            float[] fArrA = a(dAcos % 6.283185307179586d, dA % 6.283185307179586d);
            Matrix matrix = new Matrix();
            matrix.postScale(fAbs, fAbs2);
            matrix.postRotate(f15);
            matrix.postTranslate((float) d31, (float) d32);
            matrix.mapPoints(fArrA);
            fArrA[fArrA.length - 2] = f16;
            fArrA[fArrA.length - 1] = f17;
            for (int i11 = 0; i11 < fArrA.length; i11 += 6) {
                interfaceC3002y.cubicTo(fArrA[i11], fArrA[i11 + 1], fArrA[i11 + 2], fArrA[i11 + 3], fArrA[i11 + 4], fArrA[i11 + 5]);
            }
            return;
        }
        interfaceC3002y.lineTo(f18, f17);
    }

    private static double a(double d11) {
        if (d11 < -1.0d) {
            return 3.141592653589793d;
        }
        if (d11 > 1.0d) {
            return 0.0d;
        }
        return Math.acos(d11);
    }

    private static float[] a(double d11, double d12) {
        int iCeil = (int) Math.ceil((Math.abs(d12) * 2.0d) / 3.141592653589793d);
        double d13 = d12 / ((double) iCeil);
        double d14 = d13 / 2.0d;
        double dSin = (Math.sin(d14) * 1.3333333333333333d) / (Math.cos(d14) + 1.0d);
        float[] fArr = new float[iCeil * 6];
        int i11 = 0;
        int i12 = 0;
        while (i11 < iCeil) {
            double d15 = d11 + (((double) i11) * d13);
            double dCos = Math.cos(d15);
            double dSin2 = Math.sin(d15);
            float[] fArr2 = fArr;
            fArr2[i12] = (float) (dCos - (dSin * dSin2));
            fArr2[i12 + 1] = (float) (dSin2 + (dCos * dSin));
            double d16 = d15 + d13;
            double dCos2 = Math.cos(d16);
            double dSin3 = Math.sin(d16);
            fArr2[i12 + 2] = (float) ((dSin * dSin3) + dCos2);
            fArr2[i12 + 3] = (float) (dSin3 - (dSin * dCos2));
            int i13 = i12 + 5;
            fArr2[i12 + 4] = (float) dCos2;
            i12 += 6;
            fArr2[i13] = (float) dSin3;
            i11++;
            fArr = fArr2;
            iCeil = iCeil;
        }
        return fArr;
    }

    private void a(Vw.AbstractC2990m abstractC2990m) {
        Vw.C2996s c2996s;
        Vw.C2996s c2996s2;
        Vw.C2996s c2996s3;
        List listA;
        int size;
        DA da2 = this.f28884d.f28919a;
        String str = da2.f25349y;
        if (str == null && da2.f25350z == null && da2.A == null) {
            return;
        }
        if (str == null) {
            c2996s = null;
        } else {
            Vw.N nC = abstractC2990m.f29261a.c(str);
            if (nC != null) {
                c2996s = (Vw.C2996s) nC;
            } else {
                b("Marker reference '%s' not found", this.f28884d.f28919a.f25349y);
                c2996s = null;
            }
        }
        String str2 = this.f28884d.f28919a.f25350z;
        if (str2 == null) {
            c2996s2 = null;
        } else {
            Vw.N nC2 = abstractC2990m.f29261a.c(str2);
            if (nC2 != null) {
                c2996s2 = (Vw.C2996s) nC2;
            } else {
                b("Marker reference '%s' not found", this.f28884d.f28919a.f25350z);
                c2996s2 = null;
            }
        }
        String str3 = this.f28884d.f28919a.A;
        if (str3 == null) {
            c2996s3 = null;
        } else {
            Vw.N nC3 = abstractC2990m.f29261a.c(str3);
            if (nC3 != null) {
                c2996s3 = (Vw.C2996s) nC3;
            } else {
                b("Marker reference '%s' not found", this.f28884d.f28919a.A);
                c2996s3 = null;
            }
        }
        if (abstractC2990m instanceof Vw.C3000w) {
            listA = new b(((Vw.C3000w) abstractC2990m).f29360o).a();
        } else if (abstractC2990m instanceof Vw.C2995r) {
            listA = a((Vw.C2995r) abstractC2990m);
        } else {
            listA = a((Vw.A) abstractC2990m);
        }
        if (listA == null || (size = listA.size()) == 0) {
            return;
        }
        DA da3 = this.f28884d.f28919a;
        da3.A = null;
        da3.f25350z = null;
        da3.f25349y = null;
        if (c2996s != null) {
            a(c2996s, (c) listA.get(0));
        }
        if (c2996s2 != null && listA.size() > 2) {
            c cVarA = (c) listA.get(0);
            c cVar = (c) listA.get(1);
            int i11 = 1;
            while (i11 < size - 1) {
                i11++;
                c cVar2 = (c) listA.get(i11);
                cVarA = cVar.f28906e ? a(cVarA, cVar, cVar2) : cVar;
                a(c2996s2, cVarA);
                cVar = cVar2;
            }
        }
        if (c2996s3 != null) {
            a(c2996s3, (c) listA.get(size - 1));
        }
    }

    private c a(c cVar, c cVar2, c cVar3) {
        float fA = a(cVar2.f28904c, cVar2.f28905d, cVar2.f28902a - cVar.f28902a, cVar2.f28903b - cVar.f28903b);
        if (fA == BitmapDescriptorFactory.HUE_RED) {
            fA = a(cVar2.f28904c, cVar2.f28905d, cVar3.f28902a - cVar2.f28902a, cVar3.f28903b - cVar2.f28903b);
        }
        if (fA > BitmapDescriptorFactory.HUE_RED || (fA == BitmapDescriptorFactory.HUE_RED && (cVar2.f28904c > BitmapDescriptorFactory.HUE_RED || cVar2.f28905d >= BitmapDescriptorFactory.HUE_RED))) {
            return cVar2;
        }
        cVar2.f28904c = -cVar2.f28904c;
        cVar2.f28905d = -cVar2.f28905d;
        return cVar2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0101, code lost:
    
        if (r7 != 8) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.fourthline.orca.internal.Vw.C2996s r12, com.fourthline.orca.internal.Uw.c r13) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.Uw.a(com.fourthline.orca.internal.Vw$s, com.fourthline.orca.internal.Uw$c):void");
    }

    private h a(Vw.N n11, h hVar) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (n11 instanceof Vw.L) {
                arrayList.add(0, (Vw.L) n11);
            }
            Object obj = n11.f29262b;
            if (obj == null) {
                break;
            }
            n11 = (Vw.N) obj;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a(hVar, (Vw.L) it.next());
        }
        h hVar2 = this.f28884d;
        hVar.f28923e = hVar2.f28923e;
        hVar.f28922d = hVar2.f28922d;
        return hVar;
    }

    private void a(boolean z11, Vw.C2980c c2980c, Vw.C2999v c2999v) {
        Vw.N nC = this.f28883c.c(c2999v.f29358a);
        if (nC == null) {
            b("%s reference '%s' not found", z11 ? "Fill" : "Stroke", c2999v.f29358a);
            Vw.O o11 = c2999v.f29359b;
            if (o11 != null) {
                a(this.f28884d, z11, o11);
                return;
            } else if (z11) {
                this.f28884d.f28920b = false;
                return;
            } else {
                this.f28884d.f28921c = false;
                return;
            }
        }
        if (nC instanceof Vw.M) {
            a(z11, c2980c, (Vw.M) nC);
        } else if (nC instanceof Vw.Q) {
            a(z11, c2980c, (Vw.Q) nC);
        } else if (nC instanceof Vw.D) {
            a(z11, (Vw.D) nC);
        }
    }

    private void a(boolean z11, Vw.C2980c c2980c, Vw.M m11) {
        float fA;
        float fC;
        float fB;
        float f11;
        float fC2;
        float f12;
        float f13;
        int i11;
        String str = m11.f29325l;
        if (str != null) {
            a(m11, str);
        }
        Boolean bool = m11.f29322i;
        int i12 = 0;
        boolean z12 = bool != null && bool.booleanValue();
        Paint paint = z11 ? this.f28884d.f28925g : this.f28884d.f28926h;
        if (z12) {
            Vw.C2994q c2994q = m11.f29257m;
            fA = c2994q != null ? c2994q.b(this) : BitmapDescriptorFactory.HUE_RED;
            Vw.C2994q c2994q2 = m11.f29258n;
            fC = c2994q2 != null ? c2994q2.c(this) : BitmapDescriptorFactory.HUE_RED;
            Vw.C2994q c2994q3 = m11.f29259o;
            if (c2994q3 == null) {
                c2994q3 = Vw.C2994q.f29339d;
            }
            fB = c2994q3.b(this);
            Vw.C2994q c2994q4 = m11.f29260p;
            if (c2994q4 != null) {
                f11 = fA;
                f12 = fC;
                f13 = fB;
                fC2 = c2994q4.c(this);
            } else {
                f11 = fA;
                f12 = fC;
                f13 = fB;
                fC2 = BitmapDescriptorFactory.HUE_RED;
            }
        } else {
            Vw.C2994q c2994q5 = m11.f29257m;
            fA = c2994q5 != null ? c2994q5.a(this, 1.0f) : BitmapDescriptorFactory.HUE_RED;
            Vw.C2994q c2994q6 = m11.f29258n;
            float fA2 = c2994q6 != null ? c2994q6.a(this, 1.0f) : BitmapDescriptorFactory.HUE_RED;
            Vw.C2994q c2994q7 = m11.f29259o;
            float fA3 = c2994q7 != null ? c2994q7.a(this, 1.0f) : 1.0f;
            Vw.C2994q c2994q8 = m11.f29260p;
            if (c2994q8 != null) {
                float fA4 = c2994q8.a(this, 1.0f);
                f11 = fA;
                fC2 = fA4;
                f12 = fA2;
                f13 = fA3;
            } else {
                fC = fA2;
                fB = fA3;
                f11 = fA;
                f12 = fC;
                f13 = fB;
                fC2 = BitmapDescriptorFactory.HUE_RED;
            }
        }
        r();
        this.f28884d = b(m11);
        Matrix matrix = new Matrix();
        if (!z12) {
            matrix.preTranslate(c2980c.f29284a, c2980c.f29285b);
            matrix.preScale(c2980c.f29286c, c2980c.f29287d);
        }
        Matrix matrix2 = m11.f29323j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = m11.f29321h.size();
        if (size == 0) {
            q();
            if (z11) {
                this.f28884d.f28920b = false;
                return;
            } else {
                this.f28884d.f28921c = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        Iterator it = m11.f29321h.iterator();
        float f14 = -1.0f;
        while (it.hasNext()) {
            Vw.E e11 = (Vw.E) ((Vw.N) it.next());
            Float f15 = e11.f29234h;
            float fFloatValue = f15 != null ? f15.floatValue() : BitmapDescriptorFactory.HUE_RED;
            if (i12 != 0 && fFloatValue < f14) {
                fArr[i12] = f14;
            } else {
                fArr[i12] = fFloatValue;
                f14 = fFloatValue;
            }
            r();
            a(this.f28884d, e11);
            DA da2 = this.f28884d.f28919a;
            Vw.C2984g c2984g = (Vw.C2984g) da2.D;
            if (c2984g == null) {
                c2984g = Vw.C2984g.f29313b;
            }
            iArr[i12] = a(c2984g.f29315a, da2.E.floatValue());
            i12++;
            q();
        }
        if (f11 == f13 && f12 == fC2) {
            i11 = 1;
        } else {
            i11 = 1;
            if (size != 1) {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                Vw.EnumC2989l enumC2989l = m11.f29324k;
                if (enumC2989l != null) {
                    if (enumC2989l == Vw.EnumC2989l.reflect) {
                        tileMode = Shader.TileMode.MIRROR;
                    } else if (enumC2989l == Vw.EnumC2989l.repeat) {
                        tileMode = Shader.TileMode.REPEAT;
                    }
                }
                Shader.TileMode tileMode2 = tileMode;
                q();
                LinearGradient linearGradient = new LinearGradient(f11, f12, f13, fC2, iArr, fArr, tileMode2);
                linearGradient.setLocalMatrix(matrix);
                paint.setShader(linearGradient);
                paint.setAlpha(a(this.f28884d.f28919a.f25328d.floatValue()));
                return;
            }
        }
        q();
        paint.setColor(iArr[size - i11]);
    }

    private void a(boolean z11, Vw.C2980c c2980c, Vw.Q q11) {
        float f11;
        float f12;
        float f13;
        float fA;
        float fB;
        float fA2;
        float fC;
        float fC2;
        float fB2;
        float fA3;
        long[] jArr;
        RadialGradient radialGradient;
        String str = q11.f29325l;
        if (str != null) {
            a(q11, str);
        }
        Boolean bool = q11.f29322i;
        int i11 = 0;
        boolean z12 = bool != null && bool.booleanValue();
        Paint paint = z11 ? this.f28884d.f28925g : this.f28884d.f28926h;
        if (z12) {
            Vw.C2994q c2994q = new Vw.C2994q(50.0f, Vw.d0.percent);
            Vw.C2994q c2994q2 = q11.f29264m;
            fB = c2994q2 != null ? c2994q2.b(this) : c2994q.b(this);
            Vw.C2994q c2994q3 = q11.f29265n;
            fC2 = c2994q3 != null ? c2994q3.c(this) : c2994q.c(this);
            Vw.C2994q c2994q4 = q11.f29266o;
            fA2 = c2994q4 != null ? c2994q4.a(this) : c2994q.a(this);
            if (f28873r) {
                Vw.C2994q c2994q5 = q11.f29267p;
                fB2 = c2994q5 != null ? c2994q5.b(this) : fB;
                Vw.C2994q c2994q6 = q11.f29268q;
                fC = c2994q6 != null ? c2994q6.c(this) : fC2;
                Vw.C2994q c2994q7 = q11.f29269r;
                if (c2994q7 != null) {
                    f13 = fA2;
                    f11 = fB;
                    f12 = fC2;
                    fA3 = c2994q7.a(this);
                    fA = fB2;
                } else {
                    f13 = fA2;
                    f11 = fB;
                    f12 = fC2;
                    fA = fB2;
                    fA3 = BitmapDescriptorFactory.HUE_RED;
                }
            } else {
                f13 = fA2;
                f11 = fB;
                f12 = fC2;
                fA3 = BitmapDescriptorFactory.HUE_RED;
                fC = BitmapDescriptorFactory.HUE_RED;
                fA = BitmapDescriptorFactory.HUE_RED;
            }
        } else {
            Vw.C2994q c2994q8 = q11.f29264m;
            float fA4 = c2994q8 != null ? c2994q8.a(this, 1.0f) : 0.5f;
            Vw.C2994q c2994q9 = q11.f29265n;
            float fA5 = c2994q9 != null ? c2994q9.a(this, 1.0f) : 0.5f;
            Vw.C2994q c2994q10 = q11.f29266o;
            float fA6 = c2994q10 != null ? c2994q10.a(this, 1.0f) : 0.5f;
            if (f28873r) {
                Vw.C2994q c2994q11 = q11.f29267p;
                fA = c2994q11 != null ? c2994q11.a(this, 1.0f) : 0.5f;
                Vw.C2994q c2994q12 = q11.f29268q;
                float fA7 = c2994q12 != null ? c2994q12.a(this, 1.0f) : 0.5f;
                Vw.C2994q c2994q13 = q11.f29269r;
                if (c2994q13 != null) {
                    fA3 = c2994q13.a(this, 1.0f);
                    f11 = fA4;
                    f12 = fA5;
                    f13 = fA6;
                    fC = fA7;
                } else {
                    float f14 = fA7;
                    fB = fA4;
                    fA2 = fA6;
                    fC = f14;
                    fC2 = fA5;
                    fB2 = fA;
                    f13 = fA2;
                    f11 = fB;
                    f12 = fC2;
                    fA = fB2;
                    fA3 = BitmapDescriptorFactory.HUE_RED;
                }
            } else {
                f11 = fA4;
                f12 = fA5;
                f13 = fA6;
                fA3 = BitmapDescriptorFactory.HUE_RED;
                fC = BitmapDescriptorFactory.HUE_RED;
                fA = BitmapDescriptorFactory.HUE_RED;
            }
        }
        r();
        this.f28884d = b(q11);
        Matrix matrix = new Matrix();
        if (!z12) {
            matrix.preTranslate(c2980c.f29284a, c2980c.f29285b);
            matrix.preScale(c2980c.f29286c, c2980c.f29287d);
        }
        Matrix matrix2 = q11.f29323j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = q11.f29321h.size();
        if (size == 0) {
            q();
            if (z11) {
                this.f28884d.f28920b = false;
                return;
            } else {
                this.f28884d.f28921c = false;
                return;
            }
        }
        int[] iArr = null;
        if (f28873r) {
            jArr = new long[size];
        } else {
            jArr = null;
            iArr = new int[size];
        }
        float[] fArr = new float[size];
        Iterator it = q11.f29321h.iterator();
        float f15 = -1.0f;
        while (it.hasNext()) {
            Vw.E e11 = (Vw.E) ((Vw.N) it.next());
            Float f16 = e11.f29234h;
            float fFloatValue = f16 != null ? f16.floatValue() : 0.0f;
            if (i11 != 0 && fFloatValue < f15) {
                fArr[i11] = f15;
            } else {
                fArr[i11] = fFloatValue;
                f15 = fFloatValue;
            }
            r();
            a(this.f28884d, e11);
            DA da2 = this.f28884d.f28919a;
            Vw.C2984g c2984g = (Vw.C2984g) da2.D;
            if (c2984g == null) {
                c2984g = Vw.C2984g.f29313b;
            }
            if (f28873r) {
                jArr[i11] = Color.pack(a(c2984g.f29315a, da2.E.floatValue()));
            } else {
                iArr[i11] = a(c2984g.f29315a, da2.E.floatValue());
            }
            i11++;
            q();
        }
        if (f13 != BitmapDescriptorFactory.HUE_RED && size != 1) {
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            Vw.EnumC2989l enumC2989l = q11.f29324k;
            if (enumC2989l != null) {
                if (enumC2989l == Vw.EnumC2989l.reflect) {
                    tileMode = Shader.TileMode.MIRROR;
                } else if (enumC2989l == Vw.EnumC2989l.repeat) {
                    tileMode = Shader.TileMode.REPEAT;
                }
            }
            Shader.TileMode tileMode2 = tileMode;
            q();
            if (f28873r) {
                radialGradient = lr0.a(fA, fC, fA3, f11, f12, f13, jArr, fArr, tileMode2);
            } else {
                radialGradient = new RadialGradient(f11, f12, f13, iArr, fArr, tileMode2);
            }
            radialGradient.setLocalMatrix(matrix);
            paint.setShader(radialGradient);
            paint.setAlpha(a(this.f28884d.f28919a.f25328d.floatValue()));
            return;
        }
        int[] iArr2 = iArr;
        q();
        paint.setColor(iArr2[size - 1]);
    }

    private void a(Vw.AbstractC2988k abstractC2988k, String str) {
        Vw.N nC = abstractC2988k.f29261a.c(str);
        if (nC == null) {
            c("Gradient reference '%s' not found", str);
            return;
        }
        if (!(nC instanceof Vw.AbstractC2988k)) {
            b("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (nC == abstractC2988k) {
            b("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        Vw.AbstractC2988k abstractC2988k2 = (Vw.AbstractC2988k) nC;
        if (abstractC2988k.f29322i == null) {
            abstractC2988k.f29322i = abstractC2988k2.f29322i;
        }
        if (abstractC2988k.f29323j == null) {
            abstractC2988k.f29323j = abstractC2988k2.f29323j;
        }
        if (abstractC2988k.f29324k == null) {
            abstractC2988k.f29324k = abstractC2988k2.f29324k;
        }
        if (abstractC2988k.f29321h.isEmpty()) {
            abstractC2988k.f29321h = abstractC2988k2.f29321h;
        }
        try {
            if (abstractC2988k instanceof Vw.M) {
                a((Vw.M) abstractC2988k, (Vw.M) nC);
            } else {
                a((Vw.Q) abstractC2988k, (Vw.Q) nC);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = abstractC2988k2.f29325l;
        if (str2 != null) {
            a(abstractC2988k, str2);
        }
    }

    private void a(Vw.M m11, Vw.M m12) {
        if (m11.f29257m == null) {
            m11.f29257m = m12.f29257m;
        }
        if (m11.f29258n == null) {
            m11.f29258n = m12.f29258n;
        }
        if (m11.f29259o == null) {
            m11.f29259o = m12.f29259o;
        }
        if (m11.f29260p == null) {
            m11.f29260p = m12.f29260p;
        }
    }

    private void a(Vw.Q q11, Vw.Q q12) {
        if (q11.f29264m == null) {
            q11.f29264m = q12.f29264m;
        }
        if (q11.f29265n == null) {
            q11.f29265n = q12.f29265n;
        }
        if (q11.f29266o == null) {
            q11.f29266o = q12.f29266o;
        }
        if (q11.f29267p == null) {
            q11.f29267p = q12.f29267p;
        }
        if (q11.f29268q == null) {
            q11.f29268q = q12.f29268q;
        }
        if (q11.f29269r == null) {
            q11.f29269r = q12.f29269r;
        }
    }

    private void a(boolean z11, Vw.D d11) {
        if (z11) {
            if (a(d11.f29254e, 2147483648L)) {
                h hVar = this.f28884d;
                DA da2 = hVar.f28919a;
                Vw.O o11 = d11.f29254e.I;
                da2.f25324b = o11;
                hVar.f28920b = o11 != null;
            }
            if (a(d11.f29254e, 4294967296L)) {
                this.f28884d.f28919a.f25328d = d11.f29254e.J;
            }
            if (a(d11.f29254e, 6442450944L)) {
                h hVar2 = this.f28884d;
                a(hVar2, z11, hVar2.f28919a.f25324b);
                return;
            }
            return;
        }
        if (a(d11.f29254e, 2147483648L)) {
            h hVar3 = this.f28884d;
            DA da3 = hVar3.f28919a;
            Vw.O o12 = d11.f29254e.I;
            da3.f25329e = o12;
            hVar3.f28921c = o12 != null;
        }
        if (a(d11.f29254e, 4294967296L)) {
            this.f28884d.f28919a.f25330f = d11.f29254e.J;
        }
        if (a(d11.f29254e, 6442450944L)) {
            h hVar4 = this.f28884d;
            a(hVar4, z11, hVar4.f28919a.f25329e);
        }
    }

    private void a(Vw.K k11) {
        b(k11, k11.f29251h);
    }

    private Path a(Vw.K k11, Vw.C2980c c2980c) {
        Path pathA;
        Vw.N nC = k11.f29261a.c(this.f28884d.f28919a.F);
        if (nC == null) {
            b("ClipPath reference '%s' not found", this.f28884d.f28919a.F);
            return null;
        }
        if (nC.g() != "clipPath") {
            return null;
        }
        Vw.C2983f c2983f = (Vw.C2983f) nC;
        this.f28885e.push(this.f28884d);
        this.f28884d = b((Vw.N) c2983f);
        Boolean bool = c2983f.f29312p;
        boolean z11 = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z11) {
            matrix.preTranslate(c2980c.f29284a, c2980c.f29285b);
            matrix.preScale(c2980c.f29286c, c2980c.f29287d);
        }
        Matrix matrix2 = c2983f.f29331o;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (Vw.N n11 : c2983f.f29240i) {
            if ((n11 instanceof Vw.K) && (pathA = a((Vw.K) n11, true)) != null) {
                path.op(pathA, Path.Op.UNION);
            }
        }
        if (this.f28884d.f28919a.F != null) {
            if (c2983f.f29251h == null) {
                c2983f.f29251h = a(path);
            }
            Path pathA2 = a(c2983f, c2983f.f29251h);
            if (pathA2 != null) {
                path.op(pathA2, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.f28884d = (h) this.f28885e.pop();
        return path;
    }

    private Path a(Vw.K k11, boolean z11) {
        Path pathA;
        Path pathA2;
        this.f28885e.push(this.f28884d);
        h hVar = new h(this.f28884d);
        this.f28884d = hVar;
        a(hVar, k11);
        if (c() && t()) {
            if (k11 instanceof Vw.e0) {
                if (!z11) {
                    b("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
                }
                Vw.e0 e0Var = (Vw.e0) k11;
                Vw.N nC = k11.f29261a.c(e0Var.f29307p);
                if (nC == null) {
                    b("Use reference '%s' not found", e0Var.f29307p);
                    this.f28884d = (h) this.f28885e.pop();
                    return null;
                }
                if (!(nC instanceof Vw.K)) {
                    this.f28884d = (h) this.f28885e.pop();
                    return null;
                }
                pathA = a((Vw.K) nC, false);
                if (pathA == null) {
                    return null;
                }
                if (e0Var.f29251h == null) {
                    e0Var.f29251h = a(pathA);
                }
                Matrix matrix = e0Var.f29331o;
                if (matrix != null) {
                    pathA.transform(matrix);
                }
            } else if (k11 instanceof Vw.AbstractC2990m) {
                Vw.AbstractC2990m abstractC2990m = (Vw.AbstractC2990m) k11;
                if (k11 instanceof Vw.C3000w) {
                    pathA = new d(((Vw.C3000w) k11).f29360o).a();
                    if (k11.f29251h == null) {
                        k11.f29251h = a(pathA);
                    }
                } else if (k11 instanceof Vw.C) {
                    pathA = a((Vw.C) k11);
                } else if (k11 instanceof Vw.C2982e) {
                    pathA = a((Vw.C2982e) k11);
                } else if (k11 instanceof Vw.C2987j) {
                    pathA = a((Vw.C2987j) k11);
                } else {
                    pathA = k11 instanceof Vw.A ? b((Vw.A) k11) : null;
                }
                if (pathA == null) {
                    return null;
                }
                if (abstractC2990m.f29251h == null) {
                    abstractC2990m.f29251h = a(pathA);
                }
                Matrix matrix2 = abstractC2990m.f29330n;
                if (matrix2 != null) {
                    pathA.transform(matrix2);
                }
                pathA.setFillType(e());
            } else if (k11 instanceof Vw.W) {
                Vw.W w11 = (Vw.W) k11;
                pathA = a(w11);
                Matrix matrix3 = w11.f29274s;
                if (matrix3 != null) {
                    pathA.transform(matrix3);
                }
                pathA.setFillType(e());
            } else {
                b("Invalid %s element found in clipPath definition", k11.g());
                return null;
            }
            if (this.f28884d.f28919a.F != null && (pathA2 = a(k11, k11.f29251h)) != null) {
                pathA.op(pathA2, Path.Op.INTERSECT);
            }
            this.f28884d = (h) this.f28885e.pop();
            return pathA;
        }
        this.f28884d = (h) this.f28885e.pop();
        return null;
    }

    private void a(Vw.N n11, boolean z11, Path path, Matrix matrix) {
        if (c()) {
            b();
            if (n11 instanceof Vw.e0) {
                if (z11) {
                    a((Vw.e0) n11, path, matrix);
                } else {
                    b("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
                }
            } else if (n11 instanceof Vw.C3000w) {
                a((Vw.C3000w) n11, path, matrix);
            } else if (n11 instanceof Vw.W) {
                a((Vw.W) n11, path, matrix);
            } else if (n11 instanceof Vw.AbstractC2990m) {
                a((Vw.AbstractC2990m) n11, path, matrix);
            } else {
                b("Invalid %s element found in clipPath definition", n11.toString());
            }
            a();
        }
    }

    private void a() {
        this.f28881a.restore();
        this.f28884d = (h) this.f28885e.pop();
    }

    private void a(Vw.C3000w c3000w, Path path, Matrix matrix) {
        a(this.f28884d, c3000w);
        if (c() && t()) {
            Matrix matrix2 = c3000w.f29330n;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            Path pathA = new d(c3000w.f29360o).a();
            if (c3000w.f29251h == null) {
                c3000w.f29251h = a(pathA);
            }
            a((Vw.K) c3000w);
            path.setFillType(e());
            path.addPath(pathA, matrix);
        }
    }

    private void a(Vw.AbstractC2990m abstractC2990m, Path path, Matrix matrix) {
        Path pathB;
        a(this.f28884d, abstractC2990m);
        if (c() && t()) {
            Matrix matrix2 = abstractC2990m.f29330n;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            if (abstractC2990m instanceof Vw.C) {
                pathB = a((Vw.C) abstractC2990m);
            } else if (abstractC2990m instanceof Vw.C2982e) {
                pathB = a((Vw.C2982e) abstractC2990m);
            } else if (abstractC2990m instanceof Vw.C2987j) {
                pathB = a((Vw.C2987j) abstractC2990m);
            } else if (!(abstractC2990m instanceof Vw.A)) {
                return;
            } else {
                pathB = b((Vw.A) abstractC2990m);
            }
            if (pathB == null) {
                return;
            }
            a((Vw.K) abstractC2990m);
            path.setFillType(e());
            path.addPath(pathB, matrix);
        }
    }

    private void a(Vw.e0 e0Var, Path path, Matrix matrix) {
        a(this.f28884d, e0Var);
        if (c() && t()) {
            Matrix matrix2 = e0Var.f29331o;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            Vw.N nC = e0Var.f29261a.c(e0Var.f29307p);
            if (nC == null) {
                b("Use reference '%s' not found", e0Var.f29307p);
            } else {
                a((Vw.K) e0Var);
                a(nC, false, path, matrix);
            }
        }
    }

    private void a(Vw.W w11, Path path, Matrix matrix) {
        a(this.f28884d, w11);
        if (c()) {
            Matrix matrix2 = w11.f29274s;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            List list = w11.f29279o;
            float fC = BitmapDescriptorFactory.HUE_RED;
            float fB = (list == null || list.size() == 0) ? 0.0f : ((Vw.C2994q) w11.f29279o.get(0)).b(this);
            List list2 = w11.f29280p;
            float fC2 = (list2 == null || list2.size() == 0) ? 0.0f : ((Vw.C2994q) w11.f29280p.get(0)).c(this);
            List list3 = w11.f29281q;
            float fB2 = (list3 == null || list3.size() == 0) ? 0.0f : ((Vw.C2994q) w11.f29281q.get(0)).b(this);
            List list4 = w11.f29282r;
            if (list4 != null && list4.size() != 0) {
                fC = ((Vw.C2994q) w11.f29282r.get(0)).c(this);
            }
            if (this.f28884d.f28919a.f25346v != DA.k.Start) {
                float fA = a((Vw.Y) w11);
                if (this.f28884d.f28919a.f25346v == DA.k.Middle) {
                    fA /= 2.0f;
                }
                fB -= fA;
            }
            if (w11.f29251h == null) {
                i iVar = new i(fB, fC2);
                a((Vw.Y) w11, (j) iVar);
                RectF rectF = iVar.f28931c;
                w11.f29251h = new Vw.C2980c(rectF.left, rectF.top, rectF.width(), iVar.f28931c.height());
            }
            a((Vw.K) w11);
            Path path2 = new Path();
            a((Vw.Y) w11, new g(fB + fB2, fC2 + fC, path2));
            path.setFillType(e());
            path.addPath(path2, matrix);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004d  */
    /* JADX WARN: Code duplicated, block: B:17:0x0053  */
    /* JADX WARN: Code duplicated, block: B:20:0x0058  */
    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:24:0x006f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0086  */
    private Path a(Vw.C c11) {
        float fB;
        float fC;
        float fMin;
        Vw.C2994q c2994q;
        float fB2;
        Vw.C2994q c2994q2;
        float fC2;
        float fB3;
        float fC3;
        float f11;
        float f12;
        Path path;
        Vw.C2994q c2994q3 = c11.f29232s;
        if (c2994q3 == null && c11.f29233t == null) {
            fC = 0.0f;
        } else if (c2994q3 == null) {
            fC = c11.f29233t.c(this);
        } else {
            if (c11.f29233t == null) {
                fC = c2994q3.b(this);
            } else {
                fB = c2994q3.b(this);
                fC = c11.f29233t.c(this);
            }
            fMin = Math.min(fB, c11.f29230q.b(this) / 2.0f);
            float fMin2 = Math.min(fC, c11.f29231r.c(this) / 2.0f);
            c2994q = c11.f29228o;
            if (c2994q != null) {
                fB2 = c2994q.b(this);
            } else {
                fB2 = 0.0f;
            }
            c2994q2 = c11.f29229p;
            if (c2994q2 != null) {
                fC2 = c2994q2.c(this);
            } else {
                fC2 = 0.0f;
            }
            fB3 = c11.f29230q.b(this);
            fC3 = c11.f29231r.c(this);
            if (c11.f29251h == null) {
                c11.f29251h = new Vw.C2980c(fB2, fC2, fB3, fC3);
            }
            f11 = fB3 + fB2;
            f12 = fC2 + fC3;
            path = new Path();
            if (fMin == BitmapDescriptorFactory.HUE_RED && fMin2 != BitmapDescriptorFactory.HUE_RED) {
                float f13 = fMin * 0.5522848f;
                float f14 = 0.5522848f * fMin2;
                float f15 = fC2 + fMin2;
                path.moveTo(fB2, f15);
                float f16 = f15 - f14;
                float f17 = fB2 + fMin;
                float f18 = f17 - f13;
                path.cubicTo(fB2, f16, f18, fC2, f17, fC2);
                float f19 = f11 - fMin;
                path.lineTo(f19, fC2);
                float f21 = f19 + f13;
                path.cubicTo(f21, fC2, f11, f16, f11, f15);
                float f22 = f12 - fMin2;
                path.lineTo(f11, f22);
                float f23 = f22 + f14;
                path.cubicTo(f11, f23, f21, f12, f19, f12);
                path.lineTo(f17, f12);
                float f24 = fB2;
                path.cubicTo(f18, f12, f24, f23, fB2, f22);
                path.lineTo(f24, f15);
            } else {
                path.moveTo(fB2, fC2);
                path.lineTo(f11, fC2);
                path.lineTo(f11, f12);
                path.lineTo(fB2, f12);
                path.lineTo(fB2, fC2);
            }
            path.close();
            return path;
        }
        fB = fC;
        fMin = Math.min(fB, c11.f29230q.b(this) / 2.0f);
        float fMin3 = Math.min(fC, c11.f29231r.c(this) / 2.0f);
        c2994q = c11.f29228o;
        if (c2994q != null) {
            fB2 = c2994q.b(this);
        } else {
            fB2 = 0.0f;
        }
        c2994q2 = c11.f29229p;
        if (c2994q2 != null) {
            fC2 = c2994q2.c(this);
        } else {
            fC2 = 0.0f;
        }
        fB3 = c11.f29230q.b(this);
        fC3 = c11.f29231r.c(this);
        if (c11.f29251h == null) {
            c11.f29251h = new Vw.C2980c(fB2, fC2, fB3, fC3);
        }
        f11 = fB3 + fB2;
        f12 = fC2 + fC3;
        path = new Path();
        if (fMin == BitmapDescriptorFactory.HUE_RED) {
            path.moveTo(fB2, fC2);
            path.lineTo(f11, fC2);
            path.lineTo(f11, f12);
            path.lineTo(fB2, f12);
            path.lineTo(fB2, fC2);
        } else {
            path.moveTo(fB2, fC2);
            path.lineTo(f11, fC2);
            path.lineTo(f11, f12);
            path.lineTo(fB2, f12);
            path.lineTo(fB2, fC2);
        }
        path.close();
        return path;
    }

    private Path a(Vw.C2982e c2982e) {
        Vw.C2994q c2994q = c2982e.f29304o;
        float fC = BitmapDescriptorFactory.HUE_RED;
        float fB = c2994q != null ? c2994q.b(this) : 0.0f;
        Vw.C2994q c2994q2 = c2982e.f29305p;
        if (c2994q2 != null) {
            fC = c2994q2.c(this);
        }
        float f11 = fC;
        float fA = c2982e.f29306q.a(this);
        float f12 = fB - fA;
        float f13 = f11 - fA;
        float f14 = fB + fA;
        float f15 = f11 + fA;
        if (c2982e.f29251h == null) {
            float f16 = 2.0f * fA;
            c2982e.f29251h = new Vw.C2980c(f12, f13, f16, f16);
        }
        float f17 = fA * 0.5522848f;
        Path path = new Path();
        path.moveTo(fB, f13);
        float f18 = fB + f17;
        float f19 = f11 - f17;
        path.cubicTo(f18, f13, f14, f19, f14, f11);
        float f21 = f11 + f17;
        path.cubicTo(f14, f21, f18, f15, fB, f15);
        float f22 = fB - f17;
        path.cubicTo(f22, f15, f12, f21, f12, f11);
        path.cubicTo(f12, f19, f22, f13, fB, f13);
        path.close();
        return path;
    }

    private Path a(Vw.C2987j c2987j) {
        Vw.C2994q c2994q = c2987j.f29317o;
        float fC = BitmapDescriptorFactory.HUE_RED;
        float fB = c2994q != null ? c2994q.b(this) : 0.0f;
        Vw.C2994q c2994q2 = c2987j.f29318p;
        if (c2994q2 != null) {
            fC = c2994q2.c(this);
        }
        float f11 = fC;
        float fB2 = c2987j.f29319q.b(this);
        float fC2 = c2987j.f29320r.c(this);
        float f12 = fB - fB2;
        float f13 = f11 - fC2;
        float f14 = fB + fB2;
        float f15 = f11 + fC2;
        if (c2987j.f29251h == null) {
            c2987j.f29251h = new Vw.C2980c(f12, f13, fB2 * 2.0f, 2.0f * fC2);
        }
        float f16 = fB2 * 0.5522848f;
        float f17 = fC2 * 0.5522848f;
        Path path = new Path();
        path.moveTo(fB, f13);
        float f18 = fB + f16;
        float f19 = f11 - f17;
        path.cubicTo(f18, f13, f14, f19, f14, f11);
        float f21 = f11 + f17;
        path.cubicTo(f14, f21, f18, f15, fB, f15);
        float f22 = fB - f16;
        path.cubicTo(f22, f15, f12, f21, f12, f11);
        path.cubicTo(f12, f19, f22, f13, fB, f13);
        path.close();
        return path;
    }

    private Path a(Vw.W w11) {
        List list = w11.f29279o;
        float fC = BitmapDescriptorFactory.HUE_RED;
        float fB = (list == null || list.size() == 0) ? 0.0f : ((Vw.C2994q) w11.f29279o.get(0)).b(this);
        List list2 = w11.f29280p;
        float fC2 = (list2 == null || list2.size() == 0) ? 0.0f : ((Vw.C2994q) w11.f29280p.get(0)).c(this);
        List list3 = w11.f29281q;
        float fB2 = (list3 == null || list3.size() == 0) ? 0.0f : ((Vw.C2994q) w11.f29281q.get(0)).b(this);
        List list4 = w11.f29282r;
        if (list4 != null && list4.size() != 0) {
            fC = ((Vw.C2994q) w11.f29282r.get(0)).c(this);
        }
        if (this.f28884d.f28919a.f25346v != DA.k.Start) {
            float fA = a((Vw.Y) w11);
            if (this.f28884d.f28919a.f25346v == DA.k.Middle) {
                fA /= 2.0f;
            }
            fB -= fA;
        }
        if (w11.f29251h == null) {
            i iVar = new i(fB, fC2);
            a((Vw.Y) w11, (j) iVar);
            RectF rectF = iVar.f28931c;
            w11.f29251h = new Vw.C2980c(rectF.left, rectF.top, rectF.width(), iVar.f28931c.height());
        }
        Path path = new Path();
        a((Vw.Y) w11, new g(fB + fB2, fC2 + fC, path));
        return path;
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0166  */
    private void a(Vw.K k11, Path path, Vw.C3003z c3003z) {
        float fB;
        float fC;
        float fC2;
        float fB2;
        boolean z11;
        boolean z12;
        Boolean bool = c3003z.f29366q;
        boolean z13 = bool != null && bool.booleanValue();
        float fFloatValue = this.f28884d.f28919a.f25328d.floatValue();
        String str = c3003z.f29373x;
        if (str != null) {
            a(c3003z, str);
        }
        if (z13) {
            Vw.C2994q c2994q = c3003z.f29369t;
            fB = c2994q != null ? c2994q.b(this) : 0.0f;
            Vw.C2994q c2994q2 = c3003z.f29370u;
            fC2 = c2994q2 != null ? c2994q2.c(this) : 0.0f;
            Vw.C2994q c2994q3 = c3003z.f29371v;
            fB2 = c2994q3 != null ? c2994q3.b(this) : 0.0f;
            Vw.C2994q c2994q4 = c3003z.f29372w;
            fC = c2994q4 != null ? c2994q4.c(this) : 0.0f;
        } else {
            Vw.C2994q c2994q5 = c3003z.f29369t;
            float fA = c2994q5 != null ? c2994q5.a(this, 1.0f) : 0.0f;
            Vw.C2994q c2994q6 = c3003z.f29370u;
            float fA2 = c2994q6 != null ? c2994q6.a(this, 1.0f) : 0.0f;
            Vw.C2994q c2994q7 = c3003z.f29371v;
            float fA3 = c2994q7 != null ? c2994q7.a(this, 1.0f) : 0.0f;
            Vw.C2994q c2994q8 = c3003z.f29372w;
            float fA4 = c2994q8 != null ? c2994q8.a(this, 1.0f) : 0.0f;
            Vw.C2980c c2980c = k11.f29251h;
            float f11 = c2980c.f29284a;
            float f12 = c2980c.f29286c;
            fB = (fA * f12) + f11;
            float f13 = c2980c.f29285b;
            float f14 = c2980c.f29287d;
            float f15 = fA3 * f12;
            fC = fA4 * f14;
            fC2 = (fA2 * f14) + f13;
            fB2 = f15;
        }
        if (fB2 == BitmapDescriptorFactory.HUE_RED || fC == BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        Ks ks2 = c3003z.f29263o;
        if (ks2 == null) {
            ks2 = Ks.f26654f;
        }
        r();
        this.f28881a.clipPath(path);
        h hVar = new h();
        a(hVar, DA.a());
        hVar.f28919a.f25347w = Boolean.FALSE;
        this.f28884d = a(c3003z, hVar);
        Vw.C2980c c2980c2 = k11.f29251h;
        Matrix matrix = c3003z.f29368s;
        if (matrix != null) {
            this.f28881a.concat(matrix);
            Matrix matrix2 = new Matrix();
            if (c3003z.f29368s.invert(matrix2)) {
                Vw.C2980c c2980c3 = k11.f29251h;
                float f16 = c2980c3.f29284a;
                float f17 = c2980c3.f29285b;
                float fA5 = c2980c3.a();
                z11 = false;
                Vw.C2980c c2980c4 = k11.f29251h;
                z12 = true;
                float f18 = c2980c4.f29285b;
                float fA6 = c2980c4.a();
                float fB3 = k11.f29251h.b();
                Vw.C2980c c2980c5 = k11.f29251h;
                float[] fArr = {f16, f17, fA5, f18, fA6, fB3, c2980c5.f29284a, c2980c5.b()};
                matrix2.mapPoints(fArr);
                float f19 = fArr[0];
                float f21 = fArr[1];
                RectF rectF = new RectF(f19, f21, f19, f21);
                for (int i11 = 2; i11 <= 6; i11 += 2) {
                    float f22 = fArr[i11];
                    if (f22 < rectF.left) {
                        rectF.left = f22;
                    }
                    if (f22 > rectF.right) {
                        rectF.right = f22;
                    }
                    float f23 = fArr[i11 + 1];
                    if (f23 < rectF.top) {
                        rectF.top = f23;
                    }
                    if (f23 > rectF.bottom) {
                        rectF.bottom = f23;
                    }
                }
                float f24 = rectF.left;
                float f25 = rectF.top;
                c2980c2 = new Vw.C2980c(f24, f25, rectF.right - f24, rectF.bottom - f25);
            } else {
                z11 = false;
                z12 = true;
            }
        } else {
            z11 = false;
            z12 = true;
        }
        float fFloor = fB + (((float) Math.floor((c2980c2.f29284a - fB) / fB2)) * fB2);
        float fA7 = c2980c2.a();
        float fB4 = c2980c2.b();
        Vw.C2980c c2980c6 = new Vw.C2980c(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, fB2, fC);
        boolean zB = b(fFloatValue);
        for (float fFloor2 = fC2 + (((float) Math.floor((c2980c2.f29285b - fC2) / fC)) * fC); fFloor2 < fB4; fFloor2 += fC) {
            float f26 = fFloor;
            while (f26 < fA7) {
                c2980c6.f29284a = f26;
                c2980c6.f29285b = fFloor2;
                r();
                if (!this.f28884d.f28919a.f25347w.booleanValue()) {
                    b(c2980c6.f29284a, c2980c6.f29285b, c2980c6.f29286c, c2980c6.f29287d);
                }
                Vw.C2980c c2980c7 = c3003z.f29270p;
                if (c2980c7 != null) {
                    this.f28881a.concat(a(c2980c6, c2980c7, ks2));
                } else {
                    Boolean bool2 = c3003z.f29367r;
                    boolean z14 = (bool2 == null || bool2.booleanValue()) ? z12 : z11;
                    this.f28881a.translate(f26, fFloor2);
                    if (!z14) {
                        Canvas canvas = this.f28881a;
                        Vw.C2980c c2980c8 = k11.f29251h;
                        canvas.scale(c2980c8.f29286c, c2980c8.f29287d);
                    }
                }
                Iterator it = c3003z.f29240i.iterator();
                while (it.hasNext()) {
                    c((Vw.N) it.next());
                }
                q();
                f26 += fB2;
                fFloor = fFloor;
            }
        }
        if (zB) {
            c((Vw.K) c3003z);
        }
        q();
    }

    private void a(Vw.C3003z c3003z, String str) {
        Vw.N nC = c3003z.f29261a.c(str);
        if (nC == null) {
            c("Pattern reference '%s' not found", str);
            return;
        }
        if (!(nC instanceof Vw.C3003z)) {
            b("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (nC == c3003z) {
            b("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        Vw.C3003z c3003z2 = (Vw.C3003z) nC;
        if (c3003z.f29366q == null) {
            c3003z.f29366q = c3003z2.f29366q;
        }
        if (c3003z.f29367r == null) {
            c3003z.f29367r = c3003z2.f29367r;
        }
        if (c3003z.f29368s == null) {
            c3003z.f29368s = c3003z2.f29368s;
        }
        if (c3003z.f29369t == null) {
            c3003z.f29369t = c3003z2.f29369t;
        }
        if (c3003z.f29370u == null) {
            c3003z.f29370u = c3003z2.f29370u;
        }
        if (c3003z.f29371v == null) {
            c3003z.f29371v = c3003z2.f29371v;
        }
        if (c3003z.f29372w == null) {
            c3003z.f29372w = c3003z2.f29372w;
        }
        if (c3003z.f29240i.isEmpty()) {
            c3003z.f29240i = c3003z2.f29240i;
        }
        if (c3003z.f29270p == null) {
            c3003z.f29270p = c3003z2.f29270p;
        }
        if (c3003z.f29263o == null) {
            c3003z.f29263o = c3003z2.f29263o;
        }
        String str2 = c3003z2.f29373x;
        if (str2 != null) {
            a(c3003z, str2);
        }
    }

    private void a(Vw.C2997t c2997t, Vw.K k11, Vw.C2980c c2980c) {
        float fB;
        float fC;
        a("Mask render", new Object[0]);
        Boolean bool = c2997t.f29352o;
        if (bool != null && bool.booleanValue()) {
            Vw.C2994q c2994q = c2997t.f29356s;
            fB = c2994q != null ? c2994q.b(this) : c2980c.f29286c;
            Vw.C2994q c2994q2 = c2997t.f29357t;
            fC = c2994q2 != null ? c2994q2.c(this) : c2980c.f29287d;
        } else {
            Vw.C2994q c2994q3 = c2997t.f29356s;
            float fA = c2994q3 != null ? c2994q3.a(this, 1.0f) : 1.2f;
            Vw.C2994q c2994q4 = c2997t.f29357t;
            float fA2 = c2994q4 != null ? c2994q4.a(this, 1.0f) : 1.2f;
            fB = fA * c2980c.f29286c;
            fC = fA2 * c2980c.f29287d;
        }
        if (fB == BitmapDescriptorFactory.HUE_RED || fC == BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        r();
        h hVarB = b((Vw.N) c2997t);
        this.f28884d = hVarB;
        hVarB.f28919a.f25337m = Float.valueOf(1.0f);
        boolean zM = m();
        this.f28881a.save();
        Boolean bool2 = c2997t.f29353p;
        if (bool2 != null && !bool2.booleanValue()) {
            this.f28881a.translate(c2980c.f29284a, c2980c.f29285b);
            this.f28881a.scale(c2980c.f29286c, c2980c.f29287d);
        }
        a((Vw.J) c2997t, false);
        this.f28881a.restore();
        if (zM) {
            d(k11, c2980c);
        }
        q();
    }
}
