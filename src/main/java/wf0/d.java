package wf0;

import java.net.URL;
import java.util.HashMap;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f121795b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f121798e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f121794a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashMap f121796c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f121797d = null;

    public d(String str) {
        this.f121795b = str;
    }

    public final URL a() {
        try {
            return new URL(this.f121795b);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void b(String str) {
        if (str != null) {
            this.f121797d = str.getBytes();
            this.f121798e = str;
        }
    }

    public final String c() {
        return this.f121794a == 1 ? "POST" : "GET";
    }

    public final void d(String str) {
        this.f121795b = str;
    }

    public final String e() {
        return this.f121798e;
    }

    public final HashMap f() {
        return this.f121796c;
    }

    public d(String str, byte b11) {
        this.f121795b = str;
    }
}
