package qz;

import java.text.ParseException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public enum f {
    SIGN("sign"),
    VERIFY("verify"),
    ENCRYPT("encrypt"),
    DECRYPT("decrypt"),
    WRAP_KEY("wrapKey"),
    UNWRAP_KEY("unwrapKey"),
    DERIVE_KEY("deriveKey"),
    DERIVE_BITS("deriveBits");

    private final String identifier;

    f(String str) {
        if (str == null) {
            throw new IllegalArgumentException("The key operation identifier must not be null");
        }
        this.identifier = str;
    }

    public static Set<f> parse(List<String> list) throws ParseException {
        f fVar;
        if (list == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : list) {
            if (str != null) {
                f[] fVarArrValues = values();
                int length = fVarArrValues.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        fVar = null;
                        break;
                    }
                    fVar = fVarArrValues[i11];
                    if (str.equals(fVar.identifier())) {
                        break;
                    }
                    i11++;
                }
                if (fVar == null) {
                    throw new ParseException("Invalid JWK operation: " + str, 0);
                }
                linkedHashSet.add(fVar);
            }
        }
        return linkedHashSet;
    }

    public String identifier() {
        return this.identifier;
    }

    @Override // java.lang.Enum
    public String toString() {
        return identifier();
    }
}
