package p010i90;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import x30.c;

/* JADX INFO: renamed from: i90.k, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\u00108\u0016X\u0096D¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0013\u0010\u001dR\u001c\u0010#\u001a\u0004\u0018\u00010\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001b\u0010\"¨\u0006$"}, d2 = {"Li90/k;", "Li90/n1;", "Li90/g0;", "identifier", "Li90/y;", "controller", "<init>", "(Li90/g0;Li90/y;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Li90/g0;", "a", "()Li90/g0;", "c", "Li90/y;", "j", "()Li90/y;", DateTokenConverter.CONVERTER_KEY, "Z", "()Z", "allowsUserInteraction", "Lx30/c;", "e", "Lx30/c;", "()Lx30/c;", "mandateText", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AdministrativeAreaElement extends n1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final IdentifierSpec identifier;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final y controller;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean allowsUserInteraction;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final c mandateText;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdministrativeAreaElement(IdentifierSpec identifier, y controller) {
        super(identifier);
        s.k(identifier, "identifier");
        s.k(controller, "controller");
        this.identifier = identifier;
        this.controller = controller;
        this.allowsUserInteraction = true;
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
    public c getMandateText() {
        return this.mandateText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdministrativeAreaElement)) {
            return false;
        }
        AdministrativeAreaElement administrativeAreaElement = (AdministrativeAreaElement) other;
        return s.f(this.identifier, administrativeAreaElement.identifier) && s.f(this.controller, administrativeAreaElement.controller);
    }

    public int hashCode() {
        return (this.identifier.hashCode() * 31) + this.controller.hashCode();
    }

    @Override // p010i90.n1
    /* JADX INFO: renamed from: j, reason: from getter and merged with bridge method [inline-methods] */
    public y i() {
        return this.controller;
    }

    public String toString() {
        return "AdministrativeAreaElement(identifier=" + this.identifier + ", controller=" + this.controller + ")";
    }
}
