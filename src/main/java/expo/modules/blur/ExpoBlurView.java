package expo.modules.blur;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import expo.modules.blur.enums.BlurMethod;
import expo.modules.blur.enums.TintStyle;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.views.ExpoView;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;
import sj0.c;
import sj0.i;
import sj0.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\fJ\r\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\"\u0010\u001b\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lexpo/modules/blur/ExpoBlurView;", "Lexpo/modules/kotlin/views/ExpoView;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lexpo/modules/kotlin/AppContext;", "appContext", "<init>", "(Landroid/content/Context;Lexpo/modules/kotlin/AppContext;)V", "", "radius", "Ljn0/h0;", "setBlurRadius", "(F)V", "Lexpo/modules/blur/enums/BlurMethod;", "method", "setBlurMethod", "(Lexpo/modules/blur/enums/BlurMethod;)V", "reductionFactor", "applyBlurReduction", "applyTint", "()V", "blurMethod", "Lexpo/modules/blur/enums/BlurMethod;", "blurReduction", Gender.FEMALE, "blurRadius", "Lexpo/modules/blur/enums/TintStyle;", "tint", "Lexpo/modules/blur/enums/TintStyle;", "getTint$expo_blur_release", "()Lexpo/modules/blur/enums/TintStyle;", "setTint$expo_blur_release", "(Lexpo/modules/blur/enums/TintStyle;)V", "Lsj0/c;", "blurView", "Lsj0/c;", "expo-blur_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public final class ExpoBlurView extends ExpoView {
    private BlurMethod blurMethod;
    private float blurRadius;
    private float blurReduction;
    private final c blurView;
    private TintStyle tint;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BlurMethod.values().length];
            try {
                iArr[BlurMethod.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BlurMethod.DIMEZIS_BLUR_VIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpoBlurView(Context context, AppContext appContext) throws Exceptions.MissingRootView {
        ViewGroup viewGroup;
        super(context, appContext);
        s.k(context, "context");
        s.k(appContext, "appContext");
        this.blurMethod = BlurMethod.NONE;
        this.blurReduction = 4.0f;
        this.blurRadius = 50.0f;
        this.tint = TintStyle.DEFAULT;
        c cVar = new c(context);
        cVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        Window window = appContext.getThrowingActivity().getWindow();
        View decorView = window != null ? window.getDecorView() : null;
        if (decorView == null || (viewGroup = (ViewGroup) decorView.findViewById(android.R.id.content)) == null) {
            throw new Exceptions.MissingRootView();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            cVar.e(viewGroup, new i()).g(decorView.getBackground());
        } else {
            cVar.e(viewGroup, new j(context)).g(decorView.getBackground());
        }
        addView(cVar);
        this.blurView = cVar;
    }

    public final void applyBlurReduction(float reductionFactor) {
        this.blurReduction = reductionFactor;
        setBlurRadius(this.blurRadius);
    }

    public final void applyTint() {
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.blurMethod.ordinal()];
        if (i11 == 1) {
            setBackgroundColor(this.tint.toBlurEffect(this.blurRadius));
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            this.blurView.d(this.tint.toBlurEffect(this.blurRadius));
        }
        this.blurView.invalidate();
    }

    /* JADX INFO: renamed from: getTint$expo_blur_release, reason: from getter */
    public final TintStyle getTint() {
        return this.tint;
    }

    public final void setBlurMethod(BlurMethod method) {
        s.k(method, "method");
        this.blurMethod = method;
        int i11 = WhenMappings.$EnumSwitchMapping$0[method.ordinal()];
        if (i11 == 1) {
            this.blurView.b(false);
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            this.blurView.b(true);
            setBackgroundColor(0);
        }
        setBlurRadius(this.blurRadius);
    }

    public final void setBlurRadius(float radius) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.blurMethod.ordinal()];
        if (i11 == 1) {
            setBackgroundColor(this.tint.toBlurEffect(this.blurRadius));
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            this.blurView.b(true ^ (radius == BitmapDescriptorFactory.HUE_RED));
            if (radius > BitmapDescriptorFactory.HUE_RED) {
                this.blurView.c(radius / this.blurReduction);
                this.blurView.invalidate();
            }
        }
        this.blurRadius = radius;
    }

    public final void setTint$expo_blur_release(TintStyle tintStyle) {
        s.k(tintStyle, "<set-?>");
        this.tint = tintStyle;
    }
}
