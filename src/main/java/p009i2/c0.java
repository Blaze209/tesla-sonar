package p009i2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import k3.p1;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p015o1.u;
import p019p1.j;
import p020r2.l;
import p020r2.n3;
import p020r2.o;
import p020r2.y3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0003\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0019\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0017\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001a\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u001a\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u001a\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b \u0010\u001aR\u001a\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b!\u0010\u001aR\u001a\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\"\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Li2/c0;", "Li2/o;", "Lk3/p1;", "checkedCheckmarkColor", "uncheckedCheckmarkColor", "checkedBoxColor", "uncheckedBoxColor", "disabledCheckedBoxColor", "disabledUncheckedBoxColor", "disabledIndeterminateBoxColor", "checkedBorderColor", "uncheckedBorderColor", "disabledBorderColor", "disabledIndeterminateBorderColor", "<init>", "(JJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lh4/a;", "state", "Lr2/y3;", "c", "(Lh4/a;Lr2/l;I)Lr2/y3;", "", "enabled", "a", "(ZLh4/a;Lr2/l;I)Lr2/y3;", "b", "J", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "h", IntegerTokenConverter.CONVERTER_KEY, "j", "k", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class c0 implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long checkedCheckmarkColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long uncheckedCheckmarkColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long checkedBoxColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long uncheckedBoxColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long disabledCheckedBoxColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long disabledUncheckedBoxColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long disabledIndeterminateBoxColor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long checkedBorderColor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final long uncheckedBorderColor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final long disabledBorderColor;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final long disabledIndeterminateBorderColor;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f74214a;

        static {
            int[] iArr = new int[h4.a.values().length];
            try {
                iArr[h4.a.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h4.a.Indeterminate.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h4.a.Off.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f74214a = iArr;
        }
    }

    public /* synthetic */ c0(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, j13, j14, j15, j16, j17, j18, j19, j21, j22);
    }

    @Override // p009i2.o
    public y3<p1> a(boolean z11, h4.a aVar, l lVar, int i11) {
        long j11;
        l lVar2;
        y3<p1> y3VarO;
        lVar.o(840901029);
        if (o.J()) {
            o.S(840901029, i11, -1, "androidx.compose.material.DefaultCheckboxColors.boxColor (Checkbox.kt:425)");
        }
        if (z11) {
            int i12 = a.f74214a[aVar.ordinal()];
            if (i12 == 1 || i12 == 2) {
                j11 = this.checkedBoxColor;
            } else {
                if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                j11 = this.uncheckedBoxColor;
            }
        } else {
            int i13 = a.f74214a[aVar.ordinal()];
            if (i13 == 1) {
                j11 = this.disabledCheckedBoxColor;
            } else if (i13 == 2) {
                j11 = this.disabledIndeterminateBoxColor;
            } else {
                if (i13 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                j11 = this.disabledUncheckedBoxColor;
            }
        }
        long j12 = j11;
        if (z11) {
            lVar.o(507315190);
            lVar2 = lVar;
            y3VarO = u.a(j12, j.l(aVar == h4.a.Off ? 100 : 50, 0, null, 6, null), null, null, lVar2, 0, 12);
            lVar2.l();
        } else {
            lVar2 = lVar;
            lVar2.o(507495734);
            y3VarO = n3.o(p1.l(j12), lVar2, 0);
            lVar2.l();
        }
        if (o.J()) {
            o.R();
        }
        lVar2.l();
        return y3VarO;
    }

    @Override // p009i2.o
    public y3<p1> b(boolean z11, h4.a aVar, l lVar, int i11) {
        long j11;
        l lVar2;
        y3<p1> y3VarO;
        lVar.o(-1568341342);
        if (o.J()) {
            o.S(-1568341342, i11, -1, "androidx.compose.material.DefaultCheckboxColors.borderColor (Checkbox.kt:450)");
        }
        if (z11) {
            int i12 = a.f74214a[aVar.ordinal()];
            if (i12 == 1 || i12 == 2) {
                j11 = this.checkedBorderColor;
            } else {
                if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                j11 = this.uncheckedBorderColor;
            }
        } else {
            int i13 = a.f74214a[aVar.ordinal()];
            if (i13 == 1) {
                j11 = this.disabledBorderColor;
            } else if (i13 != 2) {
                if (i13 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                j11 = this.disabledBorderColor;
            } else {
                j11 = this.disabledIndeterminateBorderColor;
            }
        }
        long j12 = j11;
        if (z11) {
            lVar.o(-840809961);
            lVar2 = lVar;
            y3VarO = u.a(j12, j.l(aVar == h4.a.Off ? 100 : 50, 0, null, 6, null), null, null, lVar2, 0, 12);
            lVar2.l();
        } else {
            lVar2 = lVar;
            lVar2.o(-840629417);
            y3VarO = n3.o(p1.l(j12), lVar2, 0);
            lVar2.l();
        }
        if (o.J()) {
            o.R();
        }
        lVar2.l();
        return y3VarO;
    }

    @Override // p009i2.o
    public y3<p1> c(h4.a aVar, l lVar, int i11) {
        lVar.o(544656267);
        if (o.J()) {
            o.S(544656267, i11, -1, "androidx.compose.material.DefaultCheckboxColors.checkmarkColor (Checkbox.kt:413)");
        }
        h4.a aVar2 = h4.a.Off;
        y3<p1> y3VarA = u.a(aVar == aVar2 ? this.uncheckedCheckmarkColor : this.checkedCheckmarkColor, j.l(aVar == aVar2 ? 100 : 50, 0, null, 6, null), null, null, lVar, 0, 12);
        if (o.J()) {
            o.R();
        }
        lVar.l();
        return y3VarA;
    }

    private c0(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22) {
        this.checkedCheckmarkColor = j11;
        this.uncheckedCheckmarkColor = j12;
        this.checkedBoxColor = j13;
        this.uncheckedBoxColor = j14;
        this.disabledCheckedBoxColor = j15;
        this.disabledUncheckedBoxColor = j16;
        this.disabledIndeterminateBoxColor = j17;
        this.checkedBorderColor = j18;
        this.uncheckedBorderColor = j19;
        this.disabledBorderColor = j21;
        this.disabledIndeterminateBorderColor = j22;
    }
}
