package com.facebook.react.modules.core;

import android.view.Choreographer;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayDeque;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 %2\u00020\u0001:\u0002\u0013\u0018B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u001d\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0011\u0010\u000fR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0010\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/facebook/react/modules/core/b;", "", "Lsn/b;", "choreographerProvider", "<init>", "(Lsn/b;)V", "Ljn0/h0;", "l", "()V", "j", "Lcom/facebook/react/modules/core/b$a;", "type", "Landroid/view/Choreographer$FrameCallback;", "callback", "k", "(Lcom/facebook/react/modules/core/b$a;Landroid/view/Choreographer$FrameCallback;)V", "frameCallback", "n", "Lsn/b$a;", "a", "Lsn/b$a;", "choreographer", "", "Ljava/util/ArrayDeque;", "b", "[Ljava/util/ArrayDeque;", "callbackQueues", "", "c", "I", "totalCallbacks", "", DateTokenConverter.CONVERTER_KEY, "Z", "hasPostedCallback", "e", "Landroid/view/Choreographer$FrameCallback;", "f", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static b f22747g;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private sn.b.a choreographer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ArrayDeque<Choreographer.FrameCallback>[] callbackQueues;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int totalCallbacks;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean hasPostedCallback;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Choreographer.FrameCallback frameCallback;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/facebook/react/modules/core/b$a;", "", "", "order", "<init>", "(Ljava/lang/String;II)V", "I", "getOrder$ReactAndroid_release", "()I", "PERF_MARKERS", "DISPATCH_UI", "NATIVE_ANIMATED_MODULE", "TIMERS_EVENTS", "IDLE_EVENT", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum a {
        PERF_MARKERS(0),
        DISPATCH_UI(1),
        NATIVE_ANIMATED_MODULE(2),
        TIMERS_EVENTS(3),
        IDLE_EVENT(4);

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
        private final int order;

        a(int i11) {
            this.order = i11;
        }

        public static EnumEntries<a> getEntries() {
            return $ENTRIES;
        }

        /* JADX INFO: renamed from: getOrder$ReactAndroid_release, reason: from getter */
        public final int getOrder() {
            return this.order;
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.modules.core.b$b, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/facebook/react/modules/core/b$b;", "", "<init>", "()V", "Lsn/b;", "choreographerProvider", "Ljn0/h0;", "b", "(Lsn/b;)V", "Lcom/facebook/react/modules/core/b;", "a", "()Lcom/facebook/react/modules/core/b;", "choreographer", "Lcom/facebook/react/modules/core/b;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a() {
            b bVar = b.f22747g;
            if (bVar != null) {
                return bVar;
            }
            throw new IllegalStateException("ReactChoreographer needs to be initialized.");
        }

        public final void b(sn.b choreographerProvider) {
            s.k(choreographerProvider, "choreographerProvider");
            if (b.f22747g == null) {
                b.f22747g = new b(choreographerProvider, null);
            }
        }

        private Companion() {
        }
    }

    public /* synthetic */ b(sn.b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(b bVar, sn.b bVar2) {
        bVar.choreographer = bVar2.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(b bVar, long j11) {
        synchronized (bVar.callbackQueues) {
            try {
                bVar.hasPostedCallback = false;
                int length = bVar.callbackQueues.length;
                for (int i11 = 0; i11 < length; i11++) {
                    ArrayDeque<Choreographer.FrameCallback> arrayDeque = bVar.callbackQueues[i11];
                    int size = arrayDeque.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        Choreographer.FrameCallback frameCallbackPollFirst = arrayDeque.pollFirst();
                        if (frameCallbackPollFirst != null) {
                            frameCallbackPollFirst.doFrame(j11);
                            bVar.totalCallbacks--;
                        } else {
                            qk.a.m("ReactNative", "Tried to execute non-existent frame callback");
                        }
                    }
                }
                bVar.j();
                h0 h0Var = h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static final b h() {
        return INSTANCE.a();
    }

    public static final void i(sn.b bVar) {
        INSTANCE.b(bVar);
    }

    private final void j() {
        gn.a.a(this.totalCallbacks >= 0);
        if (this.totalCallbacks == 0 && this.hasPostedCallback) {
            sn.b.a aVar = this.choreographer;
            if (aVar != null) {
                aVar.a(this.frameCallback);
            }
            this.hasPostedCallback = false;
        }
    }

    private final void l() {
        if (this.hasPostedCallback) {
            return;
        }
        sn.b.a aVar = this.choreographer;
        if (aVar == null) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: co.j
                @Override // java.lang.Runnable
                public final void run() {
                    com.facebook.react.modules.core.b.m(this.f19451a);
                }
            });
        } else {
            aVar.b(this.frameCallback);
            this.hasPostedCallback = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(b bVar) {
        synchronized (bVar.callbackQueues) {
            bVar.l();
            h0 h0Var = h0.f84049a;
        }
    }

    public final void k(a type, Choreographer.FrameCallback callback) {
        s.k(type, "type");
        s.k(callback, "callback");
        synchronized (this.callbackQueues) {
            this.callbackQueues[type.getOrder()].addLast(callback);
            boolean z11 = true;
            int i11 = this.totalCallbacks + 1;
            this.totalCallbacks = i11;
            if (i11 <= 0) {
                z11 = false;
            }
            gn.a.a(z11);
            l();
            h0 h0Var = h0.f84049a;
        }
    }

    public final void n(a type, Choreographer.FrameCallback frameCallback) {
        s.k(type, "type");
        synchronized (this.callbackQueues) {
            try {
                if (this.callbackQueues[type.getOrder()].removeFirstOccurrence(frameCallback)) {
                    this.totalCallbacks--;
                    j();
                } else {
                    qk.a.m("ReactNative", "Tried to remove non-existent frame callback");
                }
                h0 h0Var = h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private b(final sn.b bVar) {
        int size = a.getEntries().size();
        ArrayDeque<Choreographer.FrameCallback>[] arrayDequeArr = new ArrayDeque[size];
        for (int i11 = 0; i11 < size; i11++) {
            arrayDequeArr[i11] = new ArrayDeque<>();
        }
        this.callbackQueues = arrayDequeArr;
        this.frameCallback = new Choreographer.FrameCallback() { // from class: co.h
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j11) {
                com.facebook.react.modules.core.b.g(this.f19448a, j11);
            }
        };
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: co.i
            @Override // java.lang.Runnable
            public final void run() {
                com.facebook.react.modules.core.b.d(this.f19449a, bVar);
            }
        });
    }
}
