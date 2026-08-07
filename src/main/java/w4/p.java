package w4;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0001\u0018B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001a\u0010\u0013R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0019\u0012\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001d\u0010\u0013R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u0019\u0012\u0004\b!\u0010\u001c\u001a\u0004\b \u0010\u0013R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u0019\u0012\u0004\b#\u0010\u001c\u001a\u0004\b\"\u0010\u0013R\u001a\u0010&\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\u001c\u001a\u0004\b$\u0010\u0013R\u001a\u0010)\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\u001c\u001a\u0004\b'\u0010\u0013R \u0010.\u001a\u00020*8FX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b-\u0010\u001c\u001a\u0004\b+\u0010,R\u001a\u00102\u001a\u00020\u00158FX\u0087\u0004¢\u0006\f\u0012\u0004\b1\u0010\u001c\u001a\u0004\b/\u00100R\u0017\u00105\u001a\u0002038Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b4\u0010,\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00066"}, d2 = {"Lw4/p;", "", "", "left", "top", "right", "bottom", "<init>", "(IIII)V", "translateX", "translateY", "m", "(II)Lw4/p;", "", "toString", "()Ljava/lang/String;", "b", "(IIII)Lw4/p;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "f", "getLeft$annotations", "()V", IntegerTokenConverter.CONVERTER_KEY, "getTop$annotations", "c", "g", "getRight$annotations", DateTokenConverter.CONVERTER_KEY, "getBottom$annotations", "k", "getWidth$annotations", Snapshot.WIDTH, "e", "getHeight$annotations", Snapshot.HEIGHT, "Lw4/r;", "h", "()J", "getSize-YbymL2g$annotations", "size", "l", "()Z", "isEmpty$annotations", "isEmpty", "Lw4/n;", "j", "topLeft", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class p {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final p f120734f = new p(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int left;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int top;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int right;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int bottom;

    /* JADX INFO: renamed from: w4.p$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lw4/p$a;", "", "<init>", "()V", "Lw4/p;", "Zero", "Lw4/p;", "a", "()Lw4/p;", "getZero$annotations", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final p a() {
            return p.f120734f;
        }

        private Companion() {
        }
    }

    public p(int i11, int i12, int i13, int i14) {
        this.left = i11;
        this.top = i12;
        this.right = i13;
        this.bottom = i14;
    }

    public static /* synthetic */ p c(p pVar, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = pVar.left;
        }
        if ((i15 & 2) != 0) {
            i12 = pVar.top;
        }
        if ((i15 & 4) != 0) {
            i13 = pVar.right;
        }
        if ((i15 & 8) != 0) {
            i14 = pVar.bottom;
        }
        return pVar.b(i11, i12, i13, i14);
    }

    public final p b(int left, int top, int right, int bottom) {
        return new p(left, top, right, bottom);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getBottom() {
        return this.bottom;
    }

    public final int e() {
        return this.bottom - this.top;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof p)) {
            return false;
        }
        p pVar = (p) other;
        return this.left == pVar.left && this.top == pVar.top && this.right == pVar.right && this.bottom == pVar.bottom;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getLeft() {
        return this.left;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getRight() {
        return this.right;
    }

    public final long h() {
        return s.a(k(), e());
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.left) * 31) + Integer.hashCode(this.top)) * 31) + Integer.hashCode(this.right)) * 31) + Integer.hashCode(this.bottom);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getTop() {
        return this.top;
    }

    public final long j() {
        return o.a(this.left, this.top);
    }

    public final int k() {
        return this.right - this.left;
    }

    public final boolean l() {
        return this.left >= this.right || this.top >= this.bottom;
    }

    public final p m(int translateX, int translateY) {
        return new p(this.left + translateX, this.top + translateY, this.right + translateX, this.bottom + translateY);
    }

    public String toString() {
        return "IntRect.fromLTRB(" + this.left + ", " + this.top + ", " + this.right + ", " + this.bottom + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
