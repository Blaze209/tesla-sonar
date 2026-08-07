package bf0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0004\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u0011\u0010\u001a\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0016¨\u0006\u001b"}, d2 = {"Lbf0/e;", "", "", "maxRetryTimes", "_counter", "<init>", "(II)V", "Ljn0/h0;", "f", "()V", "", "b", "()Z", "", "c", "()J", "Ljava/lang/Runnable;", "runnable", "a", "(Ljava/lang/Runnable;)Z", "I", "e", "()I", "setMaxRetryTimes", "(I)V", DateTokenConverter.CONVERTER_KEY, "counter", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int maxRetryTimes;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int _counter;

    /* JADX WARN: Illegal instructions before constructor call */
    public e() {
        int i11 = 0;
        this(i11, i11, 3, null);
    }

    public boolean a(Runnable runnable) {
        this._counter++;
        if (runnable != null) {
            runnable.run();
        }
        return true;
    }

    public boolean b() {
        return get_counter() < getMaxRetryTimes();
    }

    public long c() {
        return 0L;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int get_counter() {
        return this._counter;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public int getMaxRetryTimes() {
        return this.maxRetryTimes;
    }

    public void f() {
        this._counter = 0;
    }

    public e(int i11, int i12) {
        this.maxRetryTimes = i11;
        this._counter = i12;
    }

    public /* synthetic */ e(int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? 0 : i12);
    }
}
