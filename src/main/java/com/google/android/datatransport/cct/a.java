package com.google.android.datatransport.cct;

import androidx.annotation.NonNull;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import pq.g;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f39352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final String f39353d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f39354e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Set<nq.c> f39355f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f39356g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f39357h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final String f39358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f39359b;

    static {
        String strA = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f39352c = strA;
        String strA2 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f39353d = strA2;
        String strA3 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f39354e = strA3;
        f39355f = Collections.unmodifiableSet(new HashSet(Arrays.asList(nq.c.b("proto"), nq.c.b("json"))));
        f39356g = new a(strA, null);
        f39357h = new a(strA2, strA3);
    }

    public a(@NonNull String str, String str2) {
        this.f39358a = str;
        this.f39359b = str2;
    }

    @NonNull
    public static a c(@NonNull byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }

    @Override // pq.g
    public Set<nq.c> a() {
        return f39355f;
    }

    public byte[] b() {
        String str = this.f39359b;
        if (str == null && this.f39358a == null) {
            return null;
        }
        String str2 = this.f39358a;
        if (str == null) {
            str = "";
        }
        return String.format("%s%s%s%s", "1$", str2, "\\", str).getBytes(Charset.forName("UTF-8"));
    }

    public String d() {
        return this.f39359b;
    }

    @NonNull
    public String e() {
        return this.f39358a;
    }

    @Override // pq.f
    public byte[] getExtras() {
        return b();
    }

    @Override // pq.f
    @NonNull
    public String getName() {
        return "cct";
    }
}
