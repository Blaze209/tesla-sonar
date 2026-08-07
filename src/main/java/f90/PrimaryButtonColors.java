package f90;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.modules.appstate.AppStateModule;
import k3.p1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: f90.b, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u0016R\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0017\u0010\u0016R\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0016R\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0019\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Lf90/b;", "", "Lk3/p1;", AppStateModule.APP_STATE_BACKGROUND, "onBackground", "border", "successBackground", "onSuccessBackground", "<init>", "(JJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PrimaryButtonColors {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long background;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long onBackground;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long border;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final long successBackground;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final long onSuccessBackground;

    public /* synthetic */ PrimaryButtonColors(long j11, long j12, long j13, long j14, long j15, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, j13, j14, j15);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getBackground() {
        return this.background;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getBorder() {
        return this.border;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getOnBackground() {
        return this.onBackground;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getOnSuccessBackground() {
        return this.onSuccessBackground;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getSuccessBackground() {
        return this.successBackground;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrimaryButtonColors)) {
            return false;
        }
        PrimaryButtonColors primaryButtonColors = (PrimaryButtonColors) other;
        return p1.r(this.background, primaryButtonColors.background) && p1.r(this.onBackground, primaryButtonColors.onBackground) && p1.r(this.border, primaryButtonColors.border) && p1.r(this.successBackground, primaryButtonColors.successBackground) && p1.r(this.onSuccessBackground, primaryButtonColors.onSuccessBackground);
    }

    public int hashCode() {
        return (((((((p1.x(this.background) * 31) + p1.x(this.onBackground)) * 31) + p1.x(this.border)) * 31) + p1.x(this.successBackground)) * 31) + p1.x(this.onSuccessBackground);
    }

    public String toString() {
        return "PrimaryButtonColors(background=" + p1.y(this.background) + ", onBackground=" + p1.y(this.onBackground) + ", border=" + p1.y(this.border) + ", successBackground=" + p1.y(this.successBackground) + ", onSuccessBackground=" + p1.y(this.onSuccessBackground) + ")";
    }

    private PrimaryButtonColors(long j11, long j12, long j13, long j14, long j15) {
        this.background = j11;
        this.onBackground = j12;
        this.border = j13;
        this.successBackground = j14;
        this.onSuccessBackground = j15;
    }
}
