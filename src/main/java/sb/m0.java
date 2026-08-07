package sb;

import androidx.work.OverwritingInputMerger;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import expo.modules.kotlin.activityresult.DataPersistorKt;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import okhttp3.internal.http2.Http2Connection;
import org.bouncycastle.crypto.CryptoServicesPermission;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b8\b\u0087\b\u0018\u0000 b2\u00020\u0001:\u0003?1=B\u0081\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0003\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u000b\u0012\b\b\u0002\u0010 \u001a\u00020\u0011\u0012\b\b\u0002\u0010!\u001a\u00020\u0011\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b$\u0010%B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010&\u001a\u00020\u0002¢\u0006\u0004\b$\u0010'B\u0019\b\u0016\u0012\u0006\u0010(\u001a\u00020\u0002\u0012\u0006\u0010)\u001a\u00020\u0000¢\u0006\u0004\b$\u0010*J\u0015\u0010,\u001a\u00020+2\u0006\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\u00020+2\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b.\u0010-J\u001d\u0010/\u001a\u00020+2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\u000b¢\u0006\u0004\b1\u00102J\r\u00103\u001a\u00020\u0019¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0002H\u0016¢\u0006\u0004\b5\u00106J\u008e\u0002\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0003\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u00112\b\b\u0002\u0010!\u001a\u00020\u00112\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b9\u0010:J\u001a\u0010;\u001a\u00020\u00192\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b1\u0010>R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b7\u0010>R\u0016\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010\n\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bC\u0010BR\u0016\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010\r\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bF\u0010ER\u0016\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bG\u0010ER\u0016\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010\u0015\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b3\u0010ER\u0016\u0010\u0016\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bN\u0010ER\u0016\u0010\u0017\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bO\u0010ER\u0016\u0010\u0018\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b,\u0010ER\u0016\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\"\u0010\u001d\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010K\u001a\u0004\bH\u0010:\"\u0004\bT\u0010UR\u001a\u0010\u001e\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010K\u001a\u0004\bD\u0010:R\"\u0010\u001f\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bV\u0010E\u001a\u0004\bF\u00102\"\u0004\bP\u0010-R\"\u0010 \u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bW\u0010K\u001a\u0004\bG\u0010:\"\u0004\bR\u0010UR\u001a\u0010!\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\bX\u0010K\u001a\u0004\bJ\u0010:R$\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bY\u0010>\u001a\u0004\bL\u00106\"\u0004\bV\u0010ZR$\u0010#\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\bC\u0010]\"\u0004\b^\u0010_R\u0011\u0010`\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bO\u00104R\u0011\u0010a\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bN\u00104¨\u0006c"}, d2 = {"Lsb/m0;", "", "", "id", "Landroidx/work/r0$c;", "state", "workerClassName", "inputMergerClassName", "Landroidx/work/g;", "input", "output", "", "initialDelay", "intervalDuration", "flexDuration", "Landroidx/work/e;", CryptoServicesPermission.CONSTRAINTS, "", "runAttemptCount", "Landroidx/work/a;", "backoffPolicy", "backoffDelayDuration", "lastEnqueueTime", "minimumRetentionDuration", "scheduleRequestedAt", "", "expedited", "Landroidx/work/i0;", "outOfQuotaPolicy", "periodCount", "generation", "nextScheduleTimeOverride", "nextScheduleTimeOverrideGeneration", "stopReason", "traceTag", "backOffOnSystemInterruptions", "<init>", "(Ljava/lang/String;Landroidx/work/r0$c;Ljava/lang/String;Ljava/lang/String;Landroidx/work/g;Landroidx/work/g;JJJLandroidx/work/e;ILandroidx/work/a;JJJJZLandroidx/work/i0;IIJIILjava/lang/String;Ljava/lang/Boolean;)V", "workerClassName_", "(Ljava/lang/String;Ljava/lang/String;)V", "newId", "other", "(Ljava/lang/String;Lsb/m0;)V", "Ljn0/h0;", "p", "(J)V", "s", "t", "(JJ)V", "c", "()J", "m", "()Z", "toString", "()Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Landroidx/work/r0$c;Ljava/lang/String;Ljava/lang/String;Landroidx/work/g;Landroidx/work/g;JJJLandroidx/work/e;ILandroidx/work/a;JJJJZLandroidx/work/i0;IIJIILjava/lang/String;Ljava/lang/Boolean;)Lsb/m0;", "hashCode", "()I", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Landroidx/work/r0$c;", "e", "Landroidx/work/g;", "f", "g", "J", "h", IntegerTokenConverter.CONVERTER_KEY, "j", "Landroidx/work/e;", "k", "I", "l", "Landroidx/work/a;", "n", "o", "q", "Z", "r", "Landroidx/work/i0;", "setPeriodCount", "(I)V", "u", "v", "w", "x", "(Ljava/lang/String;)V", "y", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "setBackOffOnSystemInterruptions", "(Ljava/lang/Boolean;)V", "isPeriodic", "isBackedOff", "z", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class m0 {
    private static final String A;
    public static final r.a<List<WorkInfoPojo>, List<androidx.work.r0>> B;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public androidx.work.r0.c state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public String workerClassName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public String inputMergerClassName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public androidx.work.g input;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public androidx.work.g output;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public long initialDelay;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public long intervalDuration;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public long flexDuration;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public androidx.work.e constraints;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public int runAttemptCount;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public androidx.work.a backoffPolicy;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public long backoffDelayDuration;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public long lastEnqueueTime;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public long minimumRetentionDuration;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public long scheduleRequestedAt;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public boolean expedited;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public androidx.work.i0 outOfQuotaPolicy;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private int periodCount;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int generation;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private long nextScheduleTimeOverride;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private int nextScheduleTimeOverrideGeneration;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final int stopReason;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private String traceTag;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private Boolean backOffOnSystemInterruptions;

    /* JADX INFO: renamed from: sb.m0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Je\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R,\u0010\u001e\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001b0\u001a8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lsb/m0$a;", "", "<init>", "()V", "", "isBackedOff", "", "runAttemptCount", "Landroidx/work/a;", "backoffPolicy", "", "backoffDelayDuration", "lastEnqueueTime", "periodCount", "isPeriodic", "initialDelay", "flexDuration", "intervalDuration", "nextScheduleTimeOverride", "a", "(ZILandroidx/work/a;JJIZJJJJ)J", "", "TAG", "Ljava/lang/String;", "SCHEDULE_NOT_REQUESTED_YET", "J", "Lr/a;", "", "Lsb/m0$c;", "Landroidx/work/r0;", "WORK_INFO_MAPPER", "Lr/a;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a(boolean isBackedOff, int runAttemptCount, androidx.work.a backoffPolicy, long backoffDelayDuration, long lastEnqueueTime, int periodCount, boolean isPeriodic, long initialDelay, long flexDuration, long intervalDuration, long nextScheduleTimeOverride) {
            p013kotlin.jvm.internal.s.k(backoffPolicy, "backoffPolicy");
            if (nextScheduleTimeOverride != Long.MAX_VALUE && isPeriodic) {
                return periodCount == 0 ? nextScheduleTimeOverride : bo0.n.g(nextScheduleTimeOverride, 900000 + lastEnqueueTime);
            }
            if (isBackedOff) {
                return bo0.n.k(backoffPolicy == androidx.work.a.LINEAR ? backoffDelayDuration * ((long) runAttemptCount) : (long) Math.scalb(backoffDelayDuration, runAttemptCount - 1), 18000000L) + lastEnqueueTime;
            }
            if (isPeriodic) {
                long j11 = periodCount == 0 ? lastEnqueueTime + initialDelay : lastEnqueueTime + intervalDuration;
                return (flexDuration == intervalDuration || periodCount != 0) ? j11 : j11 + (intervalDuration - flexDuration);
            }
            if (lastEnqueueTime == -1) {
                return Long.MAX_VALUE;
            }
            return lastEnqueueTime + initialDelay;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: sb.m0$b, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lsb/m0$b;", "", "", "id", "Landroidx/work/r0$c;", "state", "<init>", "(Ljava/lang/String;Landroidx/work/r0$c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Landroidx/work/r0$c;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class IdAndState {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        public String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        public androidx.work.r0.c state;

        public IdAndState(String id2, androidx.work.r0.c state) {
            p013kotlin.jvm.internal.s.k(id2, "id");
            p013kotlin.jvm.internal.s.k(state, "state");
            this.id = id2;
            this.state = state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IdAndState)) {
                return false;
            }
            IdAndState idAndState = (IdAndState) other;
            return p013kotlin.jvm.internal.s.f(this.id, idAndState.id) && this.state == idAndState.state;
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + this.state.hashCode();
        }

        public String toString() {
            return "IdAndState(id=" + this.id + ", state=" + this.state + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* JADX INFO: renamed from: sb.m0$c, reason: from toString */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b9\b\u0086\b\u0018\u00002\u00020\u0001B©\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\u000e\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\bH\u0002¢\u0006\u0004\b \u0010!J\r\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010-\u001a\u0004\b.\u0010&R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010/\u001a\u0004\b0\u00101R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u0010!R\u001a\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u00107\u001a\u0004\b9\u0010!R\u001a\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u00107\u001a\u0004\b;\u0010!R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010(R\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010\u0012\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bI\u00107\u001a\u0004\bJ\u0010!\"\u0004\bK\u0010LR\"\u0010\u0013\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bM\u00107\u001a\u0004\bN\u0010!\"\u0004\bO\u0010LR\"\u0010\u0014\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bP\u0010A\u001a\u0004\bQ\u0010(\"\u0004\bR\u0010SR\u001a\u0010\u0015\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bT\u0010A\u001a\u0004\bU\u0010(R\u001a\u0010\u0016\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bV\u00107\u001a\u0004\bW\u0010!R\u001a\u0010\u0017\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bX\u0010A\u001a\u0004\bY\u0010(R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b^\u0010[\u001a\u0004\b_\u0010]R\u0011\u0010a\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b6\u0010`R\u0011\u0010b\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b2\u0010`¨\u0006c"}, d2 = {"Lsb/m0$c;", "", "", "id", "Landroidx/work/r0$c;", "state", "Landroidx/work/g;", "output", "", "initialDelay", "intervalDuration", "flexDuration", "Landroidx/work/e;", CryptoServicesPermission.CONSTRAINTS, "", "runAttemptCount", "Landroidx/work/a;", "backoffPolicy", "backoffDelayDuration", "lastEnqueueTime", "periodCount", "generation", "nextScheduleTimeOverride", "stopReason", "", "tags", ReactProgressBarViewManager.PROP_PROGRESS, "<init>", "(Ljava/lang/String;Landroidx/work/r0$c;Landroidx/work/g;JJJLandroidx/work/e;ILandroidx/work/a;JJIIJILjava/util/List;Ljava/util/List;)V", "Landroidx/work/r0$b;", "b", "()Landroidx/work/r0$b;", "a", "()J", "Landroidx/work/r0;", "e", "()Landroidx/work/r0;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Landroidx/work/r0$c;", "getState", "()Landroidx/work/r0$c;", "c", "Landroidx/work/g;", "getOutput", "()Landroidx/work/g;", DateTokenConverter.CONVERTER_KEY, "J", "getInitialDelay", "getIntervalDuration", "f", "getFlexDuration", "g", "Landroidx/work/e;", "getConstraints", "()Landroidx/work/e;", "h", "I", "getRunAttemptCount", IntegerTokenConverter.CONVERTER_KEY, "Landroidx/work/a;", "getBackoffPolicy", "()Landroidx/work/a;", "setBackoffPolicy", "(Landroidx/work/a;)V", "j", "getBackoffDelayDuration", "setBackoffDelayDuration", "(J)V", "k", "getLastEnqueueTime", "setLastEnqueueTime", "l", "getPeriodCount", "setPeriodCount", "(I)V", "m", "getGeneration", "n", "getNextScheduleTimeOverride", "o", "getStopReason", "p", "Ljava/util/List;", "getTags", "()Ljava/util/List;", "q", "getProgress", "()Z", "isPeriodic", "isBackedOff", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class WorkInfoPojo {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final androidx.work.r0.c state;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final androidx.work.g output;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final long initialDelay;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final long intervalDuration;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final long flexDuration;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final androidx.work.e constraints;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final int runAttemptCount;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private androidx.work.a backoffPolicy;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private long backoffDelayDuration;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private long lastEnqueueTime;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private int periodCount;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final int generation;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final long nextScheduleTimeOverride;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final int stopReason;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> tags;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<androidx.work.g> progress;

        public WorkInfoPojo(String id2, androidx.work.r0.c state, androidx.work.g output, long j11, long j12, long j13, androidx.work.e constraints, int i11, androidx.work.a backoffPolicy, long j14, long j15, int i12, int i13, long j16, int i14, List<String> tags, List<androidx.work.g> progress) {
            p013kotlin.jvm.internal.s.k(id2, "id");
            p013kotlin.jvm.internal.s.k(state, "state");
            p013kotlin.jvm.internal.s.k(output, "output");
            p013kotlin.jvm.internal.s.k(constraints, "constraints");
            p013kotlin.jvm.internal.s.k(backoffPolicy, "backoffPolicy");
            p013kotlin.jvm.internal.s.k(tags, "tags");
            p013kotlin.jvm.internal.s.k(progress, "progress");
            this.id = id2;
            this.state = state;
            this.output = output;
            this.initialDelay = j11;
            this.intervalDuration = j12;
            this.flexDuration = j13;
            this.constraints = constraints;
            this.runAttemptCount = i11;
            this.backoffPolicy = backoffPolicy;
            this.backoffDelayDuration = j14;
            this.lastEnqueueTime = j15;
            this.periodCount = i12;
            this.generation = i13;
            this.nextScheduleTimeOverride = j16;
            this.stopReason = i14;
            this.tags = tags;
            this.progress = progress;
        }

        private final long a() {
            if (this.state == androidx.work.r0.c.ENQUEUED) {
                return m0.INSTANCE.a(c(), this.runAttemptCount, this.backoffPolicy, this.backoffDelayDuration, this.lastEnqueueTime, this.periodCount, d(), this.initialDelay, this.flexDuration, this.intervalDuration, this.nextScheduleTimeOverride);
            }
            return Long.MAX_VALUE;
        }

        private final androidx.work.r0.b b() {
            long j11 = this.intervalDuration;
            if (j11 != 0) {
                return new androidx.work.r0.b(j11, this.flexDuration);
            }
            return null;
        }

        public final boolean c() {
            return this.state == androidx.work.r0.c.ENQUEUED && this.runAttemptCount > 0;
        }

        public final boolean d() {
            return this.intervalDuration != 0;
        }

        public final androidx.work.r0 e() {
            androidx.work.g gVar = !this.progress.isEmpty() ? this.progress.get(0) : androidx.work.g.f14536c;
            UUID uuidFromString = UUID.fromString(this.id);
            p013kotlin.jvm.internal.s.j(uuidFromString, "fromString(...)");
            return new androidx.work.r0(uuidFromString, this.state, new HashSet(this.tags), this.output, gVar, this.runAttemptCount, this.generation, this.constraints, this.initialDelay, b(), a(), this.stopReason);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WorkInfoPojo)) {
                return false;
            }
            WorkInfoPojo workInfoPojo = (WorkInfoPojo) other;
            return p013kotlin.jvm.internal.s.f(this.id, workInfoPojo.id) && this.state == workInfoPojo.state && p013kotlin.jvm.internal.s.f(this.output, workInfoPojo.output) && this.initialDelay == workInfoPojo.initialDelay && this.intervalDuration == workInfoPojo.intervalDuration && this.flexDuration == workInfoPojo.flexDuration && p013kotlin.jvm.internal.s.f(this.constraints, workInfoPojo.constraints) && this.runAttemptCount == workInfoPojo.runAttemptCount && this.backoffPolicy == workInfoPojo.backoffPolicy && this.backoffDelayDuration == workInfoPojo.backoffDelayDuration && this.lastEnqueueTime == workInfoPojo.lastEnqueueTime && this.periodCount == workInfoPojo.periodCount && this.generation == workInfoPojo.generation && this.nextScheduleTimeOverride == workInfoPojo.nextScheduleTimeOverride && this.stopReason == workInfoPojo.stopReason && p013kotlin.jvm.internal.s.f(this.tags, workInfoPojo.tags) && p013kotlin.jvm.internal.s.f(this.progress, workInfoPojo.progress);
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((((this.id.hashCode() * 31) + this.state.hashCode()) * 31) + this.output.hashCode()) * 31) + Long.hashCode(this.initialDelay)) * 31) + Long.hashCode(this.intervalDuration)) * 31) + Long.hashCode(this.flexDuration)) * 31) + this.constraints.hashCode()) * 31) + Integer.hashCode(this.runAttemptCount)) * 31) + this.backoffPolicy.hashCode()) * 31) + Long.hashCode(this.backoffDelayDuration)) * 31) + Long.hashCode(this.lastEnqueueTime)) * 31) + Integer.hashCode(this.periodCount)) * 31) + Integer.hashCode(this.generation)) * 31) + Long.hashCode(this.nextScheduleTimeOverride)) * 31) + Integer.hashCode(this.stopReason)) * 31) + this.tags.hashCode()) * 31) + this.progress.hashCode();
        }

        public String toString() {
            return "WorkInfoPojo(id=" + this.id + ", state=" + this.state + ", output=" + this.output + ", initialDelay=" + this.initialDelay + ", intervalDuration=" + this.intervalDuration + ", flexDuration=" + this.flexDuration + ", constraints=" + this.constraints + ", runAttemptCount=" + this.runAttemptCount + ", backoffPolicy=" + this.backoffPolicy + ", backoffDelayDuration=" + this.backoffDelayDuration + ", lastEnqueueTime=" + this.lastEnqueueTime + ", periodCount=" + this.periodCount + ", generation=" + this.generation + ", nextScheduleTimeOverride=" + this.nextScheduleTimeOverride + ", stopReason=" + this.stopReason + ", tags=" + this.tags + ", progress=" + this.progress + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    static {
        String strI = androidx.work.z.i("WorkSpec");
        p013kotlin.jvm.internal.s.j(strI, "tagWithPrefix(...)");
        A = strI;
        B = new r.a() { // from class: sb.l0
            @Override // r.a
            public final Object apply(Object obj) {
                return m0.b((List) obj);
            }
        };
    }

    public m0(String id2, androidx.work.r0.c state, String workerClassName, String inputMergerClassName, androidx.work.g input, androidx.work.g output, long j11, long j12, long j13, androidx.work.e constraints, int i11, androidx.work.a backoffPolicy, long j14, long j15, long j16, long j17, boolean z11, androidx.work.i0 outOfQuotaPolicy, int i12, int i13, long j18, int i14, int i15, String str, Boolean bool) {
        p013kotlin.jvm.internal.s.k(id2, "id");
        p013kotlin.jvm.internal.s.k(state, "state");
        p013kotlin.jvm.internal.s.k(workerClassName, "workerClassName");
        p013kotlin.jvm.internal.s.k(inputMergerClassName, "inputMergerClassName");
        p013kotlin.jvm.internal.s.k(input, "input");
        p013kotlin.jvm.internal.s.k(output, "output");
        p013kotlin.jvm.internal.s.k(constraints, "constraints");
        p013kotlin.jvm.internal.s.k(backoffPolicy, "backoffPolicy");
        p013kotlin.jvm.internal.s.k(outOfQuotaPolicy, "outOfQuotaPolicy");
        this.id = id2;
        this.state = state;
        this.workerClassName = workerClassName;
        this.inputMergerClassName = inputMergerClassName;
        this.input = input;
        this.output = output;
        this.initialDelay = j11;
        this.intervalDuration = j12;
        this.flexDuration = j13;
        this.constraints = constraints;
        this.runAttemptCount = i11;
        this.backoffPolicy = backoffPolicy;
        this.backoffDelayDuration = j14;
        this.lastEnqueueTime = j15;
        this.minimumRetentionDuration = j16;
        this.scheduleRequestedAt = j17;
        this.expedited = z11;
        this.outOfQuotaPolicy = outOfQuotaPolicy;
        this.periodCount = i12;
        this.generation = i13;
        this.nextScheduleTimeOverride = j18;
        this.nextScheduleTimeOverrideGeneration = i14;
        this.stopReason = i15;
        this.traceTag = str;
        this.backOffOnSystemInterruptions = bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List b(List list) {
        if (list == null) {
            return null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((WorkInfoPojo) it.next()).e());
        }
        return arrayList;
    }

    public static /* synthetic */ m0 e(m0 m0Var, String str, androidx.work.r0.c cVar, String str2, String str3, androidx.work.g gVar, androidx.work.g gVar2, long j11, long j12, long j13, androidx.work.e eVar, int i11, androidx.work.a aVar, long j14, long j15, long j16, long j17, boolean z11, androidx.work.i0 i0Var, int i12, int i13, long j18, int i14, int i15, String str4, Boolean bool, int i16, Object obj) {
        Boolean bool2;
        String str5;
        String str6 = (i16 & 1) != 0 ? m0Var.id : str;
        androidx.work.r0.c cVar2 = (i16 & 2) != 0 ? m0Var.state : cVar;
        String str7 = (i16 & 4) != 0 ? m0Var.workerClassName : str2;
        String str8 = (i16 & 8) != 0 ? m0Var.inputMergerClassName : str3;
        androidx.work.g gVar3 = (i16 & 16) != 0 ? m0Var.input : gVar;
        androidx.work.g gVar4 = (i16 & 32) != 0 ? m0Var.output : gVar2;
        long j19 = (i16 & 64) != 0 ? m0Var.initialDelay : j11;
        long j21 = (i16 & 128) != 0 ? m0Var.intervalDuration : j12;
        long j22 = (i16 & 256) != 0 ? m0Var.flexDuration : j13;
        androidx.work.e eVar2 = (i16 & 512) != 0 ? m0Var.constraints : eVar;
        int i17 = (i16 & 1024) != 0 ? m0Var.runAttemptCount : i11;
        String str9 = str6;
        androidx.work.a aVar2 = (i16 & 2048) != 0 ? m0Var.backoffPolicy : aVar;
        androidx.work.r0.c cVar3 = cVar2;
        long j23 = (i16 & 4096) != 0 ? m0Var.backoffDelayDuration : j14;
        long j24 = (i16 & PKIFailureInfo.certRevoked) != 0 ? m0Var.lastEnqueueTime : j15;
        long j25 = (i16 & 16384) != 0 ? m0Var.minimumRetentionDuration : j16;
        long j26 = (i16 & 32768) != 0 ? m0Var.scheduleRequestedAt : j17;
        boolean z12 = (i16 & 65536) != 0 ? m0Var.expedited : z11;
        long j27 = j26;
        androidx.work.i0 i0Var2 = (i16 & 131072) != 0 ? m0Var.outOfQuotaPolicy : i0Var;
        int i18 = (i16 & 262144) != 0 ? m0Var.periodCount : i12;
        androidx.work.i0 i0Var3 = i0Var2;
        int i19 = (i16 & PKIFailureInfo.signerNotTrusted) != 0 ? m0Var.generation : i13;
        int i21 = i18;
        long j28 = (i16 & PKIFailureInfo.badCertTemplate) != 0 ? m0Var.nextScheduleTimeOverride : j18;
        int i22 = (i16 & PKIFailureInfo.badSenderNonce) != 0 ? m0Var.nextScheduleTimeOverrideGeneration : i14;
        int i23 = (i16 & 4194304) != 0 ? m0Var.stopReason : i15;
        int i24 = i22;
        String str10 = (i16 & 8388608) != 0 ? m0Var.traceTag : str4;
        if ((i16 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0) {
            str5 = str10;
            bool2 = m0Var.backOffOnSystemInterruptions;
        } else {
            bool2 = bool;
            str5 = str10;
        }
        return m0Var.d(str9, cVar3, str7, str8, gVar3, gVar4, j19, j21, j22, eVar2, i17, aVar2, j23, j24, j25, j27, z12, i0Var3, i21, i19, j28, i24, i23, str5, bool2);
    }

    public final long c() {
        return INSTANCE.a(n(), this.runAttemptCount, this.backoffPolicy, this.backoffDelayDuration, this.lastEnqueueTime, this.periodCount, o(), this.initialDelay, this.flexDuration, this.intervalDuration, this.nextScheduleTimeOverride);
    }

    public final m0 d(String id2, androidx.work.r0.c state, String workerClassName, String inputMergerClassName, androidx.work.g input, androidx.work.g output, long initialDelay, long intervalDuration, long flexDuration, androidx.work.e constraints, int runAttemptCount, androidx.work.a backoffPolicy, long backoffDelayDuration, long lastEnqueueTime, long minimumRetentionDuration, long scheduleRequestedAt, boolean expedited, androidx.work.i0 outOfQuotaPolicy, int periodCount, int generation, long nextScheduleTimeOverride, int nextScheduleTimeOverrideGeneration, int stopReason, String traceTag, Boolean backOffOnSystemInterruptions) {
        p013kotlin.jvm.internal.s.k(id2, "id");
        p013kotlin.jvm.internal.s.k(state, "state");
        p013kotlin.jvm.internal.s.k(workerClassName, "workerClassName");
        p013kotlin.jvm.internal.s.k(inputMergerClassName, "inputMergerClassName");
        p013kotlin.jvm.internal.s.k(input, "input");
        p013kotlin.jvm.internal.s.k(output, "output");
        p013kotlin.jvm.internal.s.k(constraints, "constraints");
        p013kotlin.jvm.internal.s.k(backoffPolicy, "backoffPolicy");
        p013kotlin.jvm.internal.s.k(outOfQuotaPolicy, "outOfQuotaPolicy");
        return new m0(id2, state, workerClassName, inputMergerClassName, input, output, initialDelay, intervalDuration, flexDuration, constraints, runAttemptCount, backoffPolicy, backoffDelayDuration, lastEnqueueTime, minimumRetentionDuration, scheduleRequestedAt, expedited, outOfQuotaPolicy, periodCount, generation, nextScheduleTimeOverride, nextScheduleTimeOverrideGeneration, stopReason, traceTag, backOffOnSystemInterruptions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) other;
        return p013kotlin.jvm.internal.s.f(this.id, m0Var.id) && this.state == m0Var.state && p013kotlin.jvm.internal.s.f(this.workerClassName, m0Var.workerClassName) && p013kotlin.jvm.internal.s.f(this.inputMergerClassName, m0Var.inputMergerClassName) && p013kotlin.jvm.internal.s.f(this.input, m0Var.input) && p013kotlin.jvm.internal.s.f(this.output, m0Var.output) && this.initialDelay == m0Var.initialDelay && this.intervalDuration == m0Var.intervalDuration && this.flexDuration == m0Var.flexDuration && p013kotlin.jvm.internal.s.f(this.constraints, m0Var.constraints) && this.runAttemptCount == m0Var.runAttemptCount && this.backoffPolicy == m0Var.backoffPolicy && this.backoffDelayDuration == m0Var.backoffDelayDuration && this.lastEnqueueTime == m0Var.lastEnqueueTime && this.minimumRetentionDuration == m0Var.minimumRetentionDuration && this.scheduleRequestedAt == m0Var.scheduleRequestedAt && this.expedited == m0Var.expedited && this.outOfQuotaPolicy == m0Var.outOfQuotaPolicy && this.periodCount == m0Var.periodCount && this.generation == m0Var.generation && this.nextScheduleTimeOverride == m0Var.nextScheduleTimeOverride && this.nextScheduleTimeOverrideGeneration == m0Var.nextScheduleTimeOverrideGeneration && this.stopReason == m0Var.stopReason && p013kotlin.jvm.internal.s.f(this.traceTag, m0Var.traceTag) && p013kotlin.jvm.internal.s.f(this.backOffOnSystemInterruptions, m0Var.backOffOnSystemInterruptions);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Boolean getBackOffOnSystemInterruptions() {
        return this.backOffOnSystemInterruptions;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getGeneration() {
        return this.generation;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getNextScheduleTimeOverride() {
        return this.nextScheduleTimeOverride;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((((((((((((((((this.id.hashCode() * 31) + this.state.hashCode()) * 31) + this.workerClassName.hashCode()) * 31) + this.inputMergerClassName.hashCode()) * 31) + this.input.hashCode()) * 31) + this.output.hashCode()) * 31) + Long.hashCode(this.initialDelay)) * 31) + Long.hashCode(this.intervalDuration)) * 31) + Long.hashCode(this.flexDuration)) * 31) + this.constraints.hashCode()) * 31) + Integer.hashCode(this.runAttemptCount)) * 31) + this.backoffPolicy.hashCode()) * 31) + Long.hashCode(this.backoffDelayDuration)) * 31) + Long.hashCode(this.lastEnqueueTime)) * 31) + Long.hashCode(this.minimumRetentionDuration)) * 31) + Long.hashCode(this.scheduleRequestedAt)) * 31) + Boolean.hashCode(this.expedited)) * 31) + this.outOfQuotaPolicy.hashCode()) * 31) + Integer.hashCode(this.periodCount)) * 31) + Integer.hashCode(this.generation)) * 31) + Long.hashCode(this.nextScheduleTimeOverride)) * 31) + Integer.hashCode(this.nextScheduleTimeOverrideGeneration)) * 31) + Integer.hashCode(this.stopReason)) * 31;
        String str = this.traceTag;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.backOffOnSystemInterruptions;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getNextScheduleTimeOverrideGeneration() {
        return this.nextScheduleTimeOverrideGeneration;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getPeriodCount() {
        return this.periodCount;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getStopReason() {
        return this.stopReason;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getTraceTag() {
        return this.traceTag;
    }

    public final boolean m() {
        return !p013kotlin.jvm.internal.s.f(androidx.work.e.f14507k, this.constraints);
    }

    public final boolean n() {
        return this.state == androidx.work.r0.c.ENQUEUED && this.runAttemptCount > 0;
    }

    public final boolean o() {
        return this.intervalDuration != 0;
    }

    public final void p(long backoffDelayDuration) {
        if (backoffDelayDuration > 18000000) {
            androidx.work.z.e().k(A, "Backoff delay duration exceeds maximum value");
        }
        if (backoffDelayDuration < 10000) {
            androidx.work.z.e().k(A, "Backoff delay duration less than minimum value");
        }
        this.backoffDelayDuration = bo0.n.p(backoffDelayDuration, 10000L, 18000000L);
    }

    public final void q(long j11) {
        this.nextScheduleTimeOverride = j11;
    }

    public final void r(int i11) {
        this.nextScheduleTimeOverrideGeneration = i11;
    }

    public final void s(long intervalDuration) {
        if (intervalDuration < 900000) {
            androidx.work.z.e().k(A, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        t(bo0.n.g(intervalDuration, 900000L), bo0.n.g(intervalDuration, 900000L));
    }

    public final void t(long intervalDuration, long flexDuration) {
        if (intervalDuration < 900000) {
            androidx.work.z.e().k(A, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        this.intervalDuration = bo0.n.g(intervalDuration, 900000L);
        if (flexDuration < DataPersistorKt.EXPIRATION_TIME) {
            androidx.work.z.e().k(A, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (flexDuration > this.intervalDuration) {
            androidx.work.z.e().k(A, "Flex duration greater than interval duration; Changed to " + intervalDuration);
        }
        this.flexDuration = bo0.n.p(flexDuration, DataPersistorKt.EXPIRATION_TIME, this.intervalDuration);
    }

    public String toString() {
        return "{WorkSpec: " + this.id + CoreConstants.CURLY_RIGHT;
    }

    public final void u(String str) {
        this.traceTag = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ m0(String str, androidx.work.r0.c cVar, String str2, String str3, androidx.work.g gVar, androidx.work.g gVar2, long j11, long j12, long j13, androidx.work.e eVar, int i11, androidx.work.a aVar, long j14, long j15, long j16, long j17, boolean z11, androidx.work.i0 i0Var, int i12, int i13, long j18, int i14, int i15, String str4, Boolean bool, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        String str5;
        androidx.work.r0.c cVar2 = (i16 & 2) != 0 ? androidx.work.r0.c.ENQUEUED : cVar;
        if ((i16 & 8) != 0) {
            String name = OverwritingInputMerger.class.getName();
            p013kotlin.jvm.internal.s.j(name, "getName(...)");
            str5 = name;
        } else {
            str5 = str3;
        }
        this(str, cVar2, str2, str5, (i16 & 16) != 0 ? androidx.work.g.f14536c : gVar, (i16 & 32) != 0 ? androidx.work.g.f14536c : gVar2, (i16 & 64) != 0 ? 0L : j11, (i16 & 128) != 0 ? 0L : j12, (i16 & 256) != 0 ? 0L : j13, (i16 & 512) != 0 ? androidx.work.e.f14507k : eVar, (i16 & 1024) != 0 ? 0 : i11, (i16 & 2048) != 0 ? androidx.work.a.EXPONENTIAL : aVar, (i16 & 4096) != 0 ? 30000L : j14, (i16 & PKIFailureInfo.certRevoked) != 0 ? -1L : j15, (i16 & 16384) == 0 ? j16 : 0L, (32768 & i16) != 0 ? -1L : j17, (65536 & i16) != 0 ? false : z11, (131072 & i16) != 0 ? androidx.work.i0.RUN_AS_NON_EXPEDITED_WORK_REQUEST : i0Var, (262144 & i16) != 0 ? 0 : i12, (524288 & i16) != 0 ? 0 : i13, (1048576 & i16) != 0 ? Long.MAX_VALUE : j18, (2097152 & i16) != 0 ? 0 : i14, (4194304 & i16) != 0 ? -256 : i15, (8388608 & i16) != 0 ? null : str4, (i16 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? Boolean.FALSE : bool);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m0(String id2, String workerClassName_) {
        this(id2, null, workerClassName_, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, null, 33554426, null);
        p013kotlin.jvm.internal.s.k(id2, "id");
        p013kotlin.jvm.internal.s.k(workerClassName_, "workerClassName_");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m0(String newId, m0 other) {
        this(newId, other.state, other.workerClassName, other.inputMergerClassName, new androidx.work.g(other.input), new androidx.work.g(other.output), other.initialDelay, other.intervalDuration, other.flexDuration, new androidx.work.e(other.constraints), other.runAttemptCount, other.backoffPolicy, other.backoffDelayDuration, other.lastEnqueueTime, other.minimumRetentionDuration, other.scheduleRequestedAt, other.expedited, other.outOfQuotaPolicy, other.periodCount, 0, other.nextScheduleTimeOverride, other.nextScheduleTimeOverrideGeneration, other.stopReason, other.traceTag, other.backOffOnSystemInterruptions, PKIFailureInfo.signerNotTrusted, null);
        p013kotlin.jvm.internal.s.k(newId, "newId");
        p013kotlin.jvm.internal.s.k(other, "other");
    }
}
