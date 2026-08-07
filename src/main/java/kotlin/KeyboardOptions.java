package kotlin;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.e;
import o4.ImeOptions;
import o4.i0;
import o4.r;
import o4.x;
import o4.y;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p4.LocaleList;

/* JADX INFO: renamed from: b2.a0, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@p013kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001!BU\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010BS\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0012B1\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0014\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010\u001dR\u001d\u0010\t\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b*\u0010\"\u001a\u0004\b+\u0010\u001dR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b-\u0010'R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0014\u00103\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u00102R\u001a\u00104\u001a\u00020\u00028BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b(\u0010\u001dR\u001a\u00105\u001a\u00020\u00068BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b.\u0010\u001dR\u0014\u00106\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u00101R\u001a\u00107\u001a\u00020\b8@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b,\u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00068"}, d2 = {"Lb2/a0;", "", "Lo4/x;", "capitalization", "", "autoCorrectEnabled", "Lo4/y;", "keyboardType", "Lo4/r;", "imeAction", "Lo4/i0;", "platformImeOptions", "showKeyboardOnFocus", "Lp4/e;", "hintLocales", "<init>", "(ILjava/lang/Boolean;IILo4/i0;Ljava/lang/Boolean;Lp4/e;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "autoCorrect", "(IZIILo4/i0;Ljava/lang/Boolean;Lp4/e;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(IZIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "singleLine", "Lo4/s;", "g", "(Z)Lo4/s;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "I", "getCapitalization-IUNYP9k", "b", "Ljava/lang/Boolean;", "getAutoCorrectEnabled", "()Ljava/lang/Boolean;", "c", "getKeyboardType-PjHm6EE", DateTokenConverter.CONVERTER_KEY, "getImeAction-eUduSuo", "e", "getShowKeyboardOnFocus", "f", "Lp4/e;", "getHintLocales", "()Lp4/e;", "()Z", "autoCorrectOrDefault", "capitalizationOrDefault", "keyboardTypeOrDefault", "hintLocalesOrDefault", "imeActionOrDefault", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class KeyboardOptions {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final KeyboardOptions f15323h = new KeyboardOptions(0, (Boolean) null, 0, 0, (i0) null, (Boolean) null, (LocaleList) null, 127, (DefaultConstructorMarker) null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final KeyboardOptions f15324i = new KeyboardOptions(0, Boolean.FALSE, y.INSTANCE.f(), 0, (i0) (0 == true ? 1 : 0), (Boolean) (0 == true ? 1 : 0), (LocaleList) null, 121, (DefaultConstructorMarker) null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int capitalization;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean autoCorrectEnabled;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int keyboardType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int imeAction;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean showKeyboardOnFocus;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocaleList hintLocales;

    /* JADX INFO: renamed from: b2.a0$a, reason: from kotlin metadata */
    @p013kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lb2/a0$a;", "", "<init>", "()V", "Lb2/a0;", "Default", "Lb2/a0;", "a", "()Lb2/a0;", "getDefault$annotations", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KeyboardOptions a() {
            return KeyboardOptions.f15323h;
        }

        private Companion() {
        }
    }

    public /* synthetic */ KeyboardOptions(int i11, Boolean bool, int i12, int i13, i0 i0Var, Boolean bool2, LocaleList localeList, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, bool, i12, i13, i0Var, bool2, localeList);
    }

    private final boolean b() {
        Boolean bool = this.autoCorrectEnabled;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private final int c() {
        x xVarF = x.f(this.capitalization);
        int value = xVarF.getValue();
        x.Companion companion = x.INSTANCE;
        if (x.i(value, companion.d())) {
            xVarF = null;
        }
        return xVarF != null ? xVarF.getValue() : companion.b();
    }

    private final LocaleList d() {
        LocaleList localeList = this.hintLocales;
        return localeList == null ? LocaleList.INSTANCE.b() : localeList;
    }

    private final int f() {
        y yVarK = y.k(this.keyboardType);
        int value = yVarK.getValue();
        y.Companion companion = y.INSTANCE;
        if (y.n(value, companion.i())) {
            yVarK = null;
        }
        return yVarK != null ? yVarK.getValue() : companion.h();
    }

    public final int e() {
        r rVarJ = r.j(this.imeAction);
        int value = rVarJ.getValue();
        r.Companion companion = r.INSTANCE;
        if (r.m(value, companion.i())) {
            rVarJ = null;
        }
        return rVarJ != null ? rVarJ.getValue() : companion.a();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KeyboardOptions)) {
            return false;
        }
        KeyboardOptions keyboardOptions = (KeyboardOptions) other;
        return x.i(this.capitalization, keyboardOptions.capitalization) && s.f(this.autoCorrectEnabled, keyboardOptions.autoCorrectEnabled) && y.n(this.keyboardType, keyboardOptions.keyboardType) && r.m(this.imeAction, keyboardOptions.imeAction) && s.f(null, null) && s.f(this.showKeyboardOnFocus, keyboardOptions.showKeyboardOnFocus) && s.f(this.hintLocales, keyboardOptions.hintLocales);
    }

    public final ImeOptions g(boolean singleLine) {
        return new ImeOptions(singleLine, c(), b(), f(), e(), null, d(), null);
    }

    public int hashCode() {
        int iJ = x.j(this.capitalization) * 31;
        Boolean bool = this.autoCorrectEnabled;
        int iHashCode = (((((iJ + (bool != null ? bool.hashCode() : 0)) * 31) + y.o(this.keyboardType)) * 31) + r.n(this.imeAction)) * 961;
        Boolean bool2 = this.showKeyboardOnFocus;
        int iHashCode2 = (iHashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        LocaleList localeList = this.hintLocales;
        return iHashCode2 + (localeList != null ? localeList.hashCode() : 0);
    }

    public String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) x.k(this.capitalization)) + ", autoCorrectEnabled=" + this.autoCorrectEnabled + ", keyboardType=" + ((Object) y.p(this.keyboardType)) + ", imeAction=" + ((Object) r.o(this.imeAction)) + ", platformImeOptions=" + ((Object) null) + "showKeyboardOnFocus=" + this.showKeyboardOnFocus + ", hintLocales=" + this.hintLocales + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @e
    public /* synthetic */ KeyboardOptions(int i11, boolean z11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, z11, i12, i13);
    }

    @e
    public /* synthetic */ KeyboardOptions(int i11, boolean z11, int i12, int i13, i0 i0Var, Boolean bool, LocaleList localeList, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, z11, i12, i13, i0Var, bool, localeList);
    }

    private KeyboardOptions(int i11, Boolean bool, int i12, int i13, i0 i0Var, Boolean bool2, LocaleList localeList) {
        this.capitalization = i11;
        this.autoCorrectEnabled = bool;
        this.keyboardType = i12;
        this.imeAction = i13;
        this.showKeyboardOnFocus = bool2;
        this.hintLocales = localeList;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ KeyboardOptions(int i11, Boolean bool, int i12, int i13, i0 i0Var, Boolean bool2, LocaleList localeList, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        int iD = (i14 & 1) != 0 ? x.INSTANCE.d() : i11;
        Boolean bool3 = (i14 & 2) != 0 ? null : bool;
        int i15 = (i14 & 4) != 0 ? y.INSTANCE.i() : i12;
        int i16 = (i14 & 8) != 0 ? r.INSTANCE.i() : i13;
        i0 i0Var2 = (i14 & 16) != 0 ? null : i0Var;
        Boolean bool4 = (i14 & 32) != 0 ? null : bool2;
        this(iD, bool3, i15, i16, i0Var2, bool4, (i14 & 64) == 0 ? localeList : null, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ KeyboardOptions(int i11, boolean z11, int i12, int i13, i0 i0Var, Boolean bool, LocaleList localeList, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? x.INSTANCE.d() : i11, z11, (i14 & 4) != 0 ? y.INSTANCE.i() : i12, (i14 & 8) != 0 ? r.INSTANCE.i() : i13, (i14 & 16) != 0 ? null : i0Var, (i14 & 32) != 0 ? null : bool, (i14 & 64) != 0 ? null : localeList, (DefaultConstructorMarker) null);
    }

    private KeyboardOptions(int i11, boolean z11, int i12, int i13, i0 i0Var, Boolean bool, LocaleList localeList) {
        this(i11, Boolean.valueOf(z11), i12, i13, i0Var, bool, localeList, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ KeyboardOptions(int i11, boolean z11, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? x.INSTANCE.d() : i11, (i14 & 2) != 0 ? f15323h.b() : z11, (i14 & 4) != 0 ? y.INSTANCE.i() : i12, (i14 & 8) != 0 ? r.INSTANCE.a() : i13, null);
    }

    private KeyboardOptions(int i11, boolean z11, int i12, int i13) {
        this(i11, Boolean.valueOf(z11), i12, i13, (i0) null, (Boolean) null, (LocaleList) null, 96, (DefaultConstructorMarker) null);
    }
}
