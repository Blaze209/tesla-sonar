package iy;

import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Charset f81952a = Charset.defaultCharset();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f81953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f81954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Charset f81955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final boolean f81956e;

    static {
        Charset charsetForName;
        Charset charsetForName2;
        Charset charsetForName3 = null;
        try {
            charsetForName = Charset.forName("SJIS");
        } catch (UnsupportedCharsetException unused) {
            charsetForName = null;
        }
        f81953b = charsetForName;
        try {
            charsetForName2 = Charset.forName("GB2312");
        } catch (UnsupportedCharsetException unused2) {
            charsetForName2 = null;
        }
        f81954c = charsetForName2;
        try {
            charsetForName3 = Charset.forName("EUC_JP");
        } catch (UnsupportedCharsetException unused3) {
        }
        f81955d = charsetForName3;
        Charset charset = f81953b;
        f81956e = (charset != null && charset.equals(f81952a)) || (charsetForName3 != null && charsetForName3.equals(f81952a));
    }
}
