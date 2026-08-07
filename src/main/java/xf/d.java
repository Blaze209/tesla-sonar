package xf;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\u000e\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lxf/b;", DateTokenConverter.CONVERTER_KEY, "(Lr2/l;I)Lxf/b;", "a", "()Lxf/b;", "Ljn0/h0;", "e", "(Lxf/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ltf/i;", "composition", "Lxf/j;", "clipSpec", "", "speed", "c", "(Ltf/i;Lxf/j;F)F", "lottie-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class d {
    public static final b a() {
        return new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float c(tf.i iVar, j jVar, float f11) {
        if (f11 < BitmapDescriptorFactory.HUE_RED && iVar == null) {
            return 1.0f;
        }
        if (iVar == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (f11 >= BitmapDescriptorFactory.HUE_RED) {
            return jVar != null ? jVar.b(iVar) : BitmapDescriptorFactory.HUE_RED;
        }
        if (jVar != null) {
            return jVar.a(iVar);
        }
        return 1.0f;
    }

    public static final b d(p020r2.l lVar, int i11) {
        lVar.H(2024497114);
        if (p020r2.o.J()) {
            p020r2.o.S(2024497114, i11, -1, "com.airbnb.lottie.compose.rememberLottieAnimatable (LottieAnimatable.kt:28)");
        }
        lVar.H(-610207850);
        Object objI = lVar.I();
        if (objI == p020r2.l.INSTANCE.a()) {
            objI = a();
            lVar.B(objI);
        }
        b bVar = (b) objI;
        lVar.T();
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        lVar.T();
        return bVar;
    }

    public static final Object e(b bVar, Continuation<? super h0> continuation) {
        Object objB = b.a.b(bVar, null, c(bVar.s(), bVar.y(), bVar.m()), 1, false, continuation, 9, null);
        return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : h0.f84049a;
    }
}
