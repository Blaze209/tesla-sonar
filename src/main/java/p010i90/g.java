package p010i90;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.a;
import x30.c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Li90/g;", "Li90/n1;", "Li90/g0;", "identifier", "Li90/u1;", "config", "Lkotlin/Function0;", "Ljn0/h0;", "onNavigation", "<init>", "(Li90/g0;Li90/u1;Lwn0/a;)V", "b", "Li90/g0;", "a", "()Li90/g0;", "", "c", "Z", "()Z", "allowsUserInteraction", "Lx30/c;", DateTokenConverter.CONVERTER_KEY, "Lx30/c;", "()Lx30/c;", "mandateText", "Li90/f;", "e", "Li90/f;", "j", "()Li90/f;", "controller", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class g extends n1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final IdentifierSpec identifier;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean allowsUserInteraction;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final c mandateText;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final f controller;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(IdentifierSpec identifier, u1 config, a<h0> aVar) {
        super(identifier);
        s.k(identifier, "identifier");
        s.k(config, "config");
        this.identifier = identifier;
        this.allowsUserInteraction = true;
        this.controller = new f(config, aVar, null, 4, null);
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

    @Override // p010i90.n1
    /* JADX INFO: renamed from: j, reason: from getter and merged with bridge method [inline-methods] */
    public f i() {
        return this.controller;
    }
}
