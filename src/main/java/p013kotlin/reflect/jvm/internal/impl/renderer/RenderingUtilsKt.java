package p013kotlin.reflect.jvm.internal.impl.renderer;

import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.core.CoreConstants;
import java.util.List;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes9.dex */
public final class RenderingUtilsKt {
    private static final boolean a(Name name) {
        String strAsString = name.asString();
        s.j(strAsString, "asString(...)");
        if (KeywordStringsGenerated.KEYWORDS.contains(strAsString)) {
            return true;
        }
        for (int i11 = 0; i11 < strAsString.length(); i11++) {
            char cCharAt = strAsString.charAt(i11);
            if (!Character.isLetterOrDigit(cCharAt) && cCharAt != '_') {
                return true;
            }
        }
        return strAsString.length() == 0 || !Character.isJavaIdentifierStart(strAsString.codePointAt(0));
    }

    public static final String render(Name name) {
        s.k(name, "<this>");
        if (!a(name)) {
            String strAsString = name.asString();
            s.j(strAsString, "asString(...)");
            return strAsString;
        }
        StringBuilder sb2 = new StringBuilder();
        String strAsString2 = name.asString();
        s.j(strAsString2, "asString(...)");
        sb2.append('`' + strAsString2);
        sb2.append('`');
        return sb2.toString();
    }

    public static final String renderFqName(List<Name> pathSegments) {
        s.k(pathSegments, "pathSegments");
        StringBuilder sb2 = new StringBuilder();
        for (Name name : pathSegments) {
            if (sb2.length() > 0) {
                sb2.append(".");
            }
            sb2.append(render(name));
        }
        String string = sb2.toString();
        s.j(string, "toString(...)");
        return string;
    }

    public static final String replacePrefixesInTypeRepresentations(String lowerRendered, String lowerPrefix, String upperRendered, String upperPrefix, String foldedPrefix) {
        s.k(lowerRendered, "lowerRendered");
        s.k(lowerPrefix, "lowerPrefix");
        s.k(upperRendered, "upperRendered");
        s.k(upperPrefix, "upperPrefix");
        s.k(foldedPrefix, "foldedPrefix");
        if (t.b0(lowerRendered, lowerPrefix, false, 2, null) && t.b0(upperRendered, upperPrefix, false, 2, null)) {
            String strSubstring = lowerRendered.substring(lowerPrefix.length());
            s.j(strSubstring, "substring(...)");
            String strSubstring2 = upperRendered.substring(upperPrefix.length());
            s.j(strSubstring2, "substring(...)");
            String str = foldedPrefix + strSubstring;
            if (s.f(strSubstring, strSubstring2)) {
                return str;
            }
            if (typeStringsDifferOnlyInNullability(strSubstring, strSubstring2)) {
                return str + '!';
            }
        }
        return null;
    }

    public static final boolean typeStringsDifferOnlyInNullability(String lower, String upper) {
        s.k(lower, "lower");
        s.k(upper, "upper");
        if (s.f(lower, t.V(upper, CallerData.NA, "", false, 4, null))) {
            return true;
        }
        if (t.L(upper, CallerData.NA, false, 2, null)) {
            if (s.f(lower + '?', upper)) {
                return true;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
        sb2.append(lower);
        sb2.append(")?");
        return s.f(sb2.toString(), upper);
    }

    public static final String render(FqNameUnsafe fqNameUnsafe) {
        s.k(fqNameUnsafe, "<this>");
        List<Name> listPathSegments = fqNameUnsafe.pathSegments();
        s.j(listPathSegments, "pathSegments(...)");
        return renderFqName(listPathSegments);
    }
}
