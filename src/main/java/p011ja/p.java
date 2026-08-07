package p011ja;

import android.net.Uri;
import android.os.Bundle;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import io.sentry.q7;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jn0.h0;
import jn0.x;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p013kotlin.text.q;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b \u0018\u0000 \u001c2\u00020\u0001:\u0004FJLNB'\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J5\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00122\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ5\u0010 \u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0013\u001a\u00020\u00122\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014H\u0002¢\u0006\u0004\b \u0010!JC\u0010&\u001a\u00020\u001b2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010\u0013\u001a\u00020\u00122\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014H\u0002¢\u0006\u0004\b&\u0010'J1\u0010+\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u00022\b\u0010*\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b+\u0010,J3\u0010-\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010\u00022\b\u0010*\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u000eH\u0002¢\u0006\u0004\b/\u00100J\u001b\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020$01H\u0002¢\u0006\u0004\b2\u00103J#\u00105\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t\u0012\u0004\u0012\u00020\u0002\u0018\u000104H\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u000eH\u0002¢\u0006\u0004\b7\u00100J\u0017\u00109\u001a\u0002082\u0006\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b9\u0010:J/\u0010;\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001f\u001a\u00020\u001e2\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014H\u0007¢\u0006\u0004\b;\u0010<J/\u0010=\u001a\u00020\u00122\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014H\u0000¢\u0006\u0004\b=\u0010<J\u0019\u0010?\u001a\u0002082\b\u0010>\u001a\u0004\u0018\u00010\u001eH\u0000¢\u0006\u0004\b?\u0010@J\u001a\u0010B\u001a\u00020\u001b2\b\u0010A\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u000208H\u0016¢\u0006\u0004\bD\u0010ER\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bJ\u0010G\u001a\u0004\bK\u0010IR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bL\u0010G\u001a\u0004\bM\u0010IR\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010R\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010GR\u001d\u0010X\u001a\u0004\u0018\u00010S8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u001b\u0010[\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010U\u001a\u0004\bY\u0010ZR'\u0010]\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020$018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010U\u001a\u0004\b\\\u00103R\u0016\u0010_\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010^R/\u0010b\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t\u0012\u0004\u0012\u00020\u0002\u0018\u0001048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b`\u0010U\u001a\u0004\ba\u00106R!\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bc\u0010U\u001a\u0004\bc\u0010dR\u001d\u0010g\u001a\u0004\u0018\u00010\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\ba\u0010U\u001a\u0004\bf\u0010IR\u001d\u0010i\u001a\u0004\u0018\u00010S8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bh\u0010U\u001a\u0004\bh\u0010WR\u0018\u0010j\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010GR\u001d\u0010l\u001a\u0004\u0018\u00010S8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010U\u001a\u0004\bk\u0010WR*\u0010q\u001a\u00020\u001b2\u0006\u0010m\u001a\u00020\u001b8G@@X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010^\u001a\u0004\bn\u0010Z\"\u0004\bo\u0010pR\u001a\u0010r\u001a\b\u0012\u0004\u0012\u00020\u00020\"8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b`\u0010d¨\u0006s"}, d2 = {"Lja/p;", "", "", "uriPattern", "action", "mimeType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "uri", "", "args", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "uriRegex", "Ljn0/h0;", "g", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/StringBuilder;)V", "fragment", "Landroid/os/Bundle;", "bundle", "", "Lja/h;", "arguments", "s", "(Ljava/lang/String;Landroid/os/Bundle;Ljava/util/Map;)V", "Ljava/util/regex/Matcher;", "matcher", "", "q", "(Ljava/util/regex/Matcher;Landroid/os/Bundle;Ljava/util/Map;)Z", "Landroid/net/Uri;", "deepLink", "r", "(Landroid/net/Uri;Landroid/os/Bundle;Ljava/util/Map;)Z", "", "inputParams", "Lja/p$d;", "storedParam", "E", "(Ljava/util/List;Lja/p$d;Landroid/os/Bundle;Ljava/util/Map;)Z", "name", "value", "argument", "B", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Lja/h;)V", "C", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Lja/h;)Z", "G", "()V", "", "H", "()Ljava/util/Map;", "Lkotlin/Pair;", "D", "()Lkotlin/Pair;", Gender.FEMALE, "", "u", "(Ljava/lang/String;)I", "o", "(Landroid/net/Uri;Ljava/util/Map;)Landroid/os/Bundle;", "p", "requestedLink", "h", "(Landroid/net/Uri;)I", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "Ljava/lang/String;", "y", "()Ljava/lang/String;", "b", IntegerTokenConverter.CONVERTER_KEY, "c", "t", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "pathArgs", "e", "pathRegex", "Ljava/util/regex/Pattern;", "f", "Lkotlin/Lazy;", "w", "()Ljava/util/regex/Pattern;", "pathPattern", "A", "()Z", "isParameterizedQuery", "x", "queryArgsMap", "Z", "isSingleQueryParamValueOnly", "j", "l", "fragArgsAndRegex", "k", "()Ljava/util/List;", "fragArgs", "n", "fragRegex", "m", "fragPattern", "mimeTypeRegex", "v", "mimeTypePattern", "<set-?>", "z", "setExactDeepLink$navigation_common_release", "(Z)V", "isExactDeepLink", "argumentsNames", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class p {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final b f83340q = new b(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Pattern f83341r = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Pattern f83342s = Pattern.compile("\\{(.+?)\\}");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String uriPattern;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String action;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String mimeType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private String pathRegex;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Lazy queryArgsMap;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean isSingleQueryParamValueOnly;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Lazy fragArgsAndRegex;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Lazy fragArgs;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Lazy fragRegex;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Lazy fragPattern;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private String mimeTypeRegex;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Lazy mimeTypePattern;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean isExactDeepLink;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<String> pathArgs = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Lazy pathPattern = jn0.m.b(new l());

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Lazy isParameterizedQuery = jn0.m.b(new j());

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\tB\t\b\u0017¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u000bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u0010"}, d2 = {"Lja/p$a;", "", "<init>", "()V", "", "uriPattern", "b", "(Ljava/lang/String;)Lja/p$a;", "Lja/p;", "a", "()Lja/p;", "Ljava/lang/String;", "action", "c", "mimeType", DateTokenConverter.CONVERTER_KEY, "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private String uriPattern;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private String action;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private String mimeType;

        public final p a() {
            return new p(this.uriPattern, this.action, this.mimeType);
        }

        public final a b(String uriPattern) {
            s.k(uriPattern, "uriPattern");
            this.uriPattern = uriPattern;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lja/p$b;", "", "<init>", "()V", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "FILL_IN_PATTERN", "Ljava/util/regex/Pattern;", "SCHEME_PATTERN", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR\"\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0005R\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u0005¨\u0006\u0012"}, d2 = {"Lja/p$c;", "", "", "mimeType", "<init>", "(Ljava/lang/String;)V", "other", "", "a", "(Lja/p$c;)I", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "setType", "type", "b", "setSubType", "subType", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class c implements Comparable<c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private String type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private String subType;

        public c(String mimeType) {
            List listM;
            s.k(mimeType, "mimeType");
            List<String> listM2 = new q("/").m(mimeType, 0);
            if (listM2.isEmpty()) {
                listM = v.m();
            } else {
                ListIterator<String> listIterator = listM2.listIterator(listM2.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() != 0) {
                        listM = v.d1(listM2, listIterator.nextIndex() + 1);
                    }
                }
                listM = v.m();
            }
            this.type = (String) listM.get(0);
            this.subType = (String) listM.get(1);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c other) {
            s.k(other, "other");
            int i11 = s.f(this.type, other.type) ? 2 : 0;
            return s.f(this.subType, other.subType) ? i11 + 1 : i11;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSubType() {
            return this.subType;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getType() {
            return this.type;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\bR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0013"}, d2 = {"Lja/p$d;", "", "<init>", "()V", "", "name", "Ljn0/h0;", "a", "(Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "paramRegex", "", "b", "Ljava/util/List;", "()Ljava/util/List;", "arguments", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private String paramRegex;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final List<String> arguments = new ArrayList();

        public final void a(String name) {
            s.k(name, "name");
            this.arguments.add(name);
        }

        public final List<String> b() {
            return this.arguments;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getParamRegex() {
            return this.paramRegex;
        }

        public final void d(String str) {
            this.paramRegex = str;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends u implements wn0.a<List<String>> {
        e() {
            super(0);
        }

        @Override // wn0.a
        public final List<String> invoke() {
            List<String> list;
            Pair pairL = p.this.l();
            return (pairL == null || (list = (List) pairL.e()) == null) ? new ArrayList() : list;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Pair;", "", "", "b", "()Lkotlin/Pair;"}, k = 3, mv = {1, 8, 0})
    static final class f extends u implements wn0.a<Pair<? extends List<String>, ? extends String>> {
        f() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Pair<List<String>, String> invoke() {
            return p.this.D();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/util/regex/Pattern;", "b", "()Ljava/util/regex/Pattern;"}, k = 3, mv = {1, 8, 0})
    static final class g extends u implements wn0.a<Pattern> {
        g() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Pattern invoke() {
            String strN = p.this.n();
            if (strN != null) {
                return Pattern.compile(strN, 2);
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    static final class h extends u implements wn0.a<String> {
        h() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            Pair pairL = p.this.l();
            if (pairL != null) {
                return (String) pairL.f();
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "argName", "", "a", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class i extends u implements wn0.l<String, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Bundle f83371c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Bundle bundle) {
            super(1);
            this.f83371c = bundle;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(String argName) {
            s.k(argName, "argName");
            return Boolean.valueOf(!this.f83371c.containsKey(argName));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class j extends u implements wn0.a<Boolean> {
        j() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf((p.this.getUriPattern() == null || Uri.parse(p.this.getUriPattern()).getQuery() == null) ? false : true);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/util/regex/Pattern;", "b", "()Ljava/util/regex/Pattern;"}, k = 3, mv = {1, 8, 0})
    static final class k extends u implements wn0.a<Pattern> {
        k() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Pattern invoke() {
            String str = p.this.mimeTypeRegex;
            if (str != null) {
                return Pattern.compile(str);
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/util/regex/Pattern;", "b", "()Ljava/util/regex/Pattern;"}, k = 3, mv = {1, 8, 0})
    static final class l extends u implements wn0.a<Pattern> {
        l() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Pattern invoke() {
            String str = p.this.pathRegex;
            if (str != null) {
                return Pattern.compile(str, 2);
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "", "Lja/p$d;", "invoke", "()Ljava/util/Map;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class m extends u implements wn0.a<Map<String, d>> {
        m() {
            super(0);
        }

        @Override // wn0.a
        public final Map<String, d> invoke() {
            return p.this.H();
        }
    }

    public p(String str, String str2, String str3) {
        this.uriPattern = str;
        this.action = str2;
        this.mimeType = str3;
        jn0.p pVar = jn0.p.NONE;
        this.queryArgsMap = jn0.m.a(pVar, new m());
        this.fragArgsAndRegex = jn0.m.a(pVar, new f());
        this.fragArgs = jn0.m.a(pVar, new e());
        this.fragRegex = jn0.m.a(pVar, new h());
        this.fragPattern = jn0.m.b(new g());
        this.mimeTypePattern = jn0.m.b(new k());
        G();
        F();
    }

    private final boolean A() {
        return ((Boolean) this.isParameterizedQuery.getValue()).booleanValue();
    }

    private final void B(Bundle bundle, String name, String value, p011ja.h argument) {
        if (argument != null) {
            argument.a().d(bundle, name, value);
        } else {
            bundle.putString(name, value);
        }
    }

    private final boolean C(Bundle bundle, String name, String value, p011ja.h argument) {
        if (!bundle.containsKey(name)) {
            return true;
        }
        if (argument == null) {
            return false;
        }
        b0<Object> b0VarA = argument.a();
        b0VarA.e(bundle, name, value, b0VarA.a(bundle, name));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<List<String>, String> D() {
        String str = this.uriPattern;
        if (str == null || Uri.parse(str).getFragment() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String fragment = Uri.parse(this.uriPattern).getFragment();
        StringBuilder sb2 = new StringBuilder();
        s.h(fragment);
        g(fragment, arrayList, sb2);
        String string = sb2.toString();
        s.j(string, "fragRegex.toString()");
        return x.a(arrayList, string);
    }

    private final boolean E(List<String> inputParams, d storedParam, Bundle bundle, Map<String, p011ja.h> arguments) {
        Object objValueOf;
        Bundle bundleB = q5.d.b(new Pair[0]);
        Iterator<T> it = storedParam.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            p011ja.h hVar = arguments.get(str);
            b0<Object> b0VarA = hVar != null ? hVar.a() : null;
            if ((b0VarA instanceof p011ja.c) && !hVar.getIsDefaultValuePresent()) {
                b0VarA.h(bundleB, str, ((p011ja.c) b0VarA).k());
            }
        }
        for (String str2 : inputParams) {
            String paramRegex = storedParam.getParamRegex();
            Matcher matcher = paramRegex != null ? Pattern.compile(paramRegex, 32).matcher(str2) : null;
            if (matcher == null || !matcher.matches()) {
                return false;
            }
            List<String> listB = storedParam.b();
            ArrayList arrayList = new ArrayList(v.y(listB, 10));
            int i11 = 0;
            for (Object obj : listB) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    v.x();
                }
                String str3 = (String) obj;
                String strGroup = matcher.group(i12);
                if (strGroup == null) {
                    strGroup = "";
                } else {
                    s.j(strGroup, "argMatcher.group(index + 1) ?: \"\"");
                }
                p011ja.h hVar2 = arguments.get(str3);
                try {
                    if (bundleB.containsKey(str3)) {
                        objValueOf = Boolean.valueOf(C(bundleB, str3, strGroup, hVar2));
                    } else {
                        B(bundleB, str3, strGroup, hVar2);
                        objValueOf = h0.f84049a;
                    }
                } catch (IllegalArgumentException unused) {
                    objValueOf = h0.f84049a;
                }
                arrayList.add(objValueOf);
                i11 = i12;
            }
        }
        bundle.putAll(bundleB);
        return true;
    }

    private final void F() {
        if (this.mimeType == null) {
            return;
        }
        if (!Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(this.mimeType).matches()) {
            throw new IllegalArgumentException(("The given mimeType " + this.mimeType + " does not match to required \"type/subtype\" format").toString());
        }
        c cVar = new c(this.mimeType);
        this.mimeTypeRegex = t.V("^(" + cVar.getType() + "|[*]+)/(" + cVar.getSubType() + "|[*]+)$", "*|[*]", "[\\s\\S]", false, 4, null);
    }

    private final void G() {
        if (this.uriPattern == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("^");
        if (!f83341r.matcher(this.uriPattern).find()) {
            sb2.append("http[s]?://");
        }
        Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(this.uriPattern);
        matcher.find();
        boolean z11 = false;
        String strSubstring = this.uriPattern.substring(0, matcher.start());
        s.j(strSubstring, "substring(...)");
        g(strSubstring, this.pathArgs, sb2);
        if (!t.h0(sb2, q7.DEFAULT_PROPAGATION_TARGETS, false, 2, null) && !t.h0(sb2, "([^/]+?)", false, 2, null)) {
            z11 = true;
        }
        this.isExactDeepLink = z11;
        sb2.append("($|(\\?(.)*)|(\\#(.)*))");
        String string = sb2.toString();
        s.j(string, "uriRegex.toString()");
        this.pathRegex = t.V(string, q7.DEFAULT_PROPAGATION_TARGETS, "\\E.*\\Q", false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, d> H() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (A()) {
            Uri uri = Uri.parse(this.uriPattern);
            for (String paramName : uri.getQueryParameterNames()) {
                StringBuilder sb2 = new StringBuilder();
                List<String> queryParams = uri.getQueryParameters(paramName);
                if (queryParams.size() > 1) {
                    throw new IllegalArgumentException(("Query parameter " + paramName + " must only be present once in " + this.uriPattern + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                }
                s.j(queryParams, "queryParams");
                String queryParam = (String) v.q0(queryParams);
                if (queryParam == null) {
                    this.isSingleQueryParamValueOnly = true;
                    queryParam = paramName;
                }
                Matcher matcher = f83342s.matcher(queryParam);
                d dVar = new d();
                int iEnd = 0;
                while (matcher.find()) {
                    String strGroup = matcher.group(1);
                    s.i(strGroup, "null cannot be cast to non-null type kotlin.String");
                    dVar.a(strGroup);
                    s.j(queryParam, "queryParam");
                    String strSubstring = queryParam.substring(iEnd, matcher.start());
                    s.j(strSubstring, "substring(...)");
                    sb2.append(Pattern.quote(strSubstring));
                    sb2.append("(.+?)?");
                    iEnd = matcher.end();
                }
                if (iEnd < queryParam.length()) {
                    s.j(queryParam, "queryParam");
                    String strSubstring2 = queryParam.substring(iEnd);
                    s.j(strSubstring2, "substring(...)");
                    sb2.append(Pattern.quote(strSubstring2));
                }
                String string = sb2.toString();
                s.j(string, "argRegex.toString()");
                dVar.d(t.V(string, q7.DEFAULT_PROPAGATION_TARGETS, "\\E.*\\Q", false, 4, null));
                s.j(paramName, "paramName");
                linkedHashMap.put(paramName, dVar);
            }
        }
        return linkedHashMap;
    }

    private final void g(String uri, List<String> args, StringBuilder uriRegex) {
        Matcher matcher = f83342s.matcher(uri);
        int iEnd = 0;
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            s.i(strGroup, "null cannot be cast to non-null type kotlin.String");
            args.add(strGroup);
            if (matcher.start() > iEnd) {
                String strSubstring = uri.substring(iEnd, matcher.start());
                s.j(strSubstring, "substring(...)");
                uriRegex.append(Pattern.quote(strSubstring));
            }
            uriRegex.append("([^/]*?|)");
            iEnd = matcher.end();
        }
        if (iEnd < uri.length()) {
            String strSubstring2 = uri.substring(iEnd);
            s.j(strSubstring2, "substring(...)");
            uriRegex.append(Pattern.quote(strSubstring2));
        }
    }

    private final List<String> k() {
        return (List) this.fragArgs.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<List<String>, String> l() {
        return (Pair) this.fragArgsAndRegex.getValue();
    }

    private final Pattern m() {
        return (Pattern) this.fragPattern.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String n() {
        return (String) this.fragRegex.getValue();
    }

    private final boolean q(Matcher matcher, Bundle bundle, Map<String, p011ja.h> arguments) {
        List<String> list = this.pathArgs;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                v.x();
            }
            String str = (String) obj;
            String value = Uri.decode(matcher.group(i12));
            p011ja.h hVar = arguments.get(str);
            try {
                s.j(value, "value");
                B(bundle, str, value, hVar);
                arrayList.add(h0.f84049a);
                i11 = i12;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    private final boolean r(Uri deepLink, Bundle bundle, Map<String, p011ja.h> arguments) {
        String query;
        for (Map.Entry<String, d> entry : x().entrySet()) {
            String key = entry.getKey();
            d value = entry.getValue();
            List<String> inputParams = deepLink.getQueryParameters(key);
            if (this.isSingleQueryParamValueOnly && (query = deepLink.getQuery()) != null && !s.f(query, deepLink.toString())) {
                inputParams = v.e(query);
            }
            s.j(inputParams, "inputParams");
            if (!E(inputParams, value, bundle, arguments)) {
                return false;
            }
        }
        return true;
    }

    private final void s(String fragment, Bundle bundle, Map<String, p011ja.h> arguments) {
        Pattern patternM = m();
        Matcher matcher = patternM != null ? patternM.matcher(String.valueOf(fragment)) : null;
        if (matcher != null && matcher.matches()) {
            List<String> listK = k();
            ArrayList arrayList = new ArrayList(v.y(listK, 10));
            int i11 = 0;
            for (Object obj : listK) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    v.x();
                }
                String str = (String) obj;
                String value = Uri.decode(matcher.group(i12));
                p011ja.h hVar = arguments.get(str);
                try {
                    s.j(value, "value");
                    B(bundle, str, value, hVar);
                    arrayList.add(h0.f84049a);
                    i11 = i12;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            }
        }
    }

    private final Pattern v() {
        return (Pattern) this.mimeTypePattern.getValue();
    }

    private final Pattern w() {
        return (Pattern) this.pathPattern.getValue();
    }

    private final Map<String, d> x() {
        return (Map) this.queryArgsMap.getValue();
    }

    public boolean equals(Object other) {
        if (other != null && (other instanceof p)) {
            p pVar = (p) other;
            if (s.f(this.uriPattern, pVar.uriPattern) && s.f(this.action, pVar.action) && s.f(this.mimeType, pVar.mimeType)) {
                return true;
            }
        }
        return false;
    }

    public final int h(Uri requestedLink) {
        if (requestedLink == null || this.uriPattern == null) {
            return 0;
        }
        List<String> requestedPathSegments = requestedLink.getPathSegments();
        List<String> uriPathSegments = Uri.parse(this.uriPattern).getPathSegments();
        s.j(requestedPathSegments, "requestedPathSegments");
        s.j(uriPathSegments, "uriPathSegments");
        return v.u0(requestedPathSegments, uriPathSegments).size();
    }

    public int hashCode() {
        String str = this.uriPattern;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.action;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.mimeType;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    public final List<String> j() {
        List<String> list = this.pathArgs;
        Collection<d> collectionValues = x().values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            v.E(arrayList, ((d) it.next()).b());
        }
        return v.P0(v.P0(list, arrayList), k());
    }

    public final Bundle o(Uri deepLink, Map<String, p011ja.h> arguments) {
        s.k(deepLink, "deepLink");
        s.k(arguments, "arguments");
        Pattern patternW = w();
        Matcher matcher = patternW != null ? patternW.matcher(deepLink.toString()) : null;
        if (matcher == null || !matcher.matches()) {
            return null;
        }
        Bundle bundle = new Bundle();
        if (!q(matcher, bundle, arguments)) {
            return null;
        }
        if (A() && !r(deepLink, bundle, arguments)) {
            return null;
        }
        s(deepLink.getFragment(), bundle, arguments);
        if (p011ja.j.a(arguments, new i(bundle)).isEmpty()) {
            return bundle;
        }
        return null;
    }

    public final Bundle p(Uri deepLink, Map<String, p011ja.h> arguments) {
        s.k(arguments, "arguments");
        Bundle bundle = new Bundle();
        if (deepLink != null) {
            Pattern patternW = w();
            Matcher matcher = patternW != null ? patternW.matcher(deepLink.toString()) : null;
            if (matcher != null && matcher.matches()) {
                q(matcher, bundle, arguments);
                if (A()) {
                    r(deepLink, bundle, arguments);
                }
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    public final int u(String mimeType) {
        s.k(mimeType, "mimeType");
        if (this.mimeType == null) {
            return -1;
        }
        Pattern patternV = v();
        s.h(patternV);
        if (patternV.matcher(mimeType).matches()) {
            return new c(this.mimeType).compareTo(new c(mimeType));
        }
        return -1;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final String getUriPattern() {
        return this.uriPattern;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final boolean getIsExactDeepLink() {
        return this.isExactDeepLink;
    }
}
