package z80;

import android.content.res.Resources;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlinx.coroutines.flow.StateFlow;
import n90.FormFieldEntry;
import p010i90.IdentifierSpec;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: z80.f, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 22\u00020\u0001:\u0001!B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0011\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u000f0\u000e0\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010*\u001a\u00020\u001e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010(\u001a\u0004\b$\u0010)R\u001c\u0010/\u001a\u0004\u0018\u00010+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.R\u0011\u00101\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b0\u0010\u0018¨\u00063"}, d2 = {"Lz80/f;", "Li90/d0;", "Li90/g0;", "identifier", "Li90/r;", "controller", "<init>", "(Li90/g0;Li90/r;)V", "Lp4/d;", "locale", "", "h", "(Lp4/d;)Ljava/lang/String;", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lkotlin/Pair;", "Ln90/a;", "c", "()Lkotlinx/coroutines/flow/StateFlow;", "Landroid/content/res/Resources;", "resources", "g", "(Landroid/content/res/Resources;)Ljava/lang/String;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li90/g0;", "()Li90/g0;", "b", "Li90/r;", "getController", "()Li90/r;", "Z", "()Z", "allowsUserInteraction", "Lx30/c;", DateTokenConverter.CONVERTER_KEY, "Lx30/c;", "()Lx30/c;", "mandateText", "f", "infoUrl", "e", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AfterpayClearpayHeaderElement implements p010i90.d0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f127448f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final IdentifierSpec identifier;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final p010i90.r controller;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean allowsUserInteraction;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final x30.c mandateText;

    /* JADX INFO: renamed from: z80.f$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lz80/f$a;", "", "<init>", "()V", "", "a", "()Z", "", "NO_BREAK_SPACE", "Ljava/lang/String;", ImagesContract.URL, "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a() {
            return p013kotlin.collections.d1.i("GB", "ES", "FR", "IT").contains(p4.d.INSTANCE.a().c());
        }

        private Companion() {
        }
    }

    public AfterpayClearpayHeaderElement(IdentifierSpec identifier, p010i90.r rVar) {
        p013kotlin.jvm.internal.s.k(identifier, "identifier");
        this.identifier = identifier;
        this.controller = rVar;
    }

    private final String h(p4.d locale) {
        String strA = locale.a();
        Locale locale2 = Locale.ROOT;
        String lowerCase = strA.toLowerCase(locale2);
        p013kotlin.jvm.internal.s.j(lowerCase, "toLowerCase(...)");
        String upperCase = locale.c().toUpperCase(locale2);
        p013kotlin.jvm.internal.s.j(upperCase, "toUpperCase(...)");
        return lowerCase + "_" + upperCase;
    }

    @Override // p010i90.d0
    /* JADX INFO: renamed from: a, reason: from getter */
    public IdentifierSpec getIdentifier() {
        return this.identifier;
    }

    @Override // p010i90.d0
    /* JADX INFO: renamed from: b, reason: from getter */
    public boolean getAllowsUserInteraction() {
        return this.allowsUserInteraction;
    }

    @Override // p010i90.d0
    public StateFlow<List<Pair<IdentifierSpec, FormFieldEntry>>> c() {
        return r90.g.n(p013kotlin.collections.v.m());
    }

    @Override // p010i90.d0
    /* JADX INFO: renamed from: d, reason: from getter */
    public x30.c getMandateText() {
        return this.mandateText;
    }

    @Override // p010i90.d0
    public StateFlow<List<IdentifierSpec>> e() {
        return i90.d0.a.a(this);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AfterpayClearpayHeaderElement)) {
            return false;
        }
        AfterpayClearpayHeaderElement afterpayClearpayHeaderElement = (AfterpayClearpayHeaderElement) other;
        return p013kotlin.jvm.internal.s.f(this.identifier, afterpayClearpayHeaderElement.identifier) && p013kotlin.jvm.internal.s.f(this.controller, afterpayClearpayHeaderElement.controller);
    }

    public final String f() {
        String str = String.format("https://static.afterpay.com/modal/%s.html", Arrays.copyOf(new Object[]{h(p4.d.INSTANCE.a())}, 1));
        p013kotlin.jvm.internal.s.j(str, "format(...)");
        return str;
    }

    public final String g(Resources resources) {
        p013kotlin.jvm.internal.s.k(resources, "resources");
        String string = resources.getString(w80.n.f121498a);
        p013kotlin.jvm.internal.s.j(string, "getString(...)");
        return p013kotlin.text.t.V(string, "<img/>", "<img/> <b>ⓘ</b>", false, 4, null);
    }

    public int hashCode() {
        int iHashCode = this.identifier.hashCode() * 31;
        p010i90.r rVar = this.controller;
        return iHashCode + (rVar == null ? 0 : rVar.hashCode());
    }

    public String toString() {
        return "AfterpayClearpayHeaderElement(identifier=" + this.identifier + ", controller=" + this.controller + ")";
    }

    public /* synthetic */ AfterpayClearpayHeaderElement(IdentifierSpec identifierSpec, p010i90.r rVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(identifierSpec, (i11 & 2) != 0 ? null : rVar);
    }
}
