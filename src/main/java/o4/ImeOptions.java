package o4;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p4.LocaleList;

/* JADX INFO: renamed from: o4.s, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001\u001aBO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001d\u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u0016R\u001d\u0010\n\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b#\u0010\u0016R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b!\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006)"}, d2 = {"Lo4/s;", "", "", "singleLine", "Lo4/x;", "capitalization", "autoCorrect", "Lo4/y;", "keyboardType", "Lo4/r;", "imeAction", "Lo4/i0;", "platformImeOptions", "Lp4/e;", "hintLocales", "<init>", "(ZIZIILo4/i0;Lp4/e;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Z", "h", "()Z", "b", "I", "c", DateTokenConverter.CONVERTER_KEY, "f", "e", "Lp4/e;", "()Lp4/e;", "Lo4/i0;", "g", "()Lo4/i0;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ImeOptions {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final ImeOptions f96473h = new ImeOptions(false, 0, false, 0, 0, null, null, 127, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean singleLine;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int capitalization;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean autoCorrect;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int keyboardType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final int imeAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocaleList hintLocales;

    /* JADX INFO: renamed from: o4.s$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lo4/s$a;", "", "<init>", "()V", "Lo4/s;", "Default", "Lo4/s;", "a", "()Lo4/s;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ImeOptions a() {
            return ImeOptions.f96473h;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ImeOptions(boolean z11, int i11, boolean z12, int i12, int i13, i0 i0Var, LocaleList localeList, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, i11, z12, i12, i13, i0Var, localeList);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getAutoCorrect() {
        return this.autoCorrect;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getCapitalization() {
        return this.capitalization;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final LocaleList getHintLocales() {
        return this.hintLocales;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getImeAction() {
        return this.imeAction;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImeOptions)) {
            return false;
        }
        ImeOptions imeOptions = (ImeOptions) other;
        return this.singleLine == imeOptions.singleLine && x.i(this.capitalization, imeOptions.capitalization) && this.autoCorrect == imeOptions.autoCorrect && y.n(this.keyboardType, imeOptions.keyboardType) && r.m(this.imeAction, imeOptions.imeAction) && p013kotlin.jvm.internal.s.f(null, null) && p013kotlin.jvm.internal.s.f(this.hintLocales, imeOptions.hintLocales);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getKeyboardType() {
        return this.keyboardType;
    }

    public final i0 g() {
        return null;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getSingleLine() {
        return this.singleLine;
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.singleLine) * 31) + x.j(this.capitalization)) * 31) + Boolean.hashCode(this.autoCorrect)) * 31) + y.o(this.keyboardType)) * 31) + r.n(this.imeAction)) * 961) + this.hintLocales.hashCode();
    }

    public String toString() {
        return "ImeOptions(singleLine=" + this.singleLine + ", capitalization=" + ((Object) x.k(this.capitalization)) + ", autoCorrect=" + this.autoCorrect + ", keyboardType=" + ((Object) y.p(this.keyboardType)) + ", imeAction=" + ((Object) r.o(this.imeAction)) + ", platformImeOptions=" + ((Object) null) + ", hintLocales=" + this.hintLocales + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    private ImeOptions(boolean z11, int i11, boolean z12, int i12, int i13, i0 i0Var, LocaleList localeList) {
        this.singleLine = z11;
        this.capitalization = i11;
        this.autoCorrect = z12;
        this.keyboardType = i12;
        this.imeAction = i13;
        this.hintLocales = localeList;
    }

    public /* synthetic */ ImeOptions(boolean z11, int i11, boolean z12, int i12, int i13, i0 i0Var, LocaleList localeList, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? false : z11, (i14 & 2) != 0 ? x.INSTANCE.b() : i11, (i14 & 4) != 0 ? true : z12, (i14 & 8) != 0 ? y.INSTANCE.h() : i12, (i14 & 16) != 0 ? r.INSTANCE.a() : i13, (i14 & 32) != 0 ? null : i0Var, (i14 & 64) != 0 ? LocaleList.INSTANCE.b() : localeList, null);
    }
}
