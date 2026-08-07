package a60;

import java.util.concurrent.Executor;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"La60/c;", "Ljava/util/concurrent/Executor;", "<init>", "()V", "Ljava/lang/Runnable;", "r", "Ljn0/h0;", "execute", "(Ljava/lang/Runnable;)V", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class c implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f475a = new c();

    private c() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable r11) {
        s.k(r11, "r");
        r11.run();
    }
}
