package qz;

import java.io.Serializable;
import java.security.spec.ECParameterSpec;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import jz.o;
import org.bouncycastle.jcajce.spec.EdDSAParameterSpec;
import org.bouncycastle.jcajce.spec.XDHParameterSpec;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f106204d = new a("P-256", "secp256r1", "1.2.840.10045.3.1.7");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f106205e = new a("secp256k1", "secp256k1", "1.3.132.0.10");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final a f106206f = new a("P-256K", "secp256k1", "1.3.132.0.10");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f106207g = new a("P-384", "secp384r1", "1.3.132.0.34");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f106208h = new a("P-521", "secp521r1", "1.3.132.0.35");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f106209i = new a(EdDSAParameterSpec.Ed25519, EdDSAParameterSpec.Ed25519, null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f106210j = new a(EdDSAParameterSpec.Ed448, EdDSAParameterSpec.Ed448, null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f106211k = new a(XDHParameterSpec.X25519, XDHParameterSpec.X25519, null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f106212l = new a(XDHParameterSpec.X448, XDHParameterSpec.X448, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f106213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f106214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f106215c;

    public a(String str) {
        this(str, null, null);
    }

    public static a a(ECParameterSpec eCParameterSpec) {
        return c.b(eCParameterSpec);
    }

    public static Set<a> b(o oVar) {
        if (o.f84541j.equals(oVar)) {
            return Collections.singleton(f106204d);
        }
        if (o.f84542k.equals(oVar)) {
            return Collections.singleton(f106205e);
        }
        if (o.f84543l.equals(oVar)) {
            return Collections.singleton(f106207g);
        }
        if (o.f84544m.equals(oVar)) {
            return Collections.singleton(f106208h);
        }
        if (o.f84548q.equals(oVar)) {
            return Collections.unmodifiableSet(new HashSet(Arrays.asList(f106209i, f106210j)));
        }
        return null;
    }

    public static a d(String str) {
        if (str == null || str.trim().isEmpty()) {
            throw new IllegalArgumentException("The cryptographic curve string must not be null or empty");
        }
        a aVar = f106204d;
        if (str.equals(aVar.getName())) {
            return aVar;
        }
        a aVar2 = f106206f;
        if (str.equals(aVar2.getName())) {
            return aVar2;
        }
        a aVar3 = f106205e;
        if (str.equals(aVar3.getName())) {
            return aVar3;
        }
        a aVar4 = f106207g;
        if (str.equals(aVar4.getName())) {
            return aVar4;
        }
        a aVar5 = f106208h;
        if (str.equals(aVar5.getName())) {
            return aVar5;
        }
        a aVar6 = f106209i;
        if (str.equals(aVar6.getName())) {
            return aVar6;
        }
        a aVar7 = f106210j;
        if (str.equals(aVar7.getName())) {
            return aVar7;
        }
        a aVar8 = f106211k;
        if (str.equals(aVar8.getName())) {
            return aVar8;
        }
        a aVar9 = f106212l;
        return str.equals(aVar9.getName()) ? aVar9 : new a(str);
    }

    public String c() {
        return this.f106214b;
    }

    public ECParameterSpec e() {
        return c.a(this);
    }

    public boolean equals(Object obj) {
        return (obj instanceof a) && toString().equals(obj.toString());
    }

    public String getName() {
        return this.f106213a;
    }

    public int hashCode() {
        return Objects.hash(getName());
    }

    public String toString() {
        return getName();
    }

    public a(String str, String str2, String str3) {
        if (str == null) {
            throw new IllegalArgumentException("The JOSE cryptographic curve name must not be null");
        }
        this.f106213a = str;
        this.f106214b = str2;
        this.f106215c = str3;
    }
}
