package qz;

import java.io.Serializable;
import java.text.ParseException;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f106257b = new h("sig");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f106258c = new h("enc");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f106259a;

    public h(String str) {
        if (str == null) {
            throw new IllegalArgumentException("The key use identifier must not be null");
        }
        this.f106259a = str;
    }

    public static h b(String str) throws ParseException {
        if (str == null) {
            return null;
        }
        h hVar = f106257b;
        if (str.equals(hVar.a())) {
            return hVar;
        }
        h hVar2 = f106258c;
        if (str.equals(hVar2.a())) {
            return hVar2;
        }
        if (str.trim().isEmpty()) {
            throw new ParseException("JWK use value must not be empty or blank", 0);
        }
        return new h(str);
    }

    public String a() {
        return this.f106259a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            return Objects.equals(this.f106259a, ((h) obj).f106259a);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f106259a);
    }

    public String toString() {
        return a();
    }
}
