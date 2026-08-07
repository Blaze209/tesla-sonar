package com.plaid.internal;

import android.content.res.Resources;

/* JADX INFO: loaded from: classes6.dex */
public final class V0 extends androidx.p003lifecycle.c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f46758a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f46759a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f46760b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f46761c;

        public a(String header, String content, String buttonText) {
            p013kotlin.jvm.internal.s.k(header, "header");
            p013kotlin.jvm.internal.s.k(content, "content");
            p013kotlin.jvm.internal.s.k(buttonText, "buttonText");
            this.f46759a = header;
            this.f46760b = content;
            this.f46761c = buttonText;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p013kotlin.jvm.internal.s.f(this.f46759a, aVar.f46759a) && p013kotlin.jvm.internal.s.f(this.f46760b, aVar.f46760b) && p013kotlin.jvm.internal.s.f(this.f46761c, aVar.f46761c);
        }

        public final int hashCode() {
            return this.f46761c.hashCode() + C4571x.a(this.f46760b, this.f46759a.hashCode() * 31, 31);
        }

        public final String toString() {
            return "ErrorTexts(header=" + this.f46759a + ", content=" + this.f46760b + ", buttonText=" + this.f46761c + ")";
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46762a;

        static {
            int[] iArr = new int[H3.values().length];
            try {
                iArr[H3.NETWORK_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[H3.SESSION_EXPIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[H3.INITIALIZATION_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[H3.HTTP_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[H3.UNKNOWN_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f46762a = iArr;
        }
    }

    public V0(Resources resources) {
        p013kotlin.jvm.internal.s.k(resources, "resources");
        this.f46758a = resources;
    }
}
