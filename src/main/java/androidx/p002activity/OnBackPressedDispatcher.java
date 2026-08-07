package androidx.p002activity;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.core.util.Consumer;
import androidx.p003lifecycle.Lifecycle;
import androidx.p003lifecycle.LifecycleOwner;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Iterator;
import java.util.ListIterator;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.collections.m;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.p;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u00047:\u001c#B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0015\b\u0017\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u0015\u0010\u000fJ\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0005H\u0007¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u000bH\u0007¢\u0006\u0004\b'\u0010\u000fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001a0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00102\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00106\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00109\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010<\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010=\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010;¨\u0006>"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher;", "", "Ljava/lang/Runnable;", "fallbackOnBackPressed", "Landroidx/core/util/Consumer;", "", "onHasEnabledCallbacksChanged", "<init>", "(Ljava/lang/Runnable;Landroidx/core/util/Consumer;)V", "(Ljava/lang/Runnable;)V", "shouldBeRegistered", "Ljn0/h0;", "q", "(Z)V", "r", "()V", "Landroidx/activity/b;", "backEvent", "o", "(Landroidx/activity/b;)V", "n", "l", "Landroid/window/OnBackInvokedDispatcher;", "invoker", "p", "(Landroid/window/OnBackInvokedDispatcher;)V", "Landroidx/activity/b0;", "onBackPressedCallback", "h", "(Landroidx/activity/b0;)V", "Landroidx/activity/c;", "j", "(Landroidx/activity/b0;)Landroidx/activity/c;", "Landroidx/lifecycle/LifecycleOwner;", "owner", IntegerTokenConverter.CONVERTER_KEY, "(Landroidx/lifecycle/LifecycleOwner;Landroidx/activity/b0;)V", "k", "()Z", "m", "a", "Ljava/lang/Runnable;", "b", "Landroidx/core/util/Consumer;", "Lkotlin/collections/m;", "c", "Lkotlin/collections/m;", "onBackPressedCallbacks", DateTokenConverter.CONVERTER_KEY, "Landroidx/activity/b0;", "inProgressCallback", "Landroid/window/OnBackInvokedCallback;", "e", "Landroid/window/OnBackInvokedCallback;", "onBackInvokedCallback", "f", "Landroid/window/OnBackInvokedDispatcher;", "invokedDispatcher", "g", "Z", "backInvokedCallbackRegistered", "hasEnabledCallbacks", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OnBackPressedDispatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Runnable fallbackOnBackPressed;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Consumer<Boolean> onHasEnabledCallbacksChanged;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final m<b0> onBackPressedCallbacks;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private b0 inProgressCallback;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private OnBackInvokedCallback onBackInvokedCallback;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private OnBackInvokedDispatcher invokedDispatcher;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean backInvokedCallbackRegistered;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean hasEnabledCallbacks;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/activity/b;", "backEvent", "Ljn0/h0;", "a", "(Landroidx/activity/b;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements l<androidx.p002activity.b, h0> {
        a() {
            super(1);
        }

        public final void a(androidx.p002activity.b backEvent) {
            s.k(backEvent, "backEvent");
            OnBackPressedDispatcher.this.o(backEvent);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(androidx.p002activity.b bVar) {
            a(bVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/activity/b;", "backEvent", "Ljn0/h0;", "a", "(Landroidx/activity/b;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements l<androidx.p002activity.b, h0> {
        b() {
            super(1);
        }

        public final void a(androidx.p002activity.b backEvent) {
            s.k(backEvent, "backEvent");
            OnBackPressedDispatcher.this.n(backEvent);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(androidx.p002activity.b bVar) {
            a(bVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class c extends u implements wn0.a<h0> {
        c() {
            super(0);
        }

        public final void b() {
            OnBackPressedDispatcher.this.m();
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class d extends u implements wn0.a<h0> {
        d() {
            super(0);
        }

        public final void b() {
            OnBackPressedDispatcher.this.l();
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class e extends u implements wn0.a<h0> {
        e() {
            super(0);
        }

        public final void b() {
            OnBackPressedDispatcher.this.m();
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\r¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$f;", "", "<init>", "()V", "dispatcher", "", "priority", "callback", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;ILjava/lang/Object;)V", "e", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Lkotlin/Function0;", "onBackInvoked", "Landroid/window/OnBackInvokedCallback;", "b", "(Lwn0/a;)Landroid/window/OnBackInvokedCallback;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f1873a = new f();

        private f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(wn0.a aVar) {
            aVar.invoke();
        }

        public final OnBackInvokedCallback b(final wn0.a<h0> onBackInvoked) {
            s.k(onBackInvoked, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: androidx.activity.c0
                public final void onBackInvoked() {
                    OnBackPressedDispatcher.f.c(onBackInvoked);
                }
            };
        }

        public final void d(Object dispatcher, int priority, Object callback) {
            s.k(dispatcher, "dispatcher");
            s.k(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(priority, (OnBackInvokedCallback) callback);
        }

        public final void e(Object dispatcher, Object callback) {
            s.k(dispatcher, "dispatcher");
            s.k(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JQ\u0010\r\u001a\u00020\f2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$g;", "", "<init>", "()V", "Lkotlin/Function1;", "Landroidx/activity/b;", "Ljn0/h0;", "onBackStarted", "onBackProgressed", "Lkotlin/Function0;", "onBackInvoked", "onBackCancelled", "Landroid/window/OnBackInvokedCallback;", "a", "(Lwn0/l;Lwn0/l;Lwn0/a;Lwn0/a;)Landroid/window/OnBackInvokedCallback;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f1874a = new g();

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"androidx/activity/OnBackPressedDispatcher$g$a", "Landroid/window/OnBackAnimationCallback;", "Landroid/window/BackEvent;", "backEvent", "Ljn0/h0;", "onBackStarted", "(Landroid/window/BackEvent;)V", "onBackProgressed", "onBackInvoked", "()V", "onBackCancelled", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a implements OnBackAnimationCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ l<androidx.p002activity.b, h0> f1875a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l<androidx.p002activity.b, h0> f1876b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ wn0.a<h0> f1877c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ wn0.a<h0> f1878d;

            /* JADX WARN: Multi-variable type inference failed */
            a(l<? super androidx.p002activity.b, h0> lVar, l<? super androidx.p002activity.b, h0> lVar2, wn0.a<h0> aVar, wn0.a<h0> aVar2) {
                this.f1875a = lVar;
                this.f1876b = lVar2;
                this.f1877c = aVar;
                this.f1878d = aVar2;
            }

            public void onBackCancelled() {
                this.f1878d.invoke();
            }

            public void onBackInvoked() {
                this.f1877c.invoke();
            }

            public void onBackProgressed(BackEvent backEvent) {
                s.k(backEvent, "backEvent");
                this.f1876b.invoke(new androidx.p002activity.b(backEvent));
            }

            public void onBackStarted(BackEvent backEvent) {
                s.k(backEvent, "backEvent");
                this.f1875a.invoke(new androidx.p002activity.b(backEvent));
            }
        }

        private g() {
        }

        public final OnBackInvokedCallback a(l<? super androidx.p002activity.b, h0> onBackStarted, l<? super androidx.p002activity.b, h0> onBackProgressed, wn0.a<h0> onBackInvoked, wn0.a<h0> onBackCancelled) {
            s.k(onBackStarted, "onBackStarted");
            s.k(onBackProgressed, "onBackProgressed");
            s.k(onBackInvoked, "onBackInvoked");
            s.k(onBackCancelled, "onBackCancelled");
            return new a(onBackStarted, onBackProgressed, onBackInvoked, onBackCancelled);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$h;", "Landroidx/lifecycle/u;", "Landroidx/activity/c;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroidx/activity/b0;", "onBackPressedCallback", "<init>", "(Landroidx/activity/OnBackPressedDispatcher;Landroidx/lifecycle/Lifecycle;Landroidx/activity/b0;)V", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$a;", "event", "Ljn0/h0;", "onStateChanged", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$a;)V", "cancel", "()V", "a", "Landroidx/lifecycle/Lifecycle;", "b", "Landroidx/activity/b0;", "c", "Landroidx/activity/c;", "currentCancellable", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class h implements androidx.p003lifecycle.u, androidx.p002activity.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Lifecycle lifecycle;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final b0 onBackPressedCallback;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private androidx.p002activity.c currentCancellable;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ OnBackPressedDispatcher f1882d;

        public h(OnBackPressedDispatcher onBackPressedDispatcher, Lifecycle lifecycle, b0 onBackPressedCallback) {
            s.k(lifecycle, "lifecycle");
            s.k(onBackPressedCallback, "onBackPressedCallback");
            this.f1882d = onBackPressedDispatcher;
            this.lifecycle = lifecycle;
            this.onBackPressedCallback = onBackPressedCallback;
            lifecycle.a(this);
        }

        @Override // androidx.p002activity.c
        public void cancel() {
            this.lifecycle.d(this);
            this.onBackPressedCallback.removeCancellable(this);
            androidx.p002activity.c cVar = this.currentCancellable;
            if (cVar != null) {
                cVar.cancel();
            }
            this.currentCancellable = null;
        }

        @Override // androidx.p003lifecycle.u
        public void onStateChanged(LifecycleOwner source, Lifecycle.a event) {
            s.k(source, "source");
            s.k(event, "event");
            if (event == Lifecycle.a.ON_START) {
                this.currentCancellable = this.f1882d.j(this.onBackPressedCallback);
                return;
            }
            if (event != Lifecycle.a.ON_STOP) {
                if (event == Lifecycle.a.ON_DESTROY) {
                    cancel();
                }
            } else {
                androidx.p002activity.c cVar = this.currentCancellable;
                if (cVar != null) {
                    cVar.cancel();
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$i;", "Landroidx/activity/c;", "Landroidx/activity/b0;", "onBackPressedCallback", "<init>", "(Landroidx/activity/OnBackPressedDispatcher;Landroidx/activity/b0;)V", "Ljn0/h0;", "cancel", "()V", "a", "Landroidx/activity/b0;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class i implements androidx.p002activity.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final b0 onBackPressedCallback;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ OnBackPressedDispatcher f1884b;

        public i(OnBackPressedDispatcher onBackPressedDispatcher, b0 onBackPressedCallback) {
            s.k(onBackPressedCallback, "onBackPressedCallback");
            this.f1884b = onBackPressedDispatcher;
            this.onBackPressedCallback = onBackPressedCallback;
        }

        @Override // androidx.p002activity.c
        public void cancel() {
            this.f1884b.onBackPressedCallbacks.remove(this.onBackPressedCallback);
            if (s.f(this.f1884b.inProgressCallback, this.onBackPressedCallback)) {
                this.onBackPressedCallback.handleOnBackCancelled();
                this.f1884b.inProgressCallback = null;
            }
            this.onBackPressedCallback.removeCancellable(this);
            wn0.a<h0> enabledChangedCallback$activity_release = this.onBackPressedCallback.getEnabledChangedCallback$activity_release();
            if (enabledChangedCallback$activity_release != null) {
                enabledChangedCallback$activity_release.invoke();
            }
            this.onBackPressedCallback.setEnabledChangedCallback$activity_release(null);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class j extends p implements wn0.a<h0> {
        j(Object obj) {
            super(0, obj, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            o();
            return h0.f84049a;
        }

        public final void o() {
            ((OnBackPressedDispatcher) this.receiver).r();
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class k extends p implements wn0.a<h0> {
        k(Object obj) {
            super(0, obj, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            o();
            return h0.f84049a;
        }

        public final void o() {
            ((OnBackPressedDispatcher) this.receiver).r();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OnBackPressedDispatcher() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        b0 b0VarPrevious;
        b0 b0Var = this.inProgressCallback;
        if (b0Var == null) {
            m<b0> mVar = this.onBackPressedCallbacks;
            ListIterator<b0> listIterator = mVar.listIterator(mVar.size());
            do {
                if (!listIterator.hasPrevious()) {
                    b0VarPrevious = null;
                    break;
                }
                b0VarPrevious = listIterator.previous();
            } while (!b0VarPrevious.getIsEnabled());
            b0Var = b0VarPrevious;
        }
        this.inProgressCallback = null;
        if (b0Var != null) {
            b0Var.handleOnBackCancelled();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(androidx.p002activity.b backEvent) {
        b0 b0VarPrevious;
        b0 b0Var = this.inProgressCallback;
        if (b0Var == null) {
            m<b0> mVar = this.onBackPressedCallbacks;
            ListIterator<b0> listIterator = mVar.listIterator(mVar.size());
            do {
                if (!listIterator.hasPrevious()) {
                    b0VarPrevious = null;
                    break;
                }
                b0VarPrevious = listIterator.previous();
            } while (!b0VarPrevious.getIsEnabled());
            b0Var = b0VarPrevious;
        }
        if (b0Var != null) {
            b0Var.handleOnBackProgressed(backEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(androidx.p002activity.b backEvent) {
        b0 b0VarPrevious;
        m<b0> mVar = this.onBackPressedCallbacks;
        ListIterator<b0> listIterator = mVar.listIterator(mVar.size());
        do {
            if (!listIterator.hasPrevious()) {
                b0VarPrevious = null;
                break;
            }
            b0VarPrevious = listIterator.previous();
        } while (!b0VarPrevious.getIsEnabled());
        b0 b0Var = b0VarPrevious;
        if (this.inProgressCallback != null) {
            l();
        }
        this.inProgressCallback = b0Var;
        if (b0Var != null) {
            b0Var.handleOnBackStarted(backEvent);
        }
    }

    private final void q(boolean shouldBeRegistered) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.invokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback = this.onBackInvokedCallback;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (shouldBeRegistered && !this.backInvokedCallbackRegistered) {
            f.f1873a.d(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.backInvokedCallbackRegistered = true;
        } else {
            if (shouldBeRegistered || !this.backInvokedCallbackRegistered) {
                return;
            }
            f.f1873a.e(onBackInvokedDispatcher, onBackInvokedCallback);
            this.backInvokedCallbackRegistered = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r() {
        boolean z11 = this.hasEnabledCallbacks;
        m<b0> mVar = this.onBackPressedCallbacks;
        boolean z12 = false;
        if (mVar == null || !mVar.isEmpty()) {
            Iterator<b0> it = mVar.iterator();
            while (it.hasNext()) {
                if (it.next().getIsEnabled()) {
                    z12 = true;
                    break;
                }
            }
        }
        this.hasEnabledCallbacks = z12;
        if (z12 != z11) {
            Consumer<Boolean> consumer = this.onHasEnabledCallbacksChanged;
            if (consumer != null) {
                consumer.accept(Boolean.valueOf(z12));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                q(z12);
            }
        }
    }

    public final void h(b0 onBackPressedCallback) {
        s.k(onBackPressedCallback, "onBackPressedCallback");
        j(onBackPressedCallback);
    }

    public final void i(LifecycleOwner owner, b0 onBackPressedCallback) {
        s.k(owner, "owner");
        s.k(onBackPressedCallback, "onBackPressedCallback");
        Lifecycle lifecycle = owner.getLifecycle();
        if (lifecycle.getState() == Lifecycle.State.DESTROYED) {
            return;
        }
        onBackPressedCallback.addCancellable(new h(this, lifecycle, onBackPressedCallback));
        r();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new j(this));
    }

    public final androidx.p002activity.c j(b0 onBackPressedCallback) {
        s.k(onBackPressedCallback, "onBackPressedCallback");
        this.onBackPressedCallbacks.add(onBackPressedCallback);
        i iVar = new i(this, onBackPressedCallback);
        onBackPressedCallback.addCancellable(iVar);
        r();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new k(this));
        return iVar;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getHasEnabledCallbacks() {
        return this.hasEnabledCallbacks;
    }

    public final void m() {
        b0 b0VarPrevious;
        b0 b0Var = this.inProgressCallback;
        if (b0Var == null) {
            m<b0> mVar = this.onBackPressedCallbacks;
            ListIterator<b0> listIterator = mVar.listIterator(mVar.size());
            do {
                if (!listIterator.hasPrevious()) {
                    b0VarPrevious = null;
                    break;
                }
                b0VarPrevious = listIterator.previous();
            } while (!b0VarPrevious.getIsEnabled());
            b0Var = b0VarPrevious;
        }
        this.inProgressCallback = null;
        if (b0Var != null) {
            b0Var.handleOnBackPressed();
            return;
        }
        Runnable runnable = this.fallbackOnBackPressed;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void p(OnBackInvokedDispatcher invoker) {
        s.k(invoker, "invoker");
        this.invokedDispatcher = invoker;
        q(this.hasEnabledCallbacks);
    }

    public OnBackPressedDispatcher(Runnable runnable, Consumer<Boolean> consumer) {
        this.fallbackOnBackPressed = runnable;
        this.onHasEnabledCallbacksChanged = consumer;
        this.onBackPressedCallbacks = new m<>();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            this.onBackInvokedCallback = i11 >= 34 ? g.f1874a.a(new a(), new b(), new c(), new d()) : f.f1873a.b(new e());
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this(runnable, null);
    }

    public /* synthetic */ OnBackPressedDispatcher(Runnable runnable, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : runnable);
    }
}
