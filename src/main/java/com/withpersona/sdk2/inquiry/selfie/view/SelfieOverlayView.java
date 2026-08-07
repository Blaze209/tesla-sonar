package com.withpersona.sdk2.inquiry.selfie.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import bo0.n;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.j0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bB\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u009d\u00012\u00020\u0001:\u0006JQLSOGB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00102\u0006\u0010'\u001a\u00020&H\u0014¢\u0006\u0004\b(\u0010)J\u001f\u0010\f\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\f\u0010+J\u000f\u0010,\u001a\u00020\u0010H\u0002¢\u0006\u0004\b,\u0010\u0014JS\u00106\u001a\u00020\u0010*\u00020-2\u0006\u0010.\u001a\u00020\"2\u0006\u0010/\u001a\u00020\"2\u0006\u00100\u001a\u00020\"2\u0006\u00101\u001a\u00020\"2\u0006\u00102\u001a\u00020\"2\u0006\u00103\u001a\u00020\"2\u0006\u00104\u001a\u00020\t2\u0006\u00105\u001a\u00020\"H\u0002¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0010H\u0002¢\u0006\u0004\b8\u0010\u0014J\u000f\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u000209H\u0002¢\u0006\u0004\b<\u0010;J\u000f\u0010=\u001a\u000209H\u0002¢\u0006\u0004\b=\u0010;J+\u0010B\u001a\u00020\u0010*\u00020>2\u0006\u0010?\u001a\u00020>2\u0006\u0010@\u001a\u00020>2\u0006\u0010A\u001a\u00020\"H\u0002¢\u0006\u0004\bB\u0010CJ\u001b\u0010D\u001a\u00020>*\u00020>2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\u0010H\u0002¢\u0006\u0004\bF\u0010\u0014R\u0016\u0010I\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010K\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010FR\u0014\u0010N\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010P\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\bO\u0010MR\u0014\u0010R\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\bQ\u0010MR\u0014\u0010T\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010MR\u0014\u0010V\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010MR\u0014\u0010W\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010FR\u0014\u0010Y\u001a\u00020\"8\u0002X\u0082D¢\u0006\u0006\n\u0004\bX\u0010FR\u0014\u0010[\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010FR\u0014\u0010]\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010FR\u0014\u0010_\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010FR\u0014\u0010b\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010c\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010aR\u0014\u0010d\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010aR\u0014\u0010e\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010aR\u0014\u0010g\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010aR\u0014\u0010h\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010aR\u0014\u0010j\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010aR\u0014\u0010k\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010aR\u0014\u0010m\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010lR\u0014\u0010n\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010lR\u0014\u0010o\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010lR\u0014\u0010q\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010lR\u0014\u0010s\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010lR\u0014\u0010u\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010lR\u0014\u0010w\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010lR\u0014\u0010y\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010lR\u0016\u0010{\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010FR\u0016\u0010}\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010FR\u0015\u0010\u0080\u0001\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u001b\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bF\u0010\u0082\u0001R\u001b\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b,\u0010\u0085\u0001R\u001c\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0082\u0001R\u001b\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u0089\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bM\u0010\u008a\u0001R\u001c\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u0082\u0001R\u0018\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0019\u0010\u0092\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001b\u0010\u0095\u0001\u001a\u00030\u0093\u0001*\u00020\u00198BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bf\u0010\u0094\u0001R\u001a\u0010\u0097\u0001\u001a\u00020\u0015*\u00020>8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bi\u0010\u0096\u0001R-\u0010\u009c\u0001\u001a\u00020\t*\u0002092\u0007\u0010\u0098\u0001\u001a\u00020\t8B@BX\u0082\u000e¢\u0006\u000f\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0005\b|\u0010\u009b\u0001¨\u0006\u009e\u0001"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "w", "h", "oldw", "oldh", "Ljn0/h0;", "onSizeChanged", "(IIII)V", "onDetachedFromWindow", "()V", "", "mirrored", "setIsPreviewMirrored", "(Z)V", "Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;", "newState", "animate", "setState", "(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;Z)V", "Ldg0/a;", "brightnessInfo", "setCameraStreamBrightnessInfo", "(Ldg0/a;)V", "", "intensity", "setIntensity", "(F)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "oldState", "(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;)V", "G", "Landroid/graphics/Path;", "left", "top", "right", "bottom", "startAngle", "sweepAngle", "numTicks", "tickLength", "n", "(Landroid/graphics/Path;FFFFFFIF)V", "o", "Landroid/graphics/Paint;", "u", "()Landroid/graphics/Paint;", "t", "v", "Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;", "start", "end", "percent", "r", "(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;F)V", "p", "(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;F)Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;", Gender.FEMALE, "a", "Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;", "state", "b", "currentIntensity", "c", "I", "colorOnSurface", DateTokenConverter.CONVERTER_KEY, "shadowColor", "e", "accentColor", "f", "arcBaseColor", "g", "arcHighlightColor", "arcInset", IntegerTokenConverter.CONVERTER_KEY, "arcGapDegrees", "j", "arcStrokeWidth", "k", "arcDialStrokeWidth", "l", "arcTickLength", "m", "Landroid/graphics/Path;", "arcTop", "arcBottom", "arcLeft", "arcRight", "q", "arcDialLeft", "arcDialRight", "s", "arcDialHighlightClipPathRight", "arcDialHighlightClipPathLeft", "Landroid/graphics/Paint;", "arcTopPaint", "arcBottomPaint", "arcLeftPaint", "x", "arcRightPaint", "y", "shadowPaint", "z", "arcDialLeftPaint", "A", "arcDialRightPaint", "B", "filledArcDialPaint", "C", "arcDialLeftIntensity", "D", "arcDialRightIntensity", "E", "Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;", "arcHoverState", "Landroid/animation/ValueAnimator;", "Landroid/animation/ValueAnimator;", "stateAnimator", "Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$f;", "Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$f;", "stateAnimationState", "H", "intensityAnimator", "Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$d;", "Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$d;", "intensityAnimationState", "J", "directionHintAnimator", "K", "Ldg0/a;", "L", "Z", "isPreviewMirrored", "Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$c;", "(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;)Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$c;", "endState", "(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;)Z", "isIdentity", "value", "getShadowAlpha", "(Landroid/graphics/Paint;)I", "(Landroid/graphics/Paint;I)V", "shadowAlpha", Gender.MALE, "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SelfieOverlayView extends FrameLayout {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final Paint arcDialRightPaint;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final Paint filledArcDialPaint;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private float arcDialLeftIntensity;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private float arcDialRightIntensity;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final ArcHoverState arcHoverState;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private ValueAnimator stateAnimator;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private StateAnimationState stateAnimationState;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private ValueAnimator intensityAnimator;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private IntensityAnimationState intensityAnimationState;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private ValueAnimator directionHintAnimator;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private dg0.a brightnessInfo;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private boolean isPreviewMirrored;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private e state;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private float currentIntensity;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int colorOnSurface;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int shadowColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int accentColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int arcBaseColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int arcHighlightColor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final float arcInset;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final float arcGapDegrees;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final float arcStrokeWidth;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final float arcDialStrokeWidth;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final float arcTickLength;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Path arcTop;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Path arcBottom;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Path arcLeft;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final Path arcRight;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final Path arcDialLeft;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final Path arcDialRight;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Path arcDialHighlightClipPathRight;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Path arcDialHighlightClipPathLeft;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final Paint arcTopPaint;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final Paint arcBottomPaint;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final Paint arcLeftPaint;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final Paint arcRightPaint;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final Paint shadowPaint;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final Paint arcDialLeftPaint;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0007\n\u0002\b\u0016\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B9\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0012\u0010\rj\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$c;", "", "", "arcTopAlpha", "arcBottomAlpha", "arcLeftAlpha", "arcRightAlpha", "arcDialLeftAlpha", "arcDialRightAlpha", "<init>", "(Ljava/lang/String;IFFFFFF)V", Gender.FEMALE, "getArcTopAlpha", "()F", "getArcBottomAlpha", "getArcLeftAlpha", "getArcRightAlpha", "getArcDialLeftAlpha", "getArcDialRightAlpha", "Center", "Left", "Right", "None", "Finalizing", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private enum c {
        Center(1.0f, 1.0f, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED),
        Left(0.1f, 0.1f, BitmapDescriptorFactory.HUE_RED, 0.1f, 1.0f, BitmapDescriptorFactory.HUE_RED),
        Right(0.1f, 0.1f, 0.1f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f),
        None(0.1f, 0.1f, 0.1f, 0.1f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED),
        Finalizing(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
        private final float arcBottomAlpha;
        private final float arcDialLeftAlpha;
        private final float arcDialRightAlpha;
        private final float arcLeftAlpha;
        private final float arcRightAlpha;
        private final float arcTopAlpha;

        c(float f11, float f12, float f13, float f14, float f15, float f16) {
            this.arcTopAlpha = f11;
            this.arcBottomAlpha = f12;
            this.arcLeftAlpha = f13;
            this.arcRightAlpha = f14;
            this.arcDialLeftAlpha = f15;
            this.arcDialRightAlpha = f16;
        }

        public static EnumEntries<c> getEntries() {
            return $ENTRIES;
        }

        public final float getArcBottomAlpha() {
            return this.arcBottomAlpha;
        }

        public final float getArcDialLeftAlpha() {
            return this.arcDialLeftAlpha;
        }

        public final float getArcDialRightAlpha() {
            return this.arcDialRightAlpha;
        }

        public final float getArcLeftAlpha() {
            return this.arcLeftAlpha;
        }

        public final float getArcRightAlpha() {
            return this.arcRightAlpha;
        }

        public final float getArcTopAlpha() {
            return this.arcTopAlpha;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView$d, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015\"\u0004\b\u001a\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$d;", "", "", ReactProgressBarViewManager.PROP_PROGRESS, "startIntensity", "endIntensity", "<init>", "(FFF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", Gender.FEMALE, "b", "()F", DateTokenConverter.CONVERTER_KEY, "(F)V", "c", "setStartIntensity", "setEndIntensity", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final /* data */ class IntensityAnimationState {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private float progress;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private float startIntensity;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private float endIntensity;

        public IntensityAnimationState(float f11, float f12, float f13) {
            this.progress = f11;
            this.startIntensity = f12;
            this.endIntensity = f13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final float getEndIntensity() {
            return this.endIntensity;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final float getProgress() {
            return this.progress;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final float getStartIntensity() {
            return this.startIntensity;
        }

        public final void d(float f11) {
            this.progress = f11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IntensityAnimationState)) {
                return false;
            }
            IntensityAnimationState intensityAnimationState = (IntensityAnimationState) other;
            return Float.compare(this.progress, intensityAnimationState.progress) == 0 && Float.compare(this.startIntensity, intensityAnimationState.startIntensity) == 0 && Float.compare(this.endIntensity, intensityAnimationState.endIntensity) == 0;
        }

        public int hashCode() {
            return (((Float.hashCode(this.progress) * 31) + Float.hashCode(this.startIntensity)) * 31) + Float.hashCode(this.endIntensity);
        }

        public String toString() {
            return "IntensityAnimationState(progress=" + this.progress + ", startIntensity=" + this.startIntensity + ", endIntensity=" + this.endIntensity + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;", "", "<init>", "(Ljava/lang/String;I)V", "Center", "Left", "Right", "None", "Finalizing", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum e {
        Center,
        Left,
        Right,
        None,
        Finalizing;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<e> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView$f, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\b\u0082\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\u001d\u0010 R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b!\u0010$\"\u0004\b%\u0010&R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010$R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b\"\u0010$R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b*\u0010$R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b+\u0010#\u001a\u0004\b+\u0010$R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b'\u0010$R\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b)\u0010$¨\u0006,"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$f;", "", "", ReactProgressBarViewManager.PROP_ANIMATING, "Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;", "startState", "endState", "", ReactProgressBarViewManager.PROP_PROGRESS, "startArcTopAlpha", "startArcBottomAlpha", "startArcLeftAlpha", "startArcRightAlpha", "startArcDialLeftAlpha", "startArcDialRightAlpha", "<init>", "(ZLcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;FFFFFFF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;", "getStartState", "()Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;", "c", DateTokenConverter.CONVERTER_KEY, Gender.FEMALE, "()F", "j", "(F)V", "e", IntegerTokenConverter.CONVERTER_KEY, "f", "g", "h", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final /* data */ class StateAnimationState {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean animating;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final e startState;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final e endState;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private float progress;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final float startArcTopAlpha;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final float startArcBottomAlpha;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final float startArcLeftAlpha;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final float startArcRightAlpha;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final float startArcDialLeftAlpha;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final float startArcDialRightAlpha;

        public StateAnimationState(boolean z11, e startState, e endState, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
            s.k(startState, "startState");
            s.k(endState, "endState");
            this.animating = z11;
            this.startState = startState;
            this.endState = endState;
            this.progress = f11;
            this.startArcTopAlpha = f12;
            this.startArcBottomAlpha = f13;
            this.startArcLeftAlpha = f14;
            this.startArcRightAlpha = f15;
            this.startArcDialLeftAlpha = f16;
            this.startArcDialRightAlpha = f17;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getAnimating() {
            return this.animating;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final e getEndState() {
            return this.endState;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final float getProgress() {
            return this.progress;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final float getStartArcBottomAlpha() {
            return this.startArcBottomAlpha;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final float getStartArcDialLeftAlpha() {
            return this.startArcDialLeftAlpha;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StateAnimationState)) {
                return false;
            }
            StateAnimationState stateAnimationState = (StateAnimationState) other;
            return this.animating == stateAnimationState.animating && this.startState == stateAnimationState.startState && this.endState == stateAnimationState.endState && Float.compare(this.progress, stateAnimationState.progress) == 0 && Float.compare(this.startArcTopAlpha, stateAnimationState.startArcTopAlpha) == 0 && Float.compare(this.startArcBottomAlpha, stateAnimationState.startArcBottomAlpha) == 0 && Float.compare(this.startArcLeftAlpha, stateAnimationState.startArcLeftAlpha) == 0 && Float.compare(this.startArcRightAlpha, stateAnimationState.startArcRightAlpha) == 0 && Float.compare(this.startArcDialLeftAlpha, stateAnimationState.startArcDialLeftAlpha) == 0 && Float.compare(this.startArcDialRightAlpha, stateAnimationState.startArcDialRightAlpha) == 0;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final float getStartArcDialRightAlpha() {
            return this.startArcDialRightAlpha;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final float getStartArcLeftAlpha() {
            return this.startArcLeftAlpha;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final float getStartArcRightAlpha() {
            return this.startArcRightAlpha;
        }

        public int hashCode() {
            return (((((((((((((((((Boolean.hashCode(this.animating) * 31) + this.startState.hashCode()) * 31) + this.endState.hashCode()) * 31) + Float.hashCode(this.progress)) * 31) + Float.hashCode(this.startArcTopAlpha)) * 31) + Float.hashCode(this.startArcBottomAlpha)) * 31) + Float.hashCode(this.startArcLeftAlpha)) * 31) + Float.hashCode(this.startArcRightAlpha)) * 31) + Float.hashCode(this.startArcDialLeftAlpha)) * 31) + Float.hashCode(this.startArcDialRightAlpha);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final float getStartArcTopAlpha() {
            return this.startArcTopAlpha;
        }

        public final void j(float f11) {
            this.progress = f11;
        }

        public String toString() {
            return "StateAnimationState(animating=" + this.animating + ", startState=" + this.startState + ", endState=" + this.endState + ", progress=" + this.progress + ", startArcTopAlpha=" + this.startArcTopAlpha + ", startArcBottomAlpha=" + this.startArcBottomAlpha + ", startArcLeftAlpha=" + this.startArcLeftAlpha + ", startArcRightAlpha=" + this.startArcRightAlpha + ", startArcDialLeftAlpha=" + this.startArcDialLeftAlpha + ", startArcDialRightAlpha=" + this.startArcDialRightAlpha + ")";
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f58436a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.Center.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.Left.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.Right.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e.None.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[e.Finalizing.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f58436a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"com/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$h", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "Ljn0/h0;", "onAnimationRepeat", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class h implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ j0 f58437a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f58438b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SelfieOverlayView f58439c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ j0 f58440d;

        public h(j0 j0Var, e eVar, SelfieOverlayView selfieOverlayView, j0 j0Var2) {
            this.f58437a = j0Var;
            this.f58438b = eVar;
            this.f58439c = selfieOverlayView;
            this.f58440d = j0Var2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f58440d.f86523a = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f58437a.f86523a) {
                return;
            }
            SelfieOverlayView.y(this.f58438b, this.f58439c);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "Ljn0/h0;", "onAnimationRepeat", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class i implements Animator.AnimatorListener {
        public i() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SelfieOverlayView.this.intensityAnimationState = null;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "Ljn0/h0;", "onAnimationRepeat", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class j implements Animator.AnimatorListener {
        public j() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            StateAnimationState stateAnimationState = SelfieOverlayView.this.stateAnimationState;
            if (stateAnimationState != null) {
                e eVar = SelfieOverlayView.this.state;
                SelfieOverlayView.this.state = stateAnimationState.getEndState();
                SelfieOverlayView.this.w(eVar, stateAnimationState.getEndState());
            }
            SelfieOverlayView.this.stateAnimationState = null;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfieOverlayView(Context context) {
        super(context);
        s.k(context, "context");
        this.state = e.Center;
        this.colorOnSurface = -1;
        this.shadowColor = -16777216;
        this.accentColor = -13910906;
        this.arcBaseColor = -1;
        this.arcHighlightColor = -13910906;
        this.arcInset = (float) yh0.h.a(48.0d);
        this.arcGapDegrees = 20.0f;
        this.arcStrokeWidth = (float) yh0.h.a(4.0d);
        this.arcDialStrokeWidth = (float) yh0.h.a(2.0d);
        this.arcTickLength = (float) yh0.h.a(24.0d);
        this.arcTop = new Path();
        this.arcBottom = new Path();
        this.arcLeft = new Path();
        this.arcRight = new Path();
        this.arcDialLeft = new Path();
        this.arcDialRight = new Path();
        this.arcDialHighlightClipPathRight = new Path();
        this.arcDialHighlightClipPathLeft = new Path();
        this.arcTopPaint = u();
        this.arcBottomPaint = u();
        this.arcLeftPaint = u();
        this.arcRightPaint = u();
        this.shadowPaint = v();
        Paint paintT = t();
        paintT.setAlpha(0);
        this.arcDialLeftPaint = paintT;
        Paint paintT2 = t();
        paintT2.setAlpha(0);
        this.arcDialRightPaint = paintT2;
        Paint paintT3 = t();
        paintT3.setColor(-13910906);
        this.filledArcDialPaint = paintT3;
        this.arcHoverState = p(new ArcHoverState(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 511, null), this.currentIntensity);
        this.brightnessInfo = new dg0.a(null, 1, null);
        setWillNotDraw(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(SelfieOverlayView selfieOverlayView, ArcHoverState arcHoverState, ArcHoverState arcHoverState2, ValueAnimator it) {
        s.k(it, "it");
        selfieOverlayView.r(selfieOverlayView.arcHoverState, arcHoverState, arcHoverState2, it.getAnimatedFraction());
        selfieOverlayView.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(SelfieOverlayView selfieOverlayView, ValueAnimator it) {
        s.k(it, "it");
        IntensityAnimationState intensityAnimationState = selfieOverlayView.intensityAnimationState;
        if (intensityAnimationState != null) {
            intensityAnimationState.d(it.getAnimatedFraction());
        }
        selfieOverlayView.o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(SelfieOverlayView selfieOverlayView, ArcHoverState arcHoverState, ArcHoverState arcHoverState2, ValueAnimator it) {
        s.k(it, "it");
        selfieOverlayView.r(selfieOverlayView.arcHoverState, arcHoverState, arcHoverState2, it.getAnimatedFraction());
        IntensityAnimationState intensityAnimationState = selfieOverlayView.intensityAnimationState;
        if (intensityAnimationState != null) {
            intensityAnimationState.d(it.getAnimatedFraction());
        }
        selfieOverlayView.o();
    }

    private final void D(Paint paint, int i11) {
        if (paint.getAlpha() == i11) {
            return;
        }
        paint.setShadowLayer(this.arcStrokeWidth * 2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, k5.d.l(this.shadowColor, i11));
        paint.setAlpha(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(SelfieOverlayView selfieOverlayView, ValueAnimator it) {
        s.k(it, "it");
        StateAnimationState stateAnimationState = selfieOverlayView.stateAnimationState;
        if (stateAnimationState != null) {
            stateAnimationState.j(it.getAnimatedFraction());
        }
        selfieOverlayView.o();
    }

    private final void F() {
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        float f11 = measuredWidth / 2.0f;
        float f12 = measuredHeight / 2.0f;
        Path path = this.arcDialHighlightClipPathLeft;
        float f13 = this.arcDialLeftIntensity * 45.0f;
        path.reset();
        path.moveTo(f11, f12);
        path.arcTo(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, measuredWidth, measuredHeight, 180.0f - f13, f13 * 2.0f, false);
        path.close();
        Path path2 = this.arcDialHighlightClipPathRight;
        float f14 = this.arcDialRightIntensity * 45.0f;
        path2.reset();
        path2.moveTo(f11, f12);
        path2.arcTo(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, measuredWidth, measuredHeight, -f14, f14 * 2.0f, false);
        path2.close();
    }

    private final void G() {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f11 = this.arcGapDegrees / 2.0f;
        this.arcTop.reset();
        Path path = this.arcTop;
        float f12 = this.arcInset;
        float f13 = measuredWidth;
        float f14 = measuredHeight;
        path.addArc(f12, f12, f13 - f12, f14 - f12, f11 + 225.0f, 90.0f - this.arcGapDegrees);
        this.arcBottom.reset();
        Path path2 = this.arcBottom;
        float f15 = this.arcInset;
        path2.addArc(f15, f15, f13 - f15, f14 - f15, f11 + 45.0f, 90.0f - this.arcGapDegrees);
        this.arcLeft.reset();
        Path path3 = this.arcLeft;
        float f16 = this.arcInset;
        float f17 = f11 + 135.0f;
        path3.addArc(f16, f16, f13 - f16, f14 - f16, f17, 90.0f - this.arcGapDegrees);
        this.arcRight.reset();
        Path path4 = this.arcRight;
        float f18 = this.arcInset;
        float f19 = f11 + 315.0f;
        path4.addArc(f18, f18, f13 - f18, f14 - f18, f19, 90.0f - this.arcGapDegrees);
        this.arcDialLeft.reset();
        Path path5 = this.arcDialLeft;
        float f21 = this.arcInset;
        n(path5, f21, f21, f13 - f21, f14 - f21, f17, 90.0f - this.arcGapDegrees, 30, this.arcTickLength);
        this.arcDialRight.reset();
        Path path6 = this.arcDialRight;
        float f22 = this.arcInset;
        n(path6, f22, f22, f13 - f22, f14 - f22, f19, 90.0f - this.arcGapDegrees, 30, this.arcTickLength);
        invalidate();
    }

    private final void n(Path path, float f11, float f12, float f13, float f14, float f15, float f16, int i11, float f17) {
        int i12 = i11;
        float f18 = (f13 - f11) / 2.0f;
        float f19 = f18 + f11;
        float f21 = f18 + f12;
        float f22 = f17 / 2;
        double radians = Math.toRadians(f15);
        double radians2 = Math.toRadians(f16) / ((double) (i12 - 1));
        int i13 = 0;
        while (i13 < i12) {
            double dCos = Math.cos(radians);
            double dSin = Math.sin(radians);
            double d11 = f18 - f22;
            float f23 = f19;
            float f24 = f21;
            float f25 = f22;
            double d12 = f18 + f22;
            path.moveTo(((float) (d11 * dCos)) + f23, ((float) (d11 * dSin)) + f24);
            path.lineTo(((float) (dCos * d12)) + f23, ((float) (d12 * dSin)) + f24);
            radians += radians2;
            i13++;
            f22 = f25;
            f18 = f18;
            f19 = f23;
            i12 = i11;
            f21 = f24;
        }
    }

    private final void o() {
        float arcTopAlpha;
        float arcBottomAlpha;
        float arcLeftAlpha;
        float arcRightAlpha;
        float arcDialLeftAlpha;
        float arcDialRightAlpha;
        float f11;
        float endIntensity;
        StateAnimationState stateAnimationState = this.stateAnimationState;
        IntensityAnimationState intensityAnimationState = this.intensityAnimationState;
        if (stateAnimationState != null) {
            float progress = stateAnimationState.getProgress();
            c cVarQ = q(stateAnimationState.getEndState());
            float startArcTopAlpha = stateAnimationState.getStartArcTopAlpha();
            arcTopAlpha = ((cVarQ.getArcTopAlpha() - startArcTopAlpha) * progress) + startArcTopAlpha;
            float startArcBottomAlpha = stateAnimationState.getStartArcBottomAlpha();
            arcBottomAlpha = ((cVarQ.getArcBottomAlpha() - startArcBottomAlpha) * progress) + startArcBottomAlpha;
            float startArcLeftAlpha = stateAnimationState.getStartArcLeftAlpha();
            arcLeftAlpha = ((cVarQ.getArcLeftAlpha() - startArcLeftAlpha) * progress) + startArcLeftAlpha;
            float startArcRightAlpha = stateAnimationState.getStartArcRightAlpha();
            arcRightAlpha = ((cVarQ.getArcRightAlpha() - startArcRightAlpha) * progress) + startArcRightAlpha;
            float startArcDialLeftAlpha = stateAnimationState.getStartArcDialLeftAlpha();
            arcDialLeftAlpha = ((cVarQ.getArcDialLeftAlpha() - startArcDialLeftAlpha) * progress) + startArcDialLeftAlpha;
            float startArcDialRightAlpha = stateAnimationState.getStartArcDialRightAlpha();
            arcDialRightAlpha = ((cVarQ.getArcDialRightAlpha() - startArcDialRightAlpha) * progress) + startArcDialRightAlpha;
        } else {
            arcTopAlpha = q(this.state).getArcTopAlpha();
            arcBottomAlpha = q(this.state).getArcBottomAlpha();
            arcLeftAlpha = q(this.state).getArcLeftAlpha();
            arcRightAlpha = q(this.state).getArcRightAlpha();
            arcDialLeftAlpha = q(this.state).getArcDialLeftAlpha();
            arcDialRightAlpha = q(this.state).getArcDialRightAlpha();
        }
        if (intensityAnimationState != null) {
            endIntensity = ((intensityAnimationState.getEndIntensity() - intensityAnimationState.getStartIntensity()) * intensityAnimationState.getProgress()) + intensityAnimationState.getStartIntensity();
            this.currentIntensity = endIntensity;
            f11 = (arcTopAlpha - 0.1f) / 1.0f;
        } else {
            f11 = (arcTopAlpha - 0.1f) / 1.0f;
            endIntensity = this.currentIntensity;
        }
        float f12 = ((arcBottomAlpha - 0.1f) / 1.0f) * endIntensity;
        float f13 = ((arcLeftAlpha - 0.1f) / 1.0f) * endIntensity;
        float f14 = ((arcRightAlpha - 0.1f) / 1.0f) * endIntensity;
        float f15 = ((arcDialLeftAlpha - 0.1f) / 1.0f) * endIntensity;
        float f16 = ((arcDialRightAlpha - 0.1f) / 1.0f) * endIntensity;
        this.arcTopPaint.setColor(k5.d.c(this.arcBaseColor, this.arcHighlightColor, f11 * endIntensity));
        this.arcBottomPaint.setColor(k5.d.c(this.arcBaseColor, this.arcHighlightColor, f12));
        this.arcLeftPaint.setColor(k5.d.c(this.arcBaseColor, this.arcHighlightColor, f13));
        this.arcRightPaint.setColor(k5.d.c(this.arcBaseColor, this.arcHighlightColor, f14));
        boolean z11 = (this.arcDialLeftIntensity == f15 && this.arcDialRightIntensity == f16) ? false : true;
        this.arcDialLeftIntensity = f15;
        this.arcDialRightIntensity = f16;
        float f17 = 255;
        this.arcTopPaint.setAlpha((int) (arcTopAlpha * f17));
        this.arcBottomPaint.setAlpha((int) (arcBottomAlpha * f17));
        this.arcLeftPaint.setAlpha((int) (arcLeftAlpha * f17));
        this.arcRightPaint.setAlpha((int) (arcRightAlpha * f17));
        this.arcDialLeftPaint.setAlpha((int) (arcDialLeftAlpha * f17));
        this.arcDialRightPaint.setAlpha((int) (arcDialRightAlpha * f17));
        this.arcTopPaint.setStrokeWidth(this.arcStrokeWidth * this.arcHoverState.getArcThicknessMultiplier());
        this.arcBottomPaint.setStrokeWidth(this.arcStrokeWidth * this.arcHoverState.getArcThicknessMultiplier());
        this.arcLeftPaint.setStrokeWidth(this.arcStrokeWidth * this.arcHoverState.getArcThicknessMultiplier());
        this.arcRightPaint.setStrokeWidth(this.arcStrokeWidth * this.arcHoverState.getArcThicknessMultiplier());
        if (z11) {
            F();
        }
        invalidate();
    }

    private final ArcHoverState p(ArcHoverState arcHoverState, float f11) {
        float fC = (float) yh0.h.c(48.0d);
        arcHoverState.s(BitmapDescriptorFactory.HUE_RED);
        float f12 = fC * f11;
        arcHoverState.t(f12);
        arcHoverState.l(BitmapDescriptorFactory.HUE_RED);
        float f13 = (-fC) * f11;
        arcHoverState.m(f13);
        arcHoverState.n(f12);
        arcHoverState.o(BitmapDescriptorFactory.HUE_RED);
        arcHoverState.p(f13);
        arcHoverState.q(BitmapDescriptorFactory.HUE_RED);
        arcHoverState.r(f11 + 1.0f);
        return arcHoverState;
    }

    private final c q(e eVar) {
        int i11 = g.f58436a[eVar.ordinal()];
        if (i11 == 1) {
            return c.Center;
        }
        if (i11 == 2) {
            return c.Left;
        }
        if (i11 == 3) {
            return c.Right;
        }
        if (i11 == 4) {
            return c.None;
        }
        if (i11 == 5) {
            return c.Finalizing;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void r(ArcHoverState arcHoverState, ArcHoverState arcHoverState2, ArcHoverState arcHoverState3, float f11) {
        float arcTopTranslateX = arcHoverState2.getArcTopTranslateX();
        arcHoverState.s(((arcHoverState3.getArcTopTranslateX() - arcTopTranslateX) * f11) + arcTopTranslateX);
        float arcTopTranslateY = arcHoverState2.getArcTopTranslateY();
        arcHoverState.t(((arcHoverState3.getArcTopTranslateY() - arcTopTranslateY) * f11) + arcTopTranslateY);
        float arcBottomTranslateX = arcHoverState2.getArcBottomTranslateX();
        arcHoverState.l(((arcHoverState3.getArcBottomTranslateX() - arcBottomTranslateX) * f11) + arcBottomTranslateX);
        float arcBottomTranslateY = arcHoverState2.getArcBottomTranslateY();
        arcHoverState.m(((arcHoverState3.getArcBottomTranslateY() - arcBottomTranslateY) * f11) + arcBottomTranslateY);
        float arcLeftTranslateX = arcHoverState2.getArcLeftTranslateX();
        arcHoverState.n(((arcHoverState3.getArcLeftTranslateX() - arcLeftTranslateX) * f11) + arcLeftTranslateX);
        float arcLeftTranslateY = arcHoverState2.getArcLeftTranslateY();
        arcHoverState.o(((arcHoverState3.getArcLeftTranslateY() - arcLeftTranslateY) * f11) + arcLeftTranslateY);
        float arcRightTranslateX = arcHoverState2.getArcRightTranslateX();
        arcHoverState.p(((arcHoverState3.getArcRightTranslateX() - arcRightTranslateX) * f11) + arcRightTranslateX);
        float arcRightTranslateY = arcHoverState2.getArcRightTranslateY();
        arcHoverState.q(((arcHoverState3.getArcRightTranslateY() - arcRightTranslateY) * f11) + arcRightTranslateY);
        float arcThicknessMultiplier = arcHoverState2.getArcThicknessMultiplier();
        arcHoverState.r(((arcHoverState3.getArcThicknessMultiplier() - arcThicknessMultiplier) * f11) + arcThicknessMultiplier);
    }

    private final boolean s(ArcHoverState arcHoverState) {
        return arcHoverState.getArcTopTranslateX() == BitmapDescriptorFactory.HUE_RED && arcHoverState.getArcTopTranslateY() == BitmapDescriptorFactory.HUE_RED && arcHoverState.getArcBottomTranslateX() == BitmapDescriptorFactory.HUE_RED && arcHoverState.getArcBottomTranslateY() == BitmapDescriptorFactory.HUE_RED && arcHoverState.getArcLeftTranslateX() == BitmapDescriptorFactory.HUE_RED && arcHoverState.getArcLeftTranslateY() == BitmapDescriptorFactory.HUE_RED && arcHoverState.getArcRightTranslateX() == BitmapDescriptorFactory.HUE_RED && arcHoverState.getArcRightTranslateY() == BitmapDescriptorFactory.HUE_RED && arcHoverState.getArcThicknessMultiplier() == 1.0f;
    }

    public static /* synthetic */ void setState$default(SelfieOverlayView selfieOverlayView, e eVar, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        selfieOverlayView.setState(eVar, z11);
    }

    private final Paint t() {
        Paint paintU = u();
        paintU.setStrokeWidth(this.arcDialStrokeWidth);
        return paintU;
    }

    private final Paint u() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(this.colorOnSurface);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.arcStrokeWidth);
        paint.setStrokeCap(Paint.Cap.ROUND);
        return paint;
    }

    private final Paint v() {
        Paint paintU = u();
        paintU.setStrokeWidth(this.arcStrokeWidth);
        paintU.setColor(this.shadowColor);
        paintU.setShadowLayer(this.arcStrokeWidth * 2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.shadowColor);
        return paintU;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(e oldState, e newState) {
        if (oldState == newState) {
            return;
        }
        ValueAnimator valueAnimator = this.directionHintAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            valueAnimator.removeAllUpdateListeners();
        }
        if (s(this.arcHoverState)) {
            y(newState, this);
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setStartDelay(0L);
        valueAnimatorOfFloat.setRepeatCount(0);
        valueAnimatorOfFloat.setDuration(250L);
        ArcHoverState arcHoverState = this.arcHoverState;
        float f11 = BitmapDescriptorFactory.HUE_RED;
        float f12 = BitmapDescriptorFactory.HUE_RED;
        float f13 = BitmapDescriptorFactory.HUE_RED;
        float f14 = BitmapDescriptorFactory.HUE_RED;
        float f15 = BitmapDescriptorFactory.HUE_RED;
        float f16 = BitmapDescriptorFactory.HUE_RED;
        float f17 = BitmapDescriptorFactory.HUE_RED;
        float f18 = BitmapDescriptorFactory.HUE_RED;
        final ArcHoverState arcHoverStateB = ArcHoverState.b(arcHoverState, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 511, null);
        final ArcHoverState arcHoverState2 = new ArcHoverState(BitmapDescriptorFactory.HUE_RED, f11, f12, f13, f14, f15, f16, f17, f18, 511, null);
        j0 j0Var = new j0();
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.withpersona.sdk2.inquiry.selfie.view.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                SelfieOverlayView.x(this.f58446a, arcHoverStateB, arcHoverState2, valueAnimator2);
            }
        });
        s.h(valueAnimatorOfFloat);
        valueAnimatorOfFloat.addListener(new h(j0Var, newState, this, j0Var));
        valueAnimatorOfFloat.start();
        this.directionHintAnimator = valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(SelfieOverlayView selfieOverlayView, ArcHoverState arcHoverState, ArcHoverState arcHoverState2, ValueAnimator it) {
        s.k(it, "it");
        selfieOverlayView.r(selfieOverlayView.arcHoverState, arcHoverState, arcHoverState2, it.getAnimatedFraction());
        selfieOverlayView.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(e eVar, final SelfieOverlayView selfieOverlayView) {
        int i11 = g.f58436a[eVar.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
                valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                valueAnimatorOfFloat.setRepeatMode(2);
                valueAnimatorOfFloat.setStartDelay(0L);
                valueAnimatorOfFloat.setRepeatCount(-1);
                valueAnimatorOfFloat.setDuration(700L);
                ArcHoverState arcHoverState = selfieOverlayView.arcHoverState;
                float f11 = BitmapDescriptorFactory.HUE_RED;
                float f12 = BitmapDescriptorFactory.HUE_RED;
                float f13 = BitmapDescriptorFactory.HUE_RED;
                final ArcHoverState arcHoverStateB = ArcHoverState.b(arcHoverState, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 511, null);
                final ArcHoverState arcHoverState2 = new ArcHoverState(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f11, f12, f13, 511, null);
                arcHoverState2.n(-((float) yh0.h.c(48.0d)));
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.withpersona.sdk2.inquiry.selfie.view.c
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        SelfieOverlayView.z(this.f58449a, arcHoverStateB, arcHoverState2, valueAnimator);
                    }
                });
                valueAnimatorOfFloat.start();
                selfieOverlayView.directionHintAnimator = valueAnimatorOfFloat;
                return;
            }
            if (i11 != 3) {
                if (i11 != 4 && i11 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
            valueAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
            valueAnimatorOfFloat2.setRepeatMode(2);
            valueAnimatorOfFloat2.setStartDelay(0L);
            valueAnimatorOfFloat2.setRepeatCount(-1);
            valueAnimatorOfFloat2.setDuration(700L);
            ArcHoverState arcHoverState3 = selfieOverlayView.arcHoverState;
            float f14 = BitmapDescriptorFactory.HUE_RED;
            float f15 = BitmapDescriptorFactory.HUE_RED;
            float f16 = BitmapDescriptorFactory.HUE_RED;
            final ArcHoverState arcHoverStateB2 = ArcHoverState.b(arcHoverState3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 511, null);
            final ArcHoverState arcHoverState4 = new ArcHoverState(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f14, f15, f16, 511, null);
            arcHoverState4.p((float) yh0.h.c(48.0d));
            valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.withpersona.sdk2.inquiry.selfie.view.d
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    SelfieOverlayView.A(this.f58452a, arcHoverStateB2, arcHoverState4, valueAnimator);
                }
            });
            valueAnimatorOfFloat2.start();
            selfieOverlayView.directionHintAnimator = valueAnimatorOfFloat2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(SelfieOverlayView selfieOverlayView, ArcHoverState arcHoverState, ArcHoverState arcHoverState2, ValueAnimator it) {
        s.k(it, "it");
        selfieOverlayView.r(selfieOverlayView.arcHoverState, arcHoverState, arcHoverState2, it.getAnimatedFraction());
        selfieOverlayView.o();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.stateAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.intensityAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ValueAnimator valueAnimator3 = this.directionHintAnimator;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        s.k(canvas, "canvas");
        super.onDraw(canvas);
        float arcTopTranslateX = this.arcHoverState.getArcTopTranslateX();
        float arcTopTranslateY = this.arcHoverState.getArcTopTranslateY();
        int iSave = canvas.save();
        canvas.translate(arcTopTranslateX, arcTopTranslateY);
        try {
            if (this.brightnessInfo.d() > 0.5f) {
                D(this.shadowPaint, (int) (this.arcTopPaint.getAlpha() * (((this.brightnessInfo.d() - 0.5f) * 0.66f) + BitmapDescriptorFactory.HUE_RED)));
                canvas.drawPath(this.arcTop, this.shadowPaint);
            }
            canvas.drawPath(this.arcTop, this.arcTopPaint);
            canvas.restoreToCount(iSave);
            float arcBottomTranslateX = this.arcHoverState.getArcBottomTranslateX();
            float arcBottomTranslateY = this.arcHoverState.getArcBottomTranslateY();
            int iSave2 = canvas.save();
            canvas.translate(arcBottomTranslateX, arcBottomTranslateY);
            try {
                if (this.brightnessInfo.a() > 0.5f) {
                    D(this.shadowPaint, (int) (this.arcBottomPaint.getAlpha() * (((this.brightnessInfo.a() - 0.5f) * 0.66f) + BitmapDescriptorFactory.HUE_RED)));
                    canvas.drawPath(this.arcBottom, this.shadowPaint);
                }
                canvas.drawPath(this.arcBottom, this.arcBottomPaint);
                canvas.restoreToCount(iSave2);
                float fC = this.isPreviewMirrored ? this.brightnessInfo.c() : this.brightnessInfo.b();
                float fB = this.isPreviewMirrored ? this.brightnessInfo.b() : this.brightnessInfo.c();
                if (this.arcDialLeftPaint.getAlpha() > 0) {
                    int iSave3 = canvas.save();
                    try {
                        canvas.translate(this.arcHoverState.getArcLeftTranslateX(), this.arcHoverState.getArcLeftTranslateY());
                        if (fC > 0.5f) {
                            D(this.shadowPaint, (int) (this.arcDialLeftPaint.getAlpha() * (((fC - 0.5f) * 0.66f) + BitmapDescriptorFactory.HUE_RED)));
                            canvas.drawPath(this.arcDialLeft, this.shadowPaint);
                        }
                        canvas.drawPath(this.arcDialLeft, this.arcDialLeftPaint);
                        canvas.clipPath(this.arcDialHighlightClipPathLeft);
                        canvas.drawPath(this.arcDialLeft, this.filledArcDialPaint);
                        canvas.restoreToCount(iSave3);
                    } catch (Throwable th2) {
                        canvas.restoreToCount(iSave3);
                        throw th2;
                    }
                }
                if (this.arcLeftPaint.getAlpha() > 0) {
                    float arcLeftTranslateX = this.arcHoverState.getArcLeftTranslateX();
                    float arcLeftTranslateY = this.arcHoverState.getArcLeftTranslateY();
                    int iSave4 = canvas.save();
                    canvas.translate(arcLeftTranslateX, arcLeftTranslateY);
                    if (fC > 0.5f) {
                        try {
                            D(this.shadowPaint, (int) (this.arcLeftPaint.getAlpha() * (((fC - 0.5f) * 0.66f) + BitmapDescriptorFactory.HUE_RED)));
                            canvas.drawPath(this.arcLeft, this.shadowPaint);
                        } catch (Throwable th3) {
                            canvas.restoreToCount(iSave4);
                            throw th3;
                        }
                    }
                    canvas.drawPath(this.arcLeft, this.arcLeftPaint);
                    canvas.restoreToCount(iSave4);
                }
                if (this.arcDialRightPaint.getAlpha() > 0) {
                    int iSave5 = canvas.save();
                    try {
                        canvas.translate(this.arcHoverState.getArcRightTranslateX(), this.arcHoverState.getArcRightTranslateY());
                        if (fB > 0.5f) {
                            D(this.shadowPaint, (int) (this.arcDialRightPaint.getAlpha() * (((fB - 0.5f) * 0.66f) + BitmapDescriptorFactory.HUE_RED)));
                            canvas.drawPath(this.arcDialRight, this.shadowPaint);
                        }
                        canvas.drawPath(this.arcDialRight, this.arcDialRightPaint);
                        canvas.clipPath(this.arcDialHighlightClipPathRight);
                        canvas.drawPath(this.arcDialRight, this.filledArcDialPaint);
                        canvas.restoreToCount(iSave5);
                    } catch (Throwable th4) {
                        canvas.restoreToCount(iSave5);
                        throw th4;
                    }
                }
                if (this.arcRightPaint.getAlpha() > 0) {
                    float arcRightTranslateX = this.arcHoverState.getArcRightTranslateX();
                    float arcRightTranslateY = this.arcHoverState.getArcRightTranslateY();
                    int iSave6 = canvas.save();
                    canvas.translate(arcRightTranslateX, arcRightTranslateY);
                    if (fB > 0.5f) {
                        try {
                            D(this.shadowPaint, (int) (this.arcRightPaint.getAlpha() * ((0.66f * (fB - 0.5f)) + BitmapDescriptorFactory.HUE_RED)));
                            canvas.drawPath(this.arcRight, this.shadowPaint);
                        } finally {
                            canvas.restoreToCount(iSave6);
                        }
                    }
                    canvas.drawPath(this.arcRight, this.arcRightPaint);
                }
            } catch (Throwable th5) {
                canvas.restoreToCount(iSave2);
                throw th5;
            }
        } catch (Throwable th6) {
            canvas.restoreToCount(iSave);
            throw th6;
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int w11, int h11, int oldw, int oldh) {
        super.onSizeChanged(w11, h11, oldw, oldh);
        G();
    }

    public final void setCameraStreamBrightnessInfo(dg0.a brightnessInfo) {
        if (brightnessInfo == null) {
            brightnessInfo = new dg0.a(null, 1, null);
        }
        this.brightnessInfo = brightnessInfo;
        invalidate();
    }

    public final void setIntensity(float intensity) {
        if (this.currentIntensity == intensity) {
            return;
        }
        float fM = n.m(intensity, BitmapDescriptorFactory.HUE_RED, 1.0f);
        ValueAnimator valueAnimator = this.intensityAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            valueAnimator.removeAllUpdateListeners();
        }
        this.intensityAnimationState = new IntensityAnimationState(BitmapDescriptorFactory.HUE_RED, this.currentIntensity, fM);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setStartDelay(0L);
        valueAnimatorOfFloat.setRepeatCount(0);
        valueAnimatorOfFloat.setDuration(200L);
        if (this.state == e.Center) {
            ArcHoverState arcHoverState = this.arcHoverState;
            float f11 = BitmapDescriptorFactory.HUE_RED;
            float f12 = BitmapDescriptorFactory.HUE_RED;
            float f13 = BitmapDescriptorFactory.HUE_RED;
            float f14 = BitmapDescriptorFactory.HUE_RED;
            float f15 = BitmapDescriptorFactory.HUE_RED;
            float f16 = BitmapDescriptorFactory.HUE_RED;
            float f17 = BitmapDescriptorFactory.HUE_RED;
            float f18 = BitmapDescriptorFactory.HUE_RED;
            final ArcHoverState arcHoverStateB = ArcHoverState.b(arcHoverState, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 511, null);
            final ArcHoverState arcHoverStateP = p(new ArcHoverState(BitmapDescriptorFactory.HUE_RED, f11, f12, f13, f14, f15, f16, f17, f18, 511, null), fM);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.withpersona.sdk2.inquiry.selfie.view.a
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    SelfieOverlayView.C(this.f58443a, arcHoverStateB, arcHoverStateP, valueAnimator2);
                }
            });
        } else {
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xh0.p
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    SelfieOverlayView.B(this.f123579a, valueAnimator2);
                }
            });
        }
        s.h(valueAnimatorOfFloat);
        valueAnimatorOfFloat.addListener(new i());
        valueAnimatorOfFloat.start();
        this.intensityAnimator = valueAnimatorOfFloat;
    }

    public final void setIsPreviewMirrored(boolean mirrored) {
        if (this.isPreviewMirrored == mirrored) {
            return;
        }
        this.isPreviewMirrored = mirrored;
        invalidate();
    }

    public final void setState(e newState, boolean animate) {
        s.k(newState, "newState");
        StateAnimationState stateAnimationState = this.stateAnimationState;
        if (stateAnimationState != null && stateAnimationState.getAnimating()) {
            StateAnimationState stateAnimationState2 = this.stateAnimationState;
            if ((stateAnimationState2 != null ? stateAnimationState2.getEndState() : null) == newState) {
                return;
            }
        }
        StateAnimationState stateAnimationState3 = this.stateAnimationState;
        if ((stateAnimationState3 == null || !stateAnimationState3.getAnimating()) && this.state == newState) {
            return;
        }
        ValueAnimator valueAnimator = this.stateAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            valueAnimator.removeAllUpdateListeners();
        }
        if (!animate) {
            e eVar = this.state;
            this.state = newState;
            this.stateAnimationState = null;
            o();
            w(eVar, newState);
            return;
        }
        this.stateAnimationState = new StateAnimationState(true, this.state, newState, BitmapDescriptorFactory.HUE_RED, this.arcTopPaint.getAlpha() / 255.0f, this.arcBottomPaint.getAlpha() / 255.0f, this.arcLeftPaint.getAlpha() / 255.0f, this.arcRightPaint.getAlpha() / 255.0f, this.arcDialLeftPaint.getAlpha() / 255.0f, this.arcDialRightPaint.getAlpha() / 255.0f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setStartDelay(0L);
        valueAnimatorOfFloat.setRepeatCount(0);
        valueAnimatorOfFloat.setDuration(400L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xh0.q
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                SelfieOverlayView.E(this.f123580a, valueAnimator2);
            }
        });
        s.h(valueAnimatorOfFloat);
        valueAnimatorOfFloat.addListener(new j());
        valueAnimatorOfFloat.start();
        this.stateAnimator = valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView$a, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0082\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJj\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001a\u001a\u0004\b\"\u0010\u001c\"\u0004\b#\u0010\u001eR\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001a\u001a\u0004\b$\u0010\u001c\"\u0004\b%\u0010\u001eR\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001a\u001a\u0004\b&\u0010\u001c\"\u0004\b'\u0010\u001eR\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u001a\u001a\u0004\b(\u0010\u001c\"\u0004\b)\u0010\u001eR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\u001a\u001a\u0004\b*\u0010\u001c\"\u0004\b+\u0010\u001eR\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u001a\u001a\u0004\b,\u0010\u001c\"\u0004\b-\u0010\u001eR\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010\u001a\u001a\u0004\b.\u0010\u001c\"\u0004\b/\u0010\u001e¨\u00060"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;", "", "", "arcTopTranslateX", "arcTopTranslateY", "arcBottomTranslateX", "arcBottomTranslateY", "arcLeftTranslateX", "arcLeftTranslateY", "arcRightTranslateX", "arcRightTranslateY", "arcThicknessMultiplier", "<init>", "(FFFFFFFFF)V", "a", "(FFFFFFFFF)Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", Gender.FEMALE, "j", "()F", "s", "(F)V", "b", "k", "t", "c", "l", DateTokenConverter.CONVERTER_KEY, "m", "e", "n", "f", "o", "g", "p", "h", "q", IntegerTokenConverter.CONVERTER_KEY, "r", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final /* data */ class ArcHoverState {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private float arcTopTranslateX;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private float arcTopTranslateY;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private float arcBottomTranslateX;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private float arcBottomTranslateY;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private float arcLeftTranslateX;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private float arcLeftTranslateY;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private float arcRightTranslateX;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private float arcRightTranslateY;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private float arcThicknessMultiplier;

        public ArcHoverState(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19) {
            this.arcTopTranslateX = f11;
            this.arcTopTranslateY = f12;
            this.arcBottomTranslateX = f13;
            this.arcBottomTranslateY = f14;
            this.arcLeftTranslateX = f15;
            this.arcLeftTranslateY = f16;
            this.arcRightTranslateX = f17;
            this.arcRightTranslateY = f18;
            this.arcThicknessMultiplier = f19;
        }

        public static /* synthetic */ ArcHoverState b(ArcHoverState arcHoverState, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                f11 = arcHoverState.arcTopTranslateX;
            }
            if ((i11 & 2) != 0) {
                f12 = arcHoverState.arcTopTranslateY;
            }
            if ((i11 & 4) != 0) {
                f13 = arcHoverState.arcBottomTranslateX;
            }
            if ((i11 & 8) != 0) {
                f14 = arcHoverState.arcBottomTranslateY;
            }
            if ((i11 & 16) != 0) {
                f15 = arcHoverState.arcLeftTranslateX;
            }
            if ((i11 & 32) != 0) {
                f16 = arcHoverState.arcLeftTranslateY;
            }
            if ((i11 & 64) != 0) {
                f17 = arcHoverState.arcRightTranslateX;
            }
            if ((i11 & 128) != 0) {
                f18 = arcHoverState.arcRightTranslateY;
            }
            if ((i11 & 256) != 0) {
                f19 = arcHoverState.arcThicknessMultiplier;
            }
            float f21 = f18;
            float f22 = f19;
            float f23 = f16;
            float f24 = f17;
            float f25 = f15;
            float f26 = f13;
            return arcHoverState.a(f11, f12, f26, f14, f25, f23, f24, f21, f22);
        }

        public final ArcHoverState a(float arcTopTranslateX, float arcTopTranslateY, float arcBottomTranslateX, float arcBottomTranslateY, float arcLeftTranslateX, float arcLeftTranslateY, float arcRightTranslateX, float arcRightTranslateY, float arcThicknessMultiplier) {
            return new ArcHoverState(arcTopTranslateX, arcTopTranslateY, arcBottomTranslateX, arcBottomTranslateY, arcLeftTranslateX, arcLeftTranslateY, arcRightTranslateX, arcRightTranslateY, arcThicknessMultiplier);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final float getArcBottomTranslateX() {
            return this.arcBottomTranslateX;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final float getArcBottomTranslateY() {
            return this.arcBottomTranslateY;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final float getArcLeftTranslateX() {
            return this.arcLeftTranslateX;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ArcHoverState)) {
                return false;
            }
            ArcHoverState arcHoverState = (ArcHoverState) other;
            return Float.compare(this.arcTopTranslateX, arcHoverState.arcTopTranslateX) == 0 && Float.compare(this.arcTopTranslateY, arcHoverState.arcTopTranslateY) == 0 && Float.compare(this.arcBottomTranslateX, arcHoverState.arcBottomTranslateX) == 0 && Float.compare(this.arcBottomTranslateY, arcHoverState.arcBottomTranslateY) == 0 && Float.compare(this.arcLeftTranslateX, arcHoverState.arcLeftTranslateX) == 0 && Float.compare(this.arcLeftTranslateY, arcHoverState.arcLeftTranslateY) == 0 && Float.compare(this.arcRightTranslateX, arcHoverState.arcRightTranslateX) == 0 && Float.compare(this.arcRightTranslateY, arcHoverState.arcRightTranslateY) == 0 && Float.compare(this.arcThicknessMultiplier, arcHoverState.arcThicknessMultiplier) == 0;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final float getArcLeftTranslateY() {
            return this.arcLeftTranslateY;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final float getArcRightTranslateX() {
            return this.arcRightTranslateX;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final float getArcRightTranslateY() {
            return this.arcRightTranslateY;
        }

        public int hashCode() {
            return (((((((((((((((Float.hashCode(this.arcTopTranslateX) * 31) + Float.hashCode(this.arcTopTranslateY)) * 31) + Float.hashCode(this.arcBottomTranslateX)) * 31) + Float.hashCode(this.arcBottomTranslateY)) * 31) + Float.hashCode(this.arcLeftTranslateX)) * 31) + Float.hashCode(this.arcLeftTranslateY)) * 31) + Float.hashCode(this.arcRightTranslateX)) * 31) + Float.hashCode(this.arcRightTranslateY)) * 31) + Float.hashCode(this.arcThicknessMultiplier);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final float getArcThicknessMultiplier() {
            return this.arcThicknessMultiplier;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final float getArcTopTranslateX() {
            return this.arcTopTranslateX;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final float getArcTopTranslateY() {
            return this.arcTopTranslateY;
        }

        public final void l(float f11) {
            this.arcBottomTranslateX = f11;
        }

        public final void m(float f11) {
            this.arcBottomTranslateY = f11;
        }

        public final void n(float f11) {
            this.arcLeftTranslateX = f11;
        }

        public final void o(float f11) {
            this.arcLeftTranslateY = f11;
        }

        public final void p(float f11) {
            this.arcRightTranslateX = f11;
        }

        public final void q(float f11) {
            this.arcRightTranslateY = f11;
        }

        public final void r(float f11) {
            this.arcThicknessMultiplier = f11;
        }

        public final void s(float f11) {
            this.arcTopTranslateX = f11;
        }

        public final void t(float f11) {
            this.arcTopTranslateY = f11;
        }

        public String toString() {
            return "ArcHoverState(arcTopTranslateX=" + this.arcTopTranslateX + ", arcTopTranslateY=" + this.arcTopTranslateY + ", arcBottomTranslateX=" + this.arcBottomTranslateX + ", arcBottomTranslateY=" + this.arcBottomTranslateY + ", arcLeftTranslateX=" + this.arcLeftTranslateX + ", arcLeftTranslateY=" + this.arcLeftTranslateY + ", arcRightTranslateX=" + this.arcRightTranslateX + ", arcRightTranslateY=" + this.arcRightTranslateY + ", arcThicknessMultiplier=" + this.arcThicknessMultiplier + ")";
        }

        public /* synthetic */ ArcHoverState(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 0.0f : f11, (i11 & 2) != 0 ? 0.0f : f12, (i11 & 4) != 0 ? 0.0f : f13, (i11 & 8) != 0 ? 0.0f : f14, (i11 & 16) != 0 ? 0.0f : f15, (i11 & 32) != 0 ? 0.0f : f16, (i11 & 64) != 0 ? 0.0f : f17, (i11 & 128) != 0 ? 0.0f : f18, (i11 & 256) != 0 ? 1.0f : f19);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfieOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        s.k(context, "context");
        this.state = e.Center;
        this.colorOnSurface = -1;
        this.shadowColor = -16777216;
        this.accentColor = -13910906;
        this.arcBaseColor = -1;
        this.arcHighlightColor = -13910906;
        this.arcInset = (float) yh0.h.a(48.0d);
        this.arcGapDegrees = 20.0f;
        this.arcStrokeWidth = (float) yh0.h.a(4.0d);
        this.arcDialStrokeWidth = (float) yh0.h.a(2.0d);
        this.arcTickLength = (float) yh0.h.a(24.0d);
        this.arcTop = new Path();
        this.arcBottom = new Path();
        this.arcLeft = new Path();
        this.arcRight = new Path();
        this.arcDialLeft = new Path();
        this.arcDialRight = new Path();
        this.arcDialHighlightClipPathRight = new Path();
        this.arcDialHighlightClipPathLeft = new Path();
        this.arcTopPaint = u();
        this.arcBottomPaint = u();
        this.arcLeftPaint = u();
        this.arcRightPaint = u();
        this.shadowPaint = v();
        Paint paintT = t();
        paintT.setAlpha(0);
        this.arcDialLeftPaint = paintT;
        Paint paintT2 = t();
        paintT2.setAlpha(0);
        this.arcDialRightPaint = paintT2;
        Paint paintT3 = t();
        paintT3.setColor(-13910906);
        this.filledArcDialPaint = paintT3;
        this.arcHoverState = p(new ArcHoverState(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 511, null), this.currentIntensity);
        this.brightnessInfo = new dg0.a(null, 1, null);
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfieOverlayView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        s.k(context, "context");
        this.state = e.Center;
        this.colorOnSurface = -1;
        this.shadowColor = -16777216;
        this.accentColor = -13910906;
        this.arcBaseColor = -1;
        this.arcHighlightColor = -13910906;
        this.arcInset = (float) yh0.h.a(48.0d);
        this.arcGapDegrees = 20.0f;
        this.arcStrokeWidth = (float) yh0.h.a(4.0d);
        this.arcDialStrokeWidth = (float) yh0.h.a(2.0d);
        this.arcTickLength = (float) yh0.h.a(24.0d);
        this.arcTop = new Path();
        this.arcBottom = new Path();
        this.arcLeft = new Path();
        this.arcRight = new Path();
        this.arcDialLeft = new Path();
        this.arcDialRight = new Path();
        this.arcDialHighlightClipPathRight = new Path();
        this.arcDialHighlightClipPathLeft = new Path();
        this.arcTopPaint = u();
        this.arcBottomPaint = u();
        this.arcLeftPaint = u();
        this.arcRightPaint = u();
        this.shadowPaint = v();
        Paint paintT = t();
        paintT.setAlpha(0);
        this.arcDialLeftPaint = paintT;
        Paint paintT2 = t();
        paintT2.setAlpha(0);
        this.arcDialRightPaint = paintT2;
        Paint paintT3 = t();
        paintT3.setColor(-13910906);
        this.filledArcDialPaint = paintT3;
        this.arcHoverState = p(new ArcHoverState(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 511, null), this.currentIntensity);
        this.brightnessInfo = new dg0.a(null, 1, null);
        setWillNotDraw(false);
    }
}
