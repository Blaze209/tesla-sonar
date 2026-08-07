package p019p1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p020r2.p1;
import p020r2.s3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0010¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0010¢\u0006\u0004\b\u000b\u0010\fR+\u0010\u0013\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u00008V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0005R+\u0010\u0016\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u00008V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u000e\u0010\u0011\"\u0004\b\u0015\u0010\u0005¨\u0006\u0017"}, d2 = {"Lp1/u0;", "S", "Lp1/n1;", "initialState", "<init>", "(Ljava/lang/Object;)V", "Lp1/l1;", "transition", "Ljn0/h0;", "f", "(Lp1/l1;)V", "g", "()V", "<set-?>", "b", "Lr2/p1;", "a", "()Ljava/lang/Object;", DateTokenConverter.CONVERTER_KEY, "currentState", "c", "h", "targetState", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class u0<S> extends n1<S> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f100644d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p1 currentState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p1 targetState;

    public u0(S s11) {
        super(null);
        this.currentState = s3.d(s11, null, 2, null);
        this.targetState = s3.d(s11, null, 2, null);
    }

    @Override // p019p1.n1
    public S a() {
        return (S) this.currentState.getValue();
    }

    @Override // p019p1.n1
    public S b() {
        return (S) this.targetState.getValue();
    }

    @Override // p019p1.n1
    public void d(S s11) {
        this.currentState.setValue(s11);
    }

    public void h(S s11) {
        this.targetState.setValue(s11);
    }

    @Override // p019p1.n1
    public void g() {
    }

    @Override // p019p1.n1
    public void f(l1<S> transition) {
    }
}
