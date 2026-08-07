package okhttp3;

import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.TimeUnit;
import jn0.e;
import okhttp3.internal.Util;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u0000 !2\u00020\u0001:\u0002 !Bq\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\r\u0010\u000f\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0015J\r\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0016J\r\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0017J\r\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0018J\r\u0010\n\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0019J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001aJ\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001bJ\r\u0010\u000e\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001cJ\r\u0010\r\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001dJ\r\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u001eJ\b\u0010\u001f\u001a\u00020\u0011H\u0016R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u000f\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0013R\u0013\u0010\u0005\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0014R\u0013\u0010\u000b\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0014R\u0013\u0010\f\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0014R\u0013\u0010\n\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0013R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0013R\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0013R\u0013\u0010\u000e\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0013R\u0013\u0010\r\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0013R\u0013\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0014¨\u0006\""}, d2 = {"Lokhttp3/CacheControl;", "", "noCache", "", "noStore", "maxAgeSeconds", "", "sMaxAgeSeconds", "isPrivate", "isPublic", "mustRevalidate", "maxStaleSeconds", "minFreshSeconds", "onlyIfCached", "noTransform", "immutable", "headerValue", "", "(ZZIIZZZIIZZZLjava/lang/String;)V", "()Z", "()I", "-deprecated_immutable", "-deprecated_maxAgeSeconds", "-deprecated_maxStaleSeconds", "-deprecated_minFreshSeconds", "-deprecated_mustRevalidate", "-deprecated_noCache", "-deprecated_noStore", "-deprecated_noTransform", "-deprecated_onlyIfCached", "-deprecated_sMaxAgeSeconds", "toString", "Builder", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CacheControl {
    private String headerValue;
    private final boolean immutable;
    private final boolean isPrivate;
    private final boolean isPublic;
    private final int maxAgeSeconds;
    private final int maxStaleSeconds;
    private final int minFreshSeconds;
    private final boolean mustRevalidate;
    private final boolean noCache;
    private final boolean noStore;
    private final boolean noTransform;
    private final boolean onlyIfCached;
    private final int sMaxAgeSeconds;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final CacheControl FORCE_NETWORK = new Builder().noCache().build();
    public static final CacheControl FORCE_CACHE = new Builder().onlyIfCached().maxStale(Integer.MAX_VALUE, TimeUnit.SECONDS).build();

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u0003\u001a\u00020\u0000J\u0016\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\t\u001a\u00020\u0000J\u0006\u0010\n\u001a\u00020\u0000J\u0006\u0010\u000b\u001a\u00020\u0000J\u0006\u0010\f\u001a\u00020\u0000J\f\u0010\u0014\u001a\u00020\u0006*\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lokhttp3/CacheControl$Builder;", "", "()V", "immutable", "", "maxAgeSeconds", "", "maxStaleSeconds", "minFreshSeconds", "noCache", "noStore", "noTransform", "onlyIfCached", "build", "Lokhttp3/CacheControl;", "maxAge", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "maxStale", "minFresh", "clampToInt", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        private boolean immutable;
        private int maxAgeSeconds = -1;
        private int maxStaleSeconds = -1;
        private int minFreshSeconds = -1;
        private boolean noCache;
        private boolean noStore;
        private boolean noTransform;
        private boolean onlyIfCached;

        private final int clampToInt(long j11) {
            if (j11 > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            return (int) j11;
        }

        public final CacheControl build() {
            return new CacheControl(this.noCache, this.noStore, this.maxAgeSeconds, -1, false, false, false, this.maxStaleSeconds, this.minFreshSeconds, this.onlyIfCached, this.noTransform, this.immutable, null, null);
        }

        public final Builder immutable() {
            this.immutable = true;
            return this;
        }

        public final Builder maxAge(int maxAge, TimeUnit timeUnit) {
            s.k(timeUnit, "timeUnit");
            if (maxAge >= 0) {
                this.maxAgeSeconds = clampToInt(timeUnit.toSeconds(maxAge));
                return this;
            }
            throw new IllegalArgumentException(("maxAge < 0: " + maxAge).toString());
        }

        public final Builder maxStale(int maxStale, TimeUnit timeUnit) {
            s.k(timeUnit, "timeUnit");
            if (maxStale >= 0) {
                this.maxStaleSeconds = clampToInt(timeUnit.toSeconds(maxStale));
                return this;
            }
            throw new IllegalArgumentException(("maxStale < 0: " + maxStale).toString());
        }

        public final Builder minFresh(int minFresh, TimeUnit timeUnit) {
            s.k(timeUnit, "timeUnit");
            if (minFresh >= 0) {
                this.minFreshSeconds = clampToInt(timeUnit.toSeconds(minFresh));
                return this;
            }
            throw new IllegalArgumentException(("minFresh < 0: " + minFresh).toString());
        }

        public final Builder noCache() {
            this.noCache = true;
            return this;
        }

        public final Builder noStore() {
            this.noStore = true;
            return this;
        }

        public final Builder noTransform() {
            this.noTransform = true;
            return this;
        }

        public final Builder onlyIfCached() {
            this.onlyIfCached = true;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u001e\u0010\t\u001a\u00020\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\nH\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lokhttp3/CacheControl$Companion;", "", "()V", "FORCE_CACHE", "Lokhttp3/CacheControl;", "FORCE_NETWORK", "parse", "headers", "Lokhttp3/Headers;", "indexOfElement", "", "", "characters", "startIndex", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int indexOfElement(String str, String str2, int i11) {
            int length = str.length();
            while (i11 < length) {
                if (t.g0(str2, str.charAt(i11), false, 2, null)) {
                    return i11;
                }
                i11++;
            }
            return str.length();
        }

        static /* synthetic */ int indexOfElement$default(Companion companion, String str, String str2, int i11, int i12, Object obj) {
            if ((i12 & 2) != 0) {
                i11 = 0;
            }
            return companion.indexOfElement(str, str2, i11);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x004b  */
        /* JADX WARN: Code duplicated, block: B:17:0x006a  */
        /* JADX WARN: Code duplicated, block: B:28:0x00cc  */
        /* JADX WARN: Code duplicated, block: B:32:0x00dc  */
        /* JADX WARN: Code duplicated, block: B:34:0x00e6  */
        /* JADX WARN: Code duplicated, block: B:36:0x00ee  */
        /* JADX WARN: Code duplicated, block: B:37:0x00f4  */
        /* JADX WARN: Code duplicated, block: B:39:0x00fc  */
        /* JADX WARN: Code duplicated, block: B:41:0x0106  */
        /* JADX WARN: Code duplicated, block: B:43:0x010e  */
        /* JADX WARN: Code duplicated, block: B:44:0x0114  */
        /* JADX WARN: Code duplicated, block: B:46:0x011c  */
        /* JADX WARN: Code duplicated, block: B:47:0x0122  */
        /* JADX WARN: Code duplicated, block: B:49:0x012a  */
        /* JADX WARN: Code duplicated, block: B:50:0x0130  */
        /* JADX WARN: Code duplicated, block: B:52:0x0138  */
        /* JADX WARN: Code duplicated, block: B:53:0x013f  */
        /* JADX WARN: Code duplicated, block: B:55:0x0147  */
        /* JADX WARN: Code duplicated, block: B:56:0x014f  */
        /* JADX WARN: Code duplicated, block: B:58:0x0157  */
        /* JADX WARN: Code duplicated, block: B:59:0x015d  */
        /* JADX WARN: Code duplicated, block: B:61:0x0166  */
        /* JADX WARN: Code duplicated, block: B:62:0x016e  */
        /* JADX WARN: Code duplicated, block: B:64:0x0176  */
        /* JADX WARN: Code duplicated, block: B:65:0x017e  */
        /* JADX WARN: Code duplicated, block: B:67:0x0186  */
        public final CacheControl parse(Headers headers) {
            int iIndexOfElement;
            int iIndexOfElement2;
            boolean z11;
            String string;
            int i11;
            String str;
            String string2;
            Headers headers2 = headers;
            s.k(headers2, "headers");
            int size = headers2.size();
            boolean z12 = true;
            boolean z13 = true;
            int i12 = 0;
            String str2 = null;
            boolean z14 = false;
            boolean z15 = false;
            int nonNegativeInt = -1;
            int nonNegativeInt2 = -1;
            boolean z16 = false;
            boolean z17 = false;
            boolean z18 = false;
            int nonNegativeInt3 = -1;
            int nonNegativeInt4 = -1;
            boolean z19 = false;
            boolean z21 = false;
            boolean z22 = false;
            while (i12 < size) {
                String strName = headers2.name(i12);
                String strValue = headers2.value(i12);
                if (t.M(strName, "Cache-Control", z12)) {
                    if (str2 == null) {
                        str2 = strValue;
                    }
                    iIndexOfElement = 0;
                    while (iIndexOfElement < strValue.length()) {
                        iIndexOfElement2 = indexOfElement(strValue, "=,;", iIndexOfElement);
                        String strSubstring = strValue.substring(iIndexOfElement, iIndexOfElement2);
                        z11 = z12;
                        s.j(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        string = t.F1(strSubstring).toString();
                        if (iIndexOfElement2 != strValue.length()) {
                            i11 = size;
                            if (strValue.charAt(iIndexOfElement2) == ',' && strValue.charAt(iIndexOfElement2) != ';') {
                                int iIndexOfNonWhitespace = Util.indexOfNonWhitespace(strValue, iIndexOfElement2 + 1);
                                if (iIndexOfNonWhitespace >= strValue.length() || strValue.charAt(iIndexOfNonWhitespace) != '\"') {
                                    str = strValue;
                                    iIndexOfElement = indexOfElement(str, ",;", iIndexOfNonWhitespace);
                                    String strSubstring2 = str.substring(iIndexOfNonWhitespace, iIndexOfElement);
                                    s.j(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                    string2 = t.F1(strSubstring2).toString();
                                } else {
                                    int i13 = iIndexOfNonWhitespace + 1;
                                    String str3 = strValue;
                                    int iU0 = t.u0(str3, CoreConstants.DOUBLE_QUOTE_CHAR, i13, false, 4, null);
                                    str = str3;
                                    String strSubstring3 = str.substring(i13, iU0);
                                    s.j(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                                    iIndexOfElement = iU0 + 1;
                                    string2 = strSubstring3;
                                }
                            }
                            if (t.M("no-cache", string, z11)) {
                                z12 = z11;
                                z14 = z12;
                            } else if (t.M("no-store", string, z11)) {
                                z12 = z11;
                                z15 = z12;
                            } else {
                                if (t.M("max-age", string, z11)) {
                                    nonNegativeInt = Util.toNonNegativeInt(string2, -1);
                                } else if (t.M("s-maxage", string, z11)) {
                                    nonNegativeInt2 = Util.toNonNegativeInt(string2, -1);
                                } else if (t.M("private", string, z11)) {
                                    z12 = z11;
                                    z16 = z12;
                                } else if (t.M("public", string, z11)) {
                                    z12 = z11;
                                    z17 = z12;
                                } else if (t.M("must-revalidate", string, z11)) {
                                    z12 = z11;
                                    z18 = z12;
                                } else if (t.M("max-stale", string, z11)) {
                                    nonNegativeInt3 = Util.toNonNegativeInt(string2, Integer.MAX_VALUE);
                                } else if (t.M("min-fresh", string, z11)) {
                                    nonNegativeInt4 = Util.toNonNegativeInt(string2, -1);
                                } else if (t.M("only-if-cached", string, z11)) {
                                    z12 = z11;
                                    z19 = z12;
                                } else if (t.M("no-transform", string, z11)) {
                                    z12 = z11;
                                    z21 = z12;
                                } else if (t.M("immutable", string, z11)) {
                                    z12 = z11;
                                    z22 = z12;
                                }
                                z12 = z11;
                            }
                            strValue = str;
                            size = i11;
                        } else {
                            i11 = size;
                        }
                        str = strValue;
                        iIndexOfElement = iIndexOfElement2 + 1;
                        string2 = null;
                        if (t.M("no-cache", string, z11)) {
                            z12 = z11;
                            z14 = z12;
                        } else if (t.M("no-store", string, z11)) {
                            z12 = z11;
                            z15 = z12;
                        } else {
                            if (t.M("max-age", string, z11)) {
                                nonNegativeInt = Util.toNonNegativeInt(string2, -1);
                            } else if (t.M("s-maxage", string, z11)) {
                                nonNegativeInt2 = Util.toNonNegativeInt(string2, -1);
                            } else if (t.M("private", string, z11)) {
                                z12 = z11;
                                z16 = z12;
                            } else if (t.M("public", string, z11)) {
                                z12 = z11;
                                z17 = z12;
                            } else if (t.M("must-revalidate", string, z11)) {
                                z12 = z11;
                                z18 = z12;
                            } else if (t.M("max-stale", string, z11)) {
                                nonNegativeInt3 = Util.toNonNegativeInt(string2, Integer.MAX_VALUE);
                            } else if (t.M("min-fresh", string, z11)) {
                                nonNegativeInt4 = Util.toNonNegativeInt(string2, -1);
                            } else if (t.M("only-if-cached", string, z11)) {
                                z12 = z11;
                                z19 = z12;
                            } else if (t.M("no-transform", string, z11)) {
                                z12 = z11;
                                z21 = z12;
                            } else if (t.M("immutable", string, z11)) {
                                z12 = z11;
                                z22 = z12;
                            }
                            z12 = z11;
                        }
                        strValue = str;
                        size = i11;
                    }
                    i12++;
                    headers2 = headers;
                    z12 = z12;
                    size = size;
                } else {
                    if (t.M(strName, "Pragma", z12)) {
                    }
                    i12++;
                    headers2 = headers;
                    z12 = z12;
                    size = size;
                }
                z13 = false;
                iIndexOfElement = 0;
                while (iIndexOfElement < strValue.length()) {
                    iIndexOfElement2 = indexOfElement(strValue, "=,;", iIndexOfElement);
                    String strSubstring4 = strValue.substring(iIndexOfElement, iIndexOfElement2);
                    z11 = z12;
                    s.j(strSubstring4, "this as java.lang.String…ing(startIndex, endIndex)");
                    string = t.F1(strSubstring4).toString();
                    if (iIndexOfElement2 != strValue.length()) {
                        i11 = size;
                        if (strValue.charAt(iIndexOfElement2) == ',') {
                        }
                        if (t.M("no-cache", string, z11)) {
                            z12 = z11;
                            z14 = z12;
                        } else if (t.M("no-store", string, z11)) {
                            z12 = z11;
                            z15 = z12;
                        } else {
                            if (t.M("max-age", string, z11)) {
                                nonNegativeInt = Util.toNonNegativeInt(string2, -1);
                            } else if (t.M("s-maxage", string, z11)) {
                                nonNegativeInt2 = Util.toNonNegativeInt(string2, -1);
                            } else if (t.M("private", string, z11)) {
                                z12 = z11;
                                z16 = z12;
                            } else if (t.M("public", string, z11)) {
                                z12 = z11;
                                z17 = z12;
                            } else if (t.M("must-revalidate", string, z11)) {
                                z12 = z11;
                                z18 = z12;
                            } else if (t.M("max-stale", string, z11)) {
                                nonNegativeInt3 = Util.toNonNegativeInt(string2, Integer.MAX_VALUE);
                            } else if (t.M("min-fresh", string, z11)) {
                                nonNegativeInt4 = Util.toNonNegativeInt(string2, -1);
                            } else if (t.M("only-if-cached", string, z11)) {
                                z12 = z11;
                                z19 = z12;
                            } else if (t.M("no-transform", string, z11)) {
                                z12 = z11;
                                z21 = z12;
                            } else if (t.M("immutable", string, z11)) {
                                z12 = z11;
                                z22 = z12;
                            }
                            z12 = z11;
                        }
                        strValue = str;
                        size = i11;
                    } else {
                        i11 = size;
                    }
                    str = strValue;
                    iIndexOfElement = iIndexOfElement2 + 1;
                    string2 = null;
                    if (t.M("no-cache", string, z11)) {
                        z12 = z11;
                        z14 = z12;
                    } else if (t.M("no-store", string, z11)) {
                        z12 = z11;
                        z15 = z12;
                    } else {
                        if (t.M("max-age", string, z11)) {
                            nonNegativeInt = Util.toNonNegativeInt(string2, -1);
                        } else if (t.M("s-maxage", string, z11)) {
                            nonNegativeInt2 = Util.toNonNegativeInt(string2, -1);
                        } else if (t.M("private", string, z11)) {
                            z12 = z11;
                            z16 = z12;
                        } else if (t.M("public", string, z11)) {
                            z12 = z11;
                            z17 = z12;
                        } else if (t.M("must-revalidate", string, z11)) {
                            z12 = z11;
                            z18 = z12;
                        } else if (t.M("max-stale", string, z11)) {
                            nonNegativeInt3 = Util.toNonNegativeInt(string2, Integer.MAX_VALUE);
                        } else if (t.M("min-fresh", string, z11)) {
                            nonNegativeInt4 = Util.toNonNegativeInt(string2, -1);
                        } else if (t.M("only-if-cached", string, z11)) {
                            z12 = z11;
                            z19 = z12;
                        } else if (t.M("no-transform", string, z11)) {
                            z12 = z11;
                            z21 = z12;
                        } else if (t.M("immutable", string, z11)) {
                            z12 = z11;
                            z22 = z12;
                        }
                        z12 = z11;
                    }
                    strValue = str;
                    size = i11;
                }
                i12++;
                headers2 = headers;
                z12 = z12;
                size = size;
            }
            return new CacheControl(z14, z15, nonNegativeInt, nonNegativeInt2, z16, z17, z18, nonNegativeInt3, nonNegativeInt4, z19, z21, z22, !z13 ? null : str2, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ CacheControl(boolean z11, boolean z12, int i11, int i12, boolean z13, boolean z14, boolean z15, int i13, int i14, boolean z16, boolean z17, boolean z18, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, z12, i11, i12, z13, z14, z15, i13, i14, z16, z17, z18, str);
    }

    public static final CacheControl parse(Headers headers) {
        return INSTANCE.parse(headers);
    }

    @e
    /* JADX INFO: renamed from: -deprecated_immutable, reason: not valid java name and from getter */
    public final boolean getImmutable() {
        return this.immutable;
    }

    @e
    /* JADX INFO: renamed from: -deprecated_maxAgeSeconds, reason: not valid java name and from getter */
    public final int getMaxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    @e
    /* JADX INFO: renamed from: -deprecated_maxStaleSeconds, reason: not valid java name and from getter */
    public final int getMaxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    @e
    /* JADX INFO: renamed from: -deprecated_minFreshSeconds, reason: not valid java name and from getter */
    public final int getMinFreshSeconds() {
        return this.minFreshSeconds;
    }

    @e
    /* JADX INFO: renamed from: -deprecated_mustRevalidate, reason: not valid java name and from getter */
    public final boolean getMustRevalidate() {
        return this.mustRevalidate;
    }

    @e
    /* JADX INFO: renamed from: -deprecated_noCache, reason: not valid java name and from getter */
    public final boolean getNoCache() {
        return this.noCache;
    }

    @e
    /* JADX INFO: renamed from: -deprecated_noStore, reason: not valid java name and from getter */
    public final boolean getNoStore() {
        return this.noStore;
    }

    @e
    /* JADX INFO: renamed from: -deprecated_noTransform, reason: not valid java name and from getter */
    public final boolean getNoTransform() {
        return this.noTransform;
    }

    @e
    /* JADX INFO: renamed from: -deprecated_onlyIfCached, reason: not valid java name and from getter */
    public final boolean getOnlyIfCached() {
        return this.onlyIfCached;
    }

    @e
    /* JADX INFO: renamed from: -deprecated_sMaxAgeSeconds, reason: not valid java name and from getter */
    public final int getSMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    public final boolean immutable() {
        return this.immutable;
    }

    /* JADX INFO: renamed from: isPrivate, reason: from getter */
    public final boolean getIsPrivate() {
        return this.isPrivate;
    }

    /* JADX INFO: renamed from: isPublic, reason: from getter */
    public final boolean getIsPublic() {
        return this.isPublic;
    }

    public final int maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    public final int maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    public final int minFreshSeconds() {
        return this.minFreshSeconds;
    }

    public final boolean mustRevalidate() {
        return this.mustRevalidate;
    }

    public final boolean noCache() {
        return this.noCache;
    }

    public final boolean noStore() {
        return this.noStore;
    }

    public final boolean noTransform() {
        return this.noTransform;
    }

    public final boolean onlyIfCached() {
        return this.onlyIfCached;
    }

    public final int sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    public String toString() {
        String str = this.headerValue;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.noCache) {
            sb2.append("no-cache, ");
        }
        if (this.noStore) {
            sb2.append("no-store, ");
        }
        if (this.maxAgeSeconds != -1) {
            sb2.append("max-age=");
            sb2.append(this.maxAgeSeconds);
            sb2.append(", ");
        }
        if (this.sMaxAgeSeconds != -1) {
            sb2.append("s-maxage=");
            sb2.append(this.sMaxAgeSeconds);
            sb2.append(", ");
        }
        if (this.isPrivate) {
            sb2.append("private, ");
        }
        if (this.isPublic) {
            sb2.append("public, ");
        }
        if (this.mustRevalidate) {
            sb2.append("must-revalidate, ");
        }
        if (this.maxStaleSeconds != -1) {
            sb2.append("max-stale=");
            sb2.append(this.maxStaleSeconds);
            sb2.append(", ");
        }
        if (this.minFreshSeconds != -1) {
            sb2.append("min-fresh=");
            sb2.append(this.minFreshSeconds);
            sb2.append(", ");
        }
        if (this.onlyIfCached) {
            sb2.append("only-if-cached, ");
        }
        if (this.noTransform) {
            sb2.append("no-transform, ");
        }
        if (this.immutable) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        sb2.delete(sb2.length() - 2, sb2.length());
        String string = sb2.toString();
        s.j(string, "StringBuilder().apply(builderAction).toString()");
        this.headerValue = string;
        return string;
    }

    private CacheControl(boolean z11, boolean z12, int i11, int i12, boolean z13, boolean z14, boolean z15, int i13, int i14, boolean z16, boolean z17, boolean z18, String str) {
        this.noCache = z11;
        this.noStore = z12;
        this.maxAgeSeconds = i11;
        this.sMaxAgeSeconds = i12;
        this.isPrivate = z13;
        this.isPublic = z14;
        this.mustRevalidate = z15;
        this.maxStaleSeconds = i13;
        this.minFreshSeconds = i14;
        this.onlyIfCached = z16;
        this.noTransform = z17;
        this.immutable = z18;
        this.headerValue = str;
    }
}
