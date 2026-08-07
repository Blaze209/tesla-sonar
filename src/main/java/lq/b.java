package lq;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import jn0.e;
import k3.p1;
import k3.r1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes4.dex */
@e
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000f\bg\u0018\u00002\u00020\u0001J:\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H&ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJD\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H&ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJD\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\rR\u001c\u0010\u0015\u001a\u00020\u00108&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0016\u001a\u00020\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u00020\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R$\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u0017\"\u0004\b\u001e\u0010\u0019ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u001fÀ\u0006\u0001"}, d2 = {"Llq/b;", "", "Lk3/p1;", "color", "", "darkIcons", "Lkotlin/Function1;", "transformColorForLightContent", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(JZLwn0/l;)V", "navigationBarContrastEnforced", "h", "(JZZLwn0/l;)V", "isNavigationBarContrastEnforced", "e", "", "getSystemBarsBehavior", "()I", "setSystemBarsBehavior", "(I)V", "systemBarsBehavior", "isStatusBarVisible", "()Z", DateTokenConverter.CONVERTER_KEY, "(Z)V", "isNavigationBarVisible", "a", "value", "isSystemBarsVisible", "b", "systemuicontroller_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface b {
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void c(b bVar, long j11, boolean z11, boolean z12, l lVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setNavigationBarColor-Iv8Zu3U");
        }
        if ((i11 & 2) != 0) {
            z11 = r1.j(j11) > 0.5f;
        }
        boolean z13 = z11;
        boolean z14 = (i11 & 4) != 0 ? true : z12;
        if ((i11 & 8) != 0) {
            lVar = c.f90668b;
        }
        bVar.h(j11, z13, z14, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void f(b bVar, long j11, boolean z11, boolean z12, l lVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setSystemBarsColor-Iv8Zu3U");
        }
        if ((i11 & 2) != 0) {
            z11 = r1.j(j11) > 0.5f;
        }
        boolean z13 = z11;
        boolean z14 = (i11 & 4) != 0 ? true : z12;
        if ((i11 & 8) != 0) {
            lVar = c.f90668b;
        }
        bVar.e(j11, z13, z14, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void g(b bVar, long j11, boolean z11, l lVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setStatusBarColor-ek8zF_U");
        }
        if ((i11 & 2) != 0) {
            z11 = r1.j(j11) > 0.5f;
        }
        if ((i11 & 4) != 0) {
            lVar = c.f90668b;
        }
        bVar.i(j11, z11, lVar);
    }

    void a(boolean z11);

    default void b(boolean z11) {
        d(z11);
        a(z11);
    }

    void d(boolean z11);

    default void e(long color, boolean darkIcons, boolean isNavigationBarContrastEnforced, l<? super p1, p1> transformColorForLightContent) {
        s.k(transformColorForLightContent, "transformColorForLightContent");
        i(color, darkIcons, transformColorForLightContent);
        h(color, darkIcons, isNavigationBarContrastEnforced, transformColorForLightContent);
    }

    void h(long color, boolean darkIcons, boolean navigationBarContrastEnforced, l<? super p1, p1> transformColorForLightContent);

    void i(long color, boolean darkIcons, l<? super p1, p1> transformColorForLightContent);

    void setSystemBarsBehavior(int i11);
}
