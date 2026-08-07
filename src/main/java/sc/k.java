package sc;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import jn0.h0;
import jn0.s;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ)\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0015\u001a\u00020\u0014*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006 À\u0006\u0001"}, d2 = {"Lsc/k;", "Landroid/view/View;", "T", "Lsc/i;", "Lsc/g;", "getSize", "()Lsc/g;", "Lsc/a;", "getWidth", "()Lsc/a;", "getHeight", "", "paramSize", "viewSize", "paddingSize", "f", "(III)Lsc/a;", "Landroid/view/ViewTreeObserver;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "victim", "Ljn0/h0;", "b", "(Landroid/view/ViewTreeObserver;Landroid/view/ViewTreeObserver$OnPreDrawListener;)V", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getView", "()Landroid/view/View;", "view", "", "c", "()Z", "subtractPadding", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface k<T extends View> extends i {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements wn0.l<Throwable, h0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k<T> f111068a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewTreeObserver f111069b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f111070c;

        a(k<T> kVar, ViewTreeObserver viewTreeObserver, b bVar) {
            this.f111068a = kVar;
            this.f111069b = viewTreeObserver;
            this.f111070c = bVar;
        }

        public final void a(Throwable th2) {
            this.f111068a.b(this.f111069b, this.f111070c);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Throwable th2) {
            a(th2);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"sc/k$b", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "", "onPreDraw", "()Z", "a", "Z", "isResumed", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private boolean isResumed;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k<T> f111072b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewTreeObserver f111073c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ CancellableContinuation<Size> f111074d;

        /* JADX WARN: Multi-variable type inference failed */
        b(k<T> kVar, ViewTreeObserver viewTreeObserver, CancellableContinuation<? super Size> cancellableContinuation) {
            this.f111072b = kVar;
            this.f111073c = viewTreeObserver;
            this.f111074d = cancellableContinuation;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            Size size = this.f111072b.getSize();
            if (size != null) {
                this.f111072b.b(this.f111073c, this);
                if (!this.isResumed) {
                    this.isResumed = true;
                    this.f111074d.resumeWith(s.b(size));
                }
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    default void b(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
        } else {
            getView().getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
        }
    }

    static /* synthetic */ <T extends View> Object d(k<T> kVar, Continuation<? super Size> continuation) {
        Size size = kVar.getSize();
        if (size != null) {
            return size;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        ViewTreeObserver viewTreeObserver = kVar.getView().getViewTreeObserver();
        b bVar = new b(kVar, viewTreeObserver, cancellableContinuationImpl);
        viewTreeObserver.addOnPreDrawListener(bVar);
        cancellableContinuationImpl.invokeOnCancellation(new a(kVar, viewTreeObserver, bVar));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    private default sc.a f(int paramSize, int viewSize, int paddingSize) {
        if (paramSize == -2) {
            return sc.a.b.f111057a;
        }
        int i11 = paramSize - paddingSize;
        if (i11 > 0) {
            return sc.a.C2364a.a(sc.b.a(i11));
        }
        int i12 = viewSize - paddingSize;
        if (i12 > 0) {
            return sc.a.C2364a.a(sc.b.a(i12));
        }
        return null;
    }

    private default sc.a getHeight() {
        ViewGroup.LayoutParams layoutParams = getView().getLayoutParams();
        return f(layoutParams != null ? layoutParams.height : -1, getView().getHeight(), c() ? getView().getPaddingTop() + getView().getPaddingBottom() : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    default Size getSize() {
        sc.a height;
        sc.a width = getWidth();
        if (width == null || (height = getHeight()) == null) {
            return null;
        }
        return new Size(width, height);
    }

    private default sc.a getWidth() {
        ViewGroup.LayoutParams layoutParams = getView().getLayoutParams();
        return f(layoutParams != null ? layoutParams.width : -1, getView().getWidth(), c() ? getView().getPaddingLeft() + getView().getPaddingRight() : 0);
    }

    @Override // sc.i
    default Object a(Continuation<? super Size> continuation) {
        return d(this, continuation);
    }

    default boolean c() {
        return true;
    }

    T getView();
}
