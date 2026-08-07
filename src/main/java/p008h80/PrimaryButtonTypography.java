package p008h80;

import com.fourthline.adapters.serialization.OrcaFlavourKeys;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p014n4.q;
import w4.v;

/* JADX INFO: renamed from: h80.p0, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Lh80/p0;", "", "Ln4/q;", "fontFamily", "Lw4/v;", OrcaFlavourKeys.FONT_SIZE, "<init>", "(Ln4/q;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln4/q;", "()Ln4/q;", "b", "J", "()J", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PrimaryButtonTypography {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final q fontFamily;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long fontSize;

    public /* synthetic */ PrimaryButtonTypography(q qVar, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(qVar, j11);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final q getFontFamily() {
        return this.fontFamily;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getFontSize() {
        return this.fontSize;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrimaryButtonTypography)) {
            return false;
        }
        PrimaryButtonTypography primaryButtonTypography = (PrimaryButtonTypography) other;
        return s.f(this.fontFamily, primaryButtonTypography.fontFamily) && v.e(this.fontSize, primaryButtonTypography.fontSize);
    }

    public int hashCode() {
        q qVar = this.fontFamily;
        return ((qVar == null ? 0 : qVar.hashCode()) * 31) + v.i(this.fontSize);
    }

    public String toString() {
        return "PrimaryButtonTypography(fontFamily=" + this.fontFamily + ", fontSize=" + v.k(this.fontSize) + ")";
    }

    private PrimaryButtonTypography(q qVar, long j11) {
        this.fontFamily = qVar;
        this.fontSize = j11;
    }

    public /* synthetic */ PrimaryButtonTypography(q qVar, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : qVar, (i11 & 2) != 0 ? v.INSTANCE.a() : j11, null);
    }
}
