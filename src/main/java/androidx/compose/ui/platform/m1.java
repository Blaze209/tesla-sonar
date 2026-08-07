package androidx.compose.ui.platform;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.lang.ref.WeakReference;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014R,\u0010\u001b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00180\u0017j\b\u0012\u0004\u0012\u00020\u0018`\u00190\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0011\u0010!\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010 ¨\u0006\""}, d2 = {"Landroidx/compose/ui/platform/m1;", "", "Landroidx/compose/ui/platform/b2;", "request", "Lkotlin/Function0;", "Ljn0/h0;", "onAllConnectionsClosed", "<init>", "(Landroidx/compose/ui/platform/b2;Lwn0/a;)V", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "c", "(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;", DateTokenConverter.CONVERTER_KEY, "()V", "a", "Landroidx/compose/ui/platform/b2;", "b", "Lwn0/a;", "Ljava/lang/Object;", "lock", "Lt2/b;", "Ljava/lang/ref/WeakReference;", "Lo4/z;", "Landroidx/compose/ui/node/WeakReference;", "Lt2/b;", "connections", "", "e", "Z", "disposed", "()Z", "isActive", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b2 request;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<jn0.h0> onAllConnectionsClosed;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private t2.b<WeakReference<o4.z>> connections = new t2.b<>(new WeakReference[16], 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean disposed;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo4/z;", "closedConnection", "Ljn0/h0;", "a", "(Lo4/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<o4.z, jn0.h0> {
        a() {
            super(1);
        }

        public final void a(o4.z zVar) {
            int i11;
            zVar.a();
            t2.b bVar = m1.this.connections;
            int size = bVar.getSize();
            if (size <= 0) {
                i11 = -1;
                break;
            }
            Object[] objArrM = bVar.m();
            i11 = 0;
            while (!p013kotlin.jvm.internal.s.f((WeakReference) objArrM[i11], zVar)) {
                i11++;
                if (i11 >= size) {
                    i11 = -1;
                    break;
                }
            }
            if (i11 >= 0) {
                m1.this.connections.v(i11);
            }
            if (m1.this.connections.p()) {
                m1.this.onAllConnectionsClosed.invoke();
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(o4.z zVar) {
            a(zVar);
            return jn0.h0.f84049a;
        }
    }

    public m1(b2 b2Var, wn0.a<jn0.h0> aVar) {
        this.request = b2Var;
        this.onAllConnectionsClosed = aVar;
    }

    public final InputConnection c(EditorInfo outAttrs) {
        synchronized (this.lock) {
            if (this.disposed) {
                return null;
            }
            o4.z zVarA = o4.e0.a(this.request.a(outAttrs), new a());
            this.connections.b(new WeakReference<>(zVarA));
            return zVarA;
        }
    }

    public final void d() {
        synchronized (this.lock) {
            try {
                this.disposed = true;
                t2.b<WeakReference<o4.z>> bVar = this.connections;
                int size = bVar.getSize();
                if (size > 0) {
                    WeakReference<o4.z>[] weakReferenceArrM = bVar.m();
                    int i11 = 0;
                    do {
                        o4.z zVar = weakReferenceArrM[i11].get();
                        if (zVar != null) {
                            zVar.a();
                        }
                        i11++;
                    } while (i11 < size);
                }
                this.connections.h();
                jn0.h0 h0Var = jn0.h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean e() {
        return !this.disposed;
    }
}
