package p015o1;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import jn0.h0;
import k3.p1;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;
import p019p1.c;
import p019p1.e1;
import p019p1.i;
import p019p1.j;
import p020r2.o;
import p020r2.y3;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aR\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\"\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00000\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"Lk3/p1;", "targetValue", "Lp1/i;", "animationSpec", "", AnnotatedPrivateKey.LABEL, "Lkotlin/Function1;", "Ljn0/h0;", "finishedListener", "Lr2/y3;", "a", "(JLp1/i;Ljava/lang/String;Lwn0/l;Lr2/l;II)Lr2/y3;", "Lp1/e1;", "Lp1/e1;", "colorDefaultSpring", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final e1<p1> f95694a = j.j(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 7, null);

    public static final y3<p1> a(long j11, i<p1> iVar, String str, l<? super p1, h0> lVar, p020r2.l lVar2, int i11, int i12) {
        if ((i12 & 2) != 0) {
            iVar = f95694a;
        }
        i<p1> iVar2 = iVar;
        if ((i12 & 4) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        if ((i12 & 8) != 0) {
            lVar = null;
        }
        l<? super p1, h0> lVar3 = lVar;
        if (o.J()) {
            o.S(-451899108, i11, -1, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:61)");
        }
        boolean zN = lVar2.n(p1.u(j11));
        Object objI = lVar2.I();
        if (zN || objI == p020r2.l.INSTANCE.a()) {
            objI = (p019p1.p1) Function1.a(p1.INSTANCE).invoke(p1.u(j11));
            lVar2.B(objI);
        }
        int i13 = i11 << 6;
        y3<p1> y3VarF = c.f(p1.l(j11), (p019p1.p1) objI, iVar2, null, str2, lVar3, lVar2, (i11 & 14) | ((i11 << 3) & 896) | (57344 & i13) | (i13 & 458752), 8);
        if (o.J()) {
            o.R();
        }
        return y3VarF;
    }
}
