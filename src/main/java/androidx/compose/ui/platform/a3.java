package androidx.compose.ui.platform;

import android.view.View;
import androidx.p003lifecycle.LifecycleOwner;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u00062\u00020\u0001:\u0003\u0006\b\tJ\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/a3;", "", "Landroidx/compose/ui/platform/a;", "view", "Lkotlin/Function0;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/platform/a;)Lwn0/a;", "b", "c", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f5644a;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.a3$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/a3$a;", "", "<init>", "()V", "Landroidx/compose/ui/platform/a3;", "a", "()Landroidx/compose/ui/platform/a3;", "Default", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f5644a = new Companion();

        private Companion() {
        }

        public final a3 a() {
            return b.f5645b;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/a3$b;", "Landroidx/compose/ui/platform/a3;", "<init>", "()V", "Landroidx/compose/ui/platform/a;", "view", "Lkotlin/Function0;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/platform/a;)Lwn0/a;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements a3 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f5645b = new b();

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
        static final class a extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.a f5646c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ ViewOnAttachStateChangeListenerC0122b f5647d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ q6.b f5648e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.platform.a aVar, ViewOnAttachStateChangeListenerC0122b viewOnAttachStateChangeListenerC0122b, q6.b bVar) {
                super(0);
                this.f5646c = aVar;
                this.f5647d = viewOnAttachStateChangeListenerC0122b;
                this.f5648e = bVar;
            }

            public final void b() {
                this.f5646c.removeOnAttachStateChangeListener(this.f5647d);
                q6.a.g(this.f5646c, this.f5648e);
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ jn0.h0 invoke() {
                b();
                return jn0.h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.ui.platform.a3$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/compose/ui/platform/a3$b$b", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "Ljn0/h0;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ViewOnAttachStateChangeListenerC0122b implements View.OnAttachStateChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.a f5649a;

            ViewOnAttachStateChangeListenerC0122b(androidx.compose.ui.platform.a aVar) {
                this.f5649a = aVar;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v11) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v11) {
                if (q6.a.f(this.f5649a)) {
                    return;
                }
                this.f5649a.e();
            }
        }

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(androidx.compose.ui.platform.a aVar) {
            aVar.e();
        }

        @Override // androidx.compose.ui.platform.a3
        public wn0.a<jn0.h0> a(final androidx.compose.ui.platform.a view) {
            ViewOnAttachStateChangeListenerC0122b viewOnAttachStateChangeListenerC0122b = new ViewOnAttachStateChangeListenerC0122b(view);
            view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0122b);
            q6.b bVar = new q6.b() { // from class: androidx.compose.ui.platform.b3
                @Override // q6.b
                public final void a() {
                    a3.b.c(view);
                }
            };
            q6.a.a(view, bVar);
            return new a(view, viewOnAttachStateChangeListenerC0122b, bVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/a3$c;", "Landroidx/compose/ui/platform/a3;", "<init>", "()V", "Landroidx/compose/ui/platform/a;", "view", "Lkotlin/Function0;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/platform/a;)Lwn0/a;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements a3 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f5650b = new c();

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
        static final class a extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.a f5651c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ ViewOnAttachStateChangeListenerC0123c f5652d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.platform.a aVar, ViewOnAttachStateChangeListenerC0123c viewOnAttachStateChangeListenerC0123c) {
                super(0);
                this.f5651c = aVar;
                this.f5652d = viewOnAttachStateChangeListenerC0123c;
            }

            public final void b() {
                this.f5651c.removeOnAttachStateChangeListener(this.f5652d);
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ jn0.h0 invoke() {
                b();
                return jn0.h0.f84049a;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
        static final class b extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ p013kotlin.jvm.internal.n0<wn0.a<jn0.h0>> f5653c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(p013kotlin.jvm.internal.n0<wn0.a<jn0.h0>> n0Var) {
                super(0);
                this.f5653c = n0Var;
            }

            public final void b() {
                this.f5653c.f86529a.invoke();
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ jn0.h0 invoke() {
                b();
                return jn0.h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.ui.platform.a3$c$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/compose/ui/platform/a3$c$c", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "Ljn0/h0;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ViewOnAttachStateChangeListenerC0123c implements View.OnAttachStateChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.a f5654a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p013kotlin.jvm.internal.n0<wn0.a<jn0.h0>> f5655b;

            ViewOnAttachStateChangeListenerC0123c(androidx.compose.ui.platform.a aVar, p013kotlin.jvm.internal.n0<wn0.a<jn0.h0>> n0Var) {
                this.f5654a = aVar;
                this.f5655b = n0Var;
            }

            /* JADX WARN: Type inference failed for: r3v7, types: [T, wn0.a] */
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v11) {
                LifecycleOwner lifecycleOwnerA = androidx.p003lifecycle.View.a(this.f5654a);
                androidx.compose.ui.platform.a aVar = this.f5654a;
                if (lifecycleOwnerA != null) {
                    this.f5655b.f86529a = d3.c(aVar, lifecycleOwnerA.getLifecycle());
                    this.f5654a.removeOnAttachStateChangeListener(this);
                } else {
                    y3.a.c("View tree for " + aVar + " has no ViewTreeLifecycleOwner");
                    throw new KotlinNothingValueException();
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v11) {
            }
        }

        private c() {
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [T, androidx.compose.ui.platform.a3$c$a] */
        @Override // androidx.compose.ui.platform.a3
        public wn0.a<jn0.h0> a(androidx.compose.ui.platform.a view) {
            if (!view.isAttachedToWindow()) {
                p013kotlin.jvm.internal.n0 n0Var = new p013kotlin.jvm.internal.n0();
                ViewOnAttachStateChangeListenerC0123c viewOnAttachStateChangeListenerC0123c = new ViewOnAttachStateChangeListenerC0123c(view, n0Var);
                view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0123c);
                n0Var.f86529a = new a(view, viewOnAttachStateChangeListenerC0123c);
                return new b(n0Var);
            }
            LifecycleOwner lifecycleOwnerA = androidx.p003lifecycle.View.a(view);
            if (lifecycleOwnerA != null) {
                return d3.c(view, lifecycleOwnerA.getLifecycle());
            }
            y3.a.c("View tree for " + view + " has no ViewTreeLifecycleOwner");
            throw new KotlinNothingValueException();
        }
    }

    wn0.a<jn0.h0> a(a view);
}
