package f4;

import android.os.CancellationSignal;
import java.util.concurrent.CancellationException;
import jn0.h0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.u;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroid/os/CancellationSignal;", "signal", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "", "block", "Lkotlinx/coroutines/Job;", "c", "(Lkotlinx/coroutines/CoroutineScope;Landroid/os/CancellationSignal;Lwn0/p;)Lkotlinx/coroutines/Job;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class d {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "cause", "Ljn0/h0;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements l<Throwable, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CancellationSignal f64325c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(CancellationSignal cancellationSignal) {
            super(1);
            this.f64325c = cancellationSignal;
        }

        public final void a(Throwable th2) {
            if (th2 != null) {
                this.f64325c.cancel();
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Throwable th2) {
            a(th2);
            return h0.f84049a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job c(CoroutineScope coroutineScope, CancellationSignal cancellationSignal, p<? super CoroutineScope, ? super Continuation<? super h0>, ? extends Object> pVar) {
        final Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, pVar, 3, null);
        jobLaunch$default.invokeOnCompletion(new a(cancellationSignal));
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: f4.c
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                d.d(jobLaunch$default);
            }
        });
        return jobLaunch$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Job job) {
        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
    }
}
