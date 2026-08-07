package kotlin;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import i4.TextLayoutResult;
import j3.g;
import j3.i;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import z3.v;

/* JADX INFO: loaded from: classes.dex */
@p013kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\n\u001a\u00020\t*\u00020\tH\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u000bJ\u001a\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001a\u0010\u001d\"\u0004\b \u0010\u001f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Lb2/c1;", "", "Li4/m0;", "value", "Lz3/v;", "innerTextFieldCoordinates", "decorationBoxCoordinates", "<init>", "(Li4/m0;Lz3/v;Lz3/v;)V", "Lj3/g;", "a", "(J)J", "position", "", "coerceInVisibleBounds", "", DateTokenConverter.CONVERTER_KEY, "(JZ)I", "offset", "g", "(J)Z", "j", "k", "Li4/m0;", "f", "()Li4/m0;", "b", "Lz3/v;", "c", "()Lz3/v;", IntegerTokenConverter.CONVERTER_KEY, "(Lz3/v;)V", "h", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final TextLayoutResult value;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private v innerTextFieldCoordinates;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private v decorationBoxCoordinates;

    public c1(TextLayoutResult textLayoutResult, v vVar, v vVar2) {
        this.value = textLayoutResult;
        this.innerTextFieldCoordinates = vVar;
        this.decorationBoxCoordinates = vVar2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    private final long a(long j11) {
        i iVarA;
        v vVar = this.innerTextFieldCoordinates;
        if (vVar == null) {
            iVarA = i.INSTANCE.a();
        } else {
            if (vVar.b0()) {
                v vVar2 = this.decorationBoxCoordinates;
                iVarA = null;
                if (vVar2 != null) {
                    iVarA = v.A0(vVar2, vVar, false, 2, null);
                }
            } else {
                iVarA = i.INSTANCE.a();
            }
            if (iVarA == null) {
                iVarA = i.INSTANCE.a();
            }
        }
        return d1.b(j11, iVarA);
    }

    public static /* synthetic */ int e(c1 c1Var, long j11, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return c1Var.d(j11, z11);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final v getDecorationBoxCoordinates() {
        return this.decorationBoxCoordinates;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final v getInnerTextFieldCoordinates() {
        return this.innerTextFieldCoordinates;
    }

    public final int d(long position, boolean coerceInVisibleBounds) {
        if (coerceInVisibleBounds) {
            position = a(position);
        }
        return this.value.x(j(position));
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextLayoutResult getValue() {
        return this.value;
    }

    public final boolean g(long offset) {
        long j11 = j(a(offset));
        int iR = this.value.r(g.n(j11));
        return g.m(j11) >= this.value.s(iR) && g.m(j11) <= this.value.t(iR);
    }

    public final void h(v vVar) {
        this.decorationBoxCoordinates = vVar;
    }

    public final void i(v vVar) {
        this.innerTextFieldCoordinates = vVar;
    }

    public final long j(long offset) {
        v vVar;
        v vVar2 = this.innerTextFieldCoordinates;
        if (vVar2 == null) {
            return offset;
        }
        if (!vVar2.b0()) {
            vVar2 = null;
        }
        if (vVar2 == null || (vVar = this.decorationBoxCoordinates) == null) {
            return offset;
        }
        v vVar3 = vVar.b0() ? vVar : null;
        return vVar3 == null ? offset : vVar2.D(vVar3, offset);
    }

    public final long k(long offset) {
        v vVar;
        v vVar2 = this.innerTextFieldCoordinates;
        if (vVar2 == null) {
            return offset;
        }
        if (!vVar2.b0()) {
            vVar2 = null;
        }
        if (vVar2 == null || (vVar = this.decorationBoxCoordinates) == null) {
            return offset;
        }
        v vVar3 = vVar.b0() ? vVar : null;
        return vVar3 == null ? offset : vVar3.D(vVar2, offset);
    }

    public /* synthetic */ c1(TextLayoutResult textLayoutResult, v vVar, v vVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textLayoutResult, (i11 & 2) != 0 ? null : vVar, (i11 & 4) != 0 ? null : vVar2);
    }
}
