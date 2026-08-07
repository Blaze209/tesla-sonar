package p019p1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p020r2.p1;
import p020r2.s3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H ¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H ¢\u0006\u0004\b\n\u0010\u0004R+\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0017\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u00008&@`X¦\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001a\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u00008&@`X¦\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016\u0082\u0001\u0002\u001b\u001c¨\u0006\u001d"}, d2 = {"Lp1/n1;", "S", "", "<init>", "()V", "Lp1/l1;", "transition", "Ljn0/h0;", "f", "(Lp1/l1;)V", "g", "", "<set-?>", "a", "Lr2/p1;", "c", "()Z", "e", "(Z)V", "isRunning", "()Ljava/lang/Object;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;)V", "currentState", "b", "setTargetState$animation_core_release", "targetState", "Lp1/u0;", "Lp1/z0;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class n1<S> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p1 isRunning;

    public /* synthetic */ n1(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract S a();

    public abstract S b();

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c() {
        return ((Boolean) this.isRunning.getValue()).booleanValue();
    }

    public abstract void d(S s11);

    public final void e(boolean z11) {
        this.isRunning.setValue(Boolean.valueOf(z11));
    }

    public abstract void f(l1<S> transition);

    public abstract void g();

    private n1() {
        this.isRunning = s3.d(Boolean.FALSE, null, 2, null);
    }
}
