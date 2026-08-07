package nf;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\f\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0016\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u000bR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0010R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\r8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0010\u001a\u0004\b\n\u0010\u001a¨\u0006\u001c"}, d2 = {"Lnf/i;", "", "<init>", "()V", "", "inputString", "a", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "b", "Ljava/util/regex/Pattern;", "CPF_PATTERN", "", "", "c", "Ljava/util/List;", "CPF_MASK_GROUPING", "", DateTokenConverter.CONVERTER_KEY, "CPF_MASK_SEPARATORS", "e", "CNPJ_PATTERN", "f", "CNPJ_MASK_GROUPING", "g", "()Ljava/util/List;", "CNPJ_MASK_SEPARATORS", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f94914a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Pattern CPF_PATTERN = Pattern.compile("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}");

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final List<Integer> CPF_MASK_GROUPING = v.p(3, 3, 3, 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final List<Character> CPF_MASK_SEPARATORS;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final Pattern CNPJ_PATTERN;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final List<Integer> CNPJ_MASK_GROUPING;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final List<Character> CNPJ_MASK_SEPARATORS;

    static {
        Character chValueOf = Character.valueOf(CoreConstants.DOT);
        Character chValueOf2 = Character.valueOf(CoreConstants.DASH_CHAR);
        CPF_MASK_SEPARATORS = v.p(chValueOf, chValueOf, chValueOf2);
        CNPJ_PATTERN = Pattern.compile("\\d{2}\\.\\d{3}\\.\\d{3}/\\d{4}-\\d{2}");
        CNPJ_MASK_GROUPING = v.p(2, 3, 3, 4, 2);
        CNPJ_MASK_SEPARATORS = v.p(chValueOf, chValueOf, '/', chValueOf2);
    }

    private i() {
    }

    public final String a(String inputString) throws IOException {
        s.k(inputString, "inputString");
        StringBuilder sb2 = new StringBuilder();
        int length = inputString.length();
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            char cCharAt = inputString.charAt(i12);
            if (Character.isDigit(cCharAt)) {
                sb2.append(cCharAt);
            }
        }
        String string = sb2.toString();
        s.j(string, "toString(...)");
        ArrayList arrayList = new ArrayList();
        StringBuilder sb3 = new StringBuilder();
        Pair pairA = string.length() <= 11 ? x.a(CPF_MASK_GROUPING, CPF_MASK_SEPARATORS) : x.a(CNPJ_MASK_GROUPING, CNPJ_MASK_SEPARATORS);
        List list = (List) pairA.a();
        List list2 = (List) pairA.b();
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (string.length() < ((Number) list.get(i13)).intValue()) {
                if (string.length() > 0) {
                    arrayList.add(string);
                    break;
                }
            } else {
                arrayList.add(t.T1(string, ((Number) list.get(i13)).intValue()));
                string = string.substring(((Number) list.get(i13)).intValue());
                s.j(string, "substring(...)");
            }
        }
        for (Object obj : arrayList) {
            int i14 = i11 + 1;
            if (i11 < 0) {
                v.x();
            }
            sb3.append((String) obj);
            if (i11 != v.o(arrayList)) {
                sb3.append(((Character) list2.get(i11)).charValue());
            }
            i11 = i14;
        }
        String string2 = sb3.toString();
        s.j(string2, "toString(...)");
        return string2;
    }

    public final List<Character> b() {
        return CNPJ_MASK_SEPARATORS;
    }
}
