package com.fourthline.orca.internal;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: renamed from: com.fourthline.orca.internal.x4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4014x4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4014x4 f36666a = new C4014x4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static wn0.q f36667b = z2.c.c(-1201960509, false, a.f36668a);

    /* JADX INFO: renamed from: com.fourthline.orca.internal.x4$a */
    static final class a implements wn0.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f36668a = new a();

        a() {
        }

        public final void a(p015o1.e AnimatedVisibility, p020r2.l lVar, int i11) {
            p013kotlin.jvm.internal.s.k(AnimatedVisibility, "$this$AnimatedVisibility");
            if (p020r2.o.J()) {
                p020r2.o.S(-1201960509, i11, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.ComposableSingletons$ShutterAnimationEffectKt.lambda-1.<anonymous> (ShutterAnimationEffect.kt:26)");
            }
            androidx.compose.foundation.layout.g.a(androidx.compose.foundation.b.d(androidx.compose.foundation.layout.x.f(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), k3.p1.INSTANCE.a(), null, 2, null), lVar, 6);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((p015o1.e) obj, (p020r2.l) obj2, ((Number) obj3).intValue());
            return jn0.h0.f84049a;
        }
    }

    public final wn0.q a() {
        return f36667b;
    }
}
