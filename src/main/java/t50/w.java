package t50;

import android.os.Parcelable;
import androidx.p003lifecycle.s0;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014¨\u0006\u0016"}, d2 = {"Lt50/w;", "Landroid/os/Parcelable;", "S", "", "Landroidx/lifecycle/s0;", "savedStateHandle", "<init>", "(Landroidx/lifecycle/s0;)V", "", "c", "()Ljava/lang/String;", "b", "()Landroid/os/Parcelable;", "state", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Landroid/os/Parcelable;)V", "a", "()V", "Landroidx/lifecycle/s0;", "Ljava/lang/String;", Action.KEY_ATTRIBUTE, "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class w<S extends Parcelable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s0 savedStateHandle;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String key;

    public w(s0 savedStateHandle) {
        p013kotlin.jvm.internal.s.k(savedStateHandle, "savedStateHandle");
        this.savedStateHandle = savedStateHandle;
        this.key = c();
    }

    private final String c() {
        return "PersistedState_" + getClass().getName();
    }

    public final void a() {
        this.savedStateHandle.k(this.key);
    }

    public final S b() {
        return (S) this.savedStateHandle.f(this.key);
    }

    public final void d(S state) {
        p013kotlin.jvm.internal.s.k(state, "state");
        this.savedStateHandle.n(this.key, state);
    }
}
