package androidx.compose.ui.window;

import android.R;
import android.graphics.Outline;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import androidx.compose.ui.platform.j3;
import androidx.core.view.z0;
import androidx.p002activity.b0;
import androidx.p002activity.d0;
import androidx.p003lifecycle.C2797h1;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import ezvcard.property.Gender;
import java.util.UUID;
import jn0.h0;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B=\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001d\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0004H\u0016¢\u0006\u0004\b&\u0010 R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00103\u001a\u0002018\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001f\u00102R\u0014\u00106\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u00105\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00067"}, d2 = {"Landroidx/compose/ui/window/l;", "Landroidx/activity/p;", "Landroidx/compose/ui/platform/j3;", "Lkotlin/Function0;", "Ljn0/h0;", "onDismissRequest", "Landroidx/compose/ui/window/j;", "properties", "Landroid/view/View;", "composeView", "Lw4/t;", "layoutDirection", "Lw4/d;", "density", "Ljava/util/UUID;", "dialogId", "<init>", "(Lwn0/a;Landroidx/compose/ui/window/j;Landroid/view/View;Lw4/t;Lw4/d;Ljava/util/UUID;)V", "j", "(Lw4/t;)V", "Landroidx/compose/ui/window/t;", "securePolicy", "k", "(Landroidx/compose/ui/window/t;)V", "Lr2/q;", "parentComposition", "children", IntegerTokenConverter.CONVERTER_KEY, "(Lr2/q;Lwn0/p;)V", "l", "(Lwn0/a;Landroidx/compose/ui/window/j;Lw4/t;)V", "h", "()V", "Landroid/view/MotionEvent;", "event", "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "cancel", DateTokenConverter.CONVERTER_KEY, "Lwn0/a;", "e", "Landroidx/compose/ui/window/j;", "f", "Landroid/view/View;", "Landroidx/compose/ui/window/i;", "g", "Landroidx/compose/ui/window/i;", "dialogLayout", "Lw4/h;", Gender.FEMALE, "maxSupportedElevation", "", "I", "defaultSoftInputMode", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class l extends androidx.p002activity.p implements j3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private wn0.a<h0> onDismissRequest;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private j properties;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final View composeView;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final i dialogLayout;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final float maxSupportedElevation;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int defaultSoftInputMode;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/ui/window/l$a", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", "view", "Landroid/graphics/Outline;", "result", "Ljn0/h0;", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline result) {
            result.setRect(0, 0, view.getWidth(), view.getHeight());
            result.setAlpha(BitmapDescriptorFactory.HUE_RED);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/activity/b0;", "Ljn0/h0;", "a", "(Landroidx/activity/b0;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.l<b0, h0> {
        b() {
            super(1);
        }

        public final void a(b0 b0Var) {
            if (l.this.properties.getDismissOnBackPress()) {
                l.this.onDismissRequest.invoke();
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(b0 b0Var) {
            a(b0Var);
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6385a;

        static {
            int[] iArr = new int[w4.t.values().length];
            try {
                iArr[w4.t.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w4.t.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f6385a = iArr;
        }
    }

    public l(wn0.a<h0> aVar, j jVar, View view, w4.t tVar, w4.d dVar, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), (Build.VERSION.SDK_INT >= 31 || jVar.getDecorFitsSystemWindows()) ? d3.j.f59333a : d3.j.f59334b), 0, 2, null);
        this.onDismissRequest = aVar;
        this.properties = jVar;
        this.composeView = view;
        float fG = w4.h.g(8);
        this.maxSupportedElevation = fG;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        this.defaultSoftInputMode = window.getAttributes().softInputMode & EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE;
        window.requestFeature(1);
        window.setBackgroundDrawableResource(R.color.transparent);
        z0.b(window, this.properties.getDecorFitsSystemWindows());
        i iVar = new i(getContext(), window);
        iVar.setTag(d3.h.H, "Dialog:" + uuid);
        iVar.setClipChildren(false);
        iVar.setElevation(dVar.O1(fG));
        iVar.setOutlineProvider(new a());
        this.dialogLayout = iVar;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            e(viewGroup);
        }
        setContentView(iVar);
        androidx.p003lifecycle.View.b(iVar, androidx.p003lifecycle.View.a(view));
        C2797h1.b(iVar, C2797h1.a(view));
        xa.e.b(iVar, xa.e.a(view));
        l(this.onDismissRequest, this.properties, tVar);
        d0.b(getOnBackPressedDispatcher(), this, false, new b(), 2, null);
    }

    private static final void e(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof i) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                e(viewGroup2);
            }
        }
    }

    private final void j(w4.t layoutDirection) {
        i iVar = this.dialogLayout;
        int i11 = c.f6385a[layoutDirection.ordinal()];
        int i12 = 1;
        if (i11 == 1) {
            i12 = 0;
        } else if (i11 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        iVar.setLayoutDirection(i12);
    }

    private final void k(t securePolicy) {
        boolean zA = u.a(securePolicy, androidx.compose.ui.window.c.j(this.composeView));
        Window window = getWindow();
        p013kotlin.jvm.internal.s.h(window);
        window.setFlags(zA ? 8192 : -8193, PKIFailureInfo.certRevoked);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
    }

    public final void h() {
        this.dialogLayout.e();
    }

    public final void i(p020r2.q parentComposition, wn0.p<? super p020r2.l, ? super Integer, h0> children) {
        this.dialogLayout.setContent(parentComposition, children);
    }

    public final void l(wn0.a<h0> onDismissRequest, j properties, w4.t layoutDirection) {
        Window window;
        this.onDismissRequest = onDismissRequest;
        this.properties = properties;
        k(properties.getSecurePolicy());
        j(layoutDirection);
        if (properties.getUsePlatformDefaultWidth() && !this.dialogLayout.getUsePlatformDefaultWidth() && (window = getWindow()) != null) {
            window.setLayout(-2, -2);
        }
        this.dialogLayout.setUsePlatformDefaultWidth(properties.getUsePlatformDefaultWidth());
        if (Build.VERSION.SDK_INT < 31) {
            if (properties.getDecorFitsSystemWindows()) {
                Window window2 = getWindow();
                if (window2 != null) {
                    window2.setSoftInputMode(this.defaultSoftInputMode);
                    return;
                }
                return;
            }
            Window window3 = getWindow();
            if (window3 != null) {
                window3.setSoftInputMode(16);
            }
        }
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(MotionEvent event) {
        boolean zOnTouchEvent = super.onTouchEvent(event);
        if (zOnTouchEvent && this.properties.getDismissOnClickOutside()) {
            this.onDismissRequest.invoke();
        }
        return zOnTouchEvent;
    }
}
