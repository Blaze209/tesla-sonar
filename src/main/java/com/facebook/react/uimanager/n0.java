package com.facebook.react.uimanager;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.Lazy;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\b\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/facebook/react/uimanager/n0;", "", "<init>", "()V", "Lcom/facebook/yoga/c;", "b", "Lkotlin/Lazy;", "()Lcom/facebook/yoga/c;", "yogaConfig", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n0 f23343a = new n0();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Lazy yogaConfig = jn0.m.a(jn0.p.NONE, new wn0.a() { // from class: com.facebook.react.uimanager.m0
        @Override // wn0.a
        public final Object invoke() {
            return n0.c();
        }
    });

    private n0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.facebook.yoga.c c() {
        com.facebook.yoga.c cVarA = com.facebook.yoga.d.a();
        cVarA.b(BitmapDescriptorFactory.HUE_RED);
        cVarA.a(com.facebook.yoga.k.ALL);
        return cVarA;
    }

    public final com.facebook.yoga.c b() {
        Object value = yogaConfig.getValue();
        p013kotlin.jvm.internal.s.j(value, "getValue(...)");
        return (com.facebook.yoga.c) value;
    }
}
