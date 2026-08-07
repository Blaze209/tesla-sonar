package z80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p010i90.IdentifierSpec;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: z80.w0, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\"\u001a\u00020\u00118\u0016X\u0096D¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0014\u0010!R\u001c\u0010'\u001a\u0004\u0018\u00010#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u001b\u0010&¨\u0006("}, d2 = {"Lz80/w0;", "Li90/n1;", "Li90/g0;", "identifier", "", "initialValue", "Li90/v1;", "controller", "<init>", "(Li90/g0;Ljava/lang/String;Li90/v1;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Li90/g0;", "a", "()Li90/g0;", "c", "Ljava/lang/String;", "getInitialValue", DateTokenConverter.CONVERTER_KEY, "Li90/v1;", "j", "()Li90/v1;", "e", "Z", "()Z", "allowsUserInteraction", "Lx30/c;", "f", "Lx30/c;", "()Lx30/c;", "mandateText", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class EmailElement extends p010i90.n1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final IdentifierSpec identifier;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String initialValue;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final p010i90.v1 controller;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean allowsUserInteraction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final x30.c mandateText;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ EmailElement(IdentifierSpec identifierSpec, String str, p010i90.v1 v1Var, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        identifierSpec = (i11 & 1) != 0 ? IdentifierSpec.INSTANCE.n() : identifierSpec;
        String str2 = (i11 & 2) != 0 ? "" : str;
        this(identifierSpec, str2, (i11 & 4) != 0 ? new p010i90.r1(new p010i90.a0(0, 1, null), false, str2, 2, null) : v1Var);
    }

    @Override // p010i90.n1, p010i90.j1
    /* JADX INFO: renamed from: a, reason: from getter */
    public IdentifierSpec getIdentifier() {
        return this.identifier;
    }

    @Override // p010i90.j1
    /* JADX INFO: renamed from: b, reason: from getter */
    public boolean getAllowsUserInteraction() {
        return this.allowsUserInteraction;
    }

    @Override // p010i90.j1
    /* JADX INFO: renamed from: d, reason: from getter */
    public x30.c getMandateText() {
        return this.mandateText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmailElement)) {
            return false;
        }
        EmailElement emailElement = (EmailElement) other;
        return p013kotlin.jvm.internal.s.f(this.identifier, emailElement.identifier) && p013kotlin.jvm.internal.s.f(this.initialValue, emailElement.initialValue) && p013kotlin.jvm.internal.s.f(this.controller, emailElement.controller);
    }

    public int hashCode() {
        int iHashCode = this.identifier.hashCode() * 31;
        String str = this.initialValue;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.controller.hashCode();
    }

    @Override // p010i90.n1
    /* JADX INFO: renamed from: j, reason: from getter */
    public p010i90.v1 getController() {
        return this.controller;
    }

    public String toString() {
        return "EmailElement(identifier=" + this.identifier + ", initialValue=" + this.initialValue + ", controller=" + this.controller + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailElement(IdentifierSpec identifier, String str, p010i90.v1 controller) {
        super(identifier);
        p013kotlin.jvm.internal.s.k(identifier, "identifier");
        p013kotlin.jvm.internal.s.k(controller, "controller");
        this.identifier = identifier;
        this.initialValue = str;
        this.controller = controller;
        this.allowsUserInteraction = true;
    }
}
