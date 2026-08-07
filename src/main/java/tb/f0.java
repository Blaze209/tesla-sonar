package tb;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Ltb/f0;", "Ljava/lang/Runnable;", "Llb/s;", "processor", "Llb/x;", "token", "", "stopInForeground", "", AnalyticsAttribute.Reason, "<init>", "(Llb/s;Llb/x;ZI)V", "Ljn0/h0;", "run", "()V", "a", "Llb/s;", "b", "Llb/x;", "c", "Z", DateTokenConverter.CONVERTER_KEY, "I", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final lb.s processor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final lb.x token;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean stopInForeground;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int reason;

    public f0(lb.s processor, lb.x token, boolean z11, int i11) {
        p013kotlin.jvm.internal.s.k(processor, "processor");
        p013kotlin.jvm.internal.s.k(token, "token");
        this.processor = processor;
        this.token = token;
        this.stopInForeground = z11;
        this.reason = i11;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zR = this.stopInForeground ? this.processor.r(this.token, this.reason) : this.processor.s(this.token, this.reason);
        androidx.work.z.e().a(androidx.work.z.i("StopWorkRunnable"), "StopWorkRunnable for " + this.token.getId().getWorkSpecId() + "; Processor.stopWork = " + zR);
    }
}
