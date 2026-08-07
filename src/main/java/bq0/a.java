package bq0;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final SortedMap<String, Charset> f17880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Charset f17881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final Charset f17882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final Charset f17883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final Charset f17884e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final Charset f17885f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final Charset f17886g;

    static {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        Charset charset = StandardCharsets.ISO_8859_1;
        treeMap.put(charset.name(), charset);
        Charset charset2 = StandardCharsets.US_ASCII;
        treeMap.put(charset2.name(), charset2);
        Charset charset3 = StandardCharsets.UTF_16;
        treeMap.put(charset3.name(), charset3);
        Charset charset4 = StandardCharsets.UTF_16BE;
        treeMap.put(charset4.name(), charset4);
        Charset charset5 = StandardCharsets.UTF_16LE;
        treeMap.put(charset5.name(), charset5);
        Charset charset6 = StandardCharsets.UTF_8;
        treeMap.put(charset6.name(), charset6);
        f17880a = Collections.unmodifiableSortedMap(treeMap);
        f17881b = charset;
        f17882c = charset2;
        f17883d = charset3;
        f17884e = charset4;
        f17885f = charset5;
        f17886g = charset6;
    }

    public static Charset a(Charset charset) {
        return charset == null ? Charset.defaultCharset() : charset;
    }
}
