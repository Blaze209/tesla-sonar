package p016o2;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.modules.appstate.AppStateModule;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import ezvcard.property.Gender;
import k3.p1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o2.i, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000e\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B§\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\u0006\u0010#\u001a\u00020\u0002\u0012\u0006\u0010$\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\u0006\u0010&\u001a\u00020\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010/R\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b3\u0010/R\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b4\u0010-\u001a\u0004\b5\u0010/R\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b6\u0010-\u001a\u0004\b7\u0010/R\u001d\u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b8\u0010-\u001a\u0004\b9\u0010/R\u001d\u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b:\u0010-\u001a\u0004\b;\u0010/R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b<\u0010-\u001a\u0004\b=\u0010/R\u001d\u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b7\u0010-\u001a\u0004\b>\u0010/R\u001d\u0010\f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b?\u0010-\u001a\u0004\b@\u0010/R\u001d\u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bA\u0010-\u001a\u0004\bB\u0010/R\u001d\u0010\u000e\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bC\u0010-\u001a\u0004\bD\u0010/R\u001d\u0010\u000f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bE\u0010-\u001a\u0004\bF\u0010/R\u001d\u0010\u0010\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b,\u0010/R\u001d\u0010\u0011\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b5\u0010-\u001a\u0004\bA\u0010/R\u001d\u0010\u0012\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b;\u0010-\u001a\u0004\bG\u0010/R\u001d\u0010\u0013\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b>\u0010-\u001a\u0004\bH\u0010/R\u001d\u0010\u0014\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bH\u0010-\u001a\u0004\bI\u0010/R\u001d\u0010\u0015\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bJ\u0010-\u001a\u0004\bJ\u0010/R\u001d\u0010\u0016\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bB\u0010-\u001a\u0004\bK\u0010/R\u001d\u0010\u0017\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bF\u0010-\u001a\u0004\b?\u0010/R\u001d\u0010\u0018\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bL\u0010-\u001a\u0004\b<\u0010/R\u001d\u0010\u0019\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bM\u0010-\u001a\u0004\b8\u0010/R\u001d\u0010\u001a\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b.\u0010-\u001a\u0004\bC\u0010/R\u001d\u0010\u001b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b3\u0010-\u001a\u0004\b:\u0010/R\u001d\u0010\u001c\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bN\u0010-\u001a\u0004\bE\u0010/R\u001d\u0010\u001d\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b9\u0010-\u001a\u0004\bL\u0010/R\u001d\u0010\u001e\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b=\u0010-\u001a\u0004\bM\u0010/R\u001d\u0010\u001f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bG\u0010-\u001a\u0004\bN\u0010/R\u001d\u0010 \u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bO\u0010-\u001a\u0004\bO\u0010/R\u001d\u0010!\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bP\u0010-\u001a\u0004\b-\u0010/R\u001d\u0010\"\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bQ\u0010-\u001a\u0004\bP\u0010/R\u001d\u0010#\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bR\u0010-\u001a\u0004\bQ\u0010/R\u001d\u0010$\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bS\u0010-\u001a\u0004\bR\u0010/R\u001d\u0010%\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bT\u0010-\u001a\u0004\bS\u0010/R\u001d\u0010&\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b-\u0010-\u001a\u0004\bT\u0010/R$\u0010Z\u001a\u0004\u0018\u00010U8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bK\u0010V\u001a\u0004\b0\u0010W\"\u0004\bX\u0010YR$\u0010\\\u001a\u0004\u0018\u00010U8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bI\u0010V\u001a\u0004\b6\u0010W\"\u0004\b[\u0010YR$\u0010b\u001a\u0004\u0018\u00010]8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b@\u0010^\u001a\u0004\b2\u0010_\"\u0004\b`\u0010aR$\u0010h\u001a\u0004\u0018\u00010c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bD\u0010d\u001a\u0004\b4\u0010e\"\u0004\bf\u0010g\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006i"}, d2 = {"Lo2/i;", "", "Lk3/p1;", "primary", "onPrimary", "primaryContainer", "onPrimaryContainer", "inversePrimary", "secondary", "onSecondary", "secondaryContainer", "onSecondaryContainer", "tertiary", "onTertiary", "tertiaryContainer", "onTertiaryContainer", AppStateModule.APP_STATE_BACKGROUND, "onBackground", "surface", "onSurface", "surfaceVariant", "onSurfaceVariant", "surfaceTint", "inverseSurface", "inverseOnSurface", AnalyticsAttribute.Error, "onError", "errorContainer", "onErrorContainer", "outline", "outlineVariant", "scrim", "surfaceBright", "surfaceDim", "surfaceContainer", "surfaceContainerHigh", "surfaceContainerHighest", "surfaceContainerLow", "surfaceContainerLowest", "<init>", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "a", "J", "x", "()J", "b", "n", "c", "y", DateTokenConverter.CONVERTER_KEY, "o", "e", IntegerTokenConverter.CONVERTER_KEY, "f", "A", "g", "p", "h", "B", "q", "j", Gender.MALE, "k", "t", "l", Gender.NONE, "m", "u", "C", "r", "L", "s", "K", "v", "w", "z", "D", "E", Gender.FEMALE, "G", "H", "I", "Lo2/a;", "Lo2/a;", "()Lo2/a;", Gender.OTHER, "(Lo2/a;)V", "defaultButtonColorsCached", "R", "defaultTextButtonColorsCached", "Lo2/e;", "Lo2/e;", "()Lo2/e;", "P", "(Lo2/e;)V", "defaultCardColorsCached", "Lo2/n0;", "Lo2/n0;", "()Lo2/n0;", "Q", "(Lo2/n0;)V", "defaultOutlinedTextFieldColorsCached", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ColorScheme {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata and from toString */
    private final long outline;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata and from toString */
    private final long outlineVariant;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata and from toString */
    private final long scrim;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata and from toString */
    private final long surfaceBright;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata and from toString */
    private final long surfaceDim;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata and from toString */
    private final long surfaceContainer;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata and from toString */
    private final long surfaceContainerHigh;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata and from toString */
    private final long surfaceContainerHighest;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata and from toString */
    private final long surfaceContainerLow;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata and from toString */
    private final long surfaceContainerLowest;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private a defaultButtonColorsCached;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private a defaultTextButtonColorsCached;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private e defaultCardColorsCached;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private n0 defaultOutlinedTextFieldColorsCached;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long primary;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long onPrimary;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long primaryContainer;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final long onPrimaryContainer;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final long inversePrimary;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final long secondary;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final long onSecondary;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final long secondaryContainer;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final long onSecondaryContainer;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final long tertiary;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final long onTertiary;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final long tertiaryContainer;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final long onTertiaryContainer;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final long background;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final long onBackground;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final long surface;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final long onSurface;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final long surfaceVariant;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final long onSurfaceVariant;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final long surfaceTint;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private final long inverseSurface;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    private final long inverseOnSurface;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
    private final long error;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
    private final long onError;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
    private final long errorContainer;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
    private final long onErrorContainer;

    public /* synthetic */ ColorScheme(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, j13, j14, j15, j16, j17, j18, j19, j21, j22, j23, j24, j25, j26, j27, j28, j29, j31, j32, j33, j34, j35, j36, j37, j38, j39, j41, j42, j43, j44, j45, j46, j47, j48, j49);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final long getSecondary() {
        return this.secondary;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final long getSecondaryContainer() {
        return this.secondaryContainer;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final long getSurface() {
        return this.surface;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final long getSurfaceBright() {
        return this.surfaceBright;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final long getSurfaceContainer() {
        return this.surfaceContainer;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final long getSurfaceContainerHigh() {
        return this.surfaceContainerHigh;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final long getSurfaceContainerHighest() {
        return this.surfaceContainerHighest;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final long getSurfaceContainerLow() {
        return this.surfaceContainerLow;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final long getSurfaceContainerLowest() {
        return this.surfaceContainerLowest;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final long getSurfaceDim() {
        return this.surfaceDim;
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final long getSurfaceTint() {
        return this.surfaceTint;
    }

    /* JADX INFO: renamed from: L, reason: from getter */
    public final long getSurfaceVariant() {
        return this.surfaceVariant;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final long getTertiary() {
        return this.tertiary;
    }

    /* JADX INFO: renamed from: N, reason: from getter */
    public final long getTertiaryContainer() {
        return this.tertiaryContainer;
    }

    public final void O(a aVar) {
        this.defaultButtonColorsCached = aVar;
    }

    public final void P(e eVar) {
        this.defaultCardColorsCached = eVar;
    }

    public final void Q(n0 n0Var) {
        this.defaultOutlinedTextFieldColorsCached = n0Var;
    }

    public final void R(a aVar) {
        this.defaultTextButtonColorsCached = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getBackground() {
        return this.background;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getDefaultButtonColorsCached() {
        return this.defaultButtonColorsCached;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final e getDefaultCardColorsCached() {
        return this.defaultCardColorsCached;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final n0 getDefaultOutlinedTextFieldColorsCached() {
        return this.defaultOutlinedTextFieldColorsCached;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final a getDefaultTextButtonColorsCached() {
        return this.defaultTextButtonColorsCached;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getErrorContainer() {
        return this.errorContainer;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getInverseOnSurface() {
        return this.inverseOnSurface;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getInversePrimary() {
        return this.inversePrimary;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final long getInverseSurface() {
        return this.inverseSurface;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final long getOnBackground() {
        return this.onBackground;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final long getOnError() {
        return this.onError;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final long getOnErrorContainer() {
        return this.onErrorContainer;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final long getOnPrimary() {
        return this.onPrimary;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final long getOnPrimaryContainer() {
        return this.onPrimaryContainer;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final long getOnSecondary() {
        return this.onSecondary;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final long getOnSecondaryContainer() {
        return this.onSecondaryContainer;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final long getOnSurface() {
        return this.onSurface;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final long getOnSurfaceVariant() {
        return this.onSurfaceVariant;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final long getOnTertiary() {
        return this.onTertiary;
    }

    public String toString() {
        return "ColorScheme(primary=" + ((Object) p1.y(this.primary)) + "onPrimary=" + ((Object) p1.y(this.onPrimary)) + "primaryContainer=" + ((Object) p1.y(this.primaryContainer)) + "onPrimaryContainer=" + ((Object) p1.y(this.onPrimaryContainer)) + "inversePrimary=" + ((Object) p1.y(this.inversePrimary)) + "secondary=" + ((Object) p1.y(this.secondary)) + "onSecondary=" + ((Object) p1.y(this.onSecondary)) + "secondaryContainer=" + ((Object) p1.y(this.secondaryContainer)) + "onSecondaryContainer=" + ((Object) p1.y(this.onSecondaryContainer)) + "tertiary=" + ((Object) p1.y(this.tertiary)) + "onTertiary=" + ((Object) p1.y(this.onTertiary)) + "tertiaryContainer=" + ((Object) p1.y(this.tertiaryContainer)) + "onTertiaryContainer=" + ((Object) p1.y(this.onTertiaryContainer)) + "background=" + ((Object) p1.y(this.background)) + "onBackground=" + ((Object) p1.y(this.onBackground)) + "surface=" + ((Object) p1.y(this.surface)) + "onSurface=" + ((Object) p1.y(this.onSurface)) + "surfaceVariant=" + ((Object) p1.y(this.surfaceVariant)) + "onSurfaceVariant=" + ((Object) p1.y(this.onSurfaceVariant)) + "surfaceTint=" + ((Object) p1.y(this.surfaceTint)) + "inverseSurface=" + ((Object) p1.y(this.inverseSurface)) + "inverseOnSurface=" + ((Object) p1.y(this.inverseOnSurface)) + "error=" + ((Object) p1.y(this.error)) + "onError=" + ((Object) p1.y(this.onError)) + "errorContainer=" + ((Object) p1.y(this.errorContainer)) + "onErrorContainer=" + ((Object) p1.y(this.onErrorContainer)) + "outline=" + ((Object) p1.y(this.outline)) + "outlineVariant=" + ((Object) p1.y(this.outlineVariant)) + "scrim=" + ((Object) p1.y(this.scrim)) + "surfaceBright=" + ((Object) p1.y(this.surfaceBright)) + "surfaceDim=" + ((Object) p1.y(this.surfaceDim)) + "surfaceContainer=" + ((Object) p1.y(this.surfaceContainer)) + "surfaceContainerHigh=" + ((Object) p1.y(this.surfaceContainerHigh)) + "surfaceContainerHighest=" + ((Object) p1.y(this.surfaceContainerHighest)) + "surfaceContainerLow=" + ((Object) p1.y(this.surfaceContainerLow)) + "surfaceContainerLowest=" + ((Object) p1.y(this.surfaceContainerLowest)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final long getOnTertiaryContainer() {
        return this.onTertiaryContainer;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final long getOutline() {
        return this.outline;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final long getOutlineVariant() {
        return this.outlineVariant;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final long getPrimary() {
        return this.primary;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final long getPrimaryContainer() {
        return this.primaryContainer;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final long getScrim() {
        return this.scrim;
    }

    private ColorScheme(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49) {
        this.primary = j11;
        this.onPrimary = j12;
        this.primaryContainer = j13;
        this.onPrimaryContainer = j14;
        this.inversePrimary = j15;
        this.secondary = j16;
        this.onSecondary = j17;
        this.secondaryContainer = j18;
        this.onSecondaryContainer = j19;
        this.tertiary = j21;
        this.onTertiary = j22;
        this.tertiaryContainer = j23;
        this.onTertiaryContainer = j24;
        this.background = j25;
        this.onBackground = j26;
        this.surface = j27;
        this.onSurface = j28;
        this.surfaceVariant = j29;
        this.onSurfaceVariant = j31;
        this.surfaceTint = j32;
        this.inverseSurface = j33;
        this.inverseOnSurface = j34;
        this.error = j35;
        this.onError = j36;
        this.errorContainer = j37;
        this.onErrorContainer = j38;
        this.outline = j39;
        this.outlineVariant = j41;
        this.scrim = j42;
        this.surfaceBright = j43;
        this.surfaceDim = j44;
        this.surfaceContainer = j45;
        this.surfaceContainerHigh = j46;
        this.surfaceContainerHighest = j47;
        this.surfaceContainerLow = j48;
        this.surfaceContainerLowest = j49;
    }
}
