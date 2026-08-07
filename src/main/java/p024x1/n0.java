package p024x1;

import androidx.collection.j0;
import androidx.collection.s0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR$\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u001a"}, d2 = {"Lx1/n0;", "", "<init>", "()V", "", "new", "current", DateTokenConverter.CONVERTER_KEY, "(JJ)J", "Landroidx/collection/j0;", "a", "Landroidx/collection/j0;", "f", "()Landroidx/collection/j0;", "averageCompositionTimeNanosByContentType", "b", "h", "averageMeasureTimeNanosByContentType", "<set-?>", "c", "J", "e", "()J", "averageCompositionTimeNanos", "g", "averageMeasureTimeNanos", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j0<Object> averageCompositionTimeNanosByContentType = s0.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j0<Object> averageMeasureTimeNanosByContentType = s0.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long averageCompositionTimeNanos;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long averageMeasureTimeNanos;

    /* JADX INFO: Access modifiers changed from: private */
    public final long d(long j11, long current) {
        if (current == 0) {
            return j11;
        }
        long j12 = 4;
        return ((current / j12) * ((long) 3)) + (j11 / j12);
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getAverageCompositionTimeNanos() {
        return this.averageCompositionTimeNanos;
    }

    public final j0<Object> f() {
        return this.averageCompositionTimeNanosByContentType;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getAverageMeasureTimeNanos() {
        return this.averageMeasureTimeNanos;
    }

    public final j0<Object> h() {
        return this.averageMeasureTimeNanosByContentType;
    }
}
