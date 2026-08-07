package com.fourthline.vision.internal;

import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
public interface K {

    public static final class a implements K {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Throwable f37794a;

        public a(Throwable th2) {
            this.f37794a = th2;
        }

        public static /* synthetic */ a copy$default(a aVar, Throwable th2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                th2 = aVar.f37794a;
            }
            return aVar.copy(th2);
        }

        public final Throwable component1() {
            return this.f37794a;
        }

        public final a copy(Throwable th2) {
            return new a(th2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p013kotlin.jvm.internal.s.f(this.f37794a, ((a) obj).f37794a);
        }

        public final Throwable getThrowable() {
            return this.f37794a;
        }

        public int hashCode() {
            Throwable th2 = this.f37794a;
            if (th2 == null) {
                return 0;
            }
            return th2.hashCode();
        }

        public String toString() {
            return "Error(throwable=" + this.f37794a + ")";
        }
    }

    public static final class b implements K {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f37795a;

        public b(Uri uri) {
            this.f37795a = uri;
        }

        public static /* synthetic */ b copy$default(b bVar, Uri uri, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                uri = bVar.f37795a;
            }
            return bVar.copy(uri);
        }

        public final Uri component1() {
            return this.f37795a;
        }

        public final b copy(Uri uri) {
            return new b(uri);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f37795a, ((b) obj).f37795a);
        }

        public final Uri getSavedUri() {
            return this.f37795a;
        }

        public int hashCode() {
            Uri uri = this.f37795a;
            if (uri == null) {
                return 0;
            }
            return uri.hashCode();
        }

        public String toString() {
            return "Success(savedUri=" + this.f37795a + ")";
        }
    }
}
