package xe;

import android.os.CountDownTimer;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\b¢\u0006\u0004\b\f\u0010\u0003J\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u0003R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000f¨\u0006\u0011"}, d2 = {"Lxe/a;", "", "<init>", "()V", "", "millisInFuture", "countDownInterval", "Lkotlin/Function1;", "Ljn0/h0;", "onTick", "a", "(JJLwn0/l;)V", "c", "b", "Landroid/os/CountDownTimer;", "Landroid/os/CountDownTimer;", "countDownTimer", "qr-code_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private CountDownTimer countDownTimer;

    public final void a(long millisInFuture, long countDownInterval, l<? super Long, h0> onTick) {
        s.k(onTick, "onTick");
        this.countDownTimer = new CountDownTimerC2672a(millisInFuture, countDownInterval, onTick);
    }

    public final void b() {
        CountDownTimer countDownTimer = this.countDownTimer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    public final void c() {
        CountDownTimer countDownTimer = this.countDownTimer;
        if (countDownTimer != null) {
            countDownTimer.start();
        }
    }

    /* JADX INFO: renamed from: xe.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"xe/a$a", "Landroid/os/CountDownTimer;", "", "millisUntilFinished", "Ljn0/h0;", "onTick", "(J)V", "onFinish", "()V", "qr-code_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CountDownTimerC2672a extends CountDownTimer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l<Long, h0> f123292a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        CountDownTimerC2672a(long j11, long j12, l<? super Long, h0> lVar) {
            super(j11, j12);
            this.f123292a = lVar;
        }

        @Override // android.os.CountDownTimer
        public void onTick(long millisUntilFinished) {
            this.f123292a.invoke(Long.valueOf(millisUntilFinished));
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
        }
    }
}
