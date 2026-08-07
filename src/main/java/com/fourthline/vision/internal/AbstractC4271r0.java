package com.fourthline.vision.internal;

import p013kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.fourthline.vision.internal.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4271r0 {

    /* JADX INFO: renamed from: com.fourthline.vision.internal.r0$a */
    public static final class a implements InterfaceC4265q0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ wn0.l f38796a;

        a(wn0.l<? super T, jn0.h0> lVar) {
            this.f38796a = lVar;
        }

        @Override // com.fourthline.vision.internal.InterfaceC4265q0
        public Object consume(T t11, Continuation<? super jn0.h0> continuation) {
            this.f38796a.invoke(t11);
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.vision.internal.r0$b */
    public static final class b implements G5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ wn0.l f38797a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ wn0.a f38798b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.a f38799c;

        b(wn0.l<? super T, jn0.h0> lVar, wn0.a<jn0.h0> aVar, wn0.a<jn0.h0> aVar2) {
            this.f38797a = lVar;
            this.f38798b = aVar;
            this.f38799c = aVar2;
        }

        @Override // com.fourthline.vision.internal.G5, com.fourthline.vision.internal.InterfaceC4265q0
        public Object consume(T t11, Continuation<? super jn0.h0> continuation) {
            this.f38797a.invoke(t11);
            return jn0.h0.f84049a;
        }

        @Override // com.fourthline.vision.internal.G5, com.fourthline.vision.internal.F5
        public void start() {
            this.f38798b.invoke();
        }

        @Override // com.fourthline.vision.internal.G5, com.fourthline.vision.internal.F5
        public void stop() {
            this.f38799c.invoke();
        }
    }

    public static final <T> InterfaceC4265q0 consumer(wn0.l<? super T, jn0.h0> onConsume) {
        p013kotlin.jvm.internal.s.k(onConsume, "onConsume");
        return new a(onConsume);
    }

    public static /* synthetic */ InterfaceC4265q0 consumer$default(wn0.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lVar = new wn0.l() { // from class: com.fourthline.vision.internal.hb
                @Override // wn0.l
                public final Object invoke(Object obj2) {
                    return AbstractC4271r0.consumer$lambda$0(obj2);
                }
            };
        }
        return consumer(lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 consumer$lambda$0(Object obj) {
        return jn0.h0.f84049a;
    }

    public static final <T> G5 startableConsumer(wn0.a<jn0.h0> onStart, wn0.a<jn0.h0> onStop, wn0.l<? super T, jn0.h0> onConsume) {
        p013kotlin.jvm.internal.s.k(onStart, "onStart");
        p013kotlin.jvm.internal.s.k(onStop, "onStop");
        p013kotlin.jvm.internal.s.k(onConsume, "onConsume");
        return new b(onConsume, onStart, onStop);
    }

    public static /* synthetic */ G5 startableConsumer$default(wn0.a aVar, wn0.a aVar2, wn0.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = new wn0.a() { // from class: com.fourthline.vision.internal.eb
                @Override // wn0.a
                public final Object invoke() {
                    return jn0.h0.f84049a;
                }
            };
        }
        if ((i11 & 2) != 0) {
            aVar2 = new wn0.a() { // from class: com.fourthline.vision.internal.fb
                @Override // wn0.a
                public final Object invoke() {
                    return jn0.h0.f84049a;
                }
            };
        }
        if ((i11 & 4) != 0) {
            lVar = new wn0.l() { // from class: com.fourthline.vision.internal.gb
                @Override // wn0.l
                public final Object invoke(Object obj2) {
                    return AbstractC4271r0.startableConsumer$lambda$3(obj2);
                }
            };
        }
        return startableConsumer(aVar, aVar2, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 startableConsumer$lambda$3(Object obj) {
        return jn0.h0.f84049a;
    }
}
