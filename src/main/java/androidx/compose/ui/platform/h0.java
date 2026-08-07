package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewParent;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001e\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a.\u0010\t\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0000H\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a2\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001b\u0010\u0014\u001a\u00020\u0013*\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0016*\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\".\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Lk3/n3;", "other", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "([F[F)V", "", "x", "y", "tmpMatrix", "j", "([FFF[F)V", "m1", "", "row", "m2", "column", "f", "([FI[FI)F", "Landroid/view/View;", "", "e", "(Landroid/view/View;Landroid/view/View;)Z", "Landroidx/compose/ui/platform/coreshims/d;", "g", "(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/d;", "Lkotlin/Function1;", "Lo4/j0;", "a", "Lwn0/l;", "h", "()Lwn0/l;", "setPlatformTextInputServiceInterceptor", "(Lwn0/l;)V", "platformTextInputServiceInterceptor", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static wn0.l<? super o4.j0, ? extends o4.j0> f5749a = a.f5750c;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(View view, View view2) {
        if (p013kotlin.jvm.internal.s.f(view2, view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    private static final float f(float[] fArr, int i11, float[] fArr2, int i12) {
        int i13 = i11 * 4;
        return (fArr[i13] * fArr2[i12]) + (fArr[i13 + 1] * fArr2[4 + i12]) + (fArr[i13 + 2] * fArr2[8 + i12]) + (fArr[i13 + 3] * fArr2[12 + i12]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.platform.coreshims.d g(View view) {
        androidx.compose.ui.platform.coreshims.e.c(view, 1);
        return androidx.compose.ui.platform.coreshims.e.b(view);
    }

    public static final wn0.l<o4.j0, o4.j0> h() {
        return f5749a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(float[] fArr, float[] fArr2) {
        float f11 = f(fArr2, 0, fArr, 0);
        float f12 = f(fArr2, 0, fArr, 1);
        float f13 = f(fArr2, 0, fArr, 2);
        float f14 = f(fArr2, 0, fArr, 3);
        float f15 = f(fArr2, 1, fArr, 0);
        float f16 = f(fArr2, 1, fArr, 1);
        float f17 = f(fArr2, 1, fArr, 2);
        float f18 = f(fArr2, 1, fArr, 3);
        float f19 = f(fArr2, 2, fArr, 0);
        float f21 = f(fArr2, 2, fArr, 1);
        float f22 = f(fArr2, 2, fArr, 2);
        float f23 = f(fArr2, 2, fArr, 3);
        float f24 = f(fArr2, 3, fArr, 0);
        float f25 = f(fArr2, 3, fArr, 1);
        float f26 = f(fArr2, 3, fArr, 2);
        float f27 = f(fArr2, 3, fArr, 3);
        fArr[0] = f11;
        fArr[1] = f12;
        fArr[2] = f13;
        fArr[3] = f14;
        fArr[4] = f15;
        fArr[5] = f16;
        fArr[6] = f17;
        fArr[7] = f18;
        fArr[8] = f19;
        fArr[9] = f21;
        fArr[10] = f22;
        fArr[11] = f23;
        fArr[12] = f24;
        fArr[13] = f25;
        fArr[14] = f26;
        fArr[15] = f27;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(float[] fArr, float f11, float f12, float[] fArr2) {
        k3.n3.j(fArr2);
        k3.n3.s(fArr2, f11, f12, BitmapDescriptorFactory.HUE_RED, 4, null);
        i(fArr, fArr2);
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo4/j0;", "it", "a", "(Lo4/j0;)Lo4/j0;"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<o4.j0, o4.j0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f5750c = new a();

        a() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o4.j0 invoke(o4.j0 j0Var) {
            return j0Var;
        }
    }
}
