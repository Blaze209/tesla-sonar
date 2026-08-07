package androidx.compose.ui.graphics;

import androidx.compose.ui.platform.o1;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import jn0.h0;
import k3.a4;
import k3.b4;
import k3.g4;
import k3.h3;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aÂ\u0001\u0010\u0019\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a'\u0010\u001f\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0007¢\u0006\u0004\b\u001f\u0010 \u001a\u0013\u0010!\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b!\u0010\"\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"Landroidx/compose/ui/d;", "", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Landroidx/compose/ui/graphics/f;", "transformOrigin", "Lk3/g4;", "shape", "", "clip", "Lk3/b4;", "renderEffect", "Lk3/p1;", "ambientShadowColor", "spotShadowColor", "Landroidx/compose/ui/graphics/a;", "compositingStrategy", "b", "(Landroidx/compose/ui/d;FFFFFFFFFFJLk3/g4;ZLk3/b4;JJI)Landroidx/compose/ui/d;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/c;", "Ljn0/h0;", "block", "a", "(Landroidx/compose/ui/d;Lwn0/l;)Landroidx/compose/ui/d;", DateTokenConverter.CONVERTER_KEY, "(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class b {
    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, l<? super c, h0> lVar) {
        return dVar.g(new BlockGraphicsLayerElement(lVar));
    }

    public static final androidx.compose.ui.d b(androidx.compose.ui.d dVar, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, long j11, g4 g4Var, boolean z11, b4 b4Var, long j12, long j13, int i11) {
        return dVar.g(new GraphicsLayerElement(f11, f12, f13, f14, f15, f16, f17, f18, f19, f21, j11, g4Var, z11, b4Var, j12, j13, i11, null));
    }

    public static /* synthetic */ androidx.compose.ui.d c(androidx.compose.ui.d dVar, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, long j11, g4 g4Var, boolean z11, b4 b4Var, long j12, long j13, int i11, int i12, Object obj) {
        float f22 = (i12 & 1) != 0 ? 1.0f : f11;
        float f23 = (i12 & 2) != 0 ? 1.0f : f12;
        float f24 = (i12 & 4) == 0 ? f13 : 1.0f;
        int i13 = i12 & 8;
        float f25 = BitmapDescriptorFactory.HUE_RED;
        float f26 = i13 != 0 ? 0.0f : f14;
        float f27 = (i12 & 16) != 0 ? 0.0f : f15;
        float f28 = (i12 & 32) != 0 ? 0.0f : f16;
        float f29 = (i12 & 64) != 0 ? 0.0f : f17;
        float f31 = (i12 & 128) != 0 ? 0.0f : f18;
        if ((i12 & 256) == 0) {
            f25 = f19;
        }
        return b(dVar, f22, f23, f24, f26, f27, f28, f29, f31, f25, (i12 & 512) != 0 ? 8.0f : f21, (i12 & 1024) != 0 ? f.INSTANCE.a() : j11, (i12 & 2048) != 0 ? a4.a() : g4Var, (i12 & 4096) != 0 ? false : z11, (i12 & PKIFailureInfo.certRevoked) != 0 ? null : b4Var, (i12 & 16384) != 0 ? h3.a() : j12, (32768 & i12) != 0 ? h3.a() : j13, (i12 & 65536) != 0 ? a.INSTANCE.a() : i11);
    }

    public static final androidx.compose.ui.d d(androidx.compose.ui.d dVar) {
        return o1.b() ? dVar.g(c(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0L, null, false, null, 0L, 0L, 0, 131071, null)) : dVar;
    }
}
