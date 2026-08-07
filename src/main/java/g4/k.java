package g4;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import i4.TextLayoutResult;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R5\u0010\u000e\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR)\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR)\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\rR5\u0010\u001a\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\t0\u00160\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0019\u0010\rR9\u0010\u001f\u001a$\u0012 \u0012\u001e\b\u0001\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00160\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u001e\u0010\rR/\u0010#\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u000b\u001a\u0004\b\"\u0010\rR2\u0010'\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010\u000b\u001a\u0004\b&\u0010\rR/\u0010)\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b(\u0010\rR;\u0010-\u001a&\u0012\"\u0012 \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0*0\u00050\u00048\u0006¢\u0006\f\n\u0004\b+\u0010\u000b\u001a\u0004\b,\u0010\rR/\u0010/\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b.\u0010\rR/\u00102\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b0\u0010\u000b\u001a\u0004\b1\u0010\rR/\u00104\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b3\u0010\rR)\u00107\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b5\u0010\u000b\u001a\u0004\b6\u0010\rR/\u00109\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b8\u0010\u000b\u001a\u0004\b+\u0010\rR)\u0010;\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b:\u0010\u000b\u001a\u0004\b0\u0010\rR2\u0010?\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b<\u0010\u000b\u0012\u0004\b>\u0010\u0003\u001a\u0004\b=\u0010\rR)\u0010A\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b@\u0010\u000b\u001a\u0004\b\u0010\u0010\rR)\u0010C\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\bB\u0010\u000b\u001a\u0004\b\u0018\u0010\rR)\u0010D\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b@\u0010\rR)\u0010E\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u000b\u001a\u0004\b!\u0010\rR)\u0010F\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u000b\u001a\u0004\b\n\u0010\rR)\u0010G\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b(\u0010\u000b\u001a\u0004\b\u001d\u0010\rR)\u0010H\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b,\u0010\u000b\u001a\u0004\bB\u0010\rR#\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0I0\u00048\u0006¢\u0006\f\n\u0004\b.\u0010\u000b\u001a\u0004\b\u0013\u0010\rR)\u0010L\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b1\u0010\u000b\u001a\u0004\b<\u0010\rR)\u0010M\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b3\u0010\u000b\u001a\u0004\b8\u0010\rR)\u0010O\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\bN\u0010\u000b\u001a\u0004\b5\u0010\rR)\u0010Q\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\bP\u0010\u000b\u001a\u0004\b:\u0010\rR5\u0010S\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0007\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\bR\u0010\u000b\u001a\u0004\b%\u0010\r¨\u0006T"}, d2 = {"Lg4/k;", "", "<init>", "()V", "Lg4/x;", "Lg4/a;", "Lkotlin/Function1;", "", "Li4/m0;", "", "b", "Lg4/x;", IntegerTokenConverter.CONVERTER_KEY, "()Lg4/x;", "GetTextLayoutResult", "Lkotlin/Function0;", "c", "k", "OnClick", DateTokenConverter.CONVERTER_KEY, "m", "OnLongClick", "Lkotlin/Function2;", "", "e", "t", "ScrollBy", "Lj3/g;", "Lkotlin/coroutines/Continuation;", "f", "u", "ScrollByOffset", "", "g", "v", "ScrollToIndex", "Li4/d;", "h", "getOnAutofillText$ui_release", "OnAutofillText", "w", "SetProgress", "Lkotlin/Function3;", "j", "x", "SetSelection", "y", "SetText", "l", "z", "SetTextSubstitution", "A", "ShowTextSubstitution", "n", "a", "ClearTextSubstitution", "o", "InsertTextAtCursor", "p", "OnImeAction", "q", "getPerformImeAction", "getPerformImeAction$annotations", "PerformImeAction", "r", "CopyText", "s", "CutText", "PasteText", "Expand", "Collapse", "Dismiss", "RequestFocus", "", "Lg4/e;", "CustomActions", "PageUp", "PageLeft", "B", "PageDown", "C", "PageRight", "D", "GetScrollViewportLength", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private static final x<AccessibilityAction<wn0.a<Boolean>>> PageLeft;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private static final x<AccessibilityAction<wn0.a<Boolean>>> PageDown;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private static final x<AccessibilityAction<wn0.a<Boolean>>> PageRight;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private static final x<AccessibilityAction<wn0.l<List<Float>, Boolean>>> GetScrollViewportLength;
    public static final int E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f67225a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final x<AccessibilityAction<wn0.l<List<TextLayoutResult>, Boolean>>> GetTextLayoutResult;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final x<AccessibilityAction<wn0.a<Boolean>>> OnClick;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final x<AccessibilityAction<wn0.a<Boolean>>> OnLongClick;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final x<AccessibilityAction<wn0.p<Float, Float, Boolean>>> ScrollBy;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final x<wn0.p<j3.g, Continuation<? super j3.g>, Object>> ScrollByOffset;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final x<AccessibilityAction<wn0.l<Integer, Boolean>>> ScrollToIndex;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final x<AccessibilityAction<wn0.l<i4.d, Boolean>>> OnAutofillText;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final x<AccessibilityAction<wn0.l<Float, Boolean>>> SetProgress;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final x<AccessibilityAction<wn0.q<Integer, Integer, Boolean, Boolean>>> SetSelection;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final x<AccessibilityAction<wn0.l<i4.d, Boolean>>> SetText;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final x<AccessibilityAction<wn0.l<i4.d, Boolean>>> SetTextSubstitution;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static final x<AccessibilityAction<wn0.l<Boolean, Boolean>>> ShowTextSubstitution;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private static final x<AccessibilityAction<wn0.a<Boolean>>> ClearTextSubstitution;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private static final x<AccessibilityAction<wn0.l<i4.d, Boolean>>> InsertTextAtCursor;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private static final x<AccessibilityAction<wn0.a<Boolean>>> OnImeAction;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private static final x<AccessibilityAction<wn0.a<Boolean>>> PerformImeAction;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private static final x<AccessibilityAction<wn0.a<Boolean>>> CopyText;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private static final x<AccessibilityAction<wn0.a<Boolean>>> CutText;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final x<AccessibilityAction<wn0.a<Boolean>>> PasteText;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private static final x<AccessibilityAction<wn0.a<Boolean>>> Expand;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private static final x<AccessibilityAction<wn0.a<Boolean>>> Collapse;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private static final x<AccessibilityAction<wn0.a<Boolean>>> Dismiss;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private static final x<AccessibilityAction<wn0.a<Boolean>>> RequestFocus;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private static final x<List<CustomAccessibilityAction>> CustomActions;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private static final x<AccessibilityAction<wn0.a<Boolean>>> PageUp;

    static {
        u uVar = u.f67312c;
        GetTextLayoutResult = v.b("GetTextLayoutResult", uVar);
        OnClick = v.b("OnClick", uVar);
        OnLongClick = v.b("OnLongClick", uVar);
        ScrollBy = v.b("ScrollBy", uVar);
        ScrollByOffset = new x<>("ScrollByOffset", null, 2, null);
        ScrollToIndex = v.b("ScrollToIndex", uVar);
        OnAutofillText = v.b("OnAutofillText", uVar);
        SetProgress = v.b("SetProgress", uVar);
        SetSelection = v.b("SetSelection", uVar);
        SetText = v.b("SetText", uVar);
        SetTextSubstitution = v.b("SetTextSubstitution", uVar);
        ShowTextSubstitution = v.b("ShowTextSubstitution", uVar);
        ClearTextSubstitution = v.b("ClearTextSubstitution", uVar);
        InsertTextAtCursor = v.b("InsertTextAtCursor", uVar);
        OnImeAction = v.b("PerformImeAction", uVar);
        PerformImeAction = v.b("PerformImeAction", uVar);
        CopyText = v.b("CopyText", uVar);
        CutText = v.b("CutText", uVar);
        PasteText = v.b("PasteText", uVar);
        Expand = v.b("Expand", uVar);
        Collapse = v.b("Collapse", uVar);
        Dismiss = v.b("Dismiss", uVar);
        RequestFocus = v.b("RequestFocus", uVar);
        CustomActions = v.a("CustomActions");
        PageUp = v.b("PageUp", uVar);
        PageLeft = v.b("PageLeft", uVar);
        PageDown = v.b("PageDown", uVar);
        PageRight = v.b("PageRight", uVar);
        GetScrollViewportLength = v.b("GetScrollViewportLength", uVar);
        E = 8;
    }

    private k() {
    }

    public final x<AccessibilityAction<wn0.l<Boolean, Boolean>>> A() {
        return ShowTextSubstitution;
    }

    public final x<AccessibilityAction<wn0.a<Boolean>>> a() {
        return ClearTextSubstitution;
    }

    public final x<AccessibilityAction<wn0.a<Boolean>>> b() {
        return Collapse;
    }

    public final x<AccessibilityAction<wn0.a<Boolean>>> c() {
        return CopyText;
    }

    public final x<List<CustomAccessibilityAction>> d() {
        return CustomActions;
    }

    public final x<AccessibilityAction<wn0.a<Boolean>>> e() {
        return CutText;
    }

    public final x<AccessibilityAction<wn0.a<Boolean>>> f() {
        return Dismiss;
    }

    public final x<AccessibilityAction<wn0.a<Boolean>>> g() {
        return Expand;
    }

    public final x<AccessibilityAction<wn0.l<List<Float>, Boolean>>> h() {
        return GetScrollViewportLength;
    }

    public final x<AccessibilityAction<wn0.l<List<TextLayoutResult>, Boolean>>> i() {
        return GetTextLayoutResult;
    }

    public final x<AccessibilityAction<wn0.l<i4.d, Boolean>>> j() {
        return InsertTextAtCursor;
    }

    public final x<AccessibilityAction<wn0.a<Boolean>>> k() {
        return OnClick;
    }

    public final x<AccessibilityAction<wn0.a<Boolean>>> l() {
        return OnImeAction;
    }

    public final x<AccessibilityAction<wn0.a<Boolean>>> m() {
        return OnLongClick;
    }

    public final x<AccessibilityAction<wn0.a<Boolean>>> n() {
        return PageDown;
    }

    public final x<AccessibilityAction<wn0.a<Boolean>>> o() {
        return PageLeft;
    }

    public final x<AccessibilityAction<wn0.a<Boolean>>> p() {
        return PageRight;
    }

    public final x<AccessibilityAction<wn0.a<Boolean>>> q() {
        return PageUp;
    }

    public final x<AccessibilityAction<wn0.a<Boolean>>> r() {
        return PasteText;
    }

    public final x<AccessibilityAction<wn0.a<Boolean>>> s() {
        return RequestFocus;
    }

    public final x<AccessibilityAction<wn0.p<Float, Float, Boolean>>> t() {
        return ScrollBy;
    }

    public final x<wn0.p<j3.g, Continuation<? super j3.g>, Object>> u() {
        return ScrollByOffset;
    }

    public final x<AccessibilityAction<wn0.l<Integer, Boolean>>> v() {
        return ScrollToIndex;
    }

    public final x<AccessibilityAction<wn0.l<Float, Boolean>>> w() {
        return SetProgress;
    }

    public final x<AccessibilityAction<wn0.q<Integer, Integer, Boolean, Boolean>>> x() {
        return SetSelection;
    }

    public final x<AccessibilityAction<wn0.l<i4.d, Boolean>>> y() {
        return SetText;
    }

    public final x<AccessibilityAction<wn0.l<i4.d, Boolean>>> z() {
        return SetTextSubstitution;
    }
}
