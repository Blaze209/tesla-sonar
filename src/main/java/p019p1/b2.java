package p019p1;

import androidx.collection.m;
import androidx.collection.o;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p019p1.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BE\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0002¢\u0006\u0004\b!\u0010\"J/\u0010%\u001a\u00028\u00002\u0006\u0010$\u001a\u00020#2\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b%\u0010&J/\u0010'\u001a\u00028\u00002\u0006\u0010$\u001a\u00020#2\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b'\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R \u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.R\u001a\u0010\u000b\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010-\u001a\u0004\b/\u0010.R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u00100R\u001a\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b1\u0010-R\u0016\u00104\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00103R\u0016\u00107\u001a\u0002058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u00106R\u0016\u00109\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u00108R\u0016\u0010:\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u00108R\u0016\u0010;\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u00108R\u0016\u0010=\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u00108R\u0016\u0010?\u001a\u0002058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b>\u00106R\u0016\u0010A\u001a\u0002058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b@\u00106R\u0016\u0010E\u001a\u00020B8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bC\u0010D\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006F"}, d2 = {"Lp1/b2;", "Lp1/q;", "V", "Lp1/v1;", "Landroidx/collection/m;", "timestamps", "Landroidx/collection/o;", "Lp1/a2;", "keyframes", "", "durationMillis", "delayMillis", "Lp1/d0;", "defaultEasing", "Lp1/t;", "initialArcMode", "<init>", "(Landroidx/collection/m;Landroidx/collection/o;IILp1/d0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "initialValue", "targetValue", "initialVelocity", "Ljn0/h0;", "k", "(Lp1/q;Lp1/q;Lp1/q;)V", "timeMillis", "", IntegerTokenConverter.CONVERTER_KEY, "(I)F", "index", "", "asFraction", "j", "(IIZ)F", "h", "(I)I", "", "playTimeNanos", "e", "(JLp1/q;Lp1/q;Lp1/q;)Lp1/q;", DateTokenConverter.CONVERTER_KEY, "a", "Landroidx/collection/m;", "b", "Landroidx/collection/o;", "c", "I", "()I", "g", "Lp1/d0;", "f", "", "[I", "modes", "", "[F", "times", "Lp1/q;", "valueVector", "velocityVector", "lastInitialValue", "l", "lastTargetValue", "m", "posArray", "n", "slopeArray", "Lp1/u;", "o", "Lp1/u;", "arcSpline", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b2<V extends q> implements v1<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final m timestamps;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final o<VectorizedKeyframeSpecElementInfo<V>> keyframes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int durationMillis;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int delayMillis;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final d0 defaultEasing;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int initialArcMode;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int[] modes;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private float[] times;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private V valueVector;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private V velocityVector;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private V lastInitialValue;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private V lastTargetValue;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private float[] posArray;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private float[] slopeArray;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private u arcSpline;

    public /* synthetic */ b2(m mVar, o oVar, int i11, int i12, d0 d0Var, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(mVar, oVar, i11, i12, d0Var, i13);
    }

    private final int h(int timeMillis) {
        int iB = p0.b(this.timestamps, timeMillis, 0, 0, 6, null);
        return iB < -1 ? -(iB + 2) : iB;
    }

    private final float i(int timeMillis) {
        return j(h(timeMillis), timeMillis, false);
    }

    private final float j(int index, int timeMillis, boolean asFraction) {
        d0 easing;
        float f11;
        m mVar = this.timestamps;
        if (index >= mVar._size - 1) {
            f11 = timeMillis;
        } else {
            int iA = mVar.a(index);
            int iA2 = this.timestamps.a(index + 1);
            if (timeMillis == iA) {
                f11 = iA;
            } else {
                int i11 = iA2 - iA;
                VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfoC = this.keyframes.c(iA);
                if (vectorizedKeyframeSpecElementInfoC == null || (easing = vectorizedKeyframeSpecElementInfoC.getEasing()) == null) {
                    easing = this.defaultEasing;
                }
                float f12 = i11;
                float fA = easing.a((timeMillis - iA) / f12);
                if (asFraction) {
                    return fA;
                }
                f11 = (f12 * fA) + iA;
            }
        }
        return f11 / 1000;
    }

    private final void k(V initialValue, V targetValue, V initialVelocity) {
        float[] fArr;
        float[] fArr2;
        boolean z11 = this.arcSpline != null;
        if (this.valueVector == null) {
            this.valueVector = (V) r.g(initialValue);
            this.velocityVector = (V) r.g(initialVelocity);
            int i11 = this.timestamps.get_size();
            float[] fArr3 = new float[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                fArr3[i12] = this.timestamps.a(i12) / 1000;
            }
            this.times = fArr3;
            int i13 = this.timestamps.get_size();
            int[] iArr = new int[i13];
            for (int i14 = 0; i14 < i13; i14++) {
                VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfoC = this.keyframes.c(this.timestamps.a(i14));
                int arcMode = vectorizedKeyframeSpecElementInfoC != null ? vectorizedKeyframeSpecElementInfoC.getArcMode() : this.initialArcMode;
                if (!t.c(arcMode, t.INSTANCE.a())) {
                    z11 = true;
                }
                iArr[i14] = arcMode;
            }
            this.modes = iArr;
        }
        if (z11) {
            float[] fArr4 = null;
            if (this.arcSpline != null) {
                V v11 = this.lastInitialValue;
                if (v11 == null) {
                    s.B("lastInitialValue");
                    v11 = null;
                }
                if (s.f(v11, initialValue)) {
                    V v12 = this.lastTargetValue;
                    if (v12 == null) {
                        s.B("lastTargetValue");
                        v12 = null;
                    }
                    if (s.f(v12, targetValue)) {
                        return;
                    }
                }
            }
            this.lastInitialValue = initialValue;
            this.lastTargetValue = targetValue;
            int size = (initialValue.getSize() % 2) + initialValue.getSize();
            this.posArray = new float[size];
            this.slopeArray = new float[size];
            int i15 = this.timestamps.get_size();
            float[][] fArr5 = new float[i15][];
            for (int i16 = 0; i16 < i15; i16++) {
                int iA = this.timestamps.a(i16);
                if (iA != 0) {
                    if (iA != getDurationMillis()) {
                        fArr = new float[size];
                        VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfoC2 = this.keyframes.c(iA);
                        s.h(vectorizedKeyframeSpecElementInfoC2);
                        q qVarC = vectorizedKeyframeSpecElementInfoC2.c();
                        for (int i17 = 0; i17 < size; i17++) {
                            fArr[i17] = qVarC.a(i17);
                        }
                    } else if (this.keyframes.a(iA)) {
                        fArr = new float[size];
                        VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfoC3 = this.keyframes.c(iA);
                        s.h(vectorizedKeyframeSpecElementInfoC3);
                        q qVarC2 = vectorizedKeyframeSpecElementInfoC3.c();
                        for (int i18 = 0; i18 < size; i18++) {
                            fArr[i18] = qVarC2.a(i18);
                        }
                    } else {
                        fArr2 = new float[size];
                        for (int i19 = 0; i19 < size; i19++) {
                            fArr2[i19] = targetValue.a(i19);
                        }
                    }
                    fArr2 = fArr;
                } else if (this.keyframes.a(iA)) {
                    fArr = new float[size];
                    VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfoC4 = this.keyframes.c(iA);
                    s.h(vectorizedKeyframeSpecElementInfoC4);
                    q qVarC3 = vectorizedKeyframeSpecElementInfoC4.c();
                    for (int i21 = 0; i21 < size; i21++) {
                        fArr[i21] = qVarC3.a(i21);
                    }
                    fArr2 = fArr;
                } else {
                    fArr2 = new float[size];
                    for (int i22 = 0; i22 < size; i22++) {
                        fArr2[i22] = initialValue.a(i22);
                    }
                }
                fArr5[i16] = fArr2;
            }
            int[] iArr2 = this.modes;
            if (iArr2 == null) {
                s.B("modes");
                iArr2 = null;
            }
            float[] fArr6 = this.times;
            if (fArr6 == null) {
                s.B("times");
            } else {
                fArr4 = fArr6;
            }
            this.arcSpline = new u(iArr2, fArr4, fArr5);
        }
    }

    @Override // p019p1.v1
    /* JADX INFO: renamed from: c, reason: from getter */
    public int getDurationMillis() {
        return this.durationMillis;
    }

    @Override // p019p1.s1
    public V d(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        long jB = t1.b(this, playTimeNanos / 1000000);
        if (jB < 0) {
            return initialVelocity;
        }
        k(initialValue, targetValue, initialVelocity);
        int i11 = 0;
        if (this.arcSpline == null) {
            q qVarD = t1.d(this, jB - 1, initialValue, targetValue, initialVelocity);
            q qVarD2 = t1.d(this, jB, initialValue, targetValue, initialVelocity);
            int size = qVarD.getSize();
            while (i11 < size) {
                V v11 = this.velocityVector;
                if (v11 == null) {
                    s.B("velocityVector");
                    v11 = null;
                }
                v11.e(i11, (qVarD.a(i11) - qVarD2.a(i11)) * 1000.0f);
                i11++;
            }
            V v12 = this.velocityVector;
            if (v12 != null) {
                return v12;
            }
            s.B("velocityVector");
            return null;
        }
        float fI = i((int) jB);
        u uVar = this.arcSpline;
        if (uVar == null) {
            s.B("arcSpline");
            uVar = null;
        }
        float[] fArr = this.slopeArray;
        if (fArr == null) {
            s.B("slopeArray");
            fArr = null;
        }
        uVar.b(fI, fArr);
        float[] fArr2 = this.slopeArray;
        if (fArr2 == null) {
            s.B("slopeArray");
            fArr2 = null;
        }
        int length = fArr2.length;
        while (i11 < length) {
            V v13 = this.velocityVector;
            if (v13 == null) {
                s.B("velocityVector");
                v13 = null;
            }
            float[] fArr3 = this.slopeArray;
            if (fArr3 == null) {
                s.B("slopeArray");
                fArr3 = null;
            }
            v13.e(i11, fArr3[i11]);
            i11++;
        }
        V v14 = this.velocityVector;
        if (v14 != null) {
            return v14;
        }
        s.B("velocityVector");
        return null;
    }

    @Override // p019p1.s1
    public V e(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        int iB = (int) t1.b(this, playTimeNanos / 1000000);
        if (this.keyframes.a(iB)) {
            VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfoC = this.keyframes.c(iB);
            s.h(vectorizedKeyframeSpecElementInfoC);
            return (V) vectorizedKeyframeSpecElementInfoC.c();
        }
        if (iB >= getDurationMillis()) {
            return targetValue;
        }
        if (iB <= 0) {
            return initialValue;
        }
        k(initialValue, targetValue, initialVelocity);
        int i11 = 0;
        if (this.arcSpline == null) {
            int iH = h(iB);
            float fJ = j(iH, iB, true);
            int iA = this.timestamps.a(iH);
            if (this.keyframes.a(iA)) {
                VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfoC2 = this.keyframes.c(iA);
                s.h(vectorizedKeyframeSpecElementInfoC2);
                initialValue = (V) vectorizedKeyframeSpecElementInfoC2.c();
            }
            int iA2 = this.timestamps.a(iH + 1);
            if (this.keyframes.a(iA2)) {
                VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfoC3 = this.keyframes.c(iA2);
                s.h(vectorizedKeyframeSpecElementInfoC3);
                targetValue = (V) vectorizedKeyframeSpecElementInfoC3.c();
            }
            V v11 = this.valueVector;
            if (v11 == null) {
                s.B("valueVector");
                v11 = null;
            }
            int size = v11.getSize();
            while (i11 < size) {
                V v12 = this.valueVector;
                if (v12 == null) {
                    s.B("valueVector");
                    v12 = null;
                }
                v12.e(i11, r1.k(initialValue.a(i11), targetValue.a(i11), fJ));
                i11++;
            }
            V v13 = this.valueVector;
            if (v13 != null) {
                return v13;
            }
            s.B("valueVector");
            return null;
        }
        float fI = i(iB);
        u uVar = this.arcSpline;
        if (uVar == null) {
            s.B("arcSpline");
            uVar = null;
        }
        float[] fArr = this.posArray;
        if (fArr == null) {
            s.B("posArray");
            fArr = null;
        }
        uVar.a(fI, fArr);
        float[] fArr2 = this.posArray;
        if (fArr2 == null) {
            s.B("posArray");
            fArr2 = null;
        }
        int length = fArr2.length;
        while (i11 < length) {
            V v14 = this.valueVector;
            if (v14 == null) {
                s.B("valueVector");
                v14 = null;
            }
            float[] fArr3 = this.posArray;
            if (fArr3 == null) {
                s.B("posArray");
                fArr3 = null;
            }
            v14.e(i11, fArr3[i11]);
            i11++;
        }
        V v15 = this.valueVector;
        if (v15 != null) {
            return v15;
        }
        s.B("valueVector");
        return null;
    }

    @Override // p019p1.v1
    /* JADX INFO: renamed from: g, reason: from getter */
    public int getDelayMillis() {
        return this.delayMillis;
    }

    private b2(m mVar, o<VectorizedKeyframeSpecElementInfo<V>> oVar, int i11, int i12, d0 d0Var, int i13) {
        this.timestamps = mVar;
        this.keyframes = oVar;
        this.durationMillis = i11;
        this.delayMillis = i12;
        this.defaultEasing = d0Var;
        this.initialArcMode = i13;
    }
}
