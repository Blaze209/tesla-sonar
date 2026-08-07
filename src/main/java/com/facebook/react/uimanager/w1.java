package com.facebook.react.uimanager;

import p013kotlin.Lazy;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007R!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\b\u001a\u0004\b\t\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/facebook/react/uimanager/w1;", "", "<init>", "()V", "Ljn/b;", "Lcom/facebook/yoga/r;", "b", "()Ljn/b;", "Lkotlin/Lazy;", "c", "pool", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w1 f23420a = new w1();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Lazy pool = jn0.m.a(jn0.p.SYNCHRONIZED, new wn0.a() { // from class: com.facebook.react.uimanager.v1
        @Override // wn0.a
        public final Object invoke() {
            return w1.d();
        }
    });

    private w1() {
    }

    public static final jn.b<com.facebook.yoga.r> b() {
        return f23420a.c();
    }

    private final jn.b<com.facebook.yoga.r> c() {
        return (jn.b) pool.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn.b d() {
        return new jn.b(1024);
    }
}
