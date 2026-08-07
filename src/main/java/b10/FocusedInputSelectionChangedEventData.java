package b10;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: b10.d, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b\u0019\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0011R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0016\u0010\u0011¨\u0006 "}, d2 = {"Lb10/d;", "", "", "target", "", "startX", "startY", "endX", "endY", "start", "end", "<init>", "(IDDDDII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "g", "b", "D", "e", "()D", "c", "f", DateTokenConverter.CONVERTER_KEY, "react-native-keyboard-controller_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FocusedInputSelectionChangedEventData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int target;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final double startX;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final double startY;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final double endX;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final double endY;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final int start;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final int end;

    public FocusedInputSelectionChangedEventData(int i11, double d11, double d12, double d13, double d14, int i12, int i13) {
        this.target = i11;
        this.startX = d11;
        this.startY = d12;
        this.endX = d13;
        this.endY = d14;
        this.start = i12;
        this.end = i13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getEnd() {
        return this.end;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getEndX() {
        return this.endX;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final double getEndY() {
        return this.endY;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final double getStartX() {
        return this.startX;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FocusedInputSelectionChangedEventData)) {
            return false;
        }
        FocusedInputSelectionChangedEventData focusedInputSelectionChangedEventData = (FocusedInputSelectionChangedEventData) other;
        return this.target == focusedInputSelectionChangedEventData.target && Double.compare(this.startX, focusedInputSelectionChangedEventData.startX) == 0 && Double.compare(this.startY, focusedInputSelectionChangedEventData.startY) == 0 && Double.compare(this.endX, focusedInputSelectionChangedEventData.endX) == 0 && Double.compare(this.endY, focusedInputSelectionChangedEventData.endY) == 0 && this.start == focusedInputSelectionChangedEventData.start && this.end == focusedInputSelectionChangedEventData.end;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final double getStartY() {
        return this.startY;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getTarget() {
        return this.target;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.target) * 31) + Double.hashCode(this.startX)) * 31) + Double.hashCode(this.startY)) * 31) + Double.hashCode(this.endX)) * 31) + Double.hashCode(this.endY)) * 31) + Integer.hashCode(this.start)) * 31) + Integer.hashCode(this.end);
    }

    public String toString() {
        return "FocusedInputSelectionChangedEventData(target=" + this.target + ", startX=" + this.startX + ", startY=" + this.startY + ", endX=" + this.endX + ", endY=" + this.endY + ", start=" + this.start + ", end=" + this.end + ")";
    }
}
