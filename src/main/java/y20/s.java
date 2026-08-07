package y20;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.EOFException;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \"2\u00020\u0001:\u0001\u0016B1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0000\u0012\u0012\b\u0002\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001e\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001e\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u000eR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00000\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010 ¨\u0006#"}, d2 = {"Ly20/s;", "", "Lco0/b;", "type", "proxiedIdentifier", "Lkotlin/Function0;", "", "description", "<init>", "(Lco0/b;Ly20/s;Lwn0/a;)V", "Lokio/k;", "e", "()Lokio/k;", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Lco0/b;", "b", "Ly20/s;", "c", "Lwn0/a;", DateTokenConverter.CONVERTER_KEY, "Lkotlin/Lazy;", "typeName", "Lho0/i;", "Lho0/i;", "proxiedIdentifiers", "f", "wf1-workflow-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class s {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final co0.b type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final s proxiedIdentifier;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<String> description;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Lazy typeName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ho0.i<s> proxiedIdentifiers;

    /* JADX INFO: renamed from: y20.s$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Ly20/s$a;", "", "<init>", "()V", "Lokio/k;", "bytes", "Ly20/s;", "a", "(Lokio/k;)Ly20/s;", "", "NO_PROXY_IDENTIFIER_TAG", "B", "PROXY_IDENTIFIER_TAG", "wf1-workflow-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final s a(okio.k bytes) {
            s sVarA;
            p013kotlin.jvm.internal.s.k(bytes, "bytes");
            okio.h hVar = new okio.h();
            hVar.A1(bytes);
            try {
                String strB = j.b(hVar);
                byte b11 = hVar.readByte();
                if (b11 == 0) {
                    sVarA = null;
                } else {
                    if (b11 != 1) {
                        throw new IllegalArgumentException("Invalid WorkflowIdentifier");
                    }
                    sVarA = s.INSTANCE.a(hVar.m1());
                }
                return new s(vn0.a.e(Class.forName(strB)), sVarA, null, 4, null);
            } catch (EOFException unused) {
                throw new IllegalArgumentException("Invalid WorkflowIdentifier");
            }
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly20/s;", "it", "a", "(Ly20/s;)Ly20/s;"}, k = 3, mv = {1, 6, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.l<s, s> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f124728c = new b();

        b() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s invoke(s it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            return it.proxiedIdentifier;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly20/s;", "it", "", "a", "(Ly20/s;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 6, 0})
    static final class c extends p013kotlin.jvm.internal.u implements wn0.l<s, CharSequence> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f124729c = new c();

        c() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(s it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            return it.d();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "kotlin.jvm.PlatformType", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class d extends p013kotlin.jvm.internal.u implements wn0.a<String> {
        d() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return s.this.type instanceof co0.d ? vn0.a.b((co0.d) s.this.type).getName() : s.this.type.toString();
        }
    }

    public s(co0.b type, s sVar, wn0.a<String> aVar) {
        p013kotlin.jvm.internal.s.k(type, "type");
        this.type = type;
        this.proxiedIdentifier = sVar;
        this.description = aVar;
        if (!(type instanceof co0.d) && (!(type instanceof co0.q) || !(((co0.q) type).getClassifier() instanceof co0.d))) {
            throw new IllegalArgumentException(p013kotlin.jvm.internal.s.t("Expected type to be either a KClass or a KType with a KClass classifier, but was ", type).toString());
        }
        this.typeName = jn0.m.a(jn0.p.PUBLICATION, new d());
        this.proxiedIdentifiers = ho0.l.q(this, b.f124728c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String d() {
        Object value = this.typeName.getValue();
        p013kotlin.jvm.internal.s.j(value, "<get-typeName>(...)");
        return (String) value;
    }

    public final okio.k e() {
        okio.k kVar = null;
        if (!(this.type instanceof co0.d)) {
            return null;
        }
        s sVar = this.proxiedIdentifier;
        if (sVar != null) {
            okio.k kVarE = sVar.e();
            if (kVarE == null) {
                return null;
            }
            kVar = kVarE;
        }
        okio.h hVar = new okio.h();
        j.d(hVar, d());
        if (kVar != null) {
            hVar.writeByte(1);
            hVar.A1(kVar);
        } else {
            hVar.writeByte(0);
        }
        return hVar.m1();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof s)) {
            return false;
        }
        s sVar = (s) other;
        return p013kotlin.jvm.internal.s.f(this.type, sVar.type) && p013kotlin.jvm.internal.s.f(this.proxiedIdentifier, sVar.proxiedIdentifier);
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        s sVar = this.proxiedIdentifier;
        return iHashCode + (sVar == null ? 0 : sVar.hashCode());
    }

    public String toString() {
        wn0.a<String> aVar = this.description;
        String strInvoke = aVar == null ? null : aVar.invoke();
        if (strInvoke != null) {
            return strInvoke;
        }
        return "WorkflowIdentifier(" + ho0.l.R(this.proxiedIdentifiers, null, null, null, 0, null, c.f124729c, 31, null) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ s(co0.b bVar, s sVar, wn0.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, (i11 & 2) != 0 ? null : sVar, (i11 & 4) != 0 ? null : aVar);
    }
}
