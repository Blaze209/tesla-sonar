package okhttp3.internal.http;

import com.google.android.gms.common.internal.ImagesContract;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jn0.e;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import okio.h;
import okio.k;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\u000b\u001a\u00020\n*\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0012\u001a\u00020\r*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0001*\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0001*\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0015\u001a!\u0010\u001b\u001a\u00020\n*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0011\u0010\u001e\u001a\u00020\r*\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0017\u0010!\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001dH\u0007¢\u0006\u0004\b!\u0010\u001f\"\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$\"\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$¨\u0006&"}, d2 = {"Lokhttp3/Headers;", "", "headerName", "", "Lokhttp3/Challenge;", "parseChallenges", "(Lokhttp3/Headers;Ljava/lang/String;)Ljava/util/List;", "Lokio/h;", "", "result", "Ljn0/h0;", "readChallengeHeader", "(Lokio/h;Ljava/util/List;)V", "", "skipCommasAndWhitespace", "(Lokio/h;)Z", "", "prefix", "startsWith", "(Lokio/h;B)Z", "readQuotedString", "(Lokio/h;)Ljava/lang/String;", "readToken", "Lokhttp3/CookieJar;", "Lokhttp3/HttpUrl;", ImagesContract.URL, "headers", "receiveHeaders", "(Lokhttp3/CookieJar;Lokhttp3/HttpUrl;Lokhttp3/Headers;)V", "Lokhttp3/Response;", "promisesBody", "(Lokhttp3/Response;)Z", "response", "hasBody", "Lokio/k;", "QUOTED_STRING_DELIMITERS", "Lokio/k;", "TOKEN_DELIMITERS", "okhttp"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class HttpHeaders {
    private static final k QUOTED_STRING_DELIMITERS;
    private static final k TOKEN_DELIMITERS;

    static {
        k.Companion companion = k.INSTANCE;
        QUOTED_STRING_DELIMITERS = companion.f("\"\\");
        TOKEN_DELIMITERS = companion.f("\t ,=");
    }

    @e
    public static final boolean hasBody(Response response) {
        s.k(response, "response");
        return promisesBody(response);
    }

    public static final List<Challenge> parseChallenges(Headers headers, String headerName) {
        s.k(headers, "<this>");
        s.k(headerName, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (t.M(headerName, headers.name(i11), true)) {
                try {
                    readChallengeHeader(new h().l2(headers.value(i11)), arrayList);
                } catch (EOFException e11) {
                    Platform.INSTANCE.get().log("Unable to parse challenge", 5, e11);
                }
            }
        }
        return arrayList;
    }

    public static final boolean promisesBody(Response response) {
        s.k(response, "<this>");
        if (s.f(response.request().method(), "HEAD")) {
            return false;
        }
        int iCode = response.code();
        return (((iCode >= 100 && iCode < 200) || iCode == 204 || iCode == 304) && Util.headersContentLength(response) == -1 && !t.M("chunked", Response.header$default(response, "Transfer-Encoding", null, 2, null), true)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0085  */
    /* JADX WARN: Code duplicated, block: B:35:0x0098  */
    /* JADX WARN: Code duplicated, block: B:36:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bc A[EDGE_INSN: B:59:0x00bc->B:48:0x00bc BREAK  A[LOOP:2: B:22:0x0073->B:47:0x00ba], SYNTHETIC] */
    private static final void readChallengeHeader(h hVar, List<Challenge> list) throws EOFException {
        String token;
        while (true) {
            String token2 = null;
            while (true) {
                if (token2 == null) {
                    skipCommasAndWhitespace(hVar);
                    token2 = readToken(hVar);
                    if (token2 == null) {
                        return;
                    }
                }
                boolean zSkipCommasAndWhitespace = skipCommasAndWhitespace(hVar);
                String token3 = readToken(hVar);
                if (token3 == null) {
                    if (hVar.T2()) {
                        list.add(new Challenge(token2, (Map<String, String>) v0.i()));
                        return;
                    }
                    return;
                }
                int iSkipAll = Util.skipAll(hVar, (byte) 61);
                boolean zSkipCommasAndWhitespace2 = skipCommasAndWhitespace(hVar);
                if (zSkipCommasAndWhitespace || !(zSkipCommasAndWhitespace2 || hVar.T2())) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int iSkipAll2 = iSkipAll + Util.skipAll(hVar, (byte) 61);
                    while (true) {
                        if (token3 != null) {
                            if (iSkipAll2 != 0) {
                                break;
                                break;
                            }
                            if (iSkipAll2 <= 1) {
                                return;
                            }
                            if (startsWith(hVar, (byte) 34)) {
                                token = readQuotedString(hVar);
                            } else {
                                token = readToken(hVar);
                            }
                            if (token != null) {
                                return;
                            }
                            if (skipCommasAndWhitespace(hVar)) {
                            }
                            token3 = null;
                        } else {
                            token3 = readToken(hVar);
                            if (!skipCommasAndWhitespace(hVar)) {
                                iSkipAll2 = Util.skipAll(hVar, (byte) 61);
                                if (iSkipAll2 != 0) {
                                    break;
                                }
                                if (iSkipAll2 <= 1 || skipCommasAndWhitespace(hVar)) {
                                    return;
                                }
                                if (startsWith(hVar, (byte) 34)) {
                                    token = readQuotedString(hVar);
                                } else {
                                    token = readToken(hVar);
                                }
                                if (token != null || ((String) linkedHashMap.put(token3, token)) != null) {
                                    return;
                                }
                                if (skipCommasAndWhitespace(hVar) && !hVar.T2()) {
                                    return;
                                } else {
                                    token3 = null;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    list.add(new Challenge(token2, linkedHashMap));
                    token2 = token3;
                } else {
                    Map mapSingletonMap = Collections.singletonMap(null, token3 + t.R("=", iSkipAll));
                    s.j(mapSingletonMap, "singletonMap<String, Str…ek + \"=\".repeat(eqCount))");
                    list.add(new Challenge(token2, (Map<String, String>) mapSingletonMap));
                }
            }
        }
    }

    private static final String readQuotedString(h hVar) throws EOFException {
        if (hVar.readByte() != 34) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        h hVar2 = new h();
        while (true) {
            long jD0 = hVar.d0(QUOTED_STRING_DELIMITERS);
            if (jD0 == -1) {
                return null;
            }
            if (hVar.H(jD0) == 34) {
                hVar2.write(hVar, jD0);
                hVar.readByte();
                return hVar2.t1();
            }
            if (hVar.getSize() == jD0 + 1) {
                return null;
            }
            hVar2.write(hVar, jD0);
            hVar.readByte();
            hVar2.write(hVar, 1L);
        }
    }

    private static final String readToken(h hVar) {
        long jD0 = hVar.d0(TOKEN_DELIMITERS);
        if (jD0 == -1) {
            jD0 = hVar.getSize();
        }
        if (jD0 != 0) {
            return hVar.M0(jD0);
        }
        return null;
    }

    public static final void receiveHeaders(CookieJar cookieJar, HttpUrl url, Headers headers) {
        s.k(cookieJar, "<this>");
        s.k(url, "url");
        s.k(headers, "headers");
        if (cookieJar == CookieJar.NO_COOKIES) {
            return;
        }
        List<Cookie> all = Cookie.INSTANCE.parseAll(url, headers);
        if (all.isEmpty()) {
            return;
        }
        cookieJar.saveFromResponse(url, all);
    }

    private static final boolean skipCommasAndWhitespace(h hVar) throws EOFException {
        boolean z11 = false;
        while (!hVar.T2()) {
            byte bH = hVar.H(0L);
            if (bH == 44) {
                hVar.readByte();
                z11 = true;
            } else {
                if (bH != 32 && bH != 9) {
                    break;
                }
                hVar.readByte();
            }
        }
        return z11;
    }

    private static final boolean startsWith(h hVar, byte b11) {
        return !hVar.T2() && hVar.H(0L) == b11;
    }
}
