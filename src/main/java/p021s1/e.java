package p021s1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import p019p1.CubicBezierEasing;
import p019p1.i;
import p019p1.j;
import p020r2.g2;
import p020r2.v;
import p020r2.w;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\"&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0002\u0010\u0004\" \u0010\f\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\u000b\u0010\u0006\u001a\u0004\b\b\u0010\n¨\u0006\r"}, d2 = {"Lr2/g2;", "Ls1/d;", "a", "Lr2/g2;", "()Lr2/g2;", "getLocalBringIntoViewSpec$annotations", "()V", "LocalBringIntoViewSpec", "b", "Ls1/d;", "()Ls1/d;", "getPivotBringIntoViewSpec$annotations", "PivotBringIntoViewSpec", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g2<d> f109460a = w.e(a.f109462c);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d f109461b = new b();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr2/v;", "Ls1/d;", "a", "(Lr2/v;)Ls1/d;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements l<v, d> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f109462c = new a();

        a() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d invoke(v vVar) {
            return !((Context) vVar.a(AndroidCompositionLocals_androidKt.g())).getPackageManager().hasSystemFeature("android.software.leanback") ? d.INSTANCE.b() : e.b();
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0006\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"s1/e$b", "Ls1/d;", "", "offset", "size", "containerSize", "b", "(FFF)F", Gender.FEMALE, "getParentFraction", "()F", "parentFraction", "c", "getChildFraction", "childFraction", "Lp1/i;", DateTokenConverter.CONVERTER_KEY, "Lp1/i;", "a", "()Lp1/i;", "scrollAnimationSpec", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements d {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final float childFraction;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final float parentFraction = 0.3f;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final i<Float> scrollAnimationSpec = j.l(125, 0, new CubicBezierEasing(0.25f, 0.1f, 0.25f, 1.0f), 2, null);

        b() {
        }

        @Override // p021s1.d
        public i<Float> a() {
            return this.scrollAnimationSpec;
        }

        @Override // p021s1.d
        public float b(float offset, float size, float containerSize) {
            float fAbs = Math.abs((size + offset) - offset);
            boolean z11 = fAbs <= containerSize;
            float f11 = (this.parentFraction * containerSize) - (this.childFraction * fAbs);
            float f12 = containerSize - f11;
            if (z11 && f12 < fAbs) {
                f11 = containerSize - fAbs;
            }
            return offset - f11;
        }
    }

    public static final g2<d> a() {
        return f109460a;
    }

    public static final d b() {
        return f109461b;
    }
}
