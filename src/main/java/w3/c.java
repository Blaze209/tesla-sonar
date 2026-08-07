package w3;

import bo0.n;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014B\u001d\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0013¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001d\u001a\u0004\b\u0003\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001fR\u0014\u0010!\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010 R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010$R\u0016\u0010&\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010 R\u0014\u0010)\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010(R\u0014\u0010-\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010(¨\u0006."}, d2 = {"Lw3/c;", "", "", "isDataDifferential", "Lw3/c$a;", "strategy", "<init>", "(ZLw3/c$a;)V", "", "dataPoints", "time", "", "sampleCount", "", "b", "([F[FI)F", "", "timeMillis", "dataPoint", "Ljn0/h0;", "a", "(JF)V", "c", "()F", "maximumVelocity", DateTokenConverter.CONVERTER_KEY, "(F)F", "e", "()V", "Z", "()Z", "Lw3/c$a;", "I", "minSampleSize", "", "Lw3/a;", "[Lw3/a;", "samples", "index", "f", "[F", "reusableDataPointsArray", "g", "reusableTimeArray", "h", "reusableVelocityCoefficients", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isDataDifferential;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a strategy;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int minSampleSize;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final DataPointAtTime[] samples;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int index;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final float[] reusableDataPointsArray;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final float[] reusableTimeArray;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final float[] reusableVelocityCoefficients;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lw3/c$a;", "", "<init>", "(Ljava/lang/String;I)V", "Lsq2", "Impulse", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum a {
        Lsq2,
        Impulse
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f120537a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.Impulse.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.Lsq2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f120537a = iArr;
        }
    }

    public c(boolean z11, a aVar) {
        this.isDataDifferential = z11;
        this.strategy = aVar;
        if (z11 && aVar.equals(a.Lsq2)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int i11 = b.f120537a[aVar.ordinal()];
        int i12 = 2;
        if (i11 != 1) {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = 3;
        }
        this.minSampleSize = i12;
        this.samples = new DataPointAtTime[20];
        this.reusableDataPointsArray = new float[20];
        this.reusableTimeArray = new float[20];
        this.reusableVelocityCoefficients = new float[3];
    }

    private final float b(float[] dataPoints, float[] time, int sampleCount) {
        try {
            return e.i(time, dataPoints, sampleCount, 2, this.reusableVelocityCoefficients)[1];
        } catch (IllegalArgumentException unused) {
            return BitmapDescriptorFactory.HUE_RED;
        }
    }

    public final void a(long timeMillis, float dataPoint) {
        int i11 = (this.index + 1) % 20;
        this.index = i11;
        e.j(this.samples, i11, timeMillis, dataPoint);
    }

    public final float c() {
        float f11;
        float[] fArr = this.reusableDataPointsArray;
        float[] fArr2 = this.reusableTimeArray;
        int i11 = this.index;
        DataPointAtTime dataPointAtTime = this.samples[i11];
        if (dataPointAtTime == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        int i12 = 0;
        DataPointAtTime dataPointAtTime2 = dataPointAtTime;
        while (true) {
            DataPointAtTime dataPointAtTime3 = this.samples[i11];
            if (dataPointAtTime3 == null) {
                break;
            }
            float time = dataPointAtTime.getTime() - dataPointAtTime3.getTime();
            float fAbs = Math.abs(dataPointAtTime3.getTime() - dataPointAtTime2.getTime());
            DataPointAtTime dataPointAtTime4 = (this.strategy == a.Lsq2 || this.isDataDifferential) ? dataPointAtTime3 : dataPointAtTime;
            if (time > 100.0f || fAbs > 40.0f) {
                break;
            }
            fArr[i12] = dataPointAtTime3.getDataPoint();
            fArr2[i12] = -time;
            if (i11 == 0) {
                i11 = 20;
            }
            i11--;
            i12++;
            if (i12 >= 20) {
                break;
            }
            dataPointAtTime2 = dataPointAtTime4;
        }
        if (i12 < this.minSampleSize) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        int i13 = b.f120537a[this.strategy.ordinal()];
        if (i13 == 1) {
            f11 = e.f(fArr, fArr2, i12, this.isDataDifferential);
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f11 = b(fArr, fArr2, i12);
        }
        return f11 * 1000;
    }

    public final float d(float maximumVelocity) {
        if (!(maximumVelocity > BitmapDescriptorFactory.HUE_RED)) {
            y3.a.b("maximumVelocity should be a positive value. You specified=" + maximumVelocity);
        }
        float fC = c();
        if (fC == BitmapDescriptorFactory.HUE_RED || Float.isNaN(fC)) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return fC > BitmapDescriptorFactory.HUE_RED ? n.i(fC, maximumVelocity) : n.e(fC, -maximumVelocity);
    }

    public final void e() {
        p013kotlin.collections.n.D(this.samples, null, 0, 0, 6, null);
        this.index = 0;
    }

    public /* synthetic */ c(boolean z11, a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? a.Lsq2 : aVar);
    }
}
