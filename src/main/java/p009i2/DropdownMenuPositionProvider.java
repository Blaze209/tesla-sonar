package p009i2;

import androidx.compose.ui.window.r;
import ch.qos.logback.core.CoreConstants;
import ho0.i;
import ho0.l;
import java.util.Iterator;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import w4.d;
import w4.j;
import w4.o;
import w4.t;
import wn0.p;

/* JADX INFO: renamed from: i2.p0, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001a\b\u0002\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ2\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\rH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R)\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, d2 = {"Li2/p0;", "Landroidx/compose/ui/window/r;", "Lw4/j;", "contentOffset", "Lw4/d;", "density", "Lkotlin/Function2;", "Lw4/p;", "Ljn0/h0;", "onPositionCalculated", "<init>", "(JLw4/d;Lwn0/p;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "anchorBounds", "Lw4/r;", "windowSize", "Lw4/t;", "layoutDirection", "popupContentSize", "Lw4/n;", "a", "(Lw4/p;JLw4/t;J)J", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getContentOffset-RKDOV3M", "()J", "b", "Lw4/d;", "getDensity", "()Lw4/d;", "c", "Lwn0/p;", "getOnPositionCalculated", "()Lwn0/p;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class DropdownMenuPositionProvider implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long contentOffset;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final d density;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final p<w4.p, w4.p, h0> onPositionCalculated;

    public /* synthetic */ DropdownMenuPositionProvider(long j11, d dVar, p pVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, dVar, pVar);
    }

    @Override // androidx.compose.ui.window.r
    public long a(w4.p anchorBounds, long windowSize, t layoutDirection, long popupContentSize) {
        i iVarV;
        Object obj;
        Object next;
        int iI1 = this.density.i1(m1.h());
        int iI2 = this.density.i1(j.e(this.contentOffset));
        t tVar = t.Ltr;
        int i11 = iI2 * (layoutDirection == tVar ? 1 : -1);
        int iI3 = this.density.i1(j.f(this.contentOffset));
        int left = anchorBounds.getLeft() + i11;
        int right = (anchorBounds.getRight() - w4.r.g(popupContentSize)) + i11;
        int iG = w4.r.g(windowSize) - w4.r.g(popupContentSize);
        if (layoutDirection == tVar) {
            Integer numValueOf = Integer.valueOf(left);
            Integer numValueOf2 = Integer.valueOf(right);
            if (anchorBounds.getLeft() < 0) {
                iG = 0;
            }
            iVarV = l.v(numValueOf, numValueOf2, Integer.valueOf(iG));
        } else {
            Integer numValueOf3 = Integer.valueOf(right);
            Integer numValueOf4 = Integer.valueOf(left);
            if (anchorBounds.getRight() <= w4.r.g(windowSize)) {
                iG = 0;
            }
            iVarV = l.v(numValueOf3, numValueOf4, Integer.valueOf(iG));
        }
        Iterator it = iVarV.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            int iIntValue = ((Number) next).intValue();
            if (iIntValue >= 0 && iIntValue + w4.r.g(popupContentSize) <= w4.r.g(windowSize)) {
                break;
            }
        }
        Integer num = (Integer) next;
        if (num != null) {
            right = num.intValue();
        }
        int iMax = Math.max(anchorBounds.getBottom() + iI3, iI1);
        int top = (anchorBounds.getTop() - w4.r.f(popupContentSize)) + iI3;
        for (Object obj2 : l.v(Integer.valueOf(iMax), Integer.valueOf(top), Integer.valueOf((anchorBounds.getTop() - (w4.r.f(popupContentSize) / 2)) + iI3), Integer.valueOf((w4.r.f(windowSize) - w4.r.f(popupContentSize)) - iI1))) {
            int iIntValue2 = ((Number) obj2).intValue();
            if (iIntValue2 >= iI1 && iIntValue2 + w4.r.f(popupContentSize) <= w4.r.f(windowSize) - iI1) {
                obj = obj2;
                break;
            }
        }
        Integer num2 = (Integer) obj;
        if (num2 != null) {
            top = num2.intValue();
        }
        this.onPositionCalculated.invoke(anchorBounds, new w4.p(right, top, w4.r.g(popupContentSize) + right, w4.r.f(popupContentSize) + top));
        return o.a(right, top);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DropdownMenuPositionProvider)) {
            return false;
        }
        DropdownMenuPositionProvider dropdownMenuPositionProvider = (DropdownMenuPositionProvider) other;
        return j.d(this.contentOffset, dropdownMenuPositionProvider.contentOffset) && s.f(this.density, dropdownMenuPositionProvider.density) && s.f(this.onPositionCalculated, dropdownMenuPositionProvider.onPositionCalculated);
    }

    public int hashCode() {
        return (((j.g(this.contentOffset) * 31) + this.density.hashCode()) * 31) + this.onPositionCalculated.hashCode();
    }

    public String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) j.h(this.contentOffset)) + ", density=" + this.density + ", onPositionCalculated=" + this.onPositionCalculated + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private DropdownMenuPositionProvider(long j11, d dVar, p<? super w4.p, ? super w4.p, h0> pVar) {
        this.contentOffset = j11;
        this.density = dVar;
        this.onPositionCalculated = pVar;
    }
}
