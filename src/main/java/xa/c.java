package xa;

import android.os.Bundle;
import androidx.p003lifecycle.Lifecycle;
import androidx.savedstate.SavedStateRegistry;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017¨\u0006\u0019"}, d2 = {"Lxa/c;", "", "Lxa/d;", "owner", "<init>", "(Lxa/d;)V", "Ljn0/h0;", "c", "()V", "Landroid/os/Bundle;", "savedState", DateTokenConverter.CONVERTER_KEY, "(Landroid/os/Bundle;)V", "outBundle", "e", "a", "Lxa/d;", "Landroidx/savedstate/SavedStateRegistry;", "b", "Landroidx/savedstate/SavedStateRegistry;", "()Landroidx/savedstate/SavedStateRegistry;", "savedStateRegistry", "", "Z", "attached", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d owner;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final SavedStateRegistry savedStateRegistry;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean attached;

    /* JADX INFO: renamed from: xa.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lxa/c$a;", "", "<init>", "()V", "Lxa/d;", "owner", "Lxa/c;", "a", "(Lxa/d;)Lxa/c;", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a(d owner) {
            s.k(owner, "owner");
            return new c(owner, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ c(d dVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar);
    }

    public static final c a(d dVar) {
        return INSTANCE.a(dVar);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.savedStateRegistry;
    }

    public final void c() {
        Lifecycle lifecycle = this.owner.getLifecycle();
        if (lifecycle.getState() != Lifecycle.State.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.a(new androidx.savedstate.a(this.owner));
        this.savedStateRegistry.e(lifecycle);
        this.attached = true;
    }

    public final void d(Bundle savedState) {
        if (!this.attached) {
            c();
        }
        Lifecycle lifecycle = this.owner.getLifecycle();
        if (!lifecycle.getState().isAtLeast(Lifecycle.State.STARTED)) {
            this.savedStateRegistry.f(savedState);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.getState()).toString());
    }

    public final void e(Bundle outBundle) {
        s.k(outBundle, "outBundle");
        this.savedStateRegistry.g(outBundle);
    }

    private c(d dVar) {
        this.owner = dVar;
        this.savedStateRegistry = new SavedStateRegistry();
    }
}
