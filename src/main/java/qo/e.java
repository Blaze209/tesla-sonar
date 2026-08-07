package qo;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.uimanager.w;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import so.BorderRadiusStyle;
import so.ComputedBorderRadius;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\"\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001)B\u008f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001c\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020&2\u0006\u0010\u0011\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b5\u00107\u001a\u0004\b)\u00108R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b+\u0010;R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b-\u0010,\u001a\u0004\b<\u0010.R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b1\u00100\u001a\u0004\b9\u00102R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b=\u0010?R$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\b/\u0010B\"\u0004\b@\u0010CR$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\b3\u0010F\"\u0004\bD\u0010G¨\u0006H"}, d2 = {"Lqo/e;", "Landroid/graphics/drawable/LayerDrawable;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/graphics/drawable/Drawable;", "originalBackground", "", "outerShadows", "Lqo/d;", "cssBackground", "Lqo/a;", AppStateModule.APP_STATE_BACKGROUND, "Lqo/b;", "border", "feedbackUnderlay", "innerShadows", "Lqo/h;", "outline", "Lso/c;", "borderInsets", "Lso/e;", Snapshot.BORDER_RADIUS, "<init>", "(Landroid/content/Context;Landroid/graphics/drawable/Drawable;Ljava/util/List;Lqo/d;Lqo/a;Lqo/b;Landroid/graphics/drawable/Drawable;Ljava/util/List;Lqo/h;Lso/c;Lso/e;)V", "n", "(Lqo/d;)Lqo/e;", "l", "(Lqo/a;)Lqo/e;", "q", "(Ljava/util/List;Ljava/util/List;)Lqo/e;", "m", "(Lqo/b;)Lqo/e;", "p", "(Lqo/h;)Lqo/e;", "newUnderlay", "o", "(Landroid/graphics/drawable/Drawable;)Lqo/e;", "Landroid/graphics/Outline;", "Ljn0/h0;", "getOutline", "(Landroid/graphics/Outline;)V", "a", "Landroid/content/Context;", "b", "Landroid/graphics/drawable/Drawable;", "g", "()Landroid/graphics/drawable/Drawable;", "c", "Ljava/util/List;", "h", "()Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "Lqo/d;", "e", "()Lqo/d;", "Lqo/a;", "()Lqo/a;", "f", "Lqo/b;", "()Lqo/b;", "getFeedbackUnderlay", IntegerTokenConverter.CONVERTER_KEY, "Lqo/h;", "()Lqo/h;", "j", "Lso/c;", "()Lso/c;", "(Lso/c;)V", "k", "Lso/e;", "()Lso/e;", "(Lso/e;)V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e extends LayerDrawable {

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Drawable originalBackground;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<Drawable> outerShadows;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final d cssBackground;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final a background;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final b border;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Drawable feedbackUnderlay;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final List<Drawable> innerShadows;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final h outline;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private so.c borderInsets;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private BorderRadiusStyle borderRadius;

    /* JADX INFO: renamed from: qo.e$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jo\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00122\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lqo/e$a;", "", "<init>", "()V", "Landroid/graphics/drawable/Drawable;", "originalBackground", "", "outerShadows", "Lqo/d;", "cssBackground", "Lqo/a;", AppStateModule.APP_STATE_BACKGROUND, "Lqo/b;", "border", "feedbackUnderlay", "innerShadows", "Lqo/h;", "outline", "", "b", "(Landroid/graphics/drawable/Drawable;Ljava/util/List;Lqo/d;Lqo/a;Lqo/b;Landroid/graphics/drawable/Drawable;Ljava/util/List;Lqo/h;)[Landroid/graphics/drawable/Drawable;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Drawable[] b(Drawable originalBackground, List<? extends Drawable> outerShadows, d cssBackground, a background, b border, Drawable feedbackUnderlay, List<? extends Drawable> innerShadows, h outline) {
            ArrayList arrayList = new ArrayList();
            if (originalBackground != null) {
                arrayList.add(originalBackground);
            }
            arrayList.addAll(v.V(outerShadows));
            if (cssBackground != null) {
                arrayList.add(cssBackground);
            }
            if (background != null) {
                arrayList.add(background);
            }
            if (border != null) {
                arrayList.add(border);
            }
            if (feedbackUnderlay != null) {
                arrayList.add(feedbackUnderlay);
            }
            arrayList.addAll(v.V(innerShadows));
            if (outline != null) {
                arrayList.add(outline);
            }
            return (Drawable[]) arrayList.toArray(new Drawable[0]);
        }

        private Companion() {
        }
    }

    public /* synthetic */ e(Context context, Drawable drawable, List list, d dVar, a aVar, b bVar, Drawable drawable2, List list2, h hVar, so.c cVar, BorderRadiusStyle borderRadiusStyle, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : drawable, (i11 & 4) != 0 ? v.m() : list, (i11 & 8) != 0 ? null : dVar, (i11 & 16) != 0 ? null : aVar, (i11 & 32) != 0 ? null : bVar, (i11 & 64) != 0 ? null : drawable2, (i11 & 128) != 0 ? v.m() : list2, (i11 & 256) != 0 ? null : hVar, (i11 & 512) != 0 ? null : cVar, (i11 & 1024) != 0 ? null : borderRadiusStyle);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getBackground() {
        return this.background;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getBorder() {
        return this.border;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final so.c getBorderInsets() {
        return this.borderInsets;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final BorderRadiusStyle getBorderRadius() {
        return this.borderRadius;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final d getCssBackground() {
        return this.cssBackground;
    }

    public final List<Drawable> f() {
        return this.innerShadows;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Drawable getOriginalBackground() {
        return this.originalBackground;
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        s.k(outline, "outline");
        BorderRadiusStyle borderRadiusStyle = this.borderRadius;
        if (borderRadiusStyle == null || !borderRadiusStyle.c()) {
            outline.setRect(getBounds());
            return;
        }
        Path path = new Path();
        BorderRadiusStyle borderRadiusStyle2 = this.borderRadius;
        ComputedBorderRadius computedBorderRadiusD = borderRadiusStyle2 != null ? borderRadiusStyle2.d(getLayoutDirection(), this.context, getBounds().width(), getBounds().height()) : null;
        so.c cVar = this.borderInsets;
        RectF rectFA = cVar != null ? cVar.a(getLayoutDirection(), this.context) : null;
        if (computedBorderRadiusD != null) {
            RectF rectF = new RectF(getBounds());
            w wVar = w.f23413a;
            float horizontal = computedBorderRadiusD.getTopLeft().getHorizontal();
            float f11 = BitmapDescriptorFactory.HUE_RED;
            float fB = wVar.b(horizontal + (rectFA != null ? rectFA.left : 0.0f));
            float fB2 = wVar.b(computedBorderRadiusD.getTopLeft().getVertical() + (rectFA != null ? rectFA.top : 0.0f));
            float fB3 = wVar.b(computedBorderRadiusD.getTopRight().getHorizontal() + (rectFA != null ? rectFA.right : 0.0f));
            float fB4 = wVar.b(computedBorderRadiusD.getTopRight().getVertical() + (rectFA != null ? rectFA.top : 0.0f));
            float fB5 = wVar.b(computedBorderRadiusD.getBottomRight().getHorizontal() + (rectFA != null ? rectFA.right : 0.0f));
            float fB6 = wVar.b(computedBorderRadiusD.getBottomRight().getVertical() + (rectFA != null ? rectFA.bottom : 0.0f));
            float fB7 = wVar.b(computedBorderRadiusD.getBottomLeft().getHorizontal() + (rectFA != null ? rectFA.left : 0.0f));
            float vertical = computedBorderRadiusD.getBottomLeft().getVertical();
            if (rectFA != null) {
                f11 = rectFA.bottom;
            }
            path.addRoundRect(rectF, new float[]{fB, fB2, fB3, fB4, fB5, fB6, fB7, wVar.b(vertical + f11)}, Path.Direction.CW);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            outline.setPath(path);
        } else {
            outline.setConvexPath(path);
        }
    }

    public final List<Drawable> h() {
        return this.outerShadows;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final h getOutline() {
        return this.outline;
    }

    public final void j(so.c cVar) {
        this.borderInsets = cVar;
    }

    public final void k(BorderRadiusStyle borderRadiusStyle) {
        this.borderRadius = borderRadiusStyle;
    }

    public final e l(a background) {
        return new e(this.context, this.originalBackground, this.outerShadows, this.cssBackground, background, this.border, this.feedbackUnderlay, this.innerShadows, this.outline, this.borderInsets, this.borderRadius);
    }

    public final e m(b border) {
        s.k(border, "border");
        return new e(this.context, this.originalBackground, this.outerShadows, this.cssBackground, this.background, border, this.feedbackUnderlay, this.innerShadows, this.outline, this.borderInsets, this.borderRadius);
    }

    public final e n(d cssBackground) {
        return new e(this.context, this.originalBackground, this.outerShadows, cssBackground, this.background, this.border, this.feedbackUnderlay, this.innerShadows, this.outline, this.borderInsets, this.borderRadius);
    }

    public final e o(Drawable newUnderlay) {
        return new e(this.context, this.originalBackground, this.outerShadows, this.cssBackground, this.background, this.border, newUnderlay, this.innerShadows, this.outline, this.borderInsets, this.borderRadius);
    }

    public final e p(h outline) {
        s.k(outline, "outline");
        return new e(this.context, this.originalBackground, this.outerShadows, this.cssBackground, this.background, this.border, this.feedbackUnderlay, this.innerShadows, outline, this.borderInsets, this.borderRadius);
    }

    public final e q(List<? extends Drawable> outerShadows, List<? extends Drawable> innerShadows) {
        s.k(outerShadows, "outerShadows");
        s.k(innerShadows, "innerShadows");
        return new e(this.context, this.originalBackground, outerShadows, this.cssBackground, this.background, this.border, this.feedbackUnderlay, innerShadows, this.outline, this.borderInsets, this.borderRadius);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(Context context, Drawable drawable, List<? extends Drawable> outerShadows, d dVar, a aVar, b bVar, Drawable drawable2, List<? extends Drawable> innerShadows, h hVar, so.c cVar, BorderRadiusStyle borderRadiusStyle) {
        super(INSTANCE.b(drawable, outerShadows, dVar, aVar, bVar, drawable2, innerShadows, hVar));
        s.k(context, "context");
        s.k(outerShadows, "outerShadows");
        s.k(innerShadows, "innerShadows");
        this.context = context;
        this.originalBackground = drawable;
        this.outerShadows = outerShadows;
        this.cssBackground = dVar;
        this.background = aVar;
        this.border = bVar;
        this.feedbackUnderlay = drawable2;
        this.innerShadows = innerShadows;
        this.outline = hVar;
        this.borderInsets = cVar;
        this.borderRadius = borderRadiusStyle;
        setPaddingMode(1);
    }
}
