package f90;

import com.fourthline.adapters.serialization.OrcaFlavourKeys;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import w4.v;

/* JADX INFO: renamed from: f90.e, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Lf90/e;", "", "", "fontFamily", "Lw4/v;", OrcaFlavourKeys.FONT_SIZE, "<init>", "(Ljava/lang/Integer;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "b", "J", "()J", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PrimaryButtonTypography {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer fontFamily;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long fontSize;

    public /* synthetic */ PrimaryButtonTypography(Integer num, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, j11);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getFontFamily() {
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
        Integer num = this.fontFamily;
        return ((num == null ? 0 : num.hashCode()) * 31) + v.i(this.fontSize);
    }

    public String toString() {
        return "PrimaryButtonTypography(fontFamily=" + this.fontFamily + ", fontSize=" + v.k(this.fontSize) + ")";
    }

    private PrimaryButtonTypography(Integer num, long j11) {
        this.fontFamily = num;
        this.fontSize = j11;
    }
}
