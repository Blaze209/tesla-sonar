package p020r2;

import ch.qos.logback.core.joran.action.Action;
import java.util.Map;
import p013kotlin.Metadata;
import xn0.e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u00002\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00030\u00012\u00020\u00042\u00020\u0005:\u0001\u000eJ/\u0010\b\u001a\u00020\u00002\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00022\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fR$\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lr2/z1;", "", "Lr2/u;", "Lr2/e4;", "Lr2/x;", "Lr2/v;", Action.KEY_ATTRIBUTE, "value", "f", "(Lr2/u;Lr2/e4;)Lr2/z1;", "Lr2/z1$a;", "builder", "()Lr2/z1$a;", "T", "a", "(Lr2/u;)Ljava/lang/Object;", "currentValue", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface z1 extends Map, xn0.a, x, v {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00030\u0001J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lr2/z1$a;", "", "Lr2/u;", "Lr2/e4;", "Lr2/z1;", "build", "()Lr2/z1;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface a extends Map, e {
        z1 build();
    }

    @Override // p020r2.v
    default <T> T a(u<T> uVar) {
        return (T) y.b(this, uVar);
    }

    a builder();

    z1 f(u<Object> key, e4<Object> value);
}
