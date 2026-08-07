package com.plaid.internal;

/* JADX INFO: renamed from: com.plaid.internal.j6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC4453j6 {

    /* JADX INFO: renamed from: com.plaid.internal.j6$a */
    public static final class a extends AbstractC4453j6 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f47777a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 637371670;
        }

        public final String toString() {
            return "NotReady";
        }
    }

    /* JADX INFO: renamed from: com.plaid.internal.j6$b */
    public static final class b extends AbstractC4453j6 {
        public b(String url) {
            p013kotlin.jvm.internal.s.k(url, "url");
        }
    }

    /* JADX INFO: renamed from: com.plaid.internal.j6$c */
    public static final class c extends AbstractC4453j6 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f47778a;

        public c(String url) {
            p013kotlin.jvm.internal.s.k(url, "url");
            this.f47778a = url;
        }

        public final String a() {
            return this.f47778a;
        }
    }

    /* JADX INFO: renamed from: com.plaid.internal.j6$d */
    public static final class d extends AbstractC4453j6 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f47779a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1655299293;
        }

        public final String toString() {
            return "Ready";
        }
    }
}
