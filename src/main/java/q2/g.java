package q2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\bj\n\u0002\u0018\u0002\n\u0002\b%\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u000f\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0005\u0010\u0013R\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u0015\u0010\bR\u0017\u0010\u001c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u0017\u0010\bR\u001d\u0010\u001f\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001d\u0010\f\u001a\u0004\b\u001e\u0010\u000eR\u0017\u0010!\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u0006\u001a\u0004\b\u0019\u0010\bR\u0017\u0010#\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u0006\u001a\u0004\b\u001b\u0010\bR\u0017\u0010%\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u0006\u001a\u0004\b\u001d\u0010\bR\u0017\u0010(\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\u0006\u001a\u0004\b'\u0010\bR\u0017\u0010+\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010\u0006\u001a\u0004\b*\u0010\bR\u0017\u0010.\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010\u0006\u001a\u0004\b-\u0010\bR\u0017\u00101\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u0010\u0006\u001a\u0004\b0\u0010\bR\u0017\u00104\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b2\u0010\u0006\u001a\u0004\b3\u0010\bR\u0017\u00107\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b5\u0010\u0006\u001a\u0004\b6\u0010\bR\u0017\u0010:\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b8\u0010\u0006\u001a\u0004\b9\u0010\bR\u0017\u0010=\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b;\u0010\u0006\u001a\u0004\b<\u0010\bR\u0017\u0010@\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b>\u0010\u0006\u001a\u0004\b?\u0010\bR\u0017\u0010C\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bA\u0010\u0006\u001a\u0004\bB\u0010\bR\u0017\u0010F\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bD\u0010\u0006\u001a\u0004\bE\u0010\bR\u0017\u0010I\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bG\u0010\u0006\u001a\u0004\bH\u0010\bR\u0017\u0010K\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bJ\u0010\u0006\u001a\u0004\b \u0010\bR\u0017\u0010M\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bL\u0010\u0006\u001a\u0004\b\"\u0010\bR\u0017\u0010O\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bN\u0010\u0006\u001a\u0004\b$\u0010\bR\u0017\u0010Q\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bP\u0010\u0006\u001a\u0004\b&\u0010\bR\u0017\u0010S\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bR\u0010\u0006\u001a\u0004\b)\u0010\bR\u0017\u0010U\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bT\u0010\u0006\u001a\u0004\b,\u0010\bR\u0017\u0010W\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bV\u0010\u0006\u001a\u0004\b/\u0010\bR\u0017\u0010X\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b2\u0010\bR\u0017\u0010Z\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bY\u0010\u0006\u001a\u0004\b5\u0010\bR\u0017\u0010\\\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b[\u0010\u0006\u001a\u0004\b8\u0010\bR\u001d\u0010_\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b]\u0010\f\u001a\u0004\b^\u0010\u000eR\u0017\u0010a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b`\u0010\u0006\u001a\u0004\b;\u0010\bR\u0017\u0010c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bb\u0010\u0006\u001a\u0004\b>\u0010\bR\u0017\u0010f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bd\u0010\u0006\u001a\u0004\be\u0010\bR\u0017\u0010i\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bg\u0010\u0006\u001a\u0004\bh\u0010\bR\u0017\u0010l\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bj\u0010\u0006\u001a\u0004\bk\u0010\bR\u0017\u0010o\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bm\u0010\u0006\u001a\u0004\bn\u0010\bR\u001d\u0010r\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bp\u0010\f\u001a\u0004\bq\u0010\u000eR\u0017\u0010u\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bs\u0010\u0006\u001a\u0004\bt\u0010\bR\u0017\u0010x\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bv\u0010\u0006\u001a\u0004\bw\u0010\bR\u0017\u0010z\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\by\u0010\u0006\u001a\u0004\bA\u0010\bR\u0018\u0010\u0080\u0001\u001a\u00020{8\u0006¢\u0006\f\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007fR\u0019\u0010\u0082\u0001\u001a\u00020\u00048\u0006¢\u0006\r\n\u0005\b\u0081\u0001\u0010\u0006\u001a\u0004\bD\u0010\bR\u0019\u0010\u0084\u0001\u001a\u00020\u00048\u0006¢\u0006\r\n\u0005\b\u0083\u0001\u0010\u0006\u001a\u0004\bG\u0010\bR\u0019\u0010\u0086\u0001\u001a\u00020\u00048\u0006¢\u0006\r\n\u0005\b\u0085\u0001\u0010\u0006\u001a\u0004\bJ\u0010\bR\u0019\u0010\u0088\u0001\u001a\u00020\u00048\u0006¢\u0006\r\n\u0005\b\u0087\u0001\u0010\u0006\u001a\u0004\bL\u0010\bR\u001a\u0010\u008b\u0001\u001a\u00020{8\u0006¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010}\u001a\u0005\b\u008a\u0001\u0010\u007fR\u0019\u0010\u008d\u0001\u001a\u00020\u00048\u0006¢\u0006\r\n\u0005\b\u008c\u0001\u0010\u0006\u001a\u0004\bN\u0010\bR \u0010\u0090\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u008e\u0001\u0010\f\u001a\u0005\b\u008f\u0001\u0010\u000eR\u0019\u0010\u0092\u0001\u001a\u00020\u00048\u0006¢\u0006\r\n\u0005\b\u0091\u0001\u0010\u0006\u001a\u0004\bP\u0010\bR \u0010\u0095\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0093\u0001\u0010\f\u001a\u0005\b\u0094\u0001\u0010\u000eR\u0019\u0010\u0097\u0001\u001a\u00020\u00048\u0006¢\u0006\r\n\u0005\b\u0096\u0001\u0010\u0006\u001a\u0004\bR\u0010\bR\u001a\u0010\u009a\u0001\u001a\u00020{8\u0006¢\u0006\u000e\n\u0005\b\u0098\u0001\u0010}\u001a\u0005\b\u0099\u0001\u0010\u007fR\u0019\u0010\u009c\u0001\u001a\u00020\u00048\u0006¢\u0006\r\n\u0005\b\u009b\u0001\u0010\u0006\u001a\u0004\bT\u0010\bR \u0010\u009f\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u009d\u0001\u0010\f\u001a\u0005\b\u009e\u0001\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 \u0001"}, d2 = {"Lq2/g;", "", "<init>", "()V", "Lq2/b;", "b", "Lq2/b;", "a", "()Lq2/b;", "CaretColor", "Lw4/h;", "c", Gender.FEMALE, "getContainerHeight-D9Ej5fM", "()F", "ContainerHeight", "Lq2/i;", DateTokenConverter.CONVERTER_KEY, "Lq2/i;", "()Lq2/i;", "ContainerShape", "e", "DisabledInputColor", "f", "DisabledLabelColor", "g", "DisabledLeadingIconColor", "h", "DisabledOutlineColor", IntegerTokenConverter.CONVERTER_KEY, "getDisabledOutlineWidth-D9Ej5fM", "DisabledOutlineWidth", "j", "DisabledSupportingColor", "k", "DisabledTrailingIconColor", "l", "ErrorFocusCaretColor", "m", "getErrorFocusInputColor", "ErrorFocusInputColor", "n", "getErrorFocusLabelColor", "ErrorFocusLabelColor", "o", "getErrorFocusLeadingIconColor", "ErrorFocusLeadingIconColor", "p", "getErrorFocusOutlineColor", "ErrorFocusOutlineColor", "q", "getErrorFocusSupportingColor", "ErrorFocusSupportingColor", "r", "getErrorFocusTrailingIconColor", "ErrorFocusTrailingIconColor", "s", "getErrorHoverInputColor", "ErrorHoverInputColor", "t", "getErrorHoverLabelColor", "ErrorHoverLabelColor", "u", "getErrorHoverLeadingIconColor", "ErrorHoverLeadingIconColor", "v", "getErrorHoverOutlineColor", "ErrorHoverOutlineColor", "w", "getErrorHoverSupportingColor", "ErrorHoverSupportingColor", "x", "getErrorHoverTrailingIconColor", "ErrorHoverTrailingIconColor", "y", "ErrorInputColor", "z", "ErrorLabelColor", "A", "ErrorLeadingIconColor", "B", "ErrorOutlineColor", "C", "ErrorSupportingColor", "D", "ErrorTrailingIconColor", "E", "FocusInputColor", "FocusLabelColor", "G", "FocusLeadingIconColor", "H", "FocusOutlineColor", "I", "getFocusOutlineWidth-D9Ej5fM", "FocusOutlineWidth", "J", "FocusSupportingColor", "K", "FocusTrailingIconColor", "L", "getHoverInputColor", "HoverInputColor", Gender.MALE, "getHoverLabelColor", "HoverLabelColor", Gender.NONE, "getHoverLeadingIconColor", "HoverLeadingIconColor", Gender.OTHER, "getHoverOutlineColor", "HoverOutlineColor", "P", "getHoverOutlineWidth-D9Ej5fM", "HoverOutlineWidth", "Q", "getHoverSupportingColor", "HoverSupportingColor", "R", "getHoverTrailingIconColor", "HoverTrailingIconColor", "S", "InputColor", "Lq2/o;", "T", "Lq2/o;", "getInputFont", "()Lq2/o;", "InputFont", Gender.UNKNOWN, "InputPlaceholderColor", "V", "InputPrefixColor", "W", "InputSuffixColor", "X", "LabelColor", "Y", "getLabelFont", "LabelFont", "Z", "LeadingIconColor", "a0", "getLeadingIconSize-D9Ej5fM", "LeadingIconSize", "b0", "OutlineColor", "c0", "getOutlineWidth-D9Ej5fM", "OutlineWidth", "d0", "SupportingColor", "e0", "getSupportingFont", "SupportingFont", "f0", "TrailingIconColor", "g0", "getTrailingIconSize-D9Ej5fM", "TrailingIconSize", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private static final b ErrorLeadingIconColor;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private static final b ErrorOutlineColor;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private static final b ErrorSupportingColor;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private static final b ErrorTrailingIconColor;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private static final b FocusInputColor;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private static final b FocusLabelColor;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private static final b FocusLeadingIconColor;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private static final b FocusOutlineColor;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private static final float FocusOutlineWidth;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private static final b FocusSupportingColor;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private static final b FocusTrailingIconColor;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private static final b HoverInputColor;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private static final b HoverLabelColor;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private static final b HoverLeadingIconColor;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private static final b HoverOutlineColor;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private static final float HoverOutlineWidth;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private static final b HoverSupportingColor;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private static final b HoverTrailingIconColor;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private static final b InputColor;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private static final o InputFont;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private static final b InputPlaceholderColor;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private static final b InputPrefixColor;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private static final b InputSuffixColor;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private static final b LabelColor;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    private static final o LabelFont;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    private static final b LeadingIconColor;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f104461a = new g();

    /* JADX INFO: renamed from: a0, reason: collision with root package name and from kotlin metadata */
    private static final float LeadingIconSize;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final b CaretColor;

    /* JADX INFO: renamed from: b0, reason: collision with root package name and from kotlin metadata */
    private static final b OutlineColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float ContainerHeight;

    /* JADX INFO: renamed from: c0, reason: collision with root package name and from kotlin metadata */
    private static final float OutlineWidth;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final i ContainerShape;

    /* JADX INFO: renamed from: d0, reason: collision with root package name and from kotlin metadata */
    private static final b SupportingColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final b DisabledInputColor;

    /* JADX INFO: renamed from: e0, reason: collision with root package name and from kotlin metadata */
    private static final o SupportingFont;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final b DisabledLabelColor;

    /* JADX INFO: renamed from: f0, reason: collision with root package name and from kotlin metadata */
    private static final b TrailingIconColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final b DisabledLeadingIconColor;

    /* JADX INFO: renamed from: g0, reason: collision with root package name and from kotlin metadata */
    private static final float TrailingIconSize;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final b DisabledOutlineColor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final float DisabledOutlineWidth;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final b DisabledSupportingColor;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final b DisabledTrailingIconColor;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final b ErrorFocusCaretColor;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static final b ErrorFocusInputColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private static final b ErrorFocusLabelColor;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private static final b ErrorFocusLeadingIconColor;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private static final b ErrorFocusOutlineColor;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private static final b ErrorFocusSupportingColor;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private static final b ErrorFocusTrailingIconColor;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private static final b ErrorHoverInputColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final b ErrorHoverLabelColor;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private static final b ErrorHoverLeadingIconColor;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private static final b ErrorHoverOutlineColor;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private static final b ErrorHoverSupportingColor;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private static final b ErrorHoverTrailingIconColor;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private static final b ErrorInputColor;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private static final b ErrorLabelColor;

    static {
        b bVar = b.Primary;
        CaretColor = bVar;
        ContainerHeight = w4.h.g((float) 56.0d);
        ContainerShape = i.CornerExtraSmall;
        b bVar2 = b.OnSurface;
        DisabledInputColor = bVar2;
        DisabledLabelColor = bVar2;
        DisabledLeadingIconColor = bVar2;
        DisabledOutlineColor = bVar2;
        float f11 = (float) 1.0d;
        DisabledOutlineWidth = w4.h.g(f11);
        DisabledSupportingColor = bVar2;
        DisabledTrailingIconColor = bVar2;
        b bVar3 = b.Error;
        ErrorFocusCaretColor = bVar3;
        ErrorFocusInputColor = bVar2;
        ErrorFocusLabelColor = bVar3;
        b bVar4 = b.OnSurfaceVariant;
        ErrorFocusLeadingIconColor = bVar4;
        ErrorFocusOutlineColor = bVar3;
        ErrorFocusSupportingColor = bVar3;
        ErrorFocusTrailingIconColor = bVar3;
        ErrorHoverInputColor = bVar2;
        b bVar5 = b.OnErrorContainer;
        ErrorHoverLabelColor = bVar5;
        ErrorHoverLeadingIconColor = bVar4;
        ErrorHoverOutlineColor = bVar5;
        ErrorHoverSupportingColor = bVar3;
        ErrorHoverTrailingIconColor = bVar5;
        ErrorInputColor = bVar2;
        ErrorLabelColor = bVar3;
        ErrorLeadingIconColor = bVar4;
        ErrorOutlineColor = bVar3;
        ErrorSupportingColor = bVar3;
        ErrorTrailingIconColor = bVar3;
        FocusInputColor = bVar2;
        FocusLabelColor = bVar;
        FocusLeadingIconColor = bVar4;
        FocusOutlineColor = bVar;
        FocusOutlineWidth = w4.h.g((float) 2.0d);
        FocusSupportingColor = bVar4;
        FocusTrailingIconColor = bVar4;
        HoverInputColor = bVar2;
        HoverLabelColor = bVar2;
        HoverLeadingIconColor = bVar4;
        HoverOutlineColor = bVar2;
        HoverOutlineWidth = w4.h.g(f11);
        HoverSupportingColor = bVar4;
        HoverTrailingIconColor = bVar4;
        InputColor = bVar2;
        o oVar = o.BodyLarge;
        InputFont = oVar;
        InputPlaceholderColor = bVar4;
        InputPrefixColor = bVar4;
        InputSuffixColor = bVar4;
        LabelColor = bVar4;
        LabelFont = oVar;
        LeadingIconColor = bVar4;
        float f12 = (float) 24.0d;
        LeadingIconSize = w4.h.g(f12);
        OutlineColor = b.Outline;
        OutlineWidth = w4.h.g(f11);
        SupportingColor = bVar4;
        SupportingFont = o.BodySmall;
        TrailingIconColor = bVar4;
        TrailingIconSize = w4.h.g(f12);
    }

    private g() {
    }

    public final b A() {
        return LeadingIconColor;
    }

    public final b B() {
        return OutlineColor;
    }

    public final b C() {
        return SupportingColor;
    }

    public final b D() {
        return TrailingIconColor;
    }

    public final b a() {
        return CaretColor;
    }

    public final i b() {
        return ContainerShape;
    }

    public final b c() {
        return DisabledInputColor;
    }

    public final b d() {
        return DisabledLabelColor;
    }

    public final b e() {
        return DisabledLeadingIconColor;
    }

    public final b f() {
        return DisabledOutlineColor;
    }

    public final b g() {
        return DisabledSupportingColor;
    }

    public final b h() {
        return DisabledTrailingIconColor;
    }

    public final b i() {
        return ErrorFocusCaretColor;
    }

    public final b j() {
        return ErrorInputColor;
    }

    public final b k() {
        return ErrorLabelColor;
    }

    public final b l() {
        return ErrorLeadingIconColor;
    }

    public final b m() {
        return ErrorOutlineColor;
    }

    public final b n() {
        return ErrorSupportingColor;
    }

    public final b o() {
        return ErrorTrailingIconColor;
    }

    public final b p() {
        return FocusInputColor;
    }

    public final b q() {
        return FocusLabelColor;
    }

    public final b r() {
        return FocusLeadingIconColor;
    }

    public final b s() {
        return FocusOutlineColor;
    }

    public final b t() {
        return FocusSupportingColor;
    }

    public final b u() {
        return FocusTrailingIconColor;
    }

    public final b v() {
        return InputColor;
    }

    public final b w() {
        return InputPlaceholderColor;
    }

    public final b x() {
        return InputPrefixColor;
    }

    public final b y() {
        return InputSuffixColor;
    }

    public final b z() {
        return LabelColor;
    }
}
