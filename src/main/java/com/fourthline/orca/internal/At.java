package com.fourthline.orca.internal;

import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public interface At {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f25029a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f25030b;

        public a(String filename, String downloadUrl) {
            p013kotlin.jvm.internal.s.k(filename, "filename");
            p013kotlin.jvm.internal.s.k(downloadUrl, "downloadUrl");
            this.f25029a = filename;
            this.f25030b = downloadUrl;
        }

        public final String a() {
            return this.f25030b;
        }

        public final String b() {
            return this.f25029a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p013kotlin.jvm.internal.s.f(this.f25029a, aVar.f25029a) && p013kotlin.jvm.internal.s.f(this.f25030b, aVar.f25030b);
        }

        public int hashCode() {
            return (this.f25029a.hashCode() * 31) + this.f25030b.hashCode();
        }

        public String toString() {
            return "Input(filename=" + this.f25029a + ", downloadUrl=" + this.f25030b + ")";
        }
    }

    Object a(a aVar, Continuation continuation);
}
