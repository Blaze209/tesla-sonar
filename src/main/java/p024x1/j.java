package p024x1;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import t2.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Lx1/j;", "", "<init>", "()V", "", "start", "end", "Lx1/j$a;", "a", "(II)Lx1/j$a;", "interval", "Ljn0/h0;", "e", "(Lx1/j$a;)V", "", DateTokenConverter.CONVERTER_KEY, "()Z", "Lt2/b;", "Lt2/b;", "beyondBoundsItems", "c", "()I", "b", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f122613b = b.f112081d;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b<Interval> beyondBoundsItems = new b<>(new Interval[16], 0);

    /* JADX INFO: renamed from: x1.j$a, reason: from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0013"}, d2 = {"Lx1/j$a;", "", "", "start", "end", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Interval {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int start;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int end;

        public Interval(int i11, int i12) {
            this.start = i11;
            this.end = i12;
            if (i11 < 0) {
                throw new IllegalArgumentException("negative start index");
            }
            if (i12 < i11) {
                throw new IllegalArgumentException("end index greater than start");
            }
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getEnd() {
            return this.end;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getStart() {
            return this.start;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Interval)) {
                return false;
            }
            Interval interval = (Interval) other;
            return this.start == interval.start && this.end == interval.end;
        }

        public int hashCode() {
            return (Integer.hashCode(this.start) * 31) + Integer.hashCode(this.end);
        }

        public String toString() {
            return "Interval(start=" + this.start + ", end=" + this.end + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public final Interval a(int start, int end) {
        Interval interval = new Interval(start, end);
        this.beyondBoundsItems.b(interval);
        return interval;
    }

    public final int b() {
        int end = this.beyondBoundsItems.l().getEnd();
        b<Interval> bVar = this.beyondBoundsItems;
        int size = bVar.getSize();
        if (size > 0) {
            Interval[] intervalArrM = bVar.m();
            int i11 = 0;
            do {
                Interval interval = intervalArrM[i11];
                if (interval.getEnd() > end) {
                    end = interval.getEnd();
                }
                i11++;
            } while (i11 < size);
        }
        return end;
    }

    public final int c() {
        int start = this.beyondBoundsItems.l().getStart();
        b<Interval> bVar = this.beyondBoundsItems;
        int size = bVar.getSize();
        if (size > 0) {
            Interval[] intervalArrM = bVar.m();
            int i11 = 0;
            do {
                Interval interval = intervalArrM[i11];
                if (interval.getStart() < start) {
                    start = interval.getStart();
                }
                i11++;
            } while (i11 < size);
        }
        if (start >= 0) {
            return start;
        }
        throw new IllegalArgumentException("negative minIndex");
    }

    public final boolean d() {
        return this.beyondBoundsItems.q();
    }

    public final void e(Interval interval) {
        this.beyondBoundsItems.t(interval);
    }
}
