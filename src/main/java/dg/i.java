package dg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import androidx.collection.v;
import bg.k;
import bg.l;
import bg.m;
import cg.q;
import cg.u;
import com.airbnb.lottie.p;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tf.d0;
import tf.m0;
import wf.o;

/* JADX INFO: loaded from: classes3.dex */
public class i extends dg.b {
    private final StringBuilder E;
    private final RectF F;
    private final Matrix G;
    private final Paint H;
    private final Paint I;
    private final Map<ag.d, List<vf.d>> J;
    private final v<String> K;
    private final List<d> L;
    private final o M;
    private final p N;
    private final tf.i O;
    private u P;
    private wf.a<Integer, Integer> Q;
    private wf.a<Integer, Integer> R;
    private wf.a<Integer, Integer> S;
    private wf.a<Integer, Integer> T;
    private wf.a<Float, Float> U;
    private wf.a<Float, Float> V;
    private wf.a<Float, Float> W;
    private wf.a<Float, Float> X;
    private wf.a<Integer, Integer> Y;
    private wf.a<Float, Float> Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private wf.a<Typeface, Typeface> f60591a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private wf.a<Integer, Integer> f60592b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private wf.a<Integer, Integer> f60593c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private wf.a<Integer, Integer> f60594d0;

    class a extends Paint {
        a(int i11) {
            super(i11);
            setStyle(Paint.Style.FILL);
        }
    }

    class b extends Paint {
        b(int i11) {
            super(i11);
            setStyle(Paint.Style.STROKE);
        }
    }

    static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f60597a;

        static {
            int[] iArr = new int[ag.b.a.values().length];
            f60597a = iArr;
            try {
                iArr[ag.b.a.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60597a[ag.b.a.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60597a[ag.b.a.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    i(p pVar, e eVar) {
        l lVar;
        l lVar2;
        bg.d dVar;
        l lVar3;
        bg.d dVar2;
        l lVar4;
        bg.d dVar3;
        m mVar;
        bg.d dVar4;
        m mVar2;
        bg.b bVar;
        m mVar3;
        bg.b bVar2;
        m mVar4;
        bg.a aVar;
        m mVar5;
        bg.a aVar2;
        super(pVar, eVar);
        this.E = new StringBuilder(2);
        this.F = new RectF();
        this.G = new Matrix();
        this.H = new a(1);
        this.I = new b(1);
        this.J = new HashMap();
        this.K = new v<>();
        this.L = new ArrayList();
        this.P = u.INDEX;
        this.N = pVar;
        this.O = eVar.c();
        o oVarA = eVar.t().a();
        this.M = oVarA;
        oVarA.a(this);
        j(oVarA);
        k kVarU = eVar.u();
        if (kVarU != null && (mVar5 = kVarU.f17105a) != null && (aVar2 = mVar5.f17111a) != null) {
            wf.a<Integer, Integer> aVarA = aVar2.a();
            this.Q = aVarA;
            aVarA.a(this);
            j(this.Q);
        }
        if (kVarU != null && (mVar4 = kVarU.f17105a) != null && (aVar = mVar4.f17112b) != null) {
            wf.a<Integer, Integer> aVarA2 = aVar.a();
            this.S = aVarA2;
            aVarA2.a(this);
            j(this.S);
        }
        if (kVarU != null && (mVar3 = kVarU.f17105a) != null && (bVar2 = mVar3.f17113c) != null) {
            wf.d dVarA = bVar2.a();
            this.U = dVarA;
            dVarA.a(this);
            j(this.U);
        }
        if (kVarU != null && (mVar2 = kVarU.f17105a) != null && (bVar = mVar2.f17114d) != null) {
            wf.d dVarA2 = bVar.a();
            this.W = dVarA2;
            dVarA2.a(this);
            j(this.W);
        }
        if (kVarU != null && (mVar = kVarU.f17105a) != null && (dVar4 = mVar.f17115e) != null) {
            wf.a<Integer, Integer> aVarA3 = dVar4.a();
            this.Y = aVarA3;
            aVarA3.a(this);
            j(this.Y);
        }
        if (kVarU != null && (lVar4 = kVarU.f17106b) != null && (dVar3 = lVar4.f17107a) != null) {
            wf.a<Integer, Integer> aVarA4 = dVar3.a();
            this.f60592b0 = aVarA4;
            aVarA4.a(this);
            j(this.f60592b0);
        }
        if (kVarU != null && (lVar3 = kVarU.f17106b) != null && (dVar2 = lVar3.f17108b) != null) {
            wf.a<Integer, Integer> aVarA5 = dVar2.a();
            this.f60593c0 = aVarA5;
            aVarA5.a(this);
            j(this.f60593c0);
        }
        if (kVarU != null && (lVar2 = kVarU.f17106b) != null && (dVar = lVar2.f17109c) != null) {
            wf.a<Integer, Integer> aVarA6 = dVar.a();
            this.f60594d0 = aVarA6;
            aVarA6.a(this);
            j(this.f60594d0);
        }
        if (kVarU == null || (lVar = kVarU.f17106b) == null) {
            return;
        }
        this.P = lVar.f17110d;
    }

    private String P(String str, int i11) {
        int iCodePointAt = str.codePointAt(i11);
        int iCharCount = Character.charCount(iCodePointAt) + i11;
        while (iCharCount < str.length()) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (!e0(iCodePointAt2)) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt2);
            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
        }
        long j11 = iCodePointAt;
        if (this.K.c(j11)) {
            return this.K.d(j11);
        }
        this.E.setLength(0);
        while (i11 < iCharCount) {
            int iCodePointAt3 = str.codePointAt(i11);
            this.E.appendCodePoint(iCodePointAt3);
            i11 += Character.charCount(iCodePointAt3);
        }
        String string = this.E.toString();
        this.K.h(j11, string);
        return string;
    }

    private void Q(ag.b bVar, int i11, int i12) {
        wf.a<Integer, Integer> aVar = this.R;
        if (aVar != null) {
            this.H.setColor(aVar.h().intValue());
        } else if (this.Q == null || !d0(i12)) {
            this.H.setColor(bVar.f1007h);
        } else {
            this.H.setColor(this.Q.h().intValue());
        }
        wf.a<Integer, Integer> aVar2 = this.T;
        if (aVar2 != null) {
            this.I.setColor(aVar2.h().intValue());
        } else if (this.S == null || !d0(i12)) {
            this.I.setColor(bVar.f1008i);
        } else {
            this.I.setColor(this.S.h().intValue());
        }
        int iIntValue = 100;
        int iIntValue2 = this.f60560x.h() == null ? 100 : this.f60560x.h().h().intValue();
        if (this.Y != null && d0(i12)) {
            iIntValue = this.Y.h().intValue();
        }
        int iRound = Math.round(((((iIntValue2 * 255.0f) / 100.0f) * (iIntValue / 100.0f)) * i11) / 255.0f);
        this.H.setAlpha(iRound);
        this.I.setAlpha(iRound);
        wf.a<Float, Float> aVar3 = this.V;
        if (aVar3 != null) {
            this.I.setStrokeWidth(aVar3.h().floatValue());
        } else if (this.U == null || !d0(i12)) {
            this.I.setStrokeWidth(bVar.f1009j * hg.l.e());
        } else {
            this.I.setStrokeWidth(this.U.h().floatValue());
        }
    }

    private void R(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        canvas.drawText(str, 0, str.length(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint);
    }

    private void S(ag.d dVar, float f11, ag.b bVar, Canvas canvas, int i11, int i12) {
        Q(bVar, i12, i11);
        List<vf.d> listA0 = a0(dVar);
        for (int i13 = 0; i13 < listA0.size(); i13++) {
            Path path = listA0.get(i13).getPath();
            path.computeBounds(this.F, false);
            this.G.reset();
            this.G.preTranslate(BitmapDescriptorFactory.HUE_RED, (-bVar.f1006g) * hg.l.e());
            this.G.preScale(f11, f11);
            path.transform(this.G);
            if (bVar.f1010k) {
                V(path, this.H, canvas);
                V(path, this.I, canvas);
            } else {
                V(path, this.I, canvas);
                V(path, this.H, canvas);
            }
        }
    }

    private void T(String str, ag.b bVar, Canvas canvas, int i11, int i12) {
        Q(bVar, i12, i11);
        if (bVar.f1010k) {
            R(str, this.H, canvas);
            R(str, this.I, canvas);
        } else {
            R(str, this.I, canvas);
            R(str, this.H, canvas);
        }
    }

    private void U(String str, ag.b bVar, Canvas canvas, float f11, int i11, int i12) {
        int length = 0;
        while (length < str.length()) {
            String strP = P(str, length);
            ag.b bVar2 = bVar;
            Canvas canvas2 = canvas;
            T(strP, bVar2, canvas2, i11 + length, i12);
            canvas2.translate(this.H.measureText(strP) + f11, BitmapDescriptorFactory.HUE_RED);
            length += strP.length();
            bVar = bVar2;
            canvas = canvas2;
        }
    }

    private void V(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private void W(String str, ag.b bVar, ag.c cVar, Canvas canvas, float f11, float f12, float f13, int i11) {
        ag.b bVar2;
        Canvas canvas2;
        float f14;
        int i12;
        int i13 = 0;
        while (i13 < str.length()) {
            ag.d dVarE = this.O.c().e(ag.d.c(str.charAt(i13), cVar.a(), cVar.c()));
            if (dVarE == null) {
                bVar2 = bVar;
                canvas2 = canvas;
                f14 = f12;
                i12 = i11;
            } else {
                bVar2 = bVar;
                canvas2 = canvas;
                f14 = f12;
                i12 = i11;
                S(dVarE, f14, bVar2, canvas2, i13, i12);
                canvas2.translate((((float) dVarE.b()) * f14 * hg.l.e()) + f13, BitmapDescriptorFactory.HUE_RED);
            }
            i13++;
            f12 = f14;
            bVar = bVar2;
            canvas = canvas2;
            i11 = i12;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0093  */
    /* JADX WARN: Code duplicated, block: B:23:0x009d  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ee  */
    private void X(ag.b bVar, ag.c cVar, Canvas canvas, int i11) {
        float fFloatValue;
        float fE;
        List<String> listB0;
        int size;
        int i12;
        int i13;
        int length;
        PointF pointF;
        float f11;
        float f12;
        List<d> listG0;
        int i14;
        d dVar;
        float fMeasureText;
        float f13;
        int i15;
        i iVar = this;
        ag.b bVar2 = bVar;
        ag.c cVar2 = cVar;
        Typeface typefaceC0 = iVar.c0(cVar2);
        if (typefaceC0 == null) {
            return;
        }
        String strC = bVar2.f1000a;
        m0 m0VarE0 = iVar.N.e0();
        if (m0VarE0 != null) {
            strC = m0VarE0.c(iVar.getName(), strC);
        }
        iVar.H.setTypeface(typefaceC0);
        wf.a<Float, Float> aVar = iVar.Z;
        float fFloatValue2 = aVar != null ? aVar.h().floatValue() : bVar2.f1002c;
        iVar.H.setTextSize(hg.l.e() * fFloatValue2);
        iVar.I.setTypeface(iVar.H.getTypeface());
        iVar.I.setTextSize(iVar.H.getTextSize());
        float f14 = bVar2.f1004e / 10.0f;
        wf.a<Float, Float> aVar2 = iVar.X;
        if (aVar2 == null) {
            wf.a<Float, Float> aVar3 = iVar.W;
            if (aVar3 != null) {
                fFloatValue = aVar3.h().floatValue();
            }
            fE = ((f14 * hg.l.e()) * fFloatValue2) / 100.0f;
            listB0 = iVar.b0(strC);
            size = listB0.size();
            i12 = -1;
            i13 = 0;
            length = 0;
            while (i13 < size) {
                String str = listB0.get(i13);
                pointF = bVar2.f1012m;
                if (pointF == null) {
                    f11 = BitmapDescriptorFactory.HUE_RED;
                } else {
                    f11 = pointF.x;
                }
                f12 = fE;
                listG0 = iVar.g0(str, f11, cVar2, BitmapDescriptorFactory.HUE_RED, f12, false);
                i14 = 0;
                while (i14 < listG0.size()) {
                    dVar = listG0.get(i14);
                    i12++;
                    canvas.save();
                    if (iVar.M != null && iVar.Z == null && iVar.X == null) {
                        fMeasureText = dVar.f60599b;
                    } else {
                        fMeasureText = iVar.H.measureText(dVar.f60598a);
                    }
                    if (iVar.f0(canvas, bVar2, i12, fMeasureText)) {
                        f13 = f12;
                        i15 = length;
                        iVar.U(dVar.f60598a, bVar2, canvas, f13, i15, i11);
                    } else {
                        f13 = f12;
                        i15 = length;
                    }
                    length = i15 + dVar.f60598a.length();
                    canvas.restore();
                    i14++;
                    iVar = this;
                    bVar2 = bVar;
                    f12 = f13;
                }
                fE = f12;
                i13++;
                iVar = this;
                bVar2 = bVar;
                cVar2 = cVar;
            }
        }
        fFloatValue = aVar2.h().floatValue();
        f14 += fFloatValue;
        fE = ((f14 * hg.l.e()) * fFloatValue2) / 100.0f;
        listB0 = iVar.b0(strC);
        size = listB0.size();
        i12 = -1;
        i13 = 0;
        length = 0;
        while (i13 < size) {
            String str2 = listB0.get(i13);
            pointF = bVar2.f1012m;
            if (pointF == null) {
                f11 = BitmapDescriptorFactory.HUE_RED;
            } else {
                f11 = pointF.x;
            }
            f12 = fE;
            listG0 = iVar.g0(str2, f11, cVar2, BitmapDescriptorFactory.HUE_RED, f12, false);
            i14 = 0;
            while (i14 < listG0.size()) {
                dVar = listG0.get(i14);
                i12++;
                canvas.save();
                if (iVar.M != null) {
                    fMeasureText = iVar.H.measureText(dVar.f60598a);
                } else {
                    fMeasureText = iVar.H.measureText(dVar.f60598a);
                }
                if (iVar.f0(canvas, bVar2, i12, fMeasureText)) {
                    f13 = f12;
                    i15 = length;
                    iVar.U(dVar.f60598a, bVar2, canvas, f13, i15, i11);
                } else {
                    f13 = f12;
                    i15 = length;
                }
                length = i15 + dVar.f60598a.length();
                canvas.restore();
                i14++;
                iVar = this;
                bVar2 = bVar;
                f12 = f13;
            }
            fE = f12;
            i13++;
            iVar = this;
            bVar2 = bVar;
            cVar2 = cVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0053  */
    /* JADX WARN: Code duplicated, block: B:18:0x005d  */
    /* JADX WARN: Code duplicated, block: B:19:0x005f  */
    /* JADX WARN: Code duplicated, block: B:23:0x006f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0086  */
    /* JADX WARN: Code duplicated, block: B:26:0x0098  */
    private void Y(ag.b bVar, Matrix matrix, ag.c cVar, Canvas canvas, int i11) {
        float fFloatValue;
        float f11;
        int i12;
        int i13;
        PointF pointF;
        float f12;
        List<d> listG0;
        int i14;
        d dVar;
        float f13;
        float f14;
        i iVar = this;
        ag.b bVar2 = bVar;
        wf.a<Float, Float> aVar = iVar.Z;
        float fFloatValue2 = (aVar != null ? aVar.h().floatValue() : bVar2.f1002c) / 100.0f;
        float fG = hg.l.g(matrix);
        List<String> listB0 = iVar.b0(bVar2.f1000a);
        int size = listB0.size();
        float f15 = bVar2.f1004e / 10.0f;
        wf.a<Float, Float> aVar2 = iVar.X;
        if (aVar2 == null) {
            wf.a<Float, Float> aVar3 = iVar.W;
            if (aVar3 != null) {
                fFloatValue = aVar3.h().floatValue();
            }
            f11 = f15;
            i12 = -1;
            i13 = 0;
            while (i13 < size) {
                String str = listB0.get(i13);
                pointF = bVar2.f1012m;
                if (pointF == null) {
                    f12 = BitmapDescriptorFactory.HUE_RED;
                } else {
                    f12 = pointF.x;
                }
                listG0 = iVar.g0(str, f12, cVar, fFloatValue2, f11, true);
                i14 = 0;
                while (i14 < listG0.size()) {
                    dVar = listG0.get(i14);
                    i12++;
                    canvas.save();
                    if (iVar.f0(canvas, bVar2, i12, dVar.f60599b)) {
                        float f16 = fFloatValue2;
                        ag.b bVar3 = bVar2;
                        f13 = f11;
                        f14 = fG;
                        iVar.W(dVar.f60598a, bVar3, cVar, canvas, f14, f16, f13, i11);
                        fFloatValue2 = f16;
                    } else {
                        f13 = f11;
                        f14 = fG;
                    }
                    canvas.restore();
                    i14++;
                    iVar = this;
                    fG = f14;
                    f11 = f13;
                    bVar2 = bVar;
                }
                i13++;
                iVar = this;
                f11 = f11;
                bVar2 = bVar;
            }
        }
        fFloatValue = aVar2.h().floatValue();
        f15 += fFloatValue;
        f11 = f15;
        i12 = -1;
        i13 = 0;
        while (i13 < size) {
            String str2 = listB0.get(i13);
            pointF = bVar2.f1012m;
            if (pointF == null) {
                f12 = BitmapDescriptorFactory.HUE_RED;
            } else {
                f12 = pointF.x;
            }
            listG0 = iVar.g0(str2, f12, cVar, fFloatValue2, f11, true);
            i14 = 0;
            while (i14 < listG0.size()) {
                dVar = listG0.get(i14);
                i12++;
                canvas.save();
                if (iVar.f0(canvas, bVar2, i12, dVar.f60599b)) {
                    float f17 = fFloatValue2;
                    ag.b bVar4 = bVar2;
                    f13 = f11;
                    f14 = fG;
                    iVar.W(dVar.f60598a, bVar4, cVar, canvas, f14, f17, f13, i11);
                    fFloatValue2 = f17;
                } else {
                    f13 = f11;
                    f14 = fG;
                }
                canvas.restore();
                i14++;
                iVar = this;
                fG = f14;
                f11 = f13;
                bVar2 = bVar;
            }
            i13++;
            iVar = this;
            f11 = f11;
            bVar2 = bVar;
        }
    }

    private d Z(int i11) {
        for (int size = this.L.size(); size < i11; size++) {
            this.L.add(new d(null));
        }
        return this.L.get(i11 - 1);
    }

    private List<vf.d> a0(ag.d dVar) {
        if (this.J.containsKey(dVar)) {
            return this.J.get(dVar);
        }
        List<q> listA = dVar.a();
        int size = listA.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new vf.d(this.N, this, listA.get(i11), this.O));
        }
        this.J.put(dVar, arrayList);
        return arrayList;
    }

    private List<String> b0(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    private Typeface c0(ag.c cVar) {
        Typeface typefaceH;
        wf.a<Typeface, Typeface> aVar = this.f60591a0;
        if (aVar != null && (typefaceH = aVar.h()) != null) {
            return typefaceH;
        }
        Typeface typefaceF0 = this.N.f0(cVar);
        return typefaceF0 != null ? typefaceF0 : cVar.d();
    }

    private boolean d0(int i11) {
        int length = this.M.h().f1000a.length();
        wf.a<Integer, Integer> aVar = this.f60592b0;
        if (aVar == null || this.f60593c0 == null) {
            return true;
        }
        int iMin = Math.min(aVar.h().intValue(), this.f60593c0.h().intValue());
        int iMax = Math.max(this.f60592b0.h().intValue(), this.f60593c0.h().intValue());
        wf.a<Integer, Integer> aVar2 = this.f60594d0;
        if (aVar2 != null) {
            int iIntValue = aVar2.h().intValue();
            iMin += iIntValue;
            iMax += iIntValue;
        }
        if (this.P == u.INDEX) {
            return i11 >= iMin && i11 < iMax;
        }
        float f11 = (i11 / length) * 100.0f;
        return f11 >= ((float) iMin) && f11 < ((float) iMax);
    }

    private boolean e0(int i11) {
        return Character.getType(i11) == 16 || Character.getType(i11) == 27 || Character.getType(i11) == 6 || Character.getType(i11) == 28 || Character.getType(i11) == 8 || Character.getType(i11) == 19;
    }

    private boolean f0(Canvas canvas, ag.b bVar, int i11, float f11) {
        PointF pointF = bVar.f1011l;
        PointF pointF2 = bVar.f1012m;
        float fE = hg.l.e();
        float f12 = BitmapDescriptorFactory.HUE_RED;
        float f13 = (i11 * bVar.f1005f * fE) + (pointF == null ? 0.0f : (bVar.f1005f * fE) + pointF.y);
        if (this.N.L() && pointF2 != null && pointF != null && f13 >= pointF.y + pointF2.y + bVar.f1002c) {
            return false;
        }
        float f14 = pointF == null ? 0.0f : pointF.x;
        if (pointF2 != null) {
            f12 = pointF2.x;
        }
        int i12 = c.f60597a[bVar.f1003d.ordinal()];
        if (i12 == 1) {
            canvas.translate(f14, f13);
        } else if (i12 == 2) {
            canvas.translate((f14 + f12) - f11, f13);
        } else if (i12 == 3) {
            canvas.translate((f14 + (f12 / 2.0f)) - (f11 / 2.0f), f13);
        }
        return true;
    }

    private List<d> g0(String str, float f11, ag.c cVar, float f12, float f13, boolean z11) {
        float fMeasureText;
        int i11 = 0;
        int i12 = 0;
        boolean z12 = false;
        int i13 = 0;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        for (int i14 = 0; i14 < str.length(); i14++) {
            char cCharAt = str.charAt(i14);
            if (z11) {
                ag.d dVarE = this.O.c().e(ag.d.c(cCharAt, cVar.a(), cVar.c()));
                if (dVarE != null) {
                    fMeasureText = ((float) dVarE.b()) * f12 * hg.l.e();
                }
            } else {
                fMeasureText = this.H.measureText(str.substring(i14, i14 + 1));
            }
            float f17 = fMeasureText + f13;
            if (cCharAt == ' ') {
                z12 = true;
                f16 = f17;
            } else if (z12) {
                z12 = false;
                i13 = i14;
                f15 = f17;
            } else {
                f15 += f17;
            }
            f14 += f17;
            if (f11 > BitmapDescriptorFactory.HUE_RED && f14 >= f11 && cCharAt != ' ') {
                i11++;
                d dVarZ = Z(i11);
                if (i13 == i12) {
                    String strSubstring = str.substring(i12, i14);
                    String strTrim = strSubstring.trim();
                    dVarZ.c(strTrim, (f14 - f17) - ((strTrim.length() - strSubstring.length()) * f16));
                    i12 = i14;
                    i13 = i12;
                    f14 = f17;
                    f15 = f14;
                } else {
                    String strSubstring2 = str.substring(i12, i13 - 1);
                    String strTrim2 = strSubstring2.trim();
                    dVarZ.c(strTrim2, ((f14 - f15) - ((strSubstring2.length() - strTrim2.length()) * f16)) - f16);
                    f14 = f15;
                    i12 = i13;
                }
            }
        }
        if (f14 > BitmapDescriptorFactory.HUE_RED) {
            i11++;
            Z(i11).c(str.substring(i12), f14);
        }
        return this.L.subList(0, i11);
    }

    @Override // dg.b, vf.e
    public void b(RectF rectF, Matrix matrix, boolean z11) {
        super.b(rectF, matrix, z11);
        rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.O.b().width(), this.O.b().height());
    }

    @Override // dg.b, ag.f
    public <T> void g(T t11, ig.c<T> cVar) {
        super.g(t11, cVar);
        if (t11 == d0.f113272a) {
            wf.a<Integer, Integer> aVar = this.R;
            if (aVar != null) {
                H(aVar);
            }
            if (cVar == null) {
                this.R = null;
                return;
            }
            wf.q qVar = new wf.q(cVar);
            this.R = qVar;
            qVar.a(this);
            j(this.R);
            return;
        }
        if (t11 == d0.f113273b) {
            wf.a<Integer, Integer> aVar2 = this.T;
            if (aVar2 != null) {
                H(aVar2);
            }
            if (cVar == null) {
                this.T = null;
                return;
            }
            wf.q qVar2 = new wf.q(cVar);
            this.T = qVar2;
            qVar2.a(this);
            j(this.T);
            return;
        }
        if (t11 == d0.f113290s) {
            wf.a<Float, Float> aVar3 = this.V;
            if (aVar3 != null) {
                H(aVar3);
            }
            if (cVar == null) {
                this.V = null;
                return;
            }
            wf.q qVar3 = new wf.q(cVar);
            this.V = qVar3;
            qVar3.a(this);
            j(this.V);
            return;
        }
        if (t11 == d0.f113291t) {
            wf.a<Float, Float> aVar4 = this.X;
            if (aVar4 != null) {
                H(aVar4);
            }
            if (cVar == null) {
                this.X = null;
                return;
            }
            wf.q qVar4 = new wf.q(cVar);
            this.X = qVar4;
            qVar4.a(this);
            j(this.X);
            return;
        }
        if (t11 == d0.F) {
            wf.a<Float, Float> aVar5 = this.Z;
            if (aVar5 != null) {
                H(aVar5);
            }
            if (cVar == null) {
                this.Z = null;
                return;
            }
            wf.q qVar5 = new wf.q(cVar);
            this.Z = qVar5;
            qVar5.a(this);
            j(this.Z);
            return;
        }
        if (t11 != d0.M) {
            if (t11 == d0.O) {
                this.M.s(cVar);
                return;
            }
            return;
        }
        wf.a<Typeface, Typeface> aVar6 = this.f60591a0;
        if (aVar6 != null) {
            H(aVar6);
        }
        if (cVar == null) {
            this.f60591a0 = null;
            return;
        }
        wf.q qVar6 = new wf.q(cVar);
        this.f60591a0 = qVar6;
        qVar6.a(this);
        j(this.f60591a0);
    }

    @Override // dg.b
    void u(Canvas canvas, Matrix matrix, int i11, hg.b bVar) {
        Canvas canvas2;
        ag.b bVarH = this.M.h();
        ag.c cVar = this.O.g().get(bVarH.f1001b);
        if (cVar == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        Q(bVarH, i11, 0);
        if (this.N.e1()) {
            canvas2 = canvas;
            Y(bVarH, matrix, cVar, canvas2, i11);
        } else {
            canvas2 = canvas;
            X(bVarH, cVar, canvas2, i11);
        }
        canvas2.restore();
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f60598a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f60599b;

        private d() {
            this.f60598a = "";
            this.f60599b = BitmapDescriptorFactory.HUE_RED;
        }

        void c(String str, float f11) {
            this.f60598a = str;
            this.f60599b = f11;
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }
}
