package o4;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@jn0.e
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JM\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\r0\n2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0019\u0010\u0015J\u000f\u0010\u001a\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001a\u0010\u0015J\u000f\u0010\u001b\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001b\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR(\u0010!\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u001ej\n\u0012\u0006\u0012\u0004\u0018\u00010\u0011`\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010 R\u0016\u0010#\u001a\u0004\u0018\u00010\u00118@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\"¨\u0006$"}, d2 = {"Lo4/q0;", "", "Lo4/j0;", "platformTextInputService", "<init>", "(Lo4/j0;)V", "Lo4/o0;", "value", "Lo4/s;", "imeOptions", "Lkotlin/Function1;", "", "Lo4/i;", "Ljn0/h0;", "onEditCommand", "Lo4/r;", "onImeActionPerformed", "Lo4/w0;", DateTokenConverter.CONVERTER_KEY, "(Lo4/o0;Lo4/s;Lwn0/l;Lwn0/l;)Lo4/w0;", "e", "()V", "session", "g", "(Lo4/w0;)V", "f", "c", "b", "a", "Lo4/j0;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/ui/text/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "_currentInputSession", "()Lo4/w0;", "currentInputSession", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class q0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f96457c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j0 platformTextInputService;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AtomicReference<w0> _currentInputSession = new AtomicReference<>(null);

    public q0(j0 j0Var) {
        this.platformTextInputService = j0Var;
    }

    public final w0 a() {
        return this._currentInputSession.get();
    }

    @jn0.e
    public final void b() {
        this.platformTextInputService.f();
    }

    @jn0.e
    public final void c() {
        if (a() != null) {
            this.platformTextInputService.h();
        }
    }

    public w0 d(TextFieldValue value, ImeOptions imeOptions, wn0.l<? super List<? extends i>, jn0.h0> onEditCommand, wn0.l<? super r, jn0.h0> onImeActionPerformed) {
        this.platformTextInputService.e(value, imeOptions, onEditCommand, onImeActionPerformed);
        w0 w0Var = new w0(this, this.platformTextInputService);
        this._currentInputSession.set(w0Var);
        return w0Var;
    }

    public final void e() {
        this.platformTextInputService.d();
        this._currentInputSession.set(new w0(this, this.platformTextInputService));
    }

    public final void f() {
        this.platformTextInputService.a();
    }

    public void g(w0 session) {
        if (androidx.camera.view.i.a(this._currentInputSession, session, null)) {
            this.platformTextInputService.a();
        }
    }
}
